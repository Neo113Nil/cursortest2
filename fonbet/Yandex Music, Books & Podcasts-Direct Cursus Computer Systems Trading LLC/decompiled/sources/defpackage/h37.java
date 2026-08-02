package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h37 extends bfu {
    public final xdr A;
    public final x0q B;
    public String C;
    public Map D;
    public final rn5 k;
    public final g0c l;
    public final tc1 m;
    public final sdk n;
    public boolean o = true;
    public boolean p = true;
    public rn5 q;
    public boolean r;
    public String s;
    public final xdr t;
    public final xdr u;
    public final x0q v;
    public final x0q w;
    public final x0q x;
    public final x0q y;
    public final xdr z;

    public h37(rn5 rn5Var, g0c g0cVar, tc1 tc1Var, sdk sdkVar) {
        this.k = rn5Var;
        this.l = g0cVar;
        this.m = tc1Var;
        this.n = sdkVar;
        xdr a = ydr.a(rpm.a);
        this.t = a;
        this.u = a;
        x0q b = y0q.b(0, 0, null, 7);
        this.v = b;
        this.w = b;
        x0q b2 = y0q.b(1, 1, null, 4);
        this.x = b2;
        this.y = b2;
        xdr a2 = ydr.a(q5m.a);
        this.z = a2;
        this.A = a2;
        this.B = y0q.b(1, 0, null, 6);
    }

    public static qne G(rfk rfkVar, boolean z) {
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
        if (Intrinsics.d(rfkVar, nfk.a)) {
            xq0.q("Split not supported");
            return null;
        }
        if (Intrinsics.d(rfkVar, hfk.a)) {
            xq0.q("ChallengePollingMethod not supported");
            return null;
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(6:19|20|(1:22)|13|14|15))(2:23|24))(3:27|28|(1:30))|25|14|15))|36|6|7|(0)(0)|25|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r10 = r7.k;
        r0.j = r7;
        r0.k = r9;
        r0.l = r8;
        r0.o = 2;
        r10 = r10.x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r10 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(h37 h37Var, JSONObject jSONObject, q27 q27Var, cg6 cg6Var) {
        f37 f37Var;
        int i;
        h37 h37Var2;
        Throwable th;
        if (cg6Var instanceof f37) {
            f37Var = (f37) cg6Var;
            int i2 = f37Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f37Var.o = i2 - Integer.MIN_VALUE;
                Object obj = f37Var.m;
                nm6 nm6Var = nm6.a;
                i = f37Var.o;
                if (i != 0) {
                    qgg.h0(obj);
                    int i3 = q27Var.b;
                    f37Var.j = h37Var;
                    f37Var.k = q27Var;
                    f37Var.o = 1;
                    Object J = h37Var.J(jSONObject, i3, f37Var);
                    h37Var = J;
                    if (J == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th = (Throwable) f37Var.k;
                            h37Var2 = f37Var.j;
                            qgg.h0(obj);
                            g0c g0cVar = h37Var2.l;
                            qne m = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
                            x60 x60Var = (x60) g0cVar;
                            x60Var.getClass();
                            x60Var.a(m);
                            return Unit.a;
                        }
                        th = f37Var.l;
                        q27 q27Var2 = (q27) f37Var.k;
                        h37 h37Var3 = f37Var.j;
                        qgg.h0(obj);
                        q27Var = q27Var2;
                        h37Var2 = h37Var3;
                        int i4 = q27Var.b;
                        f37Var.j = h37Var2;
                        f37Var.k = th;
                        f37Var.l = null;
                        f37Var.o = 3;
                        if (h37Var2.J((JSONObject) obj, i4, f37Var) == nm6Var) {
                            return nm6Var;
                        }
                        g0c g0cVar2 = h37Var2.l;
                        qne m2 = qne.m(gut.V0(dq8.SELECT), th.getMessage(), 2);
                        x60 x60Var2 = (x60) g0cVar2;
                        x60Var2.getClass();
                        x60Var2.a(m2);
                        return Unit.a;
                    }
                    q27Var = (q27) f37Var.k;
                    h37 h37Var4 = f37Var.j;
                    qgg.h0(obj);
                    h37Var = h37Var4;
                }
                return Unit.a;
            }
        }
        f37Var = new f37(h37Var, cg6Var);
        Object obj2 = f37Var.m;
        nm6 nm6Var2 = nm6.a;
        i = f37Var.o;
        if (i != 0) {
        }
        return Unit.a;
    }

    public final void H(rfk rfkVar, boolean z) {
        if (rfkVar != null) {
            qne G = G(rfkVar, z);
            x60 x60Var = (x60) this.l;
            x60Var.getClass();
            x60Var.a(G);
            x97.y(ot0.F(this), null, null, new cg1(rfkVar, this, z, (Continuation) null, 5), 3);
        }
    }

    public final Object J(JSONObject jSONObject, int i, f37 f37Var) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("templates");
        JSONObject jSONObject3 = jSONObject.getJSONObject("card");
        Pair pair = new Pair("select_method_screen_selected_method", String.valueOf(i));
        Pair pair2 = new Pair("isLightTheme", String.valueOf(this.p));
        Pair pair3 = new Pair("select_method_screen_should_wait_for_order_amount", PListParser.TAG_FALSE);
        String str = this.C;
        List h = u75.h(pair, pair2, pair3, new Pair("select_method_screen_show_select_button_text", String.valueOf(str == null || StringsKt.U(str))), new Pair("select_method_screen_order_amount", ""));
        jSONObject2.getClass();
        jSONObject3.getClass();
        Object emit = this.x.emit(new tv8(jSONObject2, jSONObject3, h), f37Var);
        return emit == nm6.a ? emit : Unit.a;
    }
}
