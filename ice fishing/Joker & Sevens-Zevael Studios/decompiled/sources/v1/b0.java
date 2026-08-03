package v1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends i0 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7068h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7069i;

    public /* synthetic */ b0(int i10, Object obj) {
        this.f7068h = i10;
        this.f7069i = obj;
    }

    @Override // v1.i0
    public float b(m mVar) {
        float intBitsToFloat;
        int Z;
        switch (this.f7068h) {
            case 0:
                oc.e eVar = mVar.f7098a;
                if (eVar != null) {
                    return ((Number) eVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                x1.o0 o0Var = (x1.o0) this.f7069i;
                if (o0Var.f8126q) {
                    return Float.NaN;
                }
                x1.o0 o0Var2 = o0Var;
                while (true) {
                    m.n nVar = o0Var2.f8128s;
                    if (!Float.isNaN((nVar == null || (Z = bc.l.Z((m[]) nVar.f4389b, mVar)) < 0) ? Float.NaN : ((float[]) nVar.f4390c)[Z])) {
                        o0Var2.T(o0Var.i0(), mVar);
                        p g02 = o0Var2.g0();
                        p g03 = o0Var.g0();
                        switch (mVar.f7099b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (g03.h(g02, (Float.floatToRawIntBits(r3) & 4294967295L) | (Float.floatToRawIntBits(((int) (g02.E() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (g03.h(g02, (Float.floatToRawIntBits(r3) << 32) | (Float.floatToRawIntBits(((int) (g02.E() & 4294967295L)) / 2.0f) & 4294967295L)) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    x1.o0 k02 = o0Var2.k0();
                    if (k02 == null) {
                        o0Var2.T(o0Var.i0(), mVar);
                        return Float.NaN;
                    }
                    o0Var2 = k02;
                }
                break;
            default:
                return super.b(mVar);
        }
    }

    @Override // s2.c
    public final float c() {
        switch (this.f7068h) {
            case 0:
                return ((x1.o0) this.f7069i).c();
            default:
                return ((y1.r) this.f7069i).getDensity().c();
        }
    }

    @Override // v1.i0
    public final s2.l e() {
        switch (this.f7068h) {
            case 0:
                return ((x1.o0) this.f7069i).getLayoutDirection();
            default:
                return ((y1.r) this.f7069i).getLayoutDirection();
        }
    }

    @Override // v1.i0
    public final int f() {
        switch (this.f7068h) {
            case 0:
                return ((x1.o0) this.f7069i).K();
            default:
                return ((y1.r) this.f7069i).getRoot().J.f8103p.f7085g;
        }
    }

    @Override // s2.c
    public final float m() {
        switch (this.f7068h) {
            case 0:
                return ((x1.o0) this.f7069i).m();
            default:
                return ((y1.r) this.f7069i).getDensity().m();
        }
    }
}
