package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.gamericefishpro.space.cg.b;
import com.gamericefishpro.space.l6.e;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.n;
import com.gamericefishpro.space.l6.o;
import com.gamericefishpro.space.l6.r;
import com.gamericefishpro.space.l6.s;
import com.gamericefishpro.space.l6.z;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.m6.k;
import com.gamericefishpro.space.mf.h;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.vh.c;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends c {
            int label;
            /* synthetic */ Object result;

            public a(com.gamericefishpro.space.th.a aVar) {
                super(aVar);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        public Object doWork(com.gamericefishpro.space.th.a aVar) {
            a aVar2;
            if (aVar instanceof a) {
                aVar2 = (a) aVar;
                int i = aVar2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar2.label = i - Integer.MIN_VALUE;
                } else {
                    aVar2 = new a(aVar);
                }
            } else {
                aVar2 = new a(aVar);
            }
            Object obj = aVar2.result;
            com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
            int i2 = aVar2.label;
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                if (!com.gamericefishpro.space.xb.c.b(applicationContext)) {
                    n nVarA = o.a();
                    Intrinsics.checkNotNullExpressionValue(nVarA, "success(...)");
                    return nVarA;
                }
                String strB = getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                Intrinsics.b(strB);
                String strB2 = getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                Intrinsics.b(strB2);
                String strB3 = getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                Intrinsics.b(strB3);
                com.gamericefishpro.space.cg.a aVar4 = (com.gamericefishpro.space.cg.a) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.cg.a.class);
                aVar2.label = 1;
                if (aVar4.sendReceiveReceipt(strB2, strB3, strB, aVar2) == aVar3) {
                    return aVar3;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            n nVarA2 = o.a();
            Intrinsics.checkNotNullExpressionValue(nVarA2, "success(...)");
            return nVarA2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f _applicationService, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.jh.b _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final e buildConstraints() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        r networkType = r.e;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new e(networkType, false, false, false, false, -1L, -1L, CollectionsKt.O(linkedHashSet));
    }

    @Override // com.gamericefishpro.space.cg.b
    public void enqueueReceiveReceipt(String notificationId) throws Throwable {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        if (!((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.gamericefishpro.space.od.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            com.gamericefishpro.space.od.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap map = new HashMap();
        map.put(OS_NOTIFICATION_ID, notificationId);
        map.put(OS_APP_ID, appId);
        map.put(OS_SUBSCRIPTION_ID, id);
        g inputData = new g(map);
        g.c(inputData);
        Intrinsics.checkNotNullExpressionValue(inputData, "build(...)");
        e constraints = buildConstraints();
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(ReceiveReceiptWorker.class);
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        ((p) cVar.i).j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.F(randomDelay);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ((p) cVar.i).e = inputData;
        s sVarF = cVar.f();
        com.gamericefishpro.space.od.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        z hVar = h.INSTANCE.getInstance(this._applicationService.getAppContext());
        StringBuilder sb = new StringBuilder();
        sb.append(notificationId);
        sb.append("_receive_receipt");
        String string = sb.toString();
        hVar.getClass();
        new k((com.gamericefishpro.space.m6.o) hVar, string, Collections.singletonList(sVarF)).d0();
    }
}
