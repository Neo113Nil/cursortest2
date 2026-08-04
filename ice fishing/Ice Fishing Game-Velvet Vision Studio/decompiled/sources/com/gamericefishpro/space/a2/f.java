package com.gamericefishpro.space.a2;

import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.w0;
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
final class f extends w0 {
    public final e a;

    public f(e eVar) {
        this.a = eVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final l d() {
        return new j(com.gamericefishpro.space.f3.k.a, this.a);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(l lVar) {
        j jVar = (j) lVar;
        jVar.H = com.gamericefishpro.space.f3.k.a;
        e eVar = jVar.I;
        if (eVar.a == jVar) {
            eVar.a = null;
        }
        e eVar2 = this.a;
        if (!eVar2.equals(eVar)) {
            jVar.I = eVar2;
        }
        if (jVar.G) {
            e eVar3 = jVar.I;
            eVar3.a = jVar;
            eVar3.b = null;
            jVar.J = null;
            eVar3.c = new b(1, jVar);
            eVar3.d = jVar.o0();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        Object obj2 = com.gamericefishpro.space.f3.k.a;
        return obj2.equals(obj2) && fVar.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (com.gamericefishpro.space.f3.k.a.hashCode() * 31);
    }
}
