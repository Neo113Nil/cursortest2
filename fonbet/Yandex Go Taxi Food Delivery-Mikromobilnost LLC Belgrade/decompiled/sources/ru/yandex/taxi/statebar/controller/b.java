package ru.yandex.taxi.statebar.controller;

import defpackage.bdc;
import defpackage.k0b0;
import defpackage.l3w0;
import defpackage.p8z;
import defpackage.pzt0;
import defpackage.r8h;
import defpackage.r8z;
import defpackage.t3u0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u3u0;
import defpackage.ukh;
import defpackage.v3u0;
import defpackage.v8z;
import defpackage.x4e;
import defpackage.x8z;
import defpackage.y3u0;
import defpackage.zz2;
import java.util.HashMap;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.statebar.data.LocationErrorReason;

/* loaded from: classes10.dex */
public final class b extends c {
    public final tse j;
    public final tt2 k;
    public final ukh l;
    public final x8z m;
    public final l3w0 n;
    public final r8h o;
    public final v8z p;
    public pzt0 q;
    public pzt0 r;
    public pzt0 s;
    public long t;

    public b(tse tseVar, tt2 tt2Var, ukh ukhVar, x8z x8zVar, l3w0 l3w0Var, r8h r8hVar, v8z v8zVar, com.yandex.go.navigation.screen.c cVar, y3u0 y3u0Var, v3u0 v3u0Var) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = tseVar;
        this.k = tt2Var;
        this.l = ukhVar;
        this.m = x8zVar;
        this.n = l3w0Var;
        this.o = r8hVar;
        this.p = v8zVar;
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        pzt0 pzt0Var = this.q;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.r;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.s;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        LocationErrorsStateBarController$launchLocationStateHandler$1 locationErrorsStateBarController$launchLocationStateHandler$1 = new LocationErrorsStateBarController$launchLocationStateHandler$1(this, null);
        tse tseVar = this.j;
        this.q = tje.N(tseVar, null, null, locationErrorsStateBarController$launchLocationStateHandler$1, 3);
        this.r = tje.N(tseVar, null, null, new LocationErrorsStateBarController$launchCurrentScreenObserver$1(this, null), 3);
        tje.N(tseVar, null, null, new LocationErrorsStateBarController$launchClickHandler$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return (((r8z) this.m.a.getValue()).a == LocationErrorReason.NONE || this.n.a() || !super.e()) ? false : true;
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void f() {
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        ukh ukhVar = this.l;
        bdc bdcVar = ukhVar.a;
        bdc bdcVar2 = ukhVar.b;
        r8z r8zVar = (r8z) this.m.a.getValue();
        boolean z = r8zVar instanceof p8z;
        String str = z ? ((p8z) r8zVar).b : "";
        String str2 = z ? ((p8z) r8zVar).c : "";
        Runnable runnable = z ? ((p8z) r8zVar).d : null;
        t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.LOCATION_ERRORS);
        t3u0Var.b = e();
        t3u0Var.e = str;
        t3u0Var.g = str2;
        t3u0Var.j = runnable != null;
        t3u0Var.i = runnable;
        t3u0Var.k = bdcVar;
        t3u0Var.l = bdcVar;
        t3u0Var.h = bdcVar2;
        aVar.a(new u3u0(t3u0Var));
        e();
        g();
        if (e()) {
            v8z v8zVar = this.p;
            zz2 zz2Var = v8zVar.c;
            k0b0 k0b0Var = v8zVar.a;
            boolean z2 = k0b0Var.g() || k0b0Var.a();
            boolean z3 = !v8zVar.b.c();
            boolean g = k0b0Var.g();
            Boolean valueOf = Boolean.valueOf(z3);
            zz2Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("app_geo_permission", Boolean.valueOf(z2));
            hashMap.put("system_geo_permission", valueOf);
            zz2Var.a.a("Application.AllowGeoPermissionWidget.Shown", hashMap, 1, x4e.r(g, hashMap, "precise_location"));
        }
    }
}
