package a0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.CancellationSignal;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import b0.f0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import f1.h0;
import f1.i0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import m0.w2;
import u.l0;
import u.m0;
import u.o0;
import v.e1;
import v.i1;
import w.b1;
import x1.g0;
import x1.y1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, Object obj) {
        super(1);
        this.f5g = i10;
        this.f6h = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0218, code lost:
    
        if (r28 != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Type inference failed for: r1v64, types: [h1.f] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    @Override // oc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i10;
        f1.l lVar;
        boolean z10;
        h1.b bVar;
        a5.c cVar;
        float f10;
        float f11;
        long x10;
        float d10;
        Bitmap bitmap;
        int i11 = this.f5g;
        int i12 = 5;
        int i13 = 2;
        float f12 = 0.0f;
        ac.o oVar = ac.o.f277a;
        Object obj2 = this.f6h;
        switch (i11) {
            case 0:
                b0 b0Var = (b0) obj2;
                float f13 = -((Number) obj).floatValue();
                if ((f13 >= 0.0f || b0Var.c()) && (f13 <= 0.0f || b0Var.a())) {
                    if (Math.abs(b0Var.f22g) > 0.5f) {
                        throw new IllegalStateException(("entered drag with non-zero pending scroll: " + b0Var.f22g).toString());
                    }
                    float f14 = b0Var.f22g + f13;
                    b0Var.f22g = f14;
                    if (Math.abs(f14) > 0.5f) {
                        s sVar = (s) b0Var.f20e.getValue();
                        float f15 = b0Var.f22g;
                        int round = Math.round(f15);
                        s sVar2 = b0Var.f18c;
                        boolean f16 = sVar.f(round, !b0Var.f17b);
                        if (f16 && sVar2 != null) {
                            f16 = sVar2.f(round, true);
                        }
                        if (f16) {
                            b0Var.f(sVar, b0Var.f17b, true);
                            b0Var.f36u.setValue(oVar);
                            b0Var.h(f15 - b0Var.f22g, sVar);
                        } else {
                            g0 g0Var = b0Var.f25j;
                            if (g0Var != null) {
                                g0Var.k();
                            }
                            b0Var.h(f15 - b0Var.f22g, b0Var.g());
                        }
                    }
                    if (Math.abs(b0Var.f22g) > 0.5f) {
                        f13 -= b0Var.f22g;
                        b0Var.f22g = 0.0f;
                    }
                    f12 = f13;
                }
                return Float.valueOf(-f12);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new b0.q(0, (b0.r) obj2);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new b0.q(i13, (b0.z) obj2);
            case 3:
                b1.e eVar = (b1.e) obj;
                if (!eVar.f8443g.f8456t) {
                    return y1.f8219h;
                }
                b1.e eVar2 = eVar.f945v;
                y1 y1Var = y1.f8218g;
                if (eVar2 != null) {
                    a0 a0Var = new a0(3, (f8.c) obj2);
                    if (a0Var.invoke(eVar2) == y1Var) {
                        x1.f.y(eVar2, a0Var);
                    }
                }
                eVar.f945v = null;
                eVar.f944u = null;
                return y1Var;
            case 4:
                return obj == ((bc.a) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                pc.j.e(entry, "it");
                bc.f fVar = (bc.f) obj2;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == fVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != fVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 6:
                f1.e0 e0Var = (f1.e0) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj2;
                e0Var.i(e0Var.c() * shadowGraphicsLayerElement.f577a);
                e0Var.j(shadowGraphicsLayerElement.f578b);
                e0Var.e(shadowGraphicsLayerElement.f579c);
                e0Var.b(shadowGraphicsLayerElement.f580d);
                e0Var.k(shadowGraphicsLayerElement.f581e);
                return oVar;
            case 7:
                String str = (String) obj;
                pc.j.e(str, "it");
                ((LinkedHashSet) obj2).add(str);
                return oVar;
            case 8:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return oVar;
            case 9:
                e2.u.a((e2.j) obj, ((e2.g) obj2).f1956a);
                return oVar;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                ((List) obj).add((Float) ((f0) obj2).invoke());
                return true;
            case 11:
                f1.e0 e0Var2 = (f1.e0) obj;
                h0 h0Var = (h0) obj2;
                e0Var2.g(h0Var.f2255u);
                e0Var2.h(h0Var.f2256v);
                e0Var2.a(h0Var.f2257w);
                e0Var2.i(h0Var.f2258x);
                e0Var2.f(0.0f);
                float f17 = h0Var.f2259y;
                if (e0Var2.f2233o != f17) {
                    e0Var2.f2225g |= 2048;
                    e0Var2.f2233o = f17;
                }
                e0Var2.n(h0Var.f2260z);
                e0Var2.j(h0Var.A);
                e0Var2.e(h0Var.B);
                e0Var2.b(h0Var.C);
                e0Var2.k(h0Var.D);
                int i14 = h0Var.E;
                if (e0Var2.f2240v != i14) {
                    e0Var2.f2225g |= 524288;
                    e0Var2.f2240v = i14;
                }
                return oVar;
            case 12:
                ((gd.h) obj2).b();
                return oVar;
            case 13:
                h1.d dVar = (h1.d) obj;
                i1.b bVar2 = (i1.b) obj2;
                f1.i iVar = bVar2.f3022l;
                if (bVar2.f3024n && bVar2.f3033w && iVar != null) {
                    a5.c A = dVar.A();
                    long x11 = A.x();
                    A.t().k();
                    try {
                        ((a5.c) ((f8.c) A.f262h).f2340h).t().i(iVar);
                        bVar2.c(dVar);
                    } finally {
                        A.t().g();
                        A.Q(x11);
                    }
                } else {
                    bVar2.c(dVar);
                }
                return oVar;
            case 14:
                l1.c0 c0Var = (l1.c0) obj;
                l1.c cVar2 = (l1.c) obj2;
                cVar2.g(c0Var);
                oc.c cVar3 = cVar2.f3941i;
                if (cVar3 != null) {
                    cVar3.invoke(c0Var);
                }
                return oVar;
            case 15:
                String str2 = (String) obj;
                pc.j.e(str2, "it");
                return Boolean.valueOf(xc.h.x(str2, ((k5.a) obj2).getKey()));
            case 16:
                Throwable th = (Throwable) obj;
                o4.i iVar2 = (o4.i) obj2;
                if (th == null) {
                    if (!iVar2.f5213g.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th instanceof CancellationException) {
                    iVar2.f5213g.cancel(true);
                } else {
                    z4.j jVar = iVar2.f5213g;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    jVar.j(th);
                }
                return oVar;
            case 17:
                ((h7.a) obj2).cancel(false);
                return oVar;
            case 18:
                pc.j.e((u.m) obj, "$this$ScreenTransition");
                v.x xVar = (v.x) obj2;
                return new u.u(u.b0.a(xVar), new u.g0(new o0(new u.h0(xVar), (l0) null, (LinkedHashMap) (0 == true ? 1 : 0), 62)), 0.0f, new m0(u.g.f6598g));
            case 19:
                Throwable th2 = (Throwable) obj;
                r1.y yVar = (r1.y) obj2;
                yc.g gVar = yVar.f6003i;
                if (gVar != null) {
                    gVar.n(th2);
                }
                yVar.f6003i = null;
                return oVar;
            case 20:
                return obj == ((s.a0) obj2) ? "(this)" : String.valueOf(obj);
            case 21:
                return obj == ((s.c0) obj2) ? "(this)" : String.valueOf(obj);
            case 22:
                return obj == ((s.h0) obj2) ? "(this)" : String.valueOf(obj);
            case 23:
                w2 w2Var = (w2) ((u.m) obj2).f6619c.g(obj);
                return new s2.k(w2Var != null ? ((s2.k) w2Var.getValue()).f6395a : 0L);
            case 24:
                v.g gVar2 = (v.g) obj;
                Object value2 = gVar2.f6844e.getValue();
                x4.s sVar3 = i1.f6863a;
                ((j5.e) obj2).invoke(value2, Float.valueOf(((v.j) gVar2.f6845f).f6872a));
                return oVar;
            case 25:
                return new b0.q(i12, (e1) obj2);
            case 26:
                ((List) obj2).get(((Number) obj).intValue());
                return null;
            case 27:
                c1.d dVar2 = (c1.d) obj;
                w.n nVar = (w.n) obj2;
                if (dVar2.c() * nVar.f7470x < 0.0f || e1.e.c(dVar2.f1203g.d()) <= 0.0f) {
                    return dVar2.a(w.k.f7446h);
                }
                float f18 = 2;
                float min = Math.min(s2.f.a(nVar.f7470x, 0.0f) ? 1.0f : (float) Math.ceil(dVar2.c() * nVar.f7470x), (float) Math.ceil(e1.e.c(dVar2.f1203g.d()) / f18));
                float f19 = min / f18;
                long h10 = v6.a.h(f19, f19);
                long g8 = i7.b.g(e1.e.d(dVar2.f1203g.d()) - min, e1.e.b(dVar2.f1203g.d()) - min);
                float f20 = min * f18;
                boolean z11 = f20 > e1.e.c(dVar2.f1203g.d());
                f1.b0 a6 = nVar.f7472z.a(dVar2.f1203g.d(), dVar2.f1203g.getLayoutDirection(), dVar2);
                if (!(a6 instanceof f1.y)) {
                    if (!(a6 instanceof f1.a0)) {
                        boolean z12 = z11;
                        if (!(a6 instanceof f1.z)) {
                            throw new ac.d();
                        }
                        i0 i0Var = nVar.f7471y;
                        long j3 = z12 ? 0L : h10;
                        if (z12) {
                            g8 = dVar2.f1203g.d();
                        }
                        return dVar2.a(new u.c0(i0Var, j3, g8, z12 ? h1.f.f2601b : new h1.g(min, 0.0f, 0, 0, 30), 1));
                    }
                    i0 i0Var2 = nVar.f7471y;
                    e1.d dVar3 = ((f1.a0) a6).f2212a;
                    if (a.a.C(dVar3)) {
                        return dVar2.a(new w.m(z11, i0Var2, dVar3.f1939e, f19, min, h10, g8, new h1.g(min, 0.0f, 0, 0, 30)));
                    }
                    boolean z13 = z11;
                    if (nVar.f7469w == null) {
                        nVar.f7469w = new w.j();
                    }
                    w.j jVar2 = nVar.f7469w;
                    pc.j.b(jVar2);
                    f1.i iVar3 = jVar2.f7445d;
                    if (iVar3 == null) {
                        iVar3 = f1.k.a();
                        jVar2.f7445d = iVar3;
                    }
                    iVar3.d();
                    f1.i.a(iVar3, dVar3);
                    if (!z13) {
                        f1.i a8 = f1.k.a();
                        f1.i.a(a8, new e1.d(min, min, dVar3.b() - min, dVar3.a() - min, u5.d.j(dVar3.f1939e, min), u5.d.j(dVar3.f1940f, min), u5.d.j(dVar3.f1941g, min), u5.d.j(dVar3.f1942h, min)));
                        iVar3.c(iVar3, a8, 0);
                    }
                    return dVar2.a(new b0.l0(14, iVar3, i0Var2));
                }
                i0 i0Var3 = nVar.f7471y;
                f1.y yVar2 = (f1.y) a6;
                f1.i iVar4 = yVar2.f2291a;
                if (z11) {
                    return dVar2.a(new b0.l0(13, yVar2, i0Var3));
                }
                if (i0Var3 != null) {
                    lVar = new f1.l(5, i0Var3.f2264e);
                    i10 = 1;
                } else {
                    i10 = 0;
                    lVar = null;
                }
                e1.c b2 = iVar4.b();
                float f21 = b2.f1932b;
                float f22 = b2.f1931a;
                if (nVar.f7469w == null) {
                    nVar.f7469w = new w.j();
                }
                w.j jVar3 = nVar.f7469w;
                pc.j.b(jVar3);
                f1.i iVar5 = jVar3.f7445d;
                if (iVar5 == null) {
                    iVar5 = f1.k.a();
                    jVar3.f7445d = iVar5;
                }
                iVar5.d();
                float f23 = b2.f1931a;
                float f24 = b2.f1934d;
                float f25 = b2.f1933c;
                float f26 = b2.f1932b;
                if (Float.isNaN(f23) || Float.isNaN(f26) || Float.isNaN(f25) || Float.isNaN(f24)) {
                    f1.k.b("Invalid rectangle, make sure no value is NaN");
                }
                if (iVar5.f2262b == null) {
                    iVar5.f2262b = new RectF();
                }
                RectF rectF = iVar5.f2262b;
                pc.j.b(rectF);
                rectF.set(f23, f26, f25, f24);
                Path path = iVar5.f2261a;
                RectF rectF2 = iVar5.f2262b;
                pc.j.b(rectF2);
                path.addRect(rectF2, Path.Direction.CCW);
                iVar5.c(iVar5, iVar4, 0);
                pc.s sVar4 = new pc.s();
                long e10 = i7.b.e((int) Math.ceil(b2.f1933c - f22), (int) Math.ceil(b2.f1934d - f21));
                w.j jVar4 = nVar.f7469w;
                pc.j.b(jVar4);
                f1.g gVar3 = jVar4.f7442a;
                f1.b bVar3 = jVar4.f7443b;
                f1.w wVar = gVar3 != null ? new f1.w(gVar3.a()) : null;
                try {
                    try {
                        if (wVar == null || wVar.f2290a != 0) {
                            f1.w wVar2 = gVar3 != null ? new f1.w(gVar3.a()) : null;
                            if (wVar2 == null || i10 != wVar2.f2290a) {
                                z10 = false;
                                if (gVar3 != null && bVar3 != null) {
                                    d10 = e1.e.d(dVar2.f1203g.d());
                                    bitmap = gVar3.f2252a;
                                    if (d10 <= bitmap.getWidth()) {
                                        if (e1.e.b(dVar2.f1203g.d()) <= bitmap.getHeight()) {
                                        }
                                    }
                                }
                                gVar3 = f1.d0.e((int) (e10 >> 32), (int) (4294967295L & e10), i10);
                                jVar4.f7442a = gVar3;
                                Canvas canvas = f1.c.f2217a;
                                bVar3 = new f1.b();
                                bVar3.f2214a = new Canvas(gVar3.f2252a);
                                jVar4.f7443b = bVar3;
                                bVar = jVar4.f7444c;
                                if (bVar == null) {
                                    bVar = new h1.b();
                                    jVar4.f7444c = bVar;
                                }
                                cVar = bVar.f2596h;
                                h1.a aVar = bVar.f2595g;
                                h1.b bVar4 = bVar;
                                long F = i7.b.F(e10);
                                s2.l layoutDirection = dVar2.f1203g.getLayoutDirection();
                                s2.c cVar4 = aVar.f2591a;
                                s2.l lVar2 = aVar.f2592b;
                                f1.i iVar6 = iVar5;
                                f1.o oVar2 = aVar.f2593c;
                                f1.g gVar4 = gVar3;
                                long j6 = aVar.f2594d;
                                aVar.f2591a = dVar2;
                                aVar.f2592b = layoutDirection;
                                aVar.f2593c = bVar3;
                                aVar.f2594d = F;
                                bVar3.k();
                                h1.d.l(bVar4, f1.q.f2277b, F, 58);
                                f10 = -f22;
                                f11 = -f21;
                                ((f8.c) cVar.f262h).u(f10, f11);
                                h1.d.o(bVar4, yVar2.f2291a, i0Var3, 0.0f, new h1.g(f20, 0.0f, 0, 0, 30), 52);
                                float f27 = 1;
                                float d11 = (e1.e.d(bVar4.d()) + f27) / e1.e.d(bVar4.d());
                                float b10 = (e1.e.b(bVar4.d()) + f27) / e1.e.b(bVar4.d());
                                f1.b bVar5 = bVar3;
                                long J = bVar4.J();
                                x10 = cVar.x();
                                cVar.t().k();
                                ((f8.c) cVar.f262h).t(d11, b10, J);
                                h1.d.o(bVar4, iVar6, i0Var3, 0.0f, null, 28);
                                ((f8.c) cVar.f262h).u(-f10, -f11);
                                bVar5.g();
                                aVar.f2591a = cVar4;
                                aVar.f2592b = lVar2;
                                aVar.f2593c = oVar2;
                                aVar.f2594d = j6;
                                gVar4.f2252a.prepareToDraw();
                                sVar4.f5683g = gVar4;
                                return dVar2.a(new w.l(b2, sVar4, e10, lVar));
                            }
                        }
                        ((f8.c) cVar.f262h).t(d11, b10, J);
                        h1.d.o(bVar4, iVar6, i0Var3, 0.0f, null, 28);
                        ((f8.c) cVar.f262h).u(-f10, -f11);
                        bVar5.g();
                        aVar.f2591a = cVar4;
                        aVar.f2592b = lVar2;
                        aVar.f2593c = oVar2;
                        aVar.f2594d = j6;
                        gVar4.f2252a.prepareToDraw();
                        sVar4.f5683g = gVar4;
                        return dVar2.a(new w.l(b2, sVar4, e10, lVar));
                    } finally {
                        cVar.t().g();
                        cVar.Q(x10);
                    }
                    h1.d.o(bVar4, yVar2.f2291a, i0Var3, 0.0f, new h1.g(f20, 0.0f, 0, 0, 30), 52);
                    float f272 = 1;
                    float d112 = (e1.e.d(bVar4.d()) + f272) / e1.e.d(bVar4.d());
                    float b102 = (e1.e.b(bVar4.d()) + f272) / e1.e.b(bVar4.d());
                    f1.b bVar52 = bVar3;
                    long J2 = bVar4.J();
                    x10 = cVar.x();
                    cVar.t().k();
                } catch (Throwable th3) {
                    ((f8.c) cVar.f262h).u(-f10, -f11);
                    throw th3;
                }
                z10 = true;
                if (gVar3 != null) {
                    d10 = e1.e.d(dVar2.f1203g.d());
                    bitmap = gVar3.f2252a;
                    if (d10 <= bitmap.getWidth()) {
                    }
                }
                gVar3 = f1.d0.e((int) (e10 >> 32), (int) (4294967295L & e10), i10);
                jVar4.f7442a = gVar3;
                Canvas canvas2 = f1.c.f2217a;
                bVar3 = new f1.b();
                bVar3.f2214a = new Canvas(gVar3.f2252a);
                jVar4.f7443b = bVar3;
                bVar = jVar4.f7444c;
                if (bVar == null) {
                }
                cVar = bVar.f2596h;
                h1.a aVar2 = bVar.f2595g;
                h1.b bVar42 = bVar;
                long F2 = i7.b.F(e10);
                s2.l layoutDirection2 = dVar2.f1203g.getLayoutDirection();
                s2.c cVar42 = aVar2.f2591a;
                s2.l lVar22 = aVar2.f2592b;
                f1.i iVar62 = iVar5;
                f1.o oVar22 = aVar2.f2593c;
                f1.g gVar42 = gVar3;
                long j62 = aVar2.f2594d;
                aVar2.f2591a = dVar2;
                aVar2.f2592b = layoutDirection2;
                aVar2.f2593c = bVar3;
                aVar2.f2594d = F2;
                bVar3.k();
                h1.d.l(bVar42, f1.q.f2277b, F2, 58);
                f10 = -f22;
                f11 = -f21;
                ((f8.c) cVar.f262h).u(f10, f11);
                break;
            case 28:
                long j10 = ((e1.b) obj).f1929a;
                w.q qVar = (w.q) obj2;
                if (qVar.f7486z) {
                    qVar.A.invoke();
                }
                return oVar;
            default:
                float floatValue = ((Number) obj).floatValue();
                b1 b1Var = (b1) obj2;
                m0.i1 i1Var = b1Var.f7382a;
                float g10 = i1Var.g() + floatValue + b1Var.f7386e;
                float g11 = uc.e.g(g10, 0.0f, b1Var.f7385d.g());
                boolean z14 = g10 == g11;
                float g12 = g11 - i1Var.g();
                int round2 = Math.round(g12);
                i1Var.h(i1Var.g() + round2);
                b1Var.f7386e = g12 - round2;
                if (!z14) {
                    floatValue = g12;
                }
                return Float.valueOf(floatValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(j5.e eVar) {
        super(1);
        this.f5g = 24;
        x4.s sVar = i1.f6863a;
        this.f6h = eVar;
    }
}
