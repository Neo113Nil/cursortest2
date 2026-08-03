package k1;

import f8.c;
import l6.l;
import pc.j;
import x1.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public l f3595a;

    /* renamed from: b, reason: collision with root package name */
    public f1.l f3596b;

    /* renamed from: c, reason: collision with root package name */
    public float f3597c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public s2.l f3598d = s2.l.f6396g;

    public abstract void a(float f10);

    public abstract void b(f1.l lVar);

    public final void c(i0 i0Var, long j3, float f10, f1.l lVar) {
        h1.b bVar = i0Var.f8081g;
        if (this.f3597c != f10) {
            a(f10);
            this.f3597c = f10;
        }
        if (!j.a(this.f3596b, lVar)) {
            b(lVar);
            this.f3596b = lVar;
        }
        s2.l layoutDirection = i0Var.getLayoutDirection();
        if (this.f3598d != layoutDirection) {
            this.f3598d = layoutDirection;
        }
        int i10 = (int) (j3 >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (bVar.d() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j3 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((c) bVar.f2596h.f262h).p(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    e(i0Var);
                }
            } finally {
                ((c) bVar.f2596h.f262h).p(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long d();

    public abstract void e(i0 i0Var);
}
