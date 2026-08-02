package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class w741 implements mm2 {
    public final int a;
    public final String b;

    public w741(v741 v741Var) {
        this.a = v741Var.a;
        this.b = v741Var.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w741) || !ooc.m(Integer.valueOf(this.a), Integer.valueOf(((w741) obj).a)) || !ooc.m(1, 1) || !ooc.m(null, null)) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        return ooc.m(bool, bool);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 1, null, Boolean.TRUE});
    }
}
