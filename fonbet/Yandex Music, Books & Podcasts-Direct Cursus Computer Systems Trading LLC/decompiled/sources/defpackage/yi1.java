package defpackage;

import android.content.Intent;
import androidx.fragment.app.y;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final class yi1 {
    public final qnq a;
    public final jfu b;
    public final mj1 c;
    public final tmb d;
    public final zh1 e;
    public final dud f;
    public final arf g;
    public final arf h;
    public final jyr i;
    public final fkn j;
    public final xdr k;
    public final fkn l;
    public final fkn m;
    public final xdr n;
    public final j0q o;
    public final j0q p;
    public final o11 q;

    public yi1(qnq qnqVar, jfu jfuVar, mj1 mj1Var, tmb tmbVar, zh1 zh1Var, dud dudVar, e00 e00Var) {
        jyr b = e00Var.b(hag.I(xpq.class), true);
        jyr b2 = e00Var.b(hag.I(he1.class), true);
        fkn fknVar = mj1Var.t;
        dudVar.getClass();
        this.a = qnqVar;
        this.b = jfuVar;
        this.c = mj1Var;
        this.d = tmbVar;
        this.e = zh1Var;
        this.f = dudVar;
        this.g = b;
        this.h = b2;
        this.i = e00Var.b(hag.I(nmj.class), true);
        this.j = fknVar;
        this.k = mj1Var.u;
        this.l = mj1Var.v;
        this.m = mj1Var.x;
        this.n = mj1Var.z;
        this.o = mj1Var.A;
        this.p = mj1Var.B;
        qyf qyfVar = qnqVar.c;
        this.q = (o11) mj1Var.C.getValue();
        x97.y(qyfVar, null, null, new vi1(this, null, 1), 3);
        ox6.B(mj1Var.y, qyfVar, new wi1(this, 0));
        ox6.B(new ez(fknVar, 9), qyfVar, new wi1(this, 1));
    }

    public final ka1 a() {
        Object value = this.j.a.getValue();
        aj1 aj1Var = value instanceof aj1 ? (aj1) value : null;
        if (aj1Var != null) {
            return aj1Var.a;
        }
        return null;
    }

    public final void b() {
        ((np2) this.e.a.b).finish();
    }

    public final void c() {
        ka1 a = a();
        if (a != null) {
            q43 a2 = this.q.a();
            g70 g70Var = g70.b;
            c70 c70Var = c70.a;
            a2.a(new h70(g70Var));
            bi1 bi1Var = this.e.a;
            u51 u51Var = (u51) bi1Var.a;
            CoverPath coverPath = (CoverPath) CollectionsKt.firstOrNull(a.f);
            if (coverPath == null) {
                u9b u9bVar = u51Var.c;
                coverPath = u9bVar != null ? kg5.M(u9bVar, WebPath$Storage.AVATARS_NO_CROP) : null;
                if (coverPath == null) {
                    return;
                }
            }
            CoverPath coverPath2 = coverPath;
            int i = FullInfoActivity.g;
            np2 np2Var = (np2) bi1Var.b;
            String str = u51Var.a;
            str.getClass();
            np2Var.startActivity(wdp.l0(np2Var, new ixc(null, str, coverPath2, qo6.d, null, null, null, null, null), false));
        }
    }

    public final void d() {
        ka1 a = a();
        if (a == null) {
            return;
        }
        tnb tnbVar = (tnb) this.q.b.getValue();
        wjb wjbVar = wjb.BottomsheetScreen;
        tnb.d(tnbVar, wjbVar);
        c01 c01Var = this.c.E;
        zh1 zh1Var = this.e;
        zh1Var.getClass();
        c01Var.getClass();
        bi1 bi1Var = zh1Var.a;
        np2 np2Var = (np2) bi1Var.b;
        kxi kxiVar = (kxi) bi1Var.d;
        ia0 ia0Var = new ia0(c01Var, a, np2Var, kxiVar);
        pkb pkbVar = pkb.Artist;
        String str = c01Var.a;
        str.getClass();
        cvo cvoVar = cvo.i;
        qe3 qe3Var = new qe3(kxiVar, o6m.b(wjbVar, new avo(pkbVar, str), 2));
        sai saiVar = new sai(false);
        kkp kkpVar = new kkp(c01Var, ia0Var, qe3Var, saiVar);
        y supportFragmentManager = np2Var.getSupportFragmentManager();
        supportFragmentManager.getClass();
        e3s.X(o6m.b(wjb.EntityActionsScreen, new avo(pkbVar, ghh.P(c01Var).a), 2), supportFragmentManager, null, saiVar, null, new wn5(new ar(2, kkpVar, pd.t(new qzm[0])), 495402728, true), 52);
    }

    public final void e() {
        tnb.d((tnb) this.q.b.getValue(), wjb.SearchScreen);
        c01 c01Var = this.c.E;
        zh1 zh1Var = this.e;
        zh1Var.getClass();
        c01Var.getClass();
        np2 np2Var = (np2) zh1Var.a.b;
        int i = SearchActivity.Z;
        c0p x = rvf.x(np2Var.l().J());
        Intent intent = new Intent(np2Var, (Class<?>) SearchActivity.class);
        intent.putExtra("extra.for.entity.search", new k5p(c01Var, x));
        np2Var.startActivity(intent);
    }

    public final void f() {
        mj1 mj1Var = this.c;
        if (mj1Var.H == wh1.b) {
            return;
        }
        q43 a = this.q.a();
        g70 g70Var = g70.a;
        c70 c70Var = c70.a;
        a.a(new h70(g70Var));
        zh1 zh1Var = this.e;
        u51 u51Var = mj1Var.D;
        zh1Var.getClass();
        u51Var.getClass();
        bi1 bi1Var = zh1Var.a;
        y yVar = (y) bi1Var.c;
        np2 np2Var = (np2) bi1Var.b;
        oa1 oa1Var = new oa1(np2Var, 0);
        jfu viewModelStore = np2Var.getViewModelStore();
        l18 l18Var = l18.b;
        bdt I = hag.I(h1d.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        ovn.R(yVar, u51Var, oa1Var, viewModelStore, (h1d) qdcVar.C(I));
    }
}
