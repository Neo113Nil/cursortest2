package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class csc {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final String e;
    public final String f;
    public final String g;

    public csc(int i, int i2, int i3, float f, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!csc.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        csc cscVar = (csc) obj;
        return this.a == cscVar.a && this.b == cscVar.b && this.c == cscVar.c && this.d == cscVar.d && Intrinsics.d(this.e, cscVar.e) && Intrinsics.d(this.f, cscVar.f) && Intrinsics.d(this.g, cscVar.g);
    }

    public final int hashCode() {
        int a = eta.a(((((this.a * 31) + this.b) * 31) + this.c) * 31, this.d, 31);
        String str = this.e;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(bitrate=");
        sb.append(this.c);
        sb.append(", width=");
        sb.append(this.a);
        sb.append(", height=");
        sb.append(this.b);
        sb.append(", frameRate=");
        sb.append(this.d);
        sb.append(", label=");
        sb.append(this.e);
        sb.append(", language=");
        sb.append(this.f);
        sb.append(", iso3Language=");
        return dfi.i(sb, this.g, ')');
    }
}
