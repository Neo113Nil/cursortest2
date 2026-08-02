package androidx.camera.core;

import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    public final Executor mBackgroundExecutor;
    public ImageProxy mCachedImage;
    public final Object mLock = new Object();
    public SingleCloseImageProxy mPostedImage;

    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.mBackgroundExecutor = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void clearCache() {
        synchronized (this.mLock) {
            try {
                ImageProxy imageProxy = this.mCachedImage;
                if (imageProxy != null) {
                    imageProxy.close();
                    this.mCachedImage = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void onValidImageAvailable(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            try {
                if (!this.mIsAttached) {
                    imageProxy.close();
                    return;
                }
                if (this.mPostedImage == null) {
                    SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(imageProxy, this);
                    this.mPostedImage = singleCloseImageProxy;
                    Futures.addCallback(analyzeImage(singleCloseImageProxy), new Toolbar.AnonymousClass1(singleCloseImageProxy), zzabp.directExecutor());
                } else {
                    if (imageProxy.getImageInfo().getTimestamp() <= this.mPostedImage.mImage.getImageInfo().getTimestamp()) {
                        imageProxy.close();
                    } else {
                        ImageProxy imageProxy2 = this.mCachedImage;
                        if (imageProxy2 != null) {
                            imageProxy2.close();
                        }
                        this.mCachedImage = imageProxy;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
