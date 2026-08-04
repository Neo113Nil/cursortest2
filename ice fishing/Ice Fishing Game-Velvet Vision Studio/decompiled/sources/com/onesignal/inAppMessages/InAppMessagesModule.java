package com.onesignal.inAppMessages;

import com.gamericefishpro.space.gc.a;
import com.gamericefishpro.space.hc.c;
import com.gamericefishpro.space.he.d;
import com.gamericefishpro.space.ie.e;
import com.gamericefishpro.space.pd.j;
import com.gamericefishpro.space.qd.k;
import com.gamericefishpro.space.rd.b;
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
public final class InAppMessagesModule implements a {
    @Override // com.gamericefishpro.space.gc.a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.gamericefishpro.space.ge.a.class).provides(com.gamericefishpro.space.ge.a.class);
        builder.register(com.gamericefishpro.space.wd.a.class).provides(com.gamericefishpro.space.wd.a.class);
        builder.register(com.gamericefishpro.space.ae.a.class).provides(com.gamericefishpro.space.zd.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.fe.a.class, com.gamericefishpro.space.ee.a.class, com.gamericefishpro.space.sd.a.class, b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.yd.a.class, com.gamericefishpro.space.xd.b.class, d.class, d.class);
        com.gamericefishpro.space.m5.a.q(builder, e.class, com.gamericefishpro.space.he.a.class, com.gamericefishpro.space.ie.a.class, com.gamericefishpro.space.ie.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.vd.c.class, com.gamericefishpro.space.ud.a.class, com.gamericefishpro.space.be.a.class, com.gamericefishpro.space.jd.a.class);
        builder.register(com.gamericefishpro.space.de.c.class).provides(com.gamericefishpro.space.ce.a.class);
        builder.register(k.class).provides(j.class).provides(com.gamericefishpro.space.jd.b.class);
    }
}
