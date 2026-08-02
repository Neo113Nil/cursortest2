package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import java.lang.ref.WeakReference;
import net.oneformapp.ProfileStore_;

/* loaded from: classes3.dex */
public final /* synthetic */ class SafeCloseImageReaderProxy$$ExternalSyntheticLambda1 implements ForwardingImageProxy.OnImageCloseListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SafeCloseImageReaderProxy$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public final void onImageClose(ForwardingImageProxy forwardingImageProxy) {
        ForwardingImageProxy.OnImageCloseListener onImageCloseListener;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ProfileStore_ profileStore_ = (ProfileStore_) obj;
                synchronized (profileStore_.passcode) {
                    try {
                        int i2 = profileStore_.runningVersion - 1;
                        profileStore_.runningVersion = i2;
                        if (profileStore_.hasLoaded && i2 == 0) {
                            profileStore_.close();
                        }
                        onImageCloseListener = (ForwardingImageProxy.OnImageCloseListener) profileStore_.schema;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (onImageCloseListener != null) {
                    onImageCloseListener.onImageClose(forwardingImageProxy);
                    return;
                }
                return;
            default:
                ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = (ImageAnalysisNonBlockingAnalyzer) ((WeakReference) ((SingleCloseImageProxy) obj).mClosed).get();
                if (imageAnalysisNonBlockingAnalyzer != null) {
                    imageAnalysisNonBlockingAnalyzer.mBackgroundExecutor.execute(new Preview$$ExternalSyntheticLambda0(imageAnalysisNonBlockingAnalyzer, 9));
                    return;
                }
                return;
        }
    }
}
