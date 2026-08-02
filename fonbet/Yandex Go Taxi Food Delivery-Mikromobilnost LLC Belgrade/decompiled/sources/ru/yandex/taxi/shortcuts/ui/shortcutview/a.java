package ru.yandex.taxi.shortcuts.ui.shortcutview;

import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import defpackage.ffx;
import defpackage.n4s0;
import defpackage.pqv;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yaf0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class a implements n4s0 {
    public final tse a;
    public final tt2 b;
    public final com.yandex.go.shortcuts.impl.interactors.d c;
    public final pqv d;
    public final n0 e = ffx.b(1, 1, BufferOverflow.DROP_OLDEST);
    public pzt0 f;

    public a(tse tseVar, tt2 tt2Var, com.yandex.go.shortcuts.impl.interactors.d dVar, pqv pqvVar) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = dVar;
        this.d = pqvVar;
    }

    @Override // defpackage.n4s0
    public final tpr b(yaf0 yaf0Var) {
        this.b.getClass();
        this.f = tje.N(this.a, uyj.a, null, new ShortcutViewModelRepository$start$1(this, yaf0Var, null), 2);
        ProductsScreenType$Type a = yaf0Var.a();
        ProductsScreenType$Type productsScreenType$Type = ProductsScreenType$Type.TAXI_MAIN_SCREEN;
        n0 n0Var = this.e;
        return a == productsScreenType$Type ? kotlinx.coroutines.flow.e.p(n0Var, 300L) : n0Var;
    }

    @Override // defpackage.n4s0
    public final void stop() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
