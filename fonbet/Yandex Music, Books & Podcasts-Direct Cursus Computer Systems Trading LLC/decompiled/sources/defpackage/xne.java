package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xne {
    public final int a;
    public final int b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xne(Map map, int i, int i2, int i3) {
        this(map, i, i2);
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        if ((i3 & 4) != 0) {
            map = e5b.a;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xne)) {
            return false;
        }
        xne xneVar = (xne) obj;
        return this.a == xneVar.a && this.b == xneVar.b && Intrinsics.d(this.c, xneVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1d.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsertedViewInfo(mainViewId=");
        sb.append(this.a);
        sb.append(", complexViewId=");
        sb.append(this.b);
        sb.append(", children=");
        return k5r.p(sb, this.c, ')');
    }

    public xne(Map map, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }
}
