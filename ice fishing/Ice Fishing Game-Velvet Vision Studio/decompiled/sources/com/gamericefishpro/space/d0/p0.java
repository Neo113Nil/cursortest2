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
final class p0 extends com.gamericefishpro.space.h2.w0 {
    public final float a;
    public final float b;

    public p0(float f, float f2, p pVar) {
        this.a = f;
        this.b = f2;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        r0 r0Var = new r0();
        r0Var.H = this.a;
        r0Var.I = this.b;
        r0Var.J = true;
        return r0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        r0 r0Var = (r0) lVar;
        float f = r0Var.H;
        float f2 = this.a;
        boolean zB = com.gamericefishpro.space.c3.f.b(f, f2);
        float f3 = this.b;
        if (!zB || !com.gamericefishpro.space.c3.f.b(r0Var.I, f3) || !r0Var.J) {
            com.gamericefishpro.space.h2.k.s(r0Var).U(false);
        }
        r0Var.H = f2;
        r0Var.I = f3;
        r0Var.J = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        p0 p0Var = obj instanceof p0 ? (p0) obj : null;
        return p0Var != null && com.gamericefishpro.space.c3.f.b(this.a, p0Var.a) && com.gamericefishpro.space.c3.f.b(this.b, p0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + com.gamericefishpro.space.t0.y0.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) com.gamericefishpro.space.c3.f.c(this.a)) + ", y=" + ((Object) com.gamericefishpro.space.c3.f.c(this.b)) + ", rtlAware=true)";
    }
}
