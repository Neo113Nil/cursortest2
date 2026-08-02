package ru.yandex.taxi.experiments;

import defpackage.mth;
import defpackage.ny61;
import defpackage.qn11;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class o implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ qn11 b;

    public o(mth mthVar, qn11 qn11Var) {
        this.a = mthVar;
        this.b = qn11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PersistentExperimentsImpl$experimentFlow$$inlined$map$1$1 persistentExperimentsImpl$experimentFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof PersistentExperimentsImpl$experimentFlow$$inlined$map$1$1) {
            persistentExperimentsImpl$experimentFlow$$inlined$map$1$1 = (PersistentExperimentsImpl$experimentFlow$$inlined$map$1$1) continuation;
            int i2 = persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    n nVar = new n(vprVar, this.b);
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.L$0 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.L$1 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.L$2 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(nVar, persistentExperimentsImpl$experimentFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        persistentExperimentsImpl$experimentFlow$$inlined$map$1$1 = new PersistentExperimentsImpl$experimentFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentExperimentsImpl$experimentFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
