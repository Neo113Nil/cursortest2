package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public abstract class JK implements Iterable, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final HK f26428u = new HK(AbstractC3103dL.f30518a);

    /* renamed from: n, reason: collision with root package name */
    public int f26429n = 0;

    static {
        int i = BK.f24648a;
    }

    public static int c(int i, int i4, int i6) {
        int i9 = i4 - i;
        if ((i | i4 | i9 | (i6 - i4)) >= 0) {
            return i9;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC5128c.d(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        if (i4 < i) {
            throw new IndexOutOfBoundsException(D.x.o(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i4).length()), "Beginning index larger than ending index: ", i, ", ", i4));
        }
        throw new IndexOutOfBoundsException(D.x.o(new StringBuilder(String.valueOf(i4).length() + 15 + String.valueOf(i6).length()), "End index: ", i4, " >= ", i6));
    }

    public static /* synthetic */ boolean d(byte[] bArr, int i, byte[] bArr2, int i4, int i6) {
        int i9 = i + i6;
        c(i, i9, bArr.length);
        c(i4, i6 + i4, bArr2.length);
        while (i < i9) {
            if (bArr[i] != bArr2[i4]) {
                return false;
            }
            i++;
            i4++;
        }
        return true;
    }

    public static JK m(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(D.x.j(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (JK) it.next();
        }
        int i4 = i >>> 1;
        JK m9 = m(it, i4);
        JK m10 = m(it, i - i4);
        if (Integer.MAX_VALUE - m9.f() < m10.f()) {
            int f2 = m9.f();
            int f9 = m10.f();
            throw new IllegalArgumentException(D.x.o(new StringBuilder(String.valueOf(f2).length() + 31 + String.valueOf(f9).length()), "ByteString would be too long: ", f2, "+", f9));
        }
        if (m10.f() == 0) {
            return m9;
        }
        if (m9.f() == 0) {
            return m10;
        }
        int f10 = m10.f() + m9.f();
        HK hk = f26428u;
        if (f10 < 128) {
            int f11 = m9.f();
            int f12 = m10.f();
            int i6 = f11 + f12;
            byte[] bArr = new byte[i6];
            c(0, f11, m9.f());
            c(0, f11, i6);
            if (f11 > 0) {
                m9.i(0, 0, f11, bArr);
            }
            c(0, f12, m10.f());
            c(f11, i6, i6);
            if (f12 > 0) {
                m10.i(0, f11, f12, bArr);
            }
            if (i6 == 0) {
                return hk;
            }
            try {
                return new HK(bArr);
            } catch (C3318hL e9) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
            }
        }
        if (m9 instanceof CL) {
            CL cl = (CL) m9;
            JK jk = cl.f24868x;
            int f13 = m10.f() + jk.f();
            JK jk2 = cl.f24867w;
            if (f13 < 128) {
                int f14 = jk.f();
                int f15 = m10.f();
                int i9 = f14 + f15;
                byte[] bArr2 = new byte[i9];
                c(0, f14, jk.f());
                c(0, f14, i9);
                if (f14 > 0) {
                    jk.i(0, 0, f14, bArr2);
                }
                c(0, f15, m10.f());
                c(f14, i9, i9);
                if (f15 > 0) {
                    m10.i(0, f14, f15, bArr2);
                }
                if (i9 != 0) {
                    try {
                        hk = new HK(bArr2);
                    } catch (C3318hL e10) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
                    }
                }
                return new CL(jk2, hk);
            }
            if (jk2.p() > jk.p() && cl.f24870z > m10.p()) {
                return new CL(jk2, new CL(jk, m10));
            }
        }
        if (f10 >= CL.v(Math.max(m9.p(), m10.p()) + 1)) {
            return new CL(m9, m10);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        WC.g(m9, arrayDeque);
        WC.g(m10, arrayDeque);
        JK jk3 = (JK) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            jk3 = new CL((JK) arrayDeque.pop(), jk3);
        }
        return jk3;
    }

    public static HK s(byte[] bArr, int i, int i4) {
        try {
            return t(bArr, i, i4);
        } catch (C3318hL e9) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
        }
    }

    public static HK t(byte[] bArr, int i, int i4) {
        if (i4 == 0) {
            return f26428u;
        }
        c(i, i + i4, bArr.length);
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        return new HK(bArr2);
    }

    public static JK u(ArrayList arrayList) {
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
        return size == 0 ? f26428u : m(arrayList.iterator(), size);
    }

    public final byte[] a() {
        int f2 = f();
        if (f2 == 0) {
            return AbstractC3103dL.f30518a;
        }
        byte[] bArr = new byte[f2];
        i(0, 0, f2, bArr);
        return bArr;
    }

    public abstract byte e(int i);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JK)) {
            return false;
        }
        JK jk = (JK) obj;
        int f2 = f();
        if (f2 != jk.f()) {
            return false;
        }
        if (f2 == 0) {
            return true;
        }
        int i = this.f26429n;
        int i4 = jk.f26429n;
        if (i == 0 || i4 == 0 || i == i4) {
            return l(jk);
        }
        return false;
    }

    public abstract int f();

    public abstract JK g(int i, int i4);

    public abstract JK h(int i, int i4);

    public final int hashCode() {
        int i = this.f26429n;
        if (i == 0) {
            int f2 = f();
            i = n(f2, 0, f2);
            if (i == 0) {
                i = 1;
            }
            this.f26429n = i;
        }
        return i;
    }

    public abstract void i(int i, int i4, int i6, byte[] bArr);

    public abstract ByteBuffer j();

    public abstract void k(OK ok);

    public abstract boolean l(JK jk);

    public abstract int n(int i, int i4, int i6);

    public abstract W7.b o();

    public abstract int p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC4278zC iterator() {
        return new EK(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f2 = f();
        String b9 = f() <= 50 ? AbstractC3364iD.b(a()) : AbstractC3364iD.b(h(0, 47).a()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(f2);
        sb.append(" contents=\"");
        return Wv.i(sb, b9, "\">");
    }
}
