package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zsm {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public zsm(String str, boolean z, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsm)) {
            return false;
        }
        zsm zsmVar = (zsm) obj;
        return Intrinsics.d(this.a, zsmVar.a) && this.b == zsmVar.b && this.c == zsmVar.c && this.d == zsmVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = f1d.a(this.c, f1d.a(this.b, this.a.hashCode() * 31, 31), 31);
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", isDefaultProcess=");
        return dfi.j(sb, this.d, ')');
    }
}
