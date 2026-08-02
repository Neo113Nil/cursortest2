package com.yandex.plus.experiments.api;

import com.yandex.plus.core.android.extensions.c;
import defpackage.f1d;
import defpackage.msa;
import defpackage.nsa;
import defpackage.tf6;
import defpackage.tlm;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final com.yandex.plus.core.config.a a;
    public final tf6 b;
    public final kotlinx.coroutines.a c;
    public final c d;
    public final com.yandex.plus.core.graphql.internal.c e;
    public final com.yandex.plus.core.graphql.target.a f;
    public final Function0 g;
    public final Map h;
    public final com.yandex.plus.log.api.b i;
    public final long j;

    public b(com.yandex.plus.core.config.a aVar, tf6 tf6Var, kotlinx.coroutines.a aVar2, c cVar, com.yandex.plus.core.graphql.internal.c cVar2, com.yandex.plus.core.graphql.target.a aVar3, Function0 function0, Map map, com.yandex.plus.log.api.b bVar, long j) {
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        cVar2.getClass();
        aVar3.getClass();
        map.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = tf6Var;
        this.c = aVar2;
        this.d = cVar;
        this.e = cVar2;
        this.f = aVar3;
        this.g = function0;
        this.h = map;
        this.i = bVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b.equals(bVar.b) && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d) && Intrinsics.d(this.e, bVar.e) && Intrinsics.d(this.f, bVar.f) && this.g.equals(bVar.g) && Intrinsics.d(this.h, bVar.h) && Intrinsics.d(this.i, bVar.i) && nsa.e(this.j, bVar.j);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + f1d.b(this.h, (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        msa msaVar = nsa.b;
        return tlm.c(this.j, hashCode, 961);
    }

    public final String toString() {
        return "Dependencies(environment=" + this.a + ", coroutineScope=" + this.b + ", ioDispatcher=" + this.c + ", currentTimeProvider=" + this.d + ", apolloClientWrapper=" + this.e + ", geoLocationInputFactory=" + this.f + ", getPuid=" + this.g + ", experimentsRequestParams=" + this.h + ", logger=" + this.i + ", experimentsLifeTime=" + ((Object) nsa.t(this.j)) + ", testIdsOverride=null, flagsOverride=null)";
    }
}
