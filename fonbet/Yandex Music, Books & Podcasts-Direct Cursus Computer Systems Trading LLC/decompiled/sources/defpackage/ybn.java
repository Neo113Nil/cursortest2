package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ybn {
    public final List a;
    public final int b;
    public final boolean c;

    public ybn(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybn)) {
            return false;
        }
        ybn ybnVar = (ybn) obj;
        return Intrinsics.d(this.a, ybnVar.a) && this.b == ybnVar.b && this.c == ybnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f1d.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueState(queue=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", editEnabled=");
        return ouj.r(sb, this.c, ")");
    }
}
