package b0;

import m0.i1;
import m0.l1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f932a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f933b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f934c = new i1(-1);

    /* renamed from: d, reason: collision with root package name */
    public final i1 f935d = new i1(0);

    /* renamed from: e, reason: collision with root package name */
    public final l1 f936e = m0.z.s(null);

    /* renamed from: f, reason: collision with root package name */
    public final l1 f937f = m0.z.s(null);

    public z(Object obj, a0 a0Var) {
        this.f932a = obj;
        this.f933b = a0Var;
    }

    public final z a() {
        i1 i1Var = this.f935d;
        if (i1Var.g() == 0) {
            this.f933b.f797g.add(this);
            z zVar = (z) this.f937f.getValue();
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f936e.setValue(zVar);
        }
        i1Var.h(i1Var.g() + 1);
        return this;
    }

    public final void b() {
        i1 i1Var = this.f935d;
        if (i1Var.g() <= 0) {
            throw new IllegalStateException("Release should only be called once");
        }
        i1Var.h(i1Var.g() - 1);
        if (i1Var.g() == 0) {
            this.f933b.f797g.remove(this);
            l1 l1Var = this.f936e;
            z zVar = (z) l1Var.getValue();
            if (zVar != null) {
                zVar.b();
            }
            l1Var.setValue(null);
        }
    }
}
