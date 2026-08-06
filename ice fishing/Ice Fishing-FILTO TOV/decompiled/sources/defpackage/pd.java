package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.combinations.level.experts.R;
import com.combinations.level.experts.core.domain.model.Side;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements lv {
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ pd(int i) {
        this.OOA6hdeuvCS = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lv
    public final Object EljAMC1QTz(Object obj, Object obj2) {
        br0 br0Var;
        oc ocVar;
        Bundle bundle = null;
        Object[] objArr = 0;
        switch (this.OOA6hdeuvCS) {
            case 0:
                qx qxVar = (qx) obj;
                int intValue = ((Integer) obj2).intValue();
                if (qxVar.dqB83aoLBB(intValue & 1, (intValue & 3) != 2)) {
                    y61.GWasM1elztuh(v21.Yi7zF1RB1, null, ac.Yi7zF1RB1, 0L, 0.0f, null, qj.mOu10nynGul, qxVar, 12583302, 122);
                } else {
                    qxVar.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 1:
                px0 px0Var = (px0) obj;
                px0Var.getClass();
                ((ao0) obj2).getClass();
                try {
                    Context context = (Context) px0Var.xqGvceK5x(st0.GWasM1elztuh(Context.class), null);
                    u40[] u40VarArr = xv.GWasM1elztuh;
                    Context applicationContext = context.getApplicationContext();
                    applicationContext.getClass();
                    cr0 cr0Var = xv.Yi7zF1RB1;
                    u40 u40Var = xv.GWasM1elztuh[0];
                    cr0Var.getClass();
                    u40Var.getClass();
                    br0 br0Var2 = cr0Var.xqGvceK5x;
                    if (br0Var2 != null) {
                        return br0Var2;
                    }
                    synchronized (cr0Var.X1lG3V04pd) {
                        try {
                            if (cr0Var.xqGvceK5x == null) {
                                Context applicationContext2 = applicationContext.getApplicationContext();
                                hv hvVar = cr0Var.GWasM1elztuh;
                                applicationContext2.getClass();
                                List list = (List) hvVar.mOu10nynGul(applicationContext2);
                                ph phVar = cr0Var.Yi7zF1RB1;
                                int i = 9;
                                h2 h2Var = new h2(i, applicationContext2, cr0Var);
                                list.getClass();
                                cr0Var.xqGvceK5x = new br0(new br0(new fj(new mr(new o1(i, h2Var)), fb1.HFYAaqMd6(new xqGvceK5x(list, objArr == true ? 1 : 0, i)), new vt(11), phVar)));
                            }
                            br0Var = cr0Var.xqGvceK5x;
                            br0Var.getClass();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return br0Var;
                } catch (sj0 unused) {
                    throw new ee0("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
                }
            case 2:
                px0 px0Var2 = (px0) obj;
                px0Var2.getClass();
                ((ao0) obj2).getClass();
                return new lj((gi) px0Var2.xqGvceK5x(st0.GWasM1elztuh(gi.class), null));
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                px0 px0Var3 = (px0) obj;
                px0Var3.getClass();
                ((ao0) obj2).getClass();
                return new oj((gi) px0Var3.xqGvceK5x(st0.GWasM1elztuh(gi.class), null));
            case 4:
                String str = (String) obj;
                eh ehVar = (eh) obj2;
                str.getClass();
                ehVar.getClass();
                if (str.length() == 0) {
                    return ehVar.toString();
                }
                return str + ", " + ehVar;
            case 5:
                qx qxVar2 = (qx) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (qxVar2.dqB83aoLBB(intValue2 & 1, (intValue2 & 3) != 2)) {
                    e00.GWasM1elztuh(vc0.jivtDDk9H(), w60.lv06NcmrQ(R.string.cd_back, qxVar2), null, ac.XnEVoBF0td1l, qxVar2, 3072, 4);
                } else {
                    qxVar2.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                qx qxVar3 = (qx) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (qxVar3.dqB83aoLBB(intValue3 & 1, (intValue3 & 3) != 2)) {
                    i00 i00Var = b70.GWasM1elztuh;
                    if (i00Var == null) {
                        h00 h00Var = new h00("Filled.Refresh", false, 96);
                        int i2 = pd1.GWasM1elztuh;
                        t41 t41Var = new t41(yb.Yi7zF1RB1);
                        j6IIN2O8eOU j6iin2o8eou = new j6IIN2O8eOU(18);
                        ArrayList arrayList = (ArrayList) j6iin2o8eou.EljAMC1QTz;
                        j6iin2o8eou.XnEVoBF0td1l(17.65f, 6.35f);
                        arrayList.add(new ko0(2));
                        j6iin2o8eou.xqGvceK5x(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
                        j6iin2o8eou.WIEu4Ya2g8(3.57f, 8.0f, 7.99f, 8.0f);
                        j6iin2o8eou.xqGvceK5x(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
                        arrayList.add(new qo0(-2.08f));
                        j6iin2o8eou.xqGvceK5x(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
                        j6iin2o8eou.xqGvceK5x(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        j6iin2o8eou.WIEu4Ya2g8(2.69f, -6.0f, 6.0f, -6.0f);
                        j6iin2o8eou.xqGvceK5x(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                        j6iin2o8eou.rQPn8YBR(13.0f, 11.0f);
                        arrayList.add(new qo0(7.0f));
                        arrayList.add(new uo0(3));
                        j6iin2o8eou.E7jCp8Ls(-2.35f, 2.35f);
                        j6iin2o8eou.Yi7zF1RB1();
                        h00.GWasM1elztuh(h00Var, arrayList, t41Var);
                        i00Var = h00Var.Yi7zF1RB1();
                        b70.GWasM1elztuh = i00Var;
                    }
                    e00.GWasM1elztuh(i00Var, w60.lv06NcmrQ(R.string.cd_restart, qxVar3), null, ac.XnEVoBF0td1l, qxVar3, 3072, 4);
                } else {
                    qxVar3.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                qx qxVar4 = (qx) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (qxVar4.dqB83aoLBB(intValue4 & 1, (intValue4 & 3) != 2)) {
                    e00.GWasM1elztuh(vc0.jivtDDk9H(), w60.lv06NcmrQ(R.string.cd_back, qxVar4), null, ac.XnEVoBF0td1l, qxVar4, 3072, 4);
                } else {
                    qxVar4.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 8:
                qx qxVar5 = (qx) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (qxVar5.dqB83aoLBB(intValue5 & 1, (intValue5 & 3) != 2)) {
                    qj.Yi7zF1RB1(null, qxVar5, 0);
                } else {
                    qxVar5.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 9:
                qx qxVar6 = (qx) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (qxVar6.dqB83aoLBB(intValue6 & 1, (intValue6 & 3) != 2)) {
                    c91.GWasM1elztuh(6, qxVar6);
                } else {
                    qxVar6.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 10:
                qx qxVar7 = (qx) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (qxVar7.dqB83aoLBB(intValue7 & 1, (intValue7 & 3) != 2)) {
                    e00.GWasM1elztuh(vc0.jivtDDk9H(), w60.lv06NcmrQ(R.string.cd_back, qxVar7), null, ac.XnEVoBF0td1l, qxVar7, 3072, 4);
                } else {
                    qxVar7.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 11:
                qx qxVar8 = (qx) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (qxVar8.dqB83aoLBB(intValue8 & 1, (intValue8 & 3) != 2)) {
                    e00.GWasM1elztuh(vc0.jivtDDk9H(), w60.lv06NcmrQ(R.string.cd_back, qxVar8), null, ac.XnEVoBF0td1l, qxVar8, 3072, 4);
                } else {
                    qxVar8.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 12:
                qx qxVar9 = (qx) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (qxVar9.dqB83aoLBB(intValue9 & 1, (intValue9 & 3) != 2)) {
                    j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.reset_dialog_title, qxVar9), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar9, 0, 262142);
                } else {
                    qxVar9.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 13:
                qx qxVar10 = (qx) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (qxVar10.dqB83aoLBB(intValue10 & 1, (intValue10 & 3) != 2)) {
                    j81.Yi7zF1RB1(w60.lv06NcmrQ(R.string.reset_dialog_body, qxVar10), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, qxVar10, 0, 262142);
                } else {
                    qxVar10.YXi2hvwn7WL();
                }
                return kc1.GWasM1elztuh;
            case 14:
                gh ghVar = (gh) obj;
                eh ehVar2 = (eh) obj2;
                ghVar.getClass();
                ehVar2.getClass();
                gh jivtDDk9H = ghVar.jivtDDk9H(ehVar2.getKey());
                vp vpVar = vp.OOA6hdeuvCS;
                if (jivtDDk9H == vpVar) {
                    return ehVar2;
                }
                b9xEq24R1 b9xeq24r1 = b9xEq24R1.arNh8D4Z5gB;
                ih ihVar = (ih) jivtDDk9H.E7jCp8Ls(b9xeq24r1);
                if (ihVar == null) {
                    ocVar = new oc(ehVar2, jivtDDk9H);
                } else {
                    gh jivtDDk9H2 = jivtDDk9H.jivtDDk9H(b9xeq24r1);
                    if (jivtDDk9H2 == vpVar) {
                        return new oc(ihVar, ehVar2);
                    }
                    ocVar = new oc(ihVar, new oc(ehVar2, jivtDDk9H2));
                }
                return ocVar;
            case Side.ALL /* 15 */:
                return ((gh) obj).mOu10nynGul((eh) obj2);
            case 16:
                return ((gh) obj).mOu10nynGul((eh) obj2);
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 18:
                sd0 sd0Var = (sd0) obj;
                Throwable th2 = (Throwable) obj2;
                sd0Var.getClass();
                rc rcVar = sd0Var.Yi7zF1RB1;
                if (th2 == null) {
                    th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                rcVar.qugwajBSa59j(new uc(th2, false));
                return kc1.GWasM1elztuh;
            case 19:
                u80 u80Var = (u80) obj2;
                return fb1.rezfBrjOrqK(Integer.valueOf(((co0) u80Var.OOA6hdeuvCS.Yi7zF1RB1).AvO7iQsrTN()), Integer.valueOf(((co0) u80Var.OOA6hdeuvCS.X1lG3V04pd).AvO7iQsrTN()));
            case 20:
                Map OOA6hdeuvCS = ((x80) obj2).OOA6hdeuvCS();
                if (OOA6hdeuvCS.isEmpty()) {
                    return null;
                }
                return OOA6hdeuvCS;
            case 21:
                hi0 hi0Var = (hi0) obj2;
                ph0 ph0Var = hi0Var.Yi7zF1RB1;
                LinkedHashMap linkedHashMap = ph0Var.XnEVoBF0td1l;
                v4 v4Var = ph0Var.EljAMC1QTz;
                LinkedHashMap linkedHashMap2 = ph0Var.E7jCp8Ls;
                ArrayList arrayList2 = new ArrayList();
                Bundle jivtDDk9H3 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                for (Map.Entry entry : rc0.AEn1Rrio(ph0Var.mE4lRynR.GWasM1elztuh).entrySet()) {
                    ((ej0) entry.getValue()).getClass();
                }
                if (!arrayList2.isEmpty()) {
                    bundle = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                    n4.Mjvvu5DE(jivtDDk9H3, "android-support-nav:controller:navigatorState:names", arrayList2);
                    bundle.putBundle("android-support-nav:controller:navigatorState", jivtDDk9H3);
                }
                if (!v4Var.isEmpty()) {
                    if (bundle == null) {
                        bundle = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    Iterator<E> it = v4Var.iterator();
                    while (it.hasNext()) {
                        fh0 fh0Var = (fh0) it.next();
                        fh0Var.getClass();
                        int i3 = fh0Var.EljAMC1QTz.EljAMC1QTz.GWasM1elztuh;
                        String str2 = fh0Var.JFJ3QoxA;
                        hh0 hh0Var = fh0Var.E7jCp8Ls;
                        Bundle GWasM1elztuh = hh0Var.GWasM1elztuh();
                        Bundle jivtDDk9H4 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                        hh0Var.encWxUiV2.mE4lRynR(jivtDDk9H4);
                        Bundle jivtDDk9H5 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                        str2.getClass();
                        jivtDDk9H5.putString("nav-entry-state:id", str2);
                        jivtDDk9H5.putInt("nav-entry-state:destination-id", i3);
                        if (GWasM1elztuh == null) {
                            GWasM1elztuh = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                        }
                        jivtDDk9H5.putBundle("nav-entry-state:args", GWasM1elztuh);
                        jivtDDk9H5.putBundle("nav-entry-state:saved-state", jivtDDk9H4);
                        arrayList3.add(jivtDDk9H5);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue11 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i5 = i4 + 1;
                        iArr[i4] = intValue11;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList4.add(str3);
                        i4 = i5;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    n4.Mjvvu5DE(bundle, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        v4 v4Var2 = (v4) entry3.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it2 = v4Var2.iterator();
                        while (it2.hasNext()) {
                            a1 a1Var = ((ih0) it2.next()).GWasM1elztuh;
                            a1Var.getClass();
                            Bundle jivtDDk9H6 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                            String str5 = (String) a1Var.Yi7zF1RB1;
                            str5.getClass();
                            jivtDDk9H6.putString("nav-entry-state:id", str5);
                            jivtDDk9H6.putInt("nav-entry-state:destination-id", a1Var.GWasM1elztuh);
                            Bundle bundle2 = (Bundle) a1Var.X1lG3V04pd;
                            if (bundle2 == null) {
                                bundle2 = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                            }
                            jivtDDk9H6.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) a1Var.xqGvceK5x;
                            bundle3.getClass();
                            jivtDDk9H6.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList6.add(jivtDDk9H6);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList6);
                    }
                    n4.Mjvvu5DE(bundle, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (hi0Var.OOA6hdeuvCS) {
                    if (bundle == null) {
                        bundle = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", hi0Var.OOA6hdeuvCS);
                }
                return bundle;
            case 22:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 23:
                jw0 jw0Var = (jw0) obj2;
                Map map = jw0Var.OOA6hdeuvCS;
                hg0 hg0Var = jw0Var.EljAMC1QTz;
                Object[] objArr2 = hg0Var.Yi7zF1RB1;
                Object[] objArr3 = hg0Var.X1lG3V04pd;
                long[] jArr = hg0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    int i9 = (i6 << 3) + i8;
                                    Object obj3 = objArr2[i9];
                                    Map OOA6hdeuvCS2 = ((kw0) objArr3[i9]).OOA6hdeuvCS();
                                    if (OOA6hdeuvCS2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, OOA6hdeuvCS2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i7 != 8) {
                            }
                        }
                        if (i6 != length) {
                            i6++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 24:
                return obj2;
            case 25:
                u3 u3Var = (u3) obj2;
                return fb1.JFJ3QoxA(u3Var.EljAMC1QTz, hx0.GWasM1elztuh(u3Var.OOA6hdeuvCS, hx0.GWasM1elztuh, (hw0) obj));
            case 26:
                return Integer.valueOf(((a81) obj2).GWasM1elztuh);
            case 27:
                e81 e81Var = (e81) obj2;
                return fb1.JFJ3QoxA(Float.valueOf(e81Var.GWasM1elztuh), Float.valueOf(e81Var.Yi7zF1RB1));
            case 28:
                hw0 hw0Var = (hw0) obj;
                f81 f81Var = (f81) obj2;
                a91 a91Var = new a91(f81Var.GWasM1elztuh);
                gx0 gx0Var = hx0.cilMamHF;
                return fb1.JFJ3QoxA(hx0.GWasM1elztuh(a91Var, gx0Var, hw0Var), hx0.GWasM1elztuh(new a91(f81Var.Yi7zF1RB1), gx0Var, hw0Var));
            default:
                return Integer.valueOf(((ou) obj2).OOA6hdeuvCS);
        }
    }
}
