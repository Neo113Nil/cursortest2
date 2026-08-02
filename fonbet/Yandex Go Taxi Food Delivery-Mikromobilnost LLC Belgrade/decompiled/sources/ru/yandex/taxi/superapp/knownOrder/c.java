package ru.yandex.taxi.superapp.knownOrder;

import defpackage.m49;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class c implements tpr {
    public final /* synthetic */ tpr[] a;

    public c(tpr[] tprVarArr) {
        this.a = tprVarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1 knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1;
        int i;
        if (continuation instanceof KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1) {
            knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1 = (KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1) continuation;
            int i2 = knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr[] tprVarArr = this.a;
                    m49 m49Var = new m49(tprVarArr, 2);
                    KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$3 knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$3 = new KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$3(3, null);
                    knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.L$0 = null;
                    knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.L$1 = null;
                    knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.L$2 = null;
                    knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.label = 1;
                    if (kotlinx.coroutines.flow.internal.j.a(vprVar, m49Var, knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$3, knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1, tprVarArr) == coroutineSingletons) {
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
        knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1 = new KnownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1(this, continuation);
        Object obj2 = knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = knownOrdersRepositoryImpl$combineKnownOrdersInfo$$inlined$combine$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
