package ru.yandex.taxi.altpins.map;

import android.graphics.Bitmap;
import defpackage.ah00;
import defpackage.bgc;
import defpackage.cwa1;
import defpackage.czo0;
import defpackage.d4;
import defpackage.dz1;
import defpackage.e100;
import defpackage.f4c0;
import defpackage.fz1;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.j741;
import defpackage.ry1;
import defpackage.sls;
import defpackage.srb1;
import defpackage.sy1;
import defpackage.tje;
import defpackage.wt00;
import defpackage.xm00;
import defpackage.zzs;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.map.c;
import ru.yandex.taxi.shadow.ShadowWrapperImpl;

/* loaded from: classes5.dex */
public final class a implements sy1 {
    public final MainActivity a;
    public final b b;
    public final j741 c;
    public final ShadowWrapperImpl d;
    public final ah00 e;
    public final h3y f;
    public final fz1 g;
    public ry1 h;
    public final hbp0 i;
    public final e100 j;
    public final e100 k;
    public final e100 l;
    public final i3y m;
    public float n;
    public sls o;
    public sls p;

    public a(xm00 xm00Var, MainActivity mainActivity, b bVar, j741 j741Var, ShadowWrapperImpl shadowWrapperImpl, ah00 ah00Var, wt00 wt00Var, h3y h3yVar) {
        this.a = mainActivity;
        this.b = bVar;
        this.c = j741Var;
        this.d = shadowWrapperImpl;
        this.e = ah00Var;
        this.f = h3yVar;
        i3y a = kotlin.a.a(new dz1(xm00Var, 0));
        this.g = new fz1(0, this);
        this.h = ry1.e;
        this.i = new hbp0(new czo0(14), "", null);
        this.j = new e100((xm00) a.getValue());
        this.k = new e100((xm00) a.getValue());
        this.l = new e100((xm00) a.getValue());
        this.m = kotlin.a.a(new d4(28, this));
        this.o = new bgc(12);
        this.p = new bgc(12);
    }

    public static final void b(a aVar) {
        boolean z = (aVar.n == 0.0f || ((gh00) aVar.e).j() >= aVar.n) && !aVar.h.equals(ry1.e);
        if (aVar.h.b.e) {
            aVar.j.j(z);
        } else {
            aVar.k.j(z);
        }
        ((c) aVar.c).c(z);
        if (z) {
            aVar.p.invoke();
        }
    }

    public final void c(sls slsVar, sls slsVar2) {
        this.i.a();
        i3y i3yVar = this.m;
        Bitmap bitmap = (Bitmap) i3yVar.getValue();
        e100 e100Var = this.j;
        xm00 xm00Var = (xm00) e100Var.b;
        zzs zzsVar = zzs.f;
        f4c0 r = xm00Var.r(cwa1.d(zzsVar));
        r.i(false);
        r.x(bitmap);
        e100Var.c = r;
        f4c0 r2 = xm00Var.r(cwa1.d(zzsVar));
        r2.i(false);
        e100Var.w = r2;
        Bitmap bitmap2 = (Bitmap) i3yVar.getValue();
        e100 e100Var2 = this.k;
        xm00 xm00Var2 = (xm00) e100Var2.b;
        f4c0 r3 = xm00Var2.r(cwa1.d(zzsVar));
        r3.i(false);
        r3.x(bitmap2);
        e100Var2.c = r3;
        f4c0 r4 = xm00Var2.r(cwa1.d(zzsVar));
        r4.i(false);
        e100Var2.w = r4;
        Bitmap bitmap3 = (Bitmap) i3yVar.getValue();
        e100 e100Var3 = this.l;
        xm00 xm00Var3 = (xm00) e100Var3.b;
        f4c0 r5 = xm00Var3.r(cwa1.d(zzsVar));
        r5.i(false);
        r5.x(bitmap3);
        e100Var3.c = r5;
        f4c0 r6 = xm00Var3.r(cwa1.d(zzsVar));
        r6.i(false);
        e100Var3.w = r6;
        ((gh00) this.e).e(this.g);
        this.o = slsVar;
        this.p = slsVar2;
    }

    public final void d() {
        this.i.b();
        this.j.a();
        this.k.a();
        this.l.a();
        ((c) this.c).a();
        ((gh00) this.e).u(this.g);
        this.n = 0.0f;
    }

    public final void e(ry1 ry1Var) {
        this.h = ry1Var;
        if (ry1Var.equals(ry1.e)) {
            this.j.j(false);
            this.k.j(false);
            this.l.j(false);
            ((c) this.c).a();
            return;
        }
        double d = (srb1.d(ry1Var.a.a, ry1Var.b.a) * (-0.006d)) + 17.87d;
        if (d > 16.0d) {
            d = 16.0d;
        }
        this.n = (float) d;
        tje.N(this.i.c(), null, null, new AltpinDestinationOnMapHolder$render$1(this, ry1Var, null), 3);
    }
}
