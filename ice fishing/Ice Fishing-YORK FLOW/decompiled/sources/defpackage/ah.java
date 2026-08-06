package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class ah implements defpackage.z71 {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public final /* synthetic */ java.lang.Object giKS3J6vZuNy;

    public /* synthetic */ ah(int i, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = obj;
    }

    @Override // defpackage.z71
    public final android.os.Bundle ZpBGe2uQfcn8() {
        defpackage.bw0[] bw0VarArr;
        int i = this.ZpBGe2uQfcn8;
        java.lang.Object obj = this.giKS3J6vZuNy;
        switch (i) {
            case 0:
                android.os.Bundle bundle = new android.os.Bundle();
                defpackage.eh ehVar = ((defpackage.gh) obj).fNwYGHIYeJcR;
                ehVar.getClass();
                java.util.LinkedHashMap linkedHashMap = ehVar.giKS3J6vZuNy;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new java.util.ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new java.util.ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new java.util.ArrayList<>(ehVar.fWTAfUmVKrZq));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new android.os.Bundle(ehVar.oh71FJcDz6S2));
                return bundle;
            case 1:
                java.util.Map WDYagTQQm9ns = ((defpackage.l71) obj).WDYagTQQm9ns();
                android.os.Bundle bundle2 = new android.os.Bundle();
                for (java.util.Map.Entry entry : WDYagTQQm9ns.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    java.util.List list = (java.util.List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof java.util.ArrayList ? (java.util.ArrayList) list : new java.util.ArrayList<>(list));
                }
                return bundle2;
            default:
                defpackage.x8 x8Var = (defpackage.x8) obj;
                for (java.util.Map.Entry entry2 : defpackage.jk0.OVwOqzUGHcCU((java.util.LinkedHashMap) x8Var.JhCgjQRTAOCT).entrySet()) {
                    x8Var.gUjdnLbkVAaA(((defpackage.gg1) entry2.getValue()).getValue(), (java.lang.String) entry2.getKey());
                }
                for (java.util.Map.Entry entry3 : defpackage.jk0.OVwOqzUGHcCU((java.util.LinkedHashMap) x8Var.giKS3J6vZuNy).entrySet()) {
                    x8Var.gUjdnLbkVAaA(((defpackage.z71) entry3.getValue()).ZpBGe2uQfcn8(), (java.lang.String) entry3.getKey());
                }
                java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) x8Var.ZpBGe2uQfcn8;
                if (linkedHashMap2.isEmpty()) {
                    bw0VarArr = new defpackage.bw0[0];
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap2.size());
                    for (java.util.Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new defpackage.bw0((java.lang.String) entry4.getKey(), entry4.getValue()));
                    }
                    bw0VarArr = (defpackage.bw0[]) arrayList.toArray(new defpackage.bw0[0]);
                }
                return defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(bw0VarArr, bw0VarArr.length));
        }
    }
}
