package com.gamericefishpro.space.d0;

import kotlin.Metadata;

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
public final class n0 extends com.gamericefishpro.space.h2.w0 {
    public final float a;

    public n0(float f) {
        this.a = f;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        o0 o0Var = new o0();
        o0Var.H = this.a;
        o0Var.I = true;
        return o0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        o0 o0Var = (o0) lVar;
        o0Var.H = this.a;
        o0Var.I = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        return n0Var != null && this.a == n0Var.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Float.hashCode(this.a) * 31);
    }
}
