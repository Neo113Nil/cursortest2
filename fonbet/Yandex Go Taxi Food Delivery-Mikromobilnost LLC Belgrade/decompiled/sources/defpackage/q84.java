package defpackage;

import android.util.Range;

/* loaded from: classes10.dex */
public final class q84 extends tmw0 {
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public q84(int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Range range, boolean z7) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        if (range == null) {
            ny61.t("Null getTargetFpsRange");
            throw null;
        }
        this.i = range;
        this.j = z7;
    }

    @Override // defpackage.tmw0
    public final int a() {
        return this.a;
    }

    @Override // defpackage.tmw0
    public final int b() {
        return this.c;
    }

    @Override // defpackage.tmw0
    public final Range c() {
        return this.i;
    }

    @Override // defpackage.tmw0
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.tmw0
    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tmw0)) {
            return false;
        }
        tmw0 tmw0Var = (tmw0) obj;
        return this.a == tmw0Var.a() && this.b == tmw0Var.d() && this.c == tmw0Var.b() && this.d == tmw0Var.g() && this.e == tmw0Var.i() && this.f == tmw0Var.f() && this.g == tmw0Var.e() && this.h == tmw0Var.j() && this.i.equals(tmw0Var.c()) && this.j == tmw0Var.h();
    }

    @Override // defpackage.tmw0
    public final boolean f() {
        return this.f;
    }

    @Override // defpackage.tmw0
    public final boolean g() {
        return this.d;
    }

    @Override // defpackage.tmw0
    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.j ? 1231 : 1237);
    }

    @Override // defpackage.tmw0
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.tmw0
    public final boolean j() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings{getCameraMode=");
        sb.append(this.a);
        sb.append(", hasVideoCapture=");
        sb.append(this.b);
        sb.append(", getRequiredMaxBitDepth=");
        sb.append(this.c);
        sb.append(", isPreviewStabilizationOn=");
        sb.append(this.d);
        sb.append(", isUltraHdrOn=");
        sb.append(this.e);
        sb.append(", isHighSpeedOn=");
        sb.append(this.f);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.g);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.h);
        sb.append(", getTargetFpsRange=");
        sb.append(this.i);
        sb.append(", isStrictFpsRequired=");
        return x4e.i(sb, this.j, "}");
    }
}
