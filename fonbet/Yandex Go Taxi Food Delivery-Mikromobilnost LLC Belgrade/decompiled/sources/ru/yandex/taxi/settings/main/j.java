package ru.yandex.taxi.settings.main;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Lifecycle;
import defpackage.a850;
import defpackage.csz;
import defpackage.f600;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.i700;
import defpackage.j350;
import defpackage.lx4;
import defpackage.m350;
import defpackage.mhf;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.weu;
import defpackage.yvf0;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes10.dex */
public final class j implements f600 {
    public final DrawerLayout a;
    public final yvf0 b;
    public final com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer.a c;
    public final k d;
    public final a850 e;
    public final tse f;
    public final Lifecycle g;
    public final h3y h;
    public final mhf i;
    public final lx4 j;
    public float l;
    public boolean m;
    public pzt0 q;
    public pzt0 r;
    public final i3y k = kotlin.a.b(LazyThreadSafetyMode.NONE, new csz(12, this));
    public boolean n = true;
    public int o = 8388611;
    public final j350 p = new j350(this, 0);

    public j(DrawerLayout drawerLayout, yvf0 yvf0Var, com.yandex.go.mainscreen.superapp.impl.header.presentation.drawer.a aVar, k kVar, a850 a850Var, tse tseVar, Lifecycle lifecycle, h3y h3yVar, mhf mhfVar, lx4 lx4Var) {
        this.a = drawerLayout;
        this.b = yvf0Var;
        this.c = aVar;
        this.d = kVar;
        this.e = a850Var;
        this.f = tseVar;
        this.g = lifecycle;
        this.h = h3yVar;
        this.i = mhfVar;
        this.j = lx4Var;
        tje.N(tseVar, null, null, new NativeMenuRouterImpl$1(this, null), 3);
        gtq0.t(tseVar, new weu(14, this));
    }

    @Override // defpackage.f600
    public final void a() {
        i3y i3yVar = this.k;
        if (i3yVar.isInitialized()) {
            ((i700) i3yVar.getValue()).Xg();
        }
    }

    @Override // defpackage.f600
    public final float b() {
        return this.l;
    }

    @Override // defpackage.f600
    public final boolean c() {
        return this.m;
    }

    @Override // defpackage.f600
    public final boolean d() {
        return this.a.isDrawerOpen(this.o);
    }

    @Override // defpackage.f600
    public final void e() {
        i3y i3yVar = this.k;
        if (i3yVar.isInitialized()) {
            ((i700) i3yVar.getValue()).Yg();
        }
    }

    @Override // defpackage.f600
    public final void f() {
        int i = this.o;
        DrawerLayout drawerLayout = this.a;
        drawerLayout.closeDrawer(i);
        drawerLayout.setDrawerLockMode(1);
    }

    @Override // defpackage.f600
    public final void g() {
        ((ru.yandex.taxi.analytics.j) this.j).n("SuperappMain.Menu.Clicked");
        int i = this.o;
        DrawerLayout drawerLayout = this.a;
        boolean isDrawerOpen = drawerLayout.isDrawerOpen(i);
        i3y i3yVar = this.k;
        if (isDrawerOpen) {
            ((i700) i3yVar.getValue()).ah();
        } else {
            drawerLayout.addDrawerListener(new m350(this));
        }
        drawerLayout.openDrawer(this.o);
        ((i700) i3yVar.getValue()).ch();
        this.m = true;
    }
}
