package ru.yandex.taxi.yaplus;

import defpackage.d49;
import defpackage.hid0;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wnb0;

/* loaded from: classes6.dex */
public final class a implements hid0 {
    public final tse a;
    public final b b;
    public final d49 c;
    public pzt0 d;

    public a(tse tseVar, b bVar, d49 d49Var) {
        this.a = tseVar;
        this.b = bVar;
        this.c = d49Var;
    }

    public final void a() {
        this.d = com.yandex.go.coroutines.b.g(this.a, null, null, new PlusPromoRouterImpl$runWhenPlusInfoReady$1(this, new wnb0(16, this), null), 3);
    }
}
