package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ytp0 implements aup0 {
    public final boolean a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;

    public ytp0(long j, long j2, long j3, boolean z, boolean z2) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = z2;
        this.e = j3;
    }

    @Override // defpackage.aup0
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ytp0)) {
            return false;
        }
        ytp0 ytp0Var = (ytp0) obj;
        return this.a == ytp0Var.a && this.b == ytp0Var.b && this.c == ytp0Var.c && this.d == ytp0Var.d && this.e == ytp0Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + unr0.e(qv10.c(qv10.c(unr0.e(Boolean.hashCode(true) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressAware(isProgressAware=true, isProgressBarVisible=");
        sb.append(this.a);
        sb.append(", progressDuration=");
        sb.append(this.b);
        x4e.A(this.c, ", progressStartTime=", ", isTimerVisible=", sb);
        sb.append(this.d);
        sb.append(", timerStartTime=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
