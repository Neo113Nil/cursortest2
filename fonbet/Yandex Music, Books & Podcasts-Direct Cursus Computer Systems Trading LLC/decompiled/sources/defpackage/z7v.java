package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z7v {
    public static final z7v f = new z7v(c5b.a, false);
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;

    public z7v(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        boolean isEmpty = list.isEmpty();
        this.c = isEmpty;
        this.d = !isEmpty;
        this.e = list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7v)) {
            return false;
        }
        z7v z7vVar = (z7v) obj;
        return Intrinsics.d(this.a, z7vVar.a) && this.b == z7vVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveWordsPrecalculations(lines=" + this.a + ", truncated=" + this.b + ")";
    }
}
