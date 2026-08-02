package defpackage;

import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class y57 extends bfu implements f57 {
    public final zi3 A;
    public boolean A0;
    public final x0q B;
    public String B0;
    public final x0q C;
    public rfk C0;
    public final x0q D;
    public List D0;
    public final x0q E;
    public final xdr F;
    public final xdr G;
    public final x0q H;
    public final x0q I;
    public final x0q J;
    public final x0q K;
    public final x0q L;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final g0c k;
    public final g8c l;
    public final ljj m;
    public final atn n;
    public final t1f o;
    public final xdh p;
    public final n7b q;
    public final oxa r;
    public final osh s;
    public final ljj t;
    public final rjj u;
    public final rn5 v;
    public mgk v0;
    public final le3 w;
    public rfk w0;
    public final pjc x;
    public String x0;
    public final xdr y;
    public g3j y0;
    public final xdr z;
    public mfk z0;

    public y57(g0c g0cVar, g8c g8cVar, ljj ljjVar, atn atnVar, t1f t1fVar, xdh xdhVar, n7b n7bVar, oxa oxaVar, osh oshVar, ljj ljjVar2, rjj rjjVar, rn5 rn5Var, le3 le3Var, pjc pjcVar) {
        this.k = g0cVar;
        this.l = g8cVar;
        this.m = ljjVar;
        this.n = atnVar;
        this.o = t1fVar;
        this.p = xdhVar;
        this.q = n7bVar;
        this.r = oxaVar;
        this.s = oshVar;
        this.t = ljjVar2;
        this.u = rjjVar;
        this.v = rn5Var;
        this.w = le3Var;
        this.x = pjcVar;
        xdr a = ydr.a(ucp.b);
        this.y = a;
        this.z = a;
        this.A = men.g(-1, 6, null);
        x0q b = y0q.b(0, 0, null, 7);
        this.B = b;
        this.C = b;
        x0q b2 = y0q.b(1, 1, null, 4);
        this.D = b2;
        this.E = b2;
        xdr a2 = ydr.a(q5m.a);
        this.F = a2;
        this.G = a2;
        x0q b3 = y0q.b(1, 0, null, 6);
        this.H = b3;
        this.I = b3;
        x0q b4 = y0q.b(1, 0, null, 6);
        this.J = b4;
        this.K = b4;
        this.L = y0q.b(1, 0, null, 6);
        this.X = true;
        this.Y = true;
        this.Z = true;
        this.D0 = c5b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(y57 y57Var, JSONObject jSONObject, q27 q27Var, cg6 cg6Var) {
        r57 r57Var;
        int i;
        if (cg6Var instanceof r57) {
            r57Var = (r57) cg6Var;
            int i2 = r57Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r57Var.n = i2 - Integer.MIN_VALUE;
                Object obj = r57Var.l;
                Object obj2 = nm6.a;
                i = r57Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        y57Var.R(jSONObject);
                    } catch (Throwable th) {
                        th = th;
                        rn5 rn5Var = y57Var.v;
                        r57Var.j = y57Var;
                        r57Var.k = th;
                        r57Var.n = 1;
                        obj = rn5Var.x(q27Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th2 = r57Var.k;
                y57 y57Var2 = r57Var.j;
                qgg.h0(obj);
                th = th2;
                y57Var = y57Var2;
                y57Var.R((JSONObject) obj);
                g0c g0cVar = y57Var.k;
                qne m = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(m);
                return Unit.a;
            }
        }
        r57Var = new r57(y57Var, cg6Var);
        Object obj3 = r57Var.l;
        Object obj22 = nm6.a;
        i = r57Var.n;
        if (i != 0) {
        }
        y57Var.R((JSONObject) obj3);
        g0c g0cVar2 = y57Var.k;
        qne m2 = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
        x60 x60Var2 = (x60) g0cVar2;
        x60Var2.getClass();
        x60Var2.a(m2);
        return Unit.a;
    }

    public static final void H(y57 y57Var, en enVar) {
        Continuation continuation = null;
        if (enVar instanceof zm) {
            int i = h57.a[((zm) enVar).a.ordinal()];
            xdr xdrVar = y57Var.y;
            ycp ycpVar = new ycp(R.string.paymentsdk_success_title);
            xdrVar.getClass();
            xdrVar.m(null, ycpVar);
            return;
        }
        int i2 = 0;
        if (enVar instanceof bn) {
            x97.y(ot0.F(y57Var), null, null, new u57(y57Var, enVar, continuation, i2), 3);
            return;
        }
        if (enVar instanceof xm) {
            x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 8), 3);
            return;
        }
        if (enVar instanceof dn) {
            g0c g0cVar = y57Var.k;
            qne i1 = gut.i1("Sbp has its own fragment", null, null, null, null);
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(i1);
            xq0.q("Sbp has its own fragment");
            return;
        }
        if (enVar instanceof ym) {
            x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 9), 3);
            return;
        }
        int i3 = 1;
        if (!(enVar instanceof cn)) {
            if (enVar instanceof an) {
                x97.y(ot0.F(y57Var), null, null, new u57(y57Var, enVar, continuation, i3), 3);
                return;
            }
            return;
        }
        t9i t9iVar = ((cn) enVar).a;
        if (t9iVar instanceof xa4) {
            x97.y(ot0.F(y57Var), null, null, new v57(y57Var, t9iVar, continuation, i2), 3);
        } else if (t9iVar instanceof fb4) {
            x97.y(ot0.F(y57Var), null, null, new v57(y57Var, t9iVar, continuation, i3), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r2.emit(r3, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0054, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(y57 y57Var, cg6 cg6Var) {
        w57 w57Var;
        int i;
        p5m p5mVar;
        if (cg6Var instanceof w57) {
            w57Var = (w57) cg6Var;
            int i2 = w57Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w57Var.m = i2 - Integer.MIN_VALUE;
                Object obj = w57Var.k;
                nm6 nm6Var = nm6.a;
                i = w57Var.m;
                int i3 = 3;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    t1f t1fVar = y57Var.o;
                    w57Var.j = y57Var;
                    w57Var.m = 1;
                    obj = x97.V((a) t1fVar.d, new b51(t1fVar, continuation, i3), w57Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y57Var = w57Var.j;
                    qgg.h0(obj);
                }
                p5mVar = (p5m) obj;
                if (p5mVar == null) {
                    y57Var.M(p5mVar.b);
                    x0q x0qVar = y57Var.L;
                    List list = p5mVar.a;
                    mgk mgkVar = y57Var.v0;
                    g57 g57Var = new g57(list, mgkVar != null ? mgkVar.f() : null);
                    w57Var.j = null;
                    w57Var.m = 2;
                } else {
                    x0q x0qVar2 = y57Var.B;
                    pcp pcpVar = new pcp(R.string.paymentsdk_error_create_card);
                    w57Var.j = null;
                    w57Var.m = 3;
                }
                return nm6Var;
            }
        }
        w57Var = new w57(y57Var, cg6Var);
        Object obj2 = w57Var.k;
        nm6 nm6Var2 = nm6.a;
        i = w57Var.m;
        int i32 = 3;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        p5mVar = (p5m) obj2;
        if (p5mVar == null) {
        }
        return nm6Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
    
        if (r8.emit(r9, r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009b, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r9 != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (kotlin.Unit.a == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(y57 y57Var, Continuation continuation) {
        x57 x57Var;
        int i;
        y57 y57Var2;
        boolean booleanValue;
        if (continuation instanceof x57) {
            x57Var = (x57) continuation;
            int i2 = x57Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x57Var.n = i2 - Integer.MIN_VALUE;
                Object obj = x57Var.l;
                nm6 nm6Var = nm6.a;
                i = x57Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    xdr xdrVar = y57Var.F;
                    q5m q5mVar = q5m.b;
                    x57Var.j = y57Var;
                    x57Var.n = 1;
                    xdrVar.getClass();
                    xdrVar.m(null, q5mVar);
                } else if (i == 1) {
                    y57Var = x57Var.j;
                    qgg.h0(obj);
                } else if (i == 2) {
                    y57Var = x57Var.j;
                    qgg.h0(obj);
                    y57Var2 = y57Var;
                    booleanValue = ((Boolean) obj).booleanValue();
                    xdr xdrVar2 = y57Var2.F;
                    q5m q5mVar2 = q5m.c;
                    x57Var.j = y57Var2;
                    x57Var.k = booleanValue;
                    x57Var.n = 3;
                    xdrVar2.getClass();
                    xdrVar2.m(null, q5mVar2);
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    booleanValue = x57Var.k;
                    y57Var2 = x57Var.j;
                    qgg.h0(obj);
                    if (booleanValue) {
                        return Unit.a;
                    }
                    x0q x0qVar = y57Var2.B;
                    pcp pcpVar = new pcp(R.string.paymentsdk_error_create_card);
                    x57Var.j = null;
                    x57Var.n = 4;
                }
                xdh xdhVar = y57Var.p;
                mgk mgkVar = y57Var.v0;
                wgk f = mgkVar == null ? mgkVar.f() : null;
                x57Var.j = y57Var;
                x57Var.n = 2;
                obj = x97.V((a) xdhVar.c, new ya2(xdhVar, f, (Continuation) null), x57Var);
            }
        }
        x57Var = new x57(y57Var, continuation);
        Object obj2 = x57Var.l;
        nm6 nm6Var2 = nm6.a;
        i = x57Var.n;
        if (i != 0) {
        }
        xdh xdhVar2 = y57Var.p;
        mgk mgkVar2 = y57Var.v0;
        if (mgkVar2 == null) {
        }
        x57Var.j = y57Var;
        x57Var.n = 2;
        obj2 = x97.V((a) xdhVar2.c, new ya2(xdhVar2, f, (Continuation) null), x57Var);
    }

    public static yfk L(rfk rfkVar) {
        return rfkVar instanceof ffk ? yfk.EXISTING_CARD : rfkVar instanceof mfk ? yfk.SBP_TOKEN : rfkVar instanceof pfk ? yfk.YANDEX_BANK : Intrinsics.d(rfkVar, gfk.a) ? yfk.CASH : Intrinsics.d(rfkVar, ifk.a) ? yfk.GOOGLE_PAY : Intrinsics.d(rfkVar, jfk.a) ? yfk.NEW_CARD : Intrinsics.d(rfkVar, lfk.a) ? yfk.SBP : Intrinsics.d(rfkVar, kfk.a) ? yfk.NEW_SBP_TOKEN : yfk.UNKNOWN;
    }

    public static final Unit a(y57 y57Var, List list, wgk wgkVar, boolean z) {
        List list2;
        g0c g0cVar = y57Var.k;
        if (y57Var.v0 != null) {
            rfk rfkVar = y57Var.w0;
            Continuation continuation = null;
            if (rfkVar != null) {
                if (wgkVar != null) {
                    qne n1 = gut.n1();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(n1);
                    if (o8g.r(o8g.w(rfkVar), list) == null) {
                        xdr xdrVar = y57Var.y;
                        Parcelable.Creator<bfk> creator = bfk.CREATOR;
                        tcp tcpVar = new tcp(y7g.L(o8g.w(rfkVar)));
                        xdrVar.getClass();
                        xdrVar.m(null, tcpVar);
                    } else {
                        y57Var.P(t75.c(rfkVar));
                        if ((rfkVar instanceof ffk) || (((rfkVar instanceof jfk) && y57Var.y0 != null) || (rfkVar instanceof pfk) || (rfkVar instanceof ifk) || (rfkVar instanceof mfk))) {
                            x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 11), 3);
                        } else if (rfkVar instanceof lfk) {
                            x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 12), 3);
                        } else if (rfkVar instanceof kfk) {
                            x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 13), 3);
                        } else {
                            y57Var.S();
                            y57Var.N(rfkVar);
                        }
                    }
                }
            } else if (list.isEmpty()) {
                qne k1 = gut.k1();
                x60 x60Var2 = (x60) g0cVar;
                x60Var2.getClass();
                x60Var2.a(k1);
                x97.y(ot0.F(y57Var), null, null, new i57(y57Var, continuation, 0), 3);
            } else {
                qne l1 = gut.l1();
                x60 x60Var3 = (x60) g0cVar;
                x60Var3.getClass();
                x60Var3.a(l1);
                List p = o8g.p(list);
                ArrayList arrayList = new ArrayList();
                for (Object obj : p) {
                    rfk rfkVar2 = (rfk) obj;
                    if (!(rfkVar2 instanceof ffk) || (list2 = ((ffk) rfkVar2).f) == null || list2.isEmpty()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() != 1 || z) {
                    y57Var.S();
                } else {
                    y57Var.N((rfk) CollectionsKt.Q(arrayList));
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.f57
    public final u0q A() {
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.f57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(jst jstVar, Continuation continuation) {
        q57 q57Var;
        int i;
        y57 y57Var;
        String str;
        zi4 zi4Var;
        if (continuation instanceof q57) {
            q57Var = (q57) continuation;
            int i2 = q57Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q57Var.n = i2 - Integer.MIN_VALUE;
                Object obj = q57Var.l;
                nm6 nm6Var = nm6.a;
                i = q57Var.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    qne g0 = gut.g0();
                    x60 x60Var = (x60) this.k;
                    x60Var.getClass();
                    x60Var.a(g0);
                    mgk mgkVar = this.v0;
                    wgk f = mgkVar != null ? mgkVar.f() : null;
                    BigDecimal bigDecimal = (f == null || (str = f.a) == null) ? BigDecimal.ZERO : new BigDecimal(str);
                    bigDecimal.getClass();
                    String str2 = f != null ? f.b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bm2 bm2Var = new bm2(bigDecimal, str2);
                    rfk rfkVar = this.C0;
                    boolean z = this.X;
                    boolean z2 = this.Y;
                    q57Var.j = this;
                    q57Var.k = jstVar;
                    q57Var.n = 1;
                    osh oshVar = this.s;
                    obj = x97.V((a) oshVar.c, new aj4(rfkVar, bm2Var, z, oshVar, z2, (Continuation) null), q57Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    y57Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jstVar = q57Var.k;
                    y57Var = q57Var.j;
                    qgg.h0(obj);
                }
                zi4Var = (zi4) obj;
                if (!Intrinsics.d(zi4Var, xi4.a)) {
                    y57Var.i(jstVar);
                } else if (zi4Var instanceof yi4) {
                    BigDecimal bigDecimal2 = ((yi4) zi4Var).a.a;
                    y57Var.getClass();
                    x97.y(ot0.F(y57Var), null, null, new bv6(y57Var, bigDecimal2, continuation2, 16), 3);
                }
                return Unit.a;
            }
        }
        q57Var = new q57(this, continuation);
        Object obj2 = q57Var.l;
        nm6 nm6Var2 = nm6.a;
        i = q57Var.n;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        zi4Var = (zi4) obj2;
        if (!Intrinsics.d(zi4Var, xi4.a)) {
        }
        return Unit.a;
    }

    @Override // defpackage.f57
    public final void D() {
        rfk rfkVar = this.w0;
        Continuation continuation = null;
        if (rfkVar == null) {
            x97.y(ot0.F(this), null, null, new i57(this, continuation, 6), 3);
            return;
        }
        if (!o8g.A(rfkVar)) {
            x97.y(ot0.F(this), null, null, new i57(this, continuation, 4), 3);
            return;
        }
        qne o1 = gut.o1(o8g.w(this.w0));
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(o1);
        vcp vcpVar = new vcp(true, true);
        xdr xdrVar = this.y;
        xdrVar.getClass();
        xdrVar.m(null, vcpVar);
        x97.y(ot0.F(this), null, null, new i57(this, continuation, 14), 3);
    }

    @Override // defpackage.f57
    public final void E() {
        qne w0 = gut.w0();
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(w0);
    }

    public final void M(int i) {
        if (i >= 0 && i < this.D0.size()) {
            O((rfk) this.D0.get(i));
            return;
        }
        List list = this.D0;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L((rfk) it.next()));
        }
        qne i1 = gut.i1("Selected position index is out of methods array", null, Integer.valueOf(i), Integer.valueOf(this.D0.size()), new ArrayList(arrayList));
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(i1);
        throw new IllegalStateException(("Selected position index is out of methods array, position = " + i + ", methods.size = " + this.D0.size()).toString());
    }

    public final void N(rfk rfkVar) {
        if (rfkVar != null) {
            this.m.b(rfkVar, false);
            if (rfkVar.equals(jfk.a)) {
                x97.y(ot0.F(this), null, null, new i57(this, null, 10), 3);
            }
        }
    }

    public final void O(rfk rfkVar) {
        if (rfkVar == null || this.D0.contains(rfkVar)) {
            this.C0 = rfkVar;
            return;
        }
        List list = this.D0;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(L((rfk) it.next()));
        }
        qne i1 = gut.i1("Method list does not contain provided method", L(rfkVar), null, null, new ArrayList(arrayList));
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(i1);
        throw new IllegalStateException(("Method list does not contain provided method, methods.size = " + this.D0.size()).toString());
    }

    public final void P(List list) {
        List list2;
        Object obj = null;
        if (list.isEmpty()) {
            qne i1 = gut.i1("Method list should not be empty", null, null, null, null);
            x60 x60Var = (x60) this.k;
            x60Var.getClass();
            x60Var.a(i1);
            xq0.q("Method list should not be empty");
            return;
        }
        this.D0 = list;
        for (Object obj2 : list) {
            rfk rfkVar = (rfk) obj2;
            if (!(rfkVar instanceof ffk) || (list2 = ((ffk) rfkVar).f) == null || list2.isEmpty()) {
                obj = obj2;
                break;
            }
        }
        O((rfk) obj);
    }

    public final void R(JSONObject jSONObject) {
        x97.y(ot0.F(this), null, null, new d57(this, jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"), t75.c(new Pair("isLightTheme", String.valueOf(this.Z))), (Continuation) null, 1), 3);
    }

    public final void S() {
        if (this.G.getValue() != q5m.b) {
            xcp xcpVar = new xcp(c5b.a, 0);
            xdr xdrVar = this.y;
            xdrVar.getClass();
            xdrVar.m(null, xcpVar);
        }
    }

    @Override // defpackage.f57
    public final x0q f() {
        return this.I;
    }

    @Override // defpackage.f57
    public final void i(jst jstVar) {
        mgk mgkVar;
        jstVar.getClass();
        rfk rfkVar = this.C0;
        Continuation continuation = null;
        if (rfkVar != null && (rfkVar instanceof ffk) && (mgkVar = this.v0) != null && mgkVar.g(((ffk) rfkVar).a)) {
            x97.y(ot0.F(this), null, null, new s57(this, rfkVar, continuation, 1), 3);
            return;
        }
        if ((rfkVar instanceof lfk) || (rfkVar instanceof kfk)) {
            x97.y(ot0.F(this), null, null, new s57(this, rfkVar, continuation, 0), 3);
            return;
        }
        String str = jstVar.a;
        if (str == null) {
            str = this.x0;
        }
        vcp vcpVar = new vcp(true, false);
        xdr xdrVar = this.y;
        xdrVar.getClass();
        xdrVar.m(null, vcpVar);
        if (!(rfkVar instanceof mfk)) {
            x97.y(ot0.F(this), null, null, new j57(this, (Parcelable) rfkVar, (Object) str, continuation, 1), 3);
            return;
        }
        mfk mfkVar = (mfk) rfkVar;
        this.z0 = mfkVar;
        String str2 = mfkVar.a;
        String str3 = mfkVar.i;
        int i = 2;
        ((jek) this.q.a).f(str2, str, str3, new awc(new dn9(str2, str, str3, new t57(this, 0), new t57(this, 1), new p57(this, i), bs5.I, new t57(this, i), new t57(this, 3))));
    }

    @Override // defpackage.f57
    public final u0q j() {
        return this.C;
    }

    @Override // defpackage.f57
    public final void k(int i) {
        M(i);
        rfk rfkVar = this.C0;
        if (rfkVar != null) {
            this.m.b(rfkVar, true);
        }
    }

    @Override // defpackage.f57
    public final void l(mgk mgkVar, rn5 rn5Var, rfk rfkVar, String str, g3j g3jVar, kpm kpmVar, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Инициализация вьюмодели экрана выбора метода оплаты с рефакторингом", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "dk_select_view_model_refactor_init", "dk_select_view_model_refactor_init", k);
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(j);
        this.w0 = rfkVar;
        this.x0 = str;
        this.y0 = g3jVar;
        this.A0 = z3;
        this.B0 = str2;
        this.Z = z;
        this.Y = z2;
        this.X = z4;
        Continuation continuation = null;
        x97.y(ot0.F(this), null, null, new j57(rfkVar, mgkVar, this, continuation, 0), 3);
        x97.y(ot0.F(this), null, null, new i57(this, continuation, 1), 3);
    }

    @Override // defpackage.f57
    public final void p() {
        qne t0 = gut.t0();
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(t0);
    }

    @Override // defpackage.f57
    public final vdr q() {
        return this.z;
    }

    @Override // defpackage.f57
    public final x0q r() {
        return this.K;
    }

    @Override // defpackage.f57
    public final zi3 s() {
        return this.A;
    }

    @Override // defpackage.f57
    public final void w() {
        x97.y(ot0.F(this), null, null, new i57(this, null, 3), 3);
    }

    @Override // defpackage.f57
    public final vdr x() {
        return this.G;
    }

    @Override // defpackage.f57
    public final void z() {
        qne j1 = gut.j1(yfk.NEW_CARD, true);
        x60 x60Var = (x60) this.k;
        x60Var.getClass();
        x60Var.a(j1);
    }
}
