package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wta {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public wta(Integer num, Integer num2, Integer num3, String str) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wta)) {
            return false;
        }
        wta wtaVar = (wta) obj;
        return Intrinsics.d(this.a, wtaVar.a) && Intrinsics.d(this.b, wtaVar.b) && Intrinsics.d(this.c, wtaVar.c) && Intrinsics.d(this.d, wtaVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Theme(titleColor=" + this.a + ", subtitleColor=" + this.b + ", bgColor=" + this.c + ", bgUrl=" + this.d + ")";
    }
}
