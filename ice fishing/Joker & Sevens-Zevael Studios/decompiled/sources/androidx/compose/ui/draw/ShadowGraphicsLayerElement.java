package androidx.compose.ui.draw;

import a0.a0;
import a4.d;
import f1.g0;
import f1.q;
import pc.j;
import s2.f;
import x1.f1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f577a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f578b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f580d;

    /* renamed from: e, reason: collision with root package name */
    public final long f581e;

    public ShadowGraphicsLayerElement(float f10, g0 g0Var, boolean z10, long j3, long j6) {
        this.f577a = f10;
        this.f578b = g0Var;
        this.f579c = z10;
        this.f580d = j3;
        this.f581e = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return f.a(this.f577a, shadowGraphicsLayerElement.f577a) && j.a(this.f578b, shadowGraphicsLayerElement.f578b) && this.f579c == shadowGraphicsLayerElement.f579c && q.c(this.f580d, shadowGraphicsLayerElement.f580d) && q.c(this.f581e, shadowGraphicsLayerElement.f581e);
    }

    @Override // x1.y0
    public final m f() {
        return new f1.m(new a0(6, this));
    }

    @Override // x1.y0
    public final void g(m mVar) {
        f1.m mVar2 = (f1.m) mVar;
        mVar2.f2272u = new a0(6, this);
        f1 f1Var = x1.f.t(mVar2, 2).f8034v;
        if (f1Var != null) {
            f1Var.W0(mVar2.f2272u, true);
        }
    }

    public final int hashCode() {
        int d10 = d.d((this.f578b.hashCode() + (Float.hashCode(this.f577a) * 31)) * 31, 31, this.f579c);
        int i10 = q.f2284i;
        return Long.hashCode(this.f581e) + d.c(d10, 31, this.f580d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) f.b(this.f577a));
        sb.append(", shape=");
        sb.append(this.f578b);
        sb.append(", clip=");
        sb.append(this.f579c);
        sb.append(", ambientColor=");
        d.q(this.f580d, sb, ", spotColor=");
        sb.append((Object) q.i(this.f581e));
        sb.append(')');
        return sb.toString();
    }
}
