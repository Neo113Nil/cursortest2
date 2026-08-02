package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class x8m implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8m b;

    public /* synthetic */ x8m(o8m o8mVar, int i) {
        this.a = i;
        this.b = o8mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                o18 o18Var = (o18) obj;
                o18Var.getClass();
                o18Var.c = hag.I(t8m.class);
                rp7 rp7Var = o18Var.b;
                rp7Var.getClass();
                o8m o8mVar = this.b;
                rp7Var.D(new x8m(o8mVar, 1));
                o18Var.c = hag.I(k8m.class);
                rp7Var.getClass();
                rp7Var.D(new x8m(o8mVar, 2));
                o18Var.c = hag.I(fik.class);
                rp7Var.getClass();
                rp7Var.D(new x8m(o8mVar, 3));
                return Unit.a;
            case 1:
                ((l13) obj).getClass();
                return (t8m) this.b.a.a(hag.I(t8m.class));
            case 2:
                ((l13) obj).getClass();
                l13 l13Var = this.b.a;
                return (k8m) l13Var.a.D(hag.I(k8m.class), l13Var, l13Var.b);
            default:
                l13 l13Var2 = (l13) obj;
                l13Var2.getClass();
                jyr b = l13Var2.b(hag.I(t8m.class), true);
                jyr b2 = l13Var2.b(hag.I(k8m.class), true);
                o8m o8mVar2 = this.b;
                int i = 0;
                return new fik(b, b2, new ayl(0, o8mVar2, o8m.class, "createAppThemeConfig", "createAppThemeConfig()Lcom/yandex/music/design/AppThemeConfig;", 0, 10), new bml(1, o8mVar2, o8m.class, "createScreenActions", "createScreenActions(Landroid/app/Activity;)Lcom/yandex/music/shared/plus/features/paywall/ui/music/deps/PlusPaywallScreenActions;", i, 6), new ayl(0, o8mVar2, o8m.class, "isTariffPaywallSkippable", "isTariffPaywallSkippable()Z", i, 11));
        }
    }
}
