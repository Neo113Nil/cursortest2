package defpackage;

/* loaded from: classes.dex */
public final class gu extends defpackage.abhbClRa implements defpackage.fu, java.util.RandomAccess, java.io.Serializable {
    public final java.lang.Enum[] adDC3e2L;

    public gu(java.lang.Enum[] enumArr) {
        this.adDC3e2L = enumArr;
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    @Override // defpackage.SyNS6RMn, java.util.Collection, java.util.List
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
            java.lang.Enum[] enumArr = this.adDC3e2L;
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
        java.lang.Enum[] enumArr = this.adDC3e2L;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, length, "index: ", ", size: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[RETURN] */
    @Override // defpackage.abhbClRa, java.util.List
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
            java.lang.Enum[] enumArr = this.adDC3e2L;
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
    @Override // defpackage.abhbClRa, java.util.List
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
            java.lang.Enum[] enumArr = this.adDC3e2L;
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
