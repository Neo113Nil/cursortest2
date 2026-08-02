package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class s0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public s0(vpr vprVar, u0 u0Var, String str, String str2) {
        this.a = vprVar;
        this.b = u0Var;
        this.c = str;
        this.w = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1 transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1;
        int i;
        Boolean valueOf;
        List f;
        if (continuation instanceof TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1) {
            transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1 = (TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1) continuation;
            int i2 = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    rsn rsnVar = (rsn) obj;
                    pex0 pex0Var = (pex0) rsnVar.a;
                    pex0 pex0Var2 = (pex0) rsnVar.b;
                    if (jl40.l(pex0Var != null ? pex0Var.l : null, pex0Var2.l)) {
                        pex0 pex0Var3 = (pex0) rsnVar.a;
                        boolean z = false;
                        String str = this.w;
                        String str2 = this.c;
                        u0 u0Var = this.b;
                        boolean c = (pex0Var3 == null || (f = pex0Var3.f()) == null) ? false : u0.c(u0Var, f, str2, str);
                        boolean c2 = u0.c(u0Var, pex0Var2.f(), str2, str);
                        if (c && !c2) {
                            z = true;
                        }
                        valueOf = Boolean.valueOf(z);
                    } else {
                        valueOf = Boolean.FALSE;
                    }
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.L$0 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.L$1 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.L$2 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.L$3 = null;
                    transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1) == coroutineSingletons) {
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
        transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1 = new TransferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1(this, continuation);
        Object obj22 = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementStateInteractor$subscribeSupportedRequirementsChanged$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
