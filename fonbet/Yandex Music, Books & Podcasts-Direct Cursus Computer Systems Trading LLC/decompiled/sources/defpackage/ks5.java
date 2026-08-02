package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class ks5 extends zwj implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator[] a;

    public ks5(yl3 yl3Var, yl3 yl3Var2) {
        this.a = new Comparator[]{yl3Var, yl3Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ks5) {
            return Arrays.equals(this.a, ((ks5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return su4.o(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
