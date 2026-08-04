package com.gamericefishpro.space.h0;

import kotlin.Metadata;
import kotlin.Unit;

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
public final class f extends com.gamericefishpro.space.h2.w0 {
    public e a;
    public com.gamericefishpro.space.pi.n b;

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new e(this);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final /* bridge */ /* synthetic */ void e(com.gamericefishpro.space.h1.l lVar) {
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final Object f(com.gamericefishpro.space.vh.c cVar) {
        com.gamericefishpro.space.pi.n nVarA = this.b;
        if (nVarA == null) {
            nVarA = com.gamericefishpro.space.pi.a0.a();
            this.b = nVarA;
            e eVar = this.a;
            if (eVar != null && eVar.G) {
                eVar.A0();
            }
        }
        Object objR = nVarA.r(cVar);
        return objR == com.gamericefishpro.space.uh.a.d ? objR : Unit.a;
    }

    public final int hashCode() {
        return 234;
    }
}
