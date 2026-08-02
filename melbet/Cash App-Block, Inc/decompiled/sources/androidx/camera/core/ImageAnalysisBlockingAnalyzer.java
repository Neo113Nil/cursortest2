package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewView;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;

/* loaded from: classes3.dex */
public final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void clearCache() {
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public final void onValidImageAvailable(ImageProxy imageProxy) {
        Futures.addCallback(analyzeImage(imageProxy), new PreviewView.AnonymousClass1(imageProxy, false), zzabp.directExecutor());
    }
}
