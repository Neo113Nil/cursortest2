package com.gamericefishpro.space.d0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

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
final class s0 extends com.gamericefishpro.space.h2.w0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Function1 e;

    public s0(float f, float f2, float f3, float f4, Function1 function1) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = function1;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            com.gamericefishpro.space.e0.a.a("Padding must be non-negative");
        }
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        t0 t0Var = new t0();
        t0Var.H = this.a;
        t0Var.I = this.b;
        t0Var.J = this.c;
        t0Var.K = this.d;
        t0Var.L = true;
        return t0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        t0 t0Var = (t0) lVar;
        t0Var.H = this.a;
        t0Var.I = this.b;
        t0Var.J = this.c;
        t0Var.K = this.d;
        t0Var.L = true;
    }

    public final boolean equals(Object obj) {
        s0 s0Var = obj instanceof s0 ? (s0) obj : null;
        return s0Var != null && com.gamericefishpro.space.c3.f.b(this.a, s0Var.a) && com.gamericefishpro.space.c3.f.b(this.b, s0Var.b) && com.gamericefishpro.space.c3.f.b(this.c, s0Var.c) && com.gamericefishpro.space.c3.f.b(this.d, s0Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + com.gamericefishpro.space.t0.y0.a(this.d, com.gamericefishpro.space.t0.y0.a(this.c, com.gamericefishpro.space.t0.y0.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
