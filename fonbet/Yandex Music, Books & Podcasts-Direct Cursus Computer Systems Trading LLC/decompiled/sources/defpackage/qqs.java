package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class qqs {
    public final jyr a;
    public final wyb b;
    public final frt c;
    public final uvg d;

    public qqs(jyr jyrVar, wyb wybVar, frt frtVar, uvg uvgVar) {
        this.a = jyrVar;
        this.b = wybVar;
        this.c = frtVar;
        this.d = uvgVar;
    }

    public final yxc a() {
        zxc a = yrt.a((byc) this.c.d().getValue());
        if (a != null) {
            return a.a;
        }
        return null;
    }

    public final ia b(mwk mwkVar, boolean z) {
        drt drtVar;
        mwkVar.getClass();
        yxc a = a();
        if (a != null && (drtVar = a.a) != null && !drtVar.d) {
            return new fa(new IllegalStateException("User not authorized"));
        }
        ArrayList c = c(z);
        List h = u75.h(new fp4(0, this.b), new fp4(1, this.a));
        h.getClass();
        return (ia) dag.p(mwkVar, new nnd(18, c, h));
    }

    public final ArrayList c(boolean z) {
        final uvg uvgVar;
        ArrayList j = u75.j(new grs(), new czs(this.b));
        if (z && !((z66) this.a.getValue()).g() && (uvgVar = this.d) != null) {
            j.add(new rvs() { // from class: pqs
                @Override // defpackage.rvs
                public final ia a(mqs mqsVar) {
                    mqsVar.getClass();
                    return ((v8s) uvg.this.b).a(mqsVar) ? ea.a : new fa(new IllegalStateException("Track is not cached for offline playback"));
                }
            });
        }
        return j;
    }

    public final boolean d(u3q u3qVar, mwk mwkVar) {
        u3qVar.getClass();
        mwkVar.getClass();
        return ((Boolean) dag.p(mwkVar, new bs4(28))).booleanValue() && !((Boolean) ocg.k(u3qVar, new h4b(a()))).booleanValue();
    }
}
