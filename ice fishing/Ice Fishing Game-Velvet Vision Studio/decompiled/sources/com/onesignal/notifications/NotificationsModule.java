package com.onesignal.notifications;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fg.d;
import com.gamericefishpro.space.fg.g;
import com.gamericefishpro.space.fg.h;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.vc.c;
import com.gamericefishpro.space.ve.n;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import com.onesignal.notifications.internal.listeners.DeviceRegistrationListener;
import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
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
public final class NotificationsModule implements com.gamericefishpro.space.gc.a {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final com.gamericefishpro.space.ze.a invoke(com.gamericefishpro.space.hc.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return com.gamericefishpro.space.af.a.Companion.canTrack() ? new com.gamericefishpro.space.af.a((f) it.getService(f.class), (com.gamericefishpro.space.rc.b) it.getService(com.gamericefishpro.space.rc.b.class), (com.gamericefishpro.space.kd.a) it.getService(com.gamericefishpro.space.kd.a.class)) : new com.gamericefishpro.space.af.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function1 {
        public static final b INSTANCE = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.hc.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c cVar = (c) it.getService(c.class);
            if (cVar.isFireOSDeviceType()) {
                return new d((f) it.getService(f.class));
            }
            if (cVar.isAndroidDeviceType()) {
                return cVar.getHasFCMLibrary() ? new com.gamericefishpro.space.fg.f((com.gamericefishpro.space.rc.b) it.getService(com.gamericefishpro.space.rc.b.class), (f) it.getService(f.class), (com.gamericefishpro.space.fg.a) it.getService(com.gamericefishpro.space.fg.a.class), cVar) : new h();
            }
            return new g(cVar, (f) it.getService(f.class));
        }
    }

    @Override // com.gamericefishpro.space.gc.a
    public void register(com.gamericefishpro.space.hc.c builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.register(com.gamericefishpro.space.cf.a.class).provides(com.gamericefishpro.space.bf.a.class);
        builder.register(NotificationRestoreWorkManager.class).provides(com.gamericefishpro.space.gg.c.class);
        builder.register(com.gamericefishpro.space.of.a.class).provides(com.gamericefishpro.space.nf.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.ef.a.class, com.gamericefishpro.space.df.a.class, com.gamericefishpro.space.of.b.class, com.gamericefishpro.space.nf.d.class);
        com.gamericefishpro.space.m5.a.q(builder, NotificationGenerationWorkManager.class, com.gamericefishpro.space.rf.b.class, com.gamericefishpro.space.jf.a.class, com.gamericefishpro.space.hf.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.lf.a.class, com.gamericefishpro.space.kf.a.class, com.gamericefishpro.space.wf.a.class, com.gamericefishpro.space.vf.b.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.qf.c.class, com.gamericefishpro.space.pf.b.class, com.gamericefishpro.space.qf.d.class, com.gamericefishpro.space.pf.c.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.qf.b.class, com.gamericefishpro.space.pf.a.class, com.gamericefishpro.space.sf.a.class, com.gamericefishpro.space.rf.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.hg.a.class, com.gamericefishpro.space.gg.b.class, com.gamericefishpro.space.jg.a.class, com.gamericefishpro.space.ig.a.class);
        com.gamericefishpro.space.m5.a.q(builder, com.gamericefishpro.space.yf.b.class, com.gamericefishpro.space.xf.a.class, com.gamericefishpro.space.yf.c.class, com.gamericefishpro.space.xf.b.class);
        builder.register(com.gamericefishpro.space.ag.b.class).provides(com.gamericefishpro.space.zf.b.class);
        builder.register(com.gamericefishpro.space.uf.a.class).provides(com.gamericefishpro.space.tf.b.class).provides(com.gamericefishpro.space.ye.a.class);
        builder.register((Function1) a.INSTANCE).provides(com.gamericefishpro.space.ze.a.class);
        builder.register((Function1) b.INSTANCE).provides(com.gamericefishpro.space.eg.b.class).provides(com.gamericefishpro.space.fg.c.class);
        builder.register(com.gamericefishpro.space.fg.a.class).provides(com.gamericefishpro.space.fg.a.class);
        builder.register(com.gamericefishpro.space.bg.c.class).provides(com.gamericefishpro.space.bg.a.class);
        com.gamericefishpro.space.m5.a.q(builder, ReceiveReceiptWorkManager.class, com.gamericefishpro.space.cg.b.class, com.gamericefishpro.space.dg.a.class, com.gamericefishpro.space.cg.a.class);
        com.gamericefishpro.space.m5.a.q(builder, DeviceRegistrationListener.class, com.gamericefishpro.space.jd.b.class, com.gamericefishpro.space.ye.h.class, n.class);
    }
}
