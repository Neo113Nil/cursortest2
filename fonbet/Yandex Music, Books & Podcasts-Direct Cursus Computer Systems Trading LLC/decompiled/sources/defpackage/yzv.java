package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class yzv implements zzv {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final jzb e;
    public final String f;

    public yzv(jzb jzbVar, String str, String str2, String str3, String str4, boolean z) {
        dfi.s(str, str2, str3);
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = jzbVar;
        this.f = str4;
    }

    @Override // defpackage.zzv
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzv)) {
            return false;
        }
        yzv yzvVar = (yzv) obj;
        return this.a == yzvVar.a && Intrinsics.d(this.b, yzvVar.b) && Intrinsics.d(this.c, yzvVar.c) && Intrinsics.d(this.d, yzvVar.d) && this.e == yzvVar.e && Intrinsics.d(this.f, yzvVar.f);
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(k5r.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        jzb jzbVar = this.e;
        int hashCode = (c + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Playing(isMuted=");
        sb.append(this.a);
        sb.append(", artistId=");
        sb.append(this.b);
        sb.append(", trackId=");
        su4.v(sb, this.c, ", trackTitle=", this.d, ", explicitType=");
        sb.append(this.e);
        sb.append(", videoId=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
