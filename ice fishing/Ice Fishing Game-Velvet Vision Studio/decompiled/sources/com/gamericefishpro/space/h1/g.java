package com.gamericefishpro.space.h1;

import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements m {
    public final m a;
    public final m b;

    public g(m mVar, m mVar2) {
        this.a = mVar;
        this.b = mVar2;
    }

    @Override // com.gamericefishpro.space.h1.m
    public final boolean a(Function1 function1) {
        return this.a.a(function1) && this.b.a(function1);
    }

    @Override // com.gamericefishpro.space.h1.m
    public final Object b(Object obj, Function2 function2) {
        return this.b.b(this.a.b(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.a, gVar.a) && Intrinsics.a(this.b, gVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return y0.i(new StringBuilder("["), (String) b("", f.d), ']');
    }
}
