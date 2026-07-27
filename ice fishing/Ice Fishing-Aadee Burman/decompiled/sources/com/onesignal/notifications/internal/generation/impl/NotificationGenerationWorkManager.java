package com.onesignal.notifications.internal.generation.impl;

import B7.c;
import D.y;
import J0.n;
import J0.p;
import J0.q;
import J0.t;
import K0.k;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.d;
import com.onesignal.common.AndroidUtils;
import com.onesignal.debug.internal.logging.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import org.json.JSONException;
import org.json.JSONObject;
import p4.g;
import t5.i;
import w5.InterfaceC5152a;
import w5.InterfaceC5153b;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class NotificationGenerationWorkManager implements InterfaceC5153b {
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

            public a(InterfaceC5267d interfaceC5267d) {
                super(interfaceC5267d);
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
        public Object doWork(InterfaceC5267d interfaceC5267d) {
            a aVar;
            Object obj;
            int i;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            try {
                if (interfaceC5267d instanceof a) {
                    aVar = (a) interfaceC5267d;
                    int i6 = aVar.label;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        aVar.label = i6 - Integer.MIN_VALUE;
                        a aVar2 = aVar;
                        obj = aVar2.result;
                        A7.a aVar3 = A7.a.f58n;
                        i = aVar2.label;
                        if (i != 0) {
                            d.k(obj);
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
                                d.k(obj);
                                p a9 = q.a();
                                a aVar4 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar4.removeNotificationIdProcessed(str);
                                return a9;
                            } catch (JSONException e9) {
                                e = e9;
                                b.error("Error occurred doing work for job with id: " + str, e);
                                n nVar = new n();
                                a aVar5 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar5.removeNotificationIdProcessed(str);
                                return nVar;
                            }
                        }
                        notificationGenerationWorker = (NotificationGenerationWorker) aVar2.L$0;
                        d.k(obj);
                        if (((Boolean) obj).booleanValue()) {
                            b.warn$default("NotificationWorker skipped due to failed OneSignal initialization", null, 2, null);
                            return q.a();
                        }
                        InterfaceC5152a interfaceC5152a = (InterfaceC5152a) g.a().getService(InterfaceC5152a.class);
                        J0.h inputData = notificationGenerationWorker.getInputData();
                        h.d(inputData, "getInputData(...)");
                        String b9 = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                        if (b9 == null) {
                            return new n();
                        }
                        try {
                            b.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                            HashMap hashMap = inputData.f1391a;
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
                            if (interfaceC5152a.processNotificationData(applicationContext2, intValue, jSONObject, booleanValue, currentTimeMillis, aVar2) != aVar3) {
                                str = b9;
                                p a92 = q.a();
                                a aVar42 = NotificationGenerationWorkManager.Companion;
                                h.b(str);
                                aVar42.removeNotificationIdProcessed(str);
                                return a92;
                            }
                            return aVar3;
                        } catch (JSONException e10) {
                            e = e10;
                            str = b9;
                            b.error("Error occurred doing work for job with id: " + str, e);
                            n nVar2 = new n();
                            a aVar52 = NotificationGenerationWorkManager.Companion;
                            h.b(str);
                            aVar52.removeNotificationIdProcessed(str);
                            return nVar2;
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
            aVar = new a(interfaceC5267d);
            a aVar22 = aVar;
            obj = aVar22.result;
            A7.a aVar32 = A7.a.f58n;
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
                b.debug$default(y.o("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
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

    @Override // w5.InterfaceC5153b
    public boolean beginEnqueueingWork(Context context, String osNotificationId, int i, JSONObject jSONObject, long j6, boolean z3, boolean z6) {
        h.e(context, "context");
        h.e(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = t5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
        if (oSNotificationIdFromJson == null) {
            b.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!Companion.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            b.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        hashMap.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(i));
        hashMap.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jSONObject));
        hashMap.put("timestamp", Long.valueOf(j6));
        hashMap.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(z3));
        J0.h hVar = new J0.h(hashMap);
        J0.h.c(hVar);
        Z2.e eVar = new Z2.e(NotificationGenerationWorker.class);
        ((S0.p) eVar.f4171v).f2812e = hVar;
        t m4 = eVar.m();
        b.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jSONObject, null, 2, null);
        J0.y iVar = i.INSTANCE.getInstance(context);
        iVar.getClass();
        new k((K0.p) iVar, osNotificationId, Collections.singletonList(m4)).o();
        return true;
    }
}
