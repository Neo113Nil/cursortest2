package ru.yandex.taxi.sdc.router;

import android.app.Activity;
import android.content.Context;
import defpackage.b850;
import defpackage.bd;
import defpackage.bk1;
import defpackage.ed;
import defpackage.gf41;
import defpackage.hc;
import defpackage.lc;
import defpackage.m230;
import defpackage.mc;
import defpackage.oc;
import defpackage.qc;
import defpackage.qco;
import defpackage.rc;
import defpackage.sc;
import defpackage.tje;
import defpackage.u45;
import defpackage.w030;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;

/* loaded from: classes6.dex */
public final class b extends m230 {
    public final w030 E;
    public final b850 F;
    public final gf41 G;
    public final lc H;
    public final bk1 I;
    public final Activity J;
    public final qc K;

    public b(w030 w030Var, b850 b850Var, gf41 gf41Var, lc lcVar, bk1 bk1Var, Activity activity) {
        super(null);
        this.E = w030Var;
        this.F = b850Var;
        this.G = gf41Var;
        this.H = lcVar;
        this.I = bk1Var;
        this.J = activity;
        this.K = new qc(0, this);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.K.g();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.a0(this.J, this.K);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        oc ocVar = (oc) obj;
        bd bdVar = ocVar.a;
        qco qcoVar = ocVar.b;
        rc rcVar = new rc(this, bdVar);
        AcceptEulaV2Router$provideModalView$1 acceptEulaV2Router$provideModalView$1 = new AcceptEulaV2Router$provideModalView$1(1, this, b.class, "openWebActivity", "openWebActivity(Ljava/lang/String;)V", 0);
        mc mcVar = this.H.a;
        AcceptEulaDialogV2 acceptEulaDialogV2 = new AcceptEulaDialogV2((Context) mcVar.a.get(), (ed) mcVar.b.get(), bdVar, qcoVar, rcVar, acceptEulaV2Router$provideModalView$1);
        if (bdVar.l) {
            acceptEulaDialogV2.setOnBackPressedListener(new hc(1, this, bdVar));
        }
        acceptEulaDialogV2.setOnAppearingListener(new sc(0, this));
        return acceptEulaDialogV2;
    }
}
