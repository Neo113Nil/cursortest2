package defpackage;

import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.summary.shared.analytics.TrapModeCloseReason;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class wc11 {
    public final xcv0 a;
    public final arv0 b;
    public boolean c;

    public wc11(xcv0 xcv0Var, arv0 arv0Var) {
        this.a = xcv0Var;
        this.b = arv0Var;
    }

    public final void a(TrapModeCloseReason trapModeCloseReason) {
        yqv0 a = ((a7t0) this.b).a();
        if (a.a != SummaryUiState$Type.TRAP) {
            return;
        }
        this.c = false;
        String analyticsName = trapModeCloseReason.getAnalyticsName();
        String str = a.b;
        xcv0 xcv0Var = this.a;
        HashMap q = tse0.q(xcv0Var);
        if (analyticsName != null) {
            q.put("close_reason", analyticsName);
        }
        if (str != null) {
            q.put("summary_state", str);
        }
        xcv0Var.a.a("Summary.VerticalSummaryClosed", q, 1, new HashMap());
    }
}
