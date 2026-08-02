package defpackage;

/* loaded from: classes.dex */
public final class wiq extends xci implements epf {
    public hxo A;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public dup v;
    public boolean w;
    public long x;
    public long y;
    public int z;

    @Override // defpackage.xci
    public final boolean H0() {
        return false;
    }

    @Override // defpackage.epf
    public final lfh c(mfh mfhVar, ffh ffhVar, long j) {
        ksk M = ffhVar.M(j);
        return mfh.m0(mfhVar, M.a, M.b, new gcp(6, M, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.o);
        sb.append(", scaleY=");
        sb.append(this.p);
        sb.append(", alpha = ");
        sb.append(this.q);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.r);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.s);
        sb.append(", cameraDistance=");
        sb.append(this.t);
        sb.append(", transformOrigin=");
        sb.append((Object) a7t.d(this.u));
        sb.append(", shape=");
        sb.append(this.v);
        sb.append(", clip=");
        sb.append(this.w);
        sb.append(", renderEffect=null, ambientShadowColor=");
        dfi.q(this.x, ", spotShadowColor=", sb);
        dfi.q(this.y, ", compositingStrategy=", sb);
        sb.append((Object) ("CompositingStrategy(value=" + this.z + ')'));
        sb.append(')');
        return sb.toString();
    }
}
