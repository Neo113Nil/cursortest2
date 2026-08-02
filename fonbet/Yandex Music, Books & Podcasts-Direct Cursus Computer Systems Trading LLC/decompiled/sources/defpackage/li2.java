package defpackage;

import java.io.IOException;

/* loaded from: classes5.dex */
public class li2 implements d0, xge {
    public final int a;
    public final int b;
    public final x0 c;

    public li2(int i, int i2, x0 x0Var) {
        this.a = i;
        this.b = i2;
        this.c = x0Var;
    }

    public s0 m() {
        return this.c.S(this.a, this.b);
    }

    @Override // defpackage.d0
    public final s0 n() {
        try {
            return m();
        } catch (IOException e) {
            throw new q0(e.getMessage(), 0);
        }
    }
}
