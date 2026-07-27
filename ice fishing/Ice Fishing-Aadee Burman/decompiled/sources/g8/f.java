package g8;

import D.H;
import f8.AbstractC4516c;
import u7.C5095m;
import u7.C5097o;
import u7.C5099q;

/* loaded from: classes2.dex */
public final class f extends X2.e {

    /* renamed from: h, reason: collision with root package name */
    public final H f37714h;

    public f(H h9, AbstractC4516c json) {
        kotlin.jvm.internal.h.e(json, "json");
        this.f37714h = h9;
    }

    @Override // d8.a
    public final int c(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // X2.e, d8.b
    public final int e() {
        H h9 = this.f37714h;
        String j6 = h9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5097o u3 = S0.f.u(j6);
            if (u3 != null) {
                return u3.f41343n;
            }
            Q7.q.M(j6);
            throw null;
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'UInt' for input '", j6), 0, 6);
            throw null;
        }
    }

    @Override // X2.e, d8.b
    public final long j() {
        H h9 = this.f37714h;
        String j6 = h9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5099q v9 = S0.f.v(j6);
            if (v9 != null) {
                return v9.f41345n;
            }
            Q7.q.M(j6);
            throw null;
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'ULong' for input '", j6), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // X2.e, d8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte r() {
        C5095m c5095m;
        H h9 = this.f37714h;
        String j6 = h9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5097o u3 = S0.f.u(j6);
            if (u3 != null) {
                int i = u3.f41343n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                    c5095m = new C5095m((byte) i);
                    if (c5095m == null) {
                        return c5095m.f41341n;
                    }
                    Q7.q.M(j6);
                    throw null;
                }
            }
            c5095m = null;
            if (c5095m == null) {
            }
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'UByte' for input '", j6), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // X2.e, d8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        u7.t tVar;
        H h9 = this.f37714h;
        String j6 = h9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5097o u3 = S0.f.u(j6);
            if (u3 != null) {
                int i = u3.f41343n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    tVar = new u7.t((short) i);
                    if (tVar == null) {
                        return tVar.f41348n;
                    }
                    Q7.q.M(j6);
                    throw null;
                }
            }
            tVar = null;
            if (tVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'UShort' for input '", j6), 0, 6);
            throw null;
        }
    }
}
