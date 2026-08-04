package com.onesignal.notifications.services;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.fg.c;
import com.gamericefishpro.space.vh.i;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class ADMMessageHandler extends ADMMessageHandlerBase {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends i implements Function1 {
        final /* synthetic */ String $newRegistrationId;
        final /* synthetic */ a0 $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(a0 a0Var, String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$registerer = a0Var;
            this.$newRegistrationId = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new a(this.$registerer, this.$newRegistrationId, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                c cVar = (c) this.$registerer.d;
                String str = this.$newRegistrationId;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function1 {
        final /* synthetic */ a0 $registerer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$registerer = a0Var;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new b(this.$registerer, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                c cVar = (c) this.$registerer.d;
                this.label = 1;
                if (cVar.fireCallback(null, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Context applicationContext = getApplicationContext();
        Intrinsics.b(applicationContext);
        if (com.gamericefishpro.space.xb.c.b(applicationContext)) {
            Bundle extras = intent.getExtras();
            com.gamericefishpro.space.hf.b bVar = (com.gamericefishpro.space.hf.b) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.hf.b.class);
            Intrinsics.b(extras);
            bVar.processBundleFromReceiver(applicationContext, extras);
        }
    }

    public void onRegistered(String newRegistrationId) {
        Intrinsics.checkNotNullParameter(newRegistrationId, "newRegistrationId");
        com.gamericefishpro.space.od.b.info$default("ADM registration ID: " + newRegistrationId, null, 2, null);
        a0 a0Var = new a0();
        a0Var.d = com.gamericefishpro.space.xb.c.a().getService(c.class);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new a(a0Var, newRegistrationId, null), 1, null);
    }

    public void onRegistrationError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        com.gamericefishpro.space.od.b.error$default("ADM:onRegistrationError: " + error, null, 2, null);
        if ("INVALID_SENDER".equals(error)) {
            com.gamericefishpro.space.od.b.error$default("Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.", null, 2, null);
        }
        a0 a0Var = new a0();
        a0Var.d = com.gamericefishpro.space.xb.c.a().getService(c.class);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new b(a0Var, null), 1, null);
    }

    public void onUnregistered(String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        com.gamericefishpro.space.od.b.info$default("ADM:onUnregistered: " + info, null, 2, null);
    }
}
