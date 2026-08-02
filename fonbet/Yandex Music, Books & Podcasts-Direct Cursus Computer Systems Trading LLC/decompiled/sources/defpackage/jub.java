package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes4.dex */
public final class jub {
    public final cvb a;
    public final til b;
    public final qnq c;
    public final e3h d;
    public final xil e;
    public final jrp f;
    public final Set g;
    public final xdr h;
    public final xdr i;
    public final fkn j;
    public final LinkedHashMap k;
    public boolean l;
    public final jyr m;
    public final fkn n;
    public final xdr o;
    public final jyr p;

    public jub(cvb cvbVar, til tilVar, qnq qnqVar, e3h e3hVar, xil xilVar, jrp jrpVar, Set set) {
        xilVar.getClass();
        jrpVar.getClass();
        set.getClass();
        this.a = cvbVar;
        this.b = tilVar;
        this.c = qnqVar;
        this.d = e3hVar;
        this.e = xilVar;
        this.f = jrpVar;
        this.g = set;
        xdr a = ydr.a(Boolean.FALSE);
        this.h = a;
        xdr a2 = ydr.a(ptb.a);
        this.i = a2;
        this.j = new fkn(a2);
        this.k = new LinkedHashMap();
        this.m = btf.b(new dub(this, 0));
        this.n = zsd.F0(new u21(10, cvbVar.d, a, new re7(this, null, 1)), qnqVar.c, new hdr(0L, Long.MAX_VALUE), mtb.e);
        this.o = cvbVar.e;
        this.p = btf.b(new dub(this, 1));
    }

    public final e6h a() {
        return new e6h(this.a.a, this.d, this.b, this.e.a(new lab(1, 1, 0, "LOCAL_PLAYER_MAIN_BLOCK", "local_player_main_block")));
    }

    public final hjl b() {
        return (hjl) this.m.getValue();
    }

    public final boolean c(v84 v84Var) {
        v84Var.getClass();
        r0.c(wjb.PultPickerScreen, (pkl) b().c.getValue());
        return ((jvo) this.b.e.getValue()).a(v84Var);
    }

    public final void d() {
        wxc wxcVar = this.d.g;
        wxcVar.a(false);
        xdr xdrVar = wxcVar.d;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        wxcVar.a(false);
        ptb ptbVar = ptb.a;
        xdr xdrVar2 = this.i;
        xdrVar2.getClass();
        xdrVar2.m(null, ptbVar);
        this.e.b();
        this.l = false;
    }

    public final void e(jxi jxiVar) {
        jxiVar.getClass();
        boolean z = jxiVar instanceof fxi;
        til tilVar = this.b;
        if (z) {
            r0.c(wjb.AlbumScreen, (pkl) b().c.getValue());
            String str = ((fxi) jxiVar).a;
            str.getClass();
            r20 r20Var = new r20(0);
            Uri m = ((s20) r20Var.a(String.format(((q20) r20Var.d).b, str), true)).m();
            m.getClass();
            tilVar.d(m);
            return;
        }
        if (jxiVar instanceof gxi) {
            r0.c(wjb.ArtistScreen, (pkl) b().c.getValue());
            String str2 = ((gxi) jxiVar).a;
            str2.getClass();
            jyr jyrVar = im1.i;
            tilVar.d(ff7.t(str2));
            return;
        }
        if (jxiVar instanceof hxi) {
            r0.c(wjb.PlaylistScreen, (pkl) b().c.getValue());
            nvl nvlVar = ((hxi) jxiVar).a;
            c4m c4mVar = c4m.YANDEXMUSIC;
            Uri m2 = ((d4m) new b30(c4mVar).a(String.format(c4mVar.b, nvlVar.a, nvlVar.b, Boolean.FALSE), true)).m();
            m2.getClass();
            tilVar.d(m2);
            return;
        }
        if (!(jxiVar instanceof ixi)) {
            b6e.s();
            return;
        }
        r0.c(wjb.AlbumScreen, (pkl) b().c.getValue());
        String str3 = ((ixi) jxiVar).a;
        str3.getClass();
        Uri m3 = new r20(d2t.c).c(str3).m();
        m3.getClass();
        tilVar.d(m3);
    }

    public final void f() {
        ajl ajlVar;
        zml zmlVar = (zml) this.a.d.a.getValue();
        if (zmlVar == null || (ajlVar = zmlVar.e) == null) {
            ajlVar = ajl.d;
        }
        this.e.e(ajlVar);
        this.l = true;
    }

    public final void g() {
        xdr xdrVar;
        Object value;
        ptb ptbVar;
        r0.c(wjb.QueueScreen, (pkl) b().c.getValue());
        do {
            xdrVar = this.i;
            value = xdrVar.getValue();
            int ordinal = ((ptb) value).ordinal();
            if (ordinal == 0) {
                ptbVar = ptb.b;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
                ptbVar = ptb.a;
            }
        } while (!xdrVar.k(value, ptbVar));
    }

    public final void h(orf orfVar) {
        yfg c;
        yfg c2;
        orfVar.getClass();
        jnl jnlVar = this.a.c;
        HashMap hashMap = jnlVar.j;
        Set set = orfVar.b;
        Set set2 = orfVar.c;
        Iterator it = wop.h(set, set2).iterator();
        while (it.hasNext()) {
            rnq rnqVar = (rnq) hashMap.get((String) it.next());
            if (rnqVar != null && (c2 = jnlVar.c(rnqVar)) != null) {
                c2.a();
            }
        }
        Iterator it2 = wop.h(set2, set).iterator();
        while (it2.hasNext()) {
            rnq rnqVar2 = (rnq) hashMap.get((String) it2.next());
            if (rnqVar2 != null && (c = jnlVar.c(rnqVar2)) != null) {
                c.cancel();
            }
        }
    }

    public final void i(boolean z) {
        v3w.n(z, this.a.c.l, null);
    }
}
