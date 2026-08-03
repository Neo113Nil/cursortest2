package hc;

import pc.t;
import pc.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class j extends c implements pc.g {
    private final int arity;

    public j(int i10, fc.d dVar) {
        super(dVar);
        this.arity = i10;
    }

    @Override // pc.g
    public int getArity() {
        return this.arity;
    }

    @Override // hc.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f5684a.getClass();
        String a6 = u.a(this);
        pc.j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
