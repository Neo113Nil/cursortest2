package com.gamericefishpro.space.h0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
final class q0 extends com.gamericefishpro.space.h2.w0 {
    public final Function0 a;
    public final p0 b;
    public final com.gamericefishpro.space.z.v0 c;
    public final boolean d;

    public q0(Function0 function0, p0 p0Var, com.gamericefishpro.space.z.v0 v0Var, boolean z) {
        this.a = function0;
        this.b = p0Var;
        this.c = v0Var;
        this.d = z;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new u0(this.a, this.b, this.c, this.d);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        u0 u0Var = (u0) lVar;
        u0Var.H = this.a;
        u0Var.I = this.b;
        com.gamericefishpro.space.z.v0 v0Var = u0Var.J;
        com.gamericefishpro.space.z.v0 v0Var2 = this.c;
        if (v0Var != v0Var2) {
            u0Var.J = v0Var2;
            com.gamericefishpro.space.h2.k.l(u0Var);
        }
        boolean z = u0Var.K;
        boolean z2 = this.d;
        if (z == z2) {
            return;
        }
        u0Var.K = z2;
        u0Var.A0();
        com.gamericefishpro.space.h2.k.l(u0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && Intrinsics.a(this.b, q0Var.b) && this.c == q0Var.c && this.d == q0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + com.gamericefishpro.space.t0.y0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
