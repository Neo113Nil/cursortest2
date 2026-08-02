package ru.yandex.taxi.superapp.knownOrder;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.v10;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n implements tpr {
    public final /* synthetic */ tpr[] a;
    public final /* synthetic */ boolean b;

    public n(tpr[] tprVarArr, boolean z) {
        this.a = tprVarArr;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1 knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1) {
            knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1 = (KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1) continuation;
            int i2 = knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    v10 v10Var = new v10(tprVarArr, 28);
                    KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3 knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3 = new KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3(this.b, null);
                    knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.L$0 = null;
                    knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.L$1 = null;
                    knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.L$2 = null;
                    knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, v10Var, knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$3, knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1 = new KnownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1(this, continuation);
        Object obj2 = knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$observeOrdersFrom$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
