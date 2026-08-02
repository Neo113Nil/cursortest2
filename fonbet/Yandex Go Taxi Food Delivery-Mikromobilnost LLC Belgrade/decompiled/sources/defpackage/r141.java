package defpackage;

import android.content.Context;
import com.yandex.go.walking.navigation.impl.analytics.WalkingNavigationAnalytics$WalkingNavigationGeneration;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes14.dex */
public final class r141 extends pgd {
    public final Context F;
    public final w030 G;
    public final a201 H;
    public final b741 I;
    public final w041 J;
    public final mu5 K;

    public r141(Context context, w030 w030Var, a201 a201Var, b741 b741Var, w041 w041Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = a201Var;
        this.I = b741Var;
        this.J = w041Var;
        this.K = new mu5(new qq31(3, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        w041 w041Var = this.J;
        String str = w041Var.a;
        WalkingNavigationAnalytics$WalkingNavigationGeneration walkingNavigationAnalytics$WalkingNavigationGeneration = null;
        if (w041Var.b != null) {
            Iterator<E> it = WalkingNavigationAnalytics$WalkingNavigationGeneration.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (jl40.l(((WalkingNavigationAnalytics$WalkingNavigationGeneration) next).getEventValue(), w041Var.b)) {
                    walkingNavigationAnalytics$WalkingNavigationGeneration = next;
                    break;
                }
            }
            walkingNavigationAnalytics$WalkingNavigationGeneration = walkingNavigationAnalytics$WalkingNavigationGeneration;
        }
        b741 b741Var = this.I;
        b741Var.getClass();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("hub_session_id", str);
        }
        if (walkingNavigationAnalytics$WalkingNavigationGeneration != null) {
            hashMap.put("generation", walkingNavigationAnalytics$WalkingNavigationGeneration.getEventValue());
        }
        b741Var.a.a("WalkingNavigation.ExitOptions.Shown", hashMap, 1, new HashMap());
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.K;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
