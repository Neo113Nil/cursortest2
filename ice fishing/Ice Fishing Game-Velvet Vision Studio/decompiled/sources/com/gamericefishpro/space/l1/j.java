package com.gamericefishpro.space.l1;

import com.gamericefishpro.space.f2.o0;
import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.t0.y0;
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
final class j extends w0 {
    public final com.gamericefishpro.space.t1.b a;
    public final com.gamericefishpro.space.h1.e b;
    public final o0 c;
    public final float d;
    public final com.gamericefishpro.space.o1.k e;

    public j(com.gamericefishpro.space.t1.b bVar, com.gamericefishpro.space.h1.e eVar, o0 o0Var, float f, com.gamericefishpro.space.o1.k kVar) {
        this.a = bVar;
        this.b = eVar;
        this.c = o0Var;
        this.d = f;
        this.e = kVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final com.gamericefishpro.space.h1.l d() {
        k kVar = new k();
        kVar.H = this.a;
        kVar.I = true;
        kVar.J = this.b;
        kVar.K = this.c;
        kVar.L = this.d;
        kVar.M = this.e;
        return kVar;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(com.gamericefishpro.space.h1.l lVar) {
        k kVar = (k) lVar;
        boolean z = kVar.I;
        com.gamericefishpro.space.t1.b bVar = this.a;
        boolean z2 = (z && com.gamericefishpro.space.n1.e.a(kVar.H.d(), bVar.d())) ? false : true;
        kVar.H = bVar;
        kVar.I = true;
        kVar.J = this.b;
        kVar.K = this.c;
        kVar.L = this.d;
        kVar.M = this.e;
        if (z2) {
            com.gamericefishpro.space.h2.k.k(kVar);
        }
        com.gamericefishpro.space.h2.k.j(kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.a(this.a, jVar.a) && Intrinsics.a(this.b, jVar.b) && Intrinsics.a(this.c, jVar.c) && Float.compare(this.d, jVar.d) == 0 && Intrinsics.a(this.e, jVar.e);
    }

    public final int hashCode() {
        int iA = y0.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + y0.c(this.a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        com.gamericefishpro.space.o1.k kVar = this.e;
        return iA + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.a + ", sizeToIntrinsics=true, alignment=" + this.b + ", contentScale=" + this.c + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
