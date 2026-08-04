package com.gamericefishpro.space.d0;

import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.t0.r1;
import com.gamericefishpro.space.t0.s2;
import com.gamericefishpro.space.t0.u1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object i;

    public /* synthetic */ q0(int i, Object obj, Object obj2) {
        this.d = i;
        this.i = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.z4.w wVarG;
        int i = 9;
        int i2 = 10;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r0 r0Var = (r0) this.i;
                com.gamericefishpro.space.f2.u0 u0Var = (com.gamericefishpro.space.f2.u0) this.e;
                com.gamericefishpro.space.f2.t0 t0Var = (com.gamericefishpro.space.f2.t0) obj;
                if (r0Var.J) {
                    com.gamericefishpro.space.f2.t0.l(t0Var, u0Var, t0Var.J(r0Var.H), t0Var.J(r0Var.I));
                } else {
                    t0Var.h(u0Var, t0Var.J(r0Var.H), t0Var.J(r0Var.I), 0.0f);
                }
                return Unit.a;
            case 1:
                t0 t0Var2 = (t0) this.i;
                com.gamericefishpro.space.f2.u0 u0Var2 = (com.gamericefishpro.space.f2.u0) this.e;
                com.gamericefishpro.space.f2.t0 t0Var3 = (com.gamericefishpro.space.f2.t0) obj;
                if (t0Var2.L) {
                    com.gamericefishpro.space.f2.t0.l(t0Var3, u0Var2, t0Var3.J(t0Var2.H), t0Var3.J(t0Var2.I));
                } else {
                    t0Var3.h(u0Var2, t0Var3.J(t0Var2.H), t0Var3.J(t0Var2.I), 0.0f);
                }
                return Unit.a;
            case 2:
                m1 m1Var = (m1) this.i;
                View view = (View) this.e;
                l0 l0Var = m1Var.u;
                if (m1Var.t == 0) {
                    Field field = com.gamericefishpro.space.d4.l0.a;
                    com.gamericefishpro.space.d4.d0.i(view, l0Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(l0Var);
                    com.gamericefishpro.space.d4.l0.n(view, l0Var);
                }
                m1Var.t++;
                return new l1(i4, m1Var, view);
            case 3:
                com.gamericefishpro.space.d7.c cVar = (com.gamericefishpro.space.d7.c) this.i;
                ArrayList arrayList = (ArrayList) this.e;
                com.gamericefishpro.space.c6.a _connection = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                cVar.b.t(_connection, arrayList);
                return Unit.a;
            case 4:
                com.gamericefishpro.space.d7.f fVar = (com.gamericefishpro.space.d7.f) this.i;
                List list = (List) this.e;
                com.gamericefishpro.space.c6.a _connection2 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                fVar.b.t(_connection2, list);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.d7.k kVar = (com.gamericefishpro.space.d7.k) this.i;
                com.gamericefishpro.space.d7.l lVar = (com.gamericefishpro.space.d7.l) this.e;
                com.gamericefishpro.space.c6.a _connection3 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                kVar.b.u(_connection3, lVar);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                com.gamericefishpro.space.d7.n nVar = (com.gamericefishpro.space.d7.n) this.i;
                com.gamericefishpro.space.d7.o oVar = (com.gamericefishpro.space.d7.o) this.e;
                com.gamericefishpro.space.c6.a _connection4 = (com.gamericefishpro.space.c6.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                nVar.b.u(_connection4, oVar);
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                com.gamericefishpro.space.f.c cVar2 = (com.gamericefishpro.space.f.c) this.i;
                com.gamericefishpro.space.e.j jVar = (com.gamericefishpro.space.e.j) this.e;
                cVar2.a(jVar);
                return new l1(i5, cVar2, jVar);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                com.gamericefishpro.space.f.c cVar3 = (com.gamericefishpro.space.f.c) this.i;
                com.gamericefishpro.space.e.m mVar = (com.gamericefishpro.space.e.m) this.e;
                cVar3.a(mVar);
                return new l1(i3, cVar3, mVar);
            case 9:
                com.gamericefishpro.space.f5.x xVar = (com.gamericefishpro.space.f5.x) this.i;
                com.gamericefishpro.space.i5.g gVar = ((com.gamericefishpro.space.f5.d0) this.e).b;
                com.gamericefishpro.space.f5.h0 navOptions = (com.gamericefishpro.space.f5.h0) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                p animBuilder = new p(28);
                navOptions.getClass();
                Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
                com.gamericefishpro.space.f5.c cVar4 = new com.gamericefishpro.space.f5.c();
                cVar4.a = -1;
                cVar4.b = -1;
                animBuilder.invoke(cVar4);
                com.gamericefishpro.space.f5.f0 f0Var = navOptions.a;
                f0Var.g = cVar4.a;
                f0Var.h = cVar4.b;
                if (xVar instanceof com.gamericefishpro.space.f5.z) {
                    int i6 = com.gamericefishpro.space.f5.x.w;
                    for (com.gamericefishpro.space.f5.x xVar2 : com.gamericefishpro.space.f5.h.b(xVar)) {
                        com.gamericefishpro.space.f5.x xVarG = gVar.g();
                        if (Intrinsics.a(xVar2, xVarG != null ? xVarG.i : null)) {
                        }
                    }
                    int i7 = com.gamericefishpro.space.f5.z.z;
                    com.gamericefishpro.space.f5.z zVarH = gVar.h();
                    Intrinsics.checkNotNullParameter(zVarH, "<this>");
                    Intrinsics.checkNotNullParameter(zVarH, "<this>");
                    Sequence sequenceC = com.gamericefishpro.space.li.j.c(zVarH, new com.gamericefishpro.space.f5.q(i3));
                    Intrinsics.checkNotNullParameter(sequenceC, "<this>");
                    Iterator it = sequenceC.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Sequence is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    int i8 = ((com.gamericefishpro.space.f5.x) next).e.a;
                    p popUpToBuilder = new p(29);
                    Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
                    navOptions.d = i8;
                    navOptions.f = false;
                    com.gamericefishpro.space.f5.r0 r0Var2 = new com.gamericefishpro.space.f5.r0();
                    popUpToBuilder.invoke(r0Var2);
                    navOptions.f = r0Var2.a;
                    navOptions.g = r0Var2.b;
                }
                return Unit.a;
            case 10:
                com.gamericefishpro.space.g0.s sVar = (com.gamericefishpro.space.g0.s) this.i;
                com.gamericefishpro.space.g0.k kVar2 = (com.gamericefishpro.space.g0.k) this.e;
                com.gamericefishpro.space.g0.r rVarB = sVar.b(((Integer) obj).intValue());
                int i9 = rVarB.a;
                List list2 = rVarB.b;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size = list2.size();
                int i10 = 0;
                while (i4 < size) {
                    int i11 = (int) ((com.gamericefishpro.space.g0.b) list2.get(i4)).a;
                    arrayList2.add(new Pair(Integer.valueOf(i9), new com.gamericefishpro.space.c3.a(kVar2.a(i10, i11))));
                    i9++;
                    i10 += i11;
                    i4++;
                }
                return arrayList2;
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.g0.k kVar3 = (com.gamericefishpro.space.g0.k) this.i;
                com.gamericefishpro.space.g0.j jVar2 = (com.gamericefishpro.space.g0.j) this.e;
                int iIntValue = ((Integer) obj).intValue();
                com.gamericefishpro.space.g0.s sVar2 = kVar3.e;
                int i12 = sVar2.i;
                int iE = sVar2.e(iIntValue);
                return jVar2.s(iIntValue, kVar3.a(0, iE), 0, iE, jVar2.v);
            case 12:
                return new l1(4, (s2) this.i, (com.gamericefishpro.space.g5.i) this.e);
            case 13:
                com.gamericefishpro.space.f5.d0 d0Var = (com.gamericefishpro.space.f5.d0) this.i;
                com.gamericefishpro.space.z4.u owner = (com.gamericefishpro.space.z4.u) this.e;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                com.gamericefishpro.space.i5.g gVar2 = d0Var.b;
                com.gamericefishpro.space.b6.a aVar = gVar2.r;
                Intrinsics.checkNotNullParameter(owner, "owner");
                if (!Intrinsics.a(owner, gVar2.n)) {
                    com.gamericefishpro.space.z4.u uVar = gVar2.n;
                    if (uVar != null && (wVarG = uVar.g()) != null) {
                        wVarG.f(aVar);
                    }
                    gVar2.n = owner;
                    owner.g().a(aVar);
                }
                return new com.gamericefishpro.space.g5.b0();
            case 14:
                com.gamericefishpro.space.h0.e eVar = (com.gamericefishpro.space.h0.e) this.i;
                com.gamericefishpro.space.h0.f fVar2 = (com.gamericefishpro.space.h0.f) this.e;
                com.gamericefishpro.space.p2.d dVar = eVar.H;
                if (dVar != null) {
                    dVar.b();
                }
                eVar.H = null;
                com.gamericefishpro.space.pi.n nVar2 = fVar2.b;
                if (nVar2 != null) {
                    nVar2.W(Unit.a);
                }
                fVar2.b = null;
                return Unit.a;
            case 15:
                com.gamericefishpro.space.h0.v0 v0Var = (com.gamericefishpro.space.h0.v0) this.i;
                Object obj2 = this.e;
                v0Var.i.i(obj2);
                return new l1(5, v0Var, obj2);
            case 16:
                return new com.gamericefishpro.space.h0.v0((com.gamericefishpro.space.e1.f) this.i, (Map) obj, (com.gamericefishpro.space.e1.c) this.e);
            case 17:
                com.gamericefishpro.space.f5.d0 d0Var2 = (com.gamericefishpro.space.f5.d0) this.i;
                com.gamericefishpro.space.w7.b bVar = (com.gamericefishpro.space.w7.b) this.e;
                com.gamericefishpro.space.f5.a0 NavHost = (com.gamericefishpro.space.f5.a0) obj;
                Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                com.gamericefishpro.space.i.a.o(NavHost, "splash", null, new com.gamericefishpro.space.b1.h(1452455453, new com.gamericefishpro.space.j7.e(d0Var2, 7), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "webview?url={url}", com.gamericefishpro.space.ph.w.c(com.gamericefishpro.space.f5.h.f("url", new com.gamericefishpro.space.f5.q(20))), new com.gamericefishpro.space.b1.h(1903690452, new com.gamericefishpro.space.j7.e(d0Var2, 8), true), 252);
                com.gamericefishpro.space.i.a.o(NavHost, "dashboard", null, new com.gamericefishpro.space.b1.h(80503189, new com.gamericefishpro.space.j7.f(i4, bVar, d0Var2), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "level_select", null, new com.gamericefishpro.space.b1.h(-1742684074, new com.gamericefishpro.space.j7.e(d0Var2, i), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "game/{level}", com.gamericefishpro.space.ph.w.c(com.gamericefishpro.space.f5.h.f("level", new com.gamericefishpro.space.f5.q(21))), new com.gamericefishpro.space.b1.h(729095959, new com.gamericefishpro.space.j7.e(d0Var2, i2), true), 252);
                com.gamericefishpro.space.i.a.o(NavHost, "level_complete/{level}/{score}/{stars}", com.gamericefishpro.space.ph.x.f(com.gamericefishpro.space.f5.h.f("level", new com.gamericefishpro.space.f5.q(22)), com.gamericefishpro.space.f5.h.f("score", new com.gamericefishpro.space.f5.q(23)), com.gamericefishpro.space.f5.h.f("stars", new com.gamericefishpro.space.f5.q(24))), new com.gamericefishpro.space.b1.h(-1094091304, new com.gamericefishpro.space.j7.e(d0Var2, i4), true), 252);
                com.gamericefishpro.space.i.a.o(NavHost, "defeat/{level}/{reason}", com.gamericefishpro.space.ph.x.f(com.gamericefishpro.space.f5.h.f("level", new com.gamericefishpro.space.f5.q(25)), com.gamericefishpro.space.f5.h.f("reason", new com.gamericefishpro.space.f5.q(26))), new com.gamericefishpro.space.b1.h(1377688729, new com.gamericefishpro.space.j7.e(d0Var2, i5), true), 252);
                com.gamericefishpro.space.i.a.o(NavHost, "achievements", null, new com.gamericefishpro.space.b1.h(-445498534, new com.gamericefishpro.space.j7.e(d0Var2, i3), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "info", null, new com.gamericefishpro.space.b1.h(2026281499, new com.gamericefishpro.space.j7.e(d0Var2, 3), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "settings", null, new com.gamericefishpro.space.b1.h(203094236, new com.gamericefishpro.space.j7.e(d0Var2, 4), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "statistics", null, new com.gamericefishpro.space.b1.h(-1588448824, new com.gamericefishpro.space.j7.e(d0Var2, 5), true), 254);
                com.gamericefishpro.space.i.a.o(NavHost, "history", null, new com.gamericefishpro.space.b1.h(883331209, new com.gamericefishpro.space.j7.e(d0Var2, 6), true), 254);
                return Unit.a;
            case 18:
                com.gamericefishpro.space.lb.i iVar = (com.gamericefishpro.space.lb.i) this.i;
                String str = (String) this.e;
                com.gamericefishpro.space.p4.b bVar2 = (com.gamericefishpro.space.p4.b) obj;
                iVar.getClass();
                bVar2.e(com.gamericefishpro.space.lb.i.d, str);
                iVar.d(bVar2, str);
                return null;
            case 19:
                com.gamericefishpro.space.i7.d dVar2 = (com.gamericefishpro.space.i7.d) this.i;
                Set set = (Set) this.e;
                com.gamericefishpro.space.n7.g it2 = (com.gamericefishpro.space.n7.g) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return com.gamericefishpro.space.n7.g.a(it2, null, 0, 0, 0, 0, 0, null, true, 0, false, false, false, null, 0, 0, null, null, new com.gamericefishpro.space.n7.a0(dVar2, set), 65407);
            case 20:
                ((com.gamericefishpro.space.r0.b) this.i).a.setValue(new g0((k1) this.e, (k1) obj));
                return Unit.a;
            case 21:
                ((com.gamericefishpro.space.qi.d) this.i).i.removeCallbacks((com.gamericefishpro.space.bb.h) this.e);
                return Unit.a;
            case 22:
                s2 s2Var = (s2) this.i;
                Function1 function1 = (Function1) this.e;
                com.gamericefishpro.space.g0.g LazyVerticalGrid = (com.gamericefishpro.space.g0.g) obj;
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                List list3 = ((com.gamericefishpro.space.r7.d) s2Var.getValue()).a;
                LazyVerticalGrid.c.a(list3.size(), new com.gamericefishpro.space.g0.f(com.gamericefishpro.space.g0.g.d, new com.gamericefishpro.space.k7.a(2, list3), new com.gamericefishpro.space.b1.h(-1117249557, new com.gamericefishpro.space.j7.f(i5, list3, function1), true)));
                return Unit.a;
            case 23:
                com.gamericefishpro.space.t0.x xVar3 = (com.gamericefishpro.space.t0.x) this.i;
                com.gamericefishpro.space.t.i0 i0Var = (com.gamericefishpro.space.t.i0) this.e;
                xVar3.A(obj);
                if (i0Var != null) {
                    i0Var.a(obj);
                }
                return Unit.a;
            case 24:
                u1 u1Var = (u1) this.i;
                Throwable th = (Throwable) this.e;
                Throwable th2 = (Throwable) obj;
                synchronized (u1Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                com.gamericefishpro.space.oh.c.a(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    u1Var.e = th;
                    com.gamericefishpro.space.si.n0 n0Var = u1Var.u;
                    r1 r1Var = r1.d;
                    n0Var.getClass();
                    n0Var.j(null, r1Var);
                }
                return Unit.a;
            case 25:
                com.gamericefishpro.space.w.b0 b0Var = (com.gamericefishpro.space.w.b0) this.i;
                com.gamericefishpro.space.w.z zVar = (com.gamericefishpro.space.w.z) this.e;
                b0Var.a.b(zVar);
                b0Var.b.setValue(Boolean.TRUE);
                return new l1(i, b0Var, zVar);
            case 26:
                com.gamericefishpro.space.pi.x xVar4 = (com.gamericefishpro.space.pi.x) this.i;
                com.gamericefishpro.space.w.l1 l1Var = (com.gamericefishpro.space.w.l1) this.e;
                com.gamericefishpro.space.pi.y yVar = com.gamericefishpro.space.pi.y.d;
                com.gamericefishpro.space.pi.a0.u(xVar4, null, new com.gamericefishpro.space.g5.x(l1Var, null), 1);
                return new com.gamericefishpro.space.w.k1();
            case 27:
                com.gamericefishpro.space.w.l1 l1Var2 = (com.gamericefishpro.space.w.l1) this.i;
                com.gamericefishpro.space.w.l1 l1Var3 = (com.gamericefishpro.space.w.l1) this.e;
                l1Var2.j.add(l1Var3);
                return new l1(i2, l1Var2, l1Var3);
            case 28:
                return new l1(11, (com.gamericefishpro.space.w.l1) this.i, (com.gamericefishpro.space.w.f1) this.e);
            default:
                com.gamericefishpro.space.f1.u uVar2 = (com.gamericefishpro.space.f1.u) this.i;
                FrameLayout frameLayout = (FrameLayout) this.e;
                WebView window = (WebView) obj;
                Intrinsics.checkNotNullParameter(window, "window");
                uVar2.remove(window);
                frameLayout.removeView(window);
                window.destroy();
                return Unit.a;
        }
    }
}
