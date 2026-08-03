package androidx.compose.animation;

import pc.j;
import s2.b;
import u.d0;
import u.e0;
import u.f0;
import u.g0;
import u.t;
import u.w;
import v.e1;
import x1.y0;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class EnterExitTransitionElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final e1 f487a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f488b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f489c;

    /* renamed from: d, reason: collision with root package name */
    public final oc.a f490d;

    /* renamed from: e, reason: collision with root package name */
    public final w f491e;

    public EnterExitTransitionElement(e1 e1Var, f0 f0Var, g0 g0Var, oc.a aVar, w wVar) {
        this.f487a = e1Var;
        this.f488b = f0Var;
        this.f489c = g0Var;
        this.f490d = aVar;
        this.f491e = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f487a.equals(enterExitTransitionElement.f487a) && this.f488b.equals(enterExitTransitionElement.f488b) && j.a(this.f489c, enterExitTransitionElement.f489c) && j.a(this.f490d, enterExitTransitionElement.f490d) && j.a(this.f491e, enterExitTransitionElement.f491e);
    }

    @Override // x1.y0
    public final m f() {
        e0 e0Var = new e0();
        e0Var.f6584u = this.f487a;
        e0Var.f6585v = this.f489c;
        e0Var.f6586w = this.f490d;
        e0Var.f6587x = this.f491e;
        e0Var.f6588y = t.f6640a;
        b.b(0, 0, 15);
        new d0(e0Var, 0);
        new d0(e0Var, 1);
        return e0Var;
    }

    @Override // x1.y0
    public final void g(m mVar) {
        e0 e0Var = (e0) mVar;
        e0Var.f6584u = this.f487a;
        e0Var.f6585v = this.f489c;
        e0Var.f6586w = this.f490d;
        e0Var.f6587x = this.f491e;
    }

    public final int hashCode() {
        return this.f491e.hashCode() + ((this.f490d.hashCode() + ((this.f489c.f6601a.hashCode() + ((this.f488b.f6597a.hashCode() + (this.f487a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f487a + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f488b + ", exit=" + this.f489c + ", isEnabled=" + this.f490d + ", graphicsLayerBlock=" + this.f491e + ')';
    }
}
