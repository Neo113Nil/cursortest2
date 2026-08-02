package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class q0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;

    public q0(vpr vprVar, u0 u0Var, String str) {
        this.a = vprVar;
        this.b = u0Var;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1 transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1;
        int i;
        if (continuation instanceof TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1) {
            transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1 = (TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1) continuation;
            int i2 = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(u0.a(this.b, this.c));
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.L$0 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.L$1 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.L$2 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.L$3 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(valueOf, transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1 = new TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1(this, continuation);
        Object obj22 = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
