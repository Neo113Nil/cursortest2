package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class bh {
    public final /* synthetic */ defpackage.gh ZpBGe2uQfcn8;

    public /* synthetic */ bh(defpackage.gh ghVar) {
        this.ZpBGe2uQfcn8 = ghVar;
    }

    public final void ZpBGe2uQfcn8(android.content.Context context) {
        context.getClass();
        defpackage.gh ghVar = this.ZpBGe2uQfcn8;
        android.os.Bundle gUjdnLbkVAaA = ((defpackage.n80) ghVar.P05cfTpS5W5L.QiMR8OkAhezm).gUjdnLbkVAaA("android:support:activity-result");
        if (gUjdnLbkVAaA != null) {
            defpackage.eh ehVar = ghVar.fNwYGHIYeJcR;
            java.util.LinkedHashMap linkedHashMap = ehVar.ZpBGe2uQfcn8;
            android.os.Bundle bundle = ehVar.oh71FJcDz6S2;
            java.util.LinkedHashMap linkedHashMap2 = ehVar.giKS3J6vZuNy;
            java.util.ArrayList<java.lang.Integer> integerArrayList = gUjdnLbkVAaA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            java.util.ArrayList<java.lang.String> stringArrayList = gUjdnLbkVAaA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList2 = gUjdnLbkVAaA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                ehVar.fWTAfUmVKrZq.addAll(stringArrayList2);
            }
            android.os.Bundle bundle2 = gUjdnLbkVAaA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                java.lang.String str = stringArrayList.get(i);
                if (linkedHashMap2.containsKey(str)) {
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap2.remove(str);
                    if (!bundle.containsKey(str)) {
                        defpackage.nq1.maCixPsq4ml2(linkedHashMap).remove(num);
                    }
                }
                java.lang.Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int intValue = num2.intValue();
                java.lang.String str2 = stringArrayList.get(i);
                str2.getClass();
                java.lang.String str3 = str2;
                linkedHashMap.put(java.lang.Integer.valueOf(intValue), str3);
                linkedHashMap2.put(str3, java.lang.Integer.valueOf(intValue));
            }
        }
    }
}
