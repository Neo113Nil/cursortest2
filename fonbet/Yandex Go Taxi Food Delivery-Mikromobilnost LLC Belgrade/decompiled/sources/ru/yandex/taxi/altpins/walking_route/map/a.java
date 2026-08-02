package ru.yandex.taxi.altpins.walking_route.map;

import defpackage.a3v;
import defpackage.ah00;
import defpackage.b01;
import defpackage.czo0;
import defpackage.gh00;
import defpackage.gzx;
import defpackage.hbp0;
import defpackage.p2y0;
import defpackage.po21;
import defpackage.qwc;
import defpackage.qy1;
import defpackage.ry1;
import defpackage.sy1;
import defpackage.wt00;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.altpins.order.e;
import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.taxi.altpins.map.a a;
    public final p2y0 b;
    public final e c;
    public final wt00 d;
    public final a3v e;
    public final ah00 f;
    public final zuj0 g;
    public final po21 h;
    public final gzx i;
    public final qwc j;
    public boolean l;
    public ry1 m;
    public final hbp0 k = new hbp0(new czo0(14), "", null);
    public final b01 n = new b01(1, this);

    public a(ru.yandex.taxi.altpins.map.a aVar, p2y0 p2y0Var, e eVar, wt00 wt00Var, a3v a3vVar, ah00 ah00Var, zuj0 zuj0Var, po21 po21Var, gzx gzxVar, qwc qwcVar) {
        this.a = aVar;
        this.b = p2y0Var;
        this.c = eVar;
        this.d = wt00Var;
        this.e = a3vVar;
        this.f = ah00Var;
        this.g = zuj0Var;
        this.h = po21Var;
        this.i = gzxVar;
        this.j = qwcVar;
    }

    public final void a(String str) {
        sy1.a(this.a);
        ((gh00) this.f).e(this.n);
        this.i.attach();
        hbp0 hbp0Var = this.k;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new AltpinDetailMapObjectHolder$attach$1(this, str, null), 3);
        hbp0.e(hbp0Var, null, null, new AltpinDetailMapObjectHolder$attach$2(this, null), 3);
        hbp0.e(hbp0Var, null, null, new AltpinDetailMapObjectHolder$attach$3(this, null), 3);
        hbp0.e(hbp0Var, null, null, new AltpinDetailMapObjectHolder$attach$4(this, null), 3);
        hbp0.e(hbp0Var, null, null, new AltpinDetailMapObjectHolder$attach$5(this, null), 3);
        this.e.b8(this);
    }

    public final void b() {
        qy1 qy1Var;
        ry1 ry1Var;
        qy1 qy1Var2;
        List list;
        WalkingRouteUiState walkingRouteUiState;
        qy1 qy1Var3;
        qy1 qy1Var4;
        ry1 ry1Var2 = this.m;
        if (ry1Var2 == null || (qy1Var = ry1Var2.a) == null) {
            return;
        }
        qy1 qy1Var5 = qy1.f;
        if (qy1Var.equals(qy1Var5) || (ry1Var = this.m) == null || (qy1Var2 = ry1Var.b) == null || qy1Var2.equals(qy1Var5)) {
            return;
        }
        ry1 ry1Var3 = this.m;
        zzs zzsVar = null;
        zzs zzsVar2 = (ry1Var3 == null || (qy1Var4 = ry1Var3.a) == null) ? null : qy1Var4.a;
        if (ry1Var3 != null && (qy1Var3 = ry1Var3.b) != null) {
            zzsVar = qy1Var3.a;
        }
        if (ry1Var3 == null || (walkingRouteUiState = ry1Var3.d) == null || (list = walkingRouteUiState.a) == null) {
            list = EmptyList.a;
        }
        this.d.a(zzsVar2, zzsVar, list);
    }
}
