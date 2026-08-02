package ru.yandex.taxi.favorites.suggest;

import defpackage.ck;
import defpackage.i3y;
import defpackage.kgx;
import defpackage.on2;
import defpackage.rol0;
import defpackage.uhp;
import defpackage.yhp;
import kotlinx.coroutines.flow.o;

/* loaded from: classes9.dex */
public final class b {
    public final uhp a;
    public final yhp b;
    public final i3y c;

    static {
        kgx[] kgxVarArr = uhp.b;
    }

    public b(on2 on2Var, uhp uhpVar, yhp yhpVar) {
        this.a = uhpVar;
        this.b = yhpVar;
        this.c = kotlin.a.a(new ck(on2Var, 10));
    }

    public final o a() {
        return new o(new rol0(new FavoriteSuggestRepositoryImpl$suggests$1(this, null)), new FavoriteSuggestRepositoryImpl$suggests$2());
    }
}
