package defpackage;

import android.os.Parcelable;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class avq implements zuq {
    public final td3 a;
    public final int b;
    public final g2q c;
    public final sfm d;
    public final cq4 e;
    public final xdr f;

    public avq(td3 td3Var, int i, g2q g2qVar, sfm sfmVar, cq4 cq4Var) {
        pjc b0;
        td3Var.getClass();
        g2qVar.getClass();
        sfmVar.getClass();
        this.a = td3Var;
        this.b = i;
        this.c = g2qVar;
        this.d = sfmVar;
        this.e = cq4Var;
        this.f = ydr.a(Boolean.valueOf(((ntq) sfmVar.w(i, ern.a(ntq.class), new ntq(false)).getValue()).a));
        vd3 vd3Var = td3Var.c;
        String str = td3Var.b;
        int ordinal = vd3Var.ordinal();
        Continuation continuation = null;
        if (ordinal == 0) {
            rr5 t = q6k.t(str);
            if (t != null) {
                b0 = zsd.b0(new mpq(13, new bca(g2qVar.a.i, 18), t));
            }
            b0 = null;
        } else if (ordinal == 1) {
            b0 = g2qVar.c.d(str);
        } else if (ordinal == 2) {
            b0 = g2qVar.b.d(str);
        } else if (ordinal == 3) {
            c5u c5uVar = g2qVar.e;
            c5uVar.getClass();
            b0 = zsd.b0(new gu(new bca(c5uVar.g, 18), str, 2));
        } else {
            if (ordinal != 4) {
                b6e.s();
                throw null;
            }
            Parcelable.Creator<nvl> creator = nvl.CREATOR;
            nvl x = wxf.x(str);
            if (x != null) {
                b0 = g2qVar.d.d(x);
            }
            b0 = null;
        }
        if (b0 != null) {
            x97.y(cq4Var, null, null, new v5p(b0, this, continuation, 27), 3);
        }
    }

    @Override // defpackage.zuq
    public final void a() {
        boolean booleanValue = ((Boolean) this.f.getValue()).booleanValue();
        td3 td3Var = this.a;
        if ((booleanValue ? td3Var.e : td3Var.d).d) {
            b(!booleanValue);
            x97.y(this.e, null, null, new v5p(this, !booleanValue ? j1g.a : j1g.b, null, 28), 3);
        }
    }

    public final void b(boolean z) {
        v3w.n(z, this.f, null);
        this.d.P(this.b, ern.a(ntq.class), new ntq(z));
    }

    @Override // defpackage.zuq
    public final xdr c() {
        return this.f;
    }
}
