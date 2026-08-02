package ru.yandex.taxi.layers.presentation.walkroute.simple;

import defpackage.ffx;
import defpackage.g641;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.qur;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.z0s;
import defpackage.z541;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.common_models.net.map_object.t0;

/* loaded from: classes9.dex */
public final class b implements xsd0 {
    public final z541 a;
    public final a b;
    public final n0 c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public g641 d;
    public qur e;

    public b(z541 z541Var, a aVar) {
        this.a = z541Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        SimpleWalkRoutePointActionRouter$launch$1 simpleWalkRoutePointActionRouter$launch$1;
        int i;
        Throwable th;
        g641 g641Var;
        if (continuation instanceof SimpleWalkRoutePointActionRouter$launch$1) {
            simpleWalkRoutePointActionRouter$launch$1 = (SimpleWalkRoutePointActionRouter$launch$1) continuation;
            int i2 = simpleWalkRoutePointActionRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                simpleWalkRoutePointActionRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = simpleWalkRoutePointActionRouter$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = simpleWalkRoutePointActionRouter$launch$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g641 g641Var2 = (g641) z0s.f(this.a, this.b).s().get();
                    this.d = g641Var2;
                    try {
                        pm00 pm00Var = (pm00) wsd0Var;
                        g641Var2.Hg(pm00Var.a(), ((t0) pm00Var.getAction()).a.getA(), this.e);
                        n0 n0Var = this.c;
                        simpleWalkRoutePointActionRouter$launch$1.L$0 = null;
                        simpleWalkRoutePointActionRouter$launch$1.L$1 = g641Var2;
                        simpleWalkRoutePointActionRouter$launch$1.label = 1;
                        if (e.y(n0Var, simpleWalkRoutePointActionRouter$launch$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        g641Var = g641Var2;
                    } catch (Throwable th2) {
                        th = th2;
                        g641Var = g641Var2;
                        g641Var.detach();
                        this.d = null;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g641Var = (g641) simpleWalkRoutePointActionRouter$launch$1.L$1;
                    try {
                        kotlin.b.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        g641Var.detach();
                        this.d = null;
                        throw th;
                    }
                }
                g641Var.detach();
                this.d = null;
                return zy11.a;
            }
        }
        simpleWalkRoutePointActionRouter$launch$1 = new SimpleWalkRoutePointActionRouter$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = simpleWalkRoutePointActionRouter$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = simpleWalkRoutePointActionRouter$launch$1.label;
        if (i != 0) {
        }
        g641Var.detach();
        this.d = null;
        return zy11.a;
    }
}
