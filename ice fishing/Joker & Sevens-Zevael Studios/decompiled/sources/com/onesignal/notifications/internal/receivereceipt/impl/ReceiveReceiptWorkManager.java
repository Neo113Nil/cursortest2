package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import fc.d;
import hc.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import na.h;
import o4.e;
import o4.m;
import o4.u;
import p4.n;
import pc.j;
import q8.f;
import va.b;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final ob.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends c {
            int label;
            /* synthetic */ Object result;

            public a(d dVar) {
                super(dVar);
            }

            @Override // hc.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            j.e(context, "context");
            j.e(workerParameters, "workerParams");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(d dVar) {
            a aVar;
            int i10;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i11 = aVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = aVar.result;
                    i10 = aVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        Context applicationContext = getApplicationContext();
                        j.d(applicationContext, "applicationContext");
                        if (!h8.d.b(applicationContext)) {
                            return m.a();
                        }
                        String b2 = getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                        j.b(b2);
                        String b10 = getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                        j.b(b10);
                        String b11 = getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                        j.b(b11);
                        va.a aVar2 = (va.a) h8.d.a().getService(va.a.class);
                        aVar.label = 1;
                        Object sendReceiveReceipt = aVar2.sendReceiveReceipt(b10, b11, b2, aVar);
                        gc.a aVar3 = gc.a.f2559g;
                        if (sendReceiveReceipt == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                    }
                    return m.a();
                }
            }
            aVar = new a(dVar);
            Object obj2 = aVar.result;
            i10 = aVar.label;
            if (i10 != 0) {
            }
            return m.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f fVar, com.onesignal.core.internal.config.b bVar, ob.b bVar2) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_configModelStore");
        j.e(bVar2, "_subscriptionManager");
        this._applicationService = fVar;
        this._configModelStore = bVar;
        this._subscriptionManager = bVar2;
        this.maxDelay = 25;
    }

    private final o4.d buildConstraints() {
        return new o4.d(2, false, false, false, false, -1L, -1L, bc.m.i0(new LinkedHashSet()));
    }

    @Override // va.b
    public void enqueueReceiveReceipt(String str) {
        j.e(str, "notificationId");
        if (!((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.onesignal.debug.internal.logging.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id2.length() == 0 || appId.length() == 0) {
            com.onesignal.debug.internal.logging.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap hashMap = new HashMap();
        hashMap.put(OS_NOTIFICATION_ID, str);
        hashMap.put(OS_APP_ID, appId);
        hashMap.put(OS_SUBSCRIPTION_ID, id2);
        e eVar = new e(hashMap);
        e.c(eVar);
        o4.d buildConstraints = buildConstraints();
        a5.c cVar = new a5.c(ReceiveReceiptWorker.class);
        j.e(buildConstraints, "constraints");
        ((p) cVar.f261g).f8331j = buildConstraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        cVar.O(randomDelay);
        ((p) cVar.f261g).f8326e = eVar;
        o4.p m10 = cVar.m();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + randomDelay + " seconds", null, 2, null);
        u hVar = h.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = str.concat("_receive_receipt");
        hVar.getClass();
        new p4.j((n) hVar, concat, Collections.singletonList(m10)).N();
    }
}
