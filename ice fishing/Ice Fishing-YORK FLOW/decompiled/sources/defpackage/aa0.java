package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class aa0 extends defpackage.gf {
    public final defpackage.lq0 WmetiUbpKU9I;

    public aa0(java.lang.Class cls) {
        super(true);
        this.WmetiUbpKU9I = new defpackage.lq0(cls);
    }

    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        return defpackage.ma0.VFeft99leXEK(this.WmetiUbpKU9I.JhCgjQRTAOCT(str));
    }

    @Override // defpackage.gf
    public final java.util.List P05cfTpS5W5L(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        if (list == null) {
            return defpackage.av.WDYagTQQm9ns;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((java.lang.Enum) it.next()).toString());
        }
        return arrayList;
    }

    @Override // defpackage.gf
    public final /* bridge */ /* synthetic */ java.lang.Object QiMR8OkAhezm() {
        return defpackage.av.WDYagTQQm9ns;
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        str.getClass();
        bundle.putSerializable(str, list != null ? new java.util.ArrayList(list) : null);
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        bundle.getClass();
        java.lang.Object obj = bundle.get(str);
        if (obj instanceof java.util.List) {
            return (java.util.List) obj;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aa0)) {
            return false;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.WmetiUbpKU9I, ((defpackage.aa0) obj).WmetiUbpKU9I);
    }

    @Override // defpackage.oq0
    public final java.lang.Object fWTAfUmVKrZq(java.lang.Object obj, java.lang.String str) {
        java.util.List list = (java.util.List) obj;
        defpackage.lq0 lq0Var = this.WmetiUbpKU9I;
        return list != null ? defpackage.hf.ULjnV488Y6RO(list, defpackage.ma0.VFeft99leXEK(lq0Var.JhCgjQRTAOCT(str))) : defpackage.ma0.VFeft99leXEK(lq0Var.JhCgjQRTAOCT(str));
    }

    @Override // defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        return "List<" + this.WmetiUbpKU9I.s0TASMVLSWD5.getName() + "}>";
    }

    public final int hashCode() {
        return this.WmetiUbpKU9I.WmetiUbpKU9I.hashCode();
    }
}
