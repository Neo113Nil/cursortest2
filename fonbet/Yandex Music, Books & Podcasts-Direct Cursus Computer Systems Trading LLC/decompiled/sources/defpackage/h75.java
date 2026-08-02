package defpackage;

import android.graphics.Color;
import java.util.List;
import kotlin.Unit;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class h75 extends qp7 implements ayd {
    public final f75 d;
    public final rmb e;
    public final lnq f;
    public final xdr g;
    public final xdr h;
    public final x65 i;
    public final jyr j;
    public final jyr k;

    public h75(f75 f75Var, rmb rmbVar, lnq lnqVar) {
        f75Var.getClass();
        this.d = f75Var;
        this.e = rmbVar;
        this.f = lnqVar;
        this.g = ydr.a(o75.a);
        this.h = ydr.a(Boolean.TRUE);
        this.i = new x65(1);
        this.j = l18.b.b(hag.I(snu.class), true);
        this.k = btf.b(wg.j);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        v3w.n(z, this.h, null);
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return !(this.g.getValue() instanceof o75);
    }

    @Override // defpackage.qp7
    public final String n() {
        return "Collection:Skeleton:CollectionWaveBlock";
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0161, code lost:
    
        if (r1 == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:
    
        if (r1 == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        g75 g75Var;
        int i;
        boolean z2;
        rj6 rj6Var;
        gmu gmuVar;
        long j;
        d85 d85Var;
        d85 d85Var2;
        if (cg6Var instanceof g75) {
            g75Var = (g75) cg6Var;
            int i2 = g75Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g75Var.n = i2 - Integer.MIN_VALUE;
                Object obj = g75Var.l;
                nm6 nm6Var = nm6.a;
                i = g75Var.n;
                m75 m75Var = m75.a;
                rmb rmbVar = this.e;
                f75 f75Var = this.d;
                xdr xdrVar = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    gnu gnuVar = (gnu) this.k.getValue();
                    z2 = z;
                    g75Var.j = z2;
                    g75Var.n = 1;
                    obj = gnuVar.a(g75Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            xdrVar.getClass();
                            xdrVar.m(null, m75Var);
                            rmb.h(rmbVar, 0, 2);
                            return new b73(f75Var);
                        }
                        gmuVar = g75Var.k;
                        qgg.h0(obj);
                        jyr jyrVar = this.j;
                        j = ((ymk) ((snu) jyrVar.getValue()).b.b.invoke()).a;
                        gmuVar.getClass();
                        String str = gmuVar.a;
                        String str2 = gmuVar.b;
                        String I = neg.I(gmuVar.c);
                        StationId stationId = gmuVar.d;
                        List list = gmuVar.e;
                        d85Var = new d85(j);
                        if (j == 16) {
                            d85Var = null;
                        }
                        if (d85Var == null) {
                            String str3 = gmuVar.f;
                            if (str3 == null) {
                                d85Var2 = null;
                                String str4 = gmuVar.g;
                                n75 n75Var = new n75(new mmu(str, str2, I, stationId, list, new lmu(d85Var2, str4 != null ? new d85(c3x.f(Color.parseColor(str4))) : null)), this.i);
                                xdrVar.getClass();
                                xdrVar.m(null, n75Var);
                                if (d85Var2 != null) {
                                    long j2 = d85Var2.a;
                                    snu snuVar = (snu) jyrVar.getValue();
                                    snuVar.getClass();
                                    p85 b0 = pd.b0(j2);
                                    qnu qnuVar = snuVar.a;
                                    float f = b0.a;
                                    if (f >= 0.0f) {
                                        f1d.s(f, qnuVar.d, null);
                                    } else {
                                        ssg.a(4, "WaveColorsCenterImpl", "not correct colorHue", null);
                                    }
                                }
                                rmb.h(rmbVar, 1, 2);
                                return new d73(f75Var);
                            }
                            d85Var = new d85(c3x.f(Color.parseColor(str3)));
                        }
                        d85Var2 = d85Var;
                        String str42 = gmuVar.g;
                        n75 n75Var2 = new n75(new mmu(str, str2, I, stationId, list, new lmu(d85Var2, str42 != null ? new d85(c3x.f(Color.parseColor(str42))) : null)), this.i);
                        xdrVar.getClass();
                        xdrVar.m(null, n75Var2);
                        if (d85Var2 != null) {
                        }
                        rmb.h(rmbVar, 1, 2);
                        return new d73(f75Var);
                    }
                    z2 = g75Var.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    xdrVar.getClass();
                    xdrVar.m(null, m75Var);
                    return new c73(f75Var);
                }
                gmu gmuVar2 = (gmu) ((qj6) rj6Var).a;
                boolean equals = gmuVar2.d.h().equals(StationId.f("personal:collection").h());
                lnq lnqVar = this.f;
                if (equals) {
                    g75Var.k = gmuVar2;
                    g75Var.j = z2;
                    g75Var.n = 2;
                    Object a = lnqVar.a.a(f75Var, false, g75Var);
                    if (a != nm6Var) {
                        a = Unit.a;
                    }
                    if (a != nm6Var) {
                        gmuVar = gmuVar2;
                        jyr jyrVar2 = this.j;
                        j = ((ymk) ((snu) jyrVar2.getValue()).b.b.invoke()).a;
                        gmuVar.getClass();
                        String str5 = gmuVar.a;
                        String str22 = gmuVar.b;
                        String I2 = neg.I(gmuVar.c);
                        StationId stationId2 = gmuVar.d;
                        List list2 = gmuVar.e;
                        d85Var = new d85(j);
                        if (j == 16) {
                        }
                        if (d85Var == null) {
                        }
                        d85Var2 = d85Var;
                        String str422 = gmuVar.g;
                        n75 n75Var22 = new n75(new mmu(str5, str22, I2, stationId2, list2, new lmu(d85Var2, str422 != null ? new d85(c3x.f(Color.parseColor(str422))) : null)), this.i);
                        xdrVar.getClass();
                        xdrVar.m(null, n75Var22);
                        if (d85Var2 != null) {
                        }
                        rmb.h(rmbVar, 1, 2);
                        return new d73(f75Var);
                    }
                } else {
                    g75Var.k = null;
                    g75Var.j = z2;
                    g75Var.n = 3;
                    Object a2 = lnqVar.a.a(f75Var, true, g75Var);
                    if (a2 != nm6Var) {
                        a2 = Unit.a;
                    }
                }
                return nm6Var;
            }
        }
        g75Var = new g75(this, cg6Var);
        Object obj2 = g75Var.l;
        nm6 nm6Var2 = nm6.a;
        i = g75Var.n;
        m75 m75Var2 = m75.a;
        rmb rmbVar2 = this.e;
        f75 f75Var2 = this.d;
        xdr xdrVar2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
