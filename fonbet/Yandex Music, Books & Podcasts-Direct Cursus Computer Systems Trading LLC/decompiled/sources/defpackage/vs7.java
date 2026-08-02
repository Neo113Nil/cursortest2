package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class vs7 {
    public static final String c;
    public static final String d;
    public static final String e;
    public final int a;
    public final int[] b;

    static {
        int i = dvt.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public vs7(int[] iArr, int i) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vs7.class != obj.getClass()) {
            return false;
        }
        vs7 vs7Var = (vs7) obj;
        return this.a == vs7Var.a && Arrays.equals(this.b, vs7Var.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) + (this.a * 31)) * 31;
    }
}
