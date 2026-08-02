package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class t0 implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public t0(mth mthVar, u0 u0Var, String str, String str2) {
        this.a = mthVar;
        this.b = u0Var;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1 transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1) {
            transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1 = (TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1) continuation;
            int i2 = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s0 s0Var = new s0(vprVar, this.b, this.c, this.w);
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.L$0 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.L$1 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.L$2 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.label = 1;
                    if (this.a.collect(s0Var, transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1) == coroutineSingletons) {
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
        transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1 = new TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1(this, continuation);
        Object obj2 = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
