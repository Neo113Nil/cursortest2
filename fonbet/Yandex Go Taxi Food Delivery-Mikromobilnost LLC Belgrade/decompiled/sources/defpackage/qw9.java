package defpackage;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenButtonV5;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersMainScreenCloseReason;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class qw9 {
    public final em9 a;
    public final s2a b;
    public ChargersAnalytics$ChargersMainScreenCloseReason c;

    public qw9(em9 em9Var, s2a s2aVar) {
        this.a = em9Var;
        this.b = s2aVar;
    }

    public final void a(ChargersAnalytics$ChargersMainScreenButtonV5 chargersAnalytics$ChargersMainScreenButtonV5) {
        em9 em9Var = this.a;
        HashMap w = b64.w(em9Var);
        w.put("button", chargersAnalytics$ChargersMainScreenButtonV5.getEventValue());
        em9Var.a.a("Chargers.MainScreen.Tapped", w, 5, new HashMap());
    }
}
