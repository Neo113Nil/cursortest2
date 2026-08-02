package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;

/* loaded from: classes3.dex */
public final class j6i implements g6p, l0p, zzo, d5p {
    public final x3n a;
    public final j7i b;
    public final n3m c;
    public final z0j d;
    public final x3n e;
    public final kxi f;
    public final qwu g;
    public final k6l h;
    public final uwu i;
    public final fdj j;
    public final g8c k;
    public final y l;
    public final q0h m;
    public final x0h n;
    public final cvo o;
    public final tmb p;
    public final g0l q;
    public final n5p r;

    public j6i(x3n x3nVar, j7i j7iVar, n3m n3mVar, z0j z0jVar, x3n x3nVar2, kxi kxiVar, qwu qwuVar, k6l k6lVar, uwu uwuVar, fdj fdjVar, g8c g8cVar, y yVar, q0h q0hVar, x0h x0hVar, cvo cvoVar, tmb tmbVar, g0l g0lVar) {
        j7iVar.getClass();
        qwuVar.getClass();
        k6lVar.getClass();
        uwuVar.getClass();
        fdjVar.getClass();
        yVar.getClass();
        q0hVar.getClass();
        cvoVar.getClass();
        g0lVar.getClass();
        this.a = x3nVar;
        this.b = j7iVar;
        this.c = n3mVar;
        this.d = z0jVar;
        this.e = x3nVar2;
        this.f = kxiVar;
        this.g = qwuVar;
        this.h = k6lVar;
        this.i = uwuVar;
        this.j = fdjVar;
        this.k = g8cVar;
        this.l = yVar;
        this.m = q0hVar;
        this.n = x0hVar;
        this.o = cvoVar;
        this.p = tmbVar;
        this.q = g0lVar;
        this.r = (n5p) j7iVar.n.a;
    }

    public static boolean a(e4p e4pVar) {
        return e4pVar == e4p.d || e4pVar == e4p.c;
    }

    @Override // defpackage.g6p
    public final void A(x1u x1uVar, e4p e4pVar, int i) {
        x1uVar.getClass();
        A0(x1uVar, e4pVar);
    }

    @Override // defpackage.g6p
    public final void A0(x1u x1uVar, e4p e4pVar) {
        x1uVar.getClass();
        this.a.v0(x1uVar);
        int ordinal = e4pVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            this.b.o.P(new d1p(x1uVar.a), v5g.H(e4pVar));
        } else {
            if (ordinal == 3 || ordinal == 4) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.g6p
    public final void C(y7p y7pVar, int i, String str) {
        str.getClass();
        xdh xdhVar = this.b.p;
        xdhVar.getClass();
        if (y7pVar instanceof j7p) {
            jtc jtcVar = (jtc) xdhVar.c;
            j7p j7pVar = (j7p) y7pVar;
            String str2 = (String) jtcVar.b;
            if (str2 == null) {
                return;
            }
            sfm sfmVar = (sfm) jtcVar.a;
            nmb nmbVar = (nmb) sfmVar.b;
            String c = j7pVar.c();
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            nmb.j(nmbVar, G, wjbVar, null, null, null, null, null, ezf.S(j7pVar), c, 1, i + 1, "top", 1, true, "search_best_results", "SEARCH_BEST_RESULTS", 0, 1, "search_request:".concat(str2), str, 7536764);
            ((LinkedHashMap) sfmVar.c).remove(j7pVar.c());
        }
    }

    @Override // defpackage.l0p
    public final void C0(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
        this.c.C0(aabVar, e4pVar, i);
    }

    @Override // defpackage.g6p
    public final void D(oq oqVar, e4p e4pVar, int i) {
        oqVar.getClass();
        this.a.t0(oqVar);
        String str = oqVar.a;
        int ordinal = e4pVar.ordinal();
        j7i j7iVar = this.b;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = j7iVar.o;
            u0p u0pVar = new u0p(str);
            boolean H = v5g.H(e4pVar);
            nndVar.getClass();
            nndVar.N(u0pVar, t0p.b, H);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        ((grh) j7iVar.p.b).e(r0p.a, str, i);
    }

    @Override // defpackage.d5p
    public final pjc E(String str) {
        str.getClass();
        return this.e.E(str);
    }

    @Override // defpackage.d5p
    public final void F(kjm kjmVar, int i) {
        kjmVar.getClass();
        this.e.F(kjmVar, i);
    }

    @Override // defpackage.g6p
    public final void H(List list, int i) {
        list.getClass();
        jtc jtcVar = (jtc) this.b.p.c;
        String str = (String) jtcVar.b;
        if (str != null) {
            sfm sfmVar = (sfm) jtcVar.a;
            nmb nmbVar = (nmb) sfmVar.b;
            wjb wjbVar = wjb.BottomsheetScreen;
            List list2 = list;
            String X = CollectionsKt.X(list2, null, null, null, new i6o(24), 31);
            pkb pkbVar = pkb.Artist;
            int i2 = i + 1;
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar2 = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            int size = list.size();
            String concat = "search_request:".concat(str);
            String str2 = (String) ((LinkedHashMap) sfmVar.c).get(CollectionsKt.X(list2, null, null, null, new i6o(25), 31));
            if (str2 == null) {
                str2 = "";
            }
            nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, pkbVar, X, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i2, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : size, (2097152 & r60) != 0 ? "" : concat, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str2, "", "", (r60 & 268435456) != 0 ? "" : null);
        }
        this.a.x0(list, new dae(21, this, list));
    }

