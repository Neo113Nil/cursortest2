package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public final class y091 implements mm2 {
    public static final y091 c = new y091(new v091());
    public final boolean a;
    public final String b;

    public y091(v091 v091Var) {
        this.a = v091Var.a.booleanValue();
        this.b = v091Var.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y091)) {
            return false;
        }
        y091 y091Var = (y091) obj;
        return ooc.m(null, null) && this.a == y091Var.a && ooc.m(this.b, y091Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
