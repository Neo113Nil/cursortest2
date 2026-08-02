package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ygd {
    public final String a;
    public final long b;
    public final Integer c;

    public ygd(String str, long j, Integer num) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygd)) {
            return false;
        }
        ygd ygdVar = (ygd) obj;
        return Intrinsics.d(this.a, ygdVar.a) && this.b == ygdVar.b && Intrinsics.d(this.c, ygdVar.c);
    }

    public final int hashCode() {
        int c = tlm.c(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Track(id=" + this.a + ", at=" + this.c + ")";
    }
}
