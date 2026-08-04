package com.gamericefishpro.space.j0;

import com.gamericefishpro.space.b0.i;
import com.gamericefishpro.space.h1.l;
import com.gamericefishpro.space.h2.k;
import com.gamericefishpro.space.h2.w0;
import com.gamericefishpro.space.o2.h;
import com.gamericefishpro.space.t0.y0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
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
final class a extends w0 {
    public final boolean a;
    public final i b;
    public final boolean c;
    public final h d;
    public final Function1 e;

    public a(boolean z, i iVar, boolean z2, h hVar, Function1 function1) {
        this.a = z;
        this.b = iVar;
        this.c = z2;
        this.d = hVar;
        this.e = function1;
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final l d() {
        return new d(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // com.gamericefishpro.space.h2.w0
    public final void e(l lVar) {
        d dVar = (d) lVar;
        boolean z = dVar.d0;
        boolean z2 = this.a;
        if (z != z2) {
            dVar.d0 = z2;
            k.l(dVar);
        }
        dVar.e0 = this.e;
        dVar.J0(this.b, false, this.c, this.d, dVar.f0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Intrinsics.a(this.b, aVar.b) && this.c == aVar.c && this.d.equals(aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        i iVar = this.b;
        return this.e.hashCode() + com.gamericefishpro.space.m5.a.t(this.d.a, y0.c(y0.c((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 961, 31, false), 31, this.c), 31);
    }
}
