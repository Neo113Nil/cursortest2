package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class r801 {
    public static final r801 b = new r801(ImmutableList.p());
    public final ImmutableList a;

    static {
        tw21.Q(0);
    }

    public r801(List list) {
        this.a = ImmutableList.l(list);
    }

    public final ImmutableList a() {
        return this.a;
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.a;
            if (i2 >= immutableList.size()) {
                return false;
            }
            q801 q801Var = (q801) immutableList.get(i2);
            boolean[] zArr = q801Var.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (q801Var.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r801.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((r801) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
