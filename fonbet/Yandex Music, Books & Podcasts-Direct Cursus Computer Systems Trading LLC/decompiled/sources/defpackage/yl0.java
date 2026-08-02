package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class yl0 extends uif implements pyc {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yl0(y5 y5Var, Function0 function0) {
        super(3);
        this.r = 1;
        this.s = y5Var;
        this.t = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r13v22, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.r) {
            case 0:
                mfh mfhVar = (mfh) obj;
                ksk M = ((ffh) obj2).M(((ga6) obj3).a);
                long j = (!mfhVar.F() || ((Boolean) ((Function1) this.s).invoke(((d8t) this.t).d.getValue())).booleanValue()) ? (M.a << 32) | (M.b & 4294967295L) : 0L;
                return mfh.m0(mfhVar, (int) (j >> 32), (int) (4294967295L & j), new ai0(M, 1));
            case 1:
                df6 df6Var = (df6) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(df6Var) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    String str = (String) ((y5) this.s).invoke(oq5Var, 0);
                    if (StringsKt.U(str)) {
                        vme.c("Label must not be blank");
                    }
                    pf6.b(str, df6Var, (uif) this.t, oq5Var, (intValue << 6) & 896);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            case 2:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Number) obj3).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Object K = oq5Var2.K();
                    if (K == gq5.a) {
                        K = new if6();
                        oq5Var2.k0(K);
                    }
                    if6 if6Var = (if6) K;
                    ?? r13 = (uif) this.s;
                    df6 df6Var2 = (df6) this.t;
                    if6Var.a.clear();
                    r13.invoke(if6Var);
                    if6Var.a(df6Var2, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                return Unit.a;
            case 3:
                Function1 function1 = (Function1) obj2;
                Function1 function12 = (Function1) obj3;
                ((mif) obj).getClass();
                function1.getClass();
                function12.getClass();
                try {
                    byte[] bytes = ((String) this.s).getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    function1.invoke(qk7.a((qk7) this.t, bytes));
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = th.getClass().getName();
                    }
                    function12.invoke(new r7w(message, th));
                }
                return Unit.a;
            case 4:
                lfm lfmVar = (lfm) obj;
                lfm lfmVar2 = (lfm) obj2;
                long j2 = ((enj) obj3).a;
                hoa hoaVar = (hoa) this.s;
                if (((Boolean) hoaVar.r.invoke(lfmVar)).booleanValue()) {
                    if (!hoaVar.w) {
                        if (hoaVar.u == null) {
                            hoaVar.u = men.g(Integer.MAX_VALUE, 6, null);
                        }
                        hoaVar.w = true;
                        x97.y(hoaVar.G0(), null, null, new goa(hoaVar, null), 3);
                    }
                    ezf.r((x8a) this.t, lfmVar);
                    long g = enj.g(lfmVar2.c, j2);
                    zi3 zi3Var = hoaVar.u;
                    if (zi3Var != null) {
                        zi3Var.c(new yma(g));
                    }
                }
                return Unit.a;
            case 5:
                Function1 function13 = (Function1) obj2;
                Function1 function14 = (Function1) obj3;
                ((mif) obj).getClass();
                function13.getClass();
                function14.getClass();
                qdq.A(new zg((ond) this.s, (wwj) this.t, function13, function14, 9));
                return Unit.a;
            case 6:
                ((Number) obj3).intValue();
                oq5 oq5Var3 = (oq5) ((hq5) obj2);
                oq5Var3.Z(-353972293);
                zie a = ((yie) this.s).a((uoi) this.t, oq5Var3);
                boolean f = oq5Var3.f(a);
                Object K2 = oq5Var3.K();
                if (f || K2 == gq5.a) {
                    K2 = new aje(a);
                    oq5Var3.k0(K2);
                }
                aje ajeVar = (aje) K2;
                oq5Var3.p(false);
                return ajeVar;
            case 7:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                float floatValue3 = ((Number) obj3).floatValue();
                o3k o3kVar = (o3k) this.s;
                xof xofVar = (xof) this.t;
                boolean A = ywf.A(o3kVar, floatValue);
                if (o3kVar.l().e != bxj.a && xofVar != xof.a) {
                    A = !A;
                }
                int i = o3kVar.l().b;
                float t = i == 0 ? 0.0f : ywf.t(o3kVar) / i;
                float f2 = t - ((int) t);
                char c = Math.abs(floatValue) >= o3kVar.q.n0(w1r.a) ? floatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                } else if (Math.abs(f2) <= 0.5f) {
                    floatValue2 = floatValue3;
                    break;
                } else {
                    floatValue2 = floatValue3;
                }
                return Float.valueOf(floatValue2);
            case 8:
                ((Number) obj3).intValue();
                oq5 oq5Var4 = (oq5) ((hq5) obj2);
                oq5Var4.Z(759876635);
                Function0 function0 = (Function0) this.t;
                Object K3 = oq5Var4.K();
                kjn kjnVar = gq5.a;
                if (K3 == kjnVar) {
                    K3 = szf.U(function0);
                    oq5Var4.k0(K3);
                }
                sdr sdrVar = (sdr) K3;
                Object K4 = oq5Var4.K();
                if (K4 == kjnVar) {
                    K4 = new fk0(new enj(((enj) sdrVar.getValue()).a), uep.b, new enj(uep.c), 8);
                    oq5Var4.k0(K4);
                }
                fk0 fk0Var = (fk0) K4;
                Unit unit = Unit.a;
                boolean h = oq5Var4.h(fk0Var);
                Object K5 = oq5Var4.K();
                if (h || K5 == kjnVar) {
                    K5 = new kun(sdrVar, fk0Var, null, 16);
                    oq5Var4.k0(K5);
                }
                gld.w(oq5Var4, unit, (Function2) K5);
                vm0 vm0Var = fk0Var.c;
                Function1 function15 = (Function1) this.s;
                boolean f3 = oq5Var4.f(vm0Var);
                Object K6 = oq5Var4.K();
                if (f3 || K6 == kjnVar) {
                    K6 = new sep(vm0Var, 0);
                    oq5Var4.k0(K6);
                }
                yci yciVar = (yci) function15.invoke((Function0) K6);
                oq5Var4.p(false);
                return yciVar;
            case 9:
                c4r c4rVar = (c4r) obj;
                int intValue3 = ((Number) obj2).intValue();
                int intValue4 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.s;
                lh0 lh0Var = (lh0) this.t;
                qpc qpcVar = c4rVar.f;
                tqc tqcVar = c4rVar.c;
                if (tqcVar == null) {
                    tqcVar = tqc.m;
                }
                oqc oqcVar = c4rVar.d;
                int i2 = oqcVar != null ? oqcVar.a : 0;
                pqc pqcVar = c4rVar.e;
                int i3 = pqcVar != null ? pqcVar.a : 65535;
                mh0 mh0Var = (mh0) lh0Var.s;
                odt b = ((rpc) mh0Var.e).b(qpcVar, tqcVar, i2, i3);
                if (b instanceof ndt) {
                    Object obj4 = ((ndt) b).a;
                    obj4.getClass();
                    typeface = (Typeface) obj4;
                } else {
                    lum lumVar = new lum(b, mh0Var.j);
                    mh0Var.j = lumVar;
                    Object obj5 = lumVar.c;
                    obj5.getClass();
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new pdt(typeface, 1), intValue3, intValue4, 33);
                return Unit.a;
            default:
                ((Number) obj3).intValue();
                uoi uoiVar = (uoi) this.t;
                oq5 oq5Var5 = (oq5) ((hq5) obj2);
                oq5Var5.Z(-102778667);
                Object K7 = oq5Var5.K();
                kjn kjnVar2 = gq5.a;
                if (K7 == kjnVar2) {
                    K7 = gld.R(g.a, oq5Var5);
                    oq5Var5.k0(K7);
                }
                mm6 mm6Var = (mm6) K7;
                Object K8 = oq5Var5.K();
                if (K8 == kjnVar2) {
                    K8 = szf.g0(null);
                    oq5Var5.k0(K8);
                }
                aqi aqiVar = (aqi) K8;
                aqi o0 = szf.o0((Function1) this.s, oq5Var5);
                boolean f4 = oq5Var5.f(uoiVar);
                Object K9 = oq5Var5.K();
                if (f4 || K9 == kjnVar2) {
                    K9 = new gcp(13, aqiVar, uoiVar);
                    oq5Var5.k0(K9);
                }
                gld.k(uoiVar, (Function1) K9, oq5Var5);
                boolean h2 = oq5Var5.h(mm6Var) | oq5Var5.f(uoiVar) | oq5Var5.f(o0);
                Object K10 = oq5Var5.K();
                if (h2 || K10 == kjnVar2) {
                    K10 = new ibs(mm6Var, aqiVar, uoiVar, o0);
                    oq5Var5.k0(K10);
                }
                yci a2 = eur.a(vci.a, uoiVar, (PointerInputEventHandler) K10);
                oq5Var5.p(false);
                return a2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yl0(int i, Object obj, Object obj2) {
        super(3);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yl0(df6 df6Var, Function1 function1) {
        super(3);
        this.r = 2;
        this.s = (uif) function1;
        this.t = df6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(Function0 function0, Function1 function1) {
        super(3);
        this.r = 8;
        this.t = function0;
        this.s = function1;
    }
}
