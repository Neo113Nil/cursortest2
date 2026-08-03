package b0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements w1.e {

    /* renamed from: e, reason: collision with root package name */
    public static final k f849e = new k();

    /* renamed from: a, reason: collision with root package name */
    public final a0.e f850a;

    /* renamed from: b, reason: collision with root package name */
    public final j f851b;

    /* renamed from: c, reason: collision with root package name */
    public final s2.l f852c;

    /* renamed from: d, reason: collision with root package name */
    public final x.e0 f853d;

    public m(a0.e eVar, j jVar, s2.l lVar, x.e0 e0Var) {
        this.f850a = eVar;
        this.f851b = jVar;
        this.f852c = lVar;
        this.f853d = e0Var;
    }

    public final boolean f(i iVar, int i10) {
        x.e0 e0Var = this.f853d;
        if (i10 == 5 || i10 == 6) {
            if (e0Var == x.e0.f7770h) {
                return false;
            }
        } else if (i10 == 3 || i10 == 4) {
            if (e0Var == x.e0.f7769g) {
                return false;
            }
        } else if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (g(i10)) {
            if (iVar.f832b >= this.f850a.f41a.g().f115m - 1) {
                return false;
            }
        } else if (iVar.f831a <= 0) {
            return false;
        }
        return true;
    }

    public final boolean g(int i10) {
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 != 6) {
                    s2.l lVar = this.f852c;
                    if (i10 == 3) {
                        int ordinal = lVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new ac.d();
                            }
                        }
                    } else {
                        if (i10 != 4) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                        }
                        int ordinal2 = lVar.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new ac.d();
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // w1.e
    public final w1.g getKey() {
        return v1.f.f7076a;
    }

    @Override // w1.e
    public final Object getValue() {
        return this;
    }
}
