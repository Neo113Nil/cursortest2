package ru.yandex.taxi.altpins.confirmation_screen;

import android.content.Context;
import com.yandex.go.zone.repository.o;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b01;
import defpackage.b2l0;
import defpackage.czo0;
import defpackage.gh00;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.l390;
import defpackage.leh;
import defpackage.lyc;
import defpackage.qy1;
import defpackage.sy1;
import defpackage.tje;
import defpackage.w4e0;
import defpackage.wt00;
import defpackage.xm00;
import defpackage.zzs;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.altpins.models.b;
import ru.yandex.taxi.map.WalkingRouteUiState;

/* loaded from: classes5.dex */
public final class a implements l390 {
    public final leh A;
    public final ah00 B;
    public final i3y C = kotlin.a.a(new lyc(11, this));
    public final hbp0 D = new hbp0(new czo0(14), "", null);
    public final b01 E = new b01(3, this);
    public w4e0 F;
    public boolean G;
    public boolean H;
    public b I;
    public final Context a;
    public final a3v b;
    public final xm00 c;
    public final b2l0 w;
    public final o x;
    public final ru.yandex.taxi.altpins.map.a y;
    public final wt00 z;

    public a(Context context, a3v a3vVar, xm00 xm00Var, b2l0 b2l0Var, o oVar, ru.yandex.taxi.altpins.map.a aVar, wt00 wt00Var, leh lehVar, ah00 ah00Var) {
        this.a = context;
        this.b = a3vVar;
        this.c = xm00Var;
        this.w = b2l0Var;
        this.x = oVar;
        this.y = aVar;
        this.z = wt00Var;
        this.A = lehVar;
        this.B = ah00Var;
    }

    public final void a() {
        if (this.H) {
            return;
        }
        this.H = true;
        hbp0 hbp0Var = this.D;
        hbp0Var.a();
        sy1.a(this.y);
        ((gh00) this.B).e(this.E);
        tje.N(hbp0Var.c(), null, null, new ConfirmationScreenOnMapHolder$attach$1(this, null), 3);
        this.b.b8(this);
    }

    public final void b() {
        if (this.H) {
            this.H = false;
            this.D.b();
            this.b.a0(this);
            this.y.d();
            ((gh00) this.B).u(this.E);
        }
    }

    public final void c() {
        boolean z;
        WalkingRouteUiState walkingRouteUiState;
        qy1 qy1Var;
        qy1 qy1Var2;
        qy1 qy1Var3;
        b bVar;
        qy1 qy1Var4;
        b bVar2 = this.I;
        if (bVar2 != null && (qy1Var3 = bVar2.b) != null) {
            qy1 qy1Var5 = qy1.f;
            if (!qy1Var3.equals(qy1Var5) && (bVar = this.I) != null && (qy1Var4 = bVar.c) != null && !qy1Var4.equals(qy1Var5)) {
                z = true;
                if (this.G && z) {
                    b bVar3 = this.I;
                    List list = null;
                    zzs zzsVar = (bVar3 == null || (qy1Var2 = bVar3.b) == null) ? null : qy1Var2.a;
                    zzs zzsVar2 = (bVar3 == null || (qy1Var = bVar3.c) == null) ? null : qy1Var.a;
                    if (bVar3 != null && (walkingRouteUiState = bVar3.f) != null) {
                        list = walkingRouteUiState.a;
                    }
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    this.z.a(zzsVar, zzsVar2, list);
                    return;
                }
            }
        }
        z = false;
        if (this.G) {
        }
    }
}
