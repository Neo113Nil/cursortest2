package ru.yandex.taxi.experiments;

import defpackage.ny61;
import defpackage.qn11;
import defpackage.un11;
import defpackage.vpr;
import defpackage.zn11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ qn11 b;

    public n(vpr vprVar, qn11 qn11Var) {
        this.a = vprVar;
        this.b = qn11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1 persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PersistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1) {
            persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1 = (PersistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zn11 zn11Var = (zn11) obj;
                    zn11Var.getClass();
                    qn11 qn11Var = this.b;
                    un11 un11Var = (un11) zn11Var.a.get(qn11Var.getClass());
                    qn11 qn11Var2 = un11Var != null ? un11Var.a : null;
                    if (qn11Var2 != null) {
                        qn11Var = qn11Var2;
                    }
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.L$0 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.L$1 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.L$2 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.L$3 = null;
                    persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qn11Var, persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1 = new PersistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentExperimentsImpl$experimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
