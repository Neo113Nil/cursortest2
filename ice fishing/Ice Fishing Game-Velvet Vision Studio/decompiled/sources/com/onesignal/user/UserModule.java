package com.onesignal.user;

import com.gamericefishpro.space.bd.d;
import com.gamericefishpro.space.eh.g;
import com.gamericefishpro.space.eh.j;
import com.gamericefishpro.space.eh.l;
import com.gamericefishpro.space.eh.n;
import com.gamericefishpro.space.gc.a;
import com.gamericefishpro.space.hc.c;
import com.gamericefishpro.space.hh.b;
import com.gamericefishpro.space.jh.e;
import com.gamericefishpro.space.ug.f;
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
public final class UserModule implements a {
    @Override // com.gamericefishpro.space.gc.a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.gamericefishpro.space.bc.a.class).provides(com.gamericefishpro.space.cc.c.class);
        builder.register(b.class).provides(b.class);
        builder.register(com.gamericefishpro.space.fh.b.class).provides(com.gamericefishpro.space.jd.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.bh.b.class, com.gamericefishpro.space.bh.b.class, com.gamericefishpro.space.fh.a.class, com.gamericefishpro.space.jd.a.class);
        builder.register(com.gamericefishpro.space.wg.a.class).provides(com.gamericefishpro.space.vg.b.class);
        builder.register(com.gamericefishpro.space.eh.c.class).provides(com.gamericefishpro.space.eh.c.class).provides(d.class);
        builder.register(e.class).provides(e.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.fh.c.class, com.gamericefishpro.space.jd.a.class, com.gamericefishpro.space.wg.c.class, com.gamericefishpro.space.vg.c.class);
        builder.register(l.class).provides(l.class).provides(d.class);
        builder.register(com.gamericefishpro.space.kh.b.class).provides(com.gamericefishpro.space.jh.b.class);
        builder.register(com.gamericefishpro.space.yg.a.class).provides(com.gamericefishpro.space.xg.a.class);
        builder.register(com.gamericefishpro.space.wg.d.class).provides(com.gamericefishpro.space.vg.d.class);
        builder.register(n.class).provides(n.class).provides(d.class);
        builder.register(g.class).provides(d.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.eh.e.class, d.class, j.class, d.class);
        com.gamericefishpro.space.m5.a.q(builder, f.class, com.gamericefishpro.space.tg.a.class, com.gamericefishpro.space.ah.b.class, com.gamericefishpro.space.zg.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.eh.a.class, d.class, com.gamericefishpro.space.ah.a.class, com.gamericefishpro.space.zg.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.ih.a.class, com.gamericefishpro.space.jd.b.class, com.gamericefishpro.space.ch.d.class, com.gamericefishpro.space.jd.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.ch.c.class, com.gamericefishpro.space.jd.b.class, com.gamericefishpro.space.gh.a.class, com.gamericefishpro.space.gh.a.class);
    }
}
