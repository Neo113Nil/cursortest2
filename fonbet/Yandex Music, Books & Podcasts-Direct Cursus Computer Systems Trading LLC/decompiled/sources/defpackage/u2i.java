package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class u2i {
    public final n2i[] a;
    public final long b;

    public u2i(List list) {
        this((n2i[]) list.toArray(new n2i[0]));
    }

    public final u2i a(n2i... n2iVarArr) {
        if (n2iVarArr.length == 0) {
            return this;
        }
        int i = dvt.a;
        n2i[] n2iVarArr2 = this.a;
        Object[] copyOf = Arrays.copyOf(n2iVarArr2, n2iVarArr2.length + n2iVarArr.length);
        System.arraycopy(n2iVarArr, 0, copyOf, n2iVarArr2.length, n2iVarArr.length);
        return new u2i(this.b, (n2i[]) copyOf);
    }

    public final u2i b(u2i u2iVar) {
        return u2iVar == null ? this : a(u2iVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u2i.class == obj.getClass()) {
            u2i u2iVar = (u2i) obj;
            if (Arrays.equals(this.a, u2iVar.a) && this.b == u2iVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return cb0.A(this.b) + (Arrays.hashCode(this.a) * 31);
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

    public u2i(long j, n2i... n2iVarArr) {
        this.b = j;
        this.a = n2iVarArr;
    }

    public u2i(n2i... n2iVarArr) {
        this(-9223372036854775807L, n2iVarArr);
    }
}
