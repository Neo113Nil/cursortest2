package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.f5.g0;
import com.gamericefishpro.space.f5.o0;
import com.gamericefishpro.space.f5.p0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
@o0("dialog")
@Metadata
public final class p extends p0 {
    public p() {
        Intrinsics.checkNotNullParameter("dialog", "name");
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final com.gamericefishpro.space.f5.x a() {
        com.gamericefishpro.space.b1.h hVar = e.a;
        return new o(this);
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final void d(List list, g0 g0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((com.gamericefishpro.space.f5.k) it.next());
        }
    }

    @Override // com.gamericefishpro.space.f5.p0
    public final void e(com.gamericefishpro.space.f5.k kVar, boolean z) {
        b().e(kVar, z);
        int iY = CollectionsKt.y((Iterable) b().f.d.getValue(), kVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.d.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                com.gamericefishpro.space.ph.x.i();
                throw null;
            }
            com.gamericefishpro.space.f5.k kVar2 = (com.gamericefishpro.space.f5.k) obj;
            if (i > iY) {
                b().c(kVar2);
            }
            i = i2;
        }
    }
}
