package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.concert.ConcertActivity;
import ru.yandex.music.concert.location_selector.ConcertLocationSelectorActivity;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final class d26 implements c26 {
    public final boolean a;
    public final nmj b;
    public final qnq c;
    public final g26 d;
    public final jyr e;
    public final oa1 f;
    public final ozw g;
    public final tmb h;
    public final boolean i;
    public final tmb j;
    public final vdr k;
    public final vdr l;
    public final dib m;
    public final vdr n;
    public final pjc o;

    public d26(boolean z, nmj nmjVar, qnq qnqVar, g26 g26Var, jyr jyrVar, oa1 oa1Var, ozw ozwVar, qyf qyfVar, tmb tmbVar, boolean z2) {
        nmjVar.getClass();
        this.a = z;
        this.b = nmjVar;
        this.c = qnqVar;
        this.d = g26Var;
        this.e = jyrVar;
        this.f = oa1Var;
        this.g = ozwVar;
        this.h = tmbVar;
        this.i = z2;
        this.j = g26Var.G();
        this.k = g26Var.H();
        this.l = g26Var.K().M();
        this.m = g26Var.h();
        this.n = g26Var.L();
        this.o = g26Var.J();
        x97.y(qyfVar, null, null, new ja4(this, null, 16), 3);
    }

    @Override // defpackage.c26
    public final void a() {
        this.d.O();
    }

    @Override // defpackage.c26
    public final boolean b() {
        return this.i;
    }

    public final int c() {
        o16 o16Var = ((l26) this.k.getValue()).b;
        m16 m16Var = o16Var instanceof m16 ? (m16) o16Var : null;
        if (m16Var != null) {
            return m16Var.b.size();
        }
        return 0;
    }

    @Override // defpackage.c26
    public final void d() {
        ((suc) ((d16) this.g.b).m.b).d();
    }

    @Override // defpackage.c26
    public final jmj f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1504726343);
        hn5 hn5Var = this.c.b;
        boolean h = oq5Var.h(this);
        Object K = oq5Var.K();
        if (h || K == gq5.a) {
            K = new ti1(5, this);
            oq5Var.k0(K);
        }
        jmj b = this.b.b((dmj) K, hn5Var, this.h, 1, oq5Var, ((i << 9) & 7168) | 33280);
        oq5Var.p(false);
        return b;
    }

    @Override // defpackage.c26
    public final dib h() {
        return this.m;
    }

    @Override // defpackage.c26
    public final void i() {
        Activity activity = this.f.a;
        int i = SearchActivity.Z;
        activity.startActivity(rvf.E(activity, c0p.e));
    }

    @Override // defpackage.c26
    public final pjc j() {
        return this.o;
    }

    @Override // defpackage.c26
    public final vdr k() {
        return this.n;
    }

    @Override // defpackage.c26
    public final void l() {
        this.d.S();
    }

    @Override // defpackage.c26
    public final void m() {
        this.d.N();
    }

    @Override // defpackage.c26
    public final void n(h06 h06Var, spd spdVar, int i) {
        String str = h06Var.a;
        str.getClass();
        Activity activity = this.f.a;
        int i2 = ConcertActivity.w0;
        activity.startActivity(bkp.j0(activity, str, null));
        y06 y06Var = ((l26) this.k.getValue()).c;
        w06 w06Var = y06Var instanceof w06 ? (w06) y06Var : null;
        rmb.j(sj2.r(this.j, i, w06Var != null ? w06Var.b : 0), wjb.ConcertScreen, x97.o(h06Var, spdVar), this.d.M(), 8);
    }

    @Override // defpackage.c26
    public final void o() {
        Activity activity = this.f.a;
        int i = ConcertLocationSelectorActivity.v0;
        activity.getClass();
        activity.startActivity(new Intent(activity, (Class<?>) ConcertLocationSelectorActivity.class));
        o16 o16Var = ((l26) this.k.getValue()).b;
        m16 m16Var = o16Var instanceof m16 ? (m16) o16Var : null;
        if (m16Var == null) {
            return;
        }
        int i2 = m16Var.a;
        pud pudVar = (pud) CollectionsKt.S(m16Var.b, i2);
        if (pudVar == null) {
            dfi.r("incorrect selected page", "ConcertTabHeaderUiState");
        }
        if (pudVar == null) {
            return;
        }
        rmb.j(sj2.s(this.j, c()), wjb.ConcertLocationSelector, x97.n(pudVar.c, i2, 0), this.d.M(), 8);
    }

    @Override // defpackage.c26
    public final void p(h06 h06Var, spd spdVar) {
        String str;
        String str2 = h06Var.h;
        if (str2 == null || (str = (String) avf.R(str2)) == null) {
            return;
        }
        String str3 = h06Var.a;
        str3.getClass();
        a0g.D(this.f.a, str3, str);
        rmb.j(sj2.s(this.j, c()), wjb.ConcertPurchaseScreen, x97.o(h06Var, spdVar), this.d.M(), 8);
    }

    @Override // defpackage.c26
    public final boolean q() {
        return this.a;
    }

    @Override // defpackage.c26
    public final List r(List list) {
        list.getClass();
        return etn.j0(list, (nnq) this.e.getValue(), this.c);
    }

    @Override // defpackage.c26
    public final vdr s() {
        return this.l;
    }

    @Override // defpackage.c26
    public final void t(boolean z, h06 h06Var, spd spdVar, String str) {
        str.getClass();
        weo.H(sj2.s(this.j, c()), x97.o(h06Var, spdVar), z, str, this.d.M());
    }

    @Override // defpackage.c26
    public final void u(h06 h06Var, spd spdVar) {
        h06Var.getClass();
        String str = h06Var.a;
        str.getClass();
        Activity activity = this.f.a;
        int i = ConcertActivity.w0;
        activity.startActivity(bkp.j0(activity, str, null));
        rmb.j(sj2.s(this.j, c()), wjb.ConcertScreen, x97.o(h06Var, spdVar), this.d.M(), 8);
    }

    @Override // defpackage.c26
    public final void v(boolean z, h06 h06Var, spd spdVar, int i, String str) {
        str.getClass();
        y06 y06Var = ((l26) this.k.getValue()).c;
        w06 w06Var = y06Var instanceof w06 ? (w06) y06Var : null;
        weo.H(sj2.r(this.j, i, w06Var != null ? w06Var.b : 0), x97.o(h06Var, spdVar), z, str, this.d.M());
    }

    @Override // defpackage.c26
    public final krf w(mm6 mm6Var) {
        xqq K = this.d.K();
        K.getClass();
        return new mrf(mm6Var, this.c, K);
    }

    @Override // defpackage.c26
    public final void x() {
        this.d.R();
    }

    @Override // defpackage.c26
    public final vdr y() {
        return this.k;
    }
}
