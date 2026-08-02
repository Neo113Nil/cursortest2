package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class yr4 {
    public static final Logger b = Logger.getLogger(yr4.class.getName());
    public static final boolean c = dmt.e;
    public rp7 a;

    public static int a(int i, nn3 nn3Var) {
        int e = e(i);
        int size = nn3Var.size();
        return f(size) + size + e;
    }

    public static int b(int i) {
        return f((i >> 31) ^ (i << 1));
    }

    public static int c(long j) {
        return g((j >> 63) ^ (j << 1));
    }

    public static int d(String str) {
        int length;
        try {
            length = nut.b(str);
        } catch (kut unused) {
            length = str.getBytes(use.a).length;
        }
        return f(length) + length;
    }

    public static int e(int i) {
        return f(i << 3);
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int g(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A(int i);

    public abstract void B(int i, long j);

    public abstract void C(long j);

    public final void h(String str, kut kutVar) {
        b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) kutVar);
        byte[] bytes = str.getBytes(use.a);
        try {
            A(bytes.length);
            u(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new ur4(e);
        }
    }

    public abstract void i(byte b2);

    public abstract void j(int i, boolean z);

    public abstract void k(int i, byte[] bArr);

    public abstract void l(int i, nn3 nn3Var);

    public abstract void m(nn3 nn3Var);

    public abstract void n(int i, int i2);

    public abstract void o(int i);

    public abstract void p(int i, long j);

    public abstract void q(long j);

    public final void r(int i, vzh vzhVar, wto wtoVar) {
        y(i, 3);
        wtoVar.f(vzhVar, this.a);
        y(i, 4);
    }

    public abstract void s(int i, int i2);

    public abstract void t(int i);

    public abstract void u(byte[] bArr, int i, int i2);

    public abstract void v(vzh vzhVar);

    public abstract void w(int i, String str);

    public abstract void x(String str);

    public abstract void y(int i, int i2);

    public abstract void z(int i, int i2);
}
