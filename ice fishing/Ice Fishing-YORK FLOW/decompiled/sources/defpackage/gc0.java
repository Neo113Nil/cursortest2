package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class gc0 implements defpackage.y10 {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ android.content.Context oh71FJcDz6S2;

    public /* synthetic */ gc0(android.content.Context context, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        android.os.Bundle bundle;
        java.lang.Throwable th;
        int i = this.WDYagTQQm9ns;
        boolean z = false;
        final int i2 = 1;
        final android.content.Context context = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                defpackage.am0 am0Var = (defpackage.am0) obj;
                am0Var.getClass();
                boolean z2 = context instanceof android.app.Application;
                defpackage.dc0 dc0Var = defpackage.dc0.WDYagTQQm9ns;
                defpackage.rg1 rg1Var = defpackage.s81.e6mdH7fiFuta;
                if (z2) {
                    final boolean z3 = z ? 1 : 0;
                    defpackage.y9 y9Var = new defpackage.y9(rg1Var, defpackage.b41.ZpBGe2uQfcn8(android.app.Application.class), new defpackage.c20() { // from class: hc0
                        @Override // defpackage.c20
                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                            int i3 = z3;
                            android.content.Context context2 = context;
                            defpackage.q81 q81Var = (defpackage.q81) obj2;
                            defpackage.jw0 jw0Var = (defpackage.jw0) obj3;
                            switch (i3) {
                                case 0:
                                    q81Var.getClass();
                                    jw0Var.getClass();
                                    return (android.app.Application) context2;
                                default:
                                    q81Var.getClass();
                                    jw0Var.getClass();
                                    return context2;
                            }
                        }
                    }, dc0Var);
                    defpackage.xd1 xd1Var = new defpackage.xd1(y9Var);
                    am0Var.ZpBGe2uQfcn8(xd1Var);
                    defpackage.ne ZpBGe2uQfcn8 = defpackage.b41.ZpBGe2uQfcn8(android.content.Context.class);
                    y9Var.WDYagTQQm9ns.add(ZpBGe2uQfcn8);
                    am0Var.fWTAfUmVKrZq.put(defpackage.mb0.ZpBGe2uQfcn8(ZpBGe2uQfcn8) + "::" + rg1Var, xd1Var);
                } else {
                    am0Var.ZpBGe2uQfcn8(new defpackage.xd1(new defpackage.y9(rg1Var, defpackage.b41.ZpBGe2uQfcn8(android.content.Context.class), new defpackage.c20() { // from class: hc0
                        @Override // defpackage.c20
                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                            int i3 = i2;
                            android.content.Context context2 = context;
                            defpackage.q81 q81Var = (defpackage.q81) obj2;
                            defpackage.jw0 jw0Var = (defpackage.jw0) obj3;
                            switch (i3) {
                                case 0:
                                    q81Var.getClass();
                                    jw0Var.getClass();
                                    return (android.app.Application) context2;
                                default:
                                    q81Var.getClass();
                                    jw0Var.getClass();
                                    return context2;
                            }
                        }
                    }, dc0Var)));
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            default:
                android.os.Bundle bundle2 = (android.os.Bundle) obj;
                defpackage.xp0 Ns0WNyEWdPsk = defpackage.t80.Ns0WNyEWdPsk(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(Ns0WNyEWdPsk.ZpBGe2uQfcn8.getClassLoader());
                }
                defpackage.ep0 ep0Var = Ns0WNyEWdPsk.giKS3J6vZuNy;
                java.util.LinkedHashMap linkedHashMap = ep0Var.h3m55N1URyyK;
                java.lang.Throwable th2 = null;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            defpackage.w60.KrtOTfE6jiS2("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    ep0Var.JhCgjQRTAOCT = bundle;
                    ep0Var.WDYagTQQm9ns = bundle2.containsKey("android-support-nav:controller:backStack") ? (android.os.Bundle[]) defpackage.wc1.hH0RRJrNssvh("android-support-nav:controller:backStack", bundle2).toArray(new android.os.Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            defpackage.w60.KrtOTfE6jiS2("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        java.util.ArrayList<java.lang.String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            defpackage.w60.KrtOTfE6jiS2("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            java.lang.Throwable th3 = th2;
                            ep0Var.fNwYGHIYeJcR.put(java.lang.Integer.valueOf(intArray[i3]), !defpackage.ma0.QiMR8OkAhezm(stringArrayList.get(i4), "") ? (java.lang.String) stringArrayList.get(i4) : th3);
                            i3++;
                            th2 = th3;
                            i4 = i5;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            defpackage.w60.KrtOTfE6jiS2("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            java.lang.String str = stringArrayList2.get(i6);
                            i6++;
                            java.lang.String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                java.util.ArrayList hH0RRJrNssvh = defpackage.wc1.hH0RRJrNssvh("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                defpackage.p7 p7Var = new defpackage.p7(hH0RRJrNssvh.size());
                                int size2 = hH0RRJrNssvh.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    java.lang.Object obj2 = hH0RRJrNssvh.get(i7);
                                    i7++;
                                    p7Var.addLast(new defpackage.ap0((android.os.Bundle) obj2));
                                }
                                linkedHashMap.put(str2, p7Var);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z4 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    java.lang.Boolean valueOf = (z4 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? java.lang.Boolean.valueOf(z4) : th;
                    Ns0WNyEWdPsk.WDYagTQQm9ns = valueOf != 0 ? valueOf.booleanValue() : false;
                }
                return Ns0WNyEWdPsk;
        }
    }
}
