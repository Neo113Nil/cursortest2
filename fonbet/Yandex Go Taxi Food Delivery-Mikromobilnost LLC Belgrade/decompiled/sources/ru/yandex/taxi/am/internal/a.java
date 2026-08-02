package ru.yandex.taxi.am.internal;

import defpackage.evu0;
import defpackage.hjt;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import ru.yandex.taxi.am.k;

/* loaded from: classes9.dex */
public final class a {
    public final k a;
    public final d b;
    public final tt2 c;

    public a(k kVar, d dVar, tt2 tt2Var) {
        this.a = kVar;
        this.b = dVar;
        this.c = tt2Var;
    }

    public final void a() {
        k kVar = this.a;
        String str = (String) kVar.y.getValue(kVar, k.S[0]);
        if (str == null || evu0.J(str)) {
            return;
        }
        this.c.getClass();
        sjh sjhVar = uyj.a;
        tje.N(hjt.a, mdh.b, null, new AccountPhoneMigrationInteractor$doMigration$1(this, str, null), 2);
    }
}
