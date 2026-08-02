package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.taxi.masstransit.main.flex.b;
import ru.yandex.taxi.masstransit.main.flex.c;
import ru.yandex.taxi.masstransit.main.router.a;

/* loaded from: classes15.dex */
public final class s14 implements bo30 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public s14(i3g i3gVar, a aVar) {
        this.c = i3gVar;
        n3w a = n3w.a(aVar);
        this.b = a;
        this.d = new aos(a, 8);
        int i = 17;
        this.e = new rut(a, new sp00(i3gVar.H, i), 28);
        this.f = new jl00(new o08(i3gVar.x, i3gVar.q, i3gVar.r0, a, i3gVar.r, i3gVar.G0, i3gVar.H0), 19);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(3);
        List list = Collections.EMPTY_LIST;
        arrayList.add((aos) this.d);
        arrayList.add((rut) this.e);
        arrayList.add((jl00) this.f);
        this.g = new y2r0(arrayList, list);
        this.h = new h0z(vur0.a, sz30.a, 22);
        ArrayList arrayList2 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add((h0z) this.h);
        this.a = i5m.b(new ssj((y2r0) this.g, new y2r0(arrayList2, list2), 2));
        xvf0 b = i5m.b(z210.a);
        this.i = b;
        xvf0 b2 = i5m.b(new wj0(i3gVar.F0, bj30.a, (xvf0) this.a, i3gVar.I0, i3gVar.J0, i5m.b(new mvy(b, i)), i3gVar.v, i3gVar.m, 19));
        this.j = b2;
        f3g f3gVar = i3gVar.o;
        b3g b3gVar = i3gVar.q;
        g3g g3gVar = i3gVar.n;
        f3g f3gVar2 = i3gVar.K0;
        f3g f3gVar3 = i3gVar.r;
        g3g g3gVar2 = i3gVar.e0;
        this.k = n3w.a(new jo30(new wrr(i3gVar.v, b2, i3gVar.w, new ii9((n3w) this.b, new zo0(f3gVar, b3gVar, g3gVar, f3gVar2, f3gVar3, g3gVar2, 27), i3gVar.e, i3gVar.A, i3gVar.A0, g3gVar, i3gVar.r0, f3gVar, f3gVar3, i3gVar.L0, i3gVar.M0, i3gVar.T, g3gVar2, i3gVar.N0, i3gVar.O0, (xvf0) this.i), i3gVar.b0, g3gVar2, i3gVar.P0, 10)));
        this.l = i5m.b(new q720((xvf0) this.j, 28));
        this.m = i5m.b(new q720((xvf0) this.j, 29));
        this.n = n3w.a(new ap30(new ht10(i3gVar.z0, i3gVar.e, false, 11)));
        g3g g3gVar3 = i3gVar.n;
        g3g g3gVar4 = i3gVar.Q0;
        y2s0 y2s0Var = new y2s0(i3gVar.v, new i020(g3gVar3, g3gVar4, 28), i3gVar.R0, 9);
        b3g b3gVar2 = i3gVar.q;
        this.o = n3w.a(new zo30(new m(y2s0Var, b3gVar2, new l9t0((v7p) new i020(b3gVar2, i3gVar.C0, 26), (xvf0) new s730(i3gVar.D0, 8), (xvf0) g3gVar4, (xvf0) i3gVar.S0, 8, false), i3gVar.T0, i3gVar.e, i3gVar.A0, i3gVar.w0, i3gVar.U0, i3gVar.A, i3gVar.i)));
    }

    public b a() {
        flex.engine.a aVar = (flex.engine.a) ((xvf0) this.l).get();
        i6r i6rVar = ((i3g) this.c).a;
        Context p1 = ((c0g) i6rVar).p1();
        q5z.h(p1);
        ui30 ui30Var = new ui30();
        wnt m3 = ((c0g) i6rVar).m3();
        q5z.h(m3);
        c0g c0gVar = (c0g) i6rVar;
        wu30 Y0 = c0gVar.z.Y0();
        po21 C6 = c0gVar.C6();
        q5z.h(C6);
        lz30 lz30Var = (lz30) c0gVar.Li.get();
        q5z.h(lz30Var);
        c cVar = new c(m3, Y0, C6, lz30Var);
        hi30 hi30Var = (hi30) ((c0g) i6rVar).z.Zq.get();
        q5z.h(hi30Var);
        return new b(aVar, p1, ui30Var, cVar, hi30Var);
    }

    public /* synthetic */ s14(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        this.c = obj;
        this.a = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.j = obj9;
        this.k = obj10;
        this.l = obj11;
        this.m = obj12;
        this.n = obj13;
        this.b = obj14;
        this.o = obj15;
    }

    public s14(aag aagVar, gaq0 gaq0Var, aag aagVar2, aag aagVar3, fat0 fat0Var, xvf0 xvf0Var, aag aagVar4, d701 d701Var, aag aagVar5, l9t0 l9t0Var, aag aagVar6, aag aagVar7, aag aagVar8, aag aagVar9, aag aagVar10) {
        this.c = aagVar;
        this.d = gaq0Var;
        this.e = aagVar2;
        this.f = aagVar3;
        this.g = fat0Var;
        this.a = xvf0Var;
        this.h = aagVar4;
        this.i = d701Var;
        this.j = aagVar5;
        this.k = l9t0Var;
        this.l = aagVar6;
        this.m = aagVar7;
        this.n = aagVar8;
        this.b = aagVar9;
        this.o = aagVar10;
    }

    public s14(ke8 ke8Var) {
        this.c = ke8Var;
        this.d = new txf(ke8Var, 11);
        this.e = new txf(ke8Var, 3);
        this.a = i5m.b(new ba9(new txf(ke8Var, 8), 18));
        this.f = i5m.b(tpa.a);
        this.g = i5m.b(bv9.a);
        this.h = new txf(ke8Var, 6);
        this.i = new txf(ke8Var, 9);
        txf txfVar = new txf(ke8Var, 7);
        this.j = new ba9(new ba9(txfVar, 17), 16);
        txf txfVar2 = new txf(ke8Var, 10);
        txf txfVar3 = new txf(ke8Var, 0);
        g6 g6Var = new g6((xvf0) new txf(ke8Var, 12), (xvf0) this.a, (xvf0) new txf(ke8Var, 2), (xvf0) new txf(ke8Var, 1), (xvf0) new txf(ke8Var, 5), 21, (byte) 0);
        this.k = g6Var;
        this.b = n3w.a(new jt9(new an8(txfVar2, txfVar3, txfVar, g6Var, 7)));
        n3w a = n3w.a(new ct9(new dt9((g6) this.k)));
        int i = 22;
        this.l = new yc(i, (n3w) this.b, (txf) this.h, (txf) this.i, (txf) this.e, (ba9) this.j, a);
        this.m = i5m.b(ppa.a);
        this.n = new txf(ke8Var, 4);
        this.o = i5m.b(yt9.a);
    }

    public s14(FrameLayout frameLayout) {
        this.c = (ViewGroup) frameLayout.findViewById(e9h0.image_viewer_toolbar);
        this.a = (ViewPager) frameLayout.findViewById(e9h0.view_pager);
        this.d = (ImageView) frameLayout.findViewById(e9h0.transition_image);
        this.e = (ViewGroup) frameLayout.findViewById(e9h0.action_bar);
        this.f = frameLayout.findViewById(e9h0.reply);
        this.g = frameLayout.findViewById(e9h0.forward);
        this.h = frameLayout.findViewById(e9h0.resend);
        this.i = frameLayout.findViewById(e9h0.show_message);
        this.j = frameLayout.findViewById(e9h0.download);
        this.k = frameLayout.findViewById(e9h0.share);
        this.l = frameLayout.findViewById(e9h0.pin);
        this.m = frameLayout.findViewById(e9h0.go_back);
        this.n = frameLayout.findViewById(e9h0.remove);
        this.b = (TextView) frameLayout.findViewById(e9h0.from);
        this.o = (TextView) frameLayout.findViewById(e9h0.send_time);
    }

    public /* synthetic */ s14(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14) {
        this.a = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = v7pVar;
        this.k = xvf0Var9;
        this.l = xvf0Var10;
        this.m = xvf0Var11;
        this.n = xvf0Var12;
        this.b = xvf0Var13;
        this.o = xvf0Var14;
    }
}
