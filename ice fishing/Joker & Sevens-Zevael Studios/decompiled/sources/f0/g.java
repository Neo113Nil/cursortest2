package f0;

import b0.p0;
import c1.h;
import e2.i;
import e2.j;
import e2.s;
import e2.u;
import e2.v;
import f1.d0;
import f1.f0;
import f1.o;
import f1.q;
import h2.a0;
import h2.h0;
import h2.p;
import h2.z;
import i2.k;
import java.util.LinkedHashMap;
import java.util.Map;
import r2.l;
import v1.j0;
import x1.i0;
import x1.n;
import x1.o0;
import x1.u1;
import x1.w;
import y0.m;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends m implements w, n, u1 {
    public int A;
    public Map B;
    public d C;
    public f D;
    public e E;

    /* renamed from: u, reason: collision with root package name */
    public String f2206u;

    /* renamed from: v, reason: collision with root package name */
    public h0 f2207v;

    /* renamed from: w, reason: collision with root package name */
    public k2.d f2208w;

    /* renamed from: x, reason: collision with root package name */
    public int f2209x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2210y;

    /* renamed from: z, reason: collision with root package name */
    public int f2211z;

    @Override // x1.u1
    public final void I(j jVar) {
        f fVar = this.D;
        if (fVar == null) {
            fVar = new f(this, 0);
            this.D = fVar;
        }
        h2.e eVar = new h2.e(this.f2206u);
        vc.c[] cVarArr = u.f2053a;
        jVar.d(s.f2049y, i7.b.z(eVar));
        e eVar2 = this.E;
        if (eVar2 != null) {
            boolean z10 = eVar2.f2202c;
            v vVar = s.A;
            vc.c[] cVarArr2 = u.f2053a;
            vc.c cVar = cVarArr2[16];
            vVar.a(jVar, Boolean.valueOf(z10));
            h2.e eVar3 = new h2.e(eVar2.f2201b);
            v vVar2 = s.f2050z;
            vc.c cVar2 = cVarArr2[15];
            vVar2.a(jVar, eVar3);
        }
        jVar.d(i.f1969k, new e2.a(null, new f(this, 1)));
        jVar.d(i.f1970l, new e2.a(null, new f(this, 2)));
        jVar.d(i.f1971m, new e2.a(null, new p0(3, this)));
        jVar.d(i.f1959a, new e2.a(null, fVar));
    }

    @Override // x1.n
    public final void b(i0 i0Var) {
        d r02;
        if (this.f8456t) {
            e eVar = this.E;
            if (eVar == null || !eVar.f2202c || (r02 = eVar.f2203d) == null) {
                r02 = r0();
                r02.b(i0Var);
            } else {
                r02.b(i0Var);
            }
            h2.a aVar = r02.f2193j;
            if (aVar == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.C + ", textSubstitution=" + this.E + ')').toString());
            }
            o t3 = i0Var.f8081g.f2596h.t();
            boolean z10 = r02.f2194k;
            if (z10) {
                long j3 = r02.f2195l;
                t3.k();
                t3.d(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            try {
                a0 a0Var = this.f2207v.f2674a;
                l lVar = a0Var.f2624m;
                if (lVar == null) {
                    lVar = l.f6032b;
                }
                f0 f0Var = a0Var.f2625n;
                if (f0Var == null) {
                    f0Var = f0.f2248d;
                }
                h1.c cVar = a0Var.f2626o;
                if (cVar == null) {
                    cVar = h1.f.f2601b;
                }
                d0 c3 = a0Var.f2612a.c();
                if (c3 != null) {
                    float a6 = this.f2207v.f2674a.f2612a.a();
                    o2.e eVar2 = aVar.f2606a.f5159g;
                    int i10 = eVar2.f5167c;
                    eVar2.c(c3, (Float.floatToRawIntBits(aVar.b()) & 4294967295L) | (Float.floatToRawIntBits(aVar.c()) << 32), a6);
                    eVar2.f(f0Var);
                    eVar2.g(lVar);
                    eVar2.e(cVar);
                    eVar2.b(3);
                    aVar.d(t3);
                    eVar2.b(i10);
                } else {
                    long j6 = q.f2283h;
                    if (j6 == 16) {
                        j6 = this.f2207v.b() != 16 ? this.f2207v.b() : q.f2277b;
                    }
                    o2.e eVar3 = aVar.f2606a.f5159g;
                    int i11 = eVar3.f5167c;
                    eVar3.d(j6);
                    eVar3.f(f0Var);
                    eVar3.g(lVar);
                    eVar3.e(cVar);
                    eVar3.b(3);
                    aVar.d(t3);
                    eVar3.b(i11);
                }
                if (z10) {
                    t3.g();
                }
            } catch (Throwable th) {
                if (z10) {
                    t3.g();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0150, code lost:
    
        if (r4.f2609d.f3136d != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0289  */
    @Override // x1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v1.f0 e(o0 o0Var, v1.d0 d0Var, long j3) {
        d r02;
        long j6;
        p pVar;
        long j10;
        boolean z10;
        p pVar2;
        int i10;
        e eVar = this.E;
        if (eVar == null || !eVar.f2202c || (r02 = eVar.f2203d) == null) {
            r02 = r0();
            r02.b(o0Var);
        } else {
            r02.b(o0Var);
        }
        s2.l layoutDirection = o0Var.getLayoutDirection();
        if (r02.f2190g > 1) {
            b bVar = r02.f2196m;
            h0 h0Var = r02.f2185b;
            s2.c cVar = r02.f2192i;
            pc.j.b(cVar);
            k2.d dVar = r02.f2186c;
            if ((bVar == null || layoutDirection != bVar.f2175a || !pc.j.a(h0Var, bVar.f2176b) || cVar.c() != bVar.f2177c.c() || dVar != bVar.f2178d) && ((bVar = b.f2174h) == null || layoutDirection != bVar.f2175a || !pc.j.a(h0Var, bVar.f2176b) || cVar.c() != bVar.f2177c.c() || dVar != bVar.f2178d)) {
                bVar = new b(layoutDirection, z.e(h0Var, layoutDirection), cVar, dVar);
                b.f2174h = bVar;
            }
            r02.f2196m = bVar;
            int i11 = r02.f2190g;
            float f10 = bVar.f2181g;
            float f11 = bVar.f2180f;
            if (Float.isNaN(f10) || Float.isNaN(f11)) {
                float b2 = z.a(c.f2182a, bVar.f2179e, s2.b.b(0, 0, 15), bVar.f2177c, bVar.f2178d, 1).b();
                float b10 = z.a(c.f2183b, bVar.f2179e, s2.b.b(0, 0, 15), bVar.f2177c, bVar.f2178d, 2).b() - b2;
                bVar.f2181g = b2;
                bVar.f2180f = b10;
                f11 = b10;
                f10 = b2;
            }
            if (i11 != 1) {
                int round = Math.round((f11 * (i11 - 1)) + f10);
                i10 = round >= 0 ? round : 0;
                int g8 = s2.a.g(j3);
                if (i10 > g8) {
                    i10 = g8;
                }
            } else {
                i10 = s2.a.i(j3);
            }
            j6 = s2.b.a(s2.a.j(j3), s2.a.h(j3), i10, s2.a.g(j3));
        } else {
            j6 = j3;
        }
        h2.a aVar = r02.f2193j;
        if (aVar != null && (pVar = r02.f2197n) != null && !pVar.c() && layoutDirection == r02.f2198o) {
            if (s2.a.b(j6, r02.f2199p)) {
                j10 = 4294967295L;
            } else {
                j10 = 4294967295L;
                if (s2.a.h(j6) == s2.a.h(r02.f2199p)) {
                    if (s2.a.g(j6) >= aVar.b()) {
                    }
                }
            }
            if (!s2.a.b(j6, r02.f2199p)) {
                h2.a aVar2 = r02.f2193j;
                pc.j.b(aVar2);
                long d10 = s2.b.d(j6, i7.b.e(x4.f.z(Math.min(aVar2.f2606a.f5161i.c(), aVar2.c())), x4.f.z(aVar2.b())));
                r02.f2195l = d10;
                r02.f2194k = r02.f2187d != 3 && (((float) ((int) (d10 >> 32))) < aVar2.c() || ((float) ((int) (d10 & j10))) < aVar2.b());
                r02.f2199p = j6;
            }
            z10 = false;
            pVar2 = r02.f2197n;
            if (pVar2 != null) {
                pVar2.c();
            }
            h2.a aVar3 = r02.f2193j;
            pc.j.b(aVar3);
            k kVar = aVar3.f2609d;
            long j11 = r02.f2195l;
            if (z10) {
                x1.f.t(this, 2).I0();
                Map map = this.B;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(v1.c.f7070a, Integer.valueOf(Math.round(kVar.c(0))));
                map.put(v1.c.f7071b, Integer.valueOf(Math.round(kVar.c(kVar.f3138f - 1))));
                this.B = map;
            }
            int i12 = (int) (j11 >> 32);
            int i13 = (int) (j11 & j10);
            j0 e10 = d0Var.e(bc.a0.l(i12, i12, i13, i13));
            Map map2 = this.B;
            pc.j.b(map2);
            return o0Var.R(i12, i13, map2, null, new h(e10, 1));
        }
        j10 = 4294967295L;
        p pVar3 = r02.f2197n;
        if (pVar3 == null || layoutDirection != r02.f2198o || pVar3.c()) {
            r02.f2198o = layoutDirection;
            String str = r02.f2184a;
            h0 e11 = z.e(r02.f2185b, layoutDirection);
            s2.c cVar2 = r02.f2192i;
            pc.j.b(cVar2);
            k2.d dVar2 = r02.f2186c;
            bc.v vVar = bc.v.f1067g;
            pVar3 = new o2.d(str, e11, vVar, vVar, dVar2, cVar2);
        }
        r02.f2197n = pVar3;
        boolean z11 = r02.f2188e;
        int i14 = r02.f2187d;
        float g10 = pVar3.g();
        int h10 = ((z11 || i14 == 2) && s2.a.d(j6)) ? s2.a.h(j6) : Integer.MAX_VALUE;
        if (s2.a.j(j6) != h10) {
            h10 = uc.e.h(x4.f.z(g10), s2.a.j(j6), h10);
        }
        long l10 = bc.a0.l(0, h10, 0, s2.a.g(j6));
        boolean z12 = r02.f2188e;
        int i15 = r02.f2187d;
        int i16 = r02.f2189f;
        h2.a aVar4 = new h2.a((o2.d) pVar3, ((z12 || i15 != 2) && i16 >= 1) ? i16 : 1, i15 == 2 ? 2 : 1, l10);
        r02.f2199p = j6;
        long d11 = s2.b.d(j6, i7.b.e(x4.f.z(aVar4.c()), x4.f.z(aVar4.b())));
        r02.f2195l = d11;
        r02.f2194k = r02.f2187d != 3 && (((float) ((int) (d11 >> 32))) < aVar4.c() || ((float) ((int) (d11 & j10))) < aVar4.b());
        r02.f2193j = aVar4;
        z10 = true;
        pVar2 = r02.f2197n;
        if (pVar2 != null) {
        }
        h2.a aVar32 = r02.f2193j;
        pc.j.b(aVar32);
        k kVar2 = aVar32.f2609d;
        long j112 = r02.f2195l;
        if (z10) {
        }
        int i122 = (int) (j112 >> 32);
        int i132 = (int) (j112 & j10);
        j0 e102 = d0Var.e(bc.a0.l(i122, i122, i132, i132));
        Map map22 = this.B;
        pc.j.b(map22);
        return o0Var.R(i122, i132, map22, null, new h(e102, 1));
    }

    public final d r0() {
        if (this.C == null) {
            this.C = new d(this.f2206u, this.f2207v, this.f2208w, this.f2209x, this.f2210y, this.f2211z, this.A);
        }
        d dVar = this.C;
        pc.j.b(dVar);
        return dVar;
    }
}
