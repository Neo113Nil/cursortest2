package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class w820 {
    public final s820[] a;
    public final long b;

    public w820(List list) {
        this((s820[]) list.toArray(new s820[0]));
    }

    public final w820 a(s820... s820VarArr) {
        if (s820VarArr.length == 0) {
            return this;
        }
        int i = tw21.a;
        s820[] s820VarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(s820VarArr2, s820VarArr2.length + s820VarArr.length);
        System.arraycopy(s820VarArr, 0, copyOf, s820VarArr2.length, s820VarArr.length);
        return new w820(this.b, (s820[]) copyOf);
    }

    public final w820 b(w820 w820Var) {
        return w820Var == null ? this : a(w820Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w820.class == obj.getClass()) {
            w820 w820Var = (w820) obj;
            if (Arrays.equals(this.a, w820Var.a) && this.b == w820Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public w820(long j, s820... s820VarArr) {
        this.b = j;
        this.a = s820VarArr;
    }

    public w820(s820... s820VarArr) {
        this(-9223372036854775807L, s820VarArr);
    }
}
