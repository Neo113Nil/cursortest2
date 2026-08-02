package ru.yandex.taxi.superapp.shortcuts;

import defpackage.a5p0;
import defpackage.e4s0;
import defpackage.f4s0;
import defpackage.faf0;
import defpackage.jst;
import defpackage.n4s0;
import defpackage.pvn;
import defpackage.pzt0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.waf0;
import defpackage.yaf0;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes6.dex */
public final class a implements n4s0 {
    public final tse a;
    public final b b;
    public final e4s0 c;
    public final f4s0 d;
    public final faf0 e;
    public pzt0 f;

    public a(tse tseVar, b bVar, e4s0 e4s0Var, f4s0 f4s0Var, faf0 faf0Var) {
        this.a = tseVar;
        this.b = bVar;
        this.c = e4s0Var;
        this.d = f4s0Var;
        this.e = faf0Var;
    }

    @Override // defpackage.n4s0
    public final tpr a(yaf0 yaf0Var, boolean z, boolean z2) {
        if (!(yaf0Var instanceof waf0)) {
            jst.e.s(new IllegalArgumentException("ScreensShortcutsViewSource can work only with ProductsScreenType.Screens"));
            return pvn.a;
        }
        pzt0 g = com.yandex.go.coroutines.b.g(this.a, null, null, new ScreensShortcutsViewSourceImpl$start$1(this, yaf0Var, z, null), 3);
        this.f = g;
        g.w(new a5p0(2, this, yaf0Var));
        f4s0 f4s0Var = this.d;
        e4s0 e4s0Var = this.c;
        b bVar = this.b;
        return z2 ? e.t(new n(bVar.b((waf0) yaf0Var, e4s0Var, f4s0Var), new ScreensShortcutsViewSourceImpl$start$3(this, null))) : bVar.b((waf0) yaf0Var, e4s0Var, f4s0Var);
    }

    @Override // defpackage.n4s0
    public final tpr b(yaf0 yaf0Var) {
        return a(yaf0Var, false, false);
    }

    @Override // defpackage.n4s0
    public final void stop() {
        pzt0 pzt0Var = this.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f = null;
    }
}
