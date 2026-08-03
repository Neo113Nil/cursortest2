package f1;

import b0.l0;
import x1.o0;
import x1.u1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h0 extends y0.m implements x1.w, u1 {
    public g0 A;
    public boolean B;
    public long C;
    public long D;
    public int E;
    public a0.a0 F;

    /* renamed from: u, reason: collision with root package name */
    public float f2255u;

    /* renamed from: v, reason: collision with root package name */
    public float f2256v;

    /* renamed from: w, reason: collision with root package name */
    public float f2257w;

    /* renamed from: x, reason: collision with root package name */
    public float f2258x;

    /* renamed from: y, reason: collision with root package name */
    public float f2259y;

    /* renamed from: z, reason: collision with root package name */
    public long f2260z;

    @Override // x1.w
    public final v1.f0 e(o0 o0Var, v1.d0 d0Var, long j3) {
        v1.j0 e10 = d0Var.e(j3);
        return o0Var.H(e10.f7085g, e10.f7086h, bc.w.f1068g, new l0(2, e10, this));
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // x1.u1
    public final boolean h() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f2255u);
        sb.append(", scaleY=");
        sb.append(this.f2256v);
        sb.append(", alpha = ");
        sb.append(this.f2257w);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f2258x);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f2259y);
        sb.append(", transformOrigin=");
        sb.append((Object) j0.d(this.f2260z));
        sb.append(", shape=");
        sb.append(this.A);
        sb.append(", clip=");
        sb.append(this.B);
        sb.append(", renderEffect=null, ambientShadowColor=");
        a4.d.q(this.C, sb, ", spotShadowColor=");
        a4.d.q(this.D, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) d0.w(this.E));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // x1.u1
    public final void I(e2.j jVar) {
    }
}
