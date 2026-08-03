package v0;

import ac.o;
import h2.u;
import java.util.Map;
import m0.l;
import m0.r;
import m0.v1;
import m0.x1;
import m0.x2;
import m0.z;
import m0.z0;
import s.g0;
import s.o0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final j f7035k = new j(new u(27), new nd.d(10));

    /* renamed from: g, reason: collision with root package name */
    public final Map f7036g;

    /* renamed from: h, reason: collision with root package name */
    public final g0 f7037h;

    /* renamed from: i, reason: collision with root package name */
    public e f7038i;

    /* renamed from: j, reason: collision with root package name */
    public final k2.e f7039j;

    public d(Map map) {
        this.f7036g = map;
        long[] jArr = o0.f6312a;
        this.f7037h = new g0();
        this.f7039j = new k2.e(10, this);
    }

    @Override // v0.c
    public final void a(Object obj, oc.e eVar, r rVar, int i10) {
        int i11;
        rVar.Z(533563200);
        if ((i10 & 6) == 0) {
            i11 = (rVar.h(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= rVar.h(eVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= rVar.h(this) ? 256 : 128;
        }
        int i12 = 1;
        if (rVar.P(i11 & 1, (i11 & 147) != 146)) {
            rVar.a0(obj);
            Object M = rVar.M();
            z0 z0Var = l.f4646a;
            if (M == z0Var) {
                k2.e eVar2 = this.f7039j;
                if (!((Boolean) eVar2.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f7036g.get(obj);
                x2 x2Var = g.f7043a;
                h hVar = new h(new f(map, eVar2));
                rVar.i0(hVar);
                M = hVar;
            }
            h hVar2 = (h) M;
            z.b(new v1[]{g.f7043a.a(hVar2), f4.a.f2312a.a(hVar2)}, eVar, rVar, (i11 & 112) | 8);
            boolean h10 = rVar.h(this) | rVar.h(obj) | rVar.h(hVar2);
            Object M2 = rVar.M();
            if (h10 || M2 == z0Var) {
                M2 = new e.e(this, obj, hVar2, i12);
                rVar.i0(M2);
            }
            z.d(o.f277a, (oc.c) M2, rVar);
            rVar.t();
        } else {
            rVar.S();
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new rd.r(this, obj, eVar, i10, 3);
        }
    }

    @Override // v0.c
    public final void b(Object obj) {
        if (this.f7037h.k(obj) == null) {
            this.f7036g.remove(obj);
        }
    }
}
