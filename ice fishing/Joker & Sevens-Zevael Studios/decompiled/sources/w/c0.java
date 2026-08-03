package w;

import x1.h1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c0 extends y0.m implements x1.k, h1 {

    /* renamed from: u, reason: collision with root package name */
    public b0.z f7394u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f7395v;

    @Override // x1.h1
    public final void C() {
        pc.s sVar = new pc.s();
        x1.f.s(this, new c1.b(6, sVar, this));
        b0.z zVar = (b0.z) sVar.f5683g;
        if (this.f7395v) {
            b0.z zVar2 = this.f7394u;
            if (zVar2 != null) {
                zVar2.b();
            }
            if (zVar != null) {
                zVar.a();
            } else {
                zVar = null;
            }
            this.f7394u = zVar;
        }
    }

    @Override // y0.m
    public final boolean g0() {
        return false;
    }

    @Override // y0.m
    public final void l0() {
        b0.z zVar = this.f7394u;
        if (zVar != null) {
            zVar.b();
        }
        this.f7394u = null;
    }
}
