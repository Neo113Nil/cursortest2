package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wn2 {
    public final int a;
    public final zm2 b;
    public final mm2 c;
    public final String d;

    public wn2(zm2 zm2Var, mm2 mm2Var, String str) {
        this.b = zm2Var;
        this.c = mm2Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{zm2Var, mm2Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wn2)) {
            return false;
        }
        wn2 wn2Var = (wn2) obj;
        return ooc.m(this.b, wn2Var.b) && ooc.m(this.c, wn2Var.c) && ooc.m(this.d, wn2Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
