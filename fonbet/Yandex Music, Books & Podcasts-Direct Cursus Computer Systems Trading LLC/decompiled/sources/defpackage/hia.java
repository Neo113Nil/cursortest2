package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hia {
    public final String a;
    public final co6 b;
    public final qo6 c;
    public final Integer d;
    public final long e;

    public hia(String str, co6 co6Var, qo6 qo6Var, Integer num, long j) {
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
        if (!(obj instanceof hia)) {
            return false;
        }
        hia hiaVar = (hia) obj;
        return Intrinsics.d(this.a, hiaVar.a) && Intrinsics.d(this.b, hiaVar.b) && this.c == hiaVar.c && Intrinsics.d(this.d, hiaVar.d) && this.e == hiaVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Integer num = this.d;
        return Long.hashCode(this.e) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedSectionsBlockDataItem(title=");
        sb.append(this.a);
        sb.append(", coverMeta=");
        sb.append(this.b);
        sb.append(", coverType=");
        sb.append(this.c);
        sb.append(", coverColorInt=");
        sb.append(this.d);
        sb.append(", timestampMs=");
        return hrg.m(this.e, ")", sb);
    }
}
