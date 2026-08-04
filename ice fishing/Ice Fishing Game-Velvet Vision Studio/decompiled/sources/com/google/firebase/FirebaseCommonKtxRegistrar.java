package com.google.firebase;

import com.gamericefishpro.space.ab.d;
import com.gamericefishpro.space.bb.a;
import com.gamericefishpro.space.bb.b;
import com.gamericefishpro.space.bb.l;
import com.gamericefishpro.space.bb.v;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.pi.t;
import com.gamericefishpro.space.wa.c;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
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
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a aVarA = b.a(new v(com.gamericefishpro.space.ab.a.class, t.class));
        aVarA.a(new l(new v(com.gamericefishpro.space.ab.a.class, Executor.class), 1, 0));
        aVarA.g = c.i;
        b bVarC = aVarA.c();
        Intrinsics.checkNotNullExpressionValue(bVarC, "build(...)");
        a aVarA2 = b.a(new v(com.gamericefishpro.space.ab.c.class, t.class));
        aVarA2.a(new l(new v(com.gamericefishpro.space.ab.c.class, Executor.class), 1, 0));
        aVarA2.g = c.v;
        b bVarC2 = aVarA2.c();
        Intrinsics.checkNotNullExpressionValue(bVarC2, "build(...)");
        a aVarA3 = b.a(new v(com.gamericefishpro.space.ab.b.class, t.class));
        aVarA3.a(new l(new v(com.gamericefishpro.space.ab.b.class, Executor.class), 1, 0));
        aVarA3.g = c.w;
        b bVarC3 = aVarA3.c();
        Intrinsics.checkNotNullExpressionValue(bVarC3, "build(...)");
        a aVarA4 = b.a(new v(d.class, t.class));
        aVarA4.a(new l(new v(d.class, Executor.class), 1, 0));
        aVarA4.g = c.y;
        b bVarC4 = aVarA4.c();
        Intrinsics.checkNotNullExpressionValue(bVarC4, "build(...)");
        return x.f(bVarC, bVarC2, bVarC3, bVarC4);
    }
}
