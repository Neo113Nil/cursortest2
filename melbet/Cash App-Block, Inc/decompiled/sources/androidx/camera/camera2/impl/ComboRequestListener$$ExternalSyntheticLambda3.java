package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComboRequestListener$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Request.Listener f$0;
    public final /* synthetic */ RequestMetadata f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ AndroidFrameInfo f$3;

    public /* synthetic */ ComboRequestListener$$ExternalSyntheticLambda3(Request.Listener listener, RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = listener;
        this.f$1 = requestMetadata;
        this.f$2 = j;
        this.f$3 = androidFrameInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AndroidFrameInfo androidFrameInfo = this.f$3;
        long j = this.f$2;
        RequestMetadata requestMetadata = this.f$1;
        Request.Listener listener = this.f$0;
        switch (i) {
            case 0:
                listener.mo18onTotalCaptureResultCcXjc1I(requestMetadata, j, androidFrameInfo);
                break;
            default:
                listener.mo16onCompleteCcXjc1I(requestMetadata, j, androidFrameInfo);
                break;
        }
    }
}
