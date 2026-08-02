package defpackage;

import com.yandex.go.navigator.analitycs.RouteCompletionType;
import com.yandex.go.navigator.driving.GuidanceCompletionReason;
import com.yandex.go.navigator.navigation.e;

/* loaded from: classes12.dex */
public final class xe50 implements sy60 {
    public final /* synthetic */ e a;

    public xe50(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    public final void n1(GuidanceCompletionReason guidanceCompletionReason) {
        e eVar = this.a;
        yvf0 yvf0Var = eVar.H;
        int i = we50.a[guidanceCompletionReason.ordinal()];
        if (i == 1) {
            eVar.A((m950) yvf0Var.get(), RouteCompletionType.ORGANIC, new ze50(eVar));
        } else if (i == 2) {
            eVar.A((m950) yvf0Var.get(), RouteCompletionType.FORCED, new ze50(eVar));
        } else if (i == 3) {
            e.R(eVar);
        } else {
            w511.b();
        }
    }
}
