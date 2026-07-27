package e8;

import a.AbstractC0422a;
import b8.InterfaceC0529a;

/* renamed from: e8.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4485q implements InterfaceC0529a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4485q f37312a = new C4485q();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37313b = new N("kotlin.time.Duration", c8.c.f5636j);

    @Override // b8.InterfaceC0529a
    public final void a(g8.q qVar, Object obj) {
        long j6;
        long j9;
        int f3;
        long j10 = ((R7.a) obj).f2761n;
        int i = R7.a.f2760w;
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z3 = true;
        if (j10 < 0) {
            j6 = ((-(j10 >> 1)) << 1) + (((int) j10) & 1);
            int i6 = R7.b.f2762a;
        } else {
            j6 = j10;
        }
        long f9 = R7.a.f(j6, R7.c.f2768y);
        if (R7.a.d(j6)) {
            j9 = 0;
            f3 = 0;
        } else {
            j9 = 0;
            f3 = (int) (R7.a.f(j6, R7.c.f2767x) % 60);
        }
        int f10 = R7.a.d(j6) ? 0 : (int) (R7.a.f(j6, R7.c.f2766w) % 60);
        int c9 = R7.a.c(j6);
        if (R7.a.d(j10)) {
            f9 = 9999999999999L;
        }
        boolean z6 = f9 != j9;
        boolean z9 = (f10 == 0 && c9 == 0) ? false : true;
        if (f3 == 0 && (!z9 || !z6)) {
            z3 = false;
        }
        if (z6) {
            sb.append(f9);
            sb.append('H');
        }
        if (z3) {
            sb.append(f3);
            sb.append('M');
        }
        if (z9 || (!z6 && !z3)) {
            R7.a.b(sb, f10, c9, 9, "S", true);
        }
        qVar.o(sb.toString());
    }

    @Override // b8.InterfaceC0529a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        int i = R7.a.f2760w;
        String value = decoder.g();
        kotlin.jvm.internal.h.e(value, "value");
        try {
            return new R7.a(AbstractC0422a.d(value));
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(D.y.o("Invalid ISO duration string format: '", value, "'."), e9);
        }
    }

    @Override // b8.InterfaceC0529a
    public final c8.e c() {
        return f37313b;
    }
}
