package a8;

import a.AbstractC0415a;

/* renamed from: a8.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0450q implements X7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0450q f4497a = new C0450q();

    /* renamed from: b, reason: collision with root package name */
    public static final N f4498b = new N("kotlin.time.Duration", Y7.c.f4041o);

    @Override // X7.a
    public final void a(c8.r rVar, Object obj) {
        long j9;
        long j10;
        int f6;
        long j11 = ((N7.a) obj).f2201n;
        int i = N7.a.f2200w;
        StringBuilder sb = new StringBuilder();
        if (j11 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z8 = true;
        if (j11 < 0) {
            j9 = ((-(j11 >> 1)) << 1) + (((int) j11) & 1);
            int i4 = N7.b.f2202a;
        } else {
            j9 = j11;
        }
        long f9 = N7.a.f(j9, N7.c.f2208y);
        if (N7.a.d(j9)) {
            j10 = 0;
            f6 = 0;
        } else {
            j10 = 0;
            f6 = (int) (N7.a.f(j9, N7.c.f2207x) % 60);
        }
        int f10 = N7.a.d(j9) ? 0 : (int) (N7.a.f(j9, N7.c.f2206w) % 60);
        int c4 = N7.a.c(j9);
        if (N7.a.d(j11)) {
            f9 = 9999999999999L;
        }
        boolean z9 = f9 != j10;
        boolean z10 = (f10 == 0 && c4 == 0) ? false : true;
        if (f6 == 0 && (!z10 || !z9)) {
            z8 = false;
        }
        if (z9) {
            sb.append(f9);
            sb.append('H');
        }
        if (z8) {
            sb.append(f6);
            sb.append('M');
        }
        if (z10 || (!z9 && !z8)) {
            N7.a.b(sb, f10, c4, 9, "S", true);
        }
        rVar.o(sb.toString());
    }

    @Override // X7.a
    public final Object b(Z7.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        int i = N7.a.f2200w;
        String value = decoder.j();
        kotlin.jvm.internal.h.e(value, "value");
        try {
            return new N7.a(AbstractC0415a.b(value));
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(D.y.k("Invalid ISO duration string format: '", value, "'."), e6);
        }
    }

    @Override // X7.a
    public final Y7.e c() {
        return f4498b;
    }
}
