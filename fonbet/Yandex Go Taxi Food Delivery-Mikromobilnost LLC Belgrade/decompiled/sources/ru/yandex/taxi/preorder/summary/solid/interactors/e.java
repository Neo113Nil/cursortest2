package ru.yandex.taxi.preorder.summary.solid.interactors;

import defpackage.fnx0;
import defpackage.jn40;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vpr;
import defpackage.wo0;
import defpackage.xo0;
import defpackage.zy11;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;

    public e(vpr vprVar, g gVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AddressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1 addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1;
        int i;
        Object xo0Var;
        Set set;
        if (continuation instanceof AddressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1) {
            addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1 = (AddressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1) continuation;
            int i2 = addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    if (pex0Var.K0) {
                        jn40 jn40Var = pex0Var.V;
                        if (jn40Var == null || (set = jn40Var.f) == null) {
                            set = EmptySet.a;
                        }
                        xo0Var = new wo0(set);
                    } else {
                        xo0Var = new xo0(pex0Var.b);
                    }
                    addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.L$0 = null;
                    addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.L$1 = null;
                    addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.L$2 = null;
                    addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.L$3 = null;
                    addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(xo0Var, addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1) == coroutineSingletons) {
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
        addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1 = new AddressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1(this, continuation);
        Object obj22 = addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = addressActionsOnSummaryInteractor$handleSelectionChange$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
