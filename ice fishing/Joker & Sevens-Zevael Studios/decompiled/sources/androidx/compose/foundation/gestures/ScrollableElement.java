package androidx.compose.foundation.gestures;

import a4.d;
import pc.j;
import r1.z;
import w.w0;
import x.e;
import x.e0;
import x.k;
import x.s0;
import x.t0;
import x.z0;
import x1.f;
import x1.y0;
import y.i;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class ScrollableElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f513a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f514b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f515c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f516d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f517e;

    /* renamed from: f, reason: collision with root package name */
    public final k f518f;

    /* renamed from: g, reason: collision with root package name */
    public final i f519g;

    public ScrollableElement(w0 w0Var, k kVar, e0 e0Var, t0 t0Var, i iVar, boolean z10, boolean z11) {
        this.f513a = t0Var;
        this.f514b = e0Var;
        this.f515c = w0Var;
        this.f516d = z10;
        this.f517e = z11;
        this.f518f = kVar;
        this.f519g = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return j.a(this.f513a, scrollableElement.f513a) && this.f514b == scrollableElement.f514b && this.f515c.equals(scrollableElement.f515c) && this.f516d == scrollableElement.f516d && this.f517e == scrollableElement.f517e && j.a(this.f518f, scrollableElement.f518f) && j.a(this.f519g, scrollableElement.f519g);
    }

    @Override // x1.y0
    public final m f() {
        boolean z10 = this.f517e;
        return new s0(this.f515c, this.f518f, this.f514b, this.f513a, this.f519g, this.f516d, z10);
    }

    @Override // x1.y0
    public final void g(m mVar) {
        boolean z10;
        z zVar;
        s0 s0Var = (s0) mVar;
        z0 z0Var = s0Var.J;
        boolean z11 = s0Var.f7896y;
        boolean z12 = this.f516d;
        boolean z13 = true;
        boolean z14 = false;
        if (z11 != z12) {
            s0Var.K.f1000c = z12;
            s0Var.H.f7829u = z12;
            z10 = true;
        } else {
            z10 = false;
        }
        k kVar = this.f518f;
        k kVar2 = kVar == null ? s0Var.I : kVar;
        x4.i iVar = s0Var.G;
        t0 t0Var = z0Var.f7951a;
        t0 t0Var2 = this.f513a;
        if (!j.a(t0Var, t0Var2)) {
            z0Var.f7951a = t0Var2;
            z14 = true;
        }
        w0 w0Var = this.f515c;
        z0Var.f7952b = w0Var;
        e0 e0Var = z0Var.f7954d;
        e0 e0Var2 = this.f514b;
        if (e0Var != e0Var2) {
            z0Var.f7954d = e0Var2;
            z14 = true;
        }
        boolean z15 = z0Var.f7955e;
        boolean z16 = this.f517e;
        if (z15 != z16) {
            z0Var.f7955e = z16;
            z14 = true;
        }
        z0Var.f7953c = kVar2;
        z0Var.f7956f = iVar;
        x.i iVar2 = s0Var.L;
        iVar2.f7807u = e0Var2;
        iVar2.f7809w = z16;
        s0Var.E = w0Var;
        s0Var.F = kVar;
        e eVar = e.f7767i;
        e0 e0Var3 = z0Var.f7954d;
        e0 e0Var4 = e0.f7769g;
        if (e0Var3 != e0Var4) {
            e0Var4 = e0.f7770h;
        }
        s0Var.f7895x = eVar;
        if (s0Var.f7896y != z12) {
            s0Var.f7896y = z12;
            if (!z12) {
                s0Var.x0();
                z zVar2 = s0Var.D;
                if (zVar2 != null) {
                    s0Var.s0(zVar2);
                }
                s0Var.D = null;
            }
            z14 = true;
        }
        i iVar3 = s0Var.f7897z;
        i iVar4 = this.f519g;
        if (!j.a(iVar3, iVar4)) {
            s0Var.x0();
            s0Var.f7897z = iVar4;
        }
        if (s0Var.f7894w != e0Var4) {
            s0Var.f7894w = e0Var4;
        } else {
            z13 = z14;
        }
        if (z13 && (zVar = s0Var.D) != null) {
            zVar.s0();
        }
        if (z10) {
            s0Var.N = null;
            s0Var.O = null;
            f.o(s0Var);
        }
    }

    public final int hashCode() {
        int d10 = d.d(d.d((this.f515c.hashCode() + ((this.f514b.hashCode() + (this.f513a.hashCode() * 31)) * 31)) * 31, 31, this.f516d), 31, this.f517e);
        k kVar = this.f518f;
        int hashCode = (d10 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        i iVar = this.f519g;
        return (hashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
    }
}
