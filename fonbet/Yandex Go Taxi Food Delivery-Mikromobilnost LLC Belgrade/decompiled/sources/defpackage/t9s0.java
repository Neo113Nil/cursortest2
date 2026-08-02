package defpackage;

import java.util.Set;

/* loaded from: classes14.dex */
public final class t9s0 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public t9s0(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean a(o8s0 o8s0Var, Set set) {
        return set.contains(this.a) || (((this.b < o8s0Var.a) && (this.c < o8s0Var.c)) && (this.d < o8s0Var.b));
    }
}
