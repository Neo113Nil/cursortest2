package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public abstract class SK implements Iterable, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final QK f27529u = new QK(AbstractC3684oL.f33136a);

    /* renamed from: n, reason: collision with root package name */
    public int f27530n = 0;

    static {
        int i = KK.f25952a;
    }

    public static int c(int i, int i4, int i9) {
        int i10 = i4 - i;
        if ((i | i4 | i10 | (i9 - i4)) >= 0) {
            return i10;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC5051n.d(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i4).length()), "Beginning index larger than ending index: ", i, ", ", i4));
        }
        throw new IndexOutOfBoundsException(D.y.n(new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(i9).length()), "End index: ", i4, " >= ", i9));
    }

    public static /* synthetic */ boolean d(byte[] bArr, int i, byte[] bArr2, int i4, int i9) {
        int i10 = i + i9;
        c(i, i10, bArr.length);
        c(i4, i9 + i4, bArr2.length);
        while (i < i10) {
            if (bArr[i] != bArr2[i4]) {
                return false;
            }
            i++;
            i4++;
        }
        return true;
    }

    public static SK m(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(D.y.i(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (SK) it.next();
        }
        int i4 = i >>> 1;
        SK m8 = m(it, i4);
        SK m9 = m(it, i - i4);
        if (Integer.MAX_VALUE - m8.f() < m9.f()) {
            int f6 = m8.f();
            int f9 = m9.f();
            throw new IllegalArgumentException(D.y.n(new StringBuilder(String.valueOf(f6).length() + 31 + String.valueOf(f9).length()), "ByteString would be too long: ", f6, "+", f9));
        }
        if (m9.f() == 0) {
            return m8;
        }
        if (m8.f() == 0) {
            return m9;
        }
        int f10 = m9.f() + m8.f();
        QK qk = f27529u;
        if (f10 < 128) {
            int f11 = m8.f();
            int f12 = m9.f();
            int i9 = f11 + f12;
            byte[] bArr = new byte[i9];
            c(0, f11, m8.f());
            c(0, f11, i9);
            if (f11 > 0) {
                m8.i(0, 0, f11, bArr);
            }
            c(0, f12, m9.f());
            c(f11, i9, i9);
            if (f12 > 0) {
                m9.i(0, f11, f12, bArr);
            }
            if (i9 == 0) {
                return qk;
            }
            try {
                return new QK(bArr);
            } catch (C3845rL e6) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
            }
        }
        if (m8 instanceof NL) {
            NL nl = (NL) m8;
            SK sk = nl.f26524x;
            int f13 = m9.f() + sk.f();
            SK sk2 = nl.f26523w;
            if (f13 < 128) {
                int f14 = sk.f();
                int f15 = m9.f();
                int i10 = f14 + f15;
                byte[] bArr2 = new byte[i10];
                c(0, f14, sk.f());
                c(0, f14, i10);
                if (f14 > 0) {
                    sk.i(0, 0, f14, bArr2);
                }
                c(0, f15, m9.f());
                c(f14, i10, i10);
                if (f15 > 0) {
                    m9.i(0, f14, f15, bArr2);
                }
                if (i10 != 0) {
                    try {
                        qk = new QK(bArr2);
                    } catch (C3845rL e9) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
                    }
                }
                return new NL(sk2, qk);
            }
            if (sk2.p() > sk.p() && nl.f26526z > m9.p()) {
                return new NL(sk2, new NL(sk, m9));
            }
        }
        if (f10 >= NL.v(Math.max(m8.p(), m9.p()) + 1)) {
            return new NL(m8, m9);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        AbstractC3137eE.g(m8, arrayDeque);
        AbstractC3137eE.g(m9, arrayDeque);
        SK sk3 = (SK) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            sk3 = new NL((SK) arrayDeque.pop(), sk3);
        }
        return sk3;
    }

    public static QK s(byte[] bArr, int i, int i4) {
        try {
            return t(bArr, i, i4);
        } catch (C3845rL e6) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e6);
        }
    }

    public static QK t(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return f27529u;
        }
        c(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new QK(bArr2);
    }

    public static SK u(ArrayList arrayList) {
        int size;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = arrayList.size();
        }
        return size == 0 ? f27529u : m(arrayList.iterator(), size);
    }

    public final byte[] a() {
        int f6 = f();
        if (f6 == 0) {
            return AbstractC3684oL.f33136a;
        }
        byte[] bArr = new byte[f6];
        i(0, 0, f6, bArr);
        return bArr;
    }

    public abstract byte e(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SK)) {
            return false;
        }
        SK sk = (SK) obj;
        int f6 = f();
        if (f6 != sk.f()) {
            return false;
        }
        if (f6 == 0) {
            return true;
        }
        int i = this.f27530n;
        int i4 = sk.f27530n;
        if (i == 0 || i4 == 0 || i == i4) {
            return l(sk);
        }
        return false;
    }

    public abstract int f();

    public abstract SK g(int i, int i4);

    public abstract SK h(int i, int i4);

    public final int hashCode() {
        int i = this.f27530n;
        if (i == 0) {
            int f6 = f();
            i = n(f6, 0, f6);
            if (i == 0) {
                i = 1;
            }
            this.f27530n = i;
        }
        return i;
    }

    public abstract void i(int i, int i4, int i9, byte[] bArr);

    public abstract ByteBuffer j();

    public abstract void k(XK xk);

    public abstract boolean l(SK sk);

    public abstract int n(int i, int i4, int i9);

    public abstract S7.b o();

    public abstract int p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public CC iterator() {
        return new NK(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f6 = f();
        String d2 = f() <= 50 ? XC.d(a()) : XC.d(h(0, 47).a()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(f6);
        sb.append(" contents=\"");
        return AbstractC5051n.g(sb, d2, "\">");
    }
}
