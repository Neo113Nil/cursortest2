package ru.yandex.taxi.masstransit.domain;

import defpackage.fc30;
import defpackage.ny61;
import defpackage.su30;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class t implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;
    public final /* synthetic */ fc30 c;

    public t(vpr vprVar, v vVar, fc30 fc30Var) {
        this.a = vprVar;
        this.b = vVar;
        this.c = fc30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1 mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof MtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1) {
            mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1 = (MtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1) continuation;
            int i2 = mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ru.yandex.taxi.masstransit.mapper.e eVar = this.b.d;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$0 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$1 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$2 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$4 = vprVar2;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$5 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$6 = null;
                    mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label = 1;
                    obj2 = eVar.h((su30) obj, this.c, mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1);
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
                vprVar = (vpr) mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$0 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$1 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$2 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$3 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$4 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$5 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$6 = null;
                mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label = 2;
            }
        }
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1 = new MtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$0 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$1 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$2 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$3 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$4 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$5 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.L$6 = null;
        mtOverlayStateInteractor$mtRoute$$inlined$map$1$2$1.label = 2;
    }
}
