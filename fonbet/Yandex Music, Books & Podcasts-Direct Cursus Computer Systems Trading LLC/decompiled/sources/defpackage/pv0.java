package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public abstract class pv0 {
    public final pmp a = qmp.a;
    public final uqf b = uqf.c;
    public final hjp c;

    public pv0(hjp hjpVar) {
        this.c = hjpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(pv0 pv0Var, Context context, rkd rkdVar, cg6 cg6Var) {
        ov0 ov0Var;
        int i;
        if (cg6Var instanceof ov0) {
            ov0Var = (ov0) cg6Var;
            int i2 = ov0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ov0Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ov0Var.j;
                nm6 nm6Var = nm6.a;
                i = ov0Var.l;
                if (i == 0) {
                    if (i == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    qgg.h0(obj);
                    wn5 wn5Var = new wn5(new nv0(pv0Var, context, rkdVar), -771255693, true);
                    ov0Var.l = 1;
                    sj2.B(wn5Var, ov0Var);
                    return;
                }
            }
        }
        ov0Var = new ov0(pv0Var, cg6Var);
        Object obj2 = ov0Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ov0Var.l;
        if (i == 0) {
        }
    }

    public static Object i(pv0 pv0Var, Context context, int i, cg6 cg6Var) {
        pv0Var.getClass();
        AtomicBoolean atomicBoolean = dqs.a;
        if (Build.VERSION.SDK_INT >= 29 && dqs.a.get()) {
            eqs.a.a("GlanceAppWidget::update", 0);
        }
        Object a = pv0Var.a.a(new d57(context, new rv0(i), pv0Var, (Continuation) null, 21), cg6Var);
        return a == nm6.a ? a : Unit.a;
    }

    public final void a(yks yksVar, hq5 hq5Var, int i) {
        yks yksVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1393323067);
        int i2 = (oq5Var.f(yksVar) ? 4 : 2) | i | (oq5Var.f(this) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            long j = ((fma) oq5Var.j(cs5.a)).a;
            wov wovVar = (wov) szf.Q((xdr) yksVar.c, oq5Var).getValue();
            if (wovVar instanceof vov) {
                oq5Var.Z(-1046321785);
                yksVar2 = yksVar;
                c(yksVar2, (vov) wovVar, j, oq5Var, (i2 & 14) | ((i2 << 6) & 7168));
                oq5Var.p(false);
            } else {
                yksVar2 = yksVar;
                if (!(wovVar instanceof uov)) {
                    throw vz1.i(oq5Var, -1046323916, false);
                }
                oq5Var.Z(-1046319090);
                d(yksVar2, (uov) wovVar, j, oq5Var, (i2 & 14) | ((i2 << 6) & 7168));
                oq5Var.p(false);
            }
        } else {
            yksVar2 = yksVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lv0(this, yksVar2, i);
        }
    }

    public final void b(Context context, rkd rkdVar, hq5 hq5Var, int i) {
        context.getClass();
        rkdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(114953170);
        int i2 = (oq5Var.h(context) ? 4 : 2) | i | (oq5Var.h(rkdVar) ? 32 : 16) | (oq5Var.f(this) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            long x = a4g.x(context, rkdVar, ((Number) qv0.c.getValue()).floatValue());
            qzm a = cs5.a.a(new fma(x));
            if (!((Boolean) qv0.b.getValue()).booleanValue()) {
                a = null;
            }
            qzm[] qzmVarArr = (qzm[]) u75.i(a).toArray(new qzm[0]);
            etn.m((qzm[]) Arrays.copyOf(qzmVarArr, qzmVarArr.length), ild.C(-248311662, new cu0(this, x, rkdVar), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nv0(this, context, rkdVar, i);
        }
    }

    public final void c(yks yksVar, vov vovVar, long j, hq5 hq5Var, int i) {
        vov vovVar2 = vovVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1051655081);
        int i2 = (oq5Var.f(yksVar) ? 4 : 2) | i | (oq5Var.h(vovVar2) ? 32 : 16) | (oq5Var.e(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(this) : oq5Var.h(this) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) oq5Var.j(cs5.b);
            boolean booleanValue = ((Boolean) szf.Q((xdr) yksVar.d, oq5Var).getValue()).booleanValue();
            int ordinal = h(j).ordinal();
            if (ordinal == 0) {
                oq5Var.Z(-1323190533);
                q7g.n(new g9r(context, j), vovVar2, booleanValue, oq5Var, i2 & 112);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(-1323208504);
                fxf.g(new con(context, j), vovVar, booleanValue, false, oq5Var, i2 & 112, 8);
                vovVar2 = vovVar;
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, -1323210301, false);
                }
                oq5Var.Z(-1323201000);
                vwb.c(new con(context, xv.m(fma.c(j), Math.min(fma.c(j) / 1.5f, fma.b(j)))), (xnv) szf.Q((vdr) yksVar.b, oq5Var).getValue(), vovVar, booleanValue, oq5Var, (i2 << 3) & 896);
                oq5Var.p(false);
                vovVar2 = vovVar;
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mv0(this, yksVar, vovVar2, j, i, 0);
        }
    }

    public final void d(yks yksVar, uov uovVar, long j, hq5 hq5Var, int i) {
        uov uovVar2 = uovVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1740864702);
        int i2 = (oq5Var.f(yksVar) ? 4 : 2) | i | (oq5Var.f(uovVar2) ? 32 : 16) | (oq5Var.e(j) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? oq5Var.f(this) : oq5Var.h(this) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) oq5Var.j(cs5.b);
            boolean booleanValue = ((Boolean) szf.Q((xdr) yksVar.d, oq5Var).getValue()).booleanValue();
            int ordinal = h(j).ordinal();
            if (ordinal == 0) {
                oq5Var.Z(2066295277);
                q7g.o(new g9r(context, j), uovVar2, booleanValue, oq5Var, i2 & 112);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var.Z(2066276858);
                fxf.h(new con(context, j), uovVar, booleanValue, false, oq5Var, i2 & 112, 8);
                uovVar2 = uovVar;
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var, 2066275075, false);
                }
                oq5Var.Z(2066284586);
                vwb.d(new con(context, xv.m(fma.c(j), Math.min(fma.c(j) / 1.5f, fma.b(j)))), (xnv) szf.Q((vdr) yksVar.b, oq5Var).getValue(), uovVar, booleanValue, oq5Var, (i2 << 3) & 896);
                oq5Var.p(false);
                uovVar2 = uovVar;
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mv0(this, yksVar, uovVar2, j, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        if (r2.a(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010a, code lost:
    
        if (r2.a(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        if (r2.a(r9, r10, r8, r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, int i, cg6 cg6Var) {
        ekd ekdVar;
        rv0 rv0Var;
        pv0 pv0Var;
        Context context2;
        int i2;
        Throwable th;
        uqf uqfVar;
        uqf uqfVar2;
        uqf uqfVar3;
        if (cg6Var instanceof ekd) {
            ekdVar = (ekd) cg6Var;
            int i3 = ekdVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ekdVar.p = i3 - Integer.MIN_VALUE;
                Object obj = ekdVar.n;
                nm6 nm6Var = nm6.a;
                Continuation continuation = null;
                switch (ekdVar.p) {
                    case 0:
                        qgg.h0(obj);
                        rv0Var = new rv0(i);
                        fzb fzbVar = new fzb(rv0Var, continuation, 27);
                        ekdVar.j = this;
                        ekdVar.k = context;
                        ekdVar.l = rv0Var;
                        ekdVar.m = i;
                        ekdVar.p = 1;
                        if (this.a.a(fzbVar, ekdVar) != nm6Var) {
                            pv0Var = this;
                            try {
                                ekdVar.j = pv0Var;
                                ekdVar.k = context;
                                ekdVar.l = null;
                                ekdVar.m = i;
                                ekdVar.p = 2;
                            } catch (CancellationException unused) {
                                int i4 = i;
                                context2 = context;
                                i2 = i4;
                                uqfVar2 = pv0Var.b;
                                if (uqfVar2 != null) {
                                    bld bldVar = bld.a;
                                    String x = ot0.x(i2);
                                    ekdVar.j = null;
                                    ekdVar.k = null;
                                    ekdVar.l = null;
                                    ekdVar.p = 4;
                                    break;
                                }
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                int i5 = i;
                                context2 = context;
                                i2 = i5;
                                try {
                                    Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                                    uqfVar = pv0Var.b;
                                    if (uqfVar != null) {
                                        bld bldVar2 = bld.a;
                                        String x2 = ot0.x(i2);
                                        ekdVar.j = null;
                                        ekdVar.k = null;
                                        ekdVar.l = null;
                                        ekdVar.p = 5;
                                        break;
                                    }
                                    return Unit.a;
                                } catch (Throwable th3) {
                                    uqf uqfVar4 = pv0Var.b;
                                    if (uqfVar4 == null) {
                                        throw th3;
                                    }
                                    bld bldVar3 = bld.a;
                                    String x3 = ot0.x(i2);
                                    ekdVar.j = th3;
                                    ekdVar.k = null;
                                    ekdVar.l = null;
                                    ekdVar.p = 6;
                                    if (bldVar3.a(context2, uqfVar4, x3, ekdVar) != nm6Var) {
                                        th = th3;
                                        break;
                                    }
                                }
                            }
                            if (pv0Var.f(rv0Var) != nm6Var) {
                                int i6 = i;
                                context2 = context;
                                i2 = i6;
                                uqfVar3 = pv0Var.b;
                                if (uqfVar3 != null) {
                                    bld bldVar4 = bld.a;
                                    String x4 = ot0.x(i2);
                                    ekdVar.j = null;
                                    ekdVar.k = null;
                                    ekdVar.p = 3;
                                    break;
                                }
                                return Unit.a;
                            }
                        }
                        return nm6Var;
                    case 1:
                        i = ekdVar.m;
                        rv0 rv0Var2 = ekdVar.l;
                        Context context3 = ekdVar.k;
                        pv0 pv0Var2 = (pv0) ekdVar.j;
                        qgg.h0(obj);
                        rv0Var = rv0Var2;
                        context = context3;
                        pv0Var = pv0Var2;
                        ekdVar.j = pv0Var;
                        ekdVar.k = context;
                        ekdVar.l = null;
                        ekdVar.m = i;
                        ekdVar.p = 2;
                        if (pv0Var.f(rv0Var) != nm6Var) {
                        }
                        return nm6Var;
                    case 2:
                        i2 = ekdVar.m;
                        context2 = ekdVar.k;
                        pv0Var = (pv0) ekdVar.j;
                        try {
                            qgg.h0(obj);
                            uqfVar3 = pv0Var.b;
                            if (uqfVar3 != null) {
                            }
                        } catch (CancellationException unused2) {
                            uqfVar2 = pv0Var.b;
                            if (uqfVar2 != null) {
                            }
                            return Unit.a;
                        } catch (Throwable th4) {
                            th = th4;
                            Log.e("GlanceAppWidget", "Error in user-provided deletion callback", th);
                            uqfVar = pv0Var.b;
                            if (uqfVar != null) {
                            }
                            return Unit.a;
                        }
                        return Unit.a;
                    case 3:
                    case 4:
                    case 5:
                        qgg.h0(obj);
                        return Unit.a;
                    case 6:
                        th = (Throwable) ekdVar.j;
                        qgg.h0(obj);
                        throw th;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        ekdVar = new ekd(this, cg6Var);
        Object obj2 = ekdVar.n;
        nm6 nm6Var2 = nm6.a;
        Continuation continuation2 = null;
        switch (ekdVar.p) {
        }
    }

    public final Unit f(rv0 rv0Var) {
        hjp hjpVar = this.c;
        hjpVar.getClass();
        rv0Var.getClass();
        pov a = ((knv) hjpVar.b).a();
        a.getClass();
        eps epsVar = a.i;
        epsVar.getClass();
        ssg.a(4, "WidgetManager", "[unregisterWidget] request to unregister widget", null);
        ((ConcurrentHashMap) epsVar.g).remove(rv0Var);
        return Unit.a;
    }

    public abstract qov h(long j);
}
