package hc;

import pc.t;
import pc.u;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i extends h implements pc.g {

    /* renamed from: g, reason: collision with root package name */
    public final int f2877g;

    public i(fc.d dVar) {
        super(dVar);
        this.f2877g = 2;
    }

    @Override // pc.g
    public final int getArity() {
        return this.f2877g;
    }

    @Override // hc.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f5684a.getClass();
        String a6 = u.a(this);
        pc.j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
