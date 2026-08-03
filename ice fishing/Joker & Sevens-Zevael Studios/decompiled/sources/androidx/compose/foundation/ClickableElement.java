package androidx.compose.foundation;

import e2.g;
import pc.j;
import w.b0;
import w.o0;
import w.q;
import w.z;
import x1.f;
import x1.l;
import x1.y0;
import y.i;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
final class ClickableElement extends y0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f498a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f499b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f500c;

    /* renamed from: d, reason: collision with root package name */
    public final g f501d;

    /* renamed from: e, reason: collision with root package name */
    public final oc.a f502e;

    public ClickableElement(i iVar, o0 o0Var, boolean z10, g gVar, oc.a aVar) {
        this.f498a = iVar;
        this.f499b = o0Var;
        this.f500c = z10;
        this.f501d = gVar;
        this.f502e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return j.a(this.f498a, clickableElement.f498a) && j.a(this.f499b, clickableElement.f499b) && this.f500c == clickableElement.f500c && j.a(this.f501d, clickableElement.f501d) && this.f502e == clickableElement.f502e;
    }

    @Override // x1.y0
    public final m f() {
        return new q(this.f498a, this.f499b, this.f500c, this.f501d, this.f502e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r8.E == null) goto L35;
     */
    @Override // x1.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(m mVar) {
        boolean z10;
        l lVar;
        q qVar = (q) mVar;
        z zVar = qVar.B;
        b0 b0Var = qVar.C;
        i iVar = qVar.J;
        i iVar2 = this.f498a;
        boolean z11 = true;
        boolean z12 = false;
        if (j.a(iVar, iVar2)) {
            z10 = false;
        } else {
            qVar.u0();
            qVar.J = iVar2;
            qVar.f7483w = iVar2;
            z10 = true;
        }
        o0 o0Var = qVar.f7484x;
        o0 o0Var2 = this.f499b;
        if (!j.a(o0Var, o0Var2)) {
            qVar.f7484x = o0Var2;
            z10 = true;
        }
        boolean z13 = qVar.f7486z;
        boolean z14 = this.f500c;
        if (z13 != z14) {
            if (z14) {
                qVar.r0(zVar);
                qVar.r0(b0Var);
            } else {
                qVar.s0(zVar);
                qVar.s0(b0Var);
                qVar.u0();
            }
            f.o(qVar);
            qVar.f7486z = z14;
        }
        g gVar = qVar.f7485y;
        g gVar2 = this.f501d;
        if (!j.a(gVar, gVar2)) {
            qVar.f7485y = gVar2;
            f.o(qVar);
        }
        qVar.A = this.f502e;
        boolean z15 = qVar.K;
        i iVar3 = qVar.J;
        if (z15 != (iVar3 == null && qVar.f7484x != null)) {
            if (iVar3 == null && qVar.f7484x != null) {
                z12 = true;
            }
            qVar.K = z12;
            if (!z12) {
            }
        }
        z11 = z10;
        if (z11 && ((lVar = qVar.E) != null || !qVar.K)) {
            if (lVar != null) {
                qVar.s0(lVar);
            }
            qVar.E = null;
            qVar.v0();
        }
        b0Var.u0(qVar.f7483w);
    }

    public final int hashCode() {
        i iVar = this.f498a;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        o0 o0Var = this.f499b;
        int d10 = a4.d.d((hashCode + (o0Var != null ? o0Var.hashCode() : 0)) * 31, 961, this.f500c);
        g gVar = this.f501d;
        return this.f502e.hashCode() + ((d10 + (gVar != null ? Integer.hashCode(gVar.f1956a) : 0)) * 31);
    }
}
