package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class onq {
    public final String a;
    public final Integer b;

    public onq(String str) {
        this.a = str;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onq)) {
            return false;
        }
        onq onqVar = (onq) obj;
        return Intrinsics.d(this.a, onqVar.a) && Intrinsics.d(this.b, onqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SkeletonBlockSource(uri=" + this.a + ", count=" + this.b + ")";
    }

    public onq(String str, Integer num) {
        this.a = str;
        this.b = num;
    }
}
