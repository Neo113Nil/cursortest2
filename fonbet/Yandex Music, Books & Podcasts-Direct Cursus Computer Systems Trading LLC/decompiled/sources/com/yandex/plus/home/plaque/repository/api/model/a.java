package com.yandex.plus.home.plaque.repository.api.model;

import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.f1d;
import defpackage.k5r;
import defpackage.msa;
import defpackage.nsa;
import defpackage.tlm;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {
    public final j0 a;
    public final String b;
    public final Map c;
    public final Map d;
    public final int e;
    public final s f;
    public final String g;
    public final long h;
    public final long i;

    public a(j0 j0Var, String str, Map map, Map map2, int i, s sVar, String str2, long j, long j2) {
        str.getClass();
        map.getClass();
        map2.getClass();
        sVar.getClass();
        this.a = j0Var;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = i;
        this.f = sVar;
        this.g = str2;
        this.h = j;
        this.i = j2;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Intrinsics.d(this.b, aVar.b) && Intrinsics.d(this.c, aVar.c) && Intrinsics.d(this.d, aVar.d) && this.e == aVar.e && Intrinsics.d(this.f, aVar.f) && Intrinsics.d(this.g, aVar.g) && nsa.e(this.h, aVar.h) && nsa.e(this.i, aVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + f1d.a(this.e, f1d.b(this.d, f1d.b(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31), 31), 31)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.i) + tlm.c(this.h, hashCode2, 31);
    }

    public final String toString() {
        return "Conditional(plaqueModel=" + this.a + ", feedbackToken=" + this.b + ", metricContext=" + this.c + ", serviceMeta=" + this.d + ", priority=" + this.e + ", rootPredicate=" + this.f + ", seenContext=" + this.g + ", showAfter=" + ((Object) nsa.t(this.h)) + ", closeAfter=" + ((Object) nsa.t(this.i)) + ')';
    }
}
