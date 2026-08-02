package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class qmh {
    public final int a;
    public final int[] b;

    static {
        tw21.Q(0);
        tw21.Q(1);
        tw21.Q(2);
    }

    public qmh(int i, int... iArr) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qmh.class != obj.getClass()) {
            return false;
        }
        qmh qmhVar = (qmh) obj;
        return this.a == qmhVar.a && Arrays.equals(this.b, qmhVar.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) + (this.a * 31)) * 31;
    }
}
