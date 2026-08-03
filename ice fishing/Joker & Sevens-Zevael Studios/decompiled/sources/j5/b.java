package j5;

import b0.m0;
import m0.r;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements j {

    /* renamed from: g, reason: collision with root package name */
    public static final b f3532g = new b();

    @Override // j5.j
    public final void c(u0.d dVar, u0.d dVar2, r rVar, int i10) {
        int i11;
        rVar.Z(463960570);
        if ((i10 & 112) == 0) {
            i11 = (rVar.h(dVar2) ? 32 : 16) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 81) == 16 && rVar.B()) {
            rVar.S();
        } else {
            dVar2.invoke(rVar, Integer.valueOf((i11 >> 3) & 14));
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new m0(this, dVar, dVar2, i10, 2);
        }
    }

    @Override // j5.j
    public final void f(k5.a aVar) {
        pc.j.e(aVar, "screen");
    }
}
