package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComboRequestListener$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Request.Listener f$0;
    public final /* synthetic */ RequestMetadata f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ UnsafeWrapper f$3;

    public /* synthetic */ ComboRequestListener$$ExternalSyntheticLambda4(Request.Listener listener, RequestMetadata requestMetadata, long j, UnsafeWrapper unsafeWrapper, int i) {
        this.$r8$classId = i;
        this.f$0 = listener;
        this.f$1 = requestMetadata;
        this.f$2 = j;
        this.f$3 = unsafeWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        UnsafeWrapper unsafeWrapper = this.f$3;
        long j = this.f$2;
        RequestMetadata requestMetadata = this.f$1;
        Request.Listener listener = this.f$0;
        switch (i) {
            case 0:
                listener.mo17onFailedCcXjc1I(requestMetadata, j, (RequestFailure) unsafeWrapper);
                break;
            default:
                listener.mo27onPartialCaptureResultCcXjc1I(requestMetadata, j, (AndroidFrameMetadata) unsafeWrapper);
                break;
        }
    }
}
