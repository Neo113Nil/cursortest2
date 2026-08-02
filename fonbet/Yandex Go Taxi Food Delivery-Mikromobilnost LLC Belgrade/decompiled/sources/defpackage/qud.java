package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$ModalCloseReason;
import com.yandex.go.summary.analytics.SummaryAnalytics$ModalType;

/* loaded from: classes13.dex */
public final class qud {
    public final wud a;
    public final /* synthetic */ rud b;

    public qud(rud rudVar, wud wudVar) {
        this.b = rudVar;
        this.a = wudVar;
    }

    public final void a(SummaryAnalytics$ModalCloseReason summaryAnalytics$ModalCloseReason) {
        rud rudVar = this.b;
        rudVar.J.h(SummaryAnalytics$ModalType.Default, this.a.b.c, summaryAnalytics$ModalCloseReason);
        rudVar.r(new qu(9));
    }
}
