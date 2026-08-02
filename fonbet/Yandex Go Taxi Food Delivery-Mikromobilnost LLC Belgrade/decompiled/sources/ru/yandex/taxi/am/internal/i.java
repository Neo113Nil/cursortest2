package ru.yandex.taxi.am.internal;

import defpackage.jbh;
import defpackage.lz60;
import defpackage.qqo;
import defpackage.rqo;
import defpackage.so90;
import defpackage.tje;
import defpackage.to90;
import defpackage.tse;

/* loaded from: classes9.dex */
public final class i implements lz60 {
    public final tse a;
    public final to90 b;
    public final qqo c;

    public i(tse tseVar, rqo rqoVar, to90 to90Var) {
        this.a = tseVar;
        this.b = to90Var;
        so90.Companion.getClass();
        this.c = ((jbh) rqoVar).c(so90.e);
    }

    @Override // defpackage.lz60
    public final void g() {
        tje.N(this.a, null, null, new PassportPartitionsUpdater$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "PassportPartitionsUpdater";
    }
}
