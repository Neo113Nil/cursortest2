package g8;

import D.G;
import N3.C;
import f8.AbstractC4526c;
import u7.C5087m;
import u7.C5089o;
import u7.C5091q;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class f extends C {

    /* renamed from: b, reason: collision with root package name */
    public final G f37739b;

    public f(G g9, AbstractC4526c json) {
        kotlin.jvm.internal.h.e(json, "json");
        this.f37739b = g9;
    }

    @Override // d8.a
    public final int c(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // N3.C, d8.b
    public final int e() {
        G g9 = this.f37739b;
        String j6 = g9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5089o t6 = Q3.b.t(j6);
            if (t6 != null) {
                return t6.f41066n;
            }
            Q7.q.c0(j6);
            throw null;
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'UInt' for input '", j6), 0, 6);
            throw null;
        }
    }

    @Override // N3.C, d8.b
    public final long j() {
        G g9 = this.f37739b;
        String j6 = g9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5091q u6 = Q3.b.u(j6);
            if (u6 != null) {
                return u6.f41068n;
            }
            Q7.q.c0(j6);
            throw null;
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'ULong' for input '", j6), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // N3.C, d8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte r() {
        C5087m c5087m;
        G g9 = this.f37739b;
        String j6 = g9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5089o t6 = Q3.b.t(j6);
            if (t6 != null) {
                int i = t6.f41066n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                    c5087m = new C5087m((byte) i);
                    if (c5087m == null) {
                        return c5087m.f41064n;
                    }
                    Q7.q.c0(j6);
                    throw null;
                }
            }
            c5087m = null;
            if (c5087m == null) {
            }
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'UByte' for input '", j6), 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[Catch: IllegalArgumentException -> 0x0032, TryCatch #0 {IllegalArgumentException -> 0x0032, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0021, B:10:0x002b, B:13:0x002e, B:14:0x0031), top: B:2:0x0007 }] */
    @Override // N3.C, d8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        u7.t tVar;
        G g9 = this.f37739b;
        String j6 = g9.j();
        try {
            kotlin.jvm.internal.h.e(j6, "<this>");
            C5089o t6 = Q3.b.t(j6);
            if (t6 != null) {
                int i = t6.f41066n;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    tVar = new u7.t((short) i);
                    if (tVar == null) {
                        return tVar.f41071n;
                    }
                    Q7.q.c0(j6);
                    throw null;
                }
            }
            tVar = null;
            if (tVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'UShort' for input '", j6), 0, 6);
            throw null;
        }
    }
}
