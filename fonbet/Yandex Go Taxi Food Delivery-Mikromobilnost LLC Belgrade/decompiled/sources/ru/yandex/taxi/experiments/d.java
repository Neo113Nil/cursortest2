package ru.yandex.taxi.experiments;

import defpackage.qqo;
import defpackage.t1b0;
import defpackage.tpr;

/* loaded from: classes9.dex */
public abstract class d {
    public static final tpr a(qqo qqoVar) {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(qqoVar.a(), new ExperimentProviderKt$fullExperimentFlow$1(qqoVar, null)));
    }

    public static final tpr b(t1b0 t1b0Var) {
        return kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(t1b0Var.a(), new PersistentExperimentProviderKt$fullExperimentFlow$1(t1b0Var, null)));
    }
}
