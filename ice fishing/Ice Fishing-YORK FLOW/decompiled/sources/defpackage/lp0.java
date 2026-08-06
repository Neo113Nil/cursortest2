package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class lp0 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;

    public /* synthetic */ lp0(int i) {
        this.WDYagTQQm9ns = i;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        int i = 0;
        defpackage.pf1 pf1Var = null;
        r5 = null;
        defpackage.en1 en1Var = null;
        pf1Var = null;
        switch (this.WDYagTQQm9ns) {
            case 0:
                defpackage.np0 np0Var = (defpackage.np0) obj;
                np0Var.getClass();
                return np0Var.QiMR8OkAhezm;
            case 1:
                defpackage.np0 np0Var2 = (defpackage.np0) obj;
                np0Var2.getClass();
                if (!(np0Var2 instanceof defpackage.rp0)) {
                    return null;
                }
                defpackage.up0 up0Var = ((defpackage.rp0) np0Var2).GE9mJIPrb8gP;
                return up0Var.gUjdnLbkVAaA(up0Var.ZpBGe2uQfcn8);
            case 2:
                return defpackage.kv.ZpBGe2uQfcn8(defpackage.la0.xahdJg25P1Bv(700, 6, null));
            case 3:
                defpackage.np0 np0Var3 = ((defpackage.xo0) ((defpackage.q5) obj).fWTAfUmVKrZq()).oh71FJcDz6S2;
                np0Var3.getClass();
                int i2 = defpackage.np0.e6mdH7fiFuta;
                for (defpackage.np0 np0Var4 : defpackage.b80.ZVVdXbWmyCSK((defpackage.fi) np0Var3)) {
                }
                return null;
            case 4:
                return defpackage.kv.giKS3J6vZuNy(defpackage.la0.xahdJg25P1Bv(700, 6, null));
            case 5:
                return ((defpackage.xo0) obj).GE9mJIPrb8gP;
            case 6:
                defpackage.w2 w2Var = ((defpackage.ir0) obj).ZpBGe2uQfcn8;
                if (w2Var != null) {
                    w2Var.ZpBGe2uQfcn8();
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            case 7:
                defpackage.ay0 ay0Var = (defpackage.ay0) obj;
                int i3 = defpackage.i2.ZpBGe2uQfcn8;
                defpackage.ng1 ng1Var = defpackage.j0.giKS3J6vZuNy;
                ay0Var.getClass();
                android.content.Context context = (android.content.Context) defpackage.h0.Jkfc0NcwyPL8(ay0Var, ng1Var);
                defpackage.hp hpVar = (defpackage.hp) defpackage.h0.Jkfc0NcwyPL8(ay0Var, defpackage.rj.P05cfTpS5W5L);
                defpackage.kv0 kv0Var = (defpackage.kv0) defpackage.h0.Jkfc0NcwyPL8(ay0Var, defpackage.lv0.ZpBGe2uQfcn8);
                if (kv0Var == null) {
                    return null;
                }
                return new defpackage.m1(context, hpVar, kv0Var.ZpBGe2uQfcn8, kv0Var.giKS3J6vZuNy);
            case 8:
                throw defpackage.pVQOaWB9QMo4.QiMR8OkAhezm(obj);
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                android.content.Context context2 = (android.content.Context) obj;
                java.util.List<android.content.pm.ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                java.util.ArrayList arrayList = new java.util.ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                while (i < size) {
                    android.content.pm.ResolveInfo resolveInfo = queryIntentActivities.get(i);
                    android.content.pm.ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context2.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        android.content.pm.ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            java.lang.String str = activityInfo.permission;
                            if (str != null && context2.checkSelfPermission(str) != 0) {
                            }
                        }
                        i++;
                    }
                    arrayList.add(resolveInfo);
                    i++;
                }
                return arrayList;
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                ((defpackage.kn) obj).getClass();
                throw new defpackage.es0(0);
            case 11:
                return new defpackage.j71((java.util.Map) obj);
            case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                return obj;
            case 13:
                obj.getClass();
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = list.get(0);
                defpackage.y10 y10Var = (defpackage.y10) defpackage.k81.P05cfTpS5W5L.QiMR8OkAhezm;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                defpackage.pf1 pf1Var2 = (defpackage.ma0.QiMR8OkAhezm(obj2, bool) || obj2 == null) ? null : (defpackage.pf1) y10Var.P05cfTpS5W5L(obj2);
                java.lang.Object obj3 = list.get(1);
                defpackage.pf1 pf1Var3 = (defpackage.ma0.QiMR8OkAhezm(obj3, bool) || obj3 == null) ? null : (defpackage.pf1) y10Var.P05cfTpS5W5L(obj3);
                java.lang.Object obj4 = list.get(2);
                defpackage.pf1 pf1Var4 = (defpackage.ma0.QiMR8OkAhezm(obj4, bool) || obj4 == null) ? null : (defpackage.pf1) y10Var.P05cfTpS5W5L(obj4);
                java.lang.Object obj5 = list.get(3);
                if (!defpackage.ma0.QiMR8OkAhezm(obj5, bool) && obj5 != null) {
                    pf1Var = (defpackage.pf1) y10Var.P05cfTpS5W5L(obj5);
                }
                return new defpackage.en1(pf1Var2, pf1Var3, pf1Var4, pf1Var);
            case 14:
                obj.getClass();
                java.util.List list2 = (java.util.List) obj;
                java.lang.Object obj6 = list2.get(1);
                java.util.List list3 = (defpackage.ma0.QiMR8OkAhezm(obj6, java.lang.Boolean.FALSE) || obj6 == null) ? null : (java.util.List) ((defpackage.y10) defpackage.k81.ZpBGe2uQfcn8.QiMR8OkAhezm).P05cfTpS5W5L(obj6);
                java.lang.Object obj7 = list2.get(0);
                java.lang.String str2 = obj7 != null ? (java.lang.String) obj7 : null;
                str2.getClass();
                return new defpackage.l6(list3, str2);
            case 15:
                obj.getClass();
                return new defpackage.qk1(((java.lang.Integer) obj).intValue());
            case 16:
                obj.getClass();
                java.util.List list4 = (java.util.List) obj;
                return new defpackage.qm1(((java.lang.Number) list4.get(0)).floatValue(), ((java.lang.Number) list4.get(1)).floatValue());
            case 17:
                obj.getClass();
                java.util.List list5 = (java.util.List) obj;
                java.lang.Object obj8 = list5.get(0);
                defpackage.un1[] un1VarArr = defpackage.tn1.giKS3J6vZuNy;
                defpackage.y10 y10Var2 = defpackage.k81.maCixPsq4ml2.oh71FJcDz6S2;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                defpackage.ma0.QiMR8OkAhezm(obj8, bool2);
                defpackage.tn1 tn1Var = obj8 != null ? (defpackage.tn1) y10Var2.P05cfTpS5W5L(obj8) : null;
                tn1Var.getClass();
                long j = tn1Var.ZpBGe2uQfcn8;
                java.lang.Object obj9 = list5.get(1);
                defpackage.ma0.QiMR8OkAhezm(obj9, bool2);
                defpackage.tn1 tn1Var2 = obj9 != null ? (defpackage.tn1) y10Var2.P05cfTpS5W5L(obj9) : null;
                tn1Var2.getClass();
                return new defpackage.rm1(j, tn1Var2.ZpBGe2uQfcn8);
            case 18:
                obj.getClass();
                return new defpackage.w00(((java.lang.Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new defpackage.n9(((java.lang.Float) obj).floatValue());
            case 20:
                obj.getClass();
                java.util.List list6 = (java.util.List) obj;
                java.lang.Object obj10 = list6.get(0);
                java.lang.Integer num = obj10 != null ? (java.lang.Integer) obj10 : null;
                num.getClass();
                int intValue = num.intValue();
                java.lang.Object obj11 = list6.get(1);
                java.lang.Integer num2 = obj11 != null ? (java.lang.Integer) obj11 : null;
                num2.getClass();
                return new defpackage.in1(defpackage.j80.JhCgjQRTAOCT(intValue, num2.intValue()));
            case 21:
                obj.getClass();
                java.util.List list7 = (java.util.List) obj;
                java.lang.Object obj12 = list7.get(0);
                int i4 = defpackage.pf.P05cfTpS5W5L;
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                defpackage.ma0.QiMR8OkAhezm(obj12, bool3);
                defpackage.pf pfVar = obj12 != null ? defpackage.ma0.QiMR8OkAhezm(obj12, java.lang.Boolean.FALSE) ? new defpackage.pf(defpackage.pf.QiMR8OkAhezm) : new defpackage.pf(defpackage.ok0.JhCgjQRTAOCT(((java.lang.Integer) obj12).intValue())) : null;
                pfVar.getClass();
                long j2 = pfVar.ZpBGe2uQfcn8;
                java.lang.Object obj13 = list7.get(1);
                defpackage.j81 j81Var = defpackage.k81.VFeft99leXEK;
                defpackage.ma0.QiMR8OkAhezm(obj13, bool3);
                defpackage.ws0 ws0Var = obj13 != null ? (defpackage.ws0) j81Var.oh71FJcDz6S2.P05cfTpS5W5L(obj13) : null;
                ws0Var.getClass();
                long j3 = ws0Var.ZpBGe2uQfcn8;
                java.lang.Object obj14 = list7.get(2);
                java.lang.Float f = obj14 != null ? (java.lang.Float) obj14 : null;
                f.getClass();
                return new defpackage.zc1(f.floatValue(), j2, j3);
            case 22:
                obj.getClass();
                return new defpackage.tj1(((java.lang.Integer) obj).intValue());
            case 23:
                obj.getClass();
                java.util.List list8 = (java.util.List) obj;
                java.lang.Object obj15 = list8.get(0);
                java.lang.String str3 = obj15 != null ? (java.lang.String) obj15 : null;
                str3.getClass();
                java.lang.Object obj16 = list8.get(1);
                defpackage.n80 n80Var = defpackage.k81.e6mdH7fiFuta;
                if (!defpackage.ma0.QiMR8OkAhezm(obj16, java.lang.Boolean.FALSE) && obj16 != null) {
                    en1Var = (defpackage.en1) ((defpackage.y10) n80Var.QiMR8OkAhezm).P05cfTpS5W5L(obj16);
                }
                return new defpackage.rh0(str3, en1Var);
            case 24:
                obj.getClass();
                return new defpackage.tk1(((java.lang.Integer) obj).intValue());
            case 25:
                obj.getClass();
                return new defpackage.a60(((java.lang.Integer) obj).intValue());
            case 26:
                obj.getClass();
                java.util.List list9 = (java.util.List) obj;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list9.size());
                int size2 = list9.size();
                while (i < size2) {
                    java.lang.Object obj17 = list9.get(i);
                    defpackage.k6 k6Var = (defpackage.ma0.QiMR8OkAhezm(obj17, java.lang.Boolean.FALSE) || obj17 == null) ? null : (defpackage.k6) ((defpackage.y10) defpackage.k81.giKS3J6vZuNy.QiMR8OkAhezm).P05cfTpS5W5L(obj17);
                    k6Var.getClass();
                    arrayList2.add(k6Var);
                    i++;
                }
                return arrayList2;
            case 27:
                obj.getClass();
                return new defpackage.s00(((java.lang.Integer) obj).intValue());
            case 28:
                obj.getClass();
                return new defpackage.t00(((java.lang.Integer) obj).intValue());
            default:
                java.lang.Boolean bool4 = java.lang.Boolean.FALSE;
                if (defpackage.ma0.QiMR8OkAhezm(obj, bool4)) {
                    return new defpackage.tn1(defpackage.tn1.fWTAfUmVKrZq);
                }
                obj.getClass();
                java.util.List list10 = (java.util.List) obj;
                java.lang.Object obj18 = list10.get(0);
                java.lang.Float f2 = obj18 != null ? (java.lang.Float) obj18 : null;
                f2.getClass();
                float floatValue = f2.floatValue();
                java.lang.Object obj19 = list10.get(1);
                defpackage.j81 j81Var2 = defpackage.k81.IJ0hOnjhPOri;
                defpackage.ma0.QiMR8OkAhezm(obj19, bool4);
                defpackage.un1 un1Var = obj19 != null ? (defpackage.un1) j81Var2.oh71FJcDz6S2.P05cfTpS5W5L(obj19) : null;
                un1Var.getClass();
                return new defpackage.tn1(defpackage.m90.UmgHb6n58gfG(un1Var.ZpBGe2uQfcn8, floatValue));
        }
    }

    public /* synthetic */ lp0(int i, java.lang.Object obj) {
        this.WDYagTQQm9ns = i;
    }
}
