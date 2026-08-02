package defpackage;

import java.util.TreeSet;

/* loaded from: classes10.dex */
public final class uil0 {
    public final TreeSet a = new TreeSet(new y60(24));
    public int b;
    public int c;
    public boolean d;

    public uil0() {
        d();
    }

    public static int b(int i, int i2) {
        int min;
        int i3 = i - i2;
        return (Math.abs(i3) <= 1000 || (min = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) ? i3 : i < i2 ? min : -min;
    }

    public final synchronized void a(til0 til0Var) {
        this.b = til0Var.a.c;
        this.a.add(til0Var);
    }

    public final synchronized sil0 c(long j) {
        if (this.a.isEmpty()) {
            return null;
        }
        til0 til0Var = (til0) this.a.first();
        int i = til0Var.a.c;
        if (i != sil0.a(this.c) && j < til0Var.b) {
            return null;
        }
        this.a.pollFirst();
        this.c = i;
        return til0Var.a;
    }

    public final synchronized void d() {
        this.a.clear();
        this.d = false;
        this.c = -1;
        this.b = -1;
    }
}
