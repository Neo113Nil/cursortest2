package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ba0 extends defpackage.oq0 {
    public final java.lang.Class WmetiUbpKU9I;
    public final java.lang.Class s0TASMVLSWD5;

    public ba0(java.lang.Class cls) {
        super(true);
        this.WmetiUbpKU9I = cls;
        if (!java.io.Serializable.class.isAssignableFrom(cls)) {
            defpackage.h7.oh71FJcDz6S2(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.s0TASMVLSWD5 = cls;
        } else {
            defpackage.h7.oh71FJcDz6S2(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.oq0
    public final java.lang.Object JhCgjQRTAOCT(java.lang.String str) {
        java.lang.Object obj = null;
        if (str.equals("null")) {
            return null;
        }
        java.lang.Class cls = this.s0TASMVLSWD5;
        java.lang.Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            java.lang.Object obj2 = enumConstants[i];
            java.lang.Enum r5 = (java.lang.Enum) obj2;
            r5.getClass();
            if (defpackage.ah1.w6IV1lieBIux(r5.name(), str, true)) {
                obj = obj2;
                break;
            }
            i++;
        }
        java.lang.Enum r1 = (java.lang.Enum) obj;
        if (r1 != null) {
            return r1;
        }
        throw new java.lang.IllegalArgumentException("Enum value " + str + " not found for type " + cls.getName() + '.');
    }

    @Override // defpackage.oq0
    public final void WDYagTQQm9ns(android.os.Bundle bundle, java.lang.String str, java.lang.Object obj) {
        str.getClass();
        bundle.putSerializable(str, (java.io.Serializable) this.WmetiUbpKU9I.cast((java.io.Serializable) obj));
    }

    @Override // defpackage.oq0
    public final java.lang.Object ZpBGe2uQfcn8(java.lang.String str, android.os.Bundle bundle) {
        bundle.getClass();
        java.lang.Object obj = bundle.get(str);
        if (obj instanceof java.io.Serializable) {
            return (java.io.Serializable) obj;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ba0)) {
            return false;
        }
        return this.WmetiUbpKU9I.equals(((defpackage.ba0) obj).WmetiUbpKU9I);
    }

    @Override // defpackage.oq0
    public final java.lang.String giKS3J6vZuNy() {
        return this.s0TASMVLSWD5.getName();
    }

    public final int hashCode() {
        return this.WmetiUbpKU9I.hashCode();
    }
}
