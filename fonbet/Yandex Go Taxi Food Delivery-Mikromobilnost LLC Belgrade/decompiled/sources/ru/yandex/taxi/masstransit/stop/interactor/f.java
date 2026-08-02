package ru.yandex.taxi.masstransit.stop.interactor;

import defpackage.i440;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z340;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ g b;
    public final /* synthetic */ z340 c;
    public final /* synthetic */ i440 w;

    public f(r0 r0Var, g gVar, z340 z340Var, i440 i440Var) {
        this.a = r0Var;
        this.b = gVar;
        this.c = z340Var;
        this.w = i440Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1 mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1) {
            mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1 = (MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1) continuation;
            int i2 = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b, this.c, this.w);
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.L$0 = null;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.L$1 = null;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.L$2 = null;
                    mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1 = new MtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopStateInteractor$stateFlow$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
