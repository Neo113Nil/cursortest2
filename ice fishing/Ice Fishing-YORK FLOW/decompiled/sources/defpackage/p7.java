package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class p7 extends defpackage.oCu53ZX2v4Ju {
    public static final java.lang.Object[] P05cfTpS5W5L = new java.lang.Object[0];
    public int QiMR8OkAhezm;
    public int WDYagTQQm9ns;
    public java.lang.Object[] oh71FJcDz6S2;

    public p7(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = P05cfTpS5W5L;
        } else {
            if (i <= 0) {
                defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new java.lang.Object[i];
        }
        this.oh71FJcDz6S2 = objArr;
    }

    public final int GE9mJIPrb8gP(int i) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void JhCgjQRTAOCT(int i) {
        if (i < 0) {
            defpackage.h7.P05cfTpS5W5L("Deque is too big.");
            return;
        }
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == P05cfTpS5W5L) {
            if (i < 10) {
                i = 10;
            }
            this.oh71FJcDz6S2 = new java.lang.Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        defpackage.y7.hwoZxnIesQBZ(objArr, objArr2, 0, this.WDYagTQQm9ns, objArr.length);
        java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
        int length2 = objArr3.length;
        int i3 = this.WDYagTQQm9ns;
        defpackage.y7.hwoZxnIesQBZ(objArr3, objArr2, length2 - i3, 0, i3);
        this.WDYagTQQm9ns = 0;
        this.oh71FJcDz6S2 = objArr2;
    }

    public final void Ns0WNyEWdPsk() {
        ((java.util.AbstractList) this).modCount++;
    }

    public final int P05cfTpS5W5L(int i) {
        return i < 0 ? i + this.oh71FJcDz6S2.length : i;
    }

    public final java.lang.Object QiMR8OkAhezm() {
        if (isEmpty()) {
            return null;
        }
        return this.oh71FJcDz6S2[GE9mJIPrb8gP((size() - 1) + this.WDYagTQQm9ns)];
    }

    public final java.lang.Object WDYagTQQm9ns() {
        if (isEmpty()) {
            return null;
        }
        return this.oh71FJcDz6S2[this.WDYagTQQm9ns];
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final int ZpBGe2uQfcn8() {
        return this.QiMR8OkAhezm;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        int i3 = this.QiMR8OkAhezm;
        if (i < 0 || i > i3) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i3, "index: ", ", size: "));
            return;
        }
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        Ns0WNyEWdPsk();
        JhCgjQRTAOCT(this.QiMR8OkAhezm + 1);
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.WDYagTQQm9ns + i);
        int i4 = this.QiMR8OkAhezm;
        if (i < ((i4 + 1) >> 1)) {
            if (GE9mJIPrb8gP == 0) {
                java.lang.Object[] objArr = this.oh71FJcDz6S2;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = GE9mJIPrb8gP - 1;
            }
            int i5 = this.WDYagTQQm9ns;
            if (i5 == 0) {
                java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.WDYagTQQm9ns;
            java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, i7, i7 + 1, i2 + 1);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                java.lang.Object[] objArr4 = this.oh71FJcDz6S2;
                objArr4[objArr4.length - 1] = objArr4[0];
                defpackage.y7.hwoZxnIesQBZ(objArr4, objArr4, 0, 1, i2 + 1);
            }
            this.oh71FJcDz6S2[i2] = obj;
            this.WDYagTQQm9ns = i6;
        } else {
            int GE9mJIPrb8gP2 = GE9mJIPrb8gP(i4 + this.WDYagTQQm9ns);
            java.lang.Object[] objArr5 = this.oh71FJcDz6S2;
            if (GE9mJIPrb8gP < GE9mJIPrb8gP2) {
                defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, GE9mJIPrb8gP + 1, GE9mJIPrb8gP, GE9mJIPrb8gP2);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, 1, 0, GE9mJIPrb8gP2);
                java.lang.Object[] objArr6 = this.oh71FJcDz6S2;
                objArr6[0] = objArr6[objArr6.length - 1];
                defpackage.y7.hwoZxnIesQBZ(objArr6, objArr6, GE9mJIPrb8gP + 1, GE9mJIPrb8gP, objArr6.length - 1);
            }
            this.oh71FJcDz6S2[GE9mJIPrb8gP] = obj;
        }
        this.QiMR8OkAhezm++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        int i2 = this.QiMR8OkAhezm;
        if (i < 0 || i > i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.QiMR8OkAhezm) {
            return addAll(collection);
        }
        Ns0WNyEWdPsk();
        JhCgjQRTAOCT(collection.size() + this.QiMR8OkAhezm);
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.QiMR8OkAhezm + this.WDYagTQQm9ns);
        int GE9mJIPrb8gP2 = GE9mJIPrb8gP(this.WDYagTQQm9ns + i);
        int size = collection.size();
        if (i >= ((this.QiMR8OkAhezm + 1) >> 1)) {
            int i3 = GE9mJIPrb8gP2 + size;
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            if (GE9mJIPrb8gP2 < GE9mJIPrb8gP) {
                int i4 = size + GE9mJIPrb8gP;
                if (i4 <= objArr.length) {
                    defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i3, GE9mJIPrb8gP2, GE9mJIPrb8gP);
                } else if (i3 >= objArr.length) {
                    defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i3 - objArr.length, GE9mJIPrb8gP2, GE9mJIPrb8gP);
                } else {
                    int length = GE9mJIPrb8gP - (i4 - objArr.length);
                    defpackage.y7.hwoZxnIesQBZ(objArr, objArr, 0, length, GE9mJIPrb8gP);
                    java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                    defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i3, GE9mJIPrb8gP2, length);
                }
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr, objArr, size, 0, GE9mJIPrb8gP);
                java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
                if (i3 >= objArr3.length) {
                    defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, i3 - objArr3.length, GE9mJIPrb8gP2, objArr3.length);
                } else {
                    defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    java.lang.Object[] objArr4 = this.oh71FJcDz6S2;
                    defpackage.y7.hwoZxnIesQBZ(objArr4, objArr4, i3, GE9mJIPrb8gP2, objArr4.length - size);
                }
            }
            fWTAfUmVKrZq(GE9mJIPrb8gP2, collection);
            return true;
        }
        int i5 = this.WDYagTQQm9ns;
        int i6 = i5 - size;
        java.lang.Object[] objArr5 = this.oh71FJcDz6S2;
        if (GE9mJIPrb8gP2 < i5) {
            defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, i6, i5, objArr5.length);
            java.lang.Object[] objArr6 = this.oh71FJcDz6S2;
            if (size >= GE9mJIPrb8gP2) {
                defpackage.y7.hwoZxnIesQBZ(objArr6, objArr6, objArr6.length - size, 0, GE9mJIPrb8gP2);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr6, objArr6, objArr6.length - size, 0, size);
                java.lang.Object[] objArr7 = this.oh71FJcDz6S2;
                defpackage.y7.hwoZxnIesQBZ(objArr7, objArr7, 0, size, GE9mJIPrb8gP2);
            }
        } else if (i6 >= 0) {
            defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, i6, i5, GE9mJIPrb8gP2);
        } else {
            i6 += objArr5.length;
            int i7 = GE9mJIPrb8gP2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, i6, i5, GE9mJIPrb8gP2);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, i6, i5, i5 + length2);
                java.lang.Object[] objArr8 = this.oh71FJcDz6S2;
                defpackage.y7.hwoZxnIesQBZ(objArr8, objArr8, 0, this.WDYagTQQm9ns + length2, GE9mJIPrb8gP2);
            }
        }
        this.WDYagTQQm9ns = i6;
        fWTAfUmVKrZq(P05cfTpS5W5L(GE9mJIPrb8gP2 - size), collection);
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        Ns0WNyEWdPsk();
        JhCgjQRTAOCT(this.QiMR8OkAhezm + 1);
        int i = this.WDYagTQQm9ns;
        if (i == 0) {
            java.lang.Object[] objArr = this.oh71FJcDz6S2;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.WDYagTQQm9ns = i2;
        this.oh71FJcDz6S2[i2] = obj;
        this.QiMR8OkAhezm++;
    }

    public final void addLast(java.lang.Object obj) {
        Ns0WNyEWdPsk();
        JhCgjQRTAOCT(ZpBGe2uQfcn8() + 1);
        this.oh71FJcDz6S2[GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns)] = obj;
        this.QiMR8OkAhezm = ZpBGe2uQfcn8() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            Ns0WNyEWdPsk();
            e6mdH7fiFuta(this.WDYagTQQm9ns, GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns));
        }
        this.WDYagTQQm9ns = 0;
        this.QiMR8OkAhezm = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e6mdH7fiFuta(int i, int i2) {
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        if (i < i2) {
            defpackage.y7.I5Vdbaz9SDkL(i, i2, null, objArr);
        } else {
            defpackage.y7.I5Vdbaz9SDkL(i, objArr.length, null, objArr);
            defpackage.y7.I5Vdbaz9SDkL(0, i2, null, this.oh71FJcDz6S2);
        }
    }

    public final void fWTAfUmVKrZq(int i, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.oh71FJcDz6S2.length;
        while (i < length && it.hasNext()) {
            this.oh71FJcDz6S2[i] = it.next();
            i++;
        }
        int i2 = this.WDYagTQQm9ns;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.oh71FJcDz6S2[i3] = it.next();
        }
        this.QiMR8OkAhezm = collection.size() + this.QiMR8OkAhezm;
    }

    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.oh71FJcDz6S2[this.WDYagTQQm9ns];
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        int ZpBGe2uQfcn8 = ZpBGe2uQfcn8();
        if (i >= 0 && i < ZpBGe2uQfcn8) {
            return this.oh71FJcDz6S2[GE9mJIPrb8gP(this.WDYagTQQm9ns + i)];
        }
        defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, ZpBGe2uQfcn8, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.oCu53ZX2v4Ju
    public final java.lang.Object giKS3J6vZuNy(int i) {
        int i2 = this.QiMR8OkAhezm;
        if (i < 0 || i >= i2) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == ZpBGe2uQfcn8() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        Ns0WNyEWdPsk();
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.WDYagTQQm9ns + i);
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object obj = objArr[GE9mJIPrb8gP];
        int i3 = this.QiMR8OkAhezm >> 1;
        int i4 = this.WDYagTQQm9ns;
        if (i < i3) {
            if (GE9mJIPrb8gP >= i4) {
                defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i4 + 1, i4, GE9mJIPrb8gP);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr, objArr, 1, 0, GE9mJIPrb8gP);
                java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.WDYagTQQm9ns;
                defpackage.y7.hwoZxnIesQBZ(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
            int i6 = this.WDYagTQQm9ns;
            objArr3[i6] = null;
            this.WDYagTQQm9ns = oh71FJcDz6S2(i6);
        } else {
            int GE9mJIPrb8gP2 = GE9mJIPrb8gP((ZpBGe2uQfcn8() - 1) + i4);
            java.lang.Object[] objArr4 = this.oh71FJcDz6S2;
            if (GE9mJIPrb8gP <= GE9mJIPrb8gP2) {
                defpackage.y7.hwoZxnIesQBZ(objArr4, objArr4, GE9mJIPrb8gP, GE9mJIPrb8gP + 1, GE9mJIPrb8gP2 + 1);
            } else {
                defpackage.y7.hwoZxnIesQBZ(objArr4, objArr4, GE9mJIPrb8gP, GE9mJIPrb8gP + 1, objArr4.length);
                java.lang.Object[] objArr5 = this.oh71FJcDz6S2;
                objArr5[objArr5.length - 1] = objArr5[0];
                defpackage.y7.hwoZxnIesQBZ(objArr5, objArr5, 0, 1, GE9mJIPrb8gP2 + 1);
            }
            this.oh71FJcDz6S2[GE9mJIPrb8gP2] = null;
        }
        this.QiMR8OkAhezm--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int GE9mJIPrb8gP = GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns);
        int i2 = this.WDYagTQQm9ns;
        if (i2 < GE9mJIPrb8gP) {
            while (i2 < GE9mJIPrb8gP) {
                if (defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[i2])) {
                    i = this.WDYagTQQm9ns;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.WDYagTQQm9ns) < GE9mJIPrb8gP) {
            return -1;
        }
        int length = this.oh71FJcDz6S2.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < GE9mJIPrb8gP; i3++) {
                    if (defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[i3])) {
                        i2 = i3 + this.oh71FJcDz6S2.length;
                        i = this.WDYagTQQm9ns;
                    }
                }
                return -1;
            }
            if (defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[i2])) {
                i = this.WDYagTQQm9ns;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return ZpBGe2uQfcn8() == 0;
    }

    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.oh71FJcDz6S2[GE9mJIPrb8gP((size() - 1) + this.WDYagTQQm9ns)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int length;
        int i;
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.QiMR8OkAhezm + this.WDYagTQQm9ns);
        int i2 = this.WDYagTQQm9ns;
        if (i2 < GE9mJIPrb8gP) {
            length = GE9mJIPrb8gP - 1;
            if (i2 <= length) {
                while (!defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.WDYagTQQm9ns;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.WDYagTQQm9ns >= GE9mJIPrb8gP) {
            while (true) {
                GE9mJIPrb8gP--;
                java.lang.Object[] objArr = this.oh71FJcDz6S2;
                if (-1 >= GE9mJIPrb8gP) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.WDYagTQQm9ns;
                    if (i3 <= length) {
                        while (!defpackage.ma0.QiMR8OkAhezm(obj, this.oh71FJcDz6S2[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.WDYagTQQm9ns;
                    }
                } else if (defpackage.ma0.QiMR8OkAhezm(obj, objArr[GE9mJIPrb8gP])) {
                    length = GE9mJIPrb8gP + this.oh71FJcDz6S2.length;
                    i = this.WDYagTQQm9ns;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    public final int oh71FJcDz6S2(int i) {
        this.oh71FJcDz6S2.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        giKS3J6vZuNy(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int GE9mJIPrb8gP;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.oh71FJcDz6S2.length != 0) {
            int GE9mJIPrb8gP2 = GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns);
            int i = this.WDYagTQQm9ns;
            if (i < GE9mJIPrb8gP2) {
                GE9mJIPrb8gP = i;
                while (true) {
                    objArr = this.oh71FJcDz6S2;
                    if (i >= GE9mJIPrb8gP2) {
                        break;
                    }
                    java.lang.Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.oh71FJcDz6S2[GE9mJIPrb8gP] = obj;
                        GE9mJIPrb8gP++;
                    }
                    i++;
                }
                defpackage.y7.I5Vdbaz9SDkL(GE9mJIPrb8gP, GE9mJIPrb8gP2, null, objArr);
            } else {
                int length = this.oh71FJcDz6S2.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.oh71FJcDz6S2[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                GE9mJIPrb8gP = GE9mJIPrb8gP(i2);
                for (int i3 = 0; i3 < GE9mJIPrb8gP2; i3++) {
                    java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.oh71FJcDz6S2[GE9mJIPrb8gP] = obj3;
                        GE9mJIPrb8gP = oh71FJcDz6S2(GE9mJIPrb8gP);
                    }
                }
                z = z2;
            }
            if (z) {
                Ns0WNyEWdPsk();
                this.QiMR8OkAhezm = P05cfTpS5W5L(GE9mJIPrb8gP - this.WDYagTQQm9ns);
            }
        }
        return z;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        Ns0WNyEWdPsk();
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        int i = this.WDYagTQQm9ns;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.WDYagTQQm9ns = oh71FJcDz6S2(i);
        this.QiMR8OkAhezm = ZpBGe2uQfcn8() - 1;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        Ns0WNyEWdPsk();
        int GE9mJIPrb8gP = GE9mJIPrb8gP((size() - 1) + this.WDYagTQQm9ns);
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object obj = objArr[GE9mJIPrb8gP];
        objArr[GE9mJIPrb8gP] = null;
        this.QiMR8OkAhezm = ZpBGe2uQfcn8() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        defpackage.ok0.ZVVdXbWmyCSK(i, i2, this.QiMR8OkAhezm);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.QiMR8OkAhezm) {
            clear();
            return;
        }
        if (i3 == 1) {
            giKS3J6vZuNy(i);
            return;
        }
        Ns0WNyEWdPsk();
        int i4 = this.QiMR8OkAhezm - i2;
        int i5 = this.WDYagTQQm9ns;
        if (i < i4) {
            int GE9mJIPrb8gP = GE9mJIPrb8gP((i - 1) + i5);
            int GE9mJIPrb8gP2 = GE9mJIPrb8gP(this.WDYagTQQm9ns + (i2 - 1));
            while (i > 0) {
                int i6 = GE9mJIPrb8gP + 1;
                int min = java.lang.Math.min(i, java.lang.Math.min(i6, GE9mJIPrb8gP2 + 1));
                java.lang.Object[] objArr = this.oh71FJcDz6S2;
                int i7 = GE9mJIPrb8gP2 - min;
                int i8 = GE9mJIPrb8gP - min;
                defpackage.y7.hwoZxnIesQBZ(objArr, objArr, i7 + 1, i8 + 1, i6);
                GE9mJIPrb8gP = P05cfTpS5W5L(i8);
                GE9mJIPrb8gP2 = P05cfTpS5W5L(i7);
                i -= min;
            }
            int GE9mJIPrb8gP3 = GE9mJIPrb8gP(this.WDYagTQQm9ns + i3);
            e6mdH7fiFuta(this.WDYagTQQm9ns, GE9mJIPrb8gP3);
            this.WDYagTQQm9ns = GE9mJIPrb8gP3;
        } else {
            int GE9mJIPrb8gP4 = GE9mJIPrb8gP(i5 + i2);
            int GE9mJIPrb8gP5 = GE9mJIPrb8gP(this.WDYagTQQm9ns + i);
            int i9 = this.QiMR8OkAhezm;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                i2 = java.lang.Math.min(i9, java.lang.Math.min(objArr2.length - GE9mJIPrb8gP4, objArr2.length - GE9mJIPrb8gP5));
                java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
                int i10 = GE9mJIPrb8gP4 + i2;
                defpackage.y7.hwoZxnIesQBZ(objArr3, objArr3, GE9mJIPrb8gP5, GE9mJIPrb8gP4, i10);
                GE9mJIPrb8gP4 = GE9mJIPrb8gP(i10);
                GE9mJIPrb8gP5 = GE9mJIPrb8gP(GE9mJIPrb8gP5 + i2);
            }
            int GE9mJIPrb8gP6 = GE9mJIPrb8gP(this.QiMR8OkAhezm + this.WDYagTQQm9ns);
            e6mdH7fiFuta(P05cfTpS5W5L(GE9mJIPrb8gP6 - i3), GE9mJIPrb8gP6);
        }
        this.QiMR8OkAhezm -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int GE9mJIPrb8gP;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.oh71FJcDz6S2.length != 0) {
            int GE9mJIPrb8gP2 = GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns);
            int i = this.WDYagTQQm9ns;
            if (i < GE9mJIPrb8gP2) {
                GE9mJIPrb8gP = i;
                while (true) {
                    objArr = this.oh71FJcDz6S2;
                    if (i >= GE9mJIPrb8gP2) {
                        break;
                    }
                    java.lang.Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.oh71FJcDz6S2[GE9mJIPrb8gP] = obj;
                        GE9mJIPrb8gP++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                defpackage.y7.I5Vdbaz9SDkL(GE9mJIPrb8gP, GE9mJIPrb8gP2, null, objArr);
            } else {
                int length = this.oh71FJcDz6S2.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.oh71FJcDz6S2[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                GE9mJIPrb8gP = GE9mJIPrb8gP(i2);
                for (int i3 = 0; i3 < GE9mJIPrb8gP2; i3++) {
                    java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.oh71FJcDz6S2[GE9mJIPrb8gP] = obj3;
                        GE9mJIPrb8gP = oh71FJcDz6S2(GE9mJIPrb8gP);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                Ns0WNyEWdPsk();
                this.QiMR8OkAhezm = P05cfTpS5W5L(GE9mJIPrb8gP - this.WDYagTQQm9ns);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        int ZpBGe2uQfcn8 = ZpBGe2uQfcn8();
        if (i < 0 || i >= ZpBGe2uQfcn8) {
            defpackage.h7.WmetiUbpKU9I(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, ZpBGe2uQfcn8, "index: ", ", size: "));
            return null;
        }
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.WDYagTQQm9ns + i);
        java.lang.Object[] objArr = this.oh71FJcDz6S2;
        java.lang.Object obj2 = objArr[GE9mJIPrb8gP];
        objArr[GE9mJIPrb8gP] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.QiMR8OkAhezm;
        if (length < i) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (java.lang.Object[]) newInstance;
        }
        int GE9mJIPrb8gP = GE9mJIPrb8gP(this.QiMR8OkAhezm + this.WDYagTQQm9ns);
        int i2 = this.WDYagTQQm9ns;
        if (i2 < GE9mJIPrb8gP) {
            defpackage.y7.EgL5gQQnyJKX(this.oh71FJcDz6S2, objArr, i2, GE9mJIPrb8gP, 2);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.oh71FJcDz6S2;
            defpackage.y7.hwoZxnIesQBZ(objArr2, objArr, 0, this.WDYagTQQm9ns, objArr2.length);
            java.lang.Object[] objArr3 = this.oh71FJcDz6S2;
            defpackage.y7.hwoZxnIesQBZ(objArr3, objArr, objArr3.length - this.WDYagTQQm9ns, 0, GE9mJIPrb8gP);
        }
        int i3 = this.QiMR8OkAhezm;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public p7() {
        this.oh71FJcDz6S2 = P05cfTpS5W5L;
    }

    public p7(defpackage.p51 p51Var) {
        java.lang.Object[] Mearx7yMn90V = defpackage.i61.Mearx7yMn90V(p51Var, new java.lang.Object[0]);
        this.oh71FJcDz6S2 = Mearx7yMn90V;
        this.QiMR8OkAhezm = Mearx7yMn90V.length;
        if (Mearx7yMn90V.length == 0) {
            this.oh71FJcDz6S2 = P05cfTpS5W5L;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[ZpBGe2uQfcn8()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        Ns0WNyEWdPsk();
        JhCgjQRTAOCT(collection.size() + ZpBGe2uQfcn8());
        fWTAfUmVKrZq(GE9mJIPrb8gP(ZpBGe2uQfcn8() + this.WDYagTQQm9ns), collection);
        return true;
    }
}
