package com.onesignal.notifications.internal.generation.impl;

import B7.c;
import D.x;
import J0.m;
import J0.o;
import J0.p;
import J0.s;
import K0.k;
import Q3.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import org.json.JSONException;
import org.json.JSONObject;
import p4.g;
import t5.i;
import w5.InterfaceC5151a;
import w5.InterfaceC5152b;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class NotificationGenerationWorkManager implements InterfaceC5152b {
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";
    private static final String OS_ID_DATA_PARAM = "os_notif_id";
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    public static final class NotificationGenerationWorker extends CoroutineWorker {

        public static final class a extends c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC5240d interfaceC5240d) {
                super(interfaceC5240d);
            }

            @Override // B7.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            h.e(context, "context");
            h.e(workerParams, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0051  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC5240d interfaceC5240d) {
            a aVar;
            Object obj;
            int i;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            try {
                if (interfaceC5240d instanceof a) {
                    aVar = (a) interfaceC5240d;
                    int i4 = aVar.label;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        aVar.label = i4 - Integer.MIN_VALUE;
                        a aVar2 = aVar;
                        obj = aVar2.result;
                        A7.a aVar3 = A7.a.f215n;
                        i = aVar2.label;
                        if (i != 0) {
                            b.s(obj);
                            Context applicationContext = getApplicationContext();
                            h.d(applicationContext, "getApplicationContext(...)");
                            aVar2.L$0 = this;
                            aVar2.label = 1;
                            obj = g.b(applicationContext, aVar2);
                            if (obj != aVar3) {
                                notificationGenerationWorker = this;
                            }
                            return aVar3;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = (String) aVar2.L$0;
                            try {
                                b.s(obj);
                                o a9 = p.a();
                                a aVar4 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar4.removeNotificationIdProcessed(str);
                                return a9;
                            } catch (JSONException e9) {
                                e = e9;
                                com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                                m mVar = new m();
                                a aVar5 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar5.removeNotificationIdProcessed(str);
                                return mVar;
                            }
                        }
                        notificationGenerationWorker = (NotificationGenerationWorker) aVar2.L$0;
                        b.s(obj);
                        if (((Boolean) obj).booleanValue()) {
                            com.onesignal.debug.internal.logging.b.warn$default("NotificationWorker skipped due to failed OneSignal initialization", null, 2, null);
                            return p.a();
                        }
                        InterfaceC5151a interfaceC5151a = (InterfaceC5151a) g.a().getService(InterfaceC5151a.class);
                        J0.g inputData = notificationGenerationWorker.getInputData();
                        h.d(inputData, "getInputData(...)");
                        String b9 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                        if (b9 == null) {
                            return new m();
                        }
                        try {
                            com.onesignal.debug.internal.logging.b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                            HashMap hashMap = inputData.f1419a;
                            Object obj2 = hashMap.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                            int intValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                            JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                            long currentTimeMillis = System.currentTimeMillis() / 1000;
                            Object obj3 = hashMap.get("timestamp");
                            if (obj3 instanceof Long) {
                                currentTimeMillis = ((Long) obj3).longValue();
                            }
                            Object obj4 = hashMap.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                            boolean booleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                            Context applicationContext2 = notificationGenerationWorker.getApplicationContext();
                            h.d(applicationContext2, "getApplicationContext(...)");
                            aVar2.L$0 = b9;
                            aVar2.label = 2;
                            if (interfaceC5151a.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar2) != aVar3) {
                                str = b9;
                                o a92 = p.a();
                                a aVar42 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar42.removeNotificationIdProcessed(str);
                                return a92;
                            }
                            return aVar3;
                        } catch (JSONException e10) {
                            e = e10;
                            str = b9;
                            com.onesignal.debug.internal.logging.b.error("Error occurred doing work for job with id: " + str, e);
                            m mVar2 = new m();
                            a aVar52 = NotificationGenerationWorkManager.Companion;
                            h.b(str);
                            aVar52.removeNotificationIdProcessed(str);
                            return mVar2;
                        } catch (Throwable th) {
                            th = th;
                            str2 = b9;
                            a aVar6 = NotificationGenerationWorkManager.Companion;
                            h.b(str2);
                            aVar6.removeNotificationIdProcessed(str2);
                            throw th;
                        }
                    }
                }
                if (i != 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
            aVar = new a(interfaceC5240d);
            a aVar22 = aVar;
            obj = aVar22.result;
            A7.a aVar32 = A7.a.f215n;
            i = aVar22.label;
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final boolean addNotificationIdProcessed(String osNotificationId) {
            h.e(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                com.onesignal.debug.internal.logging.b.debug$default(x.l("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(String osNotificationId) {
            h.e(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private a() {
        }
    }

    @Override // w5.InterfaceC5152b
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i, JSONObject jSONObject, long j6, boolean z6, boolean z9) {
        h.e(context, "context");
        h.e(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = t5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
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
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put("timestamp", Long.valueOf(j6));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z6));
        J0.g gVar = new J0.g(hashMap);
        J0.g.c(gVar);
        b3.e eVar = new b3.e(NotificationGenerationWorker.class);
        ((S0.p) eVar.f5558v).f2941e = gVar;
        s m9 = eVar.m();
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        J0.x iVar = i.INSTANCE.getInstance(context);
        iVar.getClass();
        new k((K0.p) iVar, osNotificationId, Collections.singletonList(m9)).s();
        return true;
    }
}
