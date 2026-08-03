package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f4777a;

    public u1(oc.a aVar) {
        this.f4777a = new y0(aVar);
    }

    public abstract v1 a(Object obj);

    public z2 b() {
        return this.f4777a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z2 c(v1 v1Var, z2 z2Var) {
        m0 m0Var = null;
        if (z2Var instanceof m0) {
            if (v1Var.f4787d) {
                m0Var = (m0) z2Var;
                m0Var.f4653a.setValue(v1Var.a());
            }
        } else if (z2Var instanceof y2) {
            if ((v1Var.f4785b || v1Var.f4788e != null) && !v1Var.f4787d) {
                y2 y2Var = (y2) z2Var;
                if (pc.j.a(v1Var.a(), y2Var.f4837a)) {
                    m0Var = y2Var;
                }
            }
        } else if (z2Var instanceof f0) {
            v1Var.getClass();
        }
        if (m0Var != null) {
            return m0Var;
        }
        if (!v1Var.f4787d) {
            return new y2(v1Var.a());
        }
        Object obj = v1Var.f4788e;
        r2 r2Var = v1Var.f4786c;
        if (r2Var == null) {
            r2Var = z0.f4844l;
        }
        return new m0(new l1(obj, r2Var));
    }
}
