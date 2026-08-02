package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0t {
    public final zsb[] a;
    public int b;

    public q0t(zsb... zsbVarArr) {
        this.a = zsbVarArr;
        int length = zsbVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0t.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((q0t) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
