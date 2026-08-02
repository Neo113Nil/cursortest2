package defpackage;

import com.google.common.collect.ImmutableMap;
import com.yandex.go.navigator.driving.speaker.d;
import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.summary.interactor.core.c;
import com.yandex.go.taxi.main.shortcuts.interactors.b;
import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;
import com.ybsdk.feature.stories.internal.screens.verticalstories.VerticalStoriesFragment;
import ru.yandex.taxi.e;

/* loaded from: classes12.dex */
public final class z0s0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ z0s0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static z0s0 a(eqh eqhVar) {
        return new z0s0(eqhVar, 24);
    }

    public static z0s0 b(xvf0 xvf0Var) {
        return new z0s0(xvf0Var, 11);
    }

    public static z0s0 c(xvf0 xvf0Var) {
        return new z0s0(xvf0Var, 12);
    }

    public static z0s0 d(xvf0 xvf0Var) {
        return new z0s0(xvf0Var, 22);
    }

    public static tc9 e(tw51 tw51Var) {
        int i = 9;
        hag hagVar = new hag(tw51Var, i);
        int i2 = 0;
        hag hagVar2 = new hag(tw51Var, i2);
        qmu0 qmu0Var = new qmu0(hagVar2, i2);
        int i3 = 29;
        int i4 = 1;
        gaq0 gaq0Var = new gaq0(new l9t0(i5m.b(new gaq0(new hag(tw51Var, 5), i3)), (xvf0) new hag(tw51Var, 2), (xvf0) new hag(tw51Var, 4), (xvf0) new hag(tw51Var, i4), 10, false), 28);
        hag hagVar3 = new hag(tw51Var, 6);
        hag hagVar4 = new hag(tw51Var, 3);
        hag hagVar5 = new hag(tw51Var, 8);
        n3w a = n3w.a(new unu0(new vmn0(qmu0Var, gaq0Var, hagVar2, hagVar3, hagVar4, hagVar5)));
        hag hagVar6 = new hag(tw51Var, 7);
        o9g o9gVar = new o9g(tw51Var, i3);
        return new tc9(new hnu0(), ImmutableMap.j(StoriesFragment.class, new l9t0((xvf0) hagVar, (xvf0) a, (xvf0) hagVar6, (xvf0) o9gVar, 9, false), VerticalStoriesFragment.class, new sk21(hagVar, n3w.a(new wg31(new vmn0(new qmu0(hagVar2, i4), gaq0Var, hagVar2, hagVar3, hagVar5, new tw11(hagVar4, 12)))), o9gVar, i)));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 4;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) ((t9g) xvf0Var.get()).t0.get();
                q5z.i(bVar);
                return bVar;
            case 1:
                return new k5s0((pho) xvf0Var.get());
            case 2:
                return new q5s0((pho) xvf0Var.get());
            case 3:
                return new pko((lg5) xvf0Var.get(), i2);
            case 4:
                return new gst((a) xvf0Var.get(), 1);
            case 5:
                return new l7s0((z370) xvf0Var.get());
            case 6:
                return new c8s0((rqo) xvf0Var.get());
            case 7:
                return new c((ldv0) xvf0Var.get());
            case 8:
                return new p9s0((y50) xvf0Var.get());
            case 9:
                return new com.ybsdk.screens.common.c((k03) xvf0Var.get());
            case 10:
                return new com.yandex.go.navigator.settings.debug_panel.domain.b((el00) xvf0Var.get());
            case 11:
                return new g9t0((rqo) xvf0Var.get());
            case 12:
                return new h9t0((dne0) xvf0Var.get());
            case 13:
                return new vwm((wiq0) xvf0Var.get());
            case 14:
                return new jgt0((e) xvf0Var.get());
            case 15:
                return new rgt0((tj60) xvf0Var.get());
            case 16:
                return new ynt0((d) xvf0Var.get());
            case 17:
                return new lot0((dne0) xvf0Var.get());
            case 18:
                return new q5p((lg5) xvf0Var.get(), i2);
            case 19:
                return new l8u0((c2x0) xvf0Var.get());
            case 20:
                return new cdu0((b00) xvf0Var.get());
            case 21:
                return new co40((pho) xvf0Var.get());
            case 22:
                gku0 S0 = ((lku0) xvf0Var.get()).a.S0();
                q5z.i(S0);
                return S0;
            case 23:
                return e((tw51) xvf0Var.get());
            case 24:
                return new o7r0((pho) xvf0Var.get());
            case 25:
                return new zav0((rqo) xvf0Var.get());
            case 26:
                return new cbv0((pho) xvf0Var.get());
            case 27:
                return new gev0((ru.yandex.taxi.summary.solid.preview_card.data.a) xvf0Var.get());
            case 28:
                return new iev0((xcv0) xvf0Var.get());
            default:
                return new uhv0((a3v) xvf0Var.get());
        }
    }
}
