package com.gamericefishpro.space.y;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
final class p extends com.gamericefishpro.space.h2.w0 {
    public final long a;
    public final com.gamericefishpro.space.o1.o b;
    public final float c;
    public final com.gamericefishpro.space.o1.k0 d;

    public p(long j, com.gamericefishpro.space.o1.i0 i0Var, com.gamericefishpro.space.o1.k0 k0Var, int i) {
        j = (i & 1) != 0 ? com.gamericefishpro.space.o1.s.g : j;
        i0Var = (i & 2) != 0 ? null : i0Var;
        this.a = j;
        this.b = i0Var;
        this.c = 1.0f;
        this.d = k0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        r rVar = new r();
        rVar.H = this.a;
        rVar.I = this.b;
        rVar.J = this.c;
        rVar.K = this.d;
        rVar.L = 9205357640488583168L;
        return rVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        r rVar = (r) lVar;
        rVar.H = this.a;
        rVar.I = this.b;
        rVar.J = this.c;
        com.gamericefishpro.space.o1.k0 k0Var = rVar.K;
        com.gamericefishpro.space.o1.k0 k0Var2 = this.d;
        if (!Intrinsics.a(k0Var, k0Var2)) {
            rVar.K = k0Var2;
            com.gamericefishpro.space.h2.k.l(rVar);
        }
        com.gamericefishpro.space.h2.k.j(rVar);
    }

    public final boolean equals(Object obj) {
        p pVar = obj instanceof p ? (p) obj : null;
        return pVar != null && com.gamericefishpro.space.o1.s.d(this.a, pVar.a) && Intrinsics.a(this.b, pVar.b) && this.c == pVar.c && Intrinsics.a(this.d, pVar.d);
    }

    public final int hashCode() {
        int i = com.gamericefishpro.space.o1.s.h;
        com.gamericefishpro.space.oh.w wVar = com.gamericefishpro.space.oh.x.d;
        int iHashCode = Long.hashCode(this.a) * 31;
        com.gamericefishpro.space.o1.o oVar = this.b;
        return this.d.hashCode() + com.gamericefishpro.space.t0.y0.a(this.c, (iHashCode + (oVar != null ? oVar.hashCode() : 0)) * 31, 31);
    }
}
