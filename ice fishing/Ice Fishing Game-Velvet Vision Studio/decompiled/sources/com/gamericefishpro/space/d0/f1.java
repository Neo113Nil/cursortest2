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
final class f1 extends com.gamericefishpro.space.h2.w0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public f1(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        h1 h1Var = new h1();
        h1Var.H = this.a;
        h1Var.I = this.b;
        h1Var.J = this.c;
        h1Var.K = this.d;
        h1Var.L = this.e;
        return h1Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        h1 h1Var = (h1) lVar;
        h1Var.H = this.a;
        h1Var.I = this.b;
        h1Var.J = this.c;
        h1Var.K = this.d;
        h1Var.L = this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return com.gamericefishpro.space.c3.f.b(this.a, f1Var.a) && com.gamericefishpro.space.c3.f.b(this.b, f1Var.b) && com.gamericefishpro.space.c3.f.b(this.c, f1Var.c) && com.gamericefishpro.space.c3.f.b(this.d, f1Var.d) && this.e == f1Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + com.gamericefishpro.space.t0.y0.a(this.d, com.gamericefishpro.space.t0.y0.a(this.c, com.gamericefishpro.space.t0.y0.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public /* synthetic */ f1(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }
}
