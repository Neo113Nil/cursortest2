package defpackage;

import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmErrorEvent;

/* loaded from: classes8.dex */
public final class sa20 implements uhl0 {
    public final IReporterYandex a;

    public sa20(IReporterYandex iReporterYandex) {
        this.a = iReporterYandex;
    }

    @Override // defpackage.uhl0
    public final void a(shl0 shl0Var) {
        String str = shl0Var.a;
        if (str == null) {
            str = "unknown";
        }
        RtmErrorEvent.Builder withAdditional = RtmErrorEvent.newBuilder(str).withVersion(shl0Var.b).withService(shl0Var.c).withSource("unknown").withRequestId(shl0Var.d).withAdditional(shl0Var.e);
        Throwable th = shl0Var.f;
        this.a.reportRtmError(withAdditional.withStacktrace(th != null ? ljo.b(th) : null).withErrorLevel(null).withSilent(null).withUrl(shl0Var.g).build());
    }
}
