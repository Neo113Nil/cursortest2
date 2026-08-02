package defpackage;

import android.util.Log;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hhm extends uif implements Function1 {
    public static final hhm A;
    public static final hhm A0;
    public static final hhm B;
    public static final hhm B0;
    public static final hhm C;
    public static final hhm D;
    public static final hhm E;
    public static final hhm F;
    public static final hhm G;
    public static final hhm H;
    public static final hhm I;
    public static final hhm J;
    public static final hhm K;
    public static final hhm L;
    public static final hhm X;
    public static final hhm Y;
    public static final hhm Z;
    public static final hhm s;
    public static final hhm t;
    public static final hhm u;
    public static final hhm v;
    public static final hhm v0;
    public static final hhm w;
    public static final hhm w0;
    public static final hhm x;
    public static final hhm x0;
    public static final hhm y;
    public static final hhm y0;
    public static final hhm z;
    public static final hhm z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new hhm(i, 0);
        t = new hhm(i, 1);
        u = new hhm(i, 2);
        v = new hhm(i, 3);
        w = new hhm(i, 4);
        x = new hhm(i, 5);
        y = new hhm(i, 6);
        z = new hhm(i, 7);
        A = new hhm(i, 8);
        B = new hhm(i, 9);
        C = new hhm(i, 10);
        D = new hhm(i, 11);
        E = new hhm(i, 12);
        F = new hhm(i, 13);
        G = new hhm(i, 14);
        H = new hhm(i, 15);
        I = new hhm(i, 16);
        J = new hhm(i, 17);
        K = new hhm(i, 18);
        L = new hhm(i, 19);
        X = new hhm(i, 20);
        Y = new hhm(i, 21);
        Z = new hhm(i, 22);
        v0 = new hhm(i, 23);
        w0 = new hhm(i, 24);
        x0 = new hhm(i, 25);
        y0 = new hhm(i, 26);
        z0 = new hhm(i, 27);
        A0 = new hhm(i, 28);
        B0 = new hhm(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hhm(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Type inference failed for: r11v60, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r14v1, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r2v18, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r4v59, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r5v31, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v43, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r8v24, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r8v7, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ln0 ln0Var;
        int i;
        int i2;
        int i3;
        int i4;
        lds ldsVar;
        long j;
        int i5 = 4;
        switch (this.r) {
            case 0:
                jhm jhmVar = (jhm) obj;
                if (jhmVar.isAttachedToWindow()) {
                    jhmVar.w();
                }
                return Unit.a;
            case 1:
                ((jom) obj).getClass();
                return Unit.a;
            case 2:
                String str = (String) obj;
                str.getClass();
                return str;
            case 3:
                oum oumVar = oum.d;
                s9f[] s9fVarArr = wfp.a;
                xfp xfpVar = ufp.c;
                s9f s9fVar = wfp.a[1];
                xfpVar.getClass();
                ((jfp) obj).o(xfpVar, oumVar);
                return Unit.a;
            case 4:
                return Unit.a;
            case 5:
                opf opfVar = (opf) obj;
                nsh nshVar = opfVar.a.b;
                long B2 = nshVar.B();
                nshVar.s().r();
                try {
                    ((xzi) nshVar.b).W(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    opfVar.a();
                    vz1.A(nshVar, B2);
                    return Unit.a;
                } catch (Throwable th) {
                    vz1.A(nshVar, B2);
                    throw th;
                }
            case 6:
                return Boolean.FALSE;
            case 7:
                gjn gjnVar = (gjn) obj;
                gjnVar.getClass();
                return new bg2(gjnVar.d, gjnVar.c, gjnVar.b, bfg.y(gjnVar, "sbp_qr"), bfg.y(gjnVar, "sbp_token"), false);
            case 8:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                String o = b.o("status");
                Boolean e = b.e("google_pay_supported");
                boolean booleanValue = e != null ? e.booleanValue() : false;
                Boolean e2 = b.e("apple_pay_supported");
                boolean booleanValue2 = e2 != null ? e2.booleanValue() : false;
                List<q1f> arrayList = new ArrayList();
                List d = b.d("payment_methods");
                if (d != null) {
                    arrayList = d;
                }
                List<q1f> arrayList2 = new ArrayList();
                List d2 = b.d("enabled_payment_methods");
                if (d2 != null) {
                    arrayList2 = d2;
                }
                ArrayList arrayList3 = new ArrayList();
                for (q1f q1fVar2 : arrayList) {
                    q1fVar2.getClass();
                    arrayList3.add(bkp.a0(q1fVar2, kzj.L).d());
                }
                ArrayList arrayList4 = new ArrayList();
                my0 my0Var = new my0();
                for (q1f q1fVar3 : arrayList2) {
                    q1fVar3.getClass();
                    d6b d6bVar = (d6b) bkp.a0(q1fVar3, jx9.L).d();
                    z9h z9hVar = d6bVar.b;
                    if (z9hVar != null) {
                        w1g.B(z9hVar.b, "method", new jkr(d6bVar.a));
                        my0Var.b.add(z9hVar);
                    }
                    arrayList4.add(d6bVar);
                }
                return new gjn(o, booleanValue, booleanValue2, arrayList3, arrayList4, (String) ((uif) hah.b.a.b).invoke(my0Var));
            case 9:
                ((rnn) obj).getClass();
                return Unit.a;
            case 10:
                ((zxn) obj).getClass();
                return Boolean.TRUE;
            case 11:
                return Unit.a;
            case 12:
                return new ioo((Map) obj);
            case 13:
                return obj;
            case 14:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(1);
                List list2 = (Intrinsics.d(obj2, Boolean.FALSE) || obj2 == null) ? null : (List) ((Function1) fpo.a.c).invoke(obj2);
                Object obj3 = list.get(0);
                String str2 = obj3 != null ? (String) obj3 : null;
                str2.getClass();
                return new mn0(list2, str2);
            case 15:
                obj.getClass();
                List list3 = (List) obj;
                ArrayList arrayList5 = new ArrayList(list3.size());
                int size = list3.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj4 = list3.get(i6);
                    ln0 ln0Var2 = (Intrinsics.d(obj4, Boolean.FALSE) || obj4 == null) ? null : (ln0) ((Function1) fpo.b.c).invoke(obj4);
                    ln0Var2.getClass();
                    arrayList5.add(ln0Var2);
                }
                return arrayList5;
            case 16:
                obj.getClass();
                List list4 = (List) obj;
                Object obj5 = list4.get(0);
                un0 un0Var = obj5 != null ? (un0) obj5 : null;
                un0Var.getClass();
                Object obj6 = list4.get(2);
                Integer num = obj6 != null ? (Integer) obj6 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj7 = list4.get(3);
                Integer num2 = obj7 != null ? (Integer) obj7 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj8 = list4.get(4);
                String str3 = obj8 != null ? (String) obj8 : null;
                str3.getClass();
                switch (un0Var.ordinal()) {
                    case 0:
                        Object obj9 = list4.get(1);
                        x5k x5kVar = (Intrinsics.d(obj9, Boolean.FALSE) || obj9 == null) ? null : (x5k) ((Function1) fpo.g.c).invoke(obj9);
                        x5kVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, x5kVar, str3);
                        break;
                    case 1:
                        Object obj10 = list4.get(1);
                        c4r c4rVar = (Intrinsics.d(obj10, Boolean.FALSE) || obj10 == null) ? null : (c4r) ((Function1) fpo.h.c).invoke(obj10);
                        c4rVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, c4rVar, str3);
                        break;
                    case 2:
                        Object obj11 = list4.get(1);
                        e0u e0uVar = (Intrinsics.d(obj11, Boolean.FALSE) || obj11 == null) ? null : (e0u) ((Function1) fpo.c.c).invoke(obj11);
                        e0uVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, e0uVar, str3);
                        break;
                    case 3:
                        Object obj12 = list4.get(1);
                        ppt pptVar = (Intrinsics.d(obj12, Boolean.FALSE) || obj12 == null) ? null : (ppt) ((Function1) fpo.d.c).invoke(obj12);
                        pptVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, pptVar, str3);
                        break;
                    case 4:
                        Object obj13 = list4.get(1);
                        o7g o7gVar = (Intrinsics.d(obj13, Boolean.FALSE) || obj13 == null) ? null : (o7g) ((Function1) fpo.e.c).invoke(obj13);
                        o7gVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, o7gVar, str3);
                        break;
                    case 5:
                        Object obj14 = list4.get(1);
                        n7g n7gVar = (Intrinsics.d(obj14, Boolean.FALSE) || obj14 == null) ? null : (n7g) ((Function1) fpo.f.c).invoke(obj14);
                        n7gVar.getClass();
                        ln0Var = new ln0(intValue, intValue2, n7gVar, str3);
                        break;
                    case 6:
                        Object obj15 = list4.get(1);
                        String str4 = obj15 != null ? (String) obj15 : null;
                        str4.getClass();
                        ln0Var = new ln0(intValue, intValue2, new dkr(str4), str3);
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                return ln0Var;
            case 17:
                obj.getClass();
                return new wu2(((Float) obj).floatValue());
            case 18:
                obj.getClass();
                List list5 = (List) obj;
                Object obj16 = list5.get(0);
                String str5 = obj16 != null ? (String) obj16 : null;
                str5.getClass();
                Object obj17 = list5.get(1);
                return new n7g(str5, (Intrinsics.d(obj17, Boolean.FALSE) || obj17 == null) ? null : (hds) ((Function1) fpo.i.c).invoke(obj17));
            case 19:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new d85(d85.n);
                }
                obj.getClass();
                return new d85(c3x.f(((Integer) obj).intValue()));
            case 20:
                obj.getClass();
                return new tqc(((Integer) obj).intValue());
            case 21:
                obj.getClass();
                List list6 = (List) obj;
                Object obj18 = list6.get(0);
                e6g e6gVar = obj18 != null ? (e6g) obj18 : null;
                e6gVar.getClass();
                float f = e6gVar.a;
                Object obj19 = list6.get(1);
                g6g g6gVar = obj19 != null ? (g6g) obj19 : null;
                g6gVar.getClass();
                int i7 = g6gVar.a;
                Object obj20 = list6.get(2);
                (obj20 != null ? (f6g) obj20 : null).getClass();
                return new h6g(i7, f);
            case 22:
                obj.getClass();
                List list7 = (List) obj;
                Object obj21 = list7.get(0);
                String str6 = obj21 != null ? (String) obj21 : null;
                str6.getClass();
                Object obj22 = list7.get(1);
                return new o7g(str6, (Intrinsics.d(obj22, Boolean.FALSE) || obj22 == null) ? null : (hds) ((Function1) fpo.i.c).invoke(obj22), i5);
            case 23:
                obj.getClass();
                List list8 = (List) obj;
                ArrayList arrayList6 = new ArrayList(list8.size());
                int size2 = list8.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    Object obj23 = list8.get(i8);
                    zpg zpgVar = (Intrinsics.d(obj23, Boolean.FALSE) || obj23 == null) ? null : (zpg) ((Function1) fpo.t.c).invoke(obj23);
                    zpgVar.getClass();
                    arrayList6.add(zpgVar);
                }
                return new bqg(arrayList6);
            case 24:
                obj.getClass();
                String str7 = (String) obj;
                stk.a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str7);
                if (Intrinsics.d(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str7 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new zpg(forLanguageTag);
            case 25:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new enj(9205357640488583168L);
                }
                obj.getClass();
                List list9 = (List) obj;
                Object obj24 = list9.get(0);
                Float f2 = obj24 != null ? (Float) obj24 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                Object obj25 = list9.get(1);
                (obj25 != null ? (Float) obj25 : null).getClass();
                return new enj((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r11.floatValue()) & 4294967295L));
            case 26:
                obj.getClass();
                List list10 = (List) obj;
                Object obj26 = list10.get(0);
                o9s o9sVar = obj26 != null ? (o9s) obj26 : null;
                o9sVar.getClass();
                int i9 = o9sVar.a;
                Object obj27 = list10.get(1);
                fas fasVar = obj27 != null ? (fas) obj27 : null;
                fasVar.getClass();
                int i10 = fasVar.a;
                Object obj28 = list10.get(2);
                les[] lesVarArr = kes.b;
                cpo cpoVar = fpo.q;
                Boolean bool = Boolean.FALSE;
                kes kesVar = ((Intrinsics.d(obj28, bool) && cpoVar == null) || obj28 == null) ? null : (kes) cpoVar.b.invoke(obj28);
                kesVar.getClass();
                long j2 = kesVar.a;
                Object obj29 = list10.get(3);
                fcs fcsVar = fcs.c;
                fcs fcsVar2 = (Intrinsics.d(obj29, bool) || obj29 == null) ? null : (fcs) ((Function1) fpo.l.c).invoke(obj29);
                Object obj30 = list10.get(4);
                duk dukVar = (Intrinsics.d(obj30, bool) || obj30 == null) ? null : (duk) ((Function1) gpo.a.c).invoke(obj30);
                Object obj31 = list10.get(5);
                h6g h6gVar = h6g.c;
                h6g h6gVar2 = (Intrinsics.d(obj31, bool) || obj31 == null) ? null : (h6g) ((Function1) fpo.u.c).invoke(obj31);
                Object obj32 = list10.get(6);
                int i11 = u5g.b;
                u5g u5gVar = (Intrinsics.d(obj32, bool) || obj32 == null) ? null : (u5g) ((Function1) gpo.b.c).invoke(obj32);
                u5gVar.getClass();
                int i12 = u5gVar.a;
                Object obj33 = list10.get(7);
                f8e f8eVar = obj33 != null ? (f8e) obj33 : null;
                f8eVar.getClass();
                int i13 = f8eVar.a;
                Object obj34 = list10.get(8);
                apo apoVar = gpo.c;
                if (Intrinsics.d(obj34, bool) || obj34 == null) {
                    i = i9;
                    i2 = i10;
                    i3 = i12;
                    i4 = i13;
                    j = j2;
                    ldsVar = null;
                } else {
                    i = i9;
                    i2 = i10;
                    i3 = i12;
                    i4 = i13;
                    ldsVar = (lds) ((Function1) apoVar.c).invoke(obj34);
                    j = j2;
                }
                return new x5k(i, i2, j, fcsVar2, dukVar, h6gVar2, i3, i4, ldsVar);
            case 27:
                obj.getClass();
                List list11 = (List) obj;
                Object obj35 = list11.get(0);
                int i14 = d85.o;
                cpo cpoVar2 = fpo.p;
                Boolean bool2 = Boolean.FALSE;
                d85 d85Var = ((Intrinsics.d(obj35, bool2) && cpoVar2 == null) || obj35 == null) ? null : (d85) cpoVar2.b.invoke(obj35);
                d85Var.getClass();
                long j3 = d85Var.a;
                Object obj36 = list11.get(1);
                cpo cpoVar3 = fpo.r;
                enj enjVar = ((Intrinsics.d(obj36, bool2) && cpoVar3 == null) || obj36 == null) ? null : (enj) cpoVar3.b.invoke(obj36);
                enjVar.getClass();
                long j4 = enjVar.a;
                Object obj37 = list11.get(2);
                Float f3 = obj37 != null ? (Float) obj37 : null;
                f3.getClass();
                return new otp(j3, j4, f3.floatValue());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                obj.getClass();
                List list12 = (List) obj;
                Object obj38 = list12.get(0);
                int i15 = d85.o;
                cpo cpoVar4 = fpo.p;
                Boolean bool3 = Boolean.FALSE;
                d85 d85Var2 = ((Intrinsics.d(obj38, bool3) && cpoVar4 == null) || obj38 == null) ? null : (d85) cpoVar4.b.invoke(obj38);
                d85Var2.getClass();
                long j5 = d85Var2.a;
                Object obj39 = list12.get(1);
                les[] lesVarArr2 = kes.b;
                cpo cpoVar5 = fpo.q;
                kes kesVar2 = ((Intrinsics.d(obj39, bool3) && cpoVar5 == null) || obj39 == null) ? null : (kes) cpoVar5.b.invoke(obj39);
                kesVar2.getClass();
                long j6 = kesVar2.a;
                Object obj40 = list12.get(2);
                tqc tqcVar = tqc.b;
                tqc tqcVar2 = (Intrinsics.d(obj40, bool3) || obj40 == null) ? null : (tqc) ((Function1) fpo.m.c).invoke(obj40);
                Object obj41 = list12.get(3);
                oqc oqcVar = obj41 != null ? (oqc) obj41 : null;
                Object obj42 = list12.get(4);
                pqc pqcVar = obj42 != null ? (pqc) obj42 : null;
                Object obj43 = list12.get(6);
                String str8 = obj43 != null ? (String) obj43 : null;
                Object obj44 = list12.get(7);
                kes kesVar3 = ((Intrinsics.d(obj44, bool3) && cpoVar5 == null) || obj44 == null) ? null : (kes) cpoVar5.b.invoke(obj44);
                kesVar3.getClass();
                long j7 = kesVar3.a;
                Object obj45 = list12.get(8);
                wu2 wu2Var = (Intrinsics.d(obj45, bool3) || obj45 == null) ? null : (wu2) ((Function1) fpo.n.c).invoke(obj45);
                Object obj46 = list12.get(9);
                ccs ccsVar = (Intrinsics.d(obj46, bool3) || obj46 == null) ? null : (ccs) ((Function1) fpo.k.c).invoke(obj46);
                Object obj47 = list12.get(10);
                bqg bqgVar = bqg.c;
                bqg bqgVar2 = (Intrinsics.d(obj47, bool3) || obj47 == null) ? null : (bqg) ((Function1) fpo.s.c).invoke(obj47);
                Object obj48 = list12.get(11);
                d85 d85Var3 = ((Intrinsics.d(obj48, bool3) && cpoVar4 == null) || obj48 == null) ? null : (d85) cpoVar4.b.invoke(obj48);
                d85Var3.getClass();
                long j8 = d85Var3.a;
                Object obj49 = list12.get(12);
                aas aasVar = (Intrinsics.d(obj49, bool3) || obj49 == null) ? null : (aas) ((Function1) fpo.j.c).invoke(obj49);
                Object obj50 = list12.get(13);
                otp otpVar = otp.d;
                return new c4r(j5, j6, tqcVar2, oqcVar, pqcVar, (qpc) null, str8, j7, wu2Var, ccsVar, bqgVar2, j8, aasVar, (Intrinsics.d(obj50, bool3) || obj50 == null) ? null : (otp) ((Function1) fpo.o.c).invoke(obj50), 49184);
            default:
                obj.getClass();
                return new aas(((Integer) obj).intValue());
        }
    }
}
