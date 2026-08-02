package ru.yandex.taxi.statebar.controller;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dai;
import defpackage.g18;
import defpackage.hhf;
import defpackage.k20;
import defpackage.p3u0;
import defpackage.sls;
import defpackage.uhx;
import defpackage.v3u0;
import defpackage.y3u0;
import java.util.HashSet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.statebar.controller.c;

/* loaded from: classes10.dex */
public abstract class c {
    public final com.yandex.go.navigation.screen.c a;
    public final y3u0 b;
    public final v3u0 c;
    public final sls d = new StateBarController$stateBarVisibilityProvider$1(0, this, c.class, "isStateBarVisible", "isStateBarVisible()Z", 0);
    public uhx e;
    public g18 f;
    public g18 g;
    public g18 h;
    public ru.yandex.taxi.statebar.a i;

    public c(com.yandex.go.navigation.screen.c cVar, y3u0 y3u0Var, v3u0 v3u0Var) {
        this.a = cVar;
        this.b = y3u0Var;
        this.c = v3u0Var;
        dai daiVar = g18.u1;
        this.f = daiVar;
        this.g = daiVar;
        this.h = daiVar;
    }

    public void b(ru.yandex.taxi.statebar.a aVar) {
        this.i = aVar;
        y3u0 y3u0Var = this.b;
        HashSet hashSet = y3u0Var.b;
        sls slsVar = this.d;
        hashSet.add(slsVar);
        this.f = new k20(8, y3u0Var, slsVar);
        this.g = this.a.a(new hhf() { // from class: o3u0
            @Override // defpackage.hhf
            public final void a(Screen screen) {
                c.this.f();
            }
        });
        p3u0 p3u0Var = new p3u0(this);
        v3u0 v3u0Var = this.c;
        v3u0Var.b.add(p3u0Var);
        this.h = new k20(7, v3u0Var, p3u0Var);
    }

    public boolean e() {
        return this.c.a.isEmpty();
    }

    public abstract void f();

    public final void g() {
        uhx uhxVar = this.e;
        if (uhxVar != null) {
            uhxVar.d();
        }
        y3u0 y3u0Var = this.b;
        r0 r0Var = y3u0Var.a;
        Boolean valueOf = Boolean.valueOf(y3u0Var.a());
        r0Var.getClass();
        r0Var.m(null, valueOf);
    }

    public void stop() {
        this.g.cancel();
        this.h.cancel();
        this.f.cancel();
        this.i = null;
    }
}
