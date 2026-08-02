package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public final class th71 extends ui81 {
    public final boolean b;
    public final boolean c;

    public th71() {
        this.b = false;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof th71)) {
            return false;
        }
        th71 th71Var = (th71) obj;
        return this.c == th71Var.c && this.b == th71Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public th71(boolean z) {
        this.b = true;
        this.c = z;
    }
}
