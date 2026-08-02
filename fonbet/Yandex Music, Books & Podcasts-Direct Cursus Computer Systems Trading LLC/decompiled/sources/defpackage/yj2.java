package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yj2 implements ak2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final jyr k;

    public yj2(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = z3;
        this.i = z4;
        this.j = str4 != null ? str4 : str2;
        this.k = btf.b(new ri1(24, this));
    }

    @Override // defpackage.ak2
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj2)) {
            return false;
        }
        yj2 yj2Var = (yj2) obj;
        return this.a.equals(yj2Var.a) && this.b.equals(yj2Var.b) && Intrinsics.d(this.c, yj2Var.c) && Intrinsics.d(this.d, yj2Var.d) && this.e == yj2Var.e && this.f == yj2Var.f && Intrinsics.d(this.g, yj2Var.g) && this.h == yj2Var.h && this.i == yj2Var.i;
    }

    public final int hashCode() {
        int c = k5r.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int e = k5r.e(k5r.e((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
        String str3 = this.g;
        return Boolean.hashCode(this.i) + k5r.e((e + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Video(videoUrl=", this.a, ", firstFrameUrl=", this.b, ", firstFrameBlurHash=");
        su4.v(m, this.c, ", lastFrameVideoUrl=", this.d, ", withSound=");
        dfi.t(m, this.e, ", withPersonalColor=", this.f, ", videoUuid=");
        m.append(this.g);
        m.append(", isLoop=");
        m.append(this.h);
        m.append(", canUseVideoIdForListSDK=");
        return ouj.r(m, this.i, ")");
    }
}
