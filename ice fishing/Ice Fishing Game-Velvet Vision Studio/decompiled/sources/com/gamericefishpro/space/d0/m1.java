package com.gamericefishpro.space.d0;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.gamericefishpro.space.R;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final WeakHashMap v = new WeakHashMap();
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final j1 j;
    public final com.gamericefishpro.space.t0.f1 k;
    public final j1 l;
    public final j1 m;
    public final j1 n;
    public final j1 o;
    public final j1 p;
    public final j1 q;
    public final j1 r;
    public final boolean s;
    public int t;
    public final l0 u;

    public m1(View view) {
        a aVarC = v.c(4, "captionBar");
        this.a = aVarC;
        a aVarC2 = v.c(128, "displayCutout");
        this.b = aVarC2;
        a aVarC3 = v.c(8, "ime");
        this.c = aVarC3;
        a aVarC4 = v.c(32, "mandatorySystemGestures");
        this.d = aVarC4;
        a aVarC5 = v.c(2, "navigationBars");
        this.e = aVarC5;
        a aVarC6 = v.c(1, "statusBars");
        this.f = aVarC6;
        a aVarC7 = v.c(519, "systemBars");
        this.g = aVarC7;
        a aVarC8 = v.c(16, "systemGestures");
        this.h = aVarC8;
        a aVarC9 = v.c(64, "tappableElement");
        this.i = aVarC9;
        j1 j1Var = new j1(new m0(0, 0, 0, 0), "waterfall");
        this.j = j1Var;
        this.k = com.gamericefishpro.space.t0.i.v(null);
        new i1(new i1(aVarC7, aVarC3), aVarC2);
        new i1(new i1(new i1(aVarC9, aVarC4), aVarC8), j1Var);
        this.l = v.d(4, "captionBarIgnoringVisibility");
        this.m = v.d(2, "navigationBarsIgnoringVisibility");
        this.n = v.d(1, "statusBarsIgnoringVisibility");
        this.o = v.d(519, "systemBarsIgnoringVisibility");
        this.p = v.d(64, "tappableElementIgnoringVisibility");
        this.q = new j1(new m0(0, 0, 0, 0), "imeAnimationTarget");
        this.r = new j1(new m0(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new l0(this);
        Field field = com.gamericefishpro.space.d4.l0.a;
        com.gamericefishpro.space.d4.o1 o1VarA = com.gamericefishpro.space.d4.e0.a(view);
        if (o1VarA != null) {
            com.gamericefishpro.space.d4.l1 l1Var = o1VarA.a;
            aVarC.f(l1Var.q(4));
            aVarC2.f(l1Var.q(128));
            aVarC3.f(l1Var.q(8));
            aVarC4.f(l1Var.q(32));
            aVarC5.f(l1Var.q(2));
            aVarC6.f(l1Var.q(1));
            aVarC7.f(l1Var.q(519));
            aVarC8.f(l1Var.q(16));
            aVarC9.f(l1Var.q(64));
        }
    }

    public static void a(m1 m1Var, com.gamericefishpro.space.d4.o1 o1Var) {
        boolean z = false;
        m1Var.a.g(o1Var, 0);
        m1Var.c.g(o1Var, 0);
        m1Var.b.g(o1Var, 0);
        m1Var.e.g(o1Var, 0);
        m1Var.f.g(o1Var, 0);
        m1Var.g.g(o1Var, 0);
        m1Var.h.g(o1Var, 0);
        m1Var.i.g(o1Var, 0);
        m1Var.d.g(o1Var, 0);
        m1Var.l.f(j.p(o1Var.a.h(4)));
        m1Var.m.f(j.p(o1Var.a.h(2)));
        m1Var.n.f(j.p(o1Var.a.h(1)));
        m1Var.o.f(j.p(o1Var.a.h(519)));
        m1Var.p.f(j.p(o1Var.a.h(64)));
        com.gamericefishpro.space.d4.k kVarF = o1Var.a.f();
        m1Var.j.f(j.p(kVarF != null ? kVarF.a() : com.gamericefishpro.space.u3.b.e));
        com.gamericefishpro.space.o1.h hVar = null;
        if (kVarF != null) {
            Path pathA = Build.VERSION.SDK_INT >= 31 ? com.gamericefishpro.space.d4.j.a(kVarF.a) : null;
            if (pathA != null) {
                hVar = new com.gamericefishpro.space.o1.h(pathA);
            }
        }
        m1Var.k.setValue(hVar);
        synchronized (com.gamericefishpro.space.f1.p.c) {
            com.gamericefishpro.space.t.i0 i0Var = com.gamericefishpro.space.f1.p.j.h;
            if (i0Var != null && i0Var.h()) {
                z = true;
            }
        }
        if (z) {
            com.gamericefishpro.space.f1.p.a();
        }
    }
}
