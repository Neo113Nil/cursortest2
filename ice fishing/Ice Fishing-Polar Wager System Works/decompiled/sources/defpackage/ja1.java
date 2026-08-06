package defpackage;

/* loaded from: classes.dex */
public final class ja1 extends defpackage.D2vUnMij {
    public static final defpackage.ja1 xiZrDbcSW0 = new defpackage.ja1(new java.lang.Object[0]);
    public final java.lang.Object[] adDC3e2L;

    public ja1(java.lang.Object[] objArr) {
        this.adDC3e2L = objArr;
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij AARZUJiTa(defpackage.v5iciZok v5icizok) {
        java.lang.Object[] objArr = this.adDC3e2L;
        int length = objArr.length;
        int length2 = objArr.length;
        java.lang.Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            java.lang.Object obj = objArr[i];
            if (((java.lang.Boolean) v5icizok.AARZUJiTa(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = java.util.Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? xiZrDbcSW0 : new defpackage.ja1(defpackage.t6.QUKZkWRtw6(objArr2, 0, length));
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij EXtogiMhuM(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.e90.riuEU0zW4(i, objArr.length);
        if (objArr.length == 1) {
            return xiZrDbcSW0;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length - 1);
        defpackage.t6.wKlPRKlRnfqr(objArr, copyOf, i, i + 1, objArr.length);
        return new defpackage.ja1(copyOf);
    }

    @Override // defpackage.SyNS6RMn
    public final int IHQe1A4L2xu() {
        return this.adDC3e2L.length;
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij adDC3e2L(java.util.Collection collection) {
        java.lang.Object[] objArr = this.adDC3e2L;
        if (collection.size() + objArr.length > 32) {
            defpackage.su0 xiZrDbcSW02 = xiZrDbcSW0();
            xiZrDbcSW02.addAll(collection);
            return xiZrDbcSW02.r1MBDhnF();
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new defpackage.ja1(copyOf);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.e90.riuEU0zW4(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final int indexOf(java.lang.Object obj) {
        return defpackage.t6.JcqDrWrgMf(this.adDC3e2L, obj);
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.adDC3e2L;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.abhbClRa, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.e90.ez2rX8ReCYw(i, objArr.length);
        return new defpackage.s9(objArr, i, objArr.length);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij oh6vYeIP(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.e90.ez2rX8ReCYw(i, objArr.length);
        if (i == objArr.length) {
            return r1MBDhnF(obj);
        }
        if (objArr.length < 32) {
            java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
            defpackage.t6.RmCzwkUxICV(objArr, objArr2, 0, i, 6);
            defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new defpackage.ja1(objArr2);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        defpackage.t6.wKlPRKlRnfqr(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = objArr[31];
        return new defpackage.ru0(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij r1MBDhnF(java.lang.Object obj) {
        java.lang.Object[] objArr = this.adDC3e2L;
        if (objArr.length < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new defpackage.ja1(copyOf);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[32];
        objArr2[0] = obj;
        return new defpackage.ru0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.D2vUnMij riuEU0zW4(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.adDC3e2L;
        defpackage.e90.riuEU0zW4(i, objArr.length);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new defpackage.ja1(copyOf);
    }

    @Override // defpackage.D2vUnMij
    public final defpackage.su0 xiZrDbcSW0() {
        return new defpackage.su0(this, null, this.adDC3e2L, 0);
    }
}
