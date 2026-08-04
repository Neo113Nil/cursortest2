package com.onesignal.core;

import com.gamericefishpro.space.gc.a;
import com.gamericefishpro.space.gd.b;
import com.gamericefishpro.space.hc.c;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.pd.j;
import com.gamericefishpro.space.qd.l;
import com.gamericefishpro.space.tc.d;
import com.gamericefishpro.space.ve.n;
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
public final class CoreModule implements a {
    @Override // com.gamericefishpro.space.gc.a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.gamericefishpro.space.hd.a.class).provides(b.class).provides(com.gamericefishpro.space.jd.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.yc.b.class, com.gamericefishpro.space.yc.c.class, com.gamericefishpro.space.yc.a.class, com.gamericefishpro.space.xc.c.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.mc.a.class, f.class, com.gamericefishpro.space.wc.a.class, com.gamericefishpro.space.vc.c.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.ld.a.class, com.gamericefishpro.space.kd.a.class, com.gamericefishpro.space.uc.b.class, d.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.wc.b.class, com.gamericefishpro.space.vc.d.class, com.gamericefishpro.space.rc.b.class, com.gamericefishpro.space.rc.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.oc.a.class, com.gamericefishpro.space.nc.b.class, com.gamericefishpro.space.sc.a.class, com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.cd.a.class).provides(com.gamericefishpro.space.cd.a.class);
        builder.register(com.gamericefishpro.space.cd.b.class).provides(com.gamericefishpro.space.bd.f.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.fd.a.class).provides(com.gamericefishpro.space.fd.a.class).provides(com.gamericefishpro.space.ed.f.class);
        builder.register(com.gamericefishpro.space.ad.a.class).provides(com.gamericefishpro.space.zc.a.class);
        builder.register(com.gamericefishpro.space.qc.a.class).provides(com.gamericefishpro.space.pc.a.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.id.a.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.ye.b.class).provides(n.class);
        com.gamericefishpro.space.m5.a.q(builder, l.class, j.class, com.gamericefishpro.space.le.b.class, com.gamericefishpro.space.ke.a.class);
    }
}