    @Override // defpackage.l0p
    public final void I(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
        this.c.I(aabVar, e4pVar, i);
    }

    @Override // defpackage.g6p
    public final void J(int i, e4p e4pVar, x1u x1uVar, boolean z) {
        x1uVar.getClass();
        String str = x1uVar.a;
        String g = f1d.g("search:", str);
        u5l b = this.p.a(new jab(qkb.Videoclips, 1, 1, 1), null).b(lsq.p(x1uVar, 0, i));
        icr icrVar = new icr(0);
        g0l.r(this.q, g, t75.c(x1uVar), wmn.c, this.f, b, icrVar, new dmg(15, this), 640);
        int ordinal = e4pVar.ordinal();
        j7i j7iVar = this.b;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = j7iVar.o;
            d1p d1pVar = new d1p(str);
            boolean H = v5g.H(e4pVar);
            nndVar.getClass();
            nndVar.N(d1pVar, t0p.b, H);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        if (z) {
            return;
        }
        ((grh) j7iVar.p.b).e(r0p.f, str, i);
    }

    @Override // defpackage.g6p
    public final void N(int i, e4p e4pVar, x1u x1uVar, boolean z) {
        boolean z2;
        x1uVar.getClass();
        j7i j7iVar = this.b;
        if (!z) {
            int ordinal = e4pVar.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                nnd nndVar = j7iVar.o;
                d1p d1pVar = new d1p(x1uVar.a);
                boolean H = v5g.H(e4pVar);
                nndVar.getClass();
                nndVar.N(d1pVar, t0p.c, H);
            } else if (ordinal != 3 && ordinal != 4) {
                b6e.s();
                return;
            }
        }
        jtc jtcVar = (jtc) j7iVar.p.c;
        String str = (String) jtcVar.b;
        if (str == null) {
            z2 = z;
        } else {
            z2 = z;
            ((sfm) jtcVar.a).y(str, x1uVar.a, pkb.Video, i, z2);
        }
        t3g t3gVar = (t3g) this.a.d;
        if (z2) {
            t3gVar.B(x1uVar);
        } else {
            t3gVar.u(x1uVar);
        }
    }

    @Override // defpackage.g6p
    public final g8c P() {
        return this.k;
    }

    @Override // defpackage.g6p
    public final boolean S(n7n n7nVar, int i, Function0 function0) {
        n7nVar.getClass();
        function0.getClass();
        ((h0h) this.b.p.d).a(n7nVar, i + 1);
        return this.n.a(this.l, this.f, function0);
    }

    @Override // defpackage.g6p
    public final void T(mqs mqsVar, e4p e4pVar) {
        mqsVar.getClass();
        boolean a = a(e4pVar);
        j7i j7iVar = this.b;
        if (a) {
            x97.y(ot0.F(j7iVar), null, null, new ckg(this, mqsVar, (Continuation) null, 5), 3);
        } else {
            this.a.z0(j7iVar.y, mqsVar);
        }
        int ordinal = e4pVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            j7iVar.o.P(new a1p(mqsVar.a), v5g.H(e4pVar));
        } else {
            if (ordinal == 3 || ordinal == 4) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.g6p
    public final void W(mqs mqsVar, e4p e4pVar) {
        mqsVar.getClass();
        boolean a = a(e4pVar);
        j7i j7iVar = this.b;
        if (a) {
            x97.y(ot0.F(j7iVar), null, null, new ckg(this, mqsVar, (Continuation) null, 5), 3);
        } else {
            this.a.z0(j7iVar.y, mqsVar);
        }
        int ordinal = e4pVar.ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            j7iVar.o.P(new b1p(mqsVar.a), v5g.H(e4pVar));
        } else {
            if (ordinal == 3 || ordinal == 4) {
                return;
            }
            b6e.s();
        }
    }

    @Override // defpackage.g6p
    public final void Y(p7p p7pVar, int i) {
        p7pVar.getClass();
        rmb rmbVar = (rmb) ((LinkedHashMap) ((grh) this.b.p.b).f).get(Integer.valueOf(i));
        if (rmbVar != null) {
            rmbVar.f(grh.f(p7pVar), null);
        }
    }

    @Override // defpackage.zzo
    public final boolean b() {
        return this.d.b;
    }

    @Override // defpackage.l0p
    public final pjc c(aab aabVar) {
        aabVar.getClass();
        return ((bbb) this.c.b).c(aabVar);
    }

    @Override // defpackage.g6p
    public final q0h c0() {
        return this.m;
    }

    @Override // defpackage.g6p
    public final kxi d() {
        return this.f;
    }

    @Override // defpackage.g6p
    public final cvo e() {
        return this.o;
    }

    @Override // defpackage.zzo
    public final void f(y6p y6pVar, int i) {
        y6pVar.getClass();
        this.d.f(y6pVar, i);
    }

    @Override // defpackage.g6p
    public final void f0(aab aabVar, e4p e4pVar, int i, boolean z) {
        aabVar.getClass();
        j7i j7iVar = this.b;
        if (!z) {
            int ordinal = e4pVar.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                nnd nndVar = j7iVar.o;
                pxm H = cb0.H(aabVar);
                boolean H2 = v5g.H(e4pVar);
                nndVar.getClass();
                nndVar.N(H, t0p.c, H2);
            } else if (ordinal != 3 && ordinal != 4) {
                b6e.s();
                return;
            }
        }
        jtc jtcVar = (jtc) j7iVar.p.c;
        String str = (String) jtcVar.b;
        if (str == null) {
            return;
        }
        ((sfm) jtcVar.a).y(str, aabVar.getId(), ezf.R(aabVar), i, z);
    }

    @Override // defpackage.g6p
    public final uwu g() {
        return this.i;
    }

    @Override // defpackage.l0p
    public final void g0(aab aabVar, e4p e4pVar, int i) {
        aabVar.getClass();
        e4pVar.getClass();
        this.c.g0(aabVar, e4pVar, i);
    }

    @Override // defpackage.g6p
    public final k6l h() {
        return this.h;
    }

    @Override // defpackage.g6p
    public final void i() {
        j7i j7iVar = this.b;
        j7iVar.getClass();
        x97.y(ot0.F(j7iVar), null, null, new k6i(j7iVar, null, 3), 3);
    }

    @Override // defpackage.g6p
    public final void i0(cvl cvlVar, e4p e4pVar, int i) {
        cvlVar.getClass();
        t tVar = (t) this.a.a;
        tVar.startActivity(ixf.E(tVar, cvlVar, null));
        int ordinal = e4pVar.ordinal();
        j7i j7iVar = this.b;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = j7iVar.o;
            y0p y0pVar = new y0p(cvlVar.e());
            boolean H = v5g.H(e4pVar);
            nndVar.getClass();
            nndVar.N(y0pVar, t0p.b, H);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        ((grh) j7iVar.p.b).e(r0p.c, cvlVar.e(), i);
    }

    @Override // defpackage.g6p
    public final void j(f7p f7pVar, int i) {
        f7pVar.getClass();
        jtc jtcVar = (jtc) this.b.p.c;
        String str = (String) jtcVar.b;
        if (str != null) {
            sfm sfmVar = (sfm) jtcVar.a;
            nmb nmbVar = (nmb) sfmVar.b;
            wjb wjbVar = wjb.TrailerScreen;
            String str2 = f7pVar.d;
            pkb S = ezf.S(f7pVar);
            int i2 = i + 1;
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar2 = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            String concat = "search_request:".concat(str);
            String str3 = (String) ((LinkedHashMap) sfmVar.c).get(f7pVar.d);
            if (str3 == null) {
                str3 = "";
            }
            nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, S, str2, (r60 & 2048) != 0 ? 0 : 1, (r60 & 4096) != 0 ? 0 : i2, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : "top", (r60 & 16384) != 0 ? 0 : 1, (32768 & r60) != 0 ? false : true, "search_best_results", "SEARCH_BEST_RESULTS", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 1, (2097152 & r60) != 0 ? "" : concat, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str3, "", "", (r60 & 268435456) != 0 ? "" : null);
        }
        this.a.B0(f7pVar.b.d());
    }

    @Override // defpackage.g6p
    public final void j0(mqs mqsVar, e4p e4pVar, int i) {
        mqsVar.getClass();
        W(mqsVar, e4pVar);
    }

    @Override // defpackage.g6p
    public final void k(mqs mqsVar, e4p e4pVar, int i) {
        mqsVar.getClass();
        W(mqsVar, e4pVar);
    }

    @Override // defpackage.g6p
    public final fdj k0() {
        return this.j;
    }

    public final void l(kzo kzoVar, mqs mqsVar, int i, String str, qls qlsVar) {
        j7i j7iVar = this.b;
        if (kzoVar != null) {
            int ordinal = qlsVar.ordinal();
            if (ordinal == 0) {
                jtc jtcVar = (jtc) j7iVar.p.c;
                mqs a = kzoVar.a();
                a.getClass();
                str.getClass();
                String str2 = (String) jtcVar.b;
                if (str2 == null) {
                    return;
                }
                sfm sfmVar = (sfm) jtcVar.a;
                String str3 = a.a;
                pkb T = ezf.T(a);
                String str4 = (String) ((LinkedHashMap) sfmVar.c).get(a.a);
                if (str4 == null) {
                    str4 = "";
                }
                sfmVar.K(str2, str3, T, i, str, str4);
                return;
            }
            if (ordinal == 1) {
                jtc jtcVar2 = (jtc) j7iVar.p.c;
                mqs a2 = kzoVar.a();
                a2.getClass();
                String str5 = (String) jtcVar2.b;
                if (str5 == null) {
                    return;
                }
                ((sfm) jtcVar2.a).C(str5, a2.a, ezf.T(a2), i, true);
                return;
            }
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            jtc jtcVar3 = (jtc) j7iVar.p.c;
            mqs a3 = kzoVar.a();
            a3.getClass();
            String str6 = (String) jtcVar3.b;
            if (str6 == null) {
                return;
            }
            ((sfm) jtcVar3.a).C(str6, a3.a, ezf.T(a3), i, false);
            return;
        }
        grh grhVar = (grh) j7iVar.p.b;
        r0p r0pVar = r0p.a;
        String str7 = mqsVar.a;
        str7.getClass();
        str.getClass();
        String str8 = (String) grhVar.i;
        if (str8 == null) {
            return;
        }
        Pair c = grhVar.c();
        n1p n1pVar = (n1p) c.a;
        int intValue = ((Number) c.b).intValue();
        tao taoVar = (tao) grhVar.d;
        if (n1pVar == null) {
            return;
        }
        cmb cmbVar = cmb.Artist;
        nmb nmbVar = (nmb) taoVar.d;
        amb t = tao.t(tao.d(n1pVar));
        String str9 = (String) taoVar.b;
        long b = ((zzp) taoVar.e).b();
        String G = ((fnb) taoVar.a).G();
        int i2 = i + 1;
        String str10 = n1pVar.a;
        boolean z = intValue == 0;
        nmbVar.getClass();
        str9.getClass();
        G.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eta.m(intValue, "filter_type", t.a, "filter_pos", linkedHashMap);
        linkedHashMap.put("req_id", str8);
        linkedHashMap.put("search_session_id", str9);
        linkedHashMap.put("event_timestamp", String.valueOf(b));
        linkedHashMap.put("page_id", "search_screen");
        eta.m(i2, "hash", G, "object_pos", linkedHashMap);
        linkedHashMap.put("object_type", "track");
        eta.m(1, "object_id", str7, "object_pos_x", linkedHashMap);
        k.u(i2, "object_pos_y", "tab_id", str10, linkedHashMap);
        linkedHashMap.put("tab_pos", String.valueOf(intValue));
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(z));
        linkedHashMap.put("playback_action_id", str);
        linkedHashMap.put("entity_type", "search");
        eta.m(1, "entity_id", "search", "entity_pos_x", linkedHashMap);
        k.u(1, "entity_pos_y", "page_type", "landing", linkedHashMap);
        dfi.p(5, "from", "search_screen", "_meta", linkedHashMap);
        nmbVar.C("Search.SearchResultItem.Started", linkedHashMap);
    }

    @Override // defpackage.g6p
    public final void n0(p7p p7pVar, int i, String str) {
        p7pVar.getClass();
        str.getClass();
        rmb rmbVar = (rmb) ((LinkedHashMap) ((grh) this.b.p.b).f).get(Integer.valueOf(i));
        if (rmbVar != null) {
            rmbVar.l(null, grh.f(p7pVar), str);
        }
    }

    @Override // defpackage.zzo
    public final void o(y6p y6pVar, int i) {
        y6pVar.getClass();
        this.d.o(y6pVar, i);
    }

    @Override // defpackage.zzo
    public final void p(k7p k7pVar, int i) {
        k7pVar.getClass();
        this.d.p(k7pVar, i);
    }

    @Override // defpackage.zzo
    public final void r(k7p k7pVar, int i) {
        k7pVar.getClass();
        this.d.r(k7pVar, i);
    }

    @Override // defpackage.g6p
    public final void s(s9p s9pVar) {
        e4p e4pVar = e4p.a;
        nnd nndVar = this.b.o;
        c1p c1pVar = new c1p(CollectionsKt.X(o8g.R(s9pVar), StringUtils.COMMA, null, null, null, 62));
        nndVar.getClass();
        nndVar.N(c1pVar, t0p.a, false);
    }

    @Override // defpackage.g6p
    public final void s0(kzo kzoVar, int i, boolean z, e4p e4pVar) {
        pxm b1pVar;
        kzoVar.getClass();
        j7i j7iVar = this.b;
        if (!z) {
            int ordinal = e4pVar.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                nnd nndVar = j7iVar.o;
                if (kzoVar instanceof x6p) {
                    b1pVar = new b1p(((x6p) kzoVar).b.a);
                } else if (kzoVar instanceof d7p) {
                    b1pVar = new a1p(((d7p) kzoVar).b.a);
                } else {
                    if (!(kzoVar instanceof f7p)) {
                        b6e.s();
                        return;
                    }
                    b1pVar = new b1p(((f7p) kzoVar).b.a);
                }
                boolean H = v5g.H(e4pVar);
                nndVar.getClass();
                nndVar.N(b1pVar, t0p.c, H);
            } else if (ordinal != 3 && ordinal != 4) {
                b6e.s();
                return;
            }
        }
        jtc jtcVar = (jtc) j7iVar.p.c;
        mqs a = kzoVar.a();
        a.getClass();
        String str = (String) jtcVar.b;
        if (str == null) {
            return;
        }
        ((sfm) jtcVar.a).y(str, a.a, ezf.T(a), i, z);
    }

    @Override // defpackage.g6p
    public final void u0(mqs mqsVar, e4p e4pVar, int i) {
        mqs mqsVar2;
        mqsVar.getClass();
        String t = weo.t();
        boolean a = a(e4pVar);
        j7i j7iVar = this.b;
        if (a) {
            mqsVar2 = mqsVar;
            x97.y(ot0.F(j7iVar), null, null, new y7b(this, mqsVar2, t, new rt5(this, mqsVar2, i, t, 1), (Continuation) null), 3);
        } else {
            mqsVar2 = mqsVar;
            l(null, mqsVar2, i, t, this.a.y0(j7iVar.y, mqsVar2, t));
        }
        int ordinal = e4pVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return;
            }
            b6e.s();
            return;
        }
        nnd nndVar = j7iVar.o;
        a1p a1pVar = new a1p(mqsVar2.a);
        boolean H = v5g.H(e4pVar);
        nndVar.getClass();
        nndVar.N(a1pVar, t0p.a, H);
    }

    @Override // defpackage.g6p
    public final void v(oq oqVar, e4p e4pVar, int i) {
        oqVar.getClass();
        this.a.t0(oqVar);
        String str = oqVar.a;
        int ordinal = e4pVar.ordinal();
        j7i j7iVar = this.b;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = j7iVar.o;
            z0p z0pVar = new z0p(str);
            boolean H = v5g.H(e4pVar);
            nndVar.getClass();
            nndVar.N(z0pVar, t0p.b, H);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        ((grh) j7iVar.p.b).e(r0p.e, str, i);
    }

    @Override // defpackage.g6p
    public final void w0(c01 c01Var, e4p e4pVar, int i) {
        c01Var.getClass();
        int i2 = ArtistScreenActivity.w0;
        t tVar = (t) this.a.a;
        tVar.startActivity(l48.o(tVar, c01Var, null, 24));
        String str = c01Var.a;
        int ordinal = e4pVar.ordinal();
        j7i j7iVar = this.b;
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            nnd nndVar = j7iVar.o;
            v0p v0pVar = new v0p(str);
            boolean H = v5g.H(e4pVar);
            nndVar.getClass();
            nndVar.N(v0pVar, t0p.b, H);
        } else if (ordinal != 3 && ordinal != 4) {
            b6e.s();
            return;
        }
        ((grh) j7iVar.p.b).e(r0p.d, str, i);
    }

    @Override // defpackage.g6p
    public final void x(mqs mqsVar, e4p e4pVar, int i, kzo kzoVar) {
        mqs mqsVar2;
        mqsVar.getClass();
        String t = weo.t();
        boolean a = a(e4pVar);
        j7i j7iVar = this.b;
        if (a) {
            mqsVar2 = mqsVar;
            x97.y(ot0.F(j7iVar), null, null, new y7b(this, mqsVar2, t, new i6i(this, kzoVar, mqsVar, i, t), (Continuation) null), 3);
        } else {
            mqsVar2 = mqsVar;
            l(kzoVar, mqsVar2, i, t, this.a.y0(j7iVar.y, mqsVar2, t));
        }
        int ordinal = e4pVar.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3 || ordinal == 4) {
                return;
            }
            b6e.s();
            return;
        }
        nnd nndVar = j7iVar.o;
        b1p b1pVar = new b1p(mqsVar2.a);
        boolean H = v5g.H(e4pVar);
        nndVar.getClass();
        nndVar.N(b1pVar, t0p.a, H);
    }

    @Override // defpackage.g6p
    public final qwu y() {
        return this.g;
    }

    @Override // defpackage.g6p
    public final void z(y7p y7pVar, int i, String str) {
        str.getClass();
        xdh xdhVar = this.b.p;
        xdhVar.getClass();
        if (y7pVar instanceof j7p) {
            jtc jtcVar = (jtc) xdhVar.c;
            j7p j7pVar = (j7p) y7pVar;
            String str2 = (String) jtcVar.b;
            if (str2 == null) {
                return;
            }
            sfm sfmVar = (sfm) jtcVar.a;
            ((LinkedHashMap) sfmVar.c).put(j7pVar.c(), str);
            nmb nmbVar = (nmb) sfmVar.b;
            String c = j7pVar.c();
            String G = ((fnb) sfmVar.a).G();
            wjb wjbVar = wjb.SearchScreen;
            qkb qkbVar = qkb.Carousel;
            nmb.p(nmbVar, G, wjbVar, null, null, null, null, null, ezf.S(j7pVar), c, 1, i + 1, "top", 1, true, "search_best_results", "SEARCH_BEST_RESULTS", 0, 1, "search_request:".concat(str2), null, null, 0, str, 7536764);
            return;
        }
        grh grhVar = (grh) xdhVar.b;
        String str3 = (String) grhVar.i;
        if (str3 == null || grhVar.a) {
            return;
        }
        grhVar.a = true;
        Pair c2 = grhVar.c();
        n1p n1pVar = (n1p) c2.a;
        int intValue = ((Number) c2.b).intValue();
        tao taoVar = (tao) grhVar.d;
        int i2 = grhVar.c;
        nmb nmbVar2 = (nmb) taoVar.d;
        amb t = tao.t(tao.d(n1pVar));
        String str4 = (String) taoVar.b;
        long b = ((zzp) taoVar.e).b();
        mkb k = tao.k((c0p) taoVar.c);
        String G2 = ((fnb) taoVar.a).G();
        nmbVar2.getClass();
        str4.getClass();
        G2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        eta.m(intValue, "filter_type", t.a, "filter_pos", linkedHashMap);
        linkedHashMap.put("req_id", str3);
        linkedHashMap.put("search_session_id", str4);
        linkedHashMap.put("event_timestamp", String.valueOf(b));
        linkedHashMap.put("page_id", k.a);
        linkedHashMap.put("hash", G2);
        eta.m(i2, "page_type", "landing", "input_size", linkedHashMap);
        linkedHashMap.put("_meta", nmb.u(2));
        nmbVar2.C("Search.SearchResultPage.Showed", linkedHashMap);
    }
}
