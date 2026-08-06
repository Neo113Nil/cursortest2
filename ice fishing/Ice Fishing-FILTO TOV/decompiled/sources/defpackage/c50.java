package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class c50 implements hv {
    public final /* synthetic */ Context EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;

    public /* synthetic */ c50(Context context, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hv
    public final Object mOu10nynGul(Object obj) {
        Bundle bundle;
        Throwable th;
        int i = this.OOA6hdeuvCS;
        boolean z = false;
        final int i2 = 1;
        final Context context = this.EljAMC1QTz;
        switch (i) {
            case 0:
                ne0 ne0Var = (ne0) obj;
                ne0Var.getClass();
                boolean z2 = context instanceof Application;
                z40 z40Var = z40.OOA6hdeuvCS;
                a61 a61Var = rx0.mOu10nynGul;
                if (z2) {
                    final boolean z3 = z ? 1 : 0;
                    n6 n6Var = new n6(a61Var, st0.GWasM1elztuh(Application.class), new lv() { // from class: d50
                        @Override // defpackage.lv
                        public final Object EljAMC1QTz(Object obj2, Object obj3) {
                            int i3 = z3;
                            Context context2 = context;
                            px0 px0Var = (px0) obj2;
                            ao0 ao0Var = (ao0) obj3;
                            switch (i3) {
                                case 0:
                                    px0Var.getClass();
                                    ao0Var.getClass();
                                    return (Application) context2;
                                default:
                                    px0Var.getClass();
                                    ao0Var.getClass();
                                    return context2;
                            }
                        }
                    }, z40Var);
                    o21 o21Var = new o21(n6Var);
                    ne0Var.GWasM1elztuh(o21Var);
                    va GWasM1elztuh = st0.GWasM1elztuh(Context.class);
                    n6Var.OOA6hdeuvCS.add(GWasM1elztuh);
                    ne0Var.X1lG3V04pd.put(p40.GWasM1elztuh(GWasM1elztuh) + "::" + a61Var, o21Var);
                } else {
                    ne0Var.GWasM1elztuh(new o21(new n6(a61Var, st0.GWasM1elztuh(Context.class), new lv() { // from class: d50
                        @Override // defpackage.lv
                        public final Object EljAMC1QTz(Object obj2, Object obj3) {
                            int i3 = i2;
                            Context context2 = context;
                            px0 px0Var = (px0) obj2;
                            ao0 ao0Var = (ao0) obj3;
                            switch (i3) {
                                case 0:
                                    px0Var.getClass();
                                    ao0Var.getClass();
                                    return (Application) context2;
                                default:
                                    px0Var.getClass();
                                    ao0Var.getClass();
                                    return context2;
                            }
                        }
                    }, z40Var)));
                }
                return kc1.GWasM1elztuh;
            default:
                Bundle bundle2 = (Bundle) obj;
                hi0 encWxUiV2 = n4.encWxUiV2(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(encWxUiV2.GWasM1elztuh.getClassLoader());
                }
                ph0 ph0Var = encWxUiV2.Yi7zF1RB1;
                LinkedHashMap linkedHashMap = ph0Var.XnEVoBF0td1l;
                Throwable th2 = null;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            z50.cilMamHF("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    ph0Var.xqGvceK5x = bundle;
                    ph0Var.OOA6hdeuvCS = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) o50.cilMamHF(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            z50.cilMamHF("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            z50.cilMamHF("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            int i5 = i4 + 1;
                            Throwable th3 = th2;
                            ph0Var.E7jCp8Ls.put(Integer.valueOf(intArray[i3]), !o30.rQPn8YBR(stringArrayList.get(i4), "") ? (String) stringArrayList.get(i4) : th3);
                            i3++;
                            th2 = th3;
                            i4 = i5;
                        }
                    }
                    th = th2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            z50.cilMamHF("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        int size = stringArrayList2.size();
                        int i6 = 0;
                        while (i6 < size) {
                            String str = stringArrayList2.get(i6);
                            i6++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList cilMamHF = o50.cilMamHF(bundle2, "android-support-nav:controller:backStackStates:" + str2);
                                v4 v4Var = new v4(cilMamHF.size());
                                int size2 = cilMamHF.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj2 = cilMamHF.get(i7);
                                    i7++;
                                    v4Var.addLast(new ih0((Bundle) obj2));
                                }
                                linkedHashMap.put(str2, v4Var);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z4 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean valueOf = (z4 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z4) : th;
                    encWxUiV2.OOA6hdeuvCS = valueOf != 0 ? valueOf.booleanValue() : false;
                }
                return encWxUiV2;
        }
    }
}
