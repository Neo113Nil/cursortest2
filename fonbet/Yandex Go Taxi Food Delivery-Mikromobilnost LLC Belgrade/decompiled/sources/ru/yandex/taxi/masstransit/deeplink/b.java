package ru.yandex.taxi.masstransit.deeplink;

import defpackage.h010;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pj40;
import defpackage.rib1;
import defpackage.v010;
import defpackage.v770;
import defpackage.w010;
import defpackage.x111;
import defpackage.ym30;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class b extends w010 {
    public final h010 b;
    public final x111 c;
    public final f d;

    public b(h010 h010Var, x111 x111Var, f fVar) {
        this.b = h010Var;
        this.c = x111Var;
        this.d = fVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d((v010) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(v010 v010Var, ContinuationImpl continuationImpl) {
        MassTransitRouteDeeplinkHandler$handleDeeplink$1 massTransitRouteDeeplinkHandler$handleDeeplink$1;
        int i;
        pj40 pj40Var;
        if (continuationImpl instanceof MassTransitRouteDeeplinkHandler$handleDeeplink$1) {
            massTransitRouteDeeplinkHandler$handleDeeplink$1 = (MassTransitRouteDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = massTransitRouteDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitRouteDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = massTransitRouteDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitRouteDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.a();
                    pj40 e = rib1.e(v010Var.e(), v010Var.d());
                    String b = v010Var.b();
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.L$0 = null;
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.L$1 = v010Var;
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.L$4 = e;
                    massTransitRouteDeeplinkHandler$handleDeeplink$1.label = 1;
                    Object b2 = this.d.b(b, massTransitRouteDeeplinkHandler$handleDeeplink$1);
                    if (b2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    pj40Var = e;
                    obj = b2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pj40 pj40Var2 = (pj40) massTransitRouteDeeplinkHandler$handleDeeplink$1.L$4;
                    v010 v010Var2 = (v010) massTransitRouteDeeplinkHandler$handleDeeplink$1.L$1;
                    kotlin.b.b(obj);
                    pj40Var = pj40Var2;
                    v010Var = v010Var2;
                }
                this.b.a(new ym30(v010Var.b(), v010Var.a(), v010Var.c(), (zzs) obj, pj40Var), null);
                return zy11.a;
            }
        }
        massTransitRouteDeeplinkHandler$handleDeeplink$1 = new MassTransitRouteDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        Object obj2 = massTransitRouteDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitRouteDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        this.b.a(new ym30(v010Var.b(), v010Var.a(), v010Var.c(), (zzs) obj2, pj40Var), null);
        return zy11.a;
    }
}
