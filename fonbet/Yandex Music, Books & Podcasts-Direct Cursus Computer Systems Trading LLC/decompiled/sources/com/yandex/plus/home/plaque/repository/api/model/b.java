package com.yandex.plus.home.plaque.repository.api.model;

import com.yandex.plus.plaquesdk.plaque.api.models.display.u;
import com.yandex.plus.plaquesdk.plaque.api.models.display.x;
import com.yandex.plus.plaquesdk.plaque.api.models.h0;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import com.yandex.plus.plaquesdk.plaque.api.models.t;
import defpackage.e5b;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c {
    public static final b g;
    public final j0 a;
    public final String b;
    public final Map c;
    public final Map d;
    public final int e;
    public final s f;

    static {
        j0 j0Var = new j0("FALLBACK", new t("FALLBACK", null, com.yandex.plus.plaquesdk.plaque.api.models.a.d, new x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, u.a, 0)), null, i0.d, h0.c, false);
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        g = new b(j0Var, "FALLBACK", e5bVar, e5bVar, 0, new g(true));
    }

    public b(j0 j0Var, String str, Map map, Map map2, int i, s sVar) {
        str.getClass();
        map.getClass();
        map2.getClass();
        this.a = j0Var;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = i;
        this.f = sVar;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.model.c
    public final Map a() {
        return this.c;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.model.c
    public final j0 b() {
        return this.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.model.c
    public final Map c() {
        return this.d;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.model.c
    public final int d() {
        return this.e;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.model.c
    public final s e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && Intrinsics.d(this.b, bVar.b) && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d) && this.e == bVar.e && this.f.equals(bVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1d.a(this.e, f1d.b(this.d, f1d.b(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        return "Default(plaqueModel=" + this.a + ", feedbackToken=" + this.b + ", metricContext=" + this.c + ", serviceMeta=" + this.d + ", priority=" + this.e + ", rootPredicate=" + this.f + ')';
    }
}
