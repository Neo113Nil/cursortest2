package defpackage;

import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class yzz0 {
    public static final yzz0 d = new yzz0(new xzz0[0]);
    public final int a;
    public final ImmutableList b;
    public int c;

    static {
        tw21.Q(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yzz0(xzz0... xzz0VarArr) {
        ImmutableList m = ImmutableList.m(xzz0VarArr);
        this.b = m;
        this.a = xzz0VarArr.length;
        int i = 0;
        while (i < m.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < m.size(); i3++) {
                if (((xzz0) m.get(i)).equals(m.get(i3))) {
                    lk91.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final xzz0 a(int i) {
        return (xzz0) this.b.get(i);
    }

    public final int b(xzz0 xzz0Var) {
        int indexOf = this.b.indexOf(xzz0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yzz0.class == obj.getClass()) {
            yzz0 yzz0Var = (yzz0) obj;
            if (this.a == yzz0Var.a && this.b.equals(yzz0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
