package com.gamericefishpro.space.h0;

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
final class m extends com.gamericefishpro.space.h2.w0 {
    public final r a;
    public final l b;
    public final com.gamericefishpro.space.z.v0 c;

    public m(r rVar, l lVar, com.gamericefishpro.space.z.v0 v0Var) {
        this.a = rVar;
        this.b = lVar;
        this.c = v0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        q qVar = new q();
        qVar.H = this.a;
        qVar.I = this.b;
        qVar.J = this.c;
        return qVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        q qVar = (q) lVar;
        qVar.H = this.a;
        qVar.I = this.b;
        qVar.J = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(this.a, mVar.a) && Intrinsics.a(this.b, mVar.b) && this.c == mVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + com.gamericefishpro.space.t0.y0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, false);
    }
}
