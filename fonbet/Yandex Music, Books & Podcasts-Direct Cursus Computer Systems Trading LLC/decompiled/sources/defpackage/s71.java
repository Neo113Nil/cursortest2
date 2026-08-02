package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class s71 implements t71 {
    public final b81 a;
    public final u51 b;
    public final znk c;
    public final w61 d;
    public final kxi e;
    public final g0l f;
    public final ybf g;
    public final fkn h;
    public final kle i;

    public s71(b81 b81Var, u51 u51Var, znk znkVar, w61 w61Var, jfu jfuVar, kxi kxiVar, g0l g0lVar) {
        gle gleVar;
        mle mleVar;
        b81Var.getClass();
        u51Var.getClass();
        znkVar.getClass();
        w61Var.getClass();
        jfuVar.getClass();
        this.a = b81Var;
        this.b = u51Var;
        this.c = znkVar;
        this.d = w61Var;
        this.e = kxiVar;
        this.f = g0lVar;
        this.g = new ybf(ern.a(a81.class), new r71(jfuVar, 0), new vz(10, new z3(19, this)));
        this.h = i().o;
        jyr jyrVar = ogp.h;
        this.i = ((jyrVar == null || (gleVar = (gle) jyrVar.getValue()) == null || (mleVar = (mle) gleVar.b.getValue()) == null) ? mle.b : mleVar).d();
    }

    @Override // defpackage.t71
    public final void a() {
        Object value;
        Continuation continuation;
        a81 i = i();
        xdr xdrVar = i.n;
        do {
            value = xdrVar.getValue();
            continuation = null;
        } while (!xdrVar.k(value, v71.a((v71) value, null, null, true, 3)));
        x97.y(ot0.F(i), null, null, new z71(i, continuation, 2), 3);
    }

    @Override // defpackage.t71
    public final void b() {
        xzi xziVar = i().l;
        fkn fknVar = this.h;
        ki1 K = q6k.K(((v71) fknVar.a.getValue()).c().a);
        int b = ((v71) fknVar.a.getValue()).b();
        int r = q6k.r((v71) fknVar.a.getValue());
        boolean z = ((v71) fknVar.a.getValue()).c().a == this.a;
        xziVar.getClass();
        osh oshVar = (osh) xziVar.a;
        oshVar.getClass();
        nmb nmbVar = (nmb) oshVar.c;
        String G = ((fnb) oshVar.b).G();
        String str = (String) oshVar.a;
        alb a = K.a();
        nmbVar.getClass();
        str.getClass();
        G.getClass();
        LinkedHashMap m = dfi.m("artist_id", str, "hash", G);
        m.put("page_id", "main_screen");
        m.put("page_type", "landing");
        m.put("entity_type", "artist_familiar_tracks");
        eta.m(1, "entity_id", str, "entity_pos_x", m);
        ouj.y(1, m, "entity_pos_y", r, "objects_count");
        m.put("filter_key", "artist");
        eta.m(1, "filter_value", str, "filter_pos", m);
        eta.m(b + 1, "tab_id", a.a, "tab_pos", m);
        m.put("is_tab_selected_by_default", String.valueOf(z));
        m.put("_meta", nmb.u(1));
        nmbVar.C("Familiar.Tracks.Showed", m);
    }

    @Override // defpackage.t71
    public final void c() {
        ((g71) this.c.b).requireActivity().finish();
    }

    @Override // defpackage.t71
    public final kle d() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        r3 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r5 == (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r3 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        r3 = r3.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r2 = (defpackage.v71) r2.a.getValue();
        r2.getClass();
        r2 = r2.b.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r2.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        r5 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (((defpackage.e81) r5).a != r13) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        r5 = (defpackage.e81) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r5 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        if (r2 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        r2 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ad, code lost:
    
        if (r13 != r12.a) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r0.getClass();
        r0 = (defpackage.osh) r0.a;
        r3 = r3 + 1;
        r0.getClass();
        r7 = (defpackage.nmb) r0.c;
        r9 = ((defpackage.fnb) r0.b).G();
        r0 = (java.lang.String) r0.a;
        r1 = r1.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        if (r1 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d3, code lost:
    
        if (r1 != 1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        r1 = defpackage.zkb.MyWave;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00de, code lost:
    
        r7.getClass();
        r0.getClass();
        r9.getClass();
        r10 = new java.util.LinkedHashMap();
        r10.put("artist_id", r0);
        r10.put("hash", r9);
        r10.put("page_id", "main_screen");
        r10.put("page_type", "landing");
        r10.put("entity_type", "artist_familiar");
        defpackage.eta.m(1, "entity_id", r0, "entity_pos_x", r10);
        defpackage.ouj.y(1, r10, "entity_pos_y", r2, "objects_count");
        r10.put("filter_key", "artist");
        defpackage.eta.m(1, "filter_value", r0, "filter_pos", r10);
        defpackage.eta.m(r3, "tab_id", r1.a, "tab_pos", r10);
        r10.put("is_tab_selected_by_default", java.lang.String.valueOf(r5));
        r10.put("_meta", defpackage.nmb.u(1));
        r7.C("Familiar.Showed", r10);
        r0 = i().n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
    
        r1 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x015d, code lost:
    
        if (r0.k(r1, defpackage.v71.a((defpackage.v71) r1, r13, null, false, 6)) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        r1 = defpackage.zkb.Collection;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a9, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        if ((r5 instanceof defpackage.c81) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        r5 = (defpackage.c81) r5;
        r2 = java.lang.Integer.valueOf(r5.c.size() + r5.b.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if ((r5 instanceof defpackage.d81) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0096, code lost:
    
        r2 = java.lang.Integer.valueOf(((defpackage.d81) r5).b.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0160, code lost:
    
        defpackage.b6e.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0163, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0073, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
    
        r3 = 0;
     */
    @Override // defpackage.t71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(b81 b81Var) {
        xzi xziVar = i().l;
        ki1 K = q6k.K(b81Var);
        fkn fknVar = this.h;
        v71 v71Var = (v71) fknVar.a.getValue();
        v71Var.getClass();
        Iterator it = v71Var.b.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if (i < 0) {
                u75.n();
                throw null;
            }
            if (((e81) next).a == b81Var) {
                break;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.t71
    public final void f() {
        xzi xziVar = i().l;
        fkn fknVar = this.h;
        ki1 K = q6k.K(((v71) fknVar.a.getValue()).c().a);
        int b = ((v71) fknVar.a.getValue()).b();
        int q = q6k.q((v71) fknVar.a.getValue());
        boolean z = ((v71) fknVar.a.getValue()).c().a == this.a;
        xziVar.getClass();
        osh oshVar = (osh) xziVar.a;
        oshVar.getClass();
        nmb nmbVar = (nmb) oshVar.c;
        String G = ((fnb) oshVar.b).G();
        String str = (String) oshVar.a;
        alb a = K.a();
        nmbVar.getClass();
        str.getClass();
        G.getClass();
        LinkedHashMap m = dfi.m("artist_id", str, "hash", G);
        m.put("page_id", "main_screen");
        m.put("page_type", "landing");
        m.put("entity_type", "artist_familiar_albums");
        eta.m(1, "entity_id", str, "entity_pos_x", m);
        ouj.y(1, m, "entity_pos_y", q, "objects_count");
        m.put("filter_key", "artist");
        eta.m(1, "filter_value", str, "filter_pos", m);
        eta.m(b + 1, "tab_id", a.a, "tab_pos", m);
        m.put("is_tab_selected_by_default", String.valueOf(z));
        m.put("_meta", nmb.u(1));
        nmbVar.C("Familiar.Albums.Showed", m);
    }

    @Override // defpackage.t71
    public final bg5 g(mqs mqsVar, int i, ArrayList arrayList, kf1 kf1Var, Context context, mm6 mm6Var) {
        mqsVar.getClass();
        context.getClass();
        mm6Var.getClass();
        return up6.C(mm6Var, mqsVar, context, new q71(kf1Var, this, i, arrayList), false);
    }

    @Override // defpackage.t71
    public final fkn getState() {
        return this.h;
    }

    @Override // defpackage.t71
    public final bc5 h(oq oqVar, mm6 mm6Var) {
        mm6Var.getClass();
        String str = oqVar.a;
        xiu xiuVar = new xiu(6, this, oqVar);
        l18 l18Var = l18.b;
        bdt I = hag.I(zb5.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        zb5 zb5Var = (zb5) qdcVar.C(I);
        str.getClass();
        return new cc5(xiuVar, zb5Var, str, mm6Var);
    }

    public final a81 i() {
        return (a81) this.g.getValue();
    }
}
