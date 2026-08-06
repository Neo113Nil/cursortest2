package defpackage;

import android.content.res.Resources;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class dx0 implements hv {
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ dx0(int i) {
        this.OOA6hdeuvCS = i;
    }

    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        t3 t3Var;
        int i = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        r12 = null;
        rp rpVar = null;
        r12 = null;
        x11 x11Var = null;
        r12 = null;
        q81 q81Var = null;
        r12 = null;
        oa0 oa0Var = null;
        r12 = null;
        pa0 pa0Var = null;
        r12 = null;
        dd1 dd1Var = null;
        r12 = null;
        be1 be1Var = null;
        r12 = null;
        w41 w41Var = null;
        r12 = null;
        yn0 yn0Var = null;
        r12 = null;
        o81 o81Var = null;
        switch (i) {
            case 0:
                return o30.rQPn8YBR(obj, 0) ? new b91(8589934592L) : o30.rQPn8YBR(obj, 1) ? new b91(4294967296L) : new b91(0L);
            case 1:
                if (o30.rQPn8YBR(obj, Boolean.FALSE)) {
                    return new uk0(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                (obj3 != null ? (Float) obj3 : null).getClass();
                return new uk0((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r12.floatValue()) & 4294967295L));
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj4 = list2.get(i2);
                    fb0 fb0Var = (o30.rQPn8YBR(obj4, Boolean.FALSE) || obj4 == null) ? null : (fb0) ((hv) hx0.arNh8D4Z5gB.AvO7iQsrTN).mOu10nynGul(obj4);
                    fb0Var.getClass();
                    arrayList.add(fb0Var);
                }
                return new gb0(arrayList);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                String str = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str);
                if (o30.rQPn8YBR(forLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new fb0(forLanguageTag);
            case 4:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                String str2 = obj5 != null ? (String) obj5 : null;
                str2.getClass();
                Object obj6 = list3.get(1);
                d dVar = hx0.mOu10nynGul;
                if (!o30.rQPn8YBR(obj6, Boolean.FALSE) && obj6 != null) {
                    o81Var = (o81) ((hv) dVar.AvO7iQsrTN).mOu10nynGul(obj6);
                }
                return new oa0(str2, o81Var);
            case 5:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f2 = ga0.Yi7zF1RB1;
                gx0 gx0Var = hx0.M3K9sHhK;
                Boolean bool = Boolean.FALSE;
                o30.rQPn8YBR(obj7, bool);
                ga0 ga0Var = obj7 != null ? (ga0) gx0Var.EljAMC1QTz.mOu10nynGul(obj7) : null;
                ga0Var.getClass();
                float f3 = ga0Var.GWasM1elztuh;
                Object obj8 = list4.get(1);
                gx0 gx0Var2 = hx0.k8h8IjolWQ;
                o30.rQPn8YBR(obj8, bool);
                ia0 ia0Var = obj8 != null ? (ia0) gx0Var2.EljAMC1QTz.mOu10nynGul(obj8) : null;
                ia0Var.getClass();
                int i3 = ia0Var.GWasM1elztuh;
                Object obj9 = list4.get(2);
                gx0 gx0Var3 = hx0.EXrPz3p7hFb;
                o30.rQPn8YBR(obj9, bool);
                ha0 ha0Var = obj9 != null ? (ha0) gx0Var3.EljAMC1QTz.mOu10nynGul(obj9) : null;
                ha0Var.getClass();
                return new ja0(f3, i3, ha0Var.GWasM1elztuh);
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                float floatValue2 = ((Float) obj).floatValue();
                ga0.GWasM1elztuh(floatValue2);
                return new ga0(floatValue2);
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                return new ia0(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                w3 w3Var = obj10 != null ? (w3) obj10 : null;
                w3Var.getClass();
                Object obj11 = list5.get(2);
                Integer num = obj11 != null ? (Integer) obj11 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj12 = list5.get(3);
                Integer num2 = obj12 != null ? (Integer) obj12 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj13 = list5.get(4);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                switch (w3Var.ordinal()) {
                    case 0:
                        Object obj14 = list5.get(1);
                        d dVar2 = hx0.AvO7iQsrTN;
                        if (!o30.rQPn8YBR(obj14, Boolean.FALSE) && obj14 != null) {
                            yn0Var = (yn0) ((hv) dVar2.AvO7iQsrTN).mOu10nynGul(obj14);
                        }
                        yn0Var.getClass();
                        t3Var = new t3(yn0Var, intValue, intValue2, str3);
                        break;
                    case 1:
                        Object obj15 = list5.get(1);
                        d dVar3 = hx0.encWxUiV2;
                        if (!o30.rQPn8YBR(obj15, Boolean.FALSE) && obj15 != null) {
                            w41Var = (w41) ((hv) dVar3.AvO7iQsrTN).mOu10nynGul(obj15);
                        }
                        w41Var.getClass();
                        t3Var = new t3(w41Var, intValue, intValue2, str3);
                        break;
                    case 2:
                        Object obj16 = list5.get(1);
                        d dVar4 = hx0.X1lG3V04pd;
                        if (!o30.rQPn8YBR(obj16, Boolean.FALSE) && obj16 != null) {
                            be1Var = (be1) ((hv) dVar4.AvO7iQsrTN).mOu10nynGul(obj16);
                        }
                        be1Var.getClass();
                        t3Var = new t3(be1Var, intValue, intValue2, str3);
                        break;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj17 = list5.get(1);
                        d dVar5 = hx0.xqGvceK5x;
                        if (!o30.rQPn8YBR(obj17, Boolean.FALSE) && obj17 != null) {
                            dd1Var = (dd1) ((hv) dVar5.AvO7iQsrTN).mOu10nynGul(obj17);
                        }
                        dd1Var.getClass();
                        t3Var = new t3(dd1Var, intValue, intValue2, str3);
                        break;
                    case 4:
                        Object obj18 = list5.get(1);
                        d dVar6 = hx0.OOA6hdeuvCS;
                        if (!o30.rQPn8YBR(obj18, Boolean.FALSE) && obj18 != null) {
                            pa0Var = (pa0) ((hv) dVar6.AvO7iQsrTN).mOu10nynGul(obj18);
                        }
                        pa0Var.getClass();
                        t3Var = new t3(pa0Var, intValue, intValue2, str3);
                        break;
                    case 5:
                        Object obj19 = list5.get(1);
                        d dVar7 = hx0.EljAMC1QTz;
                        if (!o30.rQPn8YBR(obj19, Boolean.FALSE) && obj19 != null) {
                            oa0Var = (oa0) ((hv) dVar7.AvO7iQsrTN).mOu10nynGul(obj19);
                        }
                        oa0Var.getClass();
                        t3Var = new t3(oa0Var, intValue, intValue2, str3);
                        break;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj20 = list5.get(1);
                        String str4 = obj20 != null ? (String) obj20 : null;
                        str4.getClass();
                        t3Var = new t3(new z51(str4), intValue, intValue2, str3);
                        break;
                    default:
                        o4.xqGvceK5x();
                        return null;
                }
                return t3Var;
            case 9:
                obj.getClass();
                return new ha0(((Integer) obj).intValue());
            case 10:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new be1(str5);
            case 11:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new dd1(str6);
            case 12:
                obj.getClass();
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                gx0 gx0Var4 = hx0.YmKjaVtbfp5Z;
                Boolean bool2 = Boolean.FALSE;
                o30.rQPn8YBR(obj21, bool2);
                x71 x71Var = obj21 != null ? (x71) gx0Var4.EljAMC1QTz.mOu10nynGul(obj21) : null;
                x71Var.getClass();
                int i4 = x71Var.GWasM1elztuh;
                Object obj22 = list6.get(1);
                gx0 gx0Var5 = hx0.Mjvvu5DE;
                o30.rQPn8YBR(obj22, bool2);
                c81 c81Var = obj22 != null ? (c81) gx0Var5.EljAMC1QTz.mOu10nynGul(obj22) : null;
                c81Var.getClass();
                int i5 = c81Var.GWasM1elztuh;
                Object obj23 = list6.get(2);
                b91[] b91VarArr = a91.Yi7zF1RB1;
                gx0 gx0Var6 = hx0.cilMamHF;
                o30.rQPn8YBR(obj23, bool2);
                a91 a91Var = obj23 != null ? (a91) gx0Var6.EljAMC1QTz.mOu10nynGul(obj23) : null;
                a91Var.getClass();
                long j = a91Var.GWasM1elztuh;
                Object obj24 = list6.get(3);
                f81 f81Var = f81.X1lG3V04pd;
                f81 f81Var2 = (o30.rQPn8YBR(obj24, bool2) || obj24 == null) ? null : (f81) ((hv) hx0.E7jCp8Ls.AvO7iQsrTN).mOu10nynGul(obj24);
                Object obj25 = list6.get(4);
                bq0 bq0Var = (o30.rQPn8YBR(obj25, bool2) || obj25 == null) ? null : (bq0) ((hv) p.iwATDS1i01k.AvO7iQsrTN).mOu10nynGul(obj25);
                Object obj26 = list6.get(5);
                ja0 ja0Var = ja0.xqGvceK5x;
                ja0 ja0Var2 = (o30.rQPn8YBR(obj26, bool2) || obj26 == null) ? null : (ja0) ((hv) hx0.pog2g9KITJA.AvO7iQsrTN).mOu10nynGul(obj26);
                Object obj27 = list6.get(6);
                ea0 ea0Var = (o30.rQPn8YBR(obj27, bool2) || obj27 == null) ? null : (ea0) ((hv) p.YmKjaVtbfp5Z.AvO7iQsrTN).mOu10nynGul(obj27);
                ea0Var.getClass();
                int i6 = ea0Var.GWasM1elztuh;
                Object obj28 = list6.get(7);
                gx0 gx0Var7 = hx0.mE4lRynR;
                o30.rQPn8YBR(obj28, bool2);
                a00 a00Var = obj28 != null ? (a00) gx0Var7.EljAMC1QTz.mOu10nynGul(obj28) : null;
                a00Var.getClass();
                int i7 = a00Var.GWasM1elztuh;
                Object obj29 = list6.get(8);
                d dVar8 = p.Mjvvu5DE;
                if (!o30.rQPn8YBR(obj29, bool2) && obj29 != null) {
                    q81Var = (q81) ((hv) dVar8.AvO7iQsrTN).mOu10nynGul(obj29);
                }
                return new yn0(i4, i5, j, f81Var2, bq0Var, ja0Var2, i6, i7, q81Var);
            case 13:
                obj.getClass();
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i8 = yb.encWxUiV2;
                Boolean bool3 = Boolean.FALSE;
                o30.rQPn8YBR(obj30, bool3);
                yb ybVar = obj30 != null ? obj30.equals(bool3) ? new yb(yb.AvO7iQsrTN) : new yb(ki1.X1lG3V04pd(((Integer) obj30).intValue())) : null;
                ybVar.getClass();
                long j2 = ybVar.GWasM1elztuh;
                Object obj31 = list7.get(1);
                b91[] b91VarArr2 = a91.Yi7zF1RB1;
                hv hvVar = hx0.cilMamHF.EljAMC1QTz;
                o30.rQPn8YBR(obj31, bool3);
                a91 a91Var2 = obj31 != null ? (a91) hvVar.mOu10nynGul(obj31) : null;
                a91Var2.getClass();
                long j3 = a91Var2.GWasM1elztuh;
                Object obj32 = list7.get(2);
                ou ouVar = ou.EljAMC1QTz;
                ou ouVar2 = (o30.rQPn8YBR(obj32, bool3) || obj32 == null) ? null : (ou) ((hv) hx0.XnEVoBF0td1l.AvO7iQsrTN).mOu10nynGul(obj32);
                Object obj33 = list7.get(3);
                mu muVar = (o30.rQPn8YBR(obj33, bool3) || obj33 == null) ? null : (mu) ((hv) hx0.jivtDDk9H.AvO7iQsrTN).mOu10nynGul(obj33);
                Object obj34 = list7.get(4);
                nu nuVar = (o30.rQPn8YBR(obj34, bool3) || obj34 == null) ? null : (nu) ((hv) hx0.Y6hRI1cF8.AvO7iQsrTN).mOu10nynGul(obj34);
                Object obj35 = list7.get(6);
                String str7 = obj35 != null ? (String) obj35 : null;
                Object obj36 = list7.get(7);
                o30.rQPn8YBR(obj36, bool3);
                a91 a91Var3 = obj36 != null ? (a91) hvVar.mOu10nynGul(obj36) : null;
                a91Var3.getClass();
                long j4 = a91Var3.GWasM1elztuh;
                Object obj37 = list7.get(8);
                i6 i6Var = (o30.rQPn8YBR(obj37, bool3) || obj37 == null) ? null : (i6) ((hv) hx0.uFEq9NpZ.AvO7iQsrTN).mOu10nynGul(obj37);
                Object obj38 = list7.get(9);
                e81 e81Var = (o30.rQPn8YBR(obj38, bool3) || obj38 == null) ? null : (e81) ((hv) hx0.rQPn8YBR.AvO7iQsrTN).mOu10nynGul(obj38);
                Object obj39 = list7.get(10);
                gb0 gb0Var = gb0.AvO7iQsrTN;
                gb0 gb0Var2 = (o30.rQPn8YBR(obj39, bool3) || obj39 == null) ? null : (gb0) ((hv) hx0.WRKkgoJXwDn.AvO7iQsrTN).mOu10nynGul(obj39);
                Object obj40 = list7.get(11);
                o30.rQPn8YBR(obj40, bool3);
                yb ybVar2 = obj40 != null ? obj40.equals(bool3) ? new yb(yb.AvO7iQsrTN) : new yb(ki1.X1lG3V04pd(((Integer) obj40).intValue())) : null;
                ybVar2.getClass();
                long j5 = ybVar2.GWasM1elztuh;
                Object obj41 = list7.get(12);
                a81 a81Var = (o30.rQPn8YBR(obj41, bool3) || obj41 == null) ? null : (a81) ((hv) hx0.JFJ3QoxA.AvO7iQsrTN).mOu10nynGul(obj41);
                Object obj42 = list7.get(13);
                x11 x11Var2 = x11.xqGvceK5x;
                d dVar9 = hx0.iwATDS1i01k;
                if (!o30.rQPn8YBR(obj42, bool3) && obj42 != null) {
                    x11Var = (x11) ((hv) dVar9.AvO7iQsrTN).mOu10nynGul(obj42);
                }
                return new w41(j2, j3, ouVar2, muVar, nuVar, (o71) null, str7, j4, i6Var, e81Var, gb0Var2, j5, a81Var, x11Var, 49184);
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                Boolean bool4 = obj43 != null ? (Boolean) obj43 : null;
                bool4.getClass();
                boolean booleanValue = bool4.booleanValue();
                Object obj44 = list8.get(1);
                d dVar10 = p.WIEu4Ya2g8;
                if (!o30.rQPn8YBR(obj44, Boolean.FALSE) && obj44 != null) {
                    rpVar = (rp) ((hv) dVar10.AvO7iQsrTN).mOu10nynGul(obj44);
                }
                rpVar.getClass();
                return new bq0(rpVar.GWasM1elztuh, booleanValue);
            case Side.ALL /* 15 */:
                obj.getClass();
                return new rp(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new ea0(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                p81 p81Var = (o30.rQPn8YBR(obj45, Boolean.FALSE) || obj45 == null) ? null : (p81) ((hv) p.mE4lRynR.AvO7iQsrTN).mOu10nynGul(obj45);
                p81Var.getClass();
                int i9 = p81Var.GWasM1elztuh;
                Object obj46 = list9.get(1);
                Boolean bool5 = obj46 != null ? (Boolean) obj46 : null;
                bool5.getClass();
                return new q81(i9, bool5.booleanValue());
            case 18:
                obj.getClass();
                return new p81(((Integer) obj).intValue());
            case 19:
                return new by0(((Integer) obj).intValue());
            case 20:
                return Boolean.valueOf(!false);
            case 21:
                yy0 yy0Var = (yy0) obj;
                yy0Var.getClass();
                return Integer.valueOf(yy0Var.GWasM1elztuh);
            case 22:
                return Boolean.valueOf(obj == null);
            case 23:
                dx0 dx0Var = e41.GWasM1elztuh;
                return kc1Var;
            case 24:
                u40[] u40VarArr = j01.GWasM1elztuh;
                k01 k01Var = h01.XnEVoBF0td1l;
                u40 u40Var = j01.GWasM1elztuh[5];
                ((l01) obj).GWasM1elztuh(k01Var, Boolean.TRUE);
                return kc1Var;
            case 25:
                return kc1Var;
            case 26:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 27:
                vz0 vz0Var = (vz0) obj;
                long j6 = vz0Var.EljAMC1QTz;
                r41 r41Var = vz0Var.encWxUiV2;
                if (r41Var != null) {
                    r41Var.X1lG3V04pd(vz0Var, o30.mE4lRynR, vz0Var.AvO7iQsrTN);
                }
                long j7 = vz0Var.EljAMC1QTz;
                if (j6 != j7) {
                    oz0 oz0Var = vz0Var.iwATDS1i01k;
                    if (oz0Var != null) {
                        if (oz0Var.GWasM1elztuh > j7) {
                            vz0Var.Mjvvu5DE();
                        } else {
                            oz0Var.AvO7iQsrTN = j7;
                            if (oz0Var.Yi7zF1RB1 == null) {
                                oz0Var.encWxUiV2 = vc0.DmJncFq5((1.0d - oz0Var.OOA6hdeuvCS.GWasM1elztuh(0)) * vz0Var.EljAMC1QTz);
                            }
                        }
                    } else if (j7 != 0) {
                        vz0Var.Y6hRI1cF8();
                    }
                }
                return kc1Var;
            case 28:
                return new n3(((Float) obj).floatValue());
            default:
                return new n3(((Integer) obj).intValue());
        }
    }
}
