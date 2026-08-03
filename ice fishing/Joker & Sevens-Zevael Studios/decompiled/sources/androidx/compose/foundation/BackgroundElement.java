package androidx.compose.foundation;

import f1.g0;
import f1.q;
import pc.j;
import w.i;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class BackgroundElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f492a;

    /* renamed from: b, reason: collision with root package name */
    public final float f493b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f494c;

    public BackgroundElement(long j3, g0 g0Var) {
        this.f492a = j3;
        this.f494c = g0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && q.c(this.f492a, backgroundElement.f492a) && this.f493b == backgroundElement.f493b && j.a(this.f494c, backgroundElement.f494c);
    }

    @Override // x1.y0
    public final m f() {
        i iVar = new i();
        iVar.f7436u = this.f492a;
        iVar.f7437v = this.f494c;
        iVar.f7438w = 9205357640488583168L;
        return iVar;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        i iVar = (i) mVar;
        iVar.f7436u = this.f492a;
        iVar.f7437v = this.f494c;
    }

    public final int hashCode() {
        int i10 = q.f2284i;
        return this.f494c.hashCode() + a4.d.b(this.f493b, Long.hashCode(this.f492a) * 961, 31);
    }
}
