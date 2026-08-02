package defpackage;

import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import java.math.BigDecimal;
import java.util.ArrayList;
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
public final class e57 extends bfu implements f57 {
    public g3j A;
    public mfk B;
    public boolean C;
    public String D;
    public kpm E;
    public final xdr F;
    public final xdr G;
    public final zi3 H;
    public final x0q I;
    public final x0q J;
    public final x0q K;
    public final x0q L;
    public final xdr X;
    public final xdr Y;
    public final x0q Z;
    public final rn5 k;
    public final g0c l;
    public final tc1 m;
    public final n7b n;
    public final sdk o;
    public final osh p;
    public final qdc q;
    public final le3 r;
    public final pjc s;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public final x0q v0;
    public mgk w;
    public final x0q w0;
    public rn5 x;
    public final x0q x0;
    public rfk y;
    public final x0q y0;
    public String z;

    public e57(rn5 rn5Var, g0c g0cVar, tc1 tc1Var, n7b n7bVar, sdk sdkVar, osh oshVar, qdc qdcVar, le3 le3Var, pjc pjcVar) {
        this.k = rn5Var;
        this.l = g0cVar;
        this.m = tc1Var;
        this.n = n7bVar;
        this.o = sdkVar;
        this.p = oshVar;
        this.q = qdcVar;
        this.r = le3Var;
        this.s = pjcVar;
        xdr a = ydr.a(ucp.b);
        this.F = a;
        this.G = a;
        this.H = men.g(-1, 6, null);
        x0q b = y0q.b(0, 0, null, 7);
        this.I = b;
        this.J = b;
        x0q b2 = y0q.b(1, 1, null, 4);
        this.K = b2;
        this.L = b2;
        xdr a2 = ydr.a(q5m.a);
        this.X = a2;
        this.Y = a2;
        x0q b3 = y0q.b(1, 0, null, 6);
        this.Z = b3;
        this.v0 = b3;
        this.w0 = y0q.b(1, 0, null, 6);
        x0q b4 = y0q.b(1, 0, null, 6);
        this.x0 = b4;
        this.y0 = b4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(e57 e57Var, JSONObject jSONObject, q27 q27Var, cg6 cg6Var) {
        y47 y47Var;
        int i;
        if (cg6Var instanceof y47) {
            y47Var = (y47) cg6Var;
            int i2 = y47Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y47Var.o = i2 - Integer.MIN_VALUE;
                Object obj = y47Var.m;
                Object obj2 = nm6.a;
                i = y47Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    try {
                        int i3 = q27Var.b;
                        e57Var.L(jSONObject);
                    } catch (Throwable th) {
                        th = th;
                        rn5 rn5Var = e57Var.k;
                        y47Var.j = e57Var;
                        y47Var.k = q27Var;
                        y47Var.l = th;
                        y47Var.o = 1;
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
                Throwable th2 = y47Var.l;
                q27Var = y47Var.k;
                e57 e57Var2 = y47Var.j;
                qgg.h0(obj);
                th = th2;
                e57Var = e57Var2;
                int i4 = q27Var.b;
                e57Var.L((JSONObject) obj);
                g0c g0cVar = e57Var.l;
                qne m = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(m);
                return Unit.a;
            }
        }
        y47Var = new y47(e57Var, cg6Var);
        Object obj3 = y47Var.m;
        Object obj22 = nm6.a;
        i = y47Var.o;
        if (i != 0) {
        }
        int i42 = q27Var.b;
        e57Var.L((JSONObject) obj3);
        g0c g0cVar2 = e57Var.l;
        qne m2 = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
        x60 x60Var2 = (x60) g0cVar2;
        x60Var2.getClass();
        x60Var2.a(m2);
        return Unit.a;
    }

    public static final void H(e57 e57Var, en enVar) {
        Continuation continuation = null;
        if (enVar instanceof zm) {
            int i = n47.a[((zm) enVar).a.ordinal()];
            xdr xdrVar = e57Var.F;
            ycp ycpVar = new ycp(R.string.paymentsdk_success_title);
            xdrVar.getClass();
            xdrVar.m(null, ycpVar);
            return;
        }
        int i2 = 0;
        int i3 = 3;
        if (enVar instanceof bn) {
            x97.y(ot0.F(e57Var), null, null, new z47(e57Var, enVar, continuation, i2), 3);
            return;
        }
        if (enVar instanceof xm) {
            x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, i3), 3);
            return;
        }
        if (enVar instanceof dn) {
            g0c g0cVar = e57Var.l;
            qne i1 = gut.i1("Sbp has its own fragment", null, null, null, null);
            x60 x60Var = (x60) g0cVar;
            x60Var.getClass();
            x60Var.a(i1);
            xq0.q("Sbp has its own fragment");
            return;
        }
        if (enVar instanceof ym) {
            x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, 4), 3);
            return;
        }
        int i4 = 1;
        if (!(enVar instanceof cn)) {
            if (enVar instanceof an) {
                x97.y(ot0.F(e57Var), null, null, new z47(e57Var, enVar, continuation, i4), 3);
                return;
            }
            return;
        }
        t9i t9iVar = ((cn) enVar).a;
        if (t9iVar instanceof xa4) {
            x97.y(ot0.F(e57Var), null, null, new a57(e57Var, t9iVar, continuation, i2), 3);
        } else if (t9iVar instanceof fb4) {
            x97.y(ot0.F(e57Var), null, null, new a57(e57Var, t9iVar, continuation, i4), 3);
        }
    }

    public static final Unit a(e57 e57Var, List list, wgk wgkVar, boolean z) {
        List list2;
        g0c g0cVar = e57Var.l;
        if (e57Var.w != null) {
            rfk rfkVar = e57Var.y;
            Continuation continuation = null;
            if (rfkVar != null) {
                if (wgkVar != null) {
                    qne n1 = gut.n1();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(n1);
                    if (o8g.r(o8g.w(rfkVar), list) == null) {
                        Parcelable.Creator<bfk> creator = bfk.CREATOR;
                        bfk L = y7g.L(o8g.w(e57Var.y));
                        xdr xdrVar = e57Var.F;
                        tcp tcpVar = new tcp(L);
                        xdrVar.getClass();
                        xdrVar.m(null, tcpVar);
                    } else {
                        rn5 rn5Var = e57Var.x;
                        if (rn5Var != null) {
                            rn5Var.U(t75.c(rfkVar));
                        }
                        if ((rfkVar instanceof ffk) || (((rfkVar instanceof jfk) && e57Var.A != null) || (rfkVar instanceof pfk) || (rfkVar instanceof ifk) || (rfkVar instanceof mfk))) {
                            x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, 8), 3);
                        } else if (rfkVar instanceof lfk) {
                            x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, 9), 3);
                        } else if (rfkVar instanceof kfk) {
                            x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, 10), 3);
                        } else {
                            e57Var.M();
                            e57Var.K(rfkVar);
                        }
                    }
                }
            } else if (list.isEmpty()) {
                qne k1 = gut.k1();
                x60 x60Var2 = (x60) g0cVar;
                x60Var2.getClass();
                x60Var2.a(k1);
                x97.y(ot0.F(e57Var), null, null, new q47(e57Var, continuation, 7), 3);
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
                    e57Var.M();
                } else {
                    e57Var.K((rfk) CollectionsKt.Q(arrayList));
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.f57
    public final u0q A() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.f57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(jst jstVar, Continuation continuation) {
        x47 x47Var;
        int i;
        e57 e57Var;
        String str;
        zi4 zi4Var;
        if (continuation instanceof x47) {
            x47Var = (x47) continuation;
            int i2 = x47Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x47Var.n = i2 - Integer.MIN_VALUE;
                Object obj = x47Var.l;
                nm6 nm6Var = nm6.a;
                i = x47Var.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    qne g0 = gut.g0();
                    x60 x60Var = (x60) this.l;
                    x60Var.getClass();
                    x60Var.a(g0);
                    mgk mgkVar = this.w;
                    wgk f = mgkVar != null ? mgkVar.f() : null;
                    BigDecimal bigDecimal = (f == null || (str = f.a) == null) ? BigDecimal.ZERO : new BigDecimal(str);
                    bigDecimal.getClass();
                    String str2 = f != null ? f.b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bm2 bm2Var = new bm2(bigDecimal, str2);
                    rn5 rn5Var = this.x;
                    rfk rfkVar = rn5Var != null ? (rfk) rn5Var.h : null;
                    boolean z = this.t;
                    boolean z2 = this.u;
                    x47Var.j = this;
                    x47Var.k = jstVar;
                    x47Var.n = 1;
                    osh oshVar = this.p;
                    obj = x97.V((a) oshVar.c, new aj4(rfkVar, bm2Var, z, oshVar, z2, (Continuation) null), x47Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    e57Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jstVar = x47Var.k;
                    e57Var = x47Var.j;
                    qgg.h0(obj);
                }
                zi4Var = (zi4) obj;
                if (!Intrinsics.d(zi4Var, xi4.a)) {
                    e57Var.i(jstVar);
                } else if (zi4Var instanceof yi4) {
                    sqr sqrVar = ((yi4) zi4Var).a;
                    e57Var.getClass();
                    x97.y(ot0.F(e57Var), null, null, new bv6(e57Var, sqrVar, continuation2, 13), 3);
                }
                return Unit.a;
            }
        }
        x47Var = new x47(this, continuation);
        Object obj2 = x47Var.l;
        nm6 nm6Var2 = nm6.a;
        i = x47Var.n;
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
        rfk rfkVar = this.y;
        Continuation continuation = null;
        if (rfkVar == null) {
            x97.y(ot0.F(this), null, null, new rc4(this, continuation, 28), 3);
            return;
        }
        if (!o8g.A(rfkVar)) {
            x97.y(ot0.F(this), null, null, new q47(this, continuation, 2), 3);
            return;
        }
        qne o1 = gut.o1(o8g.w(this.y));
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(o1);
        vcp vcpVar = new vcp(true, true);
        xdr xdrVar = this.F;
        xdrVar.getClass();
        xdrVar.m(null, vcpVar);
        x97.y(ot0.F(this), null, null, new q47(this, continuation, 11), 3);
    }

    @Override // defpackage.f57
    public final void E() {
        qne w0 = gut.w0();
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(w0);
    }

    public final qne J(rfk rfkVar, boolean z) {
        if (rfkVar instanceof ffk) {
            return gut.j1(yfk.EXISTING_CARD, z);
        }
        if (rfkVar instanceof mfk) {
            return gut.j1(yfk.SBP_TOKEN, z);
        }
        if (rfkVar instanceof pfk) {
            return gut.j1(yfk.YANDEX_BANK, z);
        }
        if (Intrinsics.d(rfkVar, gfk.a)) {
            return gut.j1(yfk.CASH, z);
        }
        if (Intrinsics.d(rfkVar, ifk.a)) {
            return gut.j1(yfk.GOOGLE_PAY, z);
        }
        if (Intrinsics.d(rfkVar, jfk.a)) {
            return gut.j1(yfk.NEW_CARD, z);
        }
        if (Intrinsics.d(rfkVar, lfk.a)) {
            return gut.j1(yfk.SBP, z);
        }
        if (Intrinsics.d(rfkVar, kfk.a)) {
            return gut.j1(yfk.NEW_SBP_TOKEN, z);
        }
        if (Intrinsics.d(rfkVar, ofk.a)) {
            xq0.q("TinkoffCredit not supported");
            return null;
        }
        if (!Intrinsics.d(rfkVar, nfk.a)) {
            if (Intrinsics.d(rfkVar, hfk.a)) {
                xq0.q("ChallengePollingMethod not supported");
                return null;
            }
            b6e.s();
            return null;
        }
        qne i1 = gut.i1("Split not supported", null, null, null, null);
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(i1);
        xq0.q("Split not supported");
        return null;
    }

    public final void K(rfk rfkVar) {
        if (rfkVar != null) {
            qne J = J(rfkVar, false);
            x60 x60Var = (x60) this.l;
            x60Var.getClass();
            x60Var.a(J);
            if (rfkVar.equals(jfk.a)) {
                x97.y(ot0.F(this), null, null, new q47(this, null, 6), 3);
            }
        }
    }

    public final void L(JSONObject jSONObject) {
        x97.y(ot0.F(this), null, null, new d57(this, jSONObject.getJSONObject("templates"), jSONObject.getJSONObject("card"), t75.c(new Pair("isLightTheme", String.valueOf(this.v))), (Continuation) null, 0), 3);
    }

    public final void M() {
        if (this.Y.getValue() != q5m.b) {
            xcp xcpVar = new xcp(c5b.a, 0);
            xdr xdrVar = this.F;
            xdrVar.getClass();
            xdrVar.m(null, xcpVar);
        }
    }

    @Override // defpackage.f57
    public final x0q f() {
        return this.v0;
    }

    @Override // defpackage.f57
    public final void i(jst jstVar) {
        jstVar.getClass();
        rn5 rn5Var = this.x;
        if (rn5Var != null) {
            rfk rfkVar = (rfk) rn5Var.h;
            Continuation continuation = null;
            if (rfkVar != null && (rfkVar instanceof ffk)) {
                ffk ffkVar = (ffk) rfkVar;
                zv3 zv3Var = (zv3) rn5Var.b;
                if (qdq.B(zv3Var != null ? Boolean.valueOf(zv3Var.h(ffkVar)) : null)) {
                    x97.y(ot0.F(this), null, null, new b57(this, rfkVar, continuation, 0), 3);
                    return;
                }
            }
            bnd bndVar = new bnd(20, this);
            rn5 rn5Var2 = this.x;
            rfk rfkVar2 = rn5Var2 != null ? (rfk) rn5Var2.h : null;
            boolean z = rfkVar2 instanceof lfk;
            if (z || (rfkVar2 instanceof kfk)) {
                x97.y(ot0.F(this), null, null, new b57(this, rfkVar2, continuation, 1), 3);
                return;
            }
            String str = jstVar.a;
            if (str == null) {
                str = this.z;
            }
            String str2 = str;
            vcp vcpVar = new vcp(true, z);
            xdr xdrVar = this.F;
            xdrVar.getClass();
            xdrVar.m(null, vcpVar);
            if (Intrinsics.d(rfkVar2, jfk.a) || o8g.y(rfkVar2)) {
                kpm kpmVar = this.E;
                if (kpmVar == null) {
                    Intrinsics.j("coordinator");
                    throw null;
                }
                g3j g3jVar = this.A;
                g3jVar.getClass();
                ((sbp) kpmVar.b).c.a().c(g3jVar, str2, bndVar);
                return;
            }
            if (Intrinsics.d(rfkVar2, ifk.a)) {
                kpm kpmVar2 = this.E;
                if (kpmVar2 != null) {
                    ((sbp) kpmVar2.b).c.a().a(str2, bndVar);
                    return;
                } else {
                    Intrinsics.j("coordinator");
                    throw null;
                }
            }
            if ((rfkVar2 instanceof ffk) && !o8g.y(rfkVar2)) {
                kpm kpmVar3 = this.E;
                if (kpmVar3 != null) {
                    ((sbp) kpmVar3.b).c.a().d(rfkVar2, new o47(this, 1), str2, bndVar);
                    return;
                } else {
                    Intrinsics.j("coordinator");
                    throw null;
                }
            }
            if (rfkVar2 instanceof mfk) {
                mfk mfkVar = (mfk) rfkVar2;
                this.B = mfkVar;
                String str3 = mfkVar.a;
                String str4 = mfkVar.i;
                ((jek) this.n.a).f(str3, str2, str4, new awc(new dn9(str3, str2, str4, new o47(this, 2), new o47(this, 3), new rs6(14, this), bs5.H, new o47(this, 4), new o47(this, 5))));
                return;
            }
            if (rfkVar2 instanceof pfk) {
                kpm kpmVar4 = this.E;
                if (kpmVar4 != null) {
                    ((sbp) kpmVar4.b).c.a().d(rfkVar2, e27.y, str2, bndVar);
                } else {
                    Intrinsics.j("coordinator");
                    throw null;
                }
            }
        }
    }

    @Override // defpackage.f57
    public final u0q j() {
        return this.J;
    }

    @Override // defpackage.f57
    public final void k(int i) {
        rfk rfkVar;
        rn5 rn5Var = this.x;
        if (rn5Var != null) {
            rn5Var.t(i);
        }
        rn5 rn5Var2 = this.x;
        if (rn5Var2 == null || (rfkVar = (rfk) rn5Var2.h) == null) {
            return;
        }
        qne J = J(rfkVar, true);
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(J);
    }

    @Override // defpackage.f57
    public final void l(mgk mgkVar, rn5 rn5Var, rfk rfkVar, String str, g3j g3jVar, kpm kpmVar, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Инициализация вьюмодели экрана выбора метода оплаты без рефакторинга", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "dk_select_view_model_init", "dk_select_view_model_init", k);
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(j);
        this.y = rfkVar;
        this.z = str;
        this.A = g3jVar;
        this.E = kpmVar;
        this.C = z3;
        rn5Var.b = new rp7(this);
        this.x = rn5Var;
        this.D = str2;
        this.v = z;
        this.u = z2;
        this.t = z4;
        Continuation continuation = null;
        x97.y(ot0.F(this), null, null, new rc4(rfkVar, mgkVar, this, continuation, 27), 3);
        x97.y(ot0.F(this), null, null, new q47(this, continuation, 0), 3);
    }

    @Override // defpackage.f57
    public final void p() {
        qne t0 = gut.t0();
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(t0);
    }

    @Override // defpackage.f57
    public final vdr q() {
        return this.G;
    }

    @Override // defpackage.f57
    public final x0q r() {
        return this.y0;
    }

    @Override // defpackage.f57
    public final zi3 s() {
        return this.H;
    }

    @Override // defpackage.f57
    public final void w() {
        x97.y(ot0.F(this), null, null, new q47(this, null, 1), 3);
    }

    @Override // defpackage.f57
    public final vdr x() {
        return this.Y;
    }

    @Override // defpackage.f57
    public final void z() {
        qne j1 = gut.j1(yfk.NEW_CARD, true);
        x60 x60Var = (x60) this.l;
        x60Var.getClass();
        x60Var.a(j1);
    }
}
