package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jvf {
    public final int a;
    public final Integer b;
    public final int c;
    public final int d;

    public jvf(int i, Integer num, int i2, int i3) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvf)) {
            return false;
        }
        jvf jvfVar = (jvf) obj;
        return this.a == jvfVar.a && Intrinsics.d(this.b, jvfVar.b) && this.c == jvfVar.c && this.d == jvfVar.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.d) + f1d.a(this.c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "LazyListVisibleItemsInfo(firstVisibleItemIndex=" + this.a + ", lastVisibleItemIndex=" + this.b + ", visibleItemCount=" + this.c + ", totalItemCount=" + this.d + ")";
    }
}
