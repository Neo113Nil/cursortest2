package b0;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class x implements v1.g0 {

    /* renamed from: g, reason: collision with root package name */
    public final s f926g;

    /* renamed from: h, reason: collision with root package name */
    public final v1.t0 f927h;

    /* renamed from: i, reason: collision with root package name */
    public final a0.i f928i;

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f929j = new HashMap();

    public x(s sVar, v1.t0 t0Var) {
        this.f926g = sVar;
        this.f927h = t0Var;
        this.f928i = (a0.i) sVar.f886b.invoke();
    }

    @Override // s2.c
    public final float B(long j3) {
        return this.f927h.B(j3);
    }

    @Override // s2.c
    public final int D(float f10) {
        return this.f927h.D(f10);
    }

    @Override // v1.g0
    public final v1.f0 H(int i10, int i11, Map map, oc.c cVar) {
        return this.f927h.H(i10, i11, map, cVar);
    }

    @Override // s2.c
    public final long L(long j3) {
        return this.f927h.L(j3);
    }

    @Override // s2.c
    public final float N(long j3) {
        return this.f927h.N(j3);
    }

    @Override // v1.g0
    public final v1.f0 R(int i10, int i11, Map map, oc.c cVar, oc.c cVar2) {
        return this.f927h.R(i10, i11, map, cVar, cVar2);
    }

    @Override // s2.c
    public final long U(float f10) {
        return this.f927h.U(f10);
    }

    @Override // s2.c
    public final float c() {
        return this.f927h.c();
    }

    @Override // s2.c
    public final float d0(float f10) {
        return this.f927h.d0(f10);
    }

    @Override // v1.g0
    public final s2.l getLayoutDirection() {
        return this.f927h.getLayoutDirection();
    }

    @Override // s2.c
    public final float m() {
        return this.f927h.m();
    }

    @Override // v1.g0
    public final boolean t() {
        return this.f927h.t();
    }

    @Override // s2.c
    public final long v(float f10) {
        return this.f927h.v(f10);
    }

    @Override // s2.c
    public final float x(float f10) {
        return this.f927h.x(f10);
    }
}
