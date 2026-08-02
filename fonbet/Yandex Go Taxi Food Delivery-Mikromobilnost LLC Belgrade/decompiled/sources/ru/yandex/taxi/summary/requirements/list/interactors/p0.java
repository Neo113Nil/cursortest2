package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class p0 implements tpr {
    public final /* synthetic */ tpr a;

    public p0(kotlinx.coroutines.flow.n0 n0Var) {
        this.a = n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1 transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1;
        int i;
        if (continuation instanceof TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1) {
            transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1 = (TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1) continuation;
            int i2 = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o0 o0Var = new o0(vprVar);
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.L$0 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.L$1 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.L$2 = null;
                    transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.label = 1;
                    if (this.a.collect(o0Var, transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1) == coroutineSingletons) {
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
        transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1 = new TransferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1(this, continuation);
        Object obj2 = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementStateInteractor$subscribeOrderRequirementDeletions$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
