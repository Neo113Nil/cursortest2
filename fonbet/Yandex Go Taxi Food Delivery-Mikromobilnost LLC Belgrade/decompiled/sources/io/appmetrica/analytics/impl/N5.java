package io.appmetrica.analytics.impl;

/* loaded from: classes9.dex */
public abstract class N5 {
    public final S5 a;
    public final String b = "[ComponentMigrationToV113]";

    public N5(S5 s5) {
        this.a = s5;
    }

    public final void a(int i) {
        if (b(i)) {
            c();
        }
    }

    public final String b() {
        return this.b;
    }

    public abstract boolean b(int i);

    public abstract void c();

    public final S5 a() {
        return this.a;
    }
}
