package ru.yandex.taxi.search.address.view;

import android.content.Context;
import defpackage.a3v;
import defpackage.cc60;
import defpackage.d240;
import defpackage.fk7;
import defpackage.i130;
import defpackage.m230;
import defpackage.ou4;
import defpackage.tje;
import defpackage.u45;
import defpackage.w030;
import defpackage.wb60;

/* loaded from: classes6.dex */
public final class h extends m230 {
    public final Context E;
    public final a3v F;
    public final fk7 G;
    public final i130 H;
    public final cc60 I;

    public h(Context context, a3v a3vVar, fk7 fk7Var, i130 i130Var, cc60 cc60Var) {
        super(null);
        this.E = context;
        this.F = a3vVar;
        this.G = fk7Var;
        this.H = i130Var;
        this.I = cc60Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new NoInternetConnectionRouter$onLaunch$1(this, null), 3);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.H.a();
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        wb60 wb60Var = (wb60) obj;
        NoInternetConnectionModalView noInternetConnectionModalView = new NoInternetConnectionModalView(this.E, wb60Var.a, wb60Var.b, new d240(28, this));
        noInternetConnectionModalView.setOnAppearingListener(new ou4(7, this, noInternetConnectionModalView));
        return noInternetConnectionModalView;
    }
}
