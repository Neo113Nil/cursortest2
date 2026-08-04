package com.gamericefishpro.space.f5;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public final Context a;
    public final com.gamericefishpro.space.i5.g b;
    public final com.gamericefishpro.space.b9.b c;
    public final Activity d;
    public boolean e;
    public final com.gamericefishpro.space.d.s f;
    public final boolean g;

    public d0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
        this.b = new com.gamericefishpro.space.i5.g(this, new m(this, 0));
        this.c = new com.gamericefishpro.space.b9.b(context, (byte) 0);
        for (Object obj : com.gamericefishpro.space.li.j.c(context, new com.gamericefishpro.space.d0.p(27))) {
            if (((Context) obj) instanceof Activity) {
                this.d = (Activity) obj;
                this.f = new com.gamericefishpro.space.d.s(2, this);
                this.g = true;
                q0 q0Var = this.b.s;
                q0Var.a(new c0(q0Var));
                this.b.s.a(new b(this.a));
                com.gamericefishpro.space.oh.i.b(new m(this, 1));
            }
        }
        obj = null;
        this.d = (Activity) obj;
        this.f = new com.gamericefishpro.space.d.s(2, this);
        this.g = true;
        q0 q0Var2 = this.b.s;
        q0Var2.a(new c0(q0Var2));
        this.b.s.a(new b(this.a));
        com.gamericefishpro.space.oh.i.b(new m(this, 1));
    }

    public static void c(d0 d0Var, String route) {
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        d0Var.b.m(route, null);
    }

    public static void e(d0 d0Var) {
        d0Var.getClass();
        Intrinsics.checkNotNullParameter("level_select", "route");
        com.gamericefishpro.space.i5.g gVar = d0Var.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter("level_select", "route");
        if (gVar.o("level_select", false, false)) {
            gVar.b();
        }
    }

    public final k a() {
        Object next;
        Iterator it = CollectionsKt.G(this.b.f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = com.gamericefishpro.space.li.j.b(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((k) next).e instanceof z)) {
                return (k) next;
            }
        }
        next = null;
        return (k) next;
    }

    public final void b(String route, Function1 builder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        com.gamericefishpro.space.i5.g gVar = this.b;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        gVar.m(route, h.g(builder));
    }

    public final void d() {
        com.gamericefishpro.space.i5.g gVar = this.b;
        if (gVar.f.isEmpty()) {
            return;
        }
        x xVarG = gVar.g();
        Intrinsics.b(xVarG);
        if (gVar.n(xVarG.e.a, true, false)) {
            gVar.b();
        }
    }
}
