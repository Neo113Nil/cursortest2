package com.gamericefishpro.space.y;

import com.gamericefishpro.space.z.k1;
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
final class d1 extends com.gamericefishpro.space.h2.w0 {
    public final k1 a;
    public final com.gamericefishpro.space.z.v0 b;
    public final boolean c;
    public final com.gamericefishpro.space.z.k d;
    public final com.gamericefishpro.space.b0.i e;
    public final boolean f;
    public final l g;

    public d1(com.gamericefishpro.space.b0.i iVar, l lVar, com.gamericefishpro.space.z.k kVar, com.gamericefishpro.space.z.v0 v0Var, k1 k1Var, boolean z, boolean z2) {
        this.a = k1Var;
        this.b = v0Var;
        this.c = z;
        this.d = kVar;
        this.e = iVar;
        this.f = z2;
        this.g = lVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        e1 e1Var = new e1();
        e1Var.J = this.a;
        e1Var.K = this.b;
        e1Var.L = this.c;
        e1Var.M = this.d;
        e1Var.N = this.e;
        e1Var.O = this.f;
        e1Var.P = this.g;
        return e1Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        ((e1) lVar).F0(this.e, this.g, this.d, this.b, this.a, this.f, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return Intrinsics.a(this.a, d1Var.a) && this.b == d1Var.b && this.c == d1Var.c && Intrinsics.a(this.d, d1Var.d) && Intrinsics.a(this.e, d1Var.e) && this.f == d1Var.f && Intrinsics.a(this.g, d1Var.g);
    }

    public final int hashCode() {
        int iC = com.gamericefishpro.space.t0.y0.c(com.gamericefishpro.space.t0.y0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        com.gamericefishpro.space.z.k kVar = this.d;
        int iHashCode = (iC + (kVar != null ? kVar.hashCode() : 0)) * 31;
        com.gamericefishpro.space.b0.i iVar = this.e;
        int iC2 = com.gamericefishpro.space.t0.y0.c((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 961, 31, this.f);
        l lVar = this.g;
        return iC2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
