package com.gamericefishpro.space.pi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final Object a;
    public final e b;
    public final com.gamericefishpro.space.di.c c;
    public final Object d;
    public final Throwable e;

    public p(Object obj, e eVar, com.gamericefishpro.space.di.c cVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = eVar;
        this.c = cVar;
        this.d = obj2;
        this.e = th;
    }

    public static p a(p pVar, e eVar, Throwable th, int i) {
        Object obj = pVar.a;
        if ((i & 2) != 0) {
            eVar = pVar.b;
        }
        e eVar2 = eVar;
        com.gamericefishpro.space.di.c cVar = pVar.c;
        Object obj2 = pVar.d;
        if ((i & 16) != 0) {
            th = pVar.e;
        }
        return new p(obj, eVar2, cVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.a(this.a, pVar.a) && Intrinsics.a(this.b, pVar.b) && Intrinsics.a(this.c, pVar.c) && Intrinsics.a(this.d, pVar.d) && Intrinsics.a(this.e, pVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        com.gamericefishpro.space.di.c cVar = this.c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ p(Object obj, e eVar, com.gamericefishpro.space.di.c cVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : eVar, (i & 4) != 0 ? null : cVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
