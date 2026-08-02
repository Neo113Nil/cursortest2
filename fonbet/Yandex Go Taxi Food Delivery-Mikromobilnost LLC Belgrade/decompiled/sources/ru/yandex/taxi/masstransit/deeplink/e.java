package ru.yandex.taxi.masstransit.deeplink;

import defpackage.e110;
import defpackage.f110;
import defpackage.h010;
import defpackage.igu0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pj40;
import defpackage.rib1;
import defpackage.v770;
import defpackage.vm30;
import defpackage.x111;
import defpackage.zm30;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class e extends f110 {
    public final h010 b;
    public final x111 c;
    public final f d;

    public e(h010 h010Var, x111 x111Var, f fVar) {
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
        return d((e110) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(e110 e110Var, ContinuationImpl continuationImpl) {
        MassTransitStopDeeplinkHandler$handleDeeplink$1 massTransitStopDeeplinkHandler$handleDeeplink$1;
        int i;
        pj40 pj40Var;
        igu0 igu0Var;
        if (continuationImpl instanceof MassTransitStopDeeplinkHandler$handleDeeplink$1) {
            massTransitStopDeeplinkHandler$handleDeeplink$1 = (MassTransitStopDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = massTransitStopDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                massTransitStopDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                MassTransitStopDeeplinkHandler$handleDeeplink$1 massTransitStopDeeplinkHandler$handleDeeplink$12 = massTransitStopDeeplinkHandler$handleDeeplink$1;
                Object obj = massTransitStopDeeplinkHandler$handleDeeplink$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = massTransitStopDeeplinkHandler$handleDeeplink$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.a();
                    pj40 e = rib1.e(e110Var.f(), e110Var.e());
                    String d = e110Var.d();
                    Double a = e110Var.a();
                    Double b = e110Var.b();
                    String c = e110Var.c();
                    massTransitStopDeeplinkHandler$handleDeeplink$12.L$0 = null;
                    massTransitStopDeeplinkHandler$handleDeeplink$12.L$1 = null;
                    massTransitStopDeeplinkHandler$handleDeeplink$12.L$2 = null;
                    massTransitStopDeeplinkHandler$handleDeeplink$12.L$3 = null;
                    massTransitStopDeeplinkHandler$handleDeeplink$12.L$4 = e;
                    massTransitStopDeeplinkHandler$handleDeeplink$12.label = 1;
                    Object a2 = this.d.a(d, a, b, c, massTransitStopDeeplinkHandler$handleDeeplink$12);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a2;
                    pj40Var = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pj40Var = (pj40) massTransitStopDeeplinkHandler$handleDeeplink$12.L$4;
                    kotlin.b.b(obj);
                }
                igu0Var = (igu0) obj;
                zy11 zy11Var = zy11.a;
                h010 h010Var = this.b;
                if (igu0Var != null) {
                    h010Var.a(new vm30(pj40Var), null);
                    return zy11Var;
                }
                h010Var.a(new zm30(igu0Var, pj40Var), null);
                return zy11Var;
            }
        }
        massTransitStopDeeplinkHandler$handleDeeplink$1 = new MassTransitStopDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        MassTransitStopDeeplinkHandler$handleDeeplink$1 massTransitStopDeeplinkHandler$handleDeeplink$122 = massTransitStopDeeplinkHandler$handleDeeplink$1;
        Object obj2 = massTransitStopDeeplinkHandler$handleDeeplink$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = massTransitStopDeeplinkHandler$handleDeeplink$122.label;
        if (i != 0) {
        }
        igu0Var = (igu0) obj2;
        zy11 zy11Var2 = zy11.a;
        h010 h010Var2 = this.b;
        if (igu0Var != null) {
        }
    }
}
