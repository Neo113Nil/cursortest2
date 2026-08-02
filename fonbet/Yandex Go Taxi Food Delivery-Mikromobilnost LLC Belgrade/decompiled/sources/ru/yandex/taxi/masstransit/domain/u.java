package ru.yandex.taxi.masstransit.domain;

import defpackage.fc30;
import defpackage.g92;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class u implements tpr {
    public final /* synthetic */ g92 a;
    public final /* synthetic */ v b;
    public final /* synthetic */ fc30 c;

    public u(g92 g92Var, v vVar, fc30 fc30Var) {
        this.a = g92Var;
        this.b = vVar;
        this.c = fc30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtOverlayStateInteractor$mtRoute$$inlined$map$1$1 mtOverlayStateInteractor$mtRoute$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtOverlayStateInteractor$mtRoute$$inlined$map$1$1) {
            mtOverlayStateInteractor$mtRoute$$inlined$map$1$1 = (MtOverlayStateInteractor$mtRoute$$inlined$map$1$1) continuation;
            int i2 = mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b, this.c);
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.L$0 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.L$1 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.L$2 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.label = 1;
                    if (this.a.collect(tVar, mtOverlayStateInteractor$mtRoute$$inlined$map$1$1) == coroutineSingletons) {
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
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$1 = new MtOverlayStateInteractor$mtRoute$$inlined$map$1$1(this, continuation);
        Object obj2 = mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayStateInteractor$mtRoute$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
