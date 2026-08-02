package ru.yandex.taxi.inapp_calls;

import com.yandex.go.coroutines.b;
import defpackage.czo0;
import defpackage.dhv;
import defpackage.gdc;
import defpackage.hbp0;
import defpackage.mqg0;
import defpackage.oep0;
import defpackage.oyr;
import defpackage.s270;
import defpackage.t270;
import defpackage.t3u0;
import defpackage.u3u0;
import defpackage.v3u0;
import defpackage.wms;
import defpackage.y3u0;
import defpackage.yvf0;
import defpackage.zuj0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.statebar.StateBarViewModel$Type;
import ru.yandex.taxi.statebar.controller.c;

/* loaded from: classes9.dex */
public final class a extends c {
    public final t270 j;
    public final yvf0 k;
    public final oep0 l;
    public final hbp0 m;
    public s270 n;
    public final wms o;

    public a(t270 t270Var, com.yandex.go.navigation.screen.c cVar, yvf0 yvf0Var, oep0 oep0Var, zuj0 zuj0Var, y3u0 y3u0Var, v3u0 v3u0Var) {
        super(cVar, y3u0Var, v3u0Var);
        this.j = t270Var;
        this.k = yvf0Var;
        this.l = oep0Var;
        this.m = new hbp0(new czo0(14), "", null);
        this.o = new wms(2);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void b(ru.yandex.taxi.statebar.a aVar) {
        super.b(aVar);
        hbp0 hbp0Var = this.m;
        hbp0Var.a();
        b.g(hbp0Var, null, null, new InAppCallsStateBarController$start$1(this, null), 3);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final boolean e() {
        return this.n != null && super.e();
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void f() {
        u3u0 u3u0Var;
        ru.yandex.taxi.statebar.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        s270 s270Var = this.n;
        if (s270Var == null) {
            t3u0 t3u0Var = new t3u0(StateBarViewModel$Type.IN_APP_CALL);
            t3u0Var.b = false;
            u3u0Var = new u3u0(t3u0Var);
        } else {
            String str = s270Var.b;
            t3u0 t3u0Var2 = new t3u0(StateBarViewModel$Type.IN_APP_CALL);
            t3u0Var2.h = new gdc(mqg0.component_green_normal);
            String str2 = s270Var.c;
            this.o.getClass();
            t3u0Var2.e = str + " • " + str2;
            t3u0Var2.f = oyr.q(s270Var.a, Extension.FIX_SPACE, str, Extension.FIX_SPACE, str2);
            t3u0Var2.b = true;
            t3u0Var2.j = true;
            t3u0Var2.i = new dhv(2, this);
            u3u0Var = new u3u0(t3u0Var2);
        }
        g();
        aVar.a(u3u0Var);
    }

    @Override // ru.yandex.taxi.statebar.controller.c
    public final void stop() {
        this.m.b();
        super.stop();
    }
}
