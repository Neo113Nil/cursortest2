package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ca0 extends defpackage.gf {
    public final /* synthetic */ int WmetiUbpKU9I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca0(int i, boolean z) {
        super(z);
        this.WmetiUbpKU9I = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        int i = this.WmetiUbpKU9I;
        defpackage.ma maVar = defpackage.oq0.gUjdnLbkVAaA;
        switch (i) {
            case 0:
                return new double[]{java.lang.Double.parseDouble(str)};
            case 1:
                return defpackage.ma0.VFeft99leXEK(java.lang.Double.valueOf(java.lang.Double.parseDouble(str)));
            case 2:
                return new java.lang.String[]{maVar.JhCgjQRTAOCT(str)};
            default:
                return defpackage.ma0.VFeft99leXEK(maVar.JhCgjQRTAOCT(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [av] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    @Override // defpackage.gf
    public final java.util.List P05cfTpS5W5L(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        int i = this.WmetiUbpKU9I;
        ?? r3 = defpackage.av.WDYagTQQm9ns;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr != null) {
                    java.util.List mnkwqFSfsWTC = defpackage.y7.mnkwqFSfsWTC(dArr);
                    r3 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(mnkwqFSfsWTC, 10));
                    java.util.Iterator it = mnkwqFSfsWTC.iterator();
                    while (it.hasNext()) {
                        r3.add(java.lang.String.valueOf(((java.lang.Number) it.next()).doubleValue()));
                    }
                    break;
                }
                break;
            case 1:
                java.util.List list = (java.util.List) obj;
                if (list != null) {
                    r3 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list, 10));
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        r3.add(java.lang.String.valueOf(((java.lang.Number) it2.next()).doubleValue()));
                    }
                    break;
                }
                break;
            case 2:
                java.lang.String[] strArr = (java.lang.String[]) obj;
                if (strArr != null) {
                    r3 = new java.util.ArrayList(strArr.length);
                    for (java.lang.String str3 : strArr) {
                        if (str3 != null) {
                            str = android.net.Uri.encode(str3, null);
                            str.getClass();
                        } else {
                            str = "null";
                        }
                        r3.add(str);
                    }
                    break;
                }
                break;
            default:
                java.util.List<java.lang.String> list2 = (java.util.List) obj;
                if (list2 != null) {
                    r3 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list2, 10));
                    for (java.lang.String str4 : list2) {
                        if (str4 != null) {
                            str2 = android.net.Uri.encode(str4, null);
                            str2.getClass();
                        } else {
                            str2 = "null";
                        }
                        r3.add(str2);
                    }
                    break;
                }
                break;
        }
        return r3;
    }

    @Override // defpackage.gf
    public final java.lang.Object QiMR8OkAhezm() {
        int i = this.WmetiUbpKU9I;
        defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
        switch (i) {
            case 0:
                return new double[0];
            case 1:
                return avVar;
            case 2:
                return new java.lang.String[0];
            default:
                return avVar;
        }
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        int i = 0;
        switch (this.WmetiUbpKU9I) {
            case 0:
                double[] dArr = (double[]) obj;
                str.getClass();
                if (dArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    bundle.putDoubleArray(str, dArr);
                    break;
                }
            case 1:
                java.util.List list = (java.util.List) obj;
                str.getClass();
                if (list == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    double[] dArr2 = new double[list.size()];
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        dArr2[i] = ((java.lang.Number) it.next()).doubleValue();
                        i++;
                    }
                    bundle.putDoubleArray(str, dArr2);
                    break;
                }
            case 2:
                java.lang.String[] strArr = (java.lang.String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
                    for (java.lang.String str2 : strArr) {
                        if (str2 == null) {
                            str2 = "null";
                        }
                        arrayList.add(str2);
                    }
                    java.lang.String[] strArr2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
                    strArr2.getClass();
                    bundle.putStringArray(str, strArr2);
                    break;
                }
            default:
                java.util.List<java.lang.String> list2 = (java.util.List) obj;
                str.getClass();
                if (list2 == null) {
                    bundle.putString(str, null);
                    break;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list2, 10));
                    for (java.lang.String str3 : list2) {
                        if (str3 == null) {
                            str3 = "null";
                        }
                        arrayList2.add(str3);
                    }
                    java.lang.String[] strArr3 = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
                    strArr3.getClass();
                    bundle.putStringArray(str, strArr3);
                    break;
                }
        }
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        int i = this.WmetiUbpKU9I;
        defpackage.ma maVar = defpackage.oq0.gUjdnLbkVAaA;
        java.util.ArrayList arrayList = null;
        switch (i) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                double[] doubleArray = bundle.getDoubleArray(str);
                if (doubleArray != null) {
                    return doubleArray;
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                double[] doubleArray2 = bundle.getDoubleArray(str);
                if (doubleArray2 != null) {
                    return defpackage.y7.mnkwqFSfsWTC(doubleArray2);
                }
                defpackage.w60.KrtOTfE6jiS2(str);
                throw null;
            case 2:
                bundle.getClass();
                if (!bundle.containsKey(str) || defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    return null;
                }
                java.lang.String[] stringArray = bundle.getStringArray(str);
                if (stringArray == null) {
                    defpackage.w60.KrtOTfE6jiS2(str);
                    throw null;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(stringArray.length);
                for (java.lang.String str2 : stringArray) {
                    arrayList2.add((java.lang.String) maVar.JhCgjQRTAOCT(str2));
                }
                return (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
            default:
                bundle.getClass();
                if (bundle.containsKey(str) && !defpackage.wc1.OVwOqzUGHcCU(str, bundle)) {
                    java.lang.String[] stringArray2 = bundle.getStringArray(str);
                    if (stringArray2 == null) {
                        defpackage.w60.KrtOTfE6jiS2(str);
                        throw null;
                    }
                    java.util.List a6r05ZxsOP0A = defpackage.y7.a6r05ZxsOP0A(stringArray2);
                    arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(a6r05ZxsOP0A, 10));
                    java.util.Iterator it = a6r05ZxsOP0A.iterator();
                    while (it.hasNext()) {
                        arrayList.add((java.lang.String) maVar.JhCgjQRTAOCT((java.lang.String) it.next()));
                    }
                }
                return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oq0
    public final java.lang.Object fWTAfUmVKrZq(java.lang.Object obj, java.lang.String str) {
        int i = this.WmetiUbpKU9I;
        defpackage.ma maVar = defpackage.oq0.gUjdnLbkVAaA;
        switch (i) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null) {
                    return new double[]{java.lang.Double.parseDouble(str)};
                }
                double[] dArr2 = {java.lang.Double.parseDouble(str)};
                int length = dArr.length;
                double[] copyOf = java.util.Arrays.copyOf(dArr, length + 1);
                java.lang.System.arraycopy(dArr2, 0, copyOf, length, 1);
                return copyOf;
            case 1:
                java.util.List list = (java.util.List) obj;
                return list != null ? defpackage.hf.ULjnV488Y6RO(list, defpackage.ma0.VFeft99leXEK(java.lang.Double.valueOf(java.lang.Double.parseDouble(str)))) : defpackage.ma0.VFeft99leXEK(java.lang.Double.valueOf(java.lang.Double.parseDouble(str)));
            case 2:
                java.lang.String[] strArr = (java.lang.String[]) obj;
                if (strArr == null) {
                    return new java.lang.String[]{maVar.JhCgjQRTAOCT(str)};
                }
                java.lang.String[] strArr2 = {maVar.JhCgjQRTAOCT(str)};
                int length2 = strArr.length;
                java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(strArr, length2 + 1);
                java.lang.System.arraycopy(strArr2, 0, copyOf2, length2, 1);
                return (java.lang.String[]) copyOf2;
            default:
                java.util.List list2 = (java.util.List) obj;
                return list2 != null ? defpackage.hf.ULjnV488Y6RO(list2, defpackage.ma0.VFeft99leXEK(maVar.JhCgjQRTAOCT(str))) : defpackage.ma0.VFeft99leXEK(maVar.JhCgjQRTAOCT(str));
        }
    }

    @Override // defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        switch (this.WmetiUbpKU9I) {
            case 0:
                return "double[]";
            case 1:
                return "List<Double>";
            case 2:
                return "string_nullable[]";
            default:
                return "List<String?>";
        }
    }
}
