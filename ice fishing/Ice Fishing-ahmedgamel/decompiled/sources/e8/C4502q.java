package e8;

import b8.InterfaceC0537a;

/* renamed from: e8.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4502q implements InterfaceC0537a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4502q f37388a = new C4502q();

    /* renamed from: b, reason: collision with root package name */
    public static final N f37389b = new N("kotlin.time.Duration", c8.c.f5812j);

    @Override // b8.InterfaceC0537a
    public final void a(g8.q qVar, Object obj) {
        long j6;
        long j9;
        int f2;
        long j10 = ((R7.a) obj).f2888n;
        int i = R7.a.f2887w;
        StringBuilder sb = new StringBuilder();
        if (j10 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z6 = true;
        if (j10 < 0) {
            j6 = ((-(j10 >> 1)) << 1) + (((int) j10) & 1);
            int i4 = R7.b.f2889a;
        } else {
            j6 = j10;
        }
        long f9 = R7.a.f(j6, R7.c.f2895y);
        if (R7.a.d(j6)) {
            j9 = 0;
            f2 = 0;
        } else {
            j9 = 0;
            f2 = (int) (R7.a.f(j6, R7.c.f2894x) % 60);
        }
        int f10 = R7.a.d(j6) ? 0 : (int) (R7.a.f(j6, R7.c.f2893w) % 60);
        int c9 = R7.a.c(j6);
        if (R7.a.d(j10)) {
            f9 = 9999999999999L;
        }
        boolean z9 = f9 != j9;
        boolean z10 = (f10 == 0 && c9 == 0) ? false : true;
        if (f2 == 0 && (!z10 || !z9)) {
            z6 = false;
        }
        if (z9) {
            sb.append(f9);
            sb.append('H');
        }
        if (z6) {
            sb.append(f2);
            sb.append('M');
        }
        if (z10 || (!z9 && !z6)) {
            R7.a.b(sb, f10, c9, 9, "S", true);
        }
        qVar.o(sb.toString());
    }

    @Override // b8.InterfaceC0537a
    public final Object b(d8.b decoder) {
        kotlin.jvm.internal.h.e(decoder, "decoder");
        int i = R7.a.f2887w;
        String value = decoder.g();
        kotlin.jvm.internal.h.e(value, "value");
        try {
            return new R7.a(S0.f.a(value));
        } catch (IllegalArgumentException e9) {
            throw new IllegalArgumentException(D.x.l("Invalid ISO duration string format: '", value, "'."), e9);
        }
    }

    @Override // b8.InterfaceC0537a
    public final c8.e c() {
        return f37389b;
    }
}
