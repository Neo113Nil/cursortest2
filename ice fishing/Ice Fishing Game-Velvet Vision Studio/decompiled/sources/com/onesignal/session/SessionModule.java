package com.onesignal.session;

import com.gamericefishpro.space.gc.a;
import com.gamericefishpro.space.hc.c;
import com.gamericefishpro.space.pg.b;
import com.gamericefishpro.space.pg.d;
import com.gamericefishpro.space.pg.g;
import com.gamericefishpro.space.pg.i;
import com.gamericefishpro.space.pg.j;
import com.gamericefishpro.space.pg.l;
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
public final class SessionModule implements a {
    @Override // com.gamericefishpro.space.gc.a
    public void register(c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(j.class).provides(com.gamericefishpro.space.pg.c.class);
        builder.register(l.class).provides(d.class);
        builder.register(g.class).provides(b.class);
        builder.register(i.class).provides(com.gamericefishpro.space.og.b.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.ng.g.class).provides(com.gamericefishpro.space.mg.a.class);
        builder.register(com.gamericefishpro.space.rg.d.class).provides(com.gamericefishpro.space.rg.d.class);
        builder.register(com.gamericefishpro.space.sg.b.class).provides(com.gamericefishpro.space.rg.b.class).provides(com.gamericefishpro.space.jd.b.class).provides(com.gamericefishpro.space.pc.b.class).provides(com.gamericefishpro.space.jd.a.class);
        builder.register(com.gamericefishpro.space.sg.a.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.lg.a.class).provides(com.gamericefishpro.space.kg.a.class);
    }
}
