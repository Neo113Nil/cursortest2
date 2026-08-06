package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class mq0 extends defpackage.oq0 {
    public final java.lang.Class WmetiUbpKU9I;

    public mq0(java.lang.Class cls) {
        super(true);
        if (android.os.Parcelable.class.isAssignableFrom(cls) || java.io.Serializable.class.isAssignableFrom(cls)) {
            this.WmetiUbpKU9I = cls;
        } else {
            defpackage.h7.oh71FJcDz6S2(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        str.getClass();
        this.WmetiUbpKU9I.cast(obj);
        if (obj == null || (obj instanceof android.os.Parcelable)) {
            bundle.putParcelable(str, (android.os.Parcelable) obj);
        } else if (obj instanceof java.io.Serializable) {
            bundle.putSerializable(str, (java.io.Serializable) obj);
        }
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        bundle.getClass();
        return bundle.get(str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !defpackage.mq0.class.equals(obj.getClass())) {
            return false;
        }
        return defpackage.ma0.QiMR8OkAhezm(this.WmetiUbpKU9I, ((defpackage.mq0) obj).WmetiUbpKU9I);
    }

    @Override // defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        return this.WmetiUbpKU9I.getName();
    }

    public final int hashCode() {
        return this.WmetiUbpKU9I.hashCode();
    }
}
