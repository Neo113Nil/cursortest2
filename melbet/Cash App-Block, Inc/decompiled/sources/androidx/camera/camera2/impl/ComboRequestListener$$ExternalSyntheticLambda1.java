package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComboRequestListener$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Request.Listener f$0;
    public final /* synthetic */ RequestMetadata f$1;

    public /* synthetic */ ComboRequestListener$$ExternalSyntheticLambda1(Request.Listener listener, RequestMetadata requestMetadata, int i) {
        this.$r8$classId = i;
        this.f$0 = listener;
        this.f$1 = requestMetadata;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onRequestSequenceAborted(this.f$1);
                break;
            case 1:
                this.f$0.onRequestSequenceCreated(this.f$1);
                break;
            default:
                this.f$0.onRequestSequenceSubmitted(this.f$1);
                break;
        }
    }
}
