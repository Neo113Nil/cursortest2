package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.universalentity.UniversalEntityActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public final class k5j implements i5j {
    public final w4j a;
    public final cr b;
    public final g0l c;
    public final kxi d;
    public final rmb e;
    public final s8i f;
    public final u5i g;
    public final xdr h;

    public k5j(w4j w4jVar, cr crVar, qyf qyfVar, g0l g0lVar, kxi kxiVar, rmb rmbVar, s8i s8iVar, u5i u5iVar) {
        qyfVar.getClass();
        kxiVar.getClass();
        this.a = w4jVar;
        this.b = crVar;
        this.c = g0lVar;
        this.d = kxiVar;
        this.e = rmbVar;
        this.f = s8iVar;
        this.g = u5iVar;
        this.h = w4jVar.k;
    }

    @Override // defpackage.i5j
    public final xdr a() {
        return this.a.d.c;
    }

    @Override // defpackage.i5j
    public final void b(boolean z, lt ltVar, int i, String str) {
        str.getClass();
        this.a.f.h(ox6.M(ltVar, i, str), z);
    }

    @Override // defpackage.i5j
    public final void c() {
        String a;
        w4j w4jVar = this.a;
        o43 o43Var = w4jVar.j.f;
        if (o43Var == null || (a = o43Var.a()) == null) {
            return;
        }
        int i = UniversalEntityActivity.Y;
        boolean b = new lim(ekt.YANDEXMUSIC).b(a);
        Context context = (Context) this.b.b;
        if (b) {
            context.startActivity(wxf.A(context, a));
        } else {
            w1g.y(context, a, true);
        }
        w4jVar.f.d(-1, -1, a);
    }

    @Override // defpackage.i5j
    public final void d(lt ltVar, int i) {
        String t = weo.t();
        if (((Boolean) this.g.invoke()).booleanValue()) {
            g0l.g(this.c, ltVar.a, hcr.a, this.d, this.e.b(c3x.w(ltVar, i, 0)), "mobile-home-discovery_block-newreleases-default", null, null, null, null, this.f, 992);
            return;
        }
        this.a.f.g(ox6.M(ltVar, i, ""), t);
        cr crVar = this.b;
        jyr jyrVar = (jyr) crVar.f;
        if (((z5l) jyrVar.getValue()).b(ltVar.a)) {
            ((z5l) jyrVar.getValue()).i(false);
        } else {
            x97.y((mm6) crVar.e, null, null, new rlg(crVar, ltVar, t, null, 13), 3);
        }
    }

    @Override // defpackage.i5j
    public final bc5 e(lt ltVar, Function0 function0, hq5 hq5Var, int i) {
        bc5 bc5Var;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(1832829441);
        aqi o0 = szf.o0(function0, oq5Var);
        String str = ltVar.a;
        boolean f = oq5Var.f(str);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (f || K == obj) {
            K = new j5j(o0);
            oq5Var.k0(K);
        }
        j5j j5jVar = (j5j) K;
        zb5 zb5Var = this.a.i;
        str.getClass();
        j5jVar.getClass();
        zb5Var.getClass();
        oq5Var.Z(-1216043209);
        if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            bc5Var = arm.a;
            oq5Var.p(false);
        } else {
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            boolean f2 = oq5Var.f(str) | oq5Var.f(j5jVar);
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj) {
                K3 = new cc5(j5jVar, zb5Var, str, mm6Var);
                oq5Var.k0(K3);
            }
            bc5Var = (bc5) K3;
            oq5Var.p(false);
        }
        oq5Var.p(false);
        return bc5Var;
    }

    @Override // defpackage.i5j
    public final void f(lt ltVar, int i) {
        this.a.f.e(ox6.M(ltVar, i, ""), null);
        cr crVar = this.b;
        Context context = (Context) crVar.b;
        y7g.O(context, quj.V(context, ltVar, d.p((nrf) crVar.h)));
    }

    @Override // defpackage.i5j
    public final xdr g() {
        return this.h;
    }

    @Override // defpackage.i5j
    public final void h(lt ltVar, int i) {
        q43 q43Var = this.a.f;
        d70 M = ox6.M(ltVar, i, "");
        q43Var.getClass();
        b70 b70Var = q43Var.c;
        if (b70Var != null) {
            q43Var.b.a(b70Var, M, m70.a);
        }
        cr crVar = this.b;
        Context context = (Context) crVar.b;
        hq0 hq0Var = context instanceof hq0 ? (hq0) context : null;
        if (hq0Var == null) {
            dfi.r("Expected activity as context, cannot show TrailerBottomSheetDialog, see MUSICANDROID-31303", "NewReleasesNavigationImpl");
            return;
        }
        y supportFragmentManager = hq0Var.getSupportFragmentManager();
        supportFragmentManager.getClass();
        i5l i5lVar = l5t.a;
        Album$AlbumType album$AlbumType = ltVar.b;
        i5lVar.getClass();
        mvn.T(supportFragmentManager, i5l.b(album$AlbumType), ltVar.a, false, (kxi) crVar.d, null);
    }

    @Override // defpackage.i5j
    public final void i(l5j l5jVar) {
        l5jVar.getClass();
        cr crVar = this.b;
        y yVar = (y) crVar.c;
        List list = l5jVar.b;
        int size = list.size();
        if (size == 0) {
            dfi.r("new releases artists size = 0", "NewReleasesNavigationImpl");
        } else if (size != 1) {
            pd.U(list, new e5j(crVar, 1), hld.N(l5jVar.c.b), yVar, pd.t(new qzm[0]));
        } else {
            szf.R(yVar, new qvg(g0g.F((u51) CollectionsKt.Q(list), false)), d.p((nrf) crVar.h));
        }
    }

    @Override // defpackage.i5j
    public final void j(l5j l5jVar, int i) {
        l5jVar.getClass();
        List list = l5jVar.b;
        int i2 = 0;
        if (list.size() == 1) {
            this.a.f.e(ox6.M((aab) list.get(0), i, ""), null);
        }
        cr crVar = this.b;
        Context context = (Context) crVar.b;
        if (list.size() != 1) {
            pd.U(list, new e5j(crVar, i2), hld.N(l5jVar.c.b), (y) crVar.c, pd.t(new qzm[0]));
            return;
        }
        u51 u51Var = (u51) CollectionsKt.Q(list);
        int i3 = ArtistScreenActivity.w0;
        y7g.O(context, l48.p(context, u51Var, d.p((nrf) crVar.h), null, 24));
    }

    @Override // defpackage.i5j
    public final void k(l5j l5jVar) {
        l5jVar.getClass();
        lwg D = g0g.D(l5jVar.c, l5jVar.b, l5jVar.k);
        cr crVar = this.b;
        szf.R((y) crVar.c, new qvg(D), d.p((nrf) crVar.h));
    }
}
