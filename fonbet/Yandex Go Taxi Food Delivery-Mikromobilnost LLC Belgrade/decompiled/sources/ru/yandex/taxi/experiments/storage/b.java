package ru.yandex.taxi.experiments.storage;

import defpackage.h3y;
import defpackage.hbp0;
import defpackage.tt2;
import defpackage.ww60;

/* loaded from: classes9.dex */
public final class b implements ww60 {
    public final h3y a;
    public final tt2 b;

    public b(h3y h3yVar, tt2 tt2Var) {
        this.a = h3yVar;
        this.b = tt2Var;
    }

    @Override // defpackage.ww60
    public final void f() {
        hbp0 hbp0Var = new hbp0(new StoredExperimentsLegacyMigrationRunner$onAppConfiguration$migrationScope$1(0, this.b, tt2.class, "io", "io()Lkotlinx/coroutines/CoroutineDispatcher;", 0), "StoredExperimentsLegacyMigration", null, 4);
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new StoredExperimentsLegacyMigrationRunner$onAppConfiguration$1(this, hbp0Var, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "StoredExperimentsLegacyMigrationRunner";
    }
}
