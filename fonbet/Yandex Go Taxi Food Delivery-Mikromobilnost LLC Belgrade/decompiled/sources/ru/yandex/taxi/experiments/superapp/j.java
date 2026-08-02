package ru.yandex.taxi.experiments.superapp;

import defpackage.jbh;
import defpackage.qmp;
import defpackage.rqo;
import defpackage.szv0;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.ul51;
import kotlinx.coroutines.flow.n;

/* loaded from: classes9.dex */
public final class j {
    public final qmp a;
    public final t1b0 b;

    public j(rqo rqoVar, qmp qmpVar) {
        this.a = qmpVar;
        this.b = ((jbh) rqoVar).e(szv0.m);
    }

    public final szv0 a() {
        ((ul51) this.a).getClass();
        return (szv0) this.b.c();
    }

    public final tpr b() {
        ((ul51) this.a).getClass();
        return new n(this.b.a(), new SuperAppExperimentRepositoryImpl$experimentFlow$1(this, null));
    }
}
