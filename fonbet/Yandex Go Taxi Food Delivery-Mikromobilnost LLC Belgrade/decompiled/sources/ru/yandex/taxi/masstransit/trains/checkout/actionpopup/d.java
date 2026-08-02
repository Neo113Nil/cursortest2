package ru.yandex.taxi.masstransit.trains.checkout.actionpopup;

import defpackage.bvf0;
import defpackage.c7s0;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.x940;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class d {
    public final e a;
    public final r0 b = bvf0.c(new x940(0));

    public d(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005c -> B:10:0x0060). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c7s0 c7s0Var, ContinuationImpl continuationImpl) {
        MtTrainActionPopupUiStateRepository$updateInitialState$1 mtTrainActionPopupUiStateRepository$updateInitialState$1;
        int i;
        n4u0 n4u0Var;
        Object a;
        if (continuationImpl instanceof MtTrainActionPopupUiStateRepository$updateInitialState$1) {
            mtTrainActionPopupUiStateRepository$updateInitialState$1 = (MtTrainActionPopupUiStateRepository$updateInitialState$1) continuationImpl;
            int i2 = mtTrainActionPopupUiStateRepository$updateInitialState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainActionPopupUiStateRepository$updateInitialState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainActionPopupUiStateRepository$updateInitialState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainActionPopupUiStateRepository$updateInitialState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n4u0Var = this.b;
                    Object value = n4u0Var.getValue();
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$0 = c7s0Var;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$1 = n4u0Var;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$2 = value;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$3 = null;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.label = 1;
                    a = this.a.a(c7s0Var, mtTrainActionPopupUiStateRepository$updateInitialState$1);
                    if (a != coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = mtTrainActionPopupUiStateRepository$updateInitialState$1.L$2;
                    n4u0 n4u0Var2 = (pz40) mtTrainActionPopupUiStateRepository$updateInitialState$1.L$1;
                    c7s0 c7s0Var2 = (c7s0) mtTrainActionPopupUiStateRepository$updateInitialState$1.L$0;
                    kotlin.b.b(obj);
                    n4u0 n4u0Var3 = n4u0Var2;
                    r0 r0Var = (r0) n4u0Var3;
                    if (!r0Var.k(obj2, (x940) obj)) {
                        return zy11.a;
                    }
                    c7s0Var = c7s0Var2;
                    n4u0Var = r0Var;
                    Object value2 = n4u0Var.getValue();
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$0 = c7s0Var;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$1 = n4u0Var;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$2 = value2;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.L$3 = null;
                    mtTrainActionPopupUiStateRepository$updateInitialState$1.label = 1;
                    a = this.a.a(c7s0Var, mtTrainActionPopupUiStateRepository$updateInitialState$1);
                    if (a != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c7s0Var2 = c7s0Var;
                    obj2 = value2;
                    obj = a;
                    n4u0Var3 = n4u0Var;
                    r0 r0Var2 = (r0) n4u0Var3;
                    if (!r0Var2.k(obj2, (x940) obj)) {
                    }
                }
            }
        }
        mtTrainActionPopupUiStateRepository$updateInitialState$1 = new MtTrainActionPopupUiStateRepository$updateInitialState$1(this, continuationImpl);
        Object obj3 = mtTrainActionPopupUiStateRepository$updateInitialState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainActionPopupUiStateRepository$updateInitialState$1.label;
        if (i != 0) {
        }
    }
}
