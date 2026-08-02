package defpackage;

import ru.yandex.music.common.media.context.CardPlaybackScope;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes4.dex */
public final class zg6 {
    public final oh6 a;
    public final mmo b;
    public final g0l c;
    public final kxi d;
    public final rmb e;
    public final fp5 f;
    public final cp5 g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final x0q k;

    public zg6(oh6 oh6Var, mmo mmoVar, g0l g0lVar, kxi kxiVar, rmb rmbVar, fp5 fp5Var, cp5 cp5Var) {
        this.a = oh6Var;
        this.b = mmoVar;
        this.c = g0lVar;
        this.d = kxiVar;
        this.e = rmbVar;
        this.f = fp5Var;
        this.g = cp5Var;
        this.h = oh6Var.s;
        this.i = oh6Var.t;
        this.j = oh6Var.u;
        this.k = oh6Var.v;
    }

    public final void a() {
        mqs mqsVar;
        mmo mmoVar = this.b;
        kxi kxiVar = (kxi) mmoVar.e;
        qnq qnqVar = (qnq) mmoVar.b;
        oh6 oh6Var = this.a;
        xh6 xh6Var = (xh6) oh6Var.r.getValue();
        if (xh6Var instanceof sh6) {
            sh6 sh6Var = (sh6) xh6Var;
            oq oqVar = sh6Var.a;
            if (!u2x.J(oqVar) || (mqsVar = sh6Var.b) == null) {
                rre.Y(lxe.B(oqVar), qnqVar.a, (hn5) mmoVar.g, kxiVar, (CardPlaybackScope) mmoVar.f, oqVar, true);
            } else {
                mmoVar.X0(mqsVar, sh6Var);
            }
        } else if (xh6Var instanceof uh6) {
            uh6 uh6Var = (uh6) xh6Var;
            mmoVar.X0(uh6Var.b, uh6Var);
        } else if (xh6Var instanceof vh6) {
            k10 k10Var = ((vh6) xh6Var).a;
            k10Var.getClass();
            rre.Y(new lt(k10Var.a, k10Var.d(), k10Var.d, WarningContent.NONE, null, null), qnqVar.a, (hn5) mmoVar.g, kxiVar, (CardPlaybackScope) mmoVar.f, null, true);
        } else if (xh6Var instanceof wh6) {
            wh6 wh6Var = (wh6) xh6Var;
            mmoVar.X0(wh6Var.a, wh6Var);
        } else if (!(xh6Var instanceof th6) && xh6Var != null) {
            b6e.s();
            return;
        }
        oh6Var.c.t(bi6.c, null);
    }

    public final void b(bi6 bi6Var, boolean z, String str) {
        str.getClass();
        g06 g06Var = this.a.c;
        q43 q43Var = (q43) g06Var.a;
        int ordinal = bi6Var.ordinal();
        if (ordinal == 0) {
            d70 d70Var = (d70) g06Var.b;
            if (d70Var != null) {
                q43Var.h(g06.a0(d70Var, str), z);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            d70 d70Var2 = (d70) g06Var.c;
            if (d70Var2 != null) {
                q43Var.h(g06.a0(d70Var2, str), z);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            b6e.s();
            return;
        }
        d70 d70Var3 = (d70) g06Var.d;
        if (d70Var3 != null) {
            q43Var.h(g06.a0(d70Var3, str), z);
        }
    }
}
