package ru.yandex.taxi.experiments;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zn11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ SimpleBooleanExperiment b;

    public j(vpr vprVar, SimpleBooleanExperiment simpleBooleanExperiment) {
        this.a = vprVar;
        this.b = simpleBooleanExperiment;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PersistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1 persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof PersistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1) {
            persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1 = (PersistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((zn11) obj).a(this.b.getId()));
                    persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.L$0 = null;
                    persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.L$1 = null;
                    persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.L$2 = null;
                    persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.L$3 = null;
                    persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1 = new PersistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = persistentExperimentsImpl$booleanExperimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
