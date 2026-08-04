package com.gamericefishpro.space.y;

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
public final class x extends com.gamericefishpro.space.h2.w0 {
    public final float a;
    public final com.gamericefishpro.space.o1.m0 b;
    public final com.gamericefishpro.space.o1.k0 c;

    public x(float f, com.gamericefishpro.space.o1.m0 m0Var, com.gamericefishpro.space.o1.k0 k0Var) {
        this.a = f;
        this.b = m0Var;
        this.c = k0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        return new w(this.a, this.b, this.c);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        w wVar = (w) lVar;
        float f = wVar.K;
        com.gamericefishpro.space.l1.c cVar = wVar.N;
        float f2 = this.a;
        if (!com.gamericefishpro.space.c3.f.b(f, f2)) {
            wVar.K = f2;
            cVar.A0();
        }
        com.gamericefishpro.space.o1.m0 m0Var = wVar.L;
        com.gamericefishpro.space.o1.m0 m0Var2 = this.b;
        if (!Intrinsics.a(m0Var, m0Var2)) {
            wVar.L = m0Var2;
            cVar.A0();
        }
        com.gamericefishpro.space.o1.k0 k0Var = wVar.M;
        com.gamericefishpro.space.o1.k0 k0Var2 = this.c;
        if (Intrinsics.a(k0Var, k0Var2)) {
            return;
        }
        wVar.M = k0Var2;
        cVar.A0();
        com.gamericefishpro.space.h2.k.l(wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return com.gamericefishpro.space.c3.f.b(this.a, xVar.a) && this.b.equals(xVar.b) && Intrinsics.a(this.c, xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) com.gamericefishpro.space.c3.f.c(this.a)) + ", brush=" + this.b + ", shape=" + this.c + ')';
    }
}
