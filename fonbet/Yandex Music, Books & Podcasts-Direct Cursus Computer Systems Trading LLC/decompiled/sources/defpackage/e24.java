package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e24 {
    public final String a;
    public final co6 b;
    public final qo6 c;
    public final Integer d;
    public final long e;

    public e24(String str, co6 co6Var, qo6 qo6Var, Integer num, long j) {
        str.getClass();
        co6Var.getClass();
        this.a = str;
        this.b = co6Var;
        this.c = qo6Var;
        this.d = num;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        return Intrinsics.d(this.a, e24Var.a) && Intrinsics.d(this.b, e24Var.b) && this.c == e24Var.c && Intrinsics.d(this.d, e24Var.d) && this.e == e24Var.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        return Long.hashCode(this.e) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarouselItemEntity(title=");
        sb.append(this.a);
        sb.append(", coverMeta=");
        sb.append(this.b);
        sb.append(", coverType=");
        sb.append(this.c);
        sb.append(", coverColorInt=");
        sb.append(this.d);
        sb.append(", timestamp=");
        return hrg.m(this.e, ")", sb);
    }
}
