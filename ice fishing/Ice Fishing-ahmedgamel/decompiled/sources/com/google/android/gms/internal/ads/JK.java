package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class JK implements Iterable, Serializable {

    /* renamed from: u, reason: collision with root package name */
    public static final HK f25675u = new HK(AbstractC3080dL.f29746a);

    /* renamed from: n, reason: collision with root package name */
    public int f25676n = 0;

    static {
        int i = BK.f23877a;
    }

    public static int c(int i, int i6, int i9) {
        int i10 = i6 - i;
        if ((i | i6 | i10 | (i9 - i6)) >= 0) {
            return i10;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(u1.h.d(i, "Beginning index: ", " < 0", new StringBuilder(String.valueOf(i).length() + 21)));
        }
        if (i6 < i) {
            throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i6).length()), "Beginning index larger than ending index: ", i, ", ", i6));
        }
        throw new IndexOutOfBoundsException(D.y.r(new StringBuilder(String.valueOf(i6).length() + 15 + String.valueOf(i9).length()), "End index: ", i6, " >= ", i9));
    }

    public static /* synthetic */ boolean d(byte[] bArr, int i, byte[] bArr2, int i6, int i9) {
        int i10 = i + i9;
        c(i, i10, bArr.length);
        c(i6, i9 + i6, bArr2.length);
        while (i < i10) {
            if (bArr[i] != bArr2[i6]) {
                return false;
            }
            i++;
            i6++;
        }
        return true;
    }

    public static JK m(Iterator it, int i) {
        if (i <= 0) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(D.y.k(i, "length (", ") must be >= 1"));
        }
        if (i == 1) {
            return (JK) it.next();
        }
        int i6 = i >>> 1;
        JK m4 = m(it, i6);
        JK m9 = m(it, i - i6);
        if (Integer.MAX_VALUE - m4.f() < m9.f()) {
            int f3 = m4.f();
            int f9 = m9.f();
            throw new IllegalArgumentException(D.y.r(new StringBuilder(String.valueOf(f3).length() + 31 + String.valueOf(f9).length()), "ByteString would be too long: ", f3, "+", f9));
        }
        if (m9.f() == 0) {
            return m4;
        }
        if (m4.f() == 0) {
            return m9;
        }
        int f10 = m9.f() + m4.f();
        HK hk = f25675u;
        if (f10 < 128) {
            int f11 = m4.f();
            int f12 = m9.f();
            int i9 = f11 + f12;
            byte[] bArr = new byte[i9];
            c(0, f11, m4.f());
            c(0, f11, i9);
            if (f11 > 0) {
                m4.i(0, 0, f11, bArr);
            }
            c(0, f12, m9.f());
            c(f11, i9, i9);
            if (f12 > 0) {
                m9.i(0, f11, f12, bArr);
            }
            if (i9 == 0) {
                return hk;
            }
            try {
                return new HK(bArr);
            } catch (C3295hL e9) {
                throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
            }
        }
        if (m4 instanceof CL) {
            CL cl = (CL) m4;
            JK jk = cl.f24105x;
            int f13 = m9.f() + jk.f();
            JK jk2 = cl.f24104w;
            if (f13 < 128) {
                int f14 = jk.f();
                int f15 = m9.f();
                int i10 = f14 + f15;
                byte[] bArr2 = new byte[i10];
                c(0, f14, jk.f());
                c(0, f14, i10);
                if (f14 > 0) {
                    jk.i(0, 0, f14, bArr2);
                }
                c(0, f15, m9.f());
                c(f14, i10, i10);
                if (f15 > 0) {
                    m9.i(0, f14, f15, bArr2);
                }
                if (i10 != 0) {
                    try {
                        hk = new HK(bArr2);
                    } catch (C3295hL e10) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
                    }
                }
                return new CL(jk2, hk);
            }
            if (jk2.p() > jk.p() && cl.f24107z > m9.p()) {
                return new CL(jk2, new CL(jk, m9));
            }
        }
        if (f10 >= CL.v(Math.max(m4.p(), m9.p()) + 1)) {
            return new CL(m4, m9);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        WC.g(m4, arrayDeque);
        WC.g(m9, arrayDeque);
        JK jk3 = (JK) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            jk3 = new CL((JK) arrayDeque.pop(), jk3);
        }
        return jk3;
    }

    public static HK s(byte[] bArr, int i, int i6) {
        try {
            return t(bArr, i, i6);
        } catch (C3295hL e9) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e9);
        }
    }

    public static HK t(byte[] bArr, int i, int i6) {
        if (i6 == 0) {
            return f25675u;
        }
        c(i, i + i6, bArr.length);
        byte[] bArr2 = new byte[i6];
        System.arraycopy(bArr, i, bArr2, 0, i6);
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
        return size == 0 ? f25675u : m(arrayList.iterator(), size);
    }

    public final byte[] a() {
        int f3 = f();
        if (f3 == 0) {
            return AbstractC3080dL.f29746a;
        }
        byte[] bArr = new byte[f3];
        i(0, 0, f3, bArr);
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
        int f3 = f();
        if (f3 != jk.f()) {
            return false;
        }
        if (f3 == 0) {
            return true;
        }
        int i = this.f25676n;
        int i6 = jk.f25676n;
        if (i == 0 || i6 == 0 || i == i6) {
            return l(jk);
        }
        return false;
    }

    public abstract int f();

    public abstract JK g(int i, int i6);

    public abstract JK h(int i, int i6);

    public final int hashCode() {
        int i = this.f25676n;
        if (i == 0) {
            int f3 = f();
            i = n(f3, 0, f3);
            if (i == 0) {
                i = 1;
            }
            this.f25676n = i;
        }
        return i;
    }

    public abstract void i(int i, int i6, int i9, byte[] bArr);

    public abstract ByteBuffer j();

    public abstract void k(OK ok);

    public abstract boolean l(JK jk);

    public abstract int n(int i, int i6, int i9);

    public abstract W7.b o();

    public abstract int p();

    public abstract boolean q();

    @Override // java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC4255zC iterator() {
        return new EK(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f3 = f();
        String b9 = f() <= 50 ? AbstractC3341iD.b(a()) : AbstractC3341iD.b(h(0, 47).a()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(f3);
        sb.append(" contents=\"");
        return u1.h.g(sb, b9, "\">");
    }
}
