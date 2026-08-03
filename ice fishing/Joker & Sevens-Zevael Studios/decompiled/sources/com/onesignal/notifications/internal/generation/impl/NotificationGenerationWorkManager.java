package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import fc.d;
import hc.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import na.h;
import o4.e;
import o4.m;
import o4.u;
import org.json.JSONException;
import org.json.JSONObject;
import p4.n;
import pc.f;
import pc.j;
import qa.b;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class NotificationGenerationWorkManager implements b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(d dVar) {
                super(dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            j.e(context, "context");
            j.e(workerParameters, "workerParams");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(d dVar) {
            a aVar;
            int i10;
            Throwable th;
            String str;
            JSONException jSONException;
            String str2;
            try {
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i11 = aVar.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aVar.label = i11 - Integer.MIN_VALUE;
                        a aVar2 = aVar;
                        Object obj = aVar2.result;
                        i10 = aVar2.label;
                        if (i10 != 0) {
                            v6.a.W(obj);
                            Context applicationContext = getApplicationContext();
                            j.d(applicationContext, "applicationContext");
                            if (!h8.d.b(applicationContext)) {
                                return m.a();
                            }
                            qa.a aVar3 = (qa.a) h8.d.a().getService(qa.a.class);
                            e inputData = getInputData();
                            j.d(inputData, "inputData");
                            HashMap hashMap = inputData.f5206a;
                            String b2 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                            if (b2 == null) {
                                return new o4.j();
                            }
                            try {
                                com.onesignal.debug.internal.logging.b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                                Object obj2 = hashMap.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                                int intValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                                JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                                long currentTimeMillis = System.currentTimeMillis() / 1000;
                                Object obj3 = hashMap.get(NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM);
                                if (obj3 instanceof Long) {
                                    currentTimeMillis = ((Long) obj3).longValue();
                                }
                                Object obj4 = hashMap.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                                boolean booleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                                Context applicationContext2 = getApplicationContext();
                                j.d(applicationContext2, "applicationContext");
                                aVar2.L$0 = b2;
                                aVar2.label = 1;
                                Object processNotificationData = aVar3.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar2);
                                gc.a aVar4 = gc.a.f2559g;
                                if (processNotificationData == aVar4) {
                                    return aVar4;
                                }
                                str2 = b2;
                            } catch (JSONException e10) {
                                jSONException = e10;
                                str2 = b2;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str2, jSONException);
                                o4.j jVar = new o4.j();
                                a aVar5 = NotificationGenerationWorkManager.Companion;
                                j.b(str2);
                                aVar5.removeNotificationIdProcessed(str2);
                                return jVar;
                            } catch (Throwable th2) {
                                th = th2;
                                str = b2;
                                a aVar6 = NotificationGenerationWorkManager.Companion;
                                j.b(str);
                                aVar6.removeNotificationIdProcessed(str);
                                throw th;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str2 = (String) aVar2.L$0;
                            try {
                                v6.a.W(obj);
                            } catch (JSONException e11) {
                                jSONException = e11;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str2, jSONException);
                                o4.j jVar2 = new o4.j();
                                a aVar52 = NotificationGenerationWorkManager.Companion;
                                j.b(str2);
                                aVar52.removeNotificationIdProcessed(str2);
                                return jVar2;
                            }
                        }
                        a aVar7 = NotificationGenerationWorkManager.Companion;
                        j.b(str2);
                        aVar7.removeNotificationIdProcessed(str2);
                        return m.a();
                    }
                }
                if (i10 != 0) {
                }
                a aVar72 = NotificationGenerationWorkManager.Companion;
                j.b(str2);
                aVar72.removeNotificationIdProcessed(str2);
                return m.a();
            } catch (Throwable th3) {
                th = th3;
                str = i10;
            }
            aVar = new a(dVar);
            a aVar22 = aVar;
            Object obj5 = aVar22.result;
            i10 = aVar22.label;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String str) {
            j.e(str, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(str)) {
                com.onesignal.debug.internal.logging.b.debug$default(a4.d.j("OSNotificationWorkManager notification with notificationId: ", str, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(str, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String str) {
            j.e(str, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(str)) {
                NotificationGenerationWorkManager.notificationIds.remove(str);
            }
        }

        private a() {
        }
    }

    @Override // qa.b
    public boolean beginEnqueueingWork(Context context, String str, int i10, JSONObject jSONObject, long j3, boolean z10, boolean z11) {
        j.e(context, "context");
        j.e(str, "osNotificationId");
        String oSNotificationIdFromJson = na.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            com.onesignal.debug.internal.logging.b.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i10));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(j3));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z10));
        e eVar = new e(hashMap);
        e.c(eVar);
        a5.c cVar = new a5.c(NotificationGenerationWorker.class);
        ((p) cVar.f261g).f8326e = eVar;
        o4.p m10 = cVar.m();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + jSONObject, null, 2, null);
        u hVar = h.INSTANCE.getInstance(context);
        hVar.getClass();
        new p4.j((n) hVar, str, Collections.singletonList(m10)).N();
        return true;
    }
}
