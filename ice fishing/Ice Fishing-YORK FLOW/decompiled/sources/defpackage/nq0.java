package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class nq0 extends defpackage.oq0 {
    public final java.lang.Class WmetiUbpKU9I;

    public nq0(java.lang.Class cls) {
        super(true);
        if (!java.io.Serializable.class.isAssignableFrom(cls)) {
            defpackage.h7.oh71FJcDz6S2(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            defpackage.h7.oh71FJcDz6S2(cls, " is an Enum. You should use EnumType instead.");
            throw null;
        }
        this.WmetiUbpKU9I = cls;
    }

    @Override // defpackage.oq0
    /* renamed from: QiMR8OkAhezm, reason: merged with bridge method [inline-methods] */
    public java.io.Serializable JhCgjQRTAOCT(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Serializables don't support default values.");
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        java.io.Serializable serializable = (java.io.Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.WmetiUbpKU9I.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        bundle.getClass();
        return (java.io.Serializable) bundle.get(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nq0)) {
            return false;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.WmetiUbpKU9I, ((defpackage.nq0) obj).WmetiUbpKU9I);
    }

    @Override // defpackage.oq0
    public java.lang.String giKS3J6vZuNy() {
        return this.WmetiUbpKU9I.getName();
    }

    public final int hashCode() {
        return this.WmetiUbpKU9I.hashCode();
    }

    public nq0(java.lang.Class cls, int i) {
        super(false);
        if (java.io.Serializable.class.isAssignableFrom(cls)) {
            this.WmetiUbpKU9I = cls;
        } else {
            defpackage.h7.oh71FJcDz6S2(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
