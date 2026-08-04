package com.gamericefishpro.space.v;

import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.t0.v0;
import com.gamericefishpro.space.w.f1;
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
final class m<S> extends w0 {
    public final f1 a;
    public final v0 b;
    public final q c;

    public m(f1 f1Var, v0 v0Var, q qVar) {
        this.a = f1Var;
        this.b = v0Var;
        this.c = qVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        p pVar = new p();
        pVar.H = this.a;
        pVar.I = this.b;
        pVar.J = this.c;
        pVar.K = h.a;
        return pVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        p pVar = (p) lVar;
        pVar.H = this.a;
        pVar.I = this.b;
        pVar.J = this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.a(mVar.a, this.a) && mVar.b.equals(this.b);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        f1 f1Var = this.a;
        return this.b.hashCode() + ((iHashCode + (f1Var != null ? f1Var.hashCode() : 0)) * 31);
    }
}
