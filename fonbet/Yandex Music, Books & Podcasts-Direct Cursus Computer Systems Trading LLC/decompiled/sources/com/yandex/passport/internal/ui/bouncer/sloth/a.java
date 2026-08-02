package com.yandex.passport.internal.ui.bouncer.sloth;

import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.api.l2;
import com.yandex.passport.api.m2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.o2;
import com.yandex.passport.api.p2;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.r2;
import com.yandex.passport.api.t2;
import com.yandex.passport.api.u2;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.properties.x;
import com.yandex.passport.sloth.ui.dependencies.j;
import com.yandex.passport.sloth.ui.dependencies.l;
import com.yandex.passport.sloth.ui.dependencies.o;
import defpackage.b6e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements o {
    public final com.yandex.passport.sloth.ui.dependencies.g a;
    public final l b;
    public final com.yandex.passport.sloth.ui.dependencies.i c;
    public final com.yandex.passport.internal.ui.sloth.a d;
    public com.yandex.plus.core.network.api.utils.a e;
    public final boolean f;

    public a(v vVar, com.yandex.passport.internal.ui.sloth.a aVar, x xVar) {
        com.yandex.passport.sloth.ui.dependencies.g fVar;
        l jVar;
        com.yandex.passport.sloth.ui.dependencies.i hVar;
        vVar.getClass();
        aVar.getClass();
        xVar.getClass();
        l2 l2Var = vVar.a;
        if (l2Var instanceof j2) {
            fVar = com.yandex.passport.sloth.ui.dependencies.e.b;
        } else {
            if (!(l2Var instanceof k2)) {
                b6e.s();
                throw null;
            }
            fVar = new com.yandex.passport.sloth.ui.dependencies.f(((k2) l2Var).a);
        }
        this.a = fVar;
        u2 u2Var = vVar.b;
        if (Intrinsics.d(u2Var, q2.a)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.d;
        } else if (Intrinsics.d(u2Var, r2.a)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.e;
        } else if (Intrinsics.d(u2Var, t2.a)) {
            jVar = com.yandex.passport.sloth.ui.dependencies.e.f;
        } else {
            if (!(u2Var instanceof p2)) {
                b6e.s();
                throw null;
            }
            p2 p2Var = (p2) u2Var;
            jVar = new j(p2Var.a, p2Var.b);
        }
        this.b = jVar;
        o2 o2Var = vVar.c;
        if (Intrinsics.d(o2Var, n2.a)) {
            hVar = com.yandex.passport.sloth.ui.dependencies.e.c;
        } else {
            if (!(o2Var instanceof m2)) {
                b6e.s();
                throw null;
            }
            hVar = new com.yandex.passport.sloth.ui.dependencies.h(((m2) o2Var).a);
        }
        this.c = hVar;
        this.d = aVar;
        this.e = xVar.x ? com.yandex.passport.sloth.ui.dependencies.a.a : com.yandex.passport.sloth.ui.dependencies.b.a;
        this.f = vVar.d;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final l a() {
        return this.b;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.internal.ui.sloth.a b() {
        return this.d;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final boolean c() {
        return this.f;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.sloth.ui.dependencies.i d() {
        return this.c;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.plus.core.network.api.utils.a e() {
        return this.e;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.o
    public final com.yandex.passport.sloth.ui.dependencies.g f() {
        return this.a;
    }
}
