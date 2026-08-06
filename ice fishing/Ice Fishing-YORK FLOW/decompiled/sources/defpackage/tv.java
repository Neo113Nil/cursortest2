package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tv extends defpackage.IJ0hOnjhPOri implements defpackage.sv, java.util.RandomAccess, java.io.Serializable {
    public final java.lang.Enum[] oh71FJcDz6S2;

    public tv(java.lang.Enum[] enumArr) {
        this.oh71FJcDz6S2 = enumArr;
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.oh71FJcDz6S2.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // defpackage.lr1, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(java.lang.Object obj) {
        java.lang.Enum r2;
        if (!(obj instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r3 = (java.lang.Enum) obj;
        int ordinal = r3.ordinal();
        if (ordinal >= 0) {
            java.lang.Enum[] enumArr = this.oh71FJcDz6S2;
            if (ordinal < enumArr.length) {
                r2 = enumArr[ordinal];
                return r2 != r3;
            }
        }
        r2 = null;
        if (r2 != r3) {
        }
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Enum[] enumArr = this.oh71FJcDz6S2;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, length, "index: ", ", size: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(java.lang.Object obj) {
        java.lang.Enum r3;
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            java.lang.Enum[] enumArr = this.oh71FJcDz6S2;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Enum r3;
        if (!(obj instanceof java.lang.Enum)) {
            return -1;
        }
        java.lang.Enum r4 = (java.lang.Enum) obj;
        int ordinal = r4.ordinal();
        if (ordinal >= 0) {
            java.lang.Enum[] enumArr = this.oh71FJcDz6S2;
            if (ordinal < enumArr.length) {
                r3 = enumArr[ordinal];
                if (r3 != r4) {
                    return ordinal;
                }
                return -1;
            }
        }
        r3 = null;
        if (r3 != r4) {
        }
    }
}
