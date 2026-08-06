package defpackage;

/* loaded from: classes.dex */
public final class l6 extends defpackage.UsuH8pd5P {
    public static final java.lang.Object[] EXtogiMhuM = new java.lang.Object[0];
    public int AARZUJiTa;
    public int adDC3e2L;
    public java.lang.Object[] xiZrDbcSW0;

    public l6(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = EXtogiMhuM;
        } else {
            if (i <= 0) {
                defpackage.db.fnWB2E7cs(defpackage.fx0.SH1y5HwkJhh("Illegal Capacity: ", i));
                throw null;
            }
            objArr = new java.lang.Object[i];
        }
        this.xiZrDbcSW0 = objArr;
    }

    public final int AARZUJiTa(int i) {
        this.xiZrDbcSW0.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final java.lang.Object EXtogiMhuM() {
        if (isEmpty()) {
            return null;
        }
        return this.xiZrDbcSW0[ez2rX8ReCYw((size() - 1) + this.adDC3e2L)];
    }

    @Override // defpackage.UsuH8pd5P
    public final int IHQe1A4L2xu() {
        return this.AARZUJiTa;
    }

    public final void JlrlGoKF() {
        ((java.util.AbstractList) this).modCount++;
    }

    public final void SH1y5HwkJhh(int i, int i2) {
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (i < i2) {
            defpackage.t6.nVhUznk1t(i, i2, null, objArr);
        } else {
            defpackage.t6.nVhUznk1t(i, objArr.length, null, objArr);
            defpackage.t6.nVhUznk1t(0, i2, null, this.xiZrDbcSW0);
        }
    }

    public final void adDC3e2L(int i) {
        if (i < 0) {
            defpackage.db.AARZUJiTa("Deque is too big.");
            return;
        }
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == EXtogiMhuM) {
            if (i < 10) {
                i = 10;
            }
            this.xiZrDbcSW0 = new java.lang.Object[i];
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
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, 0, this.adDC3e2L, objArr.length);
        java.lang.Object[] objArr3 = this.xiZrDbcSW0;
        int length2 = objArr3.length;
        int i3 = this.adDC3e2L;
        defpackage.t6.wKlPRKlRnfqr(objArr3, objArr2, length2 - i3, 0, i3);
        this.adDC3e2L = 0;
        this.xiZrDbcSW0 = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        int i3 = this.AARZUJiTa;
        if (i < 0 || i > i3) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i3, "index: ", ", size: "));
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
        JlrlGoKF();
        adDC3e2L(this.AARZUJiTa + 1);
        int ez2rX8ReCYw = ez2rX8ReCYw(this.adDC3e2L + i);
        int i4 = this.AARZUJiTa;
        if (i < ((i4 + 1) >> 1)) {
            if (ez2rX8ReCYw == 0) {
                java.lang.Object[] objArr = this.xiZrDbcSW0;
                objArr.getClass();
                i2 = objArr.length - 1;
            } else {
                i2 = ez2rX8ReCYw - 1;
            }
            int i5 = this.adDC3e2L;
            if (i5 == 0) {
                java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                objArr2.getClass();
                i5 = objArr2.length;
            }
            int i6 = i5 - 1;
            int i7 = this.adDC3e2L;
            java.lang.Object[] objArr3 = this.xiZrDbcSW0;
            if (i2 >= i7) {
                objArr3[i6] = objArr3[i7];
                defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, i7, i7 + 1, i2 + 1);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                java.lang.Object[] objArr4 = this.xiZrDbcSW0;
                objArr4[objArr4.length - 1] = objArr4[0];
                defpackage.t6.wKlPRKlRnfqr(objArr4, objArr4, 0, 1, i2 + 1);
            }
            this.xiZrDbcSW0[i2] = obj;
            this.adDC3e2L = i6;
        } else {
            int ez2rX8ReCYw2 = ez2rX8ReCYw(i4 + this.adDC3e2L);
            java.lang.Object[] objArr5 = this.xiZrDbcSW0;
            if (ez2rX8ReCYw < ez2rX8ReCYw2) {
                defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, ez2rX8ReCYw + 1, ez2rX8ReCYw, ez2rX8ReCYw2);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, 1, 0, ez2rX8ReCYw2);
                java.lang.Object[] objArr6 = this.xiZrDbcSW0;
                objArr6[0] = objArr6[objArr6.length - 1];
                defpackage.t6.wKlPRKlRnfqr(objArr6, objArr6, ez2rX8ReCYw + 1, ez2rX8ReCYw, objArr6.length - 1);
            }
            this.xiZrDbcSW0[ez2rX8ReCYw] = obj;
        }
        this.AARZUJiTa++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        collection.getClass();
        int i2 = this.AARZUJiTa;
        if (i < 0 || i > i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.AARZUJiTa) {
            return addAll(collection);
        }
        JlrlGoKF();
        adDC3e2L(collection.size() + this.AARZUJiTa);
        int ez2rX8ReCYw = ez2rX8ReCYw(this.AARZUJiTa + this.adDC3e2L);
        int ez2rX8ReCYw2 = ez2rX8ReCYw(this.adDC3e2L + i);
        int size = collection.size();
        if (i >= ((this.AARZUJiTa + 1) >> 1)) {
            int i3 = ez2rX8ReCYw2 + size;
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            if (ez2rX8ReCYw2 < ez2rX8ReCYw) {
                int i4 = size + ez2rX8ReCYw;
                if (i4 <= objArr.length) {
                    defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i3, ez2rX8ReCYw2, ez2rX8ReCYw);
                } else if (i3 >= objArr.length) {
                    defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i3 - objArr.length, ez2rX8ReCYw2, ez2rX8ReCYw);
                } else {
                    int length = ez2rX8ReCYw - (i4 - objArr.length);
                    defpackage.t6.wKlPRKlRnfqr(objArr, objArr, 0, length, ez2rX8ReCYw);
                    java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                    defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i3, ez2rX8ReCYw2, length);
                }
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr, objArr, size, 0, ez2rX8ReCYw);
                java.lang.Object[] objArr3 = this.xiZrDbcSW0;
                if (i3 >= objArr3.length) {
                    defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, i3 - objArr3.length, ez2rX8ReCYw2, objArr3.length);
                } else {
                    defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    java.lang.Object[] objArr4 = this.xiZrDbcSW0;
                    defpackage.t6.wKlPRKlRnfqr(objArr4, objArr4, i3, ez2rX8ReCYw2, objArr4.length - size);
                }
            }
            r1MBDhnF(ez2rX8ReCYw2, collection);
            return true;
        }
        int i5 = this.adDC3e2L;
        int i6 = i5 - size;
        java.lang.Object[] objArr5 = this.xiZrDbcSW0;
        if (ez2rX8ReCYw2 < i5) {
            defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, i6, i5, objArr5.length);
            java.lang.Object[] objArr6 = this.xiZrDbcSW0;
            if (size >= ez2rX8ReCYw2) {
                defpackage.t6.wKlPRKlRnfqr(objArr6, objArr6, objArr6.length - size, 0, ez2rX8ReCYw2);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr6, objArr6, objArr6.length - size, 0, size);
                java.lang.Object[] objArr7 = this.xiZrDbcSW0;
                defpackage.t6.wKlPRKlRnfqr(objArr7, objArr7, 0, size, ez2rX8ReCYw2);
            }
        } else if (i6 >= 0) {
            defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, i6, i5, ez2rX8ReCYw2);
        } else {
            i6 += objArr5.length;
            int i7 = ez2rX8ReCYw2 - i5;
            int length2 = objArr5.length - i6;
            if (length2 >= i7) {
                defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, i6, i5, ez2rX8ReCYw2);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, i6, i5, i5 + length2);
                java.lang.Object[] objArr8 = this.xiZrDbcSW0;
                defpackage.t6.wKlPRKlRnfqr(objArr8, objArr8, 0, this.adDC3e2L + length2, ez2rX8ReCYw2);
            }
        }
        this.adDC3e2L = i6;
        r1MBDhnF(riuEU0zW4(ez2rX8ReCYw2 - size), collection);
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        JlrlGoKF();
        adDC3e2L(this.AARZUJiTa + 1);
        int i = this.adDC3e2L;
        if (i == 0) {
            java.lang.Object[] objArr = this.xiZrDbcSW0;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.adDC3e2L = i2;
        this.xiZrDbcSW0[i2] = obj;
        this.AARZUJiTa++;
    }

    public final void addLast(java.lang.Object obj) {
        JlrlGoKF();
        adDC3e2L(IHQe1A4L2xu() + 1);
        this.xiZrDbcSW0[ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L)] = obj;
        this.AARZUJiTa = IHQe1A4L2xu() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            JlrlGoKF();
            SH1y5HwkJhh(this.adDC3e2L, ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L));
        }
        this.adDC3e2L = 0;
        this.AARZUJiTa = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int ez2rX8ReCYw(int i) {
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.xiZrDbcSW0[this.adDC3e2L];
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        int IHQe1A4L2xu = IHQe1A4L2xu();
        if (i >= 0 && i < IHQe1A4L2xu) {
            return this.xiZrDbcSW0[ez2rX8ReCYw(this.adDC3e2L + i)];
        }
        defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, IHQe1A4L2xu, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int ez2rX8ReCYw = ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L);
        int i2 = this.adDC3e2L;
        if (i2 < ez2rX8ReCYw) {
            while (i2 < ez2rX8ReCYw) {
                if (defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[i2])) {
                    i = this.adDC3e2L;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.adDC3e2L) < ez2rX8ReCYw) {
            return -1;
        }
        int length = this.xiZrDbcSW0.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < ez2rX8ReCYw; i3++) {
                    if (defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[i3])) {
                        i2 = i3 + this.xiZrDbcSW0.length;
                        i = this.adDC3e2L;
                    }
                }
                return -1;
            }
            if (defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[i2])) {
                i = this.adDC3e2L;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return IHQe1A4L2xu() == 0;
    }

    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return this.xiZrDbcSW0[ez2rX8ReCYw((size() - 1) + this.adDC3e2L)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int length;
        int i;
        int ez2rX8ReCYw = ez2rX8ReCYw(this.AARZUJiTa + this.adDC3e2L);
        int i2 = this.adDC3e2L;
        if (i2 < ez2rX8ReCYw) {
            length = ez2rX8ReCYw - 1;
            if (i2 <= length) {
                while (!defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.adDC3e2L;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.adDC3e2L >= ez2rX8ReCYw) {
            while (true) {
                ez2rX8ReCYw--;
                java.lang.Object[] objArr = this.xiZrDbcSW0;
                if (-1 >= ez2rX8ReCYw) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.adDC3e2L;
                    if (i3 <= length) {
                        while (!defpackage.x70.QoRHpC4k(obj, this.xiZrDbcSW0[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.adDC3e2L;
                    }
                } else if (defpackage.x70.QoRHpC4k(obj, objArr[ez2rX8ReCYw])) {
                    length = ez2rX8ReCYw + this.xiZrDbcSW0.length;
                    i = this.adDC3e2L;
                    break;
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // defpackage.UsuH8pd5P
    public final java.lang.Object oh6vYeIP(int i) {
        int i2 = this.AARZUJiTa;
        if (i < 0 || i >= i2) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == IHQe1A4L2xu() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        JlrlGoKF();
        int ez2rX8ReCYw = ez2rX8ReCYw(this.adDC3e2L + i);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj = objArr[ez2rX8ReCYw];
        int i3 = this.AARZUJiTa >> 1;
        int i4 = this.adDC3e2L;
        if (i < i3) {
            if (ez2rX8ReCYw >= i4) {
                defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i4 + 1, i4, ez2rX8ReCYw);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr, objArr, 1, 0, ez2rX8ReCYw);
                java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.adDC3e2L;
                defpackage.t6.wKlPRKlRnfqr(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            java.lang.Object[] objArr3 = this.xiZrDbcSW0;
            int i6 = this.adDC3e2L;
            objArr3[i6] = null;
            this.adDC3e2L = AARZUJiTa(i6);
        } else {
            int ez2rX8ReCYw2 = ez2rX8ReCYw((IHQe1A4L2xu() - 1) + i4);
            java.lang.Object[] objArr4 = this.xiZrDbcSW0;
            if (ez2rX8ReCYw <= ez2rX8ReCYw2) {
                defpackage.t6.wKlPRKlRnfqr(objArr4, objArr4, ez2rX8ReCYw, ez2rX8ReCYw + 1, ez2rX8ReCYw2 + 1);
            } else {
                defpackage.t6.wKlPRKlRnfqr(objArr4, objArr4, ez2rX8ReCYw, ez2rX8ReCYw + 1, objArr4.length);
                java.lang.Object[] objArr5 = this.xiZrDbcSW0;
                objArr5[objArr5.length - 1] = objArr5[0];
                defpackage.t6.wKlPRKlRnfqr(objArr5, objArr5, 0, 1, ez2rX8ReCYw2 + 1);
            }
            this.xiZrDbcSW0[ez2rX8ReCYw2] = null;
        }
        this.AARZUJiTa--;
        return obj;
    }

    public final void r1MBDhnF(int i, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.xiZrDbcSW0.length;
        while (i < length && it.hasNext()) {
            this.xiZrDbcSW0[i] = it.next();
            i++;
        }
        int i2 = this.adDC3e2L;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.xiZrDbcSW0[i3] = it.next();
        }
        this.AARZUJiTa = collection.size() + this.AARZUJiTa;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        oh6vYeIP(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        int ez2rX8ReCYw;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.xiZrDbcSW0.length != 0) {
            int ez2rX8ReCYw2 = ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L);
            int i = this.adDC3e2L;
            if (i < ez2rX8ReCYw2) {
                ez2rX8ReCYw = i;
                while (true) {
                    objArr = this.xiZrDbcSW0;
                    if (i >= ez2rX8ReCYw2) {
                        break;
                    }
                    java.lang.Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.xiZrDbcSW0[ez2rX8ReCYw] = obj;
                        ez2rX8ReCYw++;
                    }
                    i++;
                }
                defpackage.t6.nVhUznk1t(ez2rX8ReCYw, ez2rX8ReCYw2, null, objArr);
            } else {
                int length = this.xiZrDbcSW0.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.xiZrDbcSW0[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                ez2rX8ReCYw = ez2rX8ReCYw(i2);
                for (int i3 = 0; i3 < ez2rX8ReCYw2; i3++) {
                    java.lang.Object[] objArr3 = this.xiZrDbcSW0;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.xiZrDbcSW0[ez2rX8ReCYw] = obj3;
                        ez2rX8ReCYw = AARZUJiTa(ez2rX8ReCYw);
                    }
                }
                z = z2;
            }
            if (z) {
                JlrlGoKF();
                this.AARZUJiTa = riuEU0zW4(ez2rX8ReCYw - this.adDC3e2L);
            }
        }
        return z;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        JlrlGoKF();
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        int i = this.adDC3e2L;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.adDC3e2L = AARZUJiTa(i);
        this.AARZUJiTa = IHQe1A4L2xu() - 1;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        JlrlGoKF();
        int ez2rX8ReCYw = ez2rX8ReCYw((size() - 1) + this.adDC3e2L);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj = objArr[ez2rX8ReCYw];
        objArr[ez2rX8ReCYw] = null;
        this.AARZUJiTa = IHQe1A4L2xu() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        defpackage.ci0.SyNS6RMn(i, i2, this.AARZUJiTa);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.AARZUJiTa) {
            clear();
            return;
        }
        if (i3 == 1) {
            oh6vYeIP(i);
            return;
        }
        JlrlGoKF();
        int i4 = this.AARZUJiTa - i2;
        int i5 = this.adDC3e2L;
        if (i < i4) {
            int ez2rX8ReCYw = ez2rX8ReCYw((i - 1) + i5);
            int ez2rX8ReCYw2 = ez2rX8ReCYw(this.adDC3e2L + (i2 - 1));
            while (i > 0) {
                int i6 = ez2rX8ReCYw + 1;
                int min = java.lang.Math.min(i, java.lang.Math.min(i6, ez2rX8ReCYw2 + 1));
                java.lang.Object[] objArr = this.xiZrDbcSW0;
                int i7 = ez2rX8ReCYw2 - min;
                int i8 = ez2rX8ReCYw - min;
                defpackage.t6.wKlPRKlRnfqr(objArr, objArr, i7 + 1, i8 + 1, i6);
                ez2rX8ReCYw = riuEU0zW4(i8);
                ez2rX8ReCYw2 = riuEU0zW4(i7);
                i -= min;
            }
            int ez2rX8ReCYw3 = ez2rX8ReCYw(this.adDC3e2L + i3);
            SH1y5HwkJhh(this.adDC3e2L, ez2rX8ReCYw3);
            this.adDC3e2L = ez2rX8ReCYw3;
        } else {
            int ez2rX8ReCYw4 = ez2rX8ReCYw(i5 + i2);
            int ez2rX8ReCYw5 = ez2rX8ReCYw(this.adDC3e2L + i);
            int i9 = this.AARZUJiTa;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                i2 = java.lang.Math.min(i9, java.lang.Math.min(objArr2.length - ez2rX8ReCYw4, objArr2.length - ez2rX8ReCYw5));
                java.lang.Object[] objArr3 = this.xiZrDbcSW0;
                int i10 = ez2rX8ReCYw4 + i2;
                defpackage.t6.wKlPRKlRnfqr(objArr3, objArr3, ez2rX8ReCYw5, ez2rX8ReCYw4, i10);
                ez2rX8ReCYw4 = ez2rX8ReCYw(i10);
                ez2rX8ReCYw5 = ez2rX8ReCYw(ez2rX8ReCYw5 + i2);
            }
            int ez2rX8ReCYw6 = ez2rX8ReCYw(this.AARZUJiTa + this.adDC3e2L);
            SH1y5HwkJhh(riuEU0zW4(ez2rX8ReCYw6 - i3), ez2rX8ReCYw6);
        }
        this.AARZUJiTa -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        int ez2rX8ReCYw;
        java.lang.Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.xiZrDbcSW0.length != 0) {
            int ez2rX8ReCYw2 = ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L);
            int i = this.adDC3e2L;
            if (i < ez2rX8ReCYw2) {
                ez2rX8ReCYw = i;
                while (true) {
                    objArr = this.xiZrDbcSW0;
                    if (i >= ez2rX8ReCYw2) {
                        break;
                    }
                    java.lang.Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.xiZrDbcSW0[ez2rX8ReCYw] = obj;
                        ez2rX8ReCYw++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                defpackage.t6.nVhUznk1t(ez2rX8ReCYw, ez2rX8ReCYw2, null, objArr);
            } else {
                int length = this.xiZrDbcSW0.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr2 = this.xiZrDbcSW0;
                    java.lang.Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.xiZrDbcSW0[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                ez2rX8ReCYw = ez2rX8ReCYw(i2);
                for (int i3 = 0; i3 < ez2rX8ReCYw2; i3++) {
                    java.lang.Object[] objArr3 = this.xiZrDbcSW0;
                    java.lang.Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.xiZrDbcSW0[ez2rX8ReCYw] = obj3;
                        ez2rX8ReCYw = AARZUJiTa(ez2rX8ReCYw);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                JlrlGoKF();
                this.AARZUJiTa = riuEU0zW4(ez2rX8ReCYw - this.adDC3e2L);
            }
        }
        return z;
    }

    public final int riuEU0zW4(int i) {
        return i < 0 ? i + this.xiZrDbcSW0.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        int IHQe1A4L2xu = IHQe1A4L2xu();
        if (i < 0 || i >= IHQe1A4L2xu) {
            defpackage.db.cnag84Bm(defpackage.fx0.EXtogiMhuM(i, IHQe1A4L2xu, "index: ", ", size: "));
            return null;
        }
        int ez2rX8ReCYw = ez2rX8ReCYw(this.adDC3e2L + i);
        java.lang.Object[] objArr = this.xiZrDbcSW0;
        java.lang.Object obj2 = objArr[ez2rX8ReCYw];
        objArr[ez2rX8ReCYw] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.AARZUJiTa;
        if (length < i) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (java.lang.Object[]) newInstance;
        }
        int ez2rX8ReCYw = ez2rX8ReCYw(this.AARZUJiTa + this.adDC3e2L);
        int i2 = this.adDC3e2L;
        if (i2 < ez2rX8ReCYw) {
            defpackage.t6.RmCzwkUxICV(this.xiZrDbcSW0, objArr, i2, ez2rX8ReCYw, 2);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr2 = this.xiZrDbcSW0;
            defpackage.t6.wKlPRKlRnfqr(objArr2, objArr, 0, this.adDC3e2L, objArr2.length);
            java.lang.Object[] objArr3 = this.xiZrDbcSW0;
            defpackage.t6.wKlPRKlRnfqr(objArr3, objArr, objArr3.length - this.adDC3e2L, 0, ez2rX8ReCYw);
        }
        int i3 = this.AARZUJiTa;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public final java.lang.Object xiZrDbcSW0() {
        if (isEmpty()) {
            return null;
        }
        return this.xiZrDbcSW0[this.adDC3e2L];
    }

    public l6() {
        this.xiZrDbcSW0 = EXtogiMhuM;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[IHQe1A4L2xu()]);
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
        JlrlGoKF();
        adDC3e2L(collection.size() + IHQe1A4L2xu());
        r1MBDhnF(ez2rX8ReCYw(IHQe1A4L2xu() + this.adDC3e2L), collection);
        return true;
    }
}
