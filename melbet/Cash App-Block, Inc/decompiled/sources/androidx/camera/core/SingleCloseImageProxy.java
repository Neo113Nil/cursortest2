package androidx.camera.core;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class SingleCloseImageProxy extends ForwardingImageProxy {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object mClosed;

    public SingleCloseImageProxy(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
        super(imageProxy);
        this.mClosed = new WeakReference(imageAnalysisNonBlockingAnalyzer);
        addOnImageCloseListener(new SafeCloseImageReaderProxy$$ExternalSyntheticLambda1(this, 1));
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        switch (this.$r8$classId) {
            case 0:
                if (!((AtomicBoolean) this.mClosed).getAndSet(true)) {
                    super.close();
                    break;
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.mClosed = new AtomicBoolean(false);
    }
}
