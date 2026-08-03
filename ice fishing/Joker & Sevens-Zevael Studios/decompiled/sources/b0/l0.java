package b0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.List;
import m0.h1;
import m0.l1;
import m0.n2;
import m0.w2;
import v.d1;
import v.e1;
import v.y0;
import v.z0;
import v1.x0;
import x.n1;
import y1.a2;
import y1.o1;
import y1.z1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l0 extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f846g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f847h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f848i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        super(1);
        this.f846g = i10;
        this.f847h = obj;
        this.f848i = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oc.c
    public final Object invoke(Object obj) {
        oc.a aVar;
        v.x xVar;
        View l10;
        int i10 = 4;
        int i11 = 7;
        int i12 = 2;
        View view = null;
        int i13 = 1;
        switch (this.f846g) {
            case 0:
                n0 n0Var = (n0) this.f847h;
                LinkedHashSet linkedHashSet = n0Var.f862i;
                Object obj2 = this.f848i;
                linkedHashSet.remove(obj2);
                return new ae.f(i13, n0Var, obj2);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                v1.i0.k((v1.i0) obj, (v1.j0) this.f847h, 0, 0, ((f1.m) this.f848i).f2272u, 4);
                return ac.o.f277a;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                v1.i0.k((v1.i0) obj, (v1.j0) this.f847h, 0, 0, ((f1.h0) this.f848i).F, 4);
                return ac.o.f277a;
            case 3:
                pc.j.e((m0.l0) obj, "$this$DisposableEffect");
                h5.d dVar = (h5.d) this.f847h;
                Bundle bundle = (Bundle) this.f848i;
                androidx.lifecycle.u uVar = (androidx.lifecycle.u) dVar.f2860j.get();
                if (uVar != null) {
                    h5.c cVar = new h5.c(dVar, bundle);
                    androidx.lifecycle.w h10 = uVar.h();
                    h10.a(cVar);
                    aVar = new c1.b(i10, h10, cVar);
                } else {
                    aVar = h5.b.f2849i;
                }
                for (androidx.lifecycle.o oVar : h5.d.f2854n) {
                    h5.d.j(dVar.f2857g, oVar);
                }
                return new h5.a(aVar, dVar, bundle);
            case 4:
                pc.j.e((m0.l0) obj, "$this$DisposableEffect");
                return new ae.f(i12, (m5.c) this.f847h, (List) this.f848i);
            case 5:
                u.m mVar = (u.m) obj;
                pc.j.e(mVar, "$this$AnimatedContent");
                u.u uVar2 = (u.u) ((a0.a0) this.f847h).invoke(mVar);
                int ordinal = ((l5.b) ((l1) ((m5.c) this.f848i).f4881d.f1817b).getValue()).ordinal();
                if (ordinal == 1 || ordinal == 2) {
                }
                u.f0 f0Var = uVar2.f6641a;
                u.g0 g0Var = uVar2.f6642b;
                h1 h1Var = uVar2.f6643c;
                return new u.u(f0Var, g0Var, ((n2) w0.m.t(h1Var.f4604h, h1Var)).f4687c, uVar2.f6644d);
            case 6:
                v1.i0 i0Var = (v1.i0) obj;
                v1.j0 j0Var = (v1.j0) this.f847h;
                h1 h1Var2 = ((u.u) this.f848i).f6643c;
                float f10 = ((n2) w0.m.t(h1Var2.f4604h, h1Var2)).f4687c;
                i0Var.getClass();
                long j3 = 0;
                v1.i0.a(i0Var, j0Var);
                j0Var.P(s2.i.c((4294967295L & j3) | (j3 << 32), j0Var.f7089k), f10, null);
                return ac.o.f277a;
            case 7:
                z0 z0Var = (z0) obj;
                s.g0 g0Var2 = ((u.m) this.f847h).f6619c;
                w2 w2Var = (w2) g0Var2.g(z0Var.a());
                long j6 = w2Var != null ? ((s2.k) w2Var.getValue()).f6395a : 0L;
                w2 w2Var2 = (w2) g0Var2.g(z0Var.c());
                long j10 = w2Var2 != null ? ((s2.k) w2Var2.getValue()).f6395a : 0L;
                u.m0 m0Var = (u.m0) ((u.l) this.f848i).f6615b.getValue();
                return (m0Var == null || (xVar = (v.x) m0Var.f6620a.invoke(new s2.k(j6), new s2.k(j10))) == null) ? v.d.i(0.0f, 0.0f, null, 7) : xVar;
            case 8:
                v.e0 e0Var = (v.e0) this.f847h;
                v.c0 c0Var = (v.c0) this.f848i;
                e0Var.f6819a.b(c0Var);
                e0Var.f6820b.setValue(Boolean.TRUE);
                return new ae.f(3, e0Var, c0Var);
            case 9:
                yc.a0.q((yc.y) this.f847h, null, new i0.u((e1) this.f848i, null), 1);
                return new d1();
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                e1 e1Var = (e1) this.f847h;
                e1 e1Var2 = (e1) this.f848i;
                e1Var.f6832j.add(e1Var2);
                return new ae.f(i10, e1Var, e1Var2);
            case 11:
                return new ae.f(5, (e1) this.f847h, (y0) this.f848i);
            case 12:
                x1.l0 l0Var = (x1.l0) obj;
                v1.n0 n0Var2 = (v1.n0) this.f847h;
                if (n0Var2.f7107u.f7113m.g() > 0) {
                    l0Var.f8105g = true;
                    x1.o0 o0Var = l0Var.f8108j;
                    v1.p g02 = o0Var.g0();
                    if (s2.i.a(l0Var.f8106h, 9223372034707292159L)) {
                        l0Var.f8106h = x4.f.T(g02.b(0L));
                        l0Var.f8107i = g02.E();
                    }
                    o0Var.i0().J.b();
                    long E = g02.E();
                    s.g0 g0Var3 = ((v1.o) this.f848i).f7112l;
                    int i14 = (int) (E >> 32);
                    int i15 = (int) (E & 4294967295L);
                    for (v1.w0 w0Var : androidx.compose.ui.layout.b.f599b) {
                        Object g8 = g0Var3.g(w0Var);
                        pc.j.b(g8);
                        v1.y0 y0Var = (v1.y0) g8;
                        x0 x0Var = (x0) w0Var;
                        androidx.compose.ui.layout.b.a(l0Var, x0Var.f7167c, y0Var.f7176h, i14, i15);
                        if (((Boolean) y0Var.f7170b.getValue()).booleanValue()) {
                            androidx.compose.ui.layout.b.a(l0Var, y0Var.f7174f, y0Var.f7178j, i14, i15);
                            androidx.compose.ui.layout.b.a(l0Var, y0Var.f7175g, y0Var.f7179k, i14, i15);
                        }
                        androidx.compose.ui.layout.b.a(l0Var, x0Var.f7168d, y0Var.f7177i, i14, i15);
                    }
                    if (n0Var2.f7107u.f7114n.h()) {
                        s.a0 a0Var = n0Var2.f7107u.f7114n;
                        Object[] objArr = a0Var.f6219a;
                        int i16 = a0Var.f6220b;
                        for (int i17 = 0; i17 < i16; i17++) {
                            m0.d1 d1Var = (m0.d1) objArr[i17];
                            v1.n nVar = (v1.n) n0Var2.f7107u.f7115o.get(i17);
                            Rect rect = (Rect) d1Var.getValue();
                            l0Var.a(nVar.b(), rect.left);
                            l0Var.a(nVar.d(), rect.top);
                            l0Var.a(nVar.c(), rect.right);
                            l0Var.a(nVar.a(), rect.bottom);
                        }
                    }
                }
                return ac.o.f277a;
            case 13:
                x1.i0 i0Var2 = (x1.i0) obj;
                i0Var2.a();
                h1.d.o(i0Var2, ((f1.y) this.f847h).f2291a, (f1.d0) this.f848i, 0.0f, null, 60);
                return ac.o.f277a;
            case 14:
                x1.i0 i0Var3 = (x1.i0) obj;
                i0Var3.a();
                h1.d.o(i0Var3, (f1.i) this.f847h, (f1.d0) this.f848i, 0.0f, null, 60);
                return ac.o.f277a;
            case 15:
                ((y.i) this.f847h).b((y.h) this.f848i);
                return ac.o.f277a;
            case 16:
                ((j) this.f847h).f839a.j((x.h) this.f848i);
                return ac.o.f277a;
            case 17:
                s1.c cVar2 = (s1.c) this.f847h;
                l7.a aVar2 = cVar2.f6379b;
                l7.a aVar3 = cVar2.f6378a;
                a.a.i(cVar2, (r1.n) obj);
                x.s0 s0Var = (x.s0) this.f848i;
                float a6 = ((o1) x1.f.i(s0Var, y1.y0.f8720s)).a();
                long j11 = v6.a.j(a6, a6);
                if (s2.p.b(j11) <= 0.0f || s2.p.c(j11) <= 0.0f) {
                    u1.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) s2.p.f(j11)));
                }
                long j12 = v6.a.j(aVar3.d(s2.p.b(j11)), aVar2.d(s2.p.c(j11)));
                s1.a[] aVarArr = (s1.a[]) aVar3.f4209d;
                bc.l.V(0, aVarArr.length, null, aVarArr);
                aVar3.f4207b = 0;
                s1.a[] aVarArr2 = (s1.a[]) aVar2.f4209d;
                bc.l.V(0, aVarArr2.length, null, aVarArr2);
                aVar2.f4207b = 0;
                cVar2.f6380c = 0L;
                ad.e eVar = s0Var.A;
                if (eVar != null) {
                    int i18 = x.b0.f7746a;
                    eVar.s(new x.p(v6.a.j(Float.isNaN(s2.p.b(j12)) ? 0.0f : s2.p.b(j12), Float.isNaN(s2.p.c(j12)) ? 0.0f : s2.p.c(j12))));
                }
                return ac.o.f277a;
            case 18:
                x.x0 x0Var2 = (x.x0) this.f847h;
                x.z0 z0Var2 = (x.z0) this.f848i;
                long j13 = ((x.n) obj).f7849a;
                long a8 = z0Var2.f7954d == x.e0.f7770h ? e1.b.a(1, j13) : e1.b.a(2, j13);
                x.z0 z0Var3 = x0Var2.f7935a;
                z0Var3.f7957g = 1;
                w.w0 w0Var2 = z0Var3.f7952b;
                if (w0Var2 == null || !(z0Var3.f7951a.c() || z0Var3.f7951a.a())) {
                    x.z0.a(z0Var3, z0Var3.f7958h, a8, 1);
                } else {
                    w0Var2.c(a8, z0Var3.f7957g, z0Var3.f7960j);
                }
                return ac.o.f277a;
            case 19:
                ((Number) obj).longValue();
                n1 n1Var = (n1) this.f847h;
                float f11 = n1Var.f7859e;
                n1Var.f7859e = 0.0f;
                ((oc.c) this.f848i).invoke(Float.valueOf(f11));
                return ac.o.f277a;
            case 20:
                Context context = (Context) this.f847h;
                Context applicationContext = context.getApplicationContext();
                y1.g0 g0Var4 = (y1.g0) this.f848i;
                applicationContext.registerComponentCallbacks(g0Var4);
                return new ae.f(6, context, g0Var4);
            case 21:
                Context context2 = (Context) this.f847h;
                Context applicationContext2 = context2.getApplicationContext();
                y1.h0 h0Var = (y1.h0) this.f848i;
                applicationContext2.registerComponentCallbacks(h0Var);
                return new ae.f(i11, context2, h0Var);
            case 22:
                y1.j0 j0Var2 = (y1.j0) this.f847h;
                y1.k0 k0Var = (y1.k0) this.f848i;
                synchronized (j0Var2.f8562k) {
                    j0Var2.f8564m.remove(k0Var);
                }
                return ac.o.f277a;
            case 23:
                ((Choreographer) ((m0.n1) this.f847h).f4685h).removeFrameCallback((y1.k0) this.f848i);
                return ac.o.f277a;
            case 24:
                View view2 = (View) obj;
                View view3 = (View) this.f847h;
                a0.w wVar = new a0.w(view2.getNextFocusForwardId(), i12);
                View view4 = null;
                while (true) {
                    l10 = y1.e0.l(view2, wVar, view4);
                    if (l10 == null && view2 != view3) {
                        ViewParent parent = view2.getParent();
                        if (parent != null && (parent instanceof View)) {
                            View view5 = (View) parent;
                            view4 = view2;
                            view2 = view5;
                        }
                    }
                }
                view = l10;
                return Boolean.valueOf(view == ((View) this.f848i));
            case 25:
                y1.m mVar2 = (y1.m) obj;
                oc.e eVar2 = (oc.e) this.f848i;
                a2 a2Var = (a2) this.f847h;
                if (!a2Var.f8470i) {
                    androidx.lifecycle.w h11 = mVar2.f8582a.h();
                    a2Var.f8472k = eVar2;
                    if (a2Var.f8471j == null) {
                        a2Var.f8471j = h11;
                        h11.a(a2Var);
                    } else if (h11.f723c.compareTo(androidx.lifecycle.p.f699i) >= 0) {
                        a2Var.f8469h.A(new u0.d(1330788943, new z1(a2Var, eVar2, i13), true));
                    }
                }
                return ac.o.f277a;
            case 26:
                z.p0 p0Var = (z.p0) this.f847h;
                View view6 = (View) this.f848i;
                z.w wVar2 = p0Var.f9023t;
                if (p0Var.f9022s == 0) {
                    Field field = h3.w.f2829a;
                    h3.q.g(view6, wVar2);
                    if (view6.isAttachedToWindow()) {
                        view6.requestApplyInsets();
                    }
                    view6.addOnAttachStateChangeListener(wVar2);
                    h3.w.c(view6, wVar2);
                }
                p0Var.f9022s++;
                return new ae.f(8, p0Var, view6);
            default:
                ((zc.d) this.f847h).f9179i.removeCallbacks((dd.i) this.f848i);
                return ac.o.f277a;
        }
    }
}
