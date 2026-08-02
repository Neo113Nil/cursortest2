package ru.yandex.taxi.superapp;

import defpackage.gcn;
import defpackage.ryq0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;

/* loaded from: classes6.dex */
public final class q {
    public final p a;
    public final tt2 b;
    public final tse c;

    public q(p pVar, tt2 tt2Var, tse tseVar) {
        this.a = pVar;
        this.b = tt2Var;
        this.c = tseVar;
    }

    public final void a(String str, gcn gcnVar) {
        tje.N(this.c, null, null, new SuperAppStorageDelegate$getContext$1(this, gcnVar, str, null), 3);
    }

    public final void b(ryq0 ryq0Var, gcn gcnVar) {
        tje.N(this.c, null, null, new SuperAppStorageDelegate$saveContext$1(this, gcnVar, ryq0Var, null), 3);
    }
}
