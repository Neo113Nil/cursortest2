package com.gamericefishpro.space.y;

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
final class y extends com.gamericefishpro.space.h2.w0 {
    public final com.gamericefishpro.space.b0.i a;
    public final boolean b;
    public final boolean c;
    public final Function0 d;

    public y(com.gamericefishpro.space.b0.i iVar, boolean z, boolean z2, Function0 function0) {
        this.a = iVar;
        this.b = z;
        this.c = z2;
        this.d = function0;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new z(this.a, this.b, this.c, null, this.d);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        ((z) lVar).J0(this.a, this.b, this.c, null, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.a(this.a, yVar.a) && this.b == yVar.b && this.c == yVar.c && this.d == yVar.d;
    }

    public final int hashCode() {
        com.gamericefishpro.space.b0.i iVar = this.a;
        return this.d.hashCode() + com.gamericefishpro.space.t0.y0.c(com.gamericefishpro.space.t0.y0.c((iVar != null ? iVar.hashCode() : 0) * 961, 31, this.b), 29791, this.c);
    }
}
