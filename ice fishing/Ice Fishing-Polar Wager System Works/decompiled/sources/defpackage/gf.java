package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gf implements defpackage.g41 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final /* synthetic */ java.lang.Object oh6vYeIP;

    public /* synthetic */ gf(int i, java.lang.Object obj) {
        this.IHQe1A4L2xu = i;
        this.oh6vYeIP = obj;
    }

    @Override // defpackage.g41
    public final android.os.Bundle IHQe1A4L2xu() {
        defpackage.et0[] et0VarArr;
        int i = this.IHQe1A4L2xu;
        java.lang.Object obj = this.oh6vYeIP;
        switch (i) {
            case 0:
                android.os.Bundle bundle = new android.os.Bundle();
                defpackage.lf lfVar = ((com.corsair.ledger.MainActivity) obj).JlrlGoKF;
                lfVar.getClass();
                java.util.LinkedHashMap linkedHashMap = lfVar.oh6vYeIP;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(lfVar.r1MBDhnF));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(lfVar.xiZrDbcSW0));
                return bundle;
            case 1:
                java.util.Map adDC3e2L = ((defpackage.u31) obj).adDC3e2L();
                android.os.Bundle bundle2 = new android.os.Bundle();
                for (java.util.Map.Entry entry : adDC3e2L.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
                }
                return bundle2;
            default:
                defpackage.m7 m7Var = (defpackage.m7) obj;
                for (java.util.Map.Entry entry2 : defpackage.yh0.XZx205DYe((java.util.LinkedHashMap) m7Var.F7NU4MC0GW).entrySet()) {
                    m7Var.riuEU0zW4(((defpackage.hc1) entry2.getValue()).getValue(), (java.lang.String) entry2.getKey());
                }
                for (java.util.Map.Entry entry3 : defpackage.yh0.XZx205DYe((java.util.LinkedHashMap) m7Var.oh6vYeIP).entrySet()) {
                    m7Var.riuEU0zW4(((defpackage.g41) entry3.getValue()).IHQe1A4L2xu(), (java.lang.String) entry3.getKey());
                }
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) m7Var.IHQe1A4L2xu;
                if (linkedHashMap2.isEmpty()) {
                    et0VarArr = new defpackage.et0[0];
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap2.size());
                    for (java.util.Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new defpackage.et0((java.lang.String) entry4.getKey(), entry4.getValue()));
                    }
                    et0VarArr = (defpackage.et0[]) arrayList.toArray(new defpackage.et0[0]);
                }
                return defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(et0VarArr, et0VarArr.length));
        }
    }
}
