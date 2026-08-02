package ru.yandex.taxi.shortcuts.interactors;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.shortcuts.impl.interactors.w;
import defpackage.e400;
import defpackage.jy60;
import defpackage.lx4;
import defpackage.maf0;
import defpackage.pa00;
import defpackage.sm40;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes10.dex */
public final class b implements jy60 {
    public final lx4 a;
    public final e400 b;
    public final c c;
    public final maf0 d;
    public final sm40 e;
    public final w f;
    public final pa00 g;
    public final tse h;
    public final Lifecycle i;

    public b(lx4 lx4Var, e400 e400Var, c cVar, maf0 maf0Var, sm40 sm40Var, w wVar, pa00 pa00Var, tse tseVar, Lifecycle lifecycle) {
        this.a = lx4Var;
        this.b = e400Var;
        this.c = cVar;
        this.d = maf0Var;
        this.e = sm40Var;
        this.f = wVar;
        this.g = pa00Var;
        this.h = tseVar;
        this.i = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ShortcutErrorAnalytics";
    }

    @Override // defpackage.jy60
    public final void h() {
        ShortcutErrorAnalytics$onFirstContentfulPaint$1 shortcutErrorAnalytics$onFirstContentfulPaint$1 = new ShortcutErrorAnalytics$onFirstContentfulPaint$1(this, null);
        tse tseVar = this.h;
        tje.N(tseVar, null, null, shortcutErrorAnalytics$onFirstContentfulPaint$1, 3);
        tje.N(tseVar, null, null, new ShortcutErrorAnalytics$onFirstContentfulPaint$2(this, null), 3);
    }
}
