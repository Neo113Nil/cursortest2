package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.gamericefishpro.space.l6.g;
import com.gamericefishpro.space.l6.l;
import com.gamericefishpro.space.l6.n;
import com.gamericefishpro.space.l6.o;
import com.gamericefishpro.space.l6.s;
import com.gamericefishpro.space.l6.z;
import com.gamericefishpro.space.m6.k;
import com.gamericefishpro.space.mf.h;
import com.gamericefishpro.space.rf.b;
import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.u6.p;
import com.gamericefishpro.space.vh.c;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

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
public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    @Metadata
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(com.gamericefishpro.space.th.a aVar) {
                super(aVar);
            }

            @Override // com.gamericefishpro.space.vh.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        @Override // androidx.work.CoroutineWorker
        public Object doWork(com.gamericefishpro.space.th.a aVar) throws Throwable {
            a aVar2;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            if (aVar instanceof a) {
                aVar2 = (a) aVar;
                int i = aVar2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar2.label = i - Integer.MIN_VALUE;
                    notificationGenerationWorker = this;
                } else {
                    notificationGenerationWorker = this;
                    aVar2 = notificationGenerationWorker.new a(aVar);
                }
            } else {
                notificationGenerationWorker = this;
                aVar2 = notificationGenerationWorker.new a(aVar);
            }
            a aVar3 = aVar2;
            Object obj = aVar3.result;
            com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
            int i2 = aVar3.label;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar3.L$0;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        a aVar5 = NotificationGenerationWorkManager.Companion;
                        Intrinsics.b(str);
                        aVar5.removeNotificationIdProcessed(str);
                        n nVarA = o.a();
                        Intrinsics.checkNotNullExpressionValue(nVarA, "success(...)");
                        return nVarA;
                    } catch (JSONException e) {
                        e = e;
                        com.gamericefishpro.space.od.b.error("Error occurred doing work for job with id: " + str, e);
                        l lVar = new l();
                        Intrinsics.checkNotNullExpressionValue(lVar, "failure(...)");
                        a aVar6 = NotificationGenerationWorkManager.Companion;
                        Intrinsics.b(str);
                        aVar6.removeNotificationIdProcessed(str);
                        return lVar;
                    }
                }
                com.gamericefishpro.space.wa.b.P(obj);
                Context applicationContext = notificationGenerationWorker.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                if (!com.gamericefishpro.space.xb.c.b(applicationContext)) {
                    n nVarA2 = o.a();
                    Intrinsics.checkNotNullExpressionValue(nVarA2, "success(...)");
                    return nVarA2;
                }
                com.gamericefishpro.space.rf.a aVar7 = (com.gamericefishpro.space.rf.a) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.rf.a.class);
                g inputData = notificationGenerationWorker.getInputData();
                Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                String strB = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                HashMap map = inputData.a;
                if (strB == null) {
                    l lVar2 = new l();
                    Intrinsics.checkNotNullExpressionValue(lVar2, "failure(...)");
                    return lVar2;
                }
                try {
                    com.gamericefishpro.space.od.b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                    Object obj2 = map.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                    int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                    JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    Object obj3 = map.get(NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM);
                    if (obj3 instanceof Long) {
                        jCurrentTimeMillis = ((Long) obj3).longValue();
                    }
                    Object obj4 = map.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                    boolean zBooleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                    Context applicationContext2 = notificationGenerationWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    aVar3.L$0 = strB;
                    aVar3.label = 1;
                    if (aVar7.processNotificationData(applicationContext2, iIntValue, jSONObject, zBooleanValue, jCurrentTimeMillis, aVar3) == aVar4) {
                        return aVar4;
                    }
                    str = strB;
                    a aVar8 = NotificationGenerationWorkManager.Companion;
                    Intrinsics.b(str);
                    aVar8.removeNotificationIdProcessed(str);
                    n nVarA3 = o.a();
                    Intrinsics.checkNotNullExpressionValue(nVarA3, "success(...)");
                    return nVarA3;
                } catch (JSONException e2) {
                    e = e2;
                    str = strB;
                    com.gamericefishpro.space.od.b.error("Error occurred doing work for job with id: " + str, e);
                    l lVar3 = new l();
                    Intrinsics.checkNotNullExpressionValue(lVar3, "failure(...)");
                    a aVar9 = NotificationGenerationWorkManager.Companion;
                    Intrinsics.b(str);
                    aVar9.removeNotificationIdProcessed(str);
                    return lVar3;
                } catch (Throwable th) {
                    th = th;
                    str2 = strB;
                    a aVar10 = NotificationGenerationWorkManager.Companion;
                    Intrinsics.b(str2);
                    aVar10.removeNotificationIdProcessed(str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean addNotificationIdProcessed(String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                com.gamericefishpro.space.od.b.debug$default(y0.g("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private a() {
        }
    }

    @Override // com.gamericefishpro.space.rf.b
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i, JSONObject jSONObject, long j, boolean z, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = com.gamericefishpro.space.mf.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            com.gamericefishpro.space.od.b.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            com.gamericefishpro.space.od.b.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap map = new HashMap();
        map.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        map.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i));
        map.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        map.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j));
        map.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z));
        g inputData = new g(map);
        g.c(inputData);
        Intrinsics.checkNotNullExpressionValue(inputData, "build(...)");
        com.gamericefishpro.space.a8.c cVar = new com.gamericefishpro.space.a8.c(NotificationGenerationWorker.class);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        ((p) cVar.i).e = inputData;
        s sVarF = cVar.f();
        com.gamericefishpro.space.od.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        z hVar = h.INSTANCE.getInstance(context);
        hVar.getClass();
        new k((com.gamericefishpro.space.m6.o) hVar, osNotificationId, Collections.singletonList(sVarF)).d0();
        return true;
    }
}
