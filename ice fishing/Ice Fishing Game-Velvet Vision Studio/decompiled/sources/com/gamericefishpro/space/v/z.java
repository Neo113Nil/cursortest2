package com.gamericefishpro.space.v;

import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.w.l1;
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
final class z extends w0 {
    public final l1 a;
    public final j0 b;
    public final k0 c;
    public final Function0 d;
    public final a0 e;

    public z(l1 l1Var, j0 j0Var, k0 k0Var, Function0 function0, a0 a0Var) {
        this.a = l1Var;
        this.b = j0Var;
        this.c = k0Var;
        this.d = function0;
        this.e = a0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        i0 i0Var = new i0();
        i0Var.H = this.a;
        i0Var.I = this.c;
        i0Var.J = this.d;
        i0Var.K = this.e;
        i0Var.L = w.a;
        com.gamericefishpro.space.c3.b.b(0, 0, 15);
        new h0(i0Var, 0);
        new h0(i0Var, 1);
        return i0Var;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        i0 i0Var = (i0) lVar;
        i0Var.H = this.a;
        i0Var.I = this.c;
        i0Var.J = this.d;
        i0Var.K = this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return zVar.a.equals(this.a) && zVar.b.equals(this.b) && Intrinsics.a(zVar.c, this.c) && zVar.d == this.d && Intrinsics.a(zVar.e, this.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 923521)) * 31)) * 31)) * 31);
    }
}
