package com.onesignal.location;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.hc.b;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.re.d;
import com.gamericefishpro.space.re.g;
import com.gamericefishpro.space.re.h;
import com.gamericefishpro.space.vc.c;
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
public final class LocationModule implements com.gamericefishpro.space.gc.a {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.gamericefishpro.space.qe.a invoke(b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c cVar = (c) it.getService(c.class);
            if (cVar.isAndroidDeviceType() && com.gamericefishpro.space.pe.b.INSTANCE.hasGMSLocationLibrary()) {
                return new com.gamericefishpro.space.re.b((f) it.getService(f.class), (g) it.getService(g.class));
            }
            return (cVar.isHuaweiDeviceType() && com.gamericefishpro.space.pe.b.INSTANCE.hasHMSLocationLibrary()) ? new d((f) it.getService(f.class)) : new h();
        }
    }

    @Override // com.gamericefishpro.space.gc.a
    public void register(com.gamericefishpro.space.hc.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.gamericefishpro.space.se.b.class).provides(com.gamericefishpro.space.se.b.class).provides(com.gamericefishpro.space.jd.b.class);
        builder.register(com.gamericefishpro.space.re.a.class).provides(g.class);
        builder.register((Function1) a.INSTANCE).provides(com.gamericefishpro.space.qe.a.class);
        builder.register(com.gamericefishpro.space.ue.a.class).provides(com.gamericefishpro.space.te.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.oe.a.class, com.gamericefishpro.space.ne.a.class, com.gamericefishpro.space.me.a.class, com.gamericefishpro.space.pc.b.class);
        builder.register(com.gamericefishpro.space.le.a.class).provides(com.gamericefishpro.space.ke.a.class).provides(com.gamericefishpro.space.jd.b.class);
    }
}
