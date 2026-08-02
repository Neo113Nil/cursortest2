package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v63 implements x63 {
    public final lt a;
    public final mqs b;
    public final Integer c;
    public final Integer d;

    public v63(lt ltVar, mqs mqsVar, Integer num, Integer num2) {
        this.a = ltVar;
        this.b = mqsVar;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return false;
        }
        v63 v63Var = (v63) obj;
        return this.a.equals(v63Var.a) && Intrinsics.d(this.b, v63Var.b) && Intrinsics.d(this.c, v63Var.c) && Intrinsics.d(this.d, v63Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mqs mqsVar = this.b;
        int hashCode2 = (hashCode + (mqsVar == null ? 0 : mqsVar.a.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Album(album=" + this.a + ", track=" + this.b + ", durationTotal=" + this.c + ", durationLeft=" + this.d + ")";
    }
}
