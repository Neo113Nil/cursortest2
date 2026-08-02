package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes4.dex */
public final class iwm {
    public final nwm a;
    public final sfm b;
    public final rmb c;
    public final rdk d;
    public final zb5 e;
    public final mx f;
    public final kxi g;
    public final g0l h;
    public final hvl i;
    public final fkn j;

    public iwm(nwm nwmVar, sfm sfmVar, rmb rmbVar, rdk rdkVar, zb5 zb5Var, mx mxVar, kxi kxiVar, g0l g0lVar, hvl hvlVar) {
        rmbVar.getClass();
        mxVar.getClass();
        kxiVar.getClass();
        this.a = nwmVar;
        this.b = sfmVar;
        this.c = rmbVar;
        this.d = rdkVar;
        this.e = zb5Var;
        this.f = mxVar;
        this.g = kxiVar;
        this.h = g0lVar;
        this.i = hvlVar;
        this.j = nwmVar.l;
    }

    public final cc5 a(tw twVar, mm6 mm6Var) {
        twVar.getClass();
        String str = twVar.a.a.a;
        j6e j6eVar = new j6e(this, twVar);
        str.getClass();
        return new cc5(j6eVar, this.e, str, mm6Var);
    }

    public final void b(diu diuVar) {
        nwm nwmVar = this.a;
        bx bxVar = (bx) nwmVar.j.getValue();
        fwm fwmVar = nwmVar.h;
        String str = fwmVar.b.a;
        men.G(fwmVar.a);
        bxVar.getClass();
        str.getClass();
        xdr xdrVar = bxVar.c;
        Object value = xdrVar.getValue();
        yw ywVar = value instanceof yw ? (yw) value : null;
        if (ywVar != null) {
            xdrVar.m(null, new xw(ywVar.a));
        }
        String str2 = diuVar.a;
        mx mxVar = this.f;
        mxVar.getClass();
        mxVar.a(str2);
    }

    public final void c(tw twVar) {
        twVar.getClass();
        ow owVar = twVar.a;
        thj w = c3x.w(owVar.a, 0, 0);
        lt ltVar = owVar.a;
        lxm lxmVar = owVar.g;
        if (lxmVar != null) {
            String str = lxmVar.a;
            mx mxVar = this.f;
            mxVar.getClass();
            mxVar.a(str);
        }
        if (((Boolean) this.i.invoke()).booleanValue()) {
            g0l.g(this.h, ltVar.a, hcr.a, this.g, this.c.b(w), "mobile-promo-album-default", null, null, null, null, null, 2016);
            return;
        }
        String t = weo.t();
        rdk rdkVar = this.d;
        jyr jyrVar = (jyr) rdkVar.d;
        cte cteVar = new cte(17, this, t, w);
        kxi kxiVar = this.g;
        kxiVar.getClass();
        t.getClass();
        if (!((z5l) jyrVar.getValue()).b(ltVar.a)) {
            x97.y((mm6) rdkVar.f, null, null, new ov(kxiVar, t, owVar, rdkVar, cteVar, (Continuation) null, 1), 3);
        } else if (((z5l) jyrVar.getValue()).i(false)) {
            cteVar.invoke();
        }
    }

    public final void d(tw twVar) {
        twVar.getClass();
        wjb wjbVar = wjb.TrailerScreen;
        ow owVar = twVar.a;
        rmb.j(this.c, wjbVar, c3x.w(owVar.a, 0, 0), null, 12);
        lt ltVar = owVar.a;
        sfm sfmVar = this.b;
        Context context = (Context) sfmVar.a;
        hq0 hq0Var = context instanceof hq0 ? (hq0) context : null;
        if (hq0Var == null) {
            dfi.r("Expected activity as context, cannot show TrailerBottomSheetDialog, see MUSICANDROID-31303", "PromoBlockNavigationImpl");
        } else {
            y supportFragmentManager = hq0Var.getSupportFragmentManager();
            supportFragmentManager.getClass();
            i5l i5lVar = l5t.a;
            Album$AlbumType album$AlbumType = ltVar.b;
            i5lVar.getClass();
            mvn.T(supportFragmentManager, i5l.b(album$AlbumType), ltVar.a, false, (kxi) sfmVar.b, qwp.q0(owVar.f));
        }
        lxm lxmVar = owVar.g;
        if (lxmVar != null) {
            String str = lxmVar.a;
            mx mxVar = this.f;
            mxVar.getClass();
            mxVar.a(str);
        }
    }
}
