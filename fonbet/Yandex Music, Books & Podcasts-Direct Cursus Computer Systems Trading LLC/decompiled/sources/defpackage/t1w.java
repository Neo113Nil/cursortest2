package defpackage;

import com.connectsdk.discovery.provider.ssdp.Argument;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.api.commands.VolumeUnmuteCommand;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1w extends l1w {
    public final xdr A;
    public final fkn B;
    public final vdr C;
    public final u0w k;
    public final syv l;
    public final m2w m;
    public final boolean n;
    public final t2w o;
    public final boolean p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final xdr w;
    public final j0q x;
    public final j0q y;
    public final tc4 z;

    public t1w(u0w u0wVar, syv syvVar, m2w m2wVar, z66 z66Var, boolean z, t2w t2wVar, boolean z2, jyr jyrVar, jyr jyrVar2, mxv mxvVar, j3w j3wVar, i3w i3wVar, fi1 fi1Var, kxi kxiVar) {
        m2wVar.getClass();
        t2wVar.getClass();
        mxvVar.getClass();
        j3wVar.getClass();
        i3wVar.getClass();
        this.k = u0wVar;
        this.l = syvVar;
        this.m = m2wVar;
        this.n = z;
        this.o = t2wVar;
        this.p = true;
        this.q = jyrVar;
        this.r = jyrVar2;
        this.s = btf.b(new hav(9, mxvVar, this));
        this.t = btf.b(new hav(10, j3wVar, this));
        this.u = btf.b(new ftr(19, i3wVar, this, kxiVar));
        int i = 11;
        this.v = btf.b(new hav(i, kxiVar, fi1Var));
        xdr a = ydr.a(z2 ? e1w.a : d1w.a);
        this.w = a;
        j0q j0qVar = new j0q();
        this.x = j0qVar;
        j0q j0qVar2 = new j0q();
        this.y = j0qVar2;
        this.z = zsd.u0(j0qVar2, ox6.K(j0qVar, 5000L));
        xdr a2 = ydr.a(new y0w());
        this.A = a2;
        this.B = zsd.F0(zsd.Q(a2, ((a3w) q0()).j, new e7v(((wb7) m2wVar.a.getValue()).getData(), 12), new ev6(this, null, 2)), ot0.F(this), lbq.a, new vyv(true));
        vdr a0 = sk3.a0(ot0.F(this), new l8v(r0().e, this, 5));
        this.C = a0;
        p0w K = K();
        nmb a3 = K.a();
        String j = k5r.j(K, a3);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a3.C("Wizard.Opened", m);
        ox6.B(zsd.b0(new e7v(a0, i)), ot0.F(this), new p1w(this, 0));
        ox6.B(z66Var.c(), ot0.F(this), new p1w(this, 1));
        ox6.B(r0().f, ot0.F(this), new p1w(this, 2));
        ox6.B(a, ot0.F(this), new p1w(this, 3));
        t0(null, z2);
    }

    public static boolean s0(zzv zzvVar, String str) {
        String str2 = null;
        yzv yzvVar = zzvVar instanceof yzv ? (yzv) zzvVar : null;
        if (yzvVar != null) {
            if (!Intrinsics.d(yzvVar.b, str)) {
                yzvVar = null;
            }
            if (yzvVar != null) {
                str2 = yzvVar.f;
            }
        }
        return str2 != null;
    }

    @Override // defpackage.l1w
    public final void G() {
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, d1w.a);
    }

    @Override // defpackage.l1w
    public final void H() {
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, d1w.a);
    }

    @Override // defpackage.l1w
    public final void J() {
        y1w y1wVar = (y1w) this.t.getValue();
        rar rarVar = y1wVar.d;
        if (rarVar != null) {
            rarVar.g(null);
        }
        y1wVar.d = null;
        y1wVar.f.l(null);
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, d1w.a);
    }

    @Override // defpackage.l1w
    public final p0w K() {
        return (p0w) this.v.getValue();
    }

    @Override // defpackage.l1w
    public final Function0 L() {
        return this.k;
    }

    @Override // defpackage.l1w
    public final pjc M() {
        return this.z;
    }

    @Override // defpackage.l1w
    public final vdr N() {
        return sk3.a0(ot0.F(this), new u21(22, r0().e, this, ((s2w) r0().e.getValue()).b));
    }

    @Override // defpackage.l1w
    public final syv O() {
        return this.l;
    }

    @Override // defpackage.l1w
    public final fkn P() {
        return this.B;
    }

    @Override // defpackage.l1w
    public final bqi R() {
        return this.w;
    }

    @Override // defpackage.l1w
    public final szv S() {
        ArrayList g0;
        s2w s2wVar = (s2w) r0().e.getValue();
        this.o.getClass();
        s2wVar.getClass();
        Collection values = s2wVar.b.values();
        if (values.size() >= 25) {
            List j0 = CollectionsKt.j0(CollectionsKt.q0(values, 25));
            g0 = new ArrayList(v75.o(j0, 10));
            Iterator it = j0.iterator();
            while (it.hasNext()) {
                g0.add(t2w.a((xrv) it.next()));
            }
        } else {
            List w0 = CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(values, s2wVar.c)));
            if (w0.size() >= 25) {
                List q0 = CollectionsKt.q0(w0, 25);
                g0 = new ArrayList(v75.o(q0, 10));
                Iterator it2 = q0.iterator();
                while (it2.hasNext()) {
                    g0.add(t2w.a((xrv) it2.next()));
                }
            } else {
                List w02 = CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(w0, s2wVar.a())));
                if (w02.size() > 6) {
                    List q02 = CollectionsKt.q0(w02, 25);
                    g0 = new ArrayList(v75.o(q02, 10));
                    Iterator it3 = q02.iterator();
                    while (it3.hasNext()) {
                        g0.add(t2w.a((xrv) it3.next()));
                    }
                } else {
                    List list = w02;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(t2w.a((xrv) it4.next()));
                    }
                    int size = 6 - w02.size();
                    ArrayList arrayList2 = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        ctv.a.getClass();
                        arrayList2.add(btv.b);
                    }
                    g0 = CollectionsKt.g0(arrayList, arrayList2);
                }
            }
        }
        return new szv(g0);
    }

    @Override // defpackage.l1w
    public final fkn T() {
        return ((y1w) this.t.getValue()).g;
    }

    @Override // defpackage.l1w
    public final vdr U() {
        return this.C;
    }

    @Override // defpackage.l1w
    public final void V() {
        x97.y(ot0.F(this), null, null, new r1w(this, null, 0), 3);
    }

    @Override // defpackage.l1w
    public final void W(jtv jtvVar) {
        xdr xdrVar;
        Object value;
        a1w a1wVar;
        mmb mmbVar;
        int i = jtvVar.b;
        int i2 = jtvVar.a;
        do {
            xdrVar = this.A;
            value = xdrVar.getValue();
            a1wVar = (a1w) value;
            if (a1wVar instanceof z0w) {
                yrv p0 = p0(jtvVar);
                z0w z0wVar = new z0w(jtvVar);
                if (p0 != null) {
                    String str = p0.a;
                    ((a3w) q0()).a(str);
                    K().d(str, p0.c);
                    jtv jtvVar2 = ((z0w) a1wVar).a;
                    yrv p02 = p0(jtvVar2);
                    if (p02 != null) {
                        String str2 = p02.a;
                        int i3 = i2 - jtvVar2.a;
                        int i4 = i - jtvVar2.b;
                        lzv lzvVar = i3 > 0 ? lzv.d : i3 < 0 ? lzv.c : i4 > 0 ? lzv.b : i4 < 0 ? lzv.a : null;
                        if (lzvVar != null) {
                            p0w K = K();
                            String str3 = p02.c;
                            boolean s0 = s0((zzv) ((a3w) q0()).j.getValue(), str2);
                            K.getClass();
                            nmb a = K.a();
                            String b = K.b();
                            int ordinal = lzvVar.ordinal();
                            if (ordinal == 0) {
                                mmbVar = mmb.Up;
                            } else if (ordinal == 1) {
                                mmbVar = mmb.Down;
                            } else if (ordinal == 2) {
                                mmbVar = mmb.Left;
                            } else {
                                if (ordinal != 3) {
                                    b6e.s();
                                    return;
                                }
                                mmbVar = mmb.Right;
                            }
                            a.getClass();
                            b.getClass();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("page_type", "landing");
                            linkedHashMap.put("page_id", "wizard");
                            linkedHashMap.put("hash", b);
                            linkedHashMap.put("artist_id", str2);
                            eta.u(linkedHashMap, "artist_name", str3, s0, "with_videoshot");
                            dfi.p(1, Argument.TAG_DIRECTION, mmbVar.a, "_meta", linkedHashMap);
                            a.C("Wizard.OneToOne.Scrolled", linkedHashMap);
                        }
                    }
                }
                a1wVar = z0wVar;
            } else if (!(a1wVar instanceof y0w)) {
                b6e.s();
                return;
            }
        } while (!xdrVar.k(value, a1wVar));
        auv r0 = r0();
        wrv wrvVar = new wrv(i2, i);
        r0.getClass();
        rar rarVar = r0.h;
        if (rarVar != null) {
            rarVar.g(null);
        }
        r0.h = x97.y(r0.c, dm6.b, null, new nw1(r0, wrvVar, null), 2);
    }

    @Override // defpackage.l1w
    public final void X() {
        p0w K = K();
        nmb a = K.a();
        String j = k5r.j(K, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        dfi.p(1, "hash", j, "_meta", m);
        a.C("Wizard.Closed", m);
        v2w v2wVar = (v2w) this.q.getValue();
        x97.y(v2wVar.b, null, null, new u2w(v2wVar, null, 0), 3).R(new m1w(this, 1));
        o0(q0w.c);
    }

    @Override // defpackage.l1w
    public final void Y() {
        K().c();
        v2w v2wVar = (v2w) this.q.getValue();
        x97.y(v2wVar.b, null, null, new u2w(v2wVar, null, 1), 3).R(new m1w(this, 0));
        o0(q0w.c);
    }

    @Override // defpackage.l1w
    public final void Z(String str) {
        t0(str, false);
    }

    @Override // defpackage.l1w
    public final void a0() {
        u0();
    }

    @Override // defpackage.l1w
    public final void b0(ctv ctvVar) {
        Object value;
        s2w s2wVar;
        ctvVar.getClass();
        auv r0 = r0();
        xrv b = ctvVar.b();
        r0.getClass();
        b.getClass();
        if (((s2w) r0.e.getValue()).b.get(b.getId()) != null) {
            return;
        }
        xdr xdrVar = r0.d;
        do {
            value = xdrVar.getValue();
            s2wVar = (s2w) value;
        } while (!xdrVar.k(value, auv.h(r0, s2wVar, null, uah.j(s2wVar.b, new Pair(b.getId(), b)), null, null, null, null, null, 125)));
        r0.g.c(new ltv(b.getId()));
    }

    @Override // defpackage.l1w
    public final void c0(ktv ktvVar, jtv jtvVar) {
        auv r0 = r0();
        yrv yrvVar = ktvVar.e;
        jtv jtvVar2 = ktvVar.h;
        wrv wrvVar = new wrv(jtvVar2.a, jtvVar2.b);
        wrv wrvVar2 = new wrv(jtvVar.a, jtvVar.b);
        r0.getClass();
        String str = yrvVar.a;
        xdr xdrVar = r0.e;
        if (((s2w) xdrVar.getValue()).b.get(str) != null) {
            r0.g(str);
            return;
        }
        zrv zrvVar = new zrv(str, wrvVar);
        xdr xdrVar2 = r0.d;
        while (true) {
            Object value = xdrVar2.getValue();
            s2w s2wVar = (s2w) value;
            auv auvVar = r0;
            yrv yrvVar2 = yrvVar;
            if (xdrVar2.k(value, auv.h(auvVar, s2wVar, null, uah.j(s2wVar.b, new Pair(str, yrvVar)), null, null, null, null, null, 125))) {
                auvVar.g.c(new mtv(zrvVar, ((s2w) xdrVar.getValue()).f, wrvVar2));
                return;
            } else {
                r0 = auvVar;
                yrvVar = yrvVar2;
            }
        }
    }

    @Override // defpackage.l1w
    public final void d0() {
        yrv p0;
        a3w a3wVar = (a3w) q0();
        a3wVar.b.a(((zzv) a3wVar.j.getValue()).c() ? VolumeUnmuteCommand.INSTANCE : VolumeMuteCommand.INSTANCE, a3t.a);
        Object value = this.B.a.getValue();
        wyv wyvVar = value instanceof wyv ? (wyv) value : null;
        if (wyvVar == null || (p0 = p0(wyvVar.a)) == null) {
            return;
        }
        p0w K = K();
        String str = p0.a;
        String str2 = p0.c;
        boolean z = !((zzv) ((a3w) q0()).j.getValue()).c();
        K.getClass();
        nmb a = K.a();
        String j = k5r.j(K, a);
        LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
        m.put("hash", j);
        m.put("artist_id", str);
        eta.u(m, "artist_name", str2, z, "is_muted");
        m.put("_meta", nmb.u(1));
        a.C("Wizard.OneToOne.MuteButtonTap", m);
    }

    @Override // defpackage.l1w
    public final void e0() {
        t0(null, false);
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, d1w.a);
    }

    @Override // defpackage.l1w
    public final void f0() {
        if (!this.n) {
            V();
            o0(q0w.a);
        } else {
            xdr xdrVar = this.w;
            xdrVar.getClass();
            xdrVar.m(null, f1w.a);
            x97.y(ot0.F(this), null, null, new wzv(this, (Continuation) null, 1), 3);
        }
    }

    @Override // defpackage.l1w
    public final void g0() {
        V();
        o0(q0w.b);
    }

    @Override // defpackage.l1w
    public final void h0(ctv ctvVar) {
        ctvVar.getClass();
        auv r0 = r0();
        xrv b = ctvVar.b();
        r0.getClass();
        b.getClass();
        if (((s2w) r0.e.getValue()).b.get(b.getId()) != null) {
            r0.g(b.getId());
        }
    }

    @Override // defpackage.l1w
    public final void i0(jtv jtvVar, czv czvVar) {
        yrv p0;
        xyv xyvVar = (xyv) this.B.a.getValue();
        if (xyvVar instanceof vyv) {
            if ((this.w.getValue() instanceof d1w) && this.p && (p0 = p0(jtvVar)) != null) {
                String str = p0.c;
                String str2 = p0.a;
                ((a3w) q0()).a(str2);
                z0w z0wVar = new z0w(jtvVar);
                xdr xdrVar = this.A;
                xdrVar.getClass();
                xdrVar.m(null, z0wVar);
                p0w K = K();
                K.getClass();
                nmb a = K.a();
                String j = k5r.j(K, a);
                LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
                m.put("hash", j);
                m.put("artist_id", str2);
                dfi.p(1, "artist_name", str, "_meta", m);
                a.C("Wizard.OneToOne.Opened", m);
                K().d(str2, str);
            }
        } else {
            if (!(xyvVar instanceof wyv)) {
                b6e.s();
                return;
            }
            u0();
        }
        int ordinal = czvVar.ordinal();
        if (ordinal == 0) {
            p0w K2 = K();
            nmb a2 = K2.a();
            String j2 = k5r.j(K2, a2);
            LinkedHashMap m2 = dfi.m("page_type", "landing", "page_id", "wizard");
            dfi.p(1, "hash", j2, "_meta", m2);
            a2.C("Wizard.ZoomedIn", m2);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return;
            }
            b6e.s();
        } else {
            p0w K3 = K();
            nmb a3 = K3.a();
            String j3 = k5r.j(K3, a3);
            LinkedHashMap m3 = dfi.m("page_type", "landing", "page_id", "wizard");
            dfi.p(1, "hash", j3, "_meta", m3);
            a3.C("Wizard.ZoomedOut", m3);
        }
    }

    @Override // defpackage.l1w
    public final void j0() {
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, c1w.a);
    }

    @Override // defpackage.l1w
    public final void k0() {
        xdr xdrVar = this.w;
        xdrVar.getClass();
        xdrVar.m(null, g1w.a);
    }

    @Override // defpackage.l1w
    public final void l0() {
        a3w a3wVar = (a3w) q0();
        if (p6g.C((e6l) a3wVar.l.getValue())) {
            a3wVar.b.a(PauseCommand.INSTANCE, new b3t("core_pause"));
        }
    }

    @Override // defpackage.l1w
    public final void m0() {
        a3w a3wVar = (a3w) q0();
        d6l x = p6g.x((e6l) a3wVar.l.getValue());
        if ((x != null ? x.a : null) == null) {
            return;
        }
        a3wVar.b.a(new PlayCommand(true), new b3t("core_play"));
    }

    @Override // defpackage.l1w
    public final void n0(String str) {
        str.getClass();
        y1w y1wVar = (y1w) this.t.getValue();
        y1wVar.getClass();
        rar rarVar = y1wVar.d;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        y1wVar.d = x97.y(y1wVar.c, null, null, new y6v(str, y1wVar, continuation, 14), 3);
    }

    public final void o0(q0w q0wVar) {
        x97.y(ot0.F(this), null, null, new y6v(this, q0wVar, (Continuation) null, 13), 3);
    }

    public final yrv p0(jtv jtvVar) {
        return (yrv) ((s2w) r0().e.getValue()).a.get(new wrv(jtvVar.a, jtvVar.b));
    }

    public final z2w q0() {
        return (z2w) this.u.getValue();
    }

    public final auv r0() {
        return (auv) this.s.getValue();
    }

    public final void t0(String str, boolean z) {
        String str2;
        auv r0 = r0();
        ps psVar = new ps(this, z, 10);
        r0.getClass();
        xdr xdrVar = r0.e;
        if (Intrinsics.d(((s2w) xdrVar.getValue()).f, str)) {
            psVar.invoke();
            return;
        }
        if (str == null) {
            str = ((s2w) xdrVar.getValue()).f;
        }
        String str3 = str;
        xdr xdrVar2 = r0.d;
        while (true) {
            Object value = xdrVar2.getValue();
            str2 = str3;
            if (xdrVar2.k(value, auv.h(r0, (s2w) value, c5b.a, null, null, null, null, str2, null, 94))) {
                break;
            } else {
                str3 = str2;
            }
        }
        rar rarVar = r0.h;
        Continuation continuation = null;
        if (rarVar != null) {
            rarVar.g(null);
        }
        r0.h = x97.y(r0.c, dm6.b, null, new wwd(r0, str2, psVar, continuation, 2), 2);
    }

    public final void u0() {
        xyv xyvVar = (xyv) this.B.a.getValue();
        if (!(xyvVar instanceof wyv)) {
            if (xyvVar instanceof vyv) {
                return;
            }
            b6e.s();
            return;
        }
        yrv p0 = p0(((wyv) xyvVar).a);
        if (p0 != null) {
            String str = p0.a;
            p0w K = K();
            String str2 = p0.c;
            boolean s0 = s0((zzv) ((a3w) q0()).j.getValue(), str);
            K.getClass();
            nmb a = K.a();
            String j = k5r.j(K, a);
            LinkedHashMap m = dfi.m("page_type", "landing", "page_id", "wizard");
            m.put("hash", j);
            m.put("artist_id", str);
            eta.u(m, "artist_name", str2, s0, "with_videoshot");
            m.put("_meta", nmb.u(1));
            a.C("Wizard.OneToOne.Closed", m);
        }
        y0w y0wVar = new y0w();
        xdr xdrVar = this.A;
        xdrVar.getClass();
        xdrVar.m(null, y0wVar);
        ((a3w) q0()).b();
    }
}
