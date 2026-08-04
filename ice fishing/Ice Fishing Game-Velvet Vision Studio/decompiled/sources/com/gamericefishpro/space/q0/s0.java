package com.gamericefishpro.space.q0;

import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.t0.y0;
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
final class s0 extends w0 {
    public final com.gamericefishpro.space.b0.i a;
    public final boolean b;
    public final com.gamericefishpro.space.w.u c;

    public s0(com.gamericefishpro.space.b0.i iVar, boolean z, com.gamericefishpro.space.w.u uVar) {
        this.a = iVar;
        this.b = z;
        this.c = uVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        v0 v0Var = new v0();
        v0Var.H = this.a;
        v0Var.I = this.b;
        v0Var.J = this.c;
        v0Var.N = Float.NaN;
        v0Var.O = Float.NaN;
        return v0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        v0 v0Var = (v0) lVar;
        v0Var.H = this.a;
        boolean z = v0Var.I;
        boolean z2 = this.b;
        if (z != z2) {
            com.gamericefishpro.space.h2.k.k(v0Var);
        }
        v0Var.I = z2;
        v0Var.J = this.c;
        if (v0Var.M == null && !Float.isNaN(v0Var.O)) {
            v0Var.M = com.gamericefishpro.space.w.c.a(v0Var.O);
        }
        if (v0Var.L != null || Float.isNaN(v0Var.N)) {
            return;
        }
        v0Var.L = com.gamericefishpro.space.w.c.a(v0Var.N);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.a(this.a, s0Var.a) && this.b == s0Var.b && Intrinsics.a(this.c, s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + y0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
