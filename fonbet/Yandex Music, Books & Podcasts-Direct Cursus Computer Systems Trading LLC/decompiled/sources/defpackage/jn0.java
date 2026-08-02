package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jn0 {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ jn0(Object obj, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, obj, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
    }

    public final ln0 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            tme.c("Item.end should be set first");
        }
        return new ln0(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0)) {
            return false;
        }
        jn0 jn0Var = (jn0) obj;
        return Intrinsics.d(this.a, jn0Var.a) && this.b == jn0Var.b && this.c == jn0Var.c && Intrinsics.d(this.d, jn0Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + f1d.a(this.c, f1d.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return dfi.i(sb, this.d, ')');
    }

    public jn0(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
