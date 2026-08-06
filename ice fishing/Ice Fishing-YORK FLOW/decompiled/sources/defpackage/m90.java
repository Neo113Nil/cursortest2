package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class m90 {
    public static final defpackage.wg0 BHfvd2J71qpO(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.view_tree_lifecycle_owner);
            defpackage.wg0 wg0Var = tag instanceof defpackage.wg0 ? (defpackage.wg0) tag : null;
            if (wg0Var != null) {
                return wg0Var;
            }
            java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
            view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
        }
        return null;
    }

    public static final void BXaznwstz2U0(defpackage.jb1 jb1Var, int i, defpackage.v81 v81Var) {
        defpackage.jb1 jb1Var2;
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.jb1[16]);
        java.util.List e6mdH7fiFuta = jb1Var.e6mdH7fiFuta(false, false);
        while (true) {
            ho0Var.JhCgjQRTAOCT(ho0Var.QiMR8OkAhezm, e6mdH7fiFuta);
            while (true) {
                int i2 = ho0Var.QiMR8OkAhezm;
                if (i2 == 0) {
                    return;
                }
                jb1Var2 = (defpackage.jb1) ho0Var.Ns0WNyEWdPsk(i2 - 1);
                boolean IBvW5fLsPuHy = defpackage.h0.IBvW5fLsPuHy(jb1Var2);
                defpackage.fb1 fb1Var = jb1Var2.JhCgjQRTAOCT;
                defpackage.yn0 yn0Var = fb1Var.WDYagTQQm9ns;
                if (!IBvW5fLsPuHy && !yn0Var.fWTAfUmVKrZq(defpackage.nb1.GE9mJIPrb8gP)) {
                    defpackage.sr0 JhCgjQRTAOCT = jb1Var2.JhCgjQRTAOCT();
                    if (JhCgjQRTAOCT == null) {
                        throw defpackage.pVQOaWB9QMo4.oh71FJcDz6S2("Expected semantics node to have a coordinator.");
                    }
                    defpackage.q90 PS16moFv2oLu = defpackage.wc1.PS16moFv2oLu(defpackage.wc1.T1fB7bDYiVJQ(JhCgjQRTAOCT, true));
                    if (PS16moFv2oLu.ZpBGe2uQfcn8 < PS16moFv2oLu.fWTAfUmVKrZq && PS16moFv2oLu.giKS3J6vZuNy < PS16moFv2oLu.JhCgjQRTAOCT) {
                        java.lang.Object QiMR8OkAhezm = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.WDYagTQQm9ns);
                        if (QiMR8OkAhezm == null) {
                            QiMR8OkAhezm = null;
                        }
                        defpackage.c20 c20Var = (defpackage.c20) QiMR8OkAhezm;
                        java.lang.Object QiMR8OkAhezm2 = yn0Var.QiMR8OkAhezm(defpackage.nb1.IJ0hOnjhPOri);
                        defpackage.u81 u81Var = (defpackage.u81) (QiMR8OkAhezm2 != null ? QiMR8OkAhezm2 : null);
                        if (c20Var != null && u81Var != null && ((java.lang.Number) u81Var.giKS3J6vZuNy.ZpBGe2uQfcn8()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            v81Var.P05cfTpS5W5L(new defpackage.w81(jb1Var2, i3, PS16moFv2oLu, JhCgjQRTAOCT));
                            BXaznwstz2U0(jb1Var2, i3, v81Var);
                        }
                    }
                }
            }
            e6mdH7fiFuta = jb1Var2.e6mdH7fiFuta(false, false);
        }
    }

    public static final java.lang.Object[] GE9mJIPrb8gP(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 2];
        defpackage.y7.EgL5gQQnyJKX(objArr, objArr2, 0, i, 6);
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final int IBvW5fLsPuHy(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final defpackage.x01 IJ0hOnjhPOri(android.view.View view) {
        defpackage.x01 x01Var = (defpackage.x01) view.getTag(com.ice.fishing.wolberta.R.id.pooling_container_listener_holder_tag);
        if (x01Var != null) {
            return x01Var;
        }
        defpackage.x01 x01Var2 = new defpackage.x01();
        view.setTag(com.ice.fishing.wolberta.R.id.pooling_container_listener_holder_tag, x01Var2);
        return x01Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x04dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void JhCgjQRTAOCT(final defpackage.xp0 xp0Var, final defpackage.rp0 rp0Var, final defpackage.vl0 vl0Var, final defpackage.iYH9ueRbBBFm iyh9uerbbbfm, final defpackage.y10 y10Var, final defpackage.y10 y10Var2, final defpackage.y10 y10Var3, final defpackage.y10 y10Var4, defpackage.e30 e30Var, final int i) {
        defpackage.zq0 zq0Var;
        int i2;
        defpackage.wg0 wg0Var;
        defpackage.gi giVar;
        defpackage.rp0 rp0Var2;
        defpackage.gi giVar2;
        defpackage.fo0 fo0Var;
        boolean z;
        java.lang.Object obj;
        defpackage.gi giVar3;
        defpackage.e30 e30Var2;
        defpackage.zq0 zq0Var2;
        defpackage.zq0 zq0Var3;
        final defpackage.gi giVar4;
        defpackage.nn0 nn0Var;
        defpackage.xo0 xo0Var;
        boolean z2;
        defpackage.y10 y10Var5;
        defpackage.jp1 jp1Var;
        defpackage.ja1 ja1Var;
        final defpackage.dg1 dg1Var;
        defpackage.nn0 nn0Var2;
        defpackage.gi giVar5;
        java.lang.Object obj2;
        defpackage.ja1 ja1Var2;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        java.util.ArrayList arrayList;
        int length;
        int i3;
        java.lang.String str;
        defpackage.np0 gUjdnLbkVAaA;
        defpackage.rp0 rp0Var3;
        int i4;
        android.os.Bundle bundle;
        defpackage.np0 gUjdnLbkVAaA2;
        defpackage.rp0 rp0Var4;
        e30Var.PS16moFv2oLu(-1964664536);
        int i5 = (i & 6) == 0 ? (e30Var.P05cfTpS5W5L(xp0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(rp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= e30Var.oh71FJcDz6S2(vl0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= e30Var.oh71FJcDz6S2(iyh9uerbbbfm) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(y10Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(y10Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(y10Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(y10Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i5 |= e30Var.P05cfTpS5W5L(null) ? 67108864 : 33554432;
        }
        int i6 = i5;
        if ((38347923 & i6) == 38347922 && e30Var.OcTWLQzke1i2()) {
            e30Var.Jkfc0NcwyPL8();
            e30Var2 = e30Var;
        } else {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) != 0 && !e30Var.oCu53ZX2v4Ju()) {
                e30Var.Jkfc0NcwyPL8();
            }
            e30Var.WmetiUbpKU9I();
            defpackage.wg0 wg0Var2 = (defpackage.wg0) e30Var.GE9mJIPrb8gP(defpackage.gi0.ZpBGe2uQfcn8);
            defpackage.ru1 ZpBGe2uQfcn8 = defpackage.mi0.ZpBGe2uQfcn8(e30Var);
            if (ZpBGe2uQfcn8 == null) {
                defpackage.h7.P05cfTpS5W5L("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            defpackage.qu1 WDYagTQQm9ns = ZpBGe2uQfcn8.WDYagTQQm9ns();
            xp0Var.getClass();
            defpackage.ep0 ep0Var = xp0Var.giKS3J6vZuNy;
            ep0Var.getClass();
            defpackage.zq0 zq0Var4 = ep0Var.BHfvd2J71qpO;
            if (!defpackage.ma0.QiMR8OkAhezm(ep0Var.T1fB7bDYiVJQ, defpackage.v70.BHfvd2J71qpO(WDYagTQQm9ns))) {
                if (!ep0Var.oh71FJcDz6S2.isEmpty()) {
                    defpackage.h7.P05cfTpS5W5L("ViewModelStore should be set before setGraph call");
                    return;
                }
                ep0Var.T1fB7bDYiVJQ = defpackage.v70.BHfvd2J71qpO(WDYagTQQm9ns);
            }
            rp0Var.getClass();
            ep0Var.getClass();
            java.util.LinkedHashMap linkedHashMap = ep0Var.ZVVdXbWmyCSK;
            defpackage.up0 up0Var = rp0Var.GE9mJIPrb8gP;
            defpackage.p7 p7Var = ep0Var.oh71FJcDz6S2;
            if (!p7Var.isEmpty() && ep0Var.QiMR8OkAhezm() == defpackage.pg0.WDYagTQQm9ns) {
                defpackage.h7.P05cfTpS5W5L("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z3 = false;
            if (defpackage.ma0.QiMR8OkAhezm(ep0Var.fWTAfUmVKrZq, rp0Var)) {
                zq0Var = zq0Var4;
                i2 = i6;
                wg0Var = wg0Var2;
                giVar = null;
                int WDYagTQQm9ns2 = ((defpackage.rf1) up0Var.fWTAfUmVKrZq).WDYagTQQm9ns();
                for (int i7 = 0; i7 < WDYagTQQm9ns2; i7++) {
                    defpackage.np0 np0Var = (defpackage.np0) ((defpackage.rf1) up0Var.fWTAfUmVKrZq).oh71FJcDz6S2(i7);
                    defpackage.rp0 rp0Var5 = ep0Var.fWTAfUmVKrZq;
                    rp0Var5.getClass();
                    int fWTAfUmVKrZq = ((defpackage.rf1) rp0Var5.GE9mJIPrb8gP.fWTAfUmVKrZq).fWTAfUmVKrZq(i7);
                    defpackage.rp0 rp0Var6 = ep0Var.fWTAfUmVKrZq;
                    rp0Var6.getClass();
                    defpackage.rf1 rf1Var = (defpackage.rf1) rp0Var6.GE9mJIPrb8gP.fWTAfUmVKrZq;
                    if (rf1Var.WDYagTQQm9ns) {
                        defpackage.i61.WDYagTQQm9ns(rf1Var);
                    }
                    int GE9mJIPrb8gP = defpackage.vx1.GE9mJIPrb8gP(rf1Var.oh71FJcDz6S2, rf1Var.P05cfTpS5W5L, fWTAfUmVKrZq);
                    if (GE9mJIPrb8gP >= 0) {
                        java.lang.Object[] objArr = rf1Var.QiMR8OkAhezm;
                        java.lang.Object obj3 = objArr[GE9mJIPrb8gP];
                        objArr[GE9mJIPrb8gP] = np0Var;
                    }
                }
                java.util.Iterator it = p7Var.iterator();
                while (it.hasNext()) {
                    defpackage.xo0 xo0Var2 = (defpackage.xo0) it.next();
                    int i8 = defpackage.np0.e6mdH7fiFuta;
                    defpackage.p51 p51Var = new defpackage.p51(defpackage.fc1.xahdJg25P1Bv(defpackage.b80.ZVVdXbWmyCSK(xo0Var2.oh71FJcDz6S2)));
                    defpackage.np0 np0Var2 = ep0Var.fWTAfUmVKrZq;
                    np0Var2.getClass();
                    java.util.Iterator it2 = p51Var.iterator();
                    while (true) {
                        java.util.ListIterator listIterator = (java.util.ListIterator) ((defpackage.n51) it2).oh71FJcDz6S2;
                        if (listIterator.hasPrevious()) {
                            defpackage.np0 np0Var3 = (defpackage.np0) listIterator.previous();
                            if (defpackage.ma0.QiMR8OkAhezm(np0Var3, ep0Var.fWTAfUmVKrZq) && np0Var2.equals(rp0Var)) {
                            }
                            if (np0Var2 instanceof defpackage.rp0) {
                                np0Var2 = ((defpackage.rp0) np0Var2).GE9mJIPrb8gP.gUjdnLbkVAaA(np0Var3.oh71FJcDz6S2.ZpBGe2uQfcn8);
                                np0Var2.getClass();
                            }
                        }
                    }
                    xo0Var2.oh71FJcDz6S2 = np0Var2;
                }
            } else {
                defpackage.rp0 rp0Var7 = ep0Var.fWTAfUmVKrZq;
                if (rp0Var7 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ep0Var.fNwYGHIYeJcR.keySet());
                    int size = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size) {
                        java.lang.Object obj4 = arrayList2.get(i9);
                        int i10 = i9 + 1;
                        java.lang.Integer num = (java.lang.Integer) obj4;
                        num.getClass();
                        java.util.ArrayList arrayList3 = arrayList2;
                        int intValue = num.intValue();
                        java.util.Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((defpackage.cp0) it3.next()).JhCgjQRTAOCT = true;
                            i10 = i10;
                        }
                        int i11 = i10;
                        boolean T1fB7bDYiVJQ = ep0Var.T1fB7bDYiVJQ(intValue, null, new defpackage.jq0(z3, true, -1, z3, z3, -1, -1));
                        for (java.util.Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((defpackage.cp0) it4.next()).JhCgjQRTAOCT = false;
                            T1fB7bDYiVJQ = T1fB7bDYiVJQ;
                        }
                        if (T1fB7bDYiVJQ) {
                            ep0Var.Ns0WNyEWdPsk(intValue, true, false);
                        }
                        arrayList2 = arrayList3;
                        i9 = i11;
                        z3 = false;
                    }
                    ep0Var.Ns0WNyEWdPsk(rp0Var7.oh71FJcDz6S2.ZpBGe2uQfcn8, true, false);
                }
                ep0Var.fWTAfUmVKrZq = rp0Var;
                defpackage.zq0 zq0Var5 = ep0Var.BHfvd2J71qpO;
                defpackage.xp0 xp0Var2 = ep0Var.ZpBGe2uQfcn8;
                defpackage.r1 r1Var = xp0Var2.fWTAfUmVKrZq;
                android.os.Bundle bundle2 = ep0Var.JhCgjQRTAOCT;
                if (bundle2 != null && bundle2.containsKey("android-support-nav:controller:navigatorState:names")) {
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
                    if (stringArrayList == null) {
                        defpackage.w60.KrtOTfE6jiS2("android-support-nav:controller:navigatorState:names");
                        throw null;
                    }
                    int size2 = stringArrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        java.lang.String str2 = stringArrayList.get(i12);
                        i12++;
                        java.util.ArrayList<java.lang.String> arrayList4 = stringArrayList;
                        java.lang.String str3 = str2;
                        zq0Var5.giKS3J6vZuNy(str3);
                        if (bundle2.containsKey(str3)) {
                            defpackage.wc1.BXaznwstz2U0(str3, bundle2);
                        }
                        stringArrayList = arrayList4;
                    }
                }
                android.os.Bundle[] bundleArr = ep0Var.WDYagTQQm9ns;
                if (bundleArr != null) {
                    int length2 = bundleArr.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        android.os.Bundle[] bundleArr2 = bundleArr;
                        android.os.Bundle bundle3 = bundleArr2[i13];
                        bundle3.getClass();
                        int i14 = length2;
                        bundle3.setClassLoader(defpackage.ap0.class.getClassLoader());
                        java.lang.String string = bundle3.getString("nav-entry-state:id");
                        if (string == null) {
                            defpackage.w60.KrtOTfE6jiS2("nav-entry-state:id");
                            throw null;
                        }
                        int KrtOTfE6jiS2 = defpackage.wc1.KrtOTfE6jiS2("nav-entry-state:destination-id", bundle3);
                        int i15 = i13;
                        android.os.Bundle bundle4 = bundle3.getBundle("nav-entry-state:args");
                        if (bundle4 == null) {
                            defpackage.w60.KrtOTfE6jiS2("nav-entry-state:args");
                            throw null;
                        }
                        android.os.Bundle bundle5 = bundle3.getBundle("nav-entry-state:saved-state");
                        if (bundle5 == null) {
                            defpackage.w60.KrtOTfE6jiS2("nav-entry-state:saved-state");
                            throw null;
                        }
                        defpackage.np0 fWTAfUmVKrZq2 = ep0Var.fWTAfUmVKrZq(KrtOTfE6jiS2, null);
                        if (fWTAfUmVKrZq2 == null) {
                            int i16 = defpackage.np0.e6mdH7fiFuta;
                            throw new java.lang.IllegalStateException("Restoring the Navigation back stack failed: destination " + defpackage.b80.BHfvd2J71qpO(r1Var, KrtOTfE6jiS2) + " cannot be found from the current destination " + ep0Var.oh71FJcDz6S2());
                        }
                        defpackage.pg0 QiMR8OkAhezm = ep0Var.QiMR8OkAhezm();
                        defpackage.fp0 fp0Var = ep0Var.T1fB7bDYiVJQ;
                        r1Var.getClass();
                        QiMR8OkAhezm.getClass();
                        android.content.Context context = r1Var.ZpBGe2uQfcn8;
                        bundle4.setClassLoader(context != null ? context.getClassLoader() : null);
                        defpackage.xo0 xo0Var3 = new defpackage.xo0(r1Var, fWTAfUmVKrZq2, bundle4, QiMR8OkAhezm, fp0Var, string, bundle5);
                        defpackage.yq0 giKS3J6vZuNy = zq0Var5.giKS3J6vZuNy(fWTAfUmVKrZq2.WDYagTQQm9ns);
                        java.lang.Object obj5 = linkedHashMap.get(giKS3J6vZuNy);
                        java.lang.Object obj6 = obj5;
                        if (obj5 == null) {
                            defpackage.cp0 cp0Var = new defpackage.cp0(xp0Var2, giKS3J6vZuNy);
                            linkedHashMap.put(giKS3J6vZuNy, cp0Var);
                            obj6 = cp0Var;
                        }
                        p7Var.addLast(xo0Var3);
                        ((defpackage.cp0) obj6).ZpBGe2uQfcn8(xo0Var3);
                        defpackage.rp0 rp0Var8 = xo0Var3.oh71FJcDz6S2.QiMR8OkAhezm;
                        if (rp0Var8 != null) {
                            ep0Var.e6mdH7fiFuta(xo0Var3, ep0Var.WDYagTQQm9ns(rp0Var8.oh71FJcDz6S2.ZpBGe2uQfcn8));
                        }
                        i13 = i15 + 1;
                        bundleArr = bundleArr2;
                        length2 = i14;
                    }
                    ep0Var.giKS3J6vZuNy.ZpBGe2uQfcn8();
                    ep0Var.WDYagTQQm9ns = null;
                }
                java.util.Collection values = defpackage.jk0.OVwOqzUGHcCU(zq0Var5.ZpBGe2uQfcn8).values();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj7 : values) {
                    if (!((defpackage.yq0) obj7).giKS3J6vZuNy) {
                        arrayList5.add(obj7);
                    }
                }
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    java.lang.Object obj8 = arrayList5.get(i17);
                    i17++;
                    defpackage.yq0 yq0Var = (defpackage.yq0) obj8;
                    java.lang.Object obj9 = linkedHashMap.get(yq0Var);
                    if (obj9 == null) {
                        yq0Var.getClass();
                        obj9 = new defpackage.cp0(xp0Var2, yq0Var);
                        linkedHashMap.put(yq0Var, obj9);
                    }
                    yq0Var.getClass();
                    yq0Var.ZpBGe2uQfcn8 = (defpackage.cp0) obj9;
                    yq0Var.giKS3J6vZuNy = true;
                }
                if (ep0Var.fWTAfUmVKrZq == null || !p7Var.isEmpty()) {
                    zq0Var = zq0Var4;
                    i2 = i6;
                    wg0Var = wg0Var2;
                    giVar = null;
                    ep0Var.giKS3J6vZuNy();
                } else {
                    android.app.Activity activity = xp0Var2.JhCgjQRTAOCT;
                    if (!xp0Var2.WDYagTQQm9ns && activity != null) {
                        android.content.Intent intent = activity.getIntent();
                        defpackage.ep0 ep0Var2 = xp0Var2.giKS3J6vZuNy;
                        if (intent != null) {
                            android.os.Bundle extras = intent.getExtras();
                            if (extras != null) {
                                try {
                                    iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                                } catch (java.lang.Exception e) {
                                    i2 = i6;
                                    android.util.Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                                    iArr = null;
                                }
                            } else {
                                iArr = null;
                            }
                            i2 = i6;
                            java.util.ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            android.os.Bundle GE9mJIPrb8gP2 = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
                            android.os.Bundle bundle6 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle6 != null) {
                                GE9mJIPrb8gP2.putAll(bundle6);
                            }
                            if (iArr == null || iArr.length == 0) {
                                defpackage.rp0 P05cfTpS5W5L = ep0Var2.P05cfTpS5W5L();
                                iArr2 = iArr;
                                wg0Var = wg0Var2;
                                zq0Var = zq0Var4;
                                defpackage.mp0 JhCgjQRTAOCT = P05cfTpS5W5L.JhCgjQRTAOCT(new defpackage.a7(intent.getData(), intent.getAction(), intent.getType(), 12), P05cfTpS5W5L);
                                if (JhCgjQRTAOCT != null) {
                                    defpackage.np0 np0Var4 = JhCgjQRTAOCT.WDYagTQQm9ns;
                                    defpackage.p7 p7Var2 = new defpackage.p7();
                                    defpackage.np0 np0Var5 = np0Var4;
                                    while (true) {
                                        defpackage.qp0 qp0Var = np0Var5.oh71FJcDz6S2;
                                        defpackage.rp0 rp0Var9 = np0Var5.QiMR8OkAhezm;
                                        if (rp0Var9 == null || rp0Var9.GE9mJIPrb8gP.ZpBGe2uQfcn8 != qp0Var.ZpBGe2uQfcn8) {
                                            p7Var2.addFirst(np0Var5);
                                        }
                                        if (!defpackage.ma0.QiMR8OkAhezm(rp0Var9, null) && rp0Var9 != null) {
                                            np0Var5 = rp0Var9;
                                        }
                                    }
                                    java.util.List a6r05ZxsOP0A = defpackage.hf.a6r05ZxsOP0A(p7Var2);
                                    java.util.ArrayList arrayList6 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(a6r05ZxsOP0A, 10));
                                    java.util.Iterator it5 = a6r05ZxsOP0A.iterator();
                                    while (it5.hasNext()) {
                                        arrayList6.add(java.lang.Integer.valueOf(((defpackage.np0) it5.next()).oh71FJcDz6S2.ZpBGe2uQfcn8));
                                    }
                                    int[] cSrsis27vXSh = defpackage.hf.cSrsis27vXSh(arrayList6);
                                    android.os.Bundle ZpBGe2uQfcn82 = np0Var4.ZpBGe2uQfcn8(JhCgjQRTAOCT.oh71FJcDz6S2);
                                    if (ZpBGe2uQfcn82 != null) {
                                        GE9mJIPrb8gP2.putAll(ZpBGe2uQfcn82);
                                    }
                                    iArr3 = cSrsis27vXSh;
                                    arrayList = null;
                                    if (iArr3 != null && iArr3.length != 0) {
                                        ep0Var2.getClass();
                                        defpackage.rp0 rp0Var10 = ep0Var2.fWTAfUmVKrZq;
                                        length = iArr3.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i18 = iArr3[i3];
                                            if (i3 == 0) {
                                                defpackage.rp0 rp0Var11 = ep0Var2.fWTAfUmVKrZq;
                                                rp0Var11.getClass();
                                                gUjdnLbkVAaA2 = rp0Var11.oh71FJcDz6S2.ZpBGe2uQfcn8 == i18 ? ep0Var2.fWTAfUmVKrZq : null;
                                            } else {
                                                rp0Var10.getClass();
                                                gUjdnLbkVAaA2 = rp0Var10.GE9mJIPrb8gP.gUjdnLbkVAaA(i18);
                                            }
                                            if (gUjdnLbkVAaA2 == null) {
                                                int i19 = defpackage.np0.e6mdH7fiFuta;
                                                str = defpackage.b80.BHfvd2J71qpO(ep0Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq, i18);
                                                break;
                                            }
                                            if (i3 != iArr3.length - 1 && (gUjdnLbkVAaA2 instanceof defpackage.rp0)) {
                                                while (true) {
                                                    rp0Var4 = (defpackage.rp0) gUjdnLbkVAaA2;
                                                    rp0Var4.getClass();
                                                    defpackage.up0 up0Var2 = rp0Var4.GE9mJIPrb8gP;
                                                    if (!(up0Var2.gUjdnLbkVAaA(up0Var2.ZpBGe2uQfcn8) instanceof defpackage.rp0)) {
                                                        break;
                                                    } else {
                                                        gUjdnLbkVAaA2 = up0Var2.gUjdnLbkVAaA(up0Var2.ZpBGe2uQfcn8);
                                                    }
                                                }
                                                rp0Var10 = rp0Var4;
                                            }
                                            i3++;
                                        }
                                        if (str == null) {
                                            android.util.Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            GE9mJIPrb8gP2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = iArr3.length;
                                            android.os.Bundle[] bundleArr3 = new android.os.Bundle[length3];
                                            for (int i20 = 0; i20 < length3; i20++) {
                                                android.os.Bundle GE9mJIPrb8gP3 = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
                                                GE9mJIPrb8gP3.putAll(GE9mJIPrb8gP2);
                                                if (arrayList != null && (bundle = (android.os.Bundle) arrayList.get(i20)) != null) {
                                                    GE9mJIPrb8gP3.putAll(bundle);
                                                }
                                                bundleArr3[i20] = GE9mJIPrb8gP3;
                                            }
                                            int flags = intent.getFlags();
                                            int i21 = 268435456 & flags;
                                            if (i21 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                android.content.Context context2 = xp0Var2.ZpBGe2uQfcn8;
                                                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                                                android.content.ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(context2.getPackageManager());
                                                }
                                                if (component != null) {
                                                    int size4 = arrayList7.size();
                                                    try {
                                                        for (android.content.Intent maCixPsq4ml2 = defpackage.q70.maCixPsq4ml2(context2, component); maCixPsq4ml2 != null; maCixPsq4ml2 = defpackage.q70.maCixPsq4ml2(context2, maCixPsq4ml2.getComponent())) {
                                                            arrayList7.add(size4, maCixPsq4ml2);
                                                        }
                                                    } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                                                        android.util.Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                                                        throw new java.lang.IllegalArgumentException(e2);
                                                    }
                                                }
                                                arrayList7.add(intent);
                                                if (arrayList7.isEmpty()) {
                                                    defpackage.h7.P05cfTpS5W5L("No intents added to TaskStackBuilder; cannot startActivities");
                                                    return;
                                                }
                                                android.content.Intent[] intentArr = (android.content.Intent[]) arrayList7.toArray(new android.content.Intent[0]);
                                                intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
                                                context2.startActivities(intentArr, null);
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i21 != 0) {
                                                if (ep0Var2.oh71FJcDz6S2.isEmpty()) {
                                                    i4 = 0;
                                                } else {
                                                    defpackage.rp0 rp0Var12 = ep0Var2.fWTAfUmVKrZq;
                                                    rp0Var12.getClass();
                                                    i4 = 0;
                                                    ep0Var2.Ns0WNyEWdPsk(rp0Var12.oh71FJcDz6S2.ZpBGe2uQfcn8, true, false);
                                                }
                                                while (i4 < iArr3.length) {
                                                    int i22 = iArr3[i4];
                                                    int i23 = i4 + 1;
                                                    android.os.Bundle bundle7 = bundleArr3[i4];
                                                    defpackage.np0 fWTAfUmVKrZq3 = ep0Var2.fWTAfUmVKrZq(i22, null);
                                                    if (fWTAfUmVKrZq3 == null) {
                                                        int i24 = defpackage.np0.e6mdH7fiFuta;
                                                        throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.b80.BHfvd2J71qpO(r1Var, i22) + " cannot be found from the current destination " + ep0Var2.oh71FJcDz6S2());
                                                    }
                                                    ep0Var2.GE9mJIPrb8gP(fWTAfUmVKrZq3, bundle7, defpackage.wc1.Fu5WBEia9jBo(new defpackage.fWTAfUmVKrZq(23, fWTAfUmVKrZq3, xp0Var2)));
                                                    i4 = i23;
                                                }
                                                xp0Var2.WDYagTQQm9ns = true;
                                            } else {
                                                defpackage.rp0 rp0Var13 = ep0Var2.fWTAfUmVKrZq;
                                                int length4 = iArr3.length;
                                                for (int i25 = 0; i25 < length4; i25++) {
                                                    int i26 = iArr3[i25];
                                                    android.os.Bundle bundle8 = bundleArr3[i25];
                                                    if (i25 == 0) {
                                                        gUjdnLbkVAaA = ep0Var2.fWTAfUmVKrZq;
                                                    } else {
                                                        rp0Var13.getClass();
                                                        gUjdnLbkVAaA = rp0Var13.GE9mJIPrb8gP.gUjdnLbkVAaA(i26);
                                                    }
                                                    if (gUjdnLbkVAaA == null) {
                                                        int i27 = defpackage.np0.e6mdH7fiFuta;
                                                        throw new java.lang.IllegalStateException("Deep Linking failed: destination " + defpackage.b80.BHfvd2J71qpO(r1Var, i26) + " cannot be found in graph " + rp0Var13);
                                                    }
                                                    if (i25 == iArr3.length - 1) {
                                                        defpackage.rp0 rp0Var14 = ep0Var2.fWTAfUmVKrZq;
                                                        rp0Var14.getClass();
                                                        ep0Var2.GE9mJIPrb8gP(gUjdnLbkVAaA, bundle8, new defpackage.jq0(false, false, rp0Var14.oh71FJcDz6S2.ZpBGe2uQfcn8, true, false, 0, 0));
                                                    } else if (gUjdnLbkVAaA instanceof defpackage.rp0) {
                                                        while (true) {
                                                            rp0Var3 = (defpackage.rp0) gUjdnLbkVAaA;
                                                            rp0Var3.getClass();
                                                            defpackage.up0 up0Var3 = rp0Var3.GE9mJIPrb8gP;
                                                            if (!(up0Var3.gUjdnLbkVAaA(up0Var3.ZpBGe2uQfcn8) instanceof defpackage.rp0)) {
                                                                break;
                                                            } else {
                                                                gUjdnLbkVAaA = up0Var3.gUjdnLbkVAaA(up0Var3.ZpBGe2uQfcn8);
                                                            }
                                                        }
                                                        rp0Var13 = rp0Var3;
                                                    }
                                                }
                                                xp0Var2.WDYagTQQm9ns = true;
                                            }
                                            rp0Var2 = rp0Var;
                                            giVar = null;
                                            defpackage.zq0 zq0Var6 = zq0Var;
                                            defpackage.yq0 giKS3J6vZuNy2 = zq0Var6.giKS3J6vZuNy("composable");
                                            giVar2 = !(giKS3J6vZuNy2 instanceof defpackage.gi) ? (defpackage.gi) giKS3J6vZuNy2 : giVar;
                                            if (giVar2 != null) {
                                                defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
                                                if (s0TASMVLSWD5 != null) {
                                                    final int i28 = 2;
                                                    final defpackage.rp0 rp0Var15 = rp0Var2;
                                                    s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20() { // from class: bq0
                                                        @Override // defpackage.c20
                                                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj10, java.lang.Object obj11) {
                                                            int i29 = i28;
                                                            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                                                            int i30 = i;
                                                            switch (i29) {
                                                                case 0:
                                                                    ((java.lang.Integer) obj11).getClass();
                                                                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(i30 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var15, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj10, IBvW5fLsPuHy);
                                                                    break;
                                                                case 1:
                                                                    ((java.lang.Integer) obj11).getClass();
                                                                    int IBvW5fLsPuHy2 = defpackage.m90.IBvW5fLsPuHy(i30 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var15, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj10, IBvW5fLsPuHy2);
                                                                    break;
                                                                default:
                                                                    ((java.lang.Integer) obj11).getClass();
                                                                    int IBvW5fLsPuHy3 = defpackage.m90.IBvW5fLsPuHy(i30 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var15, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj10, IBvW5fLsPuHy3);
                                                                    break;
                                                            }
                                                            return gs1Var;
                                                        }
                                                    };
                                                    return;
                                                }
                                                return;
                                            }
                                            defpackage.fo0 fNwYGHIYeJcR = defpackage.w60.fNwYGHIYeJcR(giVar2.giKS3J6vZuNy().WDYagTQQm9ns, e30Var);
                                            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                                            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
                                            java.lang.Object obj10 = GcLuU6pT9wO9;
                                            if (GcLuU6pT9wO9 == pa1Var) {
                                                defpackage.lw0 lw0Var = new defpackage.lw0(0.0f);
                                                e30Var.EgL5gQQnyJKX(lw0Var);
                                                obj10 = lw0Var;
                                            }
                                            defpackage.lw0 lw0Var2 = (defpackage.lw0) obj10;
                                            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                                            java.lang.Object obj11 = GcLuU6pT9wO92;
                                            if (GcLuU6pT9wO92 == pa1Var) {
                                                defpackage.pw0 hH0RRJrNssvh = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                                                e30Var.EgL5gQQnyJKX(hH0RRJrNssvh);
                                                obj11 = hH0RRJrNssvh;
                                            }
                                            final defpackage.fo0 fo0Var2 = (defpackage.fo0) obj11;
                                            boolean z4 = ((java.util.List) fNwYGHIYeJcR.getValue()).size() > 1;
                                            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(fNwYGHIYeJcR) | e30Var.P05cfTpS5W5L(giVar2);
                                            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                                            if (oh71FJcDz6S2 || GcLuU6pT9wO93 == pa1Var) {
                                                GcLuU6pT9wO93 = new defpackage.d2(giVar2, fNwYGHIYeJcR, lw0Var2, fo0Var2, null, 3);
                                                fo0Var = fNwYGHIYeJcR;
                                                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
                                            } else {
                                                fo0Var = fNwYGHIYeJcR;
                                            }
                                            defpackage.q70.giKS3J6vZuNy(z4, (defpackage.c20) GcLuU6pT9wO93, e30Var, 0);
                                            defpackage.wg0 wg0Var3 = wg0Var;
                                            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(xp0Var) | e30Var.P05cfTpS5W5L(wg0Var3);
                                            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                                            java.lang.Object obj12 = GcLuU6pT9wO94;
                                            if (P05cfTpS5W5L2 || GcLuU6pT9wO94 == pa1Var) {
                                                defpackage.fWTAfUmVKrZq fwtafumvkrzq = new defpackage.fWTAfUmVKrZq(25, xp0Var, wg0Var3);
                                                e30Var.EgL5gQQnyJKX(fwtafumvkrzq);
                                                obj12 = fwtafumvkrzq;
                                            }
                                            defpackage.nq1.oh71FJcDz6S2(wg0Var3, (defpackage.y10) obj12, e30Var);
                                            defpackage.j71 frSwwKIlbUhK = defpackage.t80.frSwwKIlbUhK(e30Var);
                                            defpackage.fo0 fNwYGHIYeJcR2 = defpackage.w60.fNwYGHIYeJcR(ep0Var.e6mdH7fiFuta, e30Var);
                                            java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                                            if (GcLuU6pT9wO95 == pa1Var) {
                                                z = false;
                                                defpackage.qp WmetiUbpKU9I = defpackage.w60.WmetiUbpKU9I(new defpackage.cq0(fNwYGHIYeJcR2, false ? 1 : 0));
                                                e30Var.EgL5gQQnyJKX(WmetiUbpKU9I);
                                                obj = WmetiUbpKU9I;
                                            } else {
                                                z = false;
                                                obj = GcLuU6pT9wO95;
                                            }
                                            defpackage.dg1 dg1Var2 = (defpackage.dg1) obj;
                                            defpackage.xo0 xo0Var4 = (defpackage.xo0) defpackage.hf.LCK4GGEwbWAr((java.util.List) dg1Var2.getValue());
                                            java.lang.Object GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
                                            java.lang.Object obj13 = GcLuU6pT9wO96;
                                            if (GcLuU6pT9wO96 == pa1Var) {
                                                int i29 = defpackage.ls0.ZpBGe2uQfcn8;
                                                defpackage.nn0 nn0Var3 = new defpackage.nn0(6);
                                                e30Var.EgL5gQQnyJKX(nn0Var3);
                                                obj13 = nn0Var3;
                                            }
                                            defpackage.nn0 nn0Var4 = (defpackage.nn0) obj13;
                                            if (xo0Var4 != null) {
                                                e30Var.NkfcFfdaVTox(-1797563167);
                                                boolean P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(giVar2) | (((((i2 & 3670016) ^ 1572864) <= 1048576 || !e30Var.oh71FJcDz6S2(y10Var3)) && (i2 & 1572864) != 1048576) ? z : true) | ((i2 & 57344) == 16384 ? true : z);
                                                java.lang.Object GcLuU6pT9wO97 = e30Var.GcLuU6pT9wO9();
                                                if (P05cfTpS5W5L3 || GcLuU6pT9wO97 == pa1Var) {
                                                    final int i30 = 1;
                                                    zq0Var3 = zq0Var6;
                                                    giVar4 = giVar2;
                                                    nn0Var = nn0Var4;
                                                    xo0Var = xo0Var4;
                                                    z2 = true;
                                                    defpackage.y10 y10Var6 = new defpackage.y10() { // from class: yp0
                                                        @Override // defpackage.y10
                                                        public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj14) {
                                                            int i31 = i30;
                                                            defpackage.fo0 fo0Var3 = fo0Var2;
                                                            defpackage.y10 y10Var7 = y10Var;
                                                            defpackage.y10 y10Var8 = y10Var3;
                                                            defpackage.gi giVar6 = giVar4;
                                                            defpackage.q5 q5Var = (defpackage.q5) obj14;
                                                            switch (i31) {
                                                                case 0:
                                                                    defpackage.np0 np0Var6 = ((defpackage.xo0) q5Var.giKS3J6vZuNy()).oh71FJcDz6S2;
                                                                    np0Var6.getClass();
                                                                    defpackage.fi fiVar = (defpackage.fi) np0Var6;
                                                                    if (((java.lang.Boolean) giVar6.fWTAfUmVKrZq.getValue()).booleanValue() || ((java.lang.Boolean) fo0Var3.getValue()).booleanValue()) {
                                                                        int i32 = defpackage.np0.e6mdH7fiFuta;
                                                                        for (defpackage.np0 np0Var7 : defpackage.b80.ZVVdXbWmyCSK(fiVar)) {
                                                                        }
                                                                        return (defpackage.ew) y10Var8.P05cfTpS5W5L(q5Var);
                                                                    }
                                                                    int i33 = defpackage.np0.e6mdH7fiFuta;
                                                                    for (defpackage.np0 np0Var8 : defpackage.b80.ZVVdXbWmyCSK(fiVar)) {
                                                                    }
                                                                    return (defpackage.ew) y10Var7.P05cfTpS5W5L(q5Var);
                                                                default:
                                                                    defpackage.np0 np0Var9 = ((defpackage.xo0) q5Var.fWTAfUmVKrZq()).oh71FJcDz6S2;
                                                                    np0Var9.getClass();
                                                                    defpackage.fi fiVar2 = (defpackage.fi) np0Var9;
                                                                    if (((java.lang.Boolean) giVar6.fWTAfUmVKrZq.getValue()).booleanValue() || ((java.lang.Boolean) fo0Var3.getValue()).booleanValue()) {
                                                                        int i34 = defpackage.np0.e6mdH7fiFuta;
                                                                        for (defpackage.np0 np0Var10 : defpackage.b80.ZVVdXbWmyCSK(fiVar2)) {
                                                                        }
                                                                        return (defpackage.ov) y10Var8.P05cfTpS5W5L(q5Var);
                                                                    }
                                                                    int i35 = defpackage.np0.e6mdH7fiFuta;
                                                                    for (defpackage.np0 np0Var11 : defpackage.b80.ZVVdXbWmyCSK(fiVar2)) {
                                                                    }
                                                                    return (defpackage.ov) y10Var7.P05cfTpS5W5L(q5Var);
                                                            }
                                                        }
                                                    };
                                                    e30Var.EgL5gQQnyJKX(y10Var6);
                                                    GcLuU6pT9wO97 = y10Var6;
                                                } else {
                                                    zq0Var3 = zq0Var6;
                                                    giVar4 = giVar2;
                                                    nn0Var = nn0Var4;
                                                    xo0Var = xo0Var4;
                                                    z2 = true;
                                                }
                                                defpackage.y10 y10Var7 = (defpackage.y10) GcLuU6pT9wO97;
                                                boolean P05cfTpS5W5L4 = e30Var.P05cfTpS5W5L(giVar4) | (((((i2 & 29360128) ^ 12582912) <= 8388608 || !e30Var.oh71FJcDz6S2(y10Var4)) && (i2 & 12582912) != 8388608) ? z : z2) | ((i2 & 458752) == 131072 ? z2 : z);
                                                java.lang.Object GcLuU6pT9wO98 = e30Var.GcLuU6pT9wO9();
                                                if (P05cfTpS5W5L4 || GcLuU6pT9wO98 == pa1Var) {
                                                    final int i31 = 0;
                                                    y10Var5 = y10Var7;
                                                    defpackage.y10 y10Var8 = new defpackage.y10() { // from class: yp0
                                                        @Override // defpackage.y10
                                                        public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj14) {
                                                            int i312 = i31;
                                                            defpackage.fo0 fo0Var3 = fo0Var2;
                                                            defpackage.y10 y10Var72 = y10Var2;
                                                            defpackage.y10 y10Var82 = y10Var4;
                                                            defpackage.gi giVar6 = giVar4;
                                                            defpackage.q5 q5Var = (defpackage.q5) obj14;
                                                            switch (i312) {
                                                                case 0:
                                                                    defpackage.np0 np0Var6 = ((defpackage.xo0) q5Var.giKS3J6vZuNy()).oh71FJcDz6S2;
                                                                    np0Var6.getClass();
                                                                    defpackage.fi fiVar = (defpackage.fi) np0Var6;
                                                                    if (((java.lang.Boolean) giVar6.fWTAfUmVKrZq.getValue()).booleanValue() || ((java.lang.Boolean) fo0Var3.getValue()).booleanValue()) {
                                                                        int i32 = defpackage.np0.e6mdH7fiFuta;
                                                                        for (defpackage.np0 np0Var7 : defpackage.b80.ZVVdXbWmyCSK(fiVar)) {
                                                                        }
                                                                        return (defpackage.ew) y10Var82.P05cfTpS5W5L(q5Var);
                                                                    }
                                                                    int i33 = defpackage.np0.e6mdH7fiFuta;
                                                                    for (defpackage.np0 np0Var8 : defpackage.b80.ZVVdXbWmyCSK(fiVar)) {
                                                                    }
                                                                    return (defpackage.ew) y10Var72.P05cfTpS5W5L(q5Var);
                                                                default:
                                                                    defpackage.np0 np0Var9 = ((defpackage.xo0) q5Var.fWTAfUmVKrZq()).oh71FJcDz6S2;
                                                                    np0Var9.getClass();
                                                                    defpackage.fi fiVar2 = (defpackage.fi) np0Var9;
                                                                    if (((java.lang.Boolean) giVar6.fWTAfUmVKrZq.getValue()).booleanValue() || ((java.lang.Boolean) fo0Var3.getValue()).booleanValue()) {
                                                                        int i34 = defpackage.np0.e6mdH7fiFuta;
                                                                        for (defpackage.np0 np0Var10 : defpackage.b80.ZVVdXbWmyCSK(fiVar2)) {
                                                                        }
                                                                        return (defpackage.ov) y10Var82.P05cfTpS5W5L(q5Var);
                                                                    }
                                                                    int i35 = defpackage.np0.e6mdH7fiFuta;
                                                                    for (defpackage.np0 np0Var11 : defpackage.b80.ZVVdXbWmyCSK(fiVar2)) {
                                                                    }
                                                                    return (defpackage.ov) y10Var72.P05cfTpS5W5L(q5Var);
                                                            }
                                                        }
                                                    };
                                                    e30Var.EgL5gQQnyJKX(y10Var8);
                                                    GcLuU6pT9wO98 = y10Var8;
                                                } else {
                                                    y10Var5 = y10Var7;
                                                }
                                                final defpackage.y10 y10Var9 = (defpackage.y10) GcLuU6pT9wO98;
                                                boolean z5 = (i2 & 234881024) == 67108864 ? z2 : z;
                                                java.lang.Object GcLuU6pT9wO99 = e30Var.GcLuU6pT9wO9();
                                                java.lang.Object obj14 = GcLuU6pT9wO99;
                                                if (z5 || GcLuU6pT9wO99 == pa1Var) {
                                                    defpackage.lp0 lp0Var = new defpackage.lp0(3);
                                                    e30Var.EgL5gQQnyJKX(lp0Var);
                                                    obj14 = lp0Var;
                                                }
                                                final defpackage.y10 y10Var10 = (defpackage.y10) obj14;
                                                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                                boolean P05cfTpS5W5L5 = e30Var.P05cfTpS5W5L(giVar4);
                                                java.lang.Object GcLuU6pT9wO910 = e30Var.GcLuU6pT9wO9();
                                                java.lang.Object obj15 = GcLuU6pT9wO910;
                                                if (P05cfTpS5W5L5 || GcLuU6pT9wO910 == pa1Var) {
                                                    defpackage.fWTAfUmVKrZq fwtafumvkrzq2 = new defpackage.fWTAfUmVKrZq(24, dg1Var2, giVar4);
                                                    e30Var.EgL5gQQnyJKX(fwtafumvkrzq2);
                                                    obj15 = fwtafumvkrzq2;
                                                }
                                                defpackage.nq1.oh71FJcDz6S2(bool, (defpackage.y10) obj15, e30Var);
                                                java.lang.Object GcLuU6pT9wO911 = e30Var.GcLuU6pT9wO9();
                                                java.lang.Object obj16 = GcLuU6pT9wO911;
                                                if (GcLuU6pT9wO911 == pa1Var) {
                                                    defpackage.ja1 ja1Var3 = new defpackage.ja1(xo0Var);
                                                    e30Var.EgL5gQQnyJKX(ja1Var3);
                                                    obj16 = ja1Var3;
                                                }
                                                defpackage.ja1 ja1Var4 = (defpackage.ja1) obj16;
                                                defpackage.jp1 IBvW5fLsPuHy = defpackage.vx1.IBvW5fLsPuHy(ja1Var4, "entry", e30Var, 56);
                                                if (((java.lang.Boolean) fo0Var2.getValue()).booleanValue()) {
                                                    e30Var.NkfcFfdaVTox(-1795329152);
                                                    java.lang.Float valueOf = java.lang.Float.valueOf(lw0Var2.P05cfTpS5W5L());
                                                    boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(fo0Var) | e30Var.P05cfTpS5W5L(ja1Var4);
                                                    java.lang.Object GcLuU6pT9wO912 = e30Var.GcLuU6pT9wO9();
                                                    if (oh71FJcDz6S22 || GcLuU6pT9wO912 == pa1Var) {
                                                        giVar3 = null;
                                                        GcLuU6pT9wO912 = new defpackage.oh71FJcDz6S2(ja1Var4, fo0Var, lw0Var2, false ? 1 : 0, 10);
                                                        ja1Var2 = ja1Var4;
                                                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO912);
                                                    } else {
                                                        ja1Var2 = ja1Var4;
                                                        giVar3 = null;
                                                    }
                                                    defpackage.nq1.GE9mJIPrb8gP((defpackage.c20) GcLuU6pT9wO912, e30Var, valueOf);
                                                    e30Var.XntWc4eZSQ8j(false);
                                                    jp1Var = IBvW5fLsPuHy;
                                                    ja1Var = ja1Var2;
                                                } else {
                                                    giVar3 = null;
                                                    boolean z6 = false;
                                                    e30Var.NkfcFfdaVTox(-1794910745);
                                                    boolean P05cfTpS5W5L6 = e30Var.P05cfTpS5W5L(ja1Var4) | e30Var.P05cfTpS5W5L(xo0Var) | e30Var.oh71FJcDz6S2(IBvW5fLsPuHy);
                                                    java.lang.Object GcLuU6pT9wO913 = e30Var.GcLuU6pT9wO9();
                                                    if (P05cfTpS5W5L6 || GcLuU6pT9wO913 == pa1Var) {
                                                        jp1Var = IBvW5fLsPuHy;
                                                        ja1Var = ja1Var4;
                                                        GcLuU6pT9wO913 = new defpackage.e2(ja1Var, xo0Var, jp1Var, z6 ? 1 : 0, 5);
                                                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO913);
                                                    } else {
                                                        jp1Var = IBvW5fLsPuHy;
                                                        ja1Var = ja1Var4;
                                                    }
                                                    defpackage.nq1.GE9mJIPrb8gP((defpackage.c20) GcLuU6pT9wO913, e30Var, xo0Var);
                                                    e30Var.XntWc4eZSQ8j(false);
                                                }
                                                boolean P05cfTpS5W5L7 = e30Var.P05cfTpS5W5L(nn0Var) | e30Var.P05cfTpS5W5L(giVar4) | e30Var.oh71FJcDz6S2(y10Var5) | e30Var.oh71FJcDz6S2(y10Var9) | e30Var.oh71FJcDz6S2(y10Var10);
                                                java.lang.Object GcLuU6pT9wO914 = e30Var.GcLuU6pT9wO9();
                                                if (P05cfTpS5W5L7 || GcLuU6pT9wO914 == pa1Var) {
                                                    final defpackage.gi giVar6 = giVar4;
                                                    final defpackage.nn0 nn0Var5 = nn0Var;
                                                    final defpackage.y10 y10Var11 = y10Var5;
                                                    dg1Var = dg1Var2;
                                                    GcLuU6pT9wO914 = new defpackage.y10() { // from class: zp0
                                                        @Override // defpackage.y10
                                                        public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj17) {
                                                            defpackage.q5 q5Var = (defpackage.q5) obj17;
                                                            float f = 0.0f;
                                                            if (!((java.util.List) dg1Var.getValue()).contains(q5Var.giKS3J6vZuNy())) {
                                                                return new defpackage.yk(defpackage.ov.giKS3J6vZuNy, defpackage.ew.giKS3J6vZuNy, 0.0f, new defpackage.ee1(defpackage.h5.QiMR8OkAhezm));
                                                            }
                                                            java.lang.String str4 = ((defpackage.xo0) q5Var.giKS3J6vZuNy()).GE9mJIPrb8gP;
                                                            defpackage.nn0 nn0Var6 = defpackage.nn0.this;
                                                            int giKS3J6vZuNy3 = nn0Var6.giKS3J6vZuNy(str4);
                                                            if (giKS3J6vZuNy3 >= 0) {
                                                                f = nn0Var6.fWTAfUmVKrZq[giKS3J6vZuNy3];
                                                            } else {
                                                                nn0Var6.JhCgjQRTAOCT(str4, 0.0f);
                                                            }
                                                            if (!defpackage.ma0.QiMR8OkAhezm(((defpackage.xo0) q5Var.fWTAfUmVKrZq()).GE9mJIPrb8gP, ((defpackage.xo0) q5Var.giKS3J6vZuNy()).GE9mJIPrb8gP)) {
                                                                f = (((java.lang.Boolean) giVar6.fWTAfUmVKrZq.getValue()).booleanValue() || ((java.lang.Boolean) fo0Var2.getValue()).booleanValue()) ? f - 1.0f : f + 1.0f;
                                                            }
                                                            nn0Var6.JhCgjQRTAOCT(((defpackage.xo0) q5Var.fWTAfUmVKrZq()).GE9mJIPrb8gP, f);
                                                            return new defpackage.yk((defpackage.ov) y10Var11.P05cfTpS5W5L(q5Var), (defpackage.ew) y10Var9.P05cfTpS5W5L(q5Var), f, (defpackage.ee1) y10Var10.P05cfTpS5W5L(q5Var));
                                                        }
                                                    };
                                                    nn0Var2 = nn0Var5;
                                                    giVar5 = giVar6;
                                                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO914);
                                                } else {
                                                    giVar5 = giVar4;
                                                    dg1Var = dg1Var2;
                                                    nn0Var2 = nn0Var;
                                                }
                                                defpackage.y10 y10Var12 = (defpackage.y10) GcLuU6pT9wO914;
                                                java.lang.Object GcLuU6pT9wO915 = e30Var.GcLuU6pT9wO9();
                                                java.lang.Object obj17 = GcLuU6pT9wO915;
                                                if (GcLuU6pT9wO915 == pa1Var) {
                                                    defpackage.lp0 lp0Var2 = new defpackage.lp0(5);
                                                    e30Var.EgL5gQQnyJKX(lp0Var2);
                                                    obj17 = lp0Var2;
                                                }
                                                defpackage.dg1 dg1Var3 = dg1Var;
                                                defpackage.xo0 xo0Var5 = xo0Var;
                                                defpackage.jp1 jp1Var2 = jp1Var;
                                                zq0Var2 = zq0Var3;
                                                defpackage.ok0.ZpBGe2uQfcn8(jp1Var2, vl0Var, y10Var12, iyh9uerbbbfm, (defpackage.y10) obj17, defpackage.nn.OcTWLQzke1i2(820763100, new defpackage.fq0(ja1Var, xo0Var5, frSwwKIlbUhK, fo0Var2, dg1Var3), e30Var), e30Var, ((i2 >> 3) & 112) | 221184 | (i2 & 7168));
                                                e30Var2 = e30Var;
                                                java.lang.Object oh71FJcDz6S23 = jp1Var2.ZpBGe2uQfcn8.oh71FJcDz6S2();
                                                java.lang.Object value = jp1Var2.JhCgjQRTAOCT.getValue();
                                                boolean oh71FJcDz6S24 = e30Var2.oh71FJcDz6S2(jp1Var2) | e30Var2.P05cfTpS5W5L(xp0Var) | e30Var2.P05cfTpS5W5L(xo0Var5) | e30Var2.P05cfTpS5W5L(giVar5) | e30Var2.P05cfTpS5W5L(nn0Var2);
                                                java.lang.Object GcLuU6pT9wO916 = e30Var2.GcLuU6pT9wO9();
                                                if (oh71FJcDz6S24 || GcLuU6pT9wO916 == pa1Var) {
                                                    obj2 = value;
                                                    defpackage.gq0 gq0Var = new defpackage.gq0(jp1Var2, xp0Var, xo0Var5, nn0Var2, dg1Var3, giVar5, null);
                                                    e30Var2.EgL5gQQnyJKX(gq0Var);
                                                    GcLuU6pT9wO916 = gq0Var;
                                                } else {
                                                    obj2 = value;
                                                }
                                                defpackage.nq1.Ns0WNyEWdPsk(oh71FJcDz6S23, obj2, (defpackage.c20) GcLuU6pT9wO916, e30Var2);
                                                e30Var2.XntWc4eZSQ8j(false);
                                            } else {
                                                giVar3 = giVar;
                                                e30Var2 = e30Var;
                                                zq0Var2 = zq0Var6;
                                                e30Var2.NkfcFfdaVTox(-1789758886);
                                                e30Var2.XntWc4eZSQ8j(z);
                                            }
                                            defpackage.yq0 giKS3J6vZuNy3 = zq0Var2.giKS3J6vZuNy("dialog");
                                            defpackage.hq hqVar = giKS3J6vZuNy3 instanceof defpackage.hq ? (defpackage.hq) giKS3J6vZuNy3 : giVar3;
                                            if (hqVar == null) {
                                                defpackage.f31 s0TASMVLSWD52 = e30Var2.s0TASMVLSWD5();
                                                if (s0TASMVLSWD52 != null) {
                                                    final int i32 = 0;
                                                    s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.c20() { // from class: bq0
                                                        @Override // defpackage.c20
                                                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj102, java.lang.Object obj112) {
                                                            int i292 = i32;
                                                            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                                                            int i302 = i;
                                                            switch (i292) {
                                                                case 0:
                                                                    ((java.lang.Integer) obj112).getClass();
                                                                    int IBvW5fLsPuHy2 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy2);
                                                                    break;
                                                                case 1:
                                                                    ((java.lang.Integer) obj112).getClass();
                                                                    int IBvW5fLsPuHy22 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy22);
                                                                    break;
                                                                default:
                                                                    ((java.lang.Integer) obj112).getClass();
                                                                    int IBvW5fLsPuHy3 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                                                                    defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy3);
                                                                    break;
                                                            }
                                                            return gs1Var;
                                                        }
                                                    };
                                                    return;
                                                }
                                                return;
                                            }
                                            defpackage.nq1.WDYagTQQm9ns(hqVar, e30Var2, 0);
                                        }
                                    }
                                    defpackage.rp0 rp0Var16 = ep0Var.fWTAfUmVKrZq;
                                    rp0Var16.getClass();
                                    giVar = null;
                                    ep0Var.GE9mJIPrb8gP(rp0Var16, null, null);
                                }
                            } else {
                                iArr2 = iArr;
                                zq0Var = zq0Var4;
                                wg0Var = wg0Var2;
                            }
                            arrayList = parcelableArrayList;
                            iArr3 = iArr2;
                            if (iArr3 != null) {
                                ep0Var2.getClass();
                                defpackage.rp0 rp0Var102 = ep0Var2.fWTAfUmVKrZq;
                                length = iArr3.length;
                                i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                    }
                                    i3++;
                                }
                                if (str == null) {
                                }
                            }
                            defpackage.rp0 rp0Var162 = ep0Var.fWTAfUmVKrZq;
                            rp0Var162.getClass();
                            giVar = null;
                            ep0Var.GE9mJIPrb8gP(rp0Var162, null, null);
                        }
                    }
                    zq0Var = zq0Var4;
                    i2 = i6;
                    wg0Var = wg0Var2;
                    defpackage.rp0 rp0Var1622 = ep0Var.fWTAfUmVKrZq;
                    rp0Var1622.getClass();
                    giVar = null;
                    ep0Var.GE9mJIPrb8gP(rp0Var1622, null, null);
                }
            }
            rp0Var2 = rp0Var;
            defpackage.zq0 zq0Var62 = zq0Var;
            defpackage.yq0 giKS3J6vZuNy22 = zq0Var62.giKS3J6vZuNy("composable");
            if (!(giKS3J6vZuNy22 instanceof defpackage.gi)) {
            }
            if (giVar2 != null) {
            }
        }
        defpackage.f31 s0TASMVLSWD53 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD53 != null) {
            final int i33 = 1;
            s0TASMVLSWD53.JhCgjQRTAOCT = new defpackage.c20() { // from class: bq0
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj102, java.lang.Object obj112) {
                    int i292 = i33;
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    int i302 = i;
                    switch (i292) {
                        case 0:
                            ((java.lang.Integer) obj112).getClass();
                            int IBvW5fLsPuHy2 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                            defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy2);
                            break;
                        case 1:
                            ((java.lang.Integer) obj112).getClass();
                            int IBvW5fLsPuHy22 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                            defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy22);
                            break;
                        default:
                            ((java.lang.Integer) obj112).getClass();
                            int IBvW5fLsPuHy3 = defpackage.m90.IBvW5fLsPuHy(i302 | 1);
                            defpackage.m90.JhCgjQRTAOCT(xp0Var, rp0Var, vl0Var, iyh9uerbbbfm, y10Var, y10Var2, y10Var3, y10Var4, (defpackage.e30) obj102, IBvW5fLsPuHy3);
                            break;
                    }
                    return gs1Var;
                }
            };
        }
    }

    public static int KrtOTfE6jiS2(int i, int i2, java.lang.String str) {
        return (int) frSwwKIlbUhK(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.rb0 Mearx7yMn90V(defpackage.l21 l21Var, defpackage.sb0 sb0Var, boolean z) {
        defpackage.rb0 rb0Var;
        defpackage.rb0 jjTN4uUnoyEn;
        defpackage.l01 l01Var;
        defpackage.ne xahdJg25P1Bv = defpackage.ok0.xahdJg25P1Bv(sb0Var);
        defpackage.sb0 sb0Var2 = sb0Var.ZpBGe2uQfcn8;
        boolean fWTAfUmVKrZq = sb0Var2.ZpBGe2uQfcn8.fWTAfUmVKrZq();
        java.util.List ZpBGe2uQfcn8 = sb0Var2.ZpBGe2uQfcn8.ZpBGe2uQfcn8();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(ZpBGe2uQfcn8, 10));
        java.util.Iterator it = ZpBGe2uQfcn8.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            defpackage.p81.ZpBGe2uQfcn8();
            return null;
        }
        if (arrayList.isEmpty()) {
            if (defpackage.q70.qjMheFZ0l9kA(xahdJg25P1Bv)) {
                l21Var.getClass();
            }
            defpackage.n80 n80Var = defpackage.qc1.ZpBGe2uQfcn8;
            if (fWTAfUmVKrZq) {
                rb0Var = defpackage.qc1.giKS3J6vZuNy.s0TASMVLSWD5(xahdJg25P1Bv);
            } else {
                rb0Var = defpackage.qc1.ZpBGe2uQfcn8.s0TASMVLSWD5(xahdJg25P1Bv);
                if (rb0Var == null) {
                    rb0Var = null;
                }
            }
        } else {
            l21Var.getClass();
            defpackage.n80 n80Var2 = defpackage.qc1.ZpBGe2uQfcn8;
            java.lang.Object BHfvd2J71qpO = !fWTAfUmVKrZq ? defpackage.qc1.fWTAfUmVKrZq.BHfvd2J71qpO(xahdJg25P1Bv, arrayList) : defpackage.qc1.JhCgjQRTAOCT.BHfvd2J71qpO(xahdJg25P1Bv, arrayList);
            if (BHfvd2J71qpO instanceof defpackage.g51) {
                BHfvd2J71qpO = null;
            }
            rb0Var = (defpackage.rb0) BHfvd2J71qpO;
        }
        if (rb0Var != null) {
            return rb0Var;
        }
        if (arrayList.isEmpty()) {
            jjTN4uUnoyEn = defpackage.t80.hH0RRJrNssvh(xahdJg25P1Bv);
            if (jjTN4uUnoyEn == null) {
                l21Var.getClass();
                if (defpackage.q70.qjMheFZ0l9kA(xahdJg25P1Bv)) {
                    l01Var = new defpackage.l01(xahdJg25P1Bv);
                    jjTN4uUnoyEn = l01Var;
                }
                jjTN4uUnoyEn = null;
            }
            if (jjTN4uUnoyEn != null) {
                return fWTAfUmVKrZq ? defpackage.jr0.UmgHb6n58gfG(jjTN4uUnoyEn) : jjTN4uUnoyEn;
            }
        } else {
            java.util.ArrayList xahdJg25P1Bv2 = defpackage.t80.xahdJg25P1Bv(l21Var, arrayList, z);
            if (xahdJg25P1Bv2 != null) {
                jjTN4uUnoyEn = defpackage.t80.jjTN4uUnoyEn(xahdJg25P1Bv, xahdJg25P1Bv2, new defpackage.jc1(1, arrayList));
                if (jjTN4uUnoyEn == null) {
                    if (defpackage.q70.qjMheFZ0l9kA(xahdJg25P1Bv)) {
                        l01Var = new defpackage.l01(xahdJg25P1Bv);
                        jjTN4uUnoyEn = l01Var;
                    }
                    jjTN4uUnoyEn = null;
                }
                if (jjTN4uUnoyEn != null) {
                }
            }
        }
        return null;
    }

    public static final boolean Ns0WNyEWdPsk(float f) {
        return java.lang.Float.isNaN(f) || java.lang.Math.abs(f) < 0.5f;
    }

    public static final int OcTWLQzke1i2(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void P05cfTpS5W5L(java.lang.String str, defpackage.vl0 vl0Var, java.lang.String str2, defpackage.e30 e30Var, int i) {
        defpackage.e30 e30Var2 = e30Var;
        str.getClass();
        e30Var2.PS16moFv2oLu(-538739556);
        int i2 = i | (e30Var2.oh71FJcDz6S2(str) ? 4 : 2) | (e30Var2.oh71FJcDz6S2(vl0Var) ? 32 : 16) | (e30Var2.oh71FJcDz6S2(str2) ? 256 : 128) | 3072;
        if (e30Var2.zJPqDeoF0Os1(i2 & 1, (i2 & 1171) != 1170)) {
            defpackage.vl0 WmetiUbpKU9I = defpackage.h0.WmetiUbpKU9I(vl0Var, ((defpackage.gd1) e30Var2.GE9mJIPrb8gP(defpackage.id1.ZpBGe2uQfcn8)).fWTAfUmVKrZq);
            defpackage.ng1 ng1Var = defpackage.wf.ZpBGe2uQfcn8;
            defpackage.vl0 xahdJg25P1Bv = defpackage.nq1.xahdJg25P1Bv(defpackage.nn.JhCgjQRTAOCT(WmetiUbpKU9I, defpackage.pf.giKS3J6vZuNy(((defpackage.uf) e30Var2.GE9mJIPrb8gP(ng1Var)).ZpBGe2uQfcn8, 0.1f), defpackage.la0.blKFvluuDQOf), 12.0f);
            defpackage.gg ZpBGe2uQfcn8 = defpackage.eg.ZpBGe2uQfcn8(new defpackage.l7(4.0f, new defpackage.h7(0)), defpackage.jVUAPb5NnIYW.BHfvd2J71qpO, e30Var2, 54);
            int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, xahdJg25P1Bv);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var2, ZpBGe2uQfcn8);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var2, fNwYGHIYeJcR);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var2, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var2, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var2, oCu53ZX2v4Ju);
            defpackage.ng1 ng1Var2 = defpackage.hr1.ZpBGe2uQfcn8;
            defpackage.ym1.giKS3J6vZuNy(str, null, ((defpackage.uf) e30Var2.GE9mJIPrb8gP(ng1Var)).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.gr1) e30Var2.GE9mJIPrb8gP(ng1Var2)).e6mdH7fiFuta, e30Var2, i2 & 14, 0, 131066);
            if (str2 != null) {
                e30Var2.NkfcFfdaVTox(30794565);
                defpackage.ym1.giKS3J6vZuNy(str2, null, ((defpackage.uf) e30Var2.GE9mJIPrb8gP(ng1Var)).ZpBGe2uQfcn8, 0L, 0L, new defpackage.tj1(3), 0L, 0, false, 0, 0, ((defpackage.gr1) e30Var2.GE9mJIPrb8gP(ng1Var2)).P05cfTpS5W5L, e30Var, (i2 >> 6) & 14, 0, 130042);
                e30Var2 = e30Var;
                e30Var2.XntWc4eZSQ8j(false);
            } else {
                e30Var2 = e30Var2;
                e30Var2.NkfcFfdaVTox(31026352);
                e30Var2.NkfcFfdaVTox(31026351);
                e30Var2.XntWc4eZSQ8j(false);
                e30Var2.XntWc4eZSQ8j(false);
            }
            e30Var2.XntWc4eZSQ8j(true);
        } else {
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.p71(str, vl0Var, str2, i, 11);
        }
    }

    public static final void QiMR8OkAhezm(defpackage.jf0 jf0Var, java.lang.Object obj, int i, java.lang.Object obj2, defpackage.e30 e30Var, int i2) {
        e30Var.PS16moFv2oLu(1439843069);
        int i3 = (e30Var.oh71FJcDz6S2(jf0Var) ? 4 : 2) | i2 | (e30Var.oh71FJcDz6S2(obj) ? 32 : 16) | (e30Var.JhCgjQRTAOCT(i) ? 256 : 128) | (e30Var.oh71FJcDz6S2(obj2) ? 2048 : 1024);
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 1171) != 1170)) {
            ((defpackage.i71) obj).giKS3J6vZuNy(obj2, defpackage.nn.OcTWLQzke1i2(980966366, new defpackage.pe0(i, jf0Var, obj2), e30Var), e30Var, 48);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.n3(jf0Var, obj, i, obj2, i2);
        }
    }

    public static final long UmgHb6n58gfG(long j, float f) {
        long floatToRawIntBits = j | (java.lang.Float.floatToRawIntBits(f) & 4294967295L);
        defpackage.un1[] un1VarArr = defpackage.tn1.giKS3J6vZuNy;
        return floatToRawIntBits;
    }

    public static final long VFeft99leXEK(double d) {
        return UmgHb6n58gfG(4294967296L, (float) d);
    }

    public static final void WDYagTQQm9ns(final defpackage.xp0 xp0Var, final java.lang.Object obj, final defpackage.vl0 vl0Var, defpackage.iYH9ueRbBBFm iyh9uerbbbfm, java.util.Map map, defpackage.y10 y10Var, defpackage.y10 y10Var2, defpackage.y10 y10Var3, defpackage.y10 y10Var4, defpackage.y10 y10Var5, defpackage.e30 e30Var, final int i) {
        defpackage.y10 y10Var6;
        int i2;
        defpackage.y10 y10Var7;
        java.util.Map map2;
        defpackage.y10 y10Var8;
        defpackage.iYH9ueRbBBFm iyh9uerbbbfm2;
        defpackage.y10 y10Var9;
        defpackage.y10 y10Var10;
        java.lang.Object fWTAfUmVKrZq;
        final defpackage.y10 y10Var11;
        final defpackage.y10 y10Var12;
        final defpackage.y10 y10Var13;
        final defpackage.y10 y10Var14;
        final java.util.Map map3;
        final defpackage.iYH9ueRbBBFm iyh9uerbbbfm3;
        e30Var.PS16moFv2oLu(-1476019057);
        int i3 = 2;
        int i4 = 4;
        int i5 = i | (e30Var.P05cfTpS5W5L(xp0Var) ? 4 : 2) | 316369920;
        if ((306783379 & i5) == 306783378 && e30Var.OcTWLQzke1i2()) {
            e30Var.Jkfc0NcwyPL8();
            iyh9uerbbbfm3 = iyh9uerbbbfm;
            map3 = map;
            y10Var13 = y10Var;
            y10Var14 = y10Var2;
            y10Var11 = y10Var3;
            y10Var12 = y10Var4;
            y10Var10 = y10Var5;
        } else {
            e30Var.CZa7MwI9IzLd();
            int i6 = i & 1;
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (i6 == 0 || e30Var.oCu53ZX2v4Ju()) {
                defpackage.ea eaVar = defpackage.jVUAPb5NnIYW.oh71FJcDz6S2;
                java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                if (GcLuU6pT9wO9 == pa1Var) {
                    GcLuU6pT9wO9 = new defpackage.lp0(i3);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                }
                y10Var6 = (defpackage.y10) GcLuU6pT9wO9;
                java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                if (GcLuU6pT9wO92 == pa1Var) {
                    GcLuU6pT9wO92 = new defpackage.lp0(i4);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                }
                i2 = i5 & (-2113929217);
                y10Var7 = (defpackage.y10) GcLuU6pT9wO92;
                map2 = defpackage.bv.WDYagTQQm9ns;
                y10Var8 = y10Var7;
                iyh9uerbbbfm2 = eaVar;
                y10Var9 = y10Var6;
            } else {
                e30Var.Jkfc0NcwyPL8();
                i2 = i5 & (-2113929217);
                iyh9uerbbbfm2 = iyh9uerbbbfm;
                map2 = map;
                y10Var9 = y10Var;
                y10Var8 = y10Var2;
                y10Var6 = y10Var3;
                y10Var7 = y10Var4;
            }
            e30Var.WmetiUbpKU9I();
            boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(null) | e30Var.oh71FJcDz6S2(obj);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S2 || GcLuU6pT9wO93 == pa1Var) {
                defpackage.sp0 sp0Var = new defpackage.sp0(xp0Var.giKS3J6vZuNy.BHfvd2J71qpO, obj, map2);
                y10Var10 = y10Var5;
                y10Var10.P05cfTpS5W5L(sp0Var);
                fWTAfUmVKrZq = sp0Var.fWTAfUmVKrZq();
                e30Var.EgL5gQQnyJKX(fWTAfUmVKrZq);
            } else {
                fWTAfUmVKrZq = GcLuU6pT9wO93;
                y10Var10 = y10Var5;
            }
            defpackage.y10 y10Var15 = y10Var6;
            JhCgjQRTAOCT(xp0Var, (defpackage.rp0) fWTAfUmVKrZq, vl0Var, iyh9uerbbbfm2, y10Var9, y10Var8, y10Var15, y10Var7, e30Var, 100884480 | (i2 & 8078));
            y10Var11 = y10Var15;
            y10Var12 = y10Var7;
            y10Var13 = y10Var9;
            y10Var14 = y10Var8;
            map3 = map2;
            iyh9uerbbbfm3 = iyh9uerbbbfm2;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            final defpackage.y10 y10Var16 = y10Var10;
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20(obj, vl0Var, iyh9uerbbbfm3, map3, y10Var13, y10Var14, y10Var11, y10Var12, y10Var16, i) { // from class: aq0
                public final /* synthetic */ defpackage.y10 GE9mJIPrb8gP;
                public final /* synthetic */ defpackage.y10 Ns0WNyEWdPsk;
                public final /* synthetic */ defpackage.iYH9ueRbBBFm P05cfTpS5W5L;
                public final /* synthetic */ defpackage.vl0 QiMR8OkAhezm;
                public final /* synthetic */ java.util.Map e6mdH7fiFuta;
                public final /* synthetic */ defpackage.y10 fNwYGHIYeJcR;
                public final /* synthetic */ defpackage.y10 gUjdnLbkVAaA;
                public final /* synthetic */ defpackage.y10 h3m55N1URyyK;
                public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(433);
                    defpackage.m90.WDYagTQQm9ns(defpackage.xp0.this, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, this.h3m55N1URyyK, this.gUjdnLbkVAaA, (defpackage.e30) obj2, IBvW5fLsPuHy);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final java.lang.Object WmetiUbpKU9I(defpackage.h61 h61Var, defpackage.y10 y10Var, defpackage.kl klVar) {
        defpackage.vo1 vo1Var;
        if (h61Var.QiMR8OkAhezm() && h61Var.e6mdH7fiFuta() && h61Var.P05cfTpS5W5L()) {
            return y10Var.P05cfTpS5W5L(klVar);
        }
        if (klVar.oh71FJcDz6S2().XntWc4eZSQ8j(defpackage.hd.QiMR8OkAhezm) == null) {
            return y10Var.P05cfTpS5W5L(klVar);
        }
        defpackage.JhCgjQRTAOCT jhCgjQRTAOCT = new defpackage.JhCgjQRTAOCT(y10Var, null, 23);
        defpackage.uo1 uo1Var = (defpackage.uo1) klVar.oh71FJcDz6S2().XntWc4eZSQ8j(defpackage.uo1.oh71FJcDz6S2);
        defpackage.lm lmVar = uo1Var != null ? uo1Var.WDYagTQQm9ns : null;
        if (lmVar != null) {
            return defpackage.ok0.fhbmYuu9J3cT(lmVar, jhCgjQRTAOCT, klVar);
        }
        defpackage.dd ddVar = new defpackage.dd(1, defpackage.q70.OcTWLQzke1i2(klVar));
        ddVar.IJ0hOnjhPOri();
        try {
            vo1Var = h61Var.JhCgjQRTAOCT;
        } catch (java.util.concurrent.RejectedExecutionException e) {
            ddVar.T1fB7bDYiVJQ(new java.lang.IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (vo1Var != null) {
            vo1Var.execute(new defpackage.x41(ddVar, h61Var, jhCgjQRTAOCT));
            return ddVar.w7APNrr0aGRc();
        }
        defpackage.ma0.hH0RRJrNssvh("internalTransactionExecutor");
        throw null;
    }

    public static final void XntWc4eZSQ8j(int i) {
        if (i >= 1) {
            return;
        }
        defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Expected positive parallelism level, but got ", i));
    }

    public static final android.graphics.Rect ZVVdXbWmyCSK(android.text.TextPaint textPaint, java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof android.text.Spanned) {
            android.text.Spanned spanned = (android.text.Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, android.text.style.MetricAffectingSpan.class) != i2) {
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                android.text.TextPaint textPaint2 = new android.text.TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, android.text.style.MetricAffectingSpan.class);
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = (android.text.style.MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, android.text.style.MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = java.lang.Math.min(rect.top, rect2.top);
                    rect.bottom = java.lang.Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        android.graphics.Rect rect3 = new android.graphics.Rect();
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x03d6, code lost:
    
        if (r9 != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x034a, code lost:
    
        if (r9 != false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0318, code lost:
    
        if (r9 != false) goto L211;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x042a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ZpBGe2uQfcn8(final java.lang.CharSequence charSequence, final defpackage.c20 c20Var, final defpackage.ll1 ll1Var, final defpackage.d20 d20Var, defpackage.c20 c20Var2, final defpackage.in0 in0Var, final defpackage.wv0 wv0Var, final defpackage.vk1 vk1Var, final defpackage.c20 c20Var3, defpackage.e30 e30Var, final int i, final int i2) {
        int i3;
        java.lang.CharSequence charSequence2;
        int i4;
        defpackage.e30 e30Var2;
        final defpackage.c20 c20Var4;
        defpackage.pn1 pn1Var;
        defpackage.pn1 pn1Var2;
        boolean z;
        float f;
        int ordinal;
        float f2;
        int ordinal2;
        defpackage.pw0 pw0Var;
        float f3;
        int ordinal3;
        float f4;
        defpackage.fp1 oh71FJcDz6S2;
        int ordinal4;
        float f5;
        int ordinal5;
        int[] iArr;
        boolean oh71FJcDz6S22;
        java.lang.Object GcLuU6pT9wO9;
        defpackage.s80 s80Var;
        defpackage.hp1 hp1Var;
        long j;
        boolean oh71FJcDz6S23;
        java.lang.Object GcLuU6pT9wO92;
        java.lang.Object GcLuU6pT9wO93;
        defpackage.pa1 pa1Var;
        boolean z2;
        defpackage.nh nhVar;
        defpackage.hp1 hp1Var2;
        defpackage.nh OcTWLQzke1i2;
        java.lang.Object GcLuU6pT9wO94;
        java.lang.Object GcLuU6pT9wO95;
        defpackage.nh nhVar2;
        e30Var.PS16moFv2oLu(546805032);
        if ((i & 6) == 0) {
            i3 = (e30Var.JhCgjQRTAOCT(0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            charSequence2 = charSequence;
            i3 |= e30Var.P05cfTpS5W5L(charSequence2) ? 32 : 16;
        } else {
            charSequence2 = charSequence;
        }
        if ((i & 384) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(ll1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(d20Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(null) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(c20Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(null) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = (e30Var.P05cfTpS5W5L(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= e30Var.QiMR8OkAhezm(false) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= e30Var.QiMR8OkAhezm(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= e30Var.QiMR8OkAhezm(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= e30Var.oh71FJcDz6S2(in0Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= e30Var.oh71FJcDz6S2(wv0Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= e30Var.oh71FJcDz6S2(vk1Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= e30Var.P05cfTpS5W5L(c20Var3) ? 8388608 : 4194304;
        }
        int i6 = i4;
        if (e30Var.zJPqDeoF0Os1(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 4793491) == 4793490) ? false : true)) {
            boolean booleanValue = ((java.lang.Boolean) defpackage.nq1.VFeft99leXEK(in0Var, e30Var, (i6 >> 12) & 14).getValue()).booleanValue();
            defpackage.s80 s80Var2 = defpackage.s80.QiMR8OkAhezm;
            defpackage.s80 s80Var3 = defpackage.s80.oh71FJcDz6S2;
            defpackage.s80 s80Var4 = defpackage.s80.WDYagTQQm9ns;
            defpackage.s80 s80Var5 = booleanValue ? s80Var4 : charSequence2.length() == 0 ? s80Var3 : s80Var2;
            long j2 = booleanValue ? vk1Var.VFeft99leXEK : vk1Var.oCu53ZX2v4Ju;
            defpackage.gr1 gr1Var = (defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8);
            defpackage.pn1 pn1Var3 = gr1Var.GE9mJIPrb8gP;
            defpackage.pn1 pn1Var4 = gr1Var.fNwYGHIYeJcR;
            long giKS3J6vZuNy = pn1Var3.giKS3J6vZuNy();
            long j3 = defpackage.pf.QiMR8OkAhezm;
            boolean z3 = (defpackage.pf.fWTAfUmVKrZq(giKS3J6vZuNy, j3) && !defpackage.pf.fWTAfUmVKrZq(pn1Var4.giKS3J6vZuNy(), j3)) || (!defpackage.pf.fWTAfUmVKrZq(pn1Var3.giKS3J6vZuNy(), j3) && defpackage.pf.fWTAfUmVKrZq(pn1Var4.giKS3J6vZuNy(), j3));
            long giKS3J6vZuNy2 = pn1Var4.giKS3J6vZuNy();
            long j4 = (z3 && giKS3J6vZuNy2 == 16) ? j2 : giKS3J6vZuNy2;
            long giKS3J6vZuNy3 = pn1Var3.giKS3J6vZuNy();
            long j5 = (z3 && giKS3J6vZuNy3 == 16) ? j2 : giKS3J6vZuNy3;
            boolean z4 = d20Var != null;
            java.lang.Object GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var2 = defpackage.cj.ZpBGe2uQfcn8;
            if (GcLuU6pT9wO96 == pa1Var2) {
                pn1Var = pn1Var4;
                pn1Var2 = pn1Var3;
                z = z3;
                GcLuU6pT9wO96 = new defpackage.jp1(new defpackage.go0(s80Var5), null, "TextFieldInputState");
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO96);
            } else {
                pn1Var = pn1Var4;
                pn1Var2 = pn1Var3;
                z = z3;
            }
            defpackage.jp1 jp1Var = (defpackage.jp1) GcLuU6pT9wO96;
            jp1Var.ZpBGe2uQfcn8(s80Var5, e30Var, 48);
            defpackage.ti tiVar = jp1Var.ZpBGe2uQfcn8;
            defpackage.pw0 pw0Var2 = jp1Var.JhCgjQRTAOCT;
            java.lang.Object GcLuU6pT9wO97 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO97 == pa1Var2) {
                GcLuU6pT9wO97 = new defpackage.lp1(jp1Var, 1);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO97);
            }
            defpackage.nq1.oh71FJcDz6S2(jp1Var, (defpackage.y10) GcLuU6pT9wO97, e30Var);
            defpackage.vf1 z16KqenTjq8o = defpackage.t80.z16KqenTjq8o(defpackage.jm0.WDYagTQQm9ns, e30Var);
            defpackage.lq1 lq1Var = defpackage.nn.ZVVdXbWmyCSK;
            defpackage.s80 s80Var6 = (defpackage.s80) tiVar.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-1436405362);
            int ordinal6 = s80Var6.ordinal();
            float f6 = 0.0f;
            if (ordinal6 != 0) {
                if (ordinal6 != 1) {
                    if (ordinal6 != 2) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return;
                    }
                } else if (z4) {
                    f = 0.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf = java.lang.Float.valueOf(f);
                    defpackage.s80 s80Var7 = (defpackage.s80) pw0Var2.getValue();
                    e30Var.NkfcFfdaVTox(-1436405362);
                    ordinal = s80Var7.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                defpackage.h7.T1fB7bDYiVJQ();
                                return;
                            }
                        } else if (z4) {
                            f2 = 0.0f;
                            e30Var.XntWc4eZSQ8j(false);
                            java.lang.Float valueOf2 = java.lang.Float.valueOf(f2);
                            jp1Var.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(-709912974);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.hp1 s0TASMVLSWD5 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf, valueOf2, z16KqenTjq8o, lq1Var, e30Var, 196608);
                            defpackage.jm0 jm0Var = defpackage.jm0.oh71FJcDz6S2;
                            defpackage.vf1 z16KqenTjq8o2 = defpackage.t80.z16KqenTjq8o(jm0Var, e30Var);
                            defpackage.vf1 z16KqenTjq8o3 = defpackage.t80.z16KqenTjq8o(defpackage.jm0.QiMR8OkAhezm, e30Var);
                            defpackage.s80 s80Var8 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(-1093194547);
                            ordinal2 = s80Var8.ordinal();
                            if (ordinal2 != 0) {
                                pw0Var = pw0Var2;
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        defpackage.h7.T1fB7bDYiVJQ();
                                        return;
                                    }
                                }
                                f3 = 0.0f;
                                e30Var.XntWc4eZSQ8j(false);
                                java.lang.Float valueOf3 = java.lang.Float.valueOf(f3);
                                defpackage.s80 s80Var9 = (defpackage.s80) pw0Var.getValue();
                                e30Var.NkfcFfdaVTox(-1093194547);
                                ordinal3 = s80Var9.ordinal();
                                if (ordinal3 != 0) {
                                    if (ordinal3 != 1) {
                                        if (ordinal3 != 2) {
                                            defpackage.h7.T1fB7bDYiVJQ();
                                            return;
                                        }
                                    }
                                    f4 = 0.0f;
                                    e30Var.XntWc4eZSQ8j(false);
                                    java.lang.Float valueOf4 = java.lang.Float.valueOf(f4);
                                    oh71FJcDz6S2 = jp1Var.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(-984009111);
                                    if (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var4, s80Var3) || (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var3, s80Var4) && !oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var2, s80Var3))) {
                                        z16KqenTjq8o3 = z16KqenTjq8o2;
                                    }
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.hp1 s0TASMVLSWD52 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf3, valueOf4, z16KqenTjq8o3, lq1Var, e30Var, 196608);
                                    defpackage.s80 s80Var10 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(-1258455321);
                                    ordinal4 = s80Var10.ordinal();
                                    if (ordinal4 != 0) {
                                        if (ordinal4 != 1) {
                                            if (ordinal4 != 2) {
                                                defpackage.h7.T1fB7bDYiVJQ();
                                                return;
                                            }
                                        } else if (z4) {
                                            f5 = 0.0f;
                                            e30Var.XntWc4eZSQ8j(false);
                                            java.lang.Float valueOf5 = java.lang.Float.valueOf(f5);
                                            defpackage.s80 s80Var11 = (defpackage.s80) pw0Var.getValue();
                                            e30Var.NkfcFfdaVTox(-1258455321);
                                            ordinal5 = s80Var11.ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    if (ordinal5 != 2) {
                                                        defpackage.h7.T1fB7bDYiVJQ();
                                                        return;
                                                    }
                                                }
                                            }
                                            f6 = 1.0f;
                                            e30Var.XntWc4eZSQ8j(false);
                                            java.lang.Float valueOf6 = java.lang.Float.valueOf(f6);
                                            jp1Var.oh71FJcDz6S2();
                                            e30Var.NkfcFfdaVTox(2126293195);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.hp1 s0TASMVLSWD53 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf5, valueOf6, z16KqenTjq8o2, lq1Var, e30Var, 196608);
                                            defpackage.vf1 z16KqenTjq8o4 = defpackage.t80.z16KqenTjq8o(jm0Var, e30Var);
                                            defpackage.s80 s80Var12 = (defpackage.s80) pw0Var.getValue();
                                            e30Var.NkfcFfdaVTox(-12973394);
                                            iArr = defpackage.dl1.ZpBGe2uQfcn8;
                                            long j6 = iArr[s80Var12.ordinal()] != 1 ? j4 : j5;
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.xf oh71FJcDz6S24 = defpackage.pf.oh71FJcDz6S2(j6);
                                            oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S24);
                                            GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                                            int i7 = 7;
                                            if (!oh71FJcDz6S22 || GcLuU6pT9wO9 == pa1Var2) {
                                                defpackage.lq1 lq1Var2 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i7, oh71FJcDz6S24));
                                                e30Var.EgL5gQQnyJKX(lq1Var2);
                                                GcLuU6pT9wO9 = lq1Var2;
                                            }
                                            defpackage.lq1 lq1Var3 = (defpackage.lq1) GcLuU6pT9wO9;
                                            s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
                                            e30Var.NkfcFfdaVTox(-12973394);
                                            if (iArr[s80Var.ordinal()] != 1) {
                                                hp1Var = s0TASMVLSWD53;
                                                j = j4;
                                            } else {
                                                hp1Var = s0TASMVLSWD53;
                                                j = j5;
                                            }
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.pf pfVar = new defpackage.pf(j);
                                            defpackage.s80 s80Var13 = (defpackage.s80) pw0Var.getValue();
                                            e30Var.NkfcFfdaVTox(-12973394);
                                            long j7 = iArr[s80Var13.ordinal()] != 1 ? j4 : j5;
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.pf pfVar2 = new defpackage.pf(j7);
                                            jp1Var.oh71FJcDz6S2();
                                            e30Var.NkfcFfdaVTox(1954111929);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.hp1 s0TASMVLSWD54 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar, pfVar2, z16KqenTjq8o4, lq1Var3, e30Var, 196608);
                                            e30Var.NkfcFfdaVTox(-464752477);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.xf oh71FJcDz6S25 = defpackage.pf.oh71FJcDz6S2(j2);
                                            oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S25);
                                            GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                                            if (!oh71FJcDz6S23 || GcLuU6pT9wO92 == pa1Var2) {
                                                defpackage.lq1 lq1Var4 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S25));
                                                e30Var.EgL5gQQnyJKX(lq1Var4);
                                                GcLuU6pT9wO92 = lq1Var4;
                                            }
                                            e30Var.NkfcFfdaVTox(-464752477);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.pf pfVar3 = new defpackage.pf(j2);
                                            e30Var.NkfcFfdaVTox(-464752477);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.pf pfVar4 = new defpackage.pf(j2);
                                            jp1Var.oh71FJcDz6S2();
                                            e30Var.NkfcFfdaVTox(1190923886);
                                            e30Var.XntWc4eZSQ8j(false);
                                            defpackage.hp1 s0TASMVLSWD55 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar3, pfVar4, z16KqenTjq8o4, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
                                            GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                                            if (GcLuU6pT9wO93 == pa1Var2) {
                                                GcLuU6pT9wO93 = new defpackage.cl1();
                                                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
                                            }
                                            defpackage.cl1 cl1Var = (defpackage.cl1) GcLuU6pT9wO93;
                                            if (d20Var != null) {
                                                e30Var.NkfcFfdaVTox(-1891724857);
                                                e30Var.XntWc4eZSQ8j(false);
                                                pa1Var = pa1Var2;
                                                z2 = false;
                                                OcTWLQzke1i2 = null;
                                                nhVar = null;
                                                hp1Var2 = s0TASMVLSWD52;
                                            } else {
                                                e30Var.NkfcFfdaVTox(-1891724856);
                                                pa1Var = pa1Var2;
                                                z2 = false;
                                                nhVar = null;
                                                hp1Var2 = s0TASMVLSWD52;
                                                OcTWLQzke1i2 = defpackage.nn.OcTWLQzke1i2(-1076580032, new defpackage.al1(pn1Var2, pn1Var, s0TASMVLSWD5, s0TASMVLSWD55, z, s0TASMVLSWD54, d20Var, cl1Var), e30Var);
                                                e30Var.XntWc4eZSQ8j(false);
                                            }
                                            GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                                            if (GcLuU6pT9wO94 == pa1Var) {
                                                defpackage.pa1 pa1Var3 = defpackage.pa1.Ns0WNyEWdPsk;
                                                defpackage.cq0 cq0Var = new defpackage.cq0(hp1Var2, 3);
                                                defpackage.a7 a7Var = defpackage.af1.ZpBGe2uQfcn8;
                                                defpackage.qp qpVar = new defpackage.qp(cq0Var, pa1Var3);
                                                e30Var.EgL5gQQnyJKX(qpVar);
                                                GcLuU6pT9wO94 = qpVar;
                                            }
                                            e30Var.NkfcFfdaVTox(-1890217110);
                                            e30Var.XntWc4eZSQ8j(z2);
                                            GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                                            if (GcLuU6pT9wO95 == pa1Var) {
                                                defpackage.pa1 pa1Var4 = defpackage.pa1.Ns0WNyEWdPsk;
                                                defpackage.cq0 cq0Var2 = new defpackage.cq0(hp1Var, 4);
                                                defpackage.a7 a7Var2 = defpackage.af1.ZpBGe2uQfcn8;
                                                defpackage.qp qpVar2 = new defpackage.qp(cq0Var2, pa1Var4);
                                                e30Var.EgL5gQQnyJKX(qpVar2);
                                                GcLuU6pT9wO95 = qpVar2;
                                            }
                                            e30Var.NkfcFfdaVTox(-1889500886);
                                            e30Var.XntWc4eZSQ8j(z2);
                                            e30Var.NkfcFfdaVTox(-1888924534);
                                            e30Var.XntWc4eZSQ8j(z2);
                                            e30Var.NkfcFfdaVTox(-1888749663);
                                            e30Var.XntWc4eZSQ8j(z2);
                                            long j8 = !booleanValue ? vk1Var.ZVVdXbWmyCSK : vk1Var.w7APNrr0aGRc;
                                            if (c20Var2 != null) {
                                                e30Var.NkfcFfdaVTox(-1888469888);
                                                e30Var.XntWc4eZSQ8j(z2);
                                                c20Var4 = c20Var2;
                                                nhVar2 = nhVar;
                                            } else {
                                                e30Var.NkfcFfdaVTox(-1888469887);
                                                c20Var4 = c20Var2;
                                                defpackage.nh OcTWLQzke1i22 = defpackage.nn.OcTWLQzke1i2(1334518521, new defpackage.bl1(j8, c20Var4), e30Var);
                                                e30Var.XntWc4eZSQ8j(z2);
                                                nhVar2 = OcTWLQzke1i22;
                                            }
                                            e30Var.NkfcFfdaVTox(-1888176380);
                                            e30Var.XntWc4eZSQ8j(z2);
                                            e30Var.NkfcFfdaVTox(-1887830698);
                                            defpackage.nh nhVar3 = nhVar;
                                            defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar3, nhVar, nhVar2, nhVar3, nhVar3, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD5, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar3, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                            e30Var2 = e30Var;
                                            e30Var2.XntWc4eZSQ8j(z2);
                                        }
                                    }
                                    f5 = 1.0f;
                                    e30Var.XntWc4eZSQ8j(false);
                                    java.lang.Float valueOf52 = java.lang.Float.valueOf(f5);
                                    defpackage.s80 s80Var112 = (defpackage.s80) pw0Var.getValue();
                                    e30Var.NkfcFfdaVTox(-1258455321);
                                    ordinal5 = s80Var112.ordinal();
                                    if (ordinal5 != 0) {
                                    }
                                    f6 = 1.0f;
                                    e30Var.XntWc4eZSQ8j(false);
                                    java.lang.Float valueOf62 = java.lang.Float.valueOf(f6);
                                    jp1Var.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(2126293195);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.hp1 s0TASMVLSWD532 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf52, valueOf62, z16KqenTjq8o2, lq1Var, e30Var, 196608);
                                    defpackage.vf1 z16KqenTjq8o42 = defpackage.t80.z16KqenTjq8o(jm0Var, e30Var);
                                    defpackage.s80 s80Var122 = (defpackage.s80) pw0Var.getValue();
                                    e30Var.NkfcFfdaVTox(-12973394);
                                    iArr = defpackage.dl1.ZpBGe2uQfcn8;
                                    if (iArr[s80Var122.ordinal()] != 1) {
                                    }
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.xf oh71FJcDz6S242 = defpackage.pf.oh71FJcDz6S2(j6);
                                    oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S242);
                                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                                    int i72 = 7;
                                    if (!oh71FJcDz6S22) {
                                    }
                                    defpackage.lq1 lq1Var22 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i72, oh71FJcDz6S242));
                                    e30Var.EgL5gQQnyJKX(lq1Var22);
                                    GcLuU6pT9wO9 = lq1Var22;
                                    defpackage.lq1 lq1Var32 = (defpackage.lq1) GcLuU6pT9wO9;
                                    s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(-12973394);
                                    if (iArr[s80Var.ordinal()] != 1) {
                                    }
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.pf pfVar5 = new defpackage.pf(j);
                                    defpackage.s80 s80Var132 = (defpackage.s80) pw0Var.getValue();
                                    e30Var.NkfcFfdaVTox(-12973394);
                                    if (iArr[s80Var132.ordinal()] != 1) {
                                    }
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.pf pfVar22 = new defpackage.pf(j7);
                                    jp1Var.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(1954111929);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.hp1 s0TASMVLSWD542 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar5, pfVar22, z16KqenTjq8o42, lq1Var32, e30Var, 196608);
                                    e30Var.NkfcFfdaVTox(-464752477);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.xf oh71FJcDz6S252 = defpackage.pf.oh71FJcDz6S2(j2);
                                    oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S252);
                                    GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                                    if (!oh71FJcDz6S23) {
                                    }
                                    defpackage.lq1 lq1Var42 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S252));
                                    e30Var.EgL5gQQnyJKX(lq1Var42);
                                    GcLuU6pT9wO92 = lq1Var42;
                                    e30Var.NkfcFfdaVTox(-464752477);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.pf pfVar32 = new defpackage.pf(j2);
                                    e30Var.NkfcFfdaVTox(-464752477);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.pf pfVar42 = new defpackage.pf(j2);
                                    jp1Var.oh71FJcDz6S2();
                                    e30Var.NkfcFfdaVTox(1190923886);
                                    e30Var.XntWc4eZSQ8j(false);
                                    defpackage.hp1 s0TASMVLSWD552 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar32, pfVar42, z16KqenTjq8o42, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
                                    GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                                    if (GcLuU6pT9wO93 == pa1Var2) {
                                    }
                                    defpackage.cl1 cl1Var2 = (defpackage.cl1) GcLuU6pT9wO93;
                                    if (d20Var != null) {
                                    }
                                    GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                                    if (GcLuU6pT9wO94 == pa1Var) {
                                    }
                                    e30Var.NkfcFfdaVTox(-1890217110);
                                    e30Var.XntWc4eZSQ8j(z2);
                                    GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                                    if (GcLuU6pT9wO95 == pa1Var) {
                                    }
                                    e30Var.NkfcFfdaVTox(-1889500886);
                                    e30Var.XntWc4eZSQ8j(z2);
                                    e30Var.NkfcFfdaVTox(-1888924534);
                                    e30Var.XntWc4eZSQ8j(z2);
                                    e30Var.NkfcFfdaVTox(-1888749663);
                                    e30Var.XntWc4eZSQ8j(z2);
                                    if (!booleanValue) {
                                    }
                                    if (c20Var2 != null) {
                                    }
                                    e30Var.NkfcFfdaVTox(-1888176380);
                                    e30Var.XntWc4eZSQ8j(z2);
                                    e30Var.NkfcFfdaVTox(-1887830698);
                                    defpackage.nh nhVar32 = nhVar;
                                    defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar32, nhVar, nhVar2, nhVar32, nhVar32, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD5, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar32, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                    e30Var2 = e30Var;
                                    e30Var2.XntWc4eZSQ8j(z2);
                                }
                                f4 = 1.0f;
                                e30Var.XntWc4eZSQ8j(false);
                                java.lang.Float valueOf42 = java.lang.Float.valueOf(f4);
                                oh71FJcDz6S2 = jp1Var.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(-984009111);
                                if (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var4, s80Var3)) {
                                }
                                z16KqenTjq8o3 = z16KqenTjq8o2;
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.hp1 s0TASMVLSWD522 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf3, valueOf42, z16KqenTjq8o3, lq1Var, e30Var, 196608);
                                defpackage.s80 s80Var102 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(-1258455321);
                                ordinal4 = s80Var102.ordinal();
                                if (ordinal4 != 0) {
                                }
                                f5 = 1.0f;
                                e30Var.XntWc4eZSQ8j(false);
                                java.lang.Float valueOf522 = java.lang.Float.valueOf(f5);
                                defpackage.s80 s80Var1122 = (defpackage.s80) pw0Var.getValue();
                                e30Var.NkfcFfdaVTox(-1258455321);
                                ordinal5 = s80Var1122.ordinal();
                                if (ordinal5 != 0) {
                                }
                                f6 = 1.0f;
                                e30Var.XntWc4eZSQ8j(false);
                                java.lang.Float valueOf622 = java.lang.Float.valueOf(f6);
                                jp1Var.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(2126293195);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.hp1 s0TASMVLSWD5322 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf522, valueOf622, z16KqenTjq8o2, lq1Var, e30Var, 196608);
                                defpackage.vf1 z16KqenTjq8o422 = defpackage.t80.z16KqenTjq8o(jm0Var, e30Var);
                                defpackage.s80 s80Var1222 = (defpackage.s80) pw0Var.getValue();
                                e30Var.NkfcFfdaVTox(-12973394);
                                iArr = defpackage.dl1.ZpBGe2uQfcn8;
                                if (iArr[s80Var1222.ordinal()] != 1) {
                                }
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.xf oh71FJcDz6S2422 = defpackage.pf.oh71FJcDz6S2(j6);
                                oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S2422);
                                GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                                int i722 = 7;
                                if (!oh71FJcDz6S22) {
                                }
                                defpackage.lq1 lq1Var222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i722, oh71FJcDz6S2422));
                                e30Var.EgL5gQQnyJKX(lq1Var222);
                                GcLuU6pT9wO9 = lq1Var222;
                                defpackage.lq1 lq1Var322 = (defpackage.lq1) GcLuU6pT9wO9;
                                s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(-12973394);
                                if (iArr[s80Var.ordinal()] != 1) {
                                }
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.pf pfVar52 = new defpackage.pf(j);
                                defpackage.s80 s80Var1322 = (defpackage.s80) pw0Var.getValue();
                                e30Var.NkfcFfdaVTox(-12973394);
                                if (iArr[s80Var1322.ordinal()] != 1) {
                                }
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.pf pfVar222 = new defpackage.pf(j7);
                                jp1Var.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(1954111929);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.hp1 s0TASMVLSWD5422 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar52, pfVar222, z16KqenTjq8o422, lq1Var322, e30Var, 196608);
                                e30Var.NkfcFfdaVTox(-464752477);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.xf oh71FJcDz6S2522 = defpackage.pf.oh71FJcDz6S2(j2);
                                oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S2522);
                                GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                                if (!oh71FJcDz6S23) {
                                }
                                defpackage.lq1 lq1Var422 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S2522));
                                e30Var.EgL5gQQnyJKX(lq1Var422);
                                GcLuU6pT9wO92 = lq1Var422;
                                e30Var.NkfcFfdaVTox(-464752477);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.pf pfVar322 = new defpackage.pf(j2);
                                e30Var.NkfcFfdaVTox(-464752477);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.pf pfVar422 = new defpackage.pf(j2);
                                jp1Var.oh71FJcDz6S2();
                                e30Var.NkfcFfdaVTox(1190923886);
                                e30Var.XntWc4eZSQ8j(false);
                                defpackage.hp1 s0TASMVLSWD5522 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar322, pfVar422, z16KqenTjq8o422, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
                                GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                                if (GcLuU6pT9wO93 == pa1Var2) {
                                }
                                defpackage.cl1 cl1Var22 = (defpackage.cl1) GcLuU6pT9wO93;
                                if (d20Var != null) {
                                }
                                GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                                if (GcLuU6pT9wO94 == pa1Var) {
                                }
                                e30Var.NkfcFfdaVTox(-1890217110);
                                e30Var.XntWc4eZSQ8j(z2);
                                GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                                if (GcLuU6pT9wO95 == pa1Var) {
                                }
                                e30Var.NkfcFfdaVTox(-1889500886);
                                e30Var.XntWc4eZSQ8j(z2);
                                e30Var.NkfcFfdaVTox(-1888924534);
                                e30Var.XntWc4eZSQ8j(z2);
                                e30Var.NkfcFfdaVTox(-1888749663);
                                e30Var.XntWc4eZSQ8j(z2);
                                if (!booleanValue) {
                                }
                                if (c20Var2 != null) {
                                }
                                e30Var.NkfcFfdaVTox(-1888176380);
                                e30Var.XntWc4eZSQ8j(z2);
                                e30Var.NkfcFfdaVTox(-1887830698);
                                defpackage.nh nhVar322 = nhVar;
                                defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar322, nhVar, nhVar2, nhVar322, nhVar322, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD5, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar322, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                                e30Var2 = e30Var;
                                e30Var2.XntWc4eZSQ8j(z2);
                            } else {
                                pw0Var = pw0Var2;
                            }
                            f3 = 1.0f;
                            e30Var.XntWc4eZSQ8j(false);
                            java.lang.Float valueOf32 = java.lang.Float.valueOf(f3);
                            defpackage.s80 s80Var92 = (defpackage.s80) pw0Var.getValue();
                            e30Var.NkfcFfdaVTox(-1093194547);
                            ordinal3 = s80Var92.ordinal();
                            if (ordinal3 != 0) {
                            }
                            f4 = 1.0f;
                            e30Var.XntWc4eZSQ8j(false);
                            java.lang.Float valueOf422 = java.lang.Float.valueOf(f4);
                            oh71FJcDz6S2 = jp1Var.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(-984009111);
                            if (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var4, s80Var3)) {
                            }
                            z16KqenTjq8o3 = z16KqenTjq8o2;
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.hp1 s0TASMVLSWD5222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf32, valueOf422, z16KqenTjq8o3, lq1Var, e30Var, 196608);
                            defpackage.s80 s80Var1022 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(-1258455321);
                            ordinal4 = s80Var1022.ordinal();
                            if (ordinal4 != 0) {
                            }
                            f5 = 1.0f;
                            e30Var.XntWc4eZSQ8j(false);
                            java.lang.Float valueOf5222 = java.lang.Float.valueOf(f5);
                            defpackage.s80 s80Var11222 = (defpackage.s80) pw0Var.getValue();
                            e30Var.NkfcFfdaVTox(-1258455321);
                            ordinal5 = s80Var11222.ordinal();
                            if (ordinal5 != 0) {
                            }
                            f6 = 1.0f;
                            e30Var.XntWc4eZSQ8j(false);
                            java.lang.Float valueOf6222 = java.lang.Float.valueOf(f6);
                            jp1Var.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(2126293195);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.hp1 s0TASMVLSWD53222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf5222, valueOf6222, z16KqenTjq8o2, lq1Var, e30Var, 196608);
                            defpackage.vf1 z16KqenTjq8o4222 = defpackage.t80.z16KqenTjq8o(jm0Var, e30Var);
                            defpackage.s80 s80Var12222 = (defpackage.s80) pw0Var.getValue();
                            e30Var.NkfcFfdaVTox(-12973394);
                            iArr = defpackage.dl1.ZpBGe2uQfcn8;
                            if (iArr[s80Var12222.ordinal()] != 1) {
                            }
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.xf oh71FJcDz6S24222 = defpackage.pf.oh71FJcDz6S2(j6);
                            oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S24222);
                            GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                            int i7222 = 7;
                            if (!oh71FJcDz6S22) {
                            }
                            defpackage.lq1 lq1Var2222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i7222, oh71FJcDz6S24222));
                            e30Var.EgL5gQQnyJKX(lq1Var2222);
                            GcLuU6pT9wO9 = lq1Var2222;
                            defpackage.lq1 lq1Var3222 = (defpackage.lq1) GcLuU6pT9wO9;
                            s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(-12973394);
                            if (iArr[s80Var.ordinal()] != 1) {
                            }
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.pf pfVar522 = new defpackage.pf(j);
                            defpackage.s80 s80Var13222 = (defpackage.s80) pw0Var.getValue();
                            e30Var.NkfcFfdaVTox(-12973394);
                            if (iArr[s80Var13222.ordinal()] != 1) {
                            }
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.pf pfVar2222 = new defpackage.pf(j7);
                            jp1Var.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(1954111929);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.hp1 s0TASMVLSWD54222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar522, pfVar2222, z16KqenTjq8o4222, lq1Var3222, e30Var, 196608);
                            e30Var.NkfcFfdaVTox(-464752477);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.xf oh71FJcDz6S25222 = defpackage.pf.oh71FJcDz6S2(j2);
                            oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S25222);
                            GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                            if (!oh71FJcDz6S23) {
                            }
                            defpackage.lq1 lq1Var4222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S25222));
                            e30Var.EgL5gQQnyJKX(lq1Var4222);
                            GcLuU6pT9wO92 = lq1Var4222;
                            e30Var.NkfcFfdaVTox(-464752477);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.pf pfVar3222 = new defpackage.pf(j2);
                            e30Var.NkfcFfdaVTox(-464752477);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.pf pfVar4222 = new defpackage.pf(j2);
                            jp1Var.oh71FJcDz6S2();
                            e30Var.NkfcFfdaVTox(1190923886);
                            e30Var.XntWc4eZSQ8j(false);
                            defpackage.hp1 s0TASMVLSWD55222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar3222, pfVar4222, z16KqenTjq8o4222, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
                            GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                            if (GcLuU6pT9wO93 == pa1Var2) {
                            }
                            defpackage.cl1 cl1Var222 = (defpackage.cl1) GcLuU6pT9wO93;
                            if (d20Var != null) {
                            }
                            GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                            if (GcLuU6pT9wO94 == pa1Var) {
                            }
                            e30Var.NkfcFfdaVTox(-1890217110);
                            e30Var.XntWc4eZSQ8j(z2);
                            GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                            if (GcLuU6pT9wO95 == pa1Var) {
                            }
                            e30Var.NkfcFfdaVTox(-1889500886);
                            e30Var.XntWc4eZSQ8j(z2);
                            e30Var.NkfcFfdaVTox(-1888924534);
                            e30Var.XntWc4eZSQ8j(z2);
                            e30Var.NkfcFfdaVTox(-1888749663);
                            e30Var.XntWc4eZSQ8j(z2);
                            if (!booleanValue) {
                            }
                            if (c20Var2 != null) {
                            }
                            e30Var.NkfcFfdaVTox(-1888176380);
                            e30Var.XntWc4eZSQ8j(z2);
                            e30Var.NkfcFfdaVTox(-1887830698);
                            defpackage.nh nhVar3222 = nhVar;
                            defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar3222, nhVar, nhVar2, nhVar3222, nhVar3222, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD5, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar3222, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                            e30Var2 = e30Var;
                            e30Var2.XntWc4eZSQ8j(z2);
                        }
                    }
                    f2 = 1.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf22 = java.lang.Float.valueOf(f2);
                    jp1Var.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(-709912974);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.hp1 s0TASMVLSWD56 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf, valueOf22, z16KqenTjq8o, lq1Var, e30Var, 196608);
                    defpackage.jm0 jm0Var2 = defpackage.jm0.oh71FJcDz6S2;
                    defpackage.vf1 z16KqenTjq8o22 = defpackage.t80.z16KqenTjq8o(jm0Var2, e30Var);
                    defpackage.vf1 z16KqenTjq8o32 = defpackage.t80.z16KqenTjq8o(defpackage.jm0.QiMR8OkAhezm, e30Var);
                    defpackage.s80 s80Var82 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(-1093194547);
                    ordinal2 = s80Var82.ordinal();
                    if (ordinal2 != 0) {
                    }
                    f3 = 1.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf322 = java.lang.Float.valueOf(f3);
                    defpackage.s80 s80Var922 = (defpackage.s80) pw0Var.getValue();
                    e30Var.NkfcFfdaVTox(-1093194547);
                    ordinal3 = s80Var922.ordinal();
                    if (ordinal3 != 0) {
                    }
                    f4 = 1.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf4222 = java.lang.Float.valueOf(f4);
                    oh71FJcDz6S2 = jp1Var.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(-984009111);
                    if (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var4, s80Var3)) {
                    }
                    z16KqenTjq8o32 = z16KqenTjq8o22;
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.hp1 s0TASMVLSWD52222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf322, valueOf4222, z16KqenTjq8o32, lq1Var, e30Var, 196608);
                    defpackage.s80 s80Var10222 = (defpackage.s80) tiVar.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(-1258455321);
                    ordinal4 = s80Var10222.ordinal();
                    if (ordinal4 != 0) {
                    }
                    f5 = 1.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf52222 = java.lang.Float.valueOf(f5);
                    defpackage.s80 s80Var112222 = (defpackage.s80) pw0Var.getValue();
                    e30Var.NkfcFfdaVTox(-1258455321);
                    ordinal5 = s80Var112222.ordinal();
                    if (ordinal5 != 0) {
                    }
                    f6 = 1.0f;
                    e30Var.XntWc4eZSQ8j(false);
                    java.lang.Float valueOf62222 = java.lang.Float.valueOf(f6);
                    jp1Var.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(2126293195);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.hp1 s0TASMVLSWD532222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf52222, valueOf62222, z16KqenTjq8o22, lq1Var, e30Var, 196608);
                    defpackage.vf1 z16KqenTjq8o42222 = defpackage.t80.z16KqenTjq8o(jm0Var2, e30Var);
                    defpackage.s80 s80Var122222 = (defpackage.s80) pw0Var.getValue();
                    e30Var.NkfcFfdaVTox(-12973394);
                    iArr = defpackage.dl1.ZpBGe2uQfcn8;
                    if (iArr[s80Var122222.ordinal()] != 1) {
                    }
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.xf oh71FJcDz6S242222 = defpackage.pf.oh71FJcDz6S2(j6);
                    oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S242222);
                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                    int i72222 = 7;
                    if (!oh71FJcDz6S22) {
                    }
                    defpackage.lq1 lq1Var22222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i72222, oh71FJcDz6S242222));
                    e30Var.EgL5gQQnyJKX(lq1Var22222);
                    GcLuU6pT9wO9 = lq1Var22222;
                    defpackage.lq1 lq1Var32222 = (defpackage.lq1) GcLuU6pT9wO9;
                    s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(-12973394);
                    if (iArr[s80Var.ordinal()] != 1) {
                    }
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.pf pfVar5222 = new defpackage.pf(j);
                    defpackage.s80 s80Var132222 = (defpackage.s80) pw0Var.getValue();
                    e30Var.NkfcFfdaVTox(-12973394);
                    if (iArr[s80Var132222.ordinal()] != 1) {
                    }
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.pf pfVar22222 = new defpackage.pf(j7);
                    jp1Var.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(1954111929);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.hp1 s0TASMVLSWD542222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar5222, pfVar22222, z16KqenTjq8o42222, lq1Var32222, e30Var, 196608);
                    e30Var.NkfcFfdaVTox(-464752477);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.xf oh71FJcDz6S252222 = defpackage.pf.oh71FJcDz6S2(j2);
                    oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S252222);
                    GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                    if (!oh71FJcDz6S23) {
                    }
                    defpackage.lq1 lq1Var42222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S252222));
                    e30Var.EgL5gQQnyJKX(lq1Var42222);
                    GcLuU6pT9wO92 = lq1Var42222;
                    e30Var.NkfcFfdaVTox(-464752477);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.pf pfVar32222 = new defpackage.pf(j2);
                    e30Var.NkfcFfdaVTox(-464752477);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.pf pfVar42222 = new defpackage.pf(j2);
                    jp1Var.oh71FJcDz6S2();
                    e30Var.NkfcFfdaVTox(1190923886);
                    e30Var.XntWc4eZSQ8j(false);
                    defpackage.hp1 s0TASMVLSWD552222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar32222, pfVar42222, z16KqenTjq8o42222, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
                    GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                    if (GcLuU6pT9wO93 == pa1Var2) {
                    }
                    defpackage.cl1 cl1Var2222 = (defpackage.cl1) GcLuU6pT9wO93;
                    if (d20Var != null) {
                    }
                    GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                    if (GcLuU6pT9wO94 == pa1Var) {
                    }
                    e30Var.NkfcFfdaVTox(-1890217110);
                    e30Var.XntWc4eZSQ8j(z2);
                    GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                    if (GcLuU6pT9wO95 == pa1Var) {
                    }
                    e30Var.NkfcFfdaVTox(-1889500886);
                    e30Var.XntWc4eZSQ8j(z2);
                    e30Var.NkfcFfdaVTox(-1888924534);
                    e30Var.XntWc4eZSQ8j(z2);
                    e30Var.NkfcFfdaVTox(-1888749663);
                    e30Var.XntWc4eZSQ8j(z2);
                    if (!booleanValue) {
                    }
                    if (c20Var2 != null) {
                    }
                    e30Var.NkfcFfdaVTox(-1888176380);
                    e30Var.XntWc4eZSQ8j(z2);
                    e30Var.NkfcFfdaVTox(-1887830698);
                    defpackage.nh nhVar32222 = nhVar;
                    defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar32222, nhVar, nhVar2, nhVar32222, nhVar32222, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD56, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar32222, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
                    e30Var2 = e30Var;
                    e30Var2.XntWc4eZSQ8j(z2);
                }
            }
            f = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf7 = java.lang.Float.valueOf(f);
            defpackage.s80 s80Var72 = (defpackage.s80) pw0Var2.getValue();
            e30Var.NkfcFfdaVTox(-1436405362);
            ordinal = s80Var72.ordinal();
            if (ordinal != 0) {
            }
            f2 = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf222 = java.lang.Float.valueOf(f2);
            jp1Var.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-709912974);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD562 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf7, valueOf222, z16KqenTjq8o, lq1Var, e30Var, 196608);
            defpackage.jm0 jm0Var22 = defpackage.jm0.oh71FJcDz6S2;
            defpackage.vf1 z16KqenTjq8o222 = defpackage.t80.z16KqenTjq8o(jm0Var22, e30Var);
            defpackage.vf1 z16KqenTjq8o322 = defpackage.t80.z16KqenTjq8o(defpackage.jm0.QiMR8OkAhezm, e30Var);
            defpackage.s80 s80Var822 = (defpackage.s80) tiVar.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-1093194547);
            ordinal2 = s80Var822.ordinal();
            if (ordinal2 != 0) {
            }
            f3 = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf3222 = java.lang.Float.valueOf(f3);
            defpackage.s80 s80Var9222 = (defpackage.s80) pw0Var.getValue();
            e30Var.NkfcFfdaVTox(-1093194547);
            ordinal3 = s80Var9222.ordinal();
            if (ordinal3 != 0) {
            }
            f4 = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf42222 = java.lang.Float.valueOf(f4);
            oh71FJcDz6S2 = jp1Var.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-984009111);
            if (!oh71FJcDz6S2.ZpBGe2uQfcn8(s80Var4, s80Var3)) {
            }
            z16KqenTjq8o322 = z16KqenTjq8o222;
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD522222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf3222, valueOf42222, z16KqenTjq8o322, lq1Var, e30Var, 196608);
            defpackage.s80 s80Var102222 = (defpackage.s80) tiVar.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-1258455321);
            ordinal4 = s80Var102222.ordinal();
            if (ordinal4 != 0) {
            }
            f5 = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf522222 = java.lang.Float.valueOf(f5);
            defpackage.s80 s80Var1122222 = (defpackage.s80) pw0Var.getValue();
            e30Var.NkfcFfdaVTox(-1258455321);
            ordinal5 = s80Var1122222.ordinal();
            if (ordinal5 != 0) {
            }
            f6 = 1.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf622222 = java.lang.Float.valueOf(f6);
            jp1Var.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(2126293195);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD5322222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, valueOf522222, valueOf622222, z16KqenTjq8o222, lq1Var, e30Var, 196608);
            defpackage.vf1 z16KqenTjq8o422222 = defpackage.t80.z16KqenTjq8o(jm0Var22, e30Var);
            defpackage.s80 s80Var1222222 = (defpackage.s80) pw0Var.getValue();
            e30Var.NkfcFfdaVTox(-12973394);
            iArr = defpackage.dl1.ZpBGe2uQfcn8;
            if (iArr[s80Var1222222.ordinal()] != 1) {
            }
            e30Var.XntWc4eZSQ8j(false);
            defpackage.xf oh71FJcDz6S2422222 = defpackage.pf.oh71FJcDz6S2(j6);
            oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(oh71FJcDz6S2422222);
            GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            int i722222 = 7;
            if (!oh71FJcDz6S22) {
            }
            defpackage.lq1 lq1Var222222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(i722222, oh71FJcDz6S2422222));
            e30Var.EgL5gQQnyJKX(lq1Var222222);
            GcLuU6pT9wO9 = lq1Var222222;
            defpackage.lq1 lq1Var322222 = (defpackage.lq1) GcLuU6pT9wO9;
            s80Var = (defpackage.s80) tiVar.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-12973394);
            if (iArr[s80Var.ordinal()] != 1) {
            }
            e30Var.XntWc4eZSQ8j(false);
            defpackage.pf pfVar52222 = new defpackage.pf(j);
            defpackage.s80 s80Var1322222 = (defpackage.s80) pw0Var.getValue();
            e30Var.NkfcFfdaVTox(-12973394);
            if (iArr[s80Var1322222.ordinal()] != 1) {
            }
            e30Var.XntWc4eZSQ8j(false);
            defpackage.pf pfVar222222 = new defpackage.pf(j7);
            jp1Var.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(1954111929);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD5422222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar52222, pfVar222222, z16KqenTjq8o422222, lq1Var322222, e30Var, 196608);
            e30Var.NkfcFfdaVTox(-464752477);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.xf oh71FJcDz6S2522222 = defpackage.pf.oh71FJcDz6S2(j2);
            oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(oh71FJcDz6S2522222);
            GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (!oh71FJcDz6S23) {
            }
            defpackage.lq1 lq1Var422222 = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, oh71FJcDz6S2522222));
            e30Var.EgL5gQQnyJKX(lq1Var422222);
            GcLuU6pT9wO92 = lq1Var422222;
            e30Var.NkfcFfdaVTox(-464752477);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.pf pfVar322222 = new defpackage.pf(j2);
            e30Var.NkfcFfdaVTox(-464752477);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.pf pfVar422222 = new defpackage.pf(j2);
            jp1Var.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(1190923886);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD5522222 = defpackage.vx1.s0TASMVLSWD5(jp1Var, pfVar322222, pfVar422222, z16KqenTjq8o422222, (defpackage.lq1) GcLuU6pT9wO92, e30Var, 196608);
            GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO93 == pa1Var2) {
            }
            defpackage.cl1 cl1Var22222 = (defpackage.cl1) GcLuU6pT9wO93;
            if (d20Var != null) {
            }
            GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO94 == pa1Var) {
            }
            e30Var.NkfcFfdaVTox(-1890217110);
            e30Var.XntWc4eZSQ8j(z2);
            GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO95 == pa1Var) {
            }
            e30Var.NkfcFfdaVTox(-1889500886);
            e30Var.XntWc4eZSQ8j(z2);
            e30Var.NkfcFfdaVTox(-1888924534);
            e30Var.XntWc4eZSQ8j(z2);
            e30Var.NkfcFfdaVTox(-1888749663);
            e30Var.XntWc4eZSQ8j(z2);
            if (!booleanValue) {
            }
            if (c20Var2 != null) {
            }
            e30Var.NkfcFfdaVTox(-1888176380);
            e30Var.XntWc4eZSQ8j(z2);
            e30Var.NkfcFfdaVTox(-1887830698);
            defpackage.nh nhVar322222 = nhVar;
            defpackage.wc1.P05cfTpS5W5L(c20Var, OcTWLQzke1i2, nhVar322222, nhVar, nhVar2, nhVar322222, nhVar322222, ll1Var, new defpackage.el1(new defpackage.kf0(0, 3, defpackage.dg1.class, s0TASMVLSWD562, "value", "getValue()Ljava/lang/Object;")), defpackage.nn.OcTWLQzke1i2(-1729858187, new defpackage.mk0(2, c20Var3), e30Var), nhVar322222, wv0Var, e30Var, ((i5 >> 3) & 112) | 6 | ((i6 << 21) & 234881024) | ((i5 << 18) & 1879048192), ((i6 >> 6) & 7168) | 48);
            e30Var2 = e30Var;
            e30Var2.XntWc4eZSQ8j(z2);
        } else {
            e30Var2 = e30Var;
            c20Var4 = c20Var2;
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD57 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD57 != null) {
            s0TASMVLSWD57.JhCgjQRTAOCT = new defpackage.c20() { // from class: zk1
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.m90.ZpBGe2uQfcn8(charSequence, c20Var, ll1Var, d20Var, c20Var4, in0Var, wv0Var, vk1Var, c20Var3, (defpackage.e30) obj, defpackage.m90.IBvW5fLsPuHy(i | 1), defpackage.m90.IBvW5fLsPuHy(i2));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final boolean blKFvluuDQOf(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[3] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[7] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f && fArr[11] == 0.0f && fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f;
    }

    public static final int dG7RjM6DqYVL(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void e6mdH7fiFuta(defpackage.vl0 vl0Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-1870818471);
        int i2 = i | 6;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.vl0 giKS3J6vZuNy = defpackage.ce1.giKS3J6vZuNy(sl0Var, 1.0f);
            defpackage.v61 ZpBGe2uQfcn8 = defpackage.u61.ZpBGe2uQfcn8(new defpackage.l7(12.0f, new defpackage.h7(0)), defpackage.jVUAPb5NnIYW.T1fB7bDYiVJQ, e30Var, 6);
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, giKS3J6vZuNy);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, ZpBGe2uQfcn8);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
            nhVar.JhCgjQRTAOCT(defpackage.x61.ZpBGe2uQfcn8, e30Var, 54);
            e30Var.XntWc4eZSQ8j(true);
            vl0Var = sl0Var;
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.t81(vl0Var, nhVar, i, 2);
        }
    }

    public static final defpackage.ul0 fNwYGHIYeJcR(defpackage.wo woVar, int i) {
        defpackage.ul0 ul0Var = ((defpackage.ul0) woVar).WDYagTQQm9ns.GE9mJIPrb8gP;
        if (ul0Var == null || (ul0Var.P05cfTpS5W5L & i) == 0) {
            return null;
        }
        while (ul0Var != null) {
            int i2 = ul0Var.QiMR8OkAhezm;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return ul0Var;
            }
            ul0Var = ul0Var.GE9mJIPrb8gP;
        }
        return null;
    }

    public static final void fWTAfUmVKrZq(long j, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(590397809);
        int i2 = (e30Var.WDYagTQQm9ns(j) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16);
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.vx1.fWTAfUmVKrZq(defpackage.sk.ZpBGe2uQfcn8.ZpBGe2uQfcn8(new defpackage.pf(j)), c20Var, e30Var, (i2 & 112) | 8);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.v0(j, c20Var, i);
        }
    }

    public static final long frSwwKIlbUhK(java.lang.String str, long j, long j2, long j3) {
        java.lang.String str2;
        boolean z;
        int i = defpackage.xi1.ZpBGe2uQfcn8;
        java.lang.Long l = null;
        try {
            str2 = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        int i2 = 10;
        defpackage.jr0.XntWc4eZSQ8j(10);
        int length = str2.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str2.charAt(0);
            long j4 = -9223372036854775807L;
            if (charAt < '0') {
                z = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z = false;
                        i3 = 1;
                    } else if (charAt == '-') {
                        j4 = Long.MIN_VALUE;
                        i3 = 1;
                    }
                }
            } else {
                z = false;
            }
            long j5 = 0;
            long j6 = -256204778801521550L;
            while (true) {
                if (i3 < length) {
                    int digit = java.lang.Character.digit((int) str2.charAt(i3), i2);
                    if (digit < 0) {
                        break;
                    }
                    if (j5 < j6) {
                        if (j6 != -256204778801521550L) {
                            break;
                        }
                        j6 = j4 / 10;
                        if (j5 < j6) {
                            break;
                        }
                    }
                    long j7 = j5 * 10;
                    int i4 = length;
                    long j8 = digit;
                    if (j7 < j4 + j8) {
                        break;
                    }
                    j5 = j7 - j8;
                    i3++;
                    length = i4;
                    i2 = 10;
                } else {
                    l = z ? java.lang.Long.valueOf(j5) : java.lang.Long.valueOf(-j5);
                }
            }
        }
        if (l == null) {
            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = l.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
    }

    public static final java.lang.Object[] gUjdnLbkVAaA(int i, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        defpackage.y7.EgL5gQQnyJKX(objArr, objArr2, 0, i, 6);
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void giKS3J6vZuNy(long j, defpackage.pn1 pn1Var, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        long j2;
        defpackage.pn1 pn1Var2;
        defpackage.c20 c20Var2;
        defpackage.e30 e30Var2;
        e30Var.PS16moFv2oLu(396611577);
        int i2 = (e30Var.WDYagTQQm9ns(j) ? 4 : 2) | i | (e30Var.oh71FJcDz6S2(pn1Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            e30Var2 = e30Var;
            defpackage.b80.giKS3J6vZuNy(j, pn1Var, c20Var, e30Var2, i2 & 1022);
            j2 = j;
            pn1Var2 = pn1Var;
            c20Var2 = c20Var;
        } else {
            j2 = j;
            pn1Var2 = pn1Var;
            c20Var2 = c20Var;
            e30Var2 = e30Var;
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.u21(j2, pn1Var2, c20Var2, i, 1);
        }
    }

    public static final java.lang.Object[] h3m55N1URyyK(int i, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 2];
        defpackage.y7.EgL5gQQnyJKX(objArr, objArr2, 0, i, 6);
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final long jjTN4uUnoyEn(long j) {
        return (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final java.lang.Object maCixPsq4ml2(defpackage.fb1 fb1Var, defpackage.qb1 qb1Var) {
        java.lang.Object QiMR8OkAhezm = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(qb1Var);
        if (QiMR8OkAhezm == null) {
            return null;
        }
        return QiMR8OkAhezm;
    }

    public static final long oCu53ZX2v4Ju(int i) {
        return UmgHb6n58gfG(4294967296L, i);
    }

    public static final void oh71FJcDz6S2(defpackage.r71 r71Var, defpackage.e30 e30Var, int i) {
        defpackage.r71 r71Var2;
        defpackage.e30 e30Var2 = e30Var;
        e30Var2.PS16moFv2oLu(-491741977);
        int i2 = i | 2;
        int i3 = 0;
        if (e30Var2.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            e30Var2.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var2.oCu53ZX2v4Ju()) {
                defpackage.ru1 ZpBGe2uQfcn8 = defpackage.mi0.ZpBGe2uQfcn8(e30Var2);
                if (ZpBGe2uQfcn8 == null) {
                    defpackage.h7.P05cfTpS5W5L("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                r71Var2 = (defpackage.r71) defpackage.vx1.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(defpackage.r71.class), ZpBGe2uQfcn8.WDYagTQQm9ns(), defpackage.jr0.ZVVdXbWmyCSK(ZpBGe2uQfcn8), defpackage.fc0.ZpBGe2uQfcn8(e30Var2));
            } else {
                e30Var2.Jkfc0NcwyPL8();
                r71Var2 = r71Var;
            }
            e30Var2.WmetiUbpKU9I();
            defpackage.jy jyVar = r71Var2.JhCgjQRTAOCT;
            defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
            defpackage.fo0 Ns0WNyEWdPsk = defpackage.w60.Ns0WNyEWdPsk(jyVar, avVar, null, e30Var2, 48, 2);
            e30Var2 = e30Var;
            defpackage.t80.fWTAfUmVKrZq(null, defpackage.nn.OcTWLQzke1i2(1300430352, new defpackage.p71(r71Var2, Ns0WNyEWdPsk, defpackage.w60.Ns0WNyEWdPsk(r71Var2.WDYagTQQm9ns, avVar, null, e30Var2, 48, 2), i3), e30Var2), e30Var2, 48);
            com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) r71Var2.QiMR8OkAhezm.getValue();
            boolean P05cfTpS5W5L = e30Var2.P05cfTpS5W5L(r71Var2);
            java.lang.Object GcLuU6pT9wO9 = e30Var2.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == pa1Var) {
                defpackage.j jVar = new defpackage.j(0, r71Var2, defpackage.r71.class, "dismiss", "dismiss()V", 0, 0, 7);
                e30Var2.EgL5gQQnyJKX(jVar);
                GcLuU6pT9wO9 = jVar;
            }
            defpackage.n10 n10Var = (defpackage.n10) ((defpackage.n20) GcLuU6pT9wO9);
            boolean P05cfTpS5W5L2 = e30Var2.P05cfTpS5W5L(r71Var2);
            java.lang.Object GcLuU6pT9wO92 = e30Var2.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO92 == pa1Var) {
                defpackage.WDYagTQQm9ns wDYagTQQm9ns = new defpackage.WDYagTQQm9ns(1, r71Var2, defpackage.r71.class, "toggleMark", "toggleMark(Lcom/ice/fishing/wolberta/data/local/Item;)V", 0, 0, 10);
                e30Var2.EgL5gQQnyJKX(wDYagTQQm9ns);
                GcLuU6pT9wO92 = wDYagTQQm9ns;
            }
            defpackage.jr0.giKS3J6vZuNy(item, n10Var, (defpackage.y10) ((defpackage.n20) GcLuU6pT9wO92), e30Var2, com.ice.fishing.wolberta.data.local.Item.$stable);
        } else {
            e30Var2.Jkfc0NcwyPL8();
            r71Var2 = r71Var;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.l2(i, 15, r71Var2);
        }
    }

    public static final long qjMheFZ0l9kA(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static defpackage.iu1 s0TASMVLSWD5(java.lang.Class cls) {
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                java.lang.Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (defpackage.iu1) newInstance;
            } catch (java.lang.IllegalAccessException e) {
                defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e);
                return null;
            } catch (java.lang.InstantiationException e2) {
                defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (java.lang.NoSuchMethodException e3) {
            defpackage.h7.fNwYGHIYeJcR("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final int w7APNrr0aGRc(android.text.Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public abstract void T1fB7bDYiVJQ();
}
