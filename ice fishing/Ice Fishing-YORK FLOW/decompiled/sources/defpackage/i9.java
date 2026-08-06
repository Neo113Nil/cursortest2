package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i9 extends defpackage.iu1 {
    public defpackage.yu1 JhCgjQRTAOCT;
    public final java.lang.String fWTAfUmVKrZq;
    public final java.lang.String giKS3J6vZuNy = "SaveableStateHolder_BackStackEntryKey";

    public i9(defpackage.s71 s71Var) {
        java.lang.Object obj;
        s71Var.getClass();
        defpackage.x8 x8Var = s71Var.giKS3J6vZuNy;
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) x8Var.ZpBGe2uQfcn8;
        java.util.LinkedHashMap linkedHashMap2 = (java.util.LinkedHashMap) x8Var.JhCgjQRTAOCT;
        try {
            defpackage.gg1 gg1Var = (defpackage.gg1) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (gg1Var == null || (obj = gg1Var.getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (java.lang.ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((java.util.LinkedHashMap) x8Var.fWTAfUmVKrZq).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        java.lang.String str = (java.lang.String) obj;
        if (str == null) {
            str = java.util.UUID.randomUUID().toString();
            java.lang.String str2 = this.giKS3J6vZuNy;
            str2.getClass();
            if (str != null) {
                java.util.ArrayList arrayList = defpackage.u71.ZpBGe2uQfcn8;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        java.lang.Object obj2 = arrayList.get(i);
                        i++;
                        if (((java.lang.Class) obj2).isInstance(str)) {
                        }
                    }
                }
                defpackage.p81.JhCgjQRTAOCT("Can't put value with type ", str.getClass(), " into saved state");
                throw null;
            }
            java.util.ArrayList arrayList2 = defpackage.u71.ZpBGe2uQfcn8;
            s71Var.ZpBGe2uQfcn8.get(str2);
            x8Var.gUjdnLbkVAaA(str, str2);
        }
        this.fWTAfUmVKrZq = str;
    }

    @Override // defpackage.iu1
    public final void JhCgjQRTAOCT() {
        defpackage.yu1 yu1Var = this.JhCgjQRTAOCT;
        if (yu1Var == null) {
            defpackage.ma0.hH0RRJrNssvh("saveableStateHolderRef");
            throw null;
        }
        defpackage.i71 i71Var = (defpackage.i71) yu1Var.ZpBGe2uQfcn8.get();
        if (i71Var != null) {
            i71Var.fWTAfUmVKrZq(this.fWTAfUmVKrZq);
        }
        defpackage.yu1 yu1Var2 = this.JhCgjQRTAOCT;
        if (yu1Var2 != null) {
            yu1Var2.ZpBGe2uQfcn8.clear();
        } else {
            defpackage.ma0.hH0RRJrNssvh("saveableStateHolderRef");
            throw null;
        }
    }
}
