package com.gamericefishpro.space.o1;

import com.gamericefishpro.space.f2.u0;
import com.gamericefishpro.space.h2.x1;
import com.gamericefishpro.space.t0.y0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.gamericefishpro.space.h1.l implements com.gamericefishpro.space.h2.v, x1 {
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public long M;
    public k0 N;
    public boolean O;
    public long P;
    public long Q;
    public int R;
    public com.gamericefishpro.space.b2.d0 S;

    @Override // com.gamericefishpro.space.h2.v
    public final com.gamericefishpro.space.f2.m0 F(com.gamericefishpro.space.f2.n0 n0Var, com.gamericefishpro.space.f2.k0 k0Var, long j) {
        u0 u0VarE = k0Var.e(j);
        return n0Var.y(u0VarE.d, u0VarE.e, com.gamericefishpro.space.ph.m0.c(), new com.gamericefishpro.space.b2.t(11, u0VarE, this));
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final void L(com.gamericefishpro.space.o2.w wVar) {
        if (this.O) {
            com.gamericefishpro.space.o2.u.b(wVar, this.N);
        }
    }

    @Override // com.gamericefishpro.space.h2.x1
    public final boolean d() {
        return false;
    }

    @Override // com.gamericefishpro.space.h1.l
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.H);
        sb.append(", scaleY=");
        sb.append(this.I);
        sb.append(", alpha = ");
        sb.append(this.J);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.K);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.L);
        sb.append(", transformOrigin=");
        sb.append((Object) n0.d(this.M));
        sb.append(", shape=");
        sb.append(this.N);
        sb.append(", clip=");
        sb.append(this.O);
        sb.append(", renderEffect=null, ambientShadowColor=");
        y0.l(this.P, sb, ", spotShadowColor=");
        y0.l(this.Q, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) o.C(this.R));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
