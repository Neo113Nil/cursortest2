package androidx.compose.ui.graphics;

import a0.a0;
import a4.d;
import f1.d0;
import f1.g0;
import f1.h0;
import f1.j0;
import f1.q;
import pc.j;
import x1.f;
import x1.f1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class GraphicsLayerElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f584a;

    /* renamed from: b, reason: collision with root package name */
    public final float f585b;

    /* renamed from: c, reason: collision with root package name */
    public final float f586c;

    /* renamed from: d, reason: collision with root package name */
    public final long f587d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f588e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f589f;

    /* renamed from: g, reason: collision with root package name */
    public final long f590g;

    /* renamed from: h, reason: collision with root package name */
    public final long f591h;

    public GraphicsLayerElement(float f10, float f11, float f12, long j3, g0 g0Var, boolean z10, long j6, long j10) {
        this.f584a = f10;
        this.f585b = f11;
        this.f586c = f12;
        this.f587d = j3;
        this.f588e = g0Var;
        this.f589f = z10;
        this.f590g = j6;
        this.f591h = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f584a, graphicsLayerElement.f584a) == 0 && Float.compare(this.f585b, graphicsLayerElement.f585b) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f586c, graphicsLayerElement.f586c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && j0.a(this.f587d, graphicsLayerElement.f587d) && j.a(this.f588e, graphicsLayerElement.f588e) && this.f589f == graphicsLayerElement.f589f && q.c(this.f590g, graphicsLayerElement.f590g) && q.c(this.f591h, graphicsLayerElement.f591h);
    }

    @Override // x1.y0
    public final m f() {
        h0 h0Var = new h0();
        h0Var.f2255u = this.f584a;
        h0Var.f2256v = this.f585b;
        h0Var.f2257w = 1.0f;
        h0Var.f2258x = this.f586c;
        h0Var.f2259y = 8.0f;
        h0Var.f2260z = this.f587d;
        h0Var.A = this.f588e;
        h0Var.B = this.f589f;
        h0Var.C = this.f590g;
        h0Var.D = this.f591h;
        h0Var.E = 3;
        h0Var.F = new a0(11, h0Var);
        return h0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        h0 h0Var = (h0) mVar;
        h0Var.f2255u = this.f584a;
        h0Var.f2256v = this.f585b;
        h0Var.f2257w = 1.0f;
        h0Var.f2258x = this.f586c;
        h0Var.f2259y = 8.0f;
        h0Var.f2260z = this.f587d;
        h0Var.A = this.f588e;
        h0Var.B = this.f589f;
        h0Var.C = this.f590g;
        h0Var.D = this.f591h;
        h0Var.E = 3;
        f1 f1Var = f.t(h0Var, 2).f8034v;
        if (f1Var != null) {
            f1Var.W0(h0Var.F, true);
        }
    }

    public final int hashCode() {
        int b2 = d.b(8.0f, d.b(0.0f, d.b(0.0f, d.b(0.0f, d.b(this.f586c, d.b(0.0f, d.b(0.0f, d.b(1.0f, d.b(this.f585b, Float.hashCode(this.f584a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i10 = j0.f2267c;
        int d10 = d.d((this.f588e.hashCode() + d.c(b2, 31, this.f587d)) * 31, 961, this.f589f);
        int i11 = q.f2284i;
        return v.f.b(3, v.f.b(0, d.c(d.c(d10, 31, this.f590g), 31, this.f591h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.f584a);
        sb.append(", scaleY=");
        sb.append(this.f585b);
        sb.append(", alpha=1.0, translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f586c);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) j0.d(this.f587d));
        sb.append(", shape=");
        sb.append(this.f588e);
        sb.append(", clip=");
        sb.append(this.f589f);
        sb.append(", renderEffect=null, ambientShadowColor=");
        d.q(this.f590g, sb, ", spotShadowColor=");
        sb.append((Object) q.i(this.f591h));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) d0.w(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
