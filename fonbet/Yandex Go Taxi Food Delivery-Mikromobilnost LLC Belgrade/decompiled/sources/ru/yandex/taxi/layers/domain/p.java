package ru.yandex.taxi.layers.domain;

import defpackage.nm00;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.pvn;
import defpackage.rol0;
import defpackage.vpr;
import defpackage.z2e0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z2e0 b;
    public final /* synthetic */ nm00 c;
    public final /* synthetic */ nm00 w;

    public p(vpr vprVar, z2e0 z2e0Var, nm00 nm00Var, nm00 nm00Var2) {
        this.a = vprVar;
        this.b = z2e0Var;
        this.c = nm00Var;
        this.w = nm00Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        if (r0.emit(r1, r2) != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PolygonActionsInteractor$handleOption$$inlined$map$1$2$1 polygonActionsInteractor$handleOption$$inlined$map$1$2$1;
        int i;
        Object rol0Var;
        vpr vprVar;
        if (continuation instanceof PolygonActionsInteractor$handleOption$$inlined$map$1$2$1) {
            polygonActionsInteractor$handleOption$$inlined$map$1$2$1 = (PolygonActionsInteractor$handleOption$$inlined$map$1$2$1) continuation;
            int i2 = polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = polygonActionsInteractor$handleOption$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.common_models.net.map_object.z zVar = (ru.yandex.taxi.common_models.net.map_object.z) obj;
                    nm00 nm00Var = this.w;
                    String a = nm00Var.d.a();
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$0 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$1 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$2 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$4 = vprVar2;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$5 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$6 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label = 1;
                    z2e0 z2e0Var = this.b;
                    z2e0Var.getClass();
                    if (zVar == null) {
                        rol0Var = pvn.a;
                    } else {
                        rol0Var = new rol0(new PolygonActionsInteractor$handleAction$2(zVar, z2e0Var, this.c, nm00Var, new pm00(nm00Var.b, nm00Var.a, a, zVar, nm00Var.e, nm00Var.f, nm00Var.g, nm00Var.h, 64), null));
                    }
                    obj2 = rol0Var;
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$0 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$1 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$2 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$3 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$4 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$5 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$6 = null;
                polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label = 2;
            }
        }
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1 = new PolygonActionsInteractor$handleOption$$inlined$map$1$2$1(this, continuation);
        Object obj22 = polygonActionsInteractor$handleOption$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$0 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$1 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$2 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$3 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$4 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$5 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.L$6 = null;
        polygonActionsInteractor$handleOption$$inlined$map$1$2$1.label = 2;
    }
}
