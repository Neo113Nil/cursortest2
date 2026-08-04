package com.gamericefishpro.space.ei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends d implements h, com.gamericefishpro.space.ki.a, com.gamericefishpro.space.oh.d {
    private final int A;
    private final int z;

    public i(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.z = i;
        this.A = 0;
    }

    @Override // com.gamericefishpro.space.ei.d
    public final com.gamericefishpro.space.ki.a d() {
        b0.a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return e().equals(iVar.e()) && g().equals(iVar.g()) && this.A == iVar.A && this.z == iVar.z && Intrinsics.a(this.e, iVar.e) && Intrinsics.a(f(), iVar.f());
        }
        if (!(obj instanceof i)) {
            return false;
        }
        com.gamericefishpro.space.ki.a aVar = this.d;
        if (aVar == null) {
            d();
            this.d = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // com.gamericefishpro.space.ei.h
    public final int getArity() {
        return this.z;
    }

    public final int hashCode() {
        return g().hashCode() + ((e().hashCode() + (f() == null ? 0 : f().hashCode() * 31)) * 31);
    }

    public final String toString() {
        com.gamericefishpro.space.ki.a aVar = this.d;
        if (aVar == null) {
            d();
            this.d = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        if ("<init>".equals(e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + e() + " (Kotlin reflection is not available)";
    }
}
