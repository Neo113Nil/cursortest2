package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmClientEvent;

/* loaded from: classes15.dex */
public final class ta20 implements zhl0 {
    public final IReporterYandex a;

    public ta20(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
    }

    @Override // defpackage.zhl0
    public final void a(vhl0 vhl0Var) {
        String str = vhl0Var.a;
        if (str == null) {
            str = "unknown";
        }
        this.a.reportRtmEvent(RtmClientEvent.newBuilder(str, (String) null).withVersion(vhl0Var.b).withService(vhl0Var.c).withSource("unknown").withRequestId(vhl0Var.d).withAdditional(vhl0Var.e).withLoggedIn(null).build());
    }
}
