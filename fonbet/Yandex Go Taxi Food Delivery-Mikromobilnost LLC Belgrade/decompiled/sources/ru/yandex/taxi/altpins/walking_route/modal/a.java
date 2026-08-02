package ru.yandex.taxi.altpins.walking_route.modal;

import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.evu0;
import defpackage.g741;
import defpackage.i02;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.p741;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.x1j;
import defpackage.xby;
import defpackage.y641;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.altpins.order.p;

/* loaded from: classes5.dex */
public final class a extends ad5 {
    public final i02 A;
    public final po21 B;
    public final ah00 C;
    public final y641 D;
    public final p2y0 E;
    public final com.yandex.go.taxi.order.provider.a F;
    public pzt0 G;
    public final String x;
    public final g741 y;
    public final x1j z;

    public a(String str, g741 g741Var, x1j x1jVar, i02 i02Var, po21 po21Var, ah00 ah00Var, y641 y641Var, p2y0 p2y0Var, com.yandex.go.taxi.order.provider.a aVar) {
        super(p741.class);
        this.x = str;
        this.y = g741Var;
        this.z = x1jVar;
        this.A = i02Var;
        this.B = po21Var;
        this.C = ah00Var;
        this.D = y641Var;
        this.E = p2y0Var;
        this.F = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(a aVar, ContinuationImpl continuationImpl) {
        WalkingRoutePresenter$handleCloseAction$1 walkingRoutePresenter$handleCloseAction$1;
        int i;
        o2y0 o2y0Var;
        aVar.getClass();
        if (continuationImpl instanceof WalkingRoutePresenter$handleCloseAction$1) {
            walkingRoutePresenter$handleCloseAction$1 = (WalkingRoutePresenter$handleCloseAction$1) continuationImpl;
            int i2 = walkingRoutePresenter$handleCloseAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingRoutePresenter$handleCloseAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = walkingRoutePresenter$handleCloseAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingRoutePresenter$handleCloseAction$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str = aVar.x;
                    if (evu0.J(str)) {
                        str = null;
                    }
                    if (str == null) {
                        o2y0Var = null;
                        zy11 zy11Var = zy11.a;
                        if (o2y0Var == null) {
                            xby.l(jst.e, "ALTPIN_B:WALKING_ROUTE", null, null, "Try to cancel a nonexistent altpin order", 6);
                            return zy11Var;
                        }
                        ((p) aVar.D).c(o2y0Var, new WalkingRoutePresenter$handleCloseAction$2(aVar, null));
                        return zy11Var;
                    }
                    p2y0 p2y0Var = aVar.E;
                    walkingRoutePresenter$handleCloseAction$1.L$0 = null;
                    walkingRoutePresenter$handleCloseAction$1.label = 1;
                    obj = ((e0) p2y0Var).p(str, walkingRoutePresenter$handleCloseAction$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                zy11 zy11Var2 = zy11.a;
                if (o2y0Var == null) {
                }
            }
        }
        walkingRoutePresenter$handleCloseAction$1 = new WalkingRoutePresenter$handleCloseAction$1(aVar, continuationImpl);
        Object obj2 = walkingRoutePresenter$handleCloseAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingRoutePresenter$handleCloseAction$1.label;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        zy11 zy11Var22 = zy11.a;
        if (o2y0Var == null) {
        }
    }
}
