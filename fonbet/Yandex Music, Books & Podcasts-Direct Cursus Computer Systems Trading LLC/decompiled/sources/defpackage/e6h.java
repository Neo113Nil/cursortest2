package defpackage;

import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardNonMusicContentCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardNonMusicContentCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e6h implements c6h {
    public final wjl a;
    public final e3h b;
    public final til c;
    public final hjl d;
    public final fkn e;
    public final fkn f;
    public final tc4 g;
    public final by7 h;
    public final osh i;

    public e6h(wjl wjlVar, e3h e3hVar, til tilVar, hjl hjlVar) {
        this.a = wjlVar;
        this.b = e3hVar;
        this.c = tilVar;
        this.d = hjlVar;
        this.e = wjlVar.e;
        this.f = e3hVar.j;
        this.g = e3hVar.f;
        this.h = sj2.q(wjlVar.d, hjlVar.c, new d6h(0));
        this.i = new osh(wjlVar, new dmg(7, this), hjlVar);
    }

    @Override // defpackage.c6h
    public final void a(w3h w3hVar) {
        w3hVar.getClass();
        e3h e3hVar = this.b;
        wjl wjlVar = e3hVar.d;
        long j = w3hVar.a;
        wxc wxcVar = e3hVar.g;
        if (!((Boolean) wxcVar.c.a.getValue()).booleanValue()) {
            wxcVar.a(true);
            return;
        }
        ((k1l) wjlVar.f.b).a(new SeekToPositionCommand(j), new b3t("core_seek"));
        wjlVar.b.a(new PlayCommand(false), new b3t("core_play"));
        e3hVar.e.a(Long.valueOf(j));
        c3h c3hVar = e3hVar.h;
        r2f b = c3hVar.d.b(c3h.e[0]);
        if (b != null) {
            b.g(null);
        }
        c3hVar.c.invoke(z2h.a);
    }

    @Override // defpackage.c6h
    public final void b(loa loaVar) {
        loaVar.getClass();
        e3h e3hVar = this.b;
        c3h c3hVar = e3hVar.h;
        c3hVar.getClass();
        if (!(loaVar instanceof joa)) {
            c3hVar.d.d(c3h.e[0], x97.y(c3hVar.a, null, null, new jmd(c3hVar, null, 22), 3));
        }
        c3hVar.c.invoke(z2h.b);
        e3hVar.g.a(true);
    }

    @Override // defpackage.c6h
    public final vdr c() {
        return this.e;
    }

    @Override // defpackage.c6h
    public final void d() {
        this.i.K();
    }

    @Override // defpackage.c6h
    public final void e() {
        n7q D;
        wjl wjlVar = this.a;
        n7q D2 = asq.D(wjlVar);
        mwk b = D2 != null ? D2.b() : null;
        if (b == null || (D = asq.D(wjlVar)) == null) {
            return;
        }
        int F = f8g.F(D);
        this.i.J(wjb.BottomsheetScreen);
        this.c.c(b, F);
    }

    @Override // defpackage.c6h
    public final void f() {
        this.i.L();
    }

    @Override // defpackage.c6h
    public final void g(g5l g5lVar) {
        g5lVar.getClass();
        int ordinal = g5lVar.ordinal();
        wjl wjlVar = this.a;
        osh oshVar = this.i;
        if (ordinal == 0) {
            osh.u(oshVar, sjb.Skip);
            wjlVar.b.a(new SkipCommand(), new b3t("queue_skip"));
        } else if (ordinal != 1) {
            b6e.s();
        } else {
            osh.u(oshVar, sjb.SeekForward);
            ((k1l) wjlVar.f.b).a(SeekForwardNonMusicContentCommand.INSTANCE, new b3t("core_seek"));
        }
    }

    @Override // defpackage.c6h
    public final vdr getState() {
        return this.h;
    }

    @Override // defpackage.c6h
    public final void h() {
        this.b.g.a(true);
    }

    @Override // defpackage.c6h
    public final void i(xur xurVar) {
        xurVar.getClass();
        this.i.N(xurVar);
    }

    @Override // defpackage.c6h
    public final void j() {
        oq oqVar;
        n7q D = asq.D(this.a);
        mwk b = D != null ? D.b() : null;
        mqs a = b != null ? b.a() : null;
        if (a == null || (oqVar = a.t) == null || !a.l()) {
            return;
        }
        this.c.b().v(oqVar, a);
    }

    @Override // defpackage.c6h
    public final void k() {
        g1h g1hVar;
        n7q n7qVar;
        mwk b;
        mqs a;
        String str;
        e3h e3hVar = this.b;
        tll tllVar = e3hVar.b;
        Object value = tllVar.f.a.getValue();
        Continuation continuation = null;
        wll wllVar = value instanceof wll ? (wll) value : null;
        if (wllVar == null || (g1hVar = wllVar.a) == null) {
            return;
        }
        g3h g3hVar = g1hVar.a;
        String str2 = g3hVar.a;
        d6l x = p6g.x((e6l) e3hVar.c.a.c.getValue());
        if (x == null || (n7qVar = x.a) == null || (b = n7qVar.b()) == null || (a = b.a()) == null || (str = a.a) == null || !Intrinsics.d(str2, str)) {
            return;
        }
        rr5 A = q6k.A(str2, g3hVar.b);
        if (A.equals(tllVar.g)) {
            return;
        }
        tllVar.g = A;
        x97.y(tllVar.c, null, null, new b5l(tllVar, g1hVar, continuation, 11), 3);
    }

    @Override // defpackage.c6h
    public final void l() {
        String title;
        wxk z = z();
        if (z == null || (title = z.getTitle()) == null) {
            return;
        }
        this.c.a(title, qil.a);
    }

    @Override // defpackage.c6h
    public final void m() {
        zwk zwkVar;
        j1g j1gVar;
        n7q n7qVar;
        sjb sjbVar;
        osh oshVar = this.i;
        cml G = oshVar.G();
        if (G != null) {
            int ordinal = G.b.a.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                sjbVar = sjb.Dislike;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                sjbVar = sjb.Undislike;
            }
            osh.u(oshVar, sjbVar);
        }
        l1g l1gVar = ((wjl) oshVar.a).c.a;
        d6l x = p6g.x((e6l) l1gVar.b.a.c.getValue());
        mwk b = (x == null || (n7qVar = x.a) == null) ? null : n7qVar.b();
        if (b == null || (zwkVar = (zwk) l1gVar.d.get(b)) == null) {
            return;
        }
        mwk mwkVar = zwkVar.b;
        kll kllVar = zwkVar.a;
        t3g t3gVar = kllVar.a;
        j1g j1gVar2 = zwkVar.c;
        if (j1gVar2 != null) {
            int ordinal2 = j1gVar2.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1) {
                mwkVar.getClass();
                t3gVar.a(mwkVar);
                fx fxVar = fx.b;
                gj gjVar = mwkVar.c().c;
                if (gjVar != null) {
                    gx gxVar = kllVar.b;
                    mqs a = mwkVar.a();
                    gxVar.a(fxVar, a != null ? a.a : null, gjVar);
                }
                j1gVar = j1g.c;
            } else if (ordinal2 != 2) {
                b6e.s();
                return;
            } else {
                mwkVar.getClass();
                t3gVar.z(mwkVar);
                j1gVar = j1g.b;
            }
            xdr xdrVar = zwkVar.d;
            xwk xwkVar = new xwk(j1gVar, System.currentTimeMillis());
            xdrVar.getClass();
            xdrVar.m(null, xwkVar);
        }
    }

    @Override // defpackage.c6h
    public final vdr n() {
        return this.f;
    }

    @Override // defpackage.c6h
    public final void o(b6h b6hVar) {
        mqs a;
        b6hVar.getClass();
        int ordinal = b6hVar.ordinal();
        wjl wjlVar = this.a;
        if (ordinal == 0) {
            this.i.r(sjb.SeekBackward, kmb.LongTap);
            wjlVar.b(o4l.b);
            return;
        }
        if (ordinal != 1) {
            b6e.s();
            return;
        }
        n7q D = asq.D(wjlVar);
        Continuation continuation = null;
        mwk b = D != null ? D.b() : null;
        if (b == null || (a = b.a()) == null || a4g.D(gys.UseSeekButtons, a)) {
            return;
        }
        t1f t1fVar = wjlVar.f;
        x97.y((tf6) t1fVar.c, null, null, new h1j(t1fVar, u1l.a, continuation, 28), 3);
    }

    @Override // defpackage.c6h
    public final void p() {
        CharSequence subtitle;
        String obj;
        wxk z = z();
        if (z == null || (subtitle = z.getSubtitle()) == null || (obj = subtitle.toString()) == null) {
            return;
        }
        this.c.a(obj, qil.b);
    }

    @Override // defpackage.c6h
    public final void q() {
        n7q D = asq.D(this.a);
        mwk b = D != null ? D.b() : null;
        if (b == null) {
            return;
        }
        this.i.J(wjb.ShareScreen);
        til tilVar = this.c;
        wyf.q(b, new t1f(24, new ykf(22, tilVar), new ufl(7), new s8i(18, tilVar)));
    }

    @Override // defpackage.c6h
    public final void r() {
        this.b.g.a(false);
    }

    @Override // defpackage.c6h
    public final void s(b6h b6hVar) {
        mqs a;
        b6hVar.getClass();
        int ordinal = b6hVar.ordinal();
        wjl wjlVar = this.a;
        if (ordinal == 0) {
            this.i.r(sjb.SeekForward, kmb.LongTap);
            wjlVar.b(o4l.a);
            return;
        }
        if (ordinal != 1) {
            b6e.s();
            return;
        }
        n7q D = asq.D(wjlVar);
        Continuation continuation = null;
        mwk b = D != null ? D.b() : null;
        if (b == null || (a = b.a()) == null || a4g.D(gys.UseSeekButtons, a)) {
            return;
        }
        t1f t1fVar = wjlVar.f;
        x97.y((tf6) t1fVar.c, null, null, new h1j(t1fVar, u1l.a, continuation, 28), 3);
    }

    @Override // defpackage.c6h
    public final void t(float f, rap rapVar) {
        rapVar.getClass();
        this.i.M(f, rapVar);
    }

    @Override // defpackage.c6h
    public final void u(boolean z, String str, z5h z5hVar) {
        str.getClass();
        if (z5hVar == null) {
            return;
        }
        this.d.e(z, str, z5hVar.b, 0, z5hVar.a, null);
    }

    @Override // defpackage.c6h
    public final pjc v() {
        return this.g;
    }

    @Override // defpackage.c6h
    public final void w() {
        wjb wjbVar;
        n7q D = asq.D(this.a);
        mwk b = D != null ? D.b() : null;
        mqs a = b != null ? b.a() : null;
        if (a == null || a.C()) {
            return;
        }
        List list = a.u;
        til tilVar = this.c;
        osh oshVar = this.i;
        if (list == null || !a.n()) {
            oq oqVar = a.t;
            if (oqVar == null || !a.l()) {
                return;
            }
            oshVar.J(wjb.PodcastScreen);
            tilVar.b().u(oqVar);
            return;
        }
        boolean z = list.size() > 1;
        if (z) {
            wjbVar = wjb.ArtistListScreen;
        } else {
            if (z) {
                b6e.s();
                return;
            }
            wjbVar = wjb.ArtistScreen;
        }
        oshVar.J(wjbVar);
        tilVar.b().y(list, hld.M(a.I()));
    }

    @Override // defpackage.c6h
    public final void x() {
        this.b.g.a(true);
    }

    @Override // defpackage.c6h
    public final void y(g5l g5lVar) {
        g5lVar.getClass();
        int ordinal = g5lVar.ordinal();
        wjl wjlVar = this.a;
        osh oshVar = this.i;
        if (ordinal == 0) {
            osh.u(oshVar, sjb.Backskip);
            wjlVar.a(false);
        } else if (ordinal != 1) {
            b6e.s();
        } else {
            osh.u(oshVar, sjb.SeekBackward);
            ((k1l) wjlVar.f.b).a(SeekBackwardNonMusicContentCommand.INSTANCE, new b3t("core_seek"));
        }
    }

    public final wxk z() {
        le5 le5Var;
        me5 me5Var = (me5) this.a.d.a.getValue();
        me5Var.getClass();
        if (me5Var.equals(ke5.a)) {
            le5Var = null;
        } else {
            if (!(me5Var instanceof le5)) {
                b6e.s();
                return null;
            }
            le5Var = (le5) me5Var;
        }
        if (le5Var != null) {
            return (wxk) le5Var.a.a.b.a;
        }
        return null;
    }
}
