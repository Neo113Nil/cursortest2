package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class uv4 {
    public final int a;
    public final boolean b;

    public /* synthetic */ uv4(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uv4)) {
            return false;
        }
        uv4 uv4Var = (uv4) obj;
        return this.a == uv4Var.a && this.b == uv4Var.b && ooc.m(null, null) && ooc.m(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), null, null});
    }
}
