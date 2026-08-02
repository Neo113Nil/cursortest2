package ru.yandex.taxi.layers.domain;

import defpackage.nm00;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z2e0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class q implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.g a;
    public final /* synthetic */ z2e0 b;
    public final /* synthetic */ nm00 c;
    public final /* synthetic */ nm00 w;

    public q(kotlinx.coroutines.flow.g gVar, z2e0 z2e0Var, nm00 nm00Var, nm00 nm00Var2) {
        this.a = gVar;
        this.b = z2e0Var;
        this.c = nm00Var;
        this.w = nm00Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PolygonActionsInteractor$handleOption$$inlined$map$1$1 polygonActionsInteractor$handleOption$$inlined$map$1$1;
        int i;
        if (continuation instanceof PolygonActionsInteractor$handleOption$$inlined$map$1$1) {
            polygonActionsInteractor$handleOption$$inlined$map$1$1 = (PolygonActionsInteractor$handleOption$$inlined$map$1$1) continuation;
            int i2 = polygonActionsInteractor$handleOption$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                polygonActionsInteractor$handleOption$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = polygonActionsInteractor$handleOption$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = polygonActionsInteractor$handleOption$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    p pVar = new p(vprVar, this.b, this.c, this.w);
                    polygonActionsInteractor$handleOption$$inlined$map$1$1.L$0 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$1.L$1 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$1.L$2 = null;
                    polygonActionsInteractor$handleOption$$inlined$map$1$1.label = 1;
                    if (this.a.collect(pVar, polygonActionsInteractor$handleOption$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        polygonActionsInteractor$handleOption$$inlined$map$1$1 = new PolygonActionsInteractor$handleOption$$inlined$map$1$1(this, continuation);
        Object obj2 = polygonActionsInteractor$handleOption$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = polygonActionsInteractor$handleOption$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
