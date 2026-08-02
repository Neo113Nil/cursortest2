package defpackage;

/* loaded from: classes10.dex */
public final class xt3 {
    public final long a;
    public final long b;
    public final long c;

    public xt3(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        long j4 = sty0.c;
        if (sty0.a(j, j4)) {
            ny61.g("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for minFontSize. Try using other values e.g. 10.sp");
            throw null;
        }
        if (sty0.a(j2, j4)) {
            ny61.g("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for maxFontSize. Try using other values e.g. 100.sp");
            throw null;
        }
        if (sty0.a(j3, j4)) {
            ny61.g("AutoSize.StepBased: TextUnit.Unspecified is not a valid value for stepSize. Try using other values e.g. 0.25.sp");
            throw null;
        }
        if (tty0.a(sty0.b(j), sty0.b(j2))) {
            uh6.h(j, j2);
            if (Float.compare(sty0.c(j), sty0.c(j2)) > 0) {
                this.a = j2;
            }
        }
        if (tty0.a(sty0.b(j3), 4294967296L)) {
            long K = uh6.K(1.0E-4f, 4294967296L);
            uh6.h(j3, K);
            if (Float.compare(sty0.c(j3), sty0.c(K)) < 0) {
                ny61.g("AutoSize.StepBased: stepSize must be greater than or equal to 0.0001f.sp");
                throw null;
            }
        }
        if (sty0.c(this.a) < 0.0f) {
            ny61.g("AutoSize.StepBased: minFontSize must not be negative");
            throw null;
        }
        if (sty0.c(j2) >= 0.0f) {
            return;
        }
        ny61.g("AutoSize.StepBased: maxFontSize must not be negative");
        throw null;
    }

    public static boolean a(dry0 dry0Var) {
        cry0 cry0Var = dry0Var.a;
        int i = cry0Var.f;
        if (i == 1 || i == 3) {
            return dry0Var.e() || dry0Var.d();
        }
        if (i != 4 && i != 5 && i != 2) {
            vg10.i("TextOverflow type ", rnb1.b(cry0Var.f), " is not supported.");
            return false;
        }
        int i2 = dry0Var.b.f;
        if (i2 != 0) {
            if (i2 == 1) {
                return dry0Var.o(0);
            }
            if (i == 4 || i == 5) {
                return dry0Var.e() || dry0Var.d();
            }
            if (i == 2) {
                return dry0Var.o(i2 - 1);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof xt3)) {
            return false;
        }
        xt3 xt3Var = (xt3) obj;
        return sty0.a(xt3Var.a, this.a) && sty0.a(xt3Var.b, this.b) && sty0.a(xt3Var.c, this.c);
    }

    public final int hashCode() {
        tty0[] tty0VarArr = sty0.b;
        return Long.hashCode(this.c) + qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
