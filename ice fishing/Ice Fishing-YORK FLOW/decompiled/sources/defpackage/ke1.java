package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ke1 extends defpackage.blKFvluuDQOf {
    public static final defpackage.ke1 QiMR8OkAhezm = new defpackage.ke1(new java.lang.Object[0]);
    public final java.lang.Object[] oh71FJcDz6S2;

    public ke1(java.lang.Object[] objArr) {
        this.oh71FJcDz6S2 = objArr;
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf JhCgjQRTAOCT(java.util.Collection collection) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (collection.size() + objArr.length > 32) {
            defpackage.ly0 WDYagTQQm9ns = WDYagTQQm9ns();
            WDYagTQQm9ns.addAll(collection);
            return WDYagTQQm9ns.fWTAfUmVKrZq();
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new defpackage.ke1(copyOf);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf P05cfTpS5W5L(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        defpackage.n70.GE9mJIPrb8gP(i, objArr.length);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new defpackage.ke1(copyOf);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf QiMR8OkAhezm(int i) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        defpackage.n70.GE9mJIPrb8gP(i, objArr.length);
        if (objArr.length == 1) {
            return QiMR8OkAhezm;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length - 1);
        defpackage.y7.hwoZxnIesQBZ(objArr, copyOf, i, i + 1, objArr.length);
        return new defpackage.ke1(copyOf);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.ly0 WDYagTQQm9ns() {
        return new defpackage.ly0(this, null, this.oh71FJcDz6S2, 0);
    }

    @Override // defpackage.lr1
    public final int ZpBGe2uQfcn8() {
        return this.oh71FJcDz6S2.length;
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf fWTAfUmVKrZq(java.lang.Object obj) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (objArr.length < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new defpackage.ke1(copyOf);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[32];
        objArr2[0] = obj;
        return new defpackage.ky0(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        defpackage.n70.GE9mJIPrb8gP(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf giKS3J6vZuNy(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        defpackage.n70.Ns0WNyEWdPsk(i, objArr.length);
        if (i == objArr.length) {
            return fWTAfUmVKrZq(obj);
        }
        if (objArr.length < 32) {
            java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 1];
            defpackage.y7.EgL5gQQnyJKX(objArr, objArr2, 0, i, 6);
            defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new defpackage.ke1(objArr2);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        defpackage.y7.hwoZxnIesQBZ(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        java.lang.Object[] objArr3 = new java.lang.Object[32];
        objArr3[0] = objArr[31];
        return new defpackage.ky0(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final int indexOf(java.lang.Object obj) {
        return defpackage.y7.eSwlWMUpitz8(this.oh71FJcDz6S2, obj);
    }

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
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

    @Override // defpackage.IJ0hOnjhPOri, java.util.List
    public final java.util.ListIterator listIterator(int i) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        defpackage.n70.Ns0WNyEWdPsk(i, objArr.length);
        return new defpackage.yb(objArr, i, objArr.length);
    }

    @Override // defpackage.blKFvluuDQOf
    public final defpackage.blKFvluuDQOf oh71FJcDz6S2(defpackage.OcTWLQzke1i2 ocTWLQzke1i2) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        int length = objArr.length;
        int length2 = objArr.length;
        java.lang.Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            java.lang.Object obj = objArr[i];
            if (((java.lang.Boolean) ocTWLQzke1i2.P05cfTpS5W5L(obj)).booleanValue()) {
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
        return length == objArr.length ? this : length == 0 ? QiMR8OkAhezm : new defpackage.ke1(defpackage.y7.LCK4GGEwbWAr(objArr2, 0, length));
    }
}
