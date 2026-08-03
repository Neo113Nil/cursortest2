package pc;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i10) {
        this.arity = i10;
    }

    @Override // pc.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        t.f5684a.getClass();
        String a6 = u.a(this);
        j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
