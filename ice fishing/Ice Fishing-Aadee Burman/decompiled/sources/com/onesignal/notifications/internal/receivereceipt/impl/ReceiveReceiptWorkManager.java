package com.onesignal.notifications.internal.receivereceipt.impl;

import B5.b;
import J0.n;
import J0.q;
import J0.t;
import J0.y;
import K0.k;
import S0.p;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.bumptech.glide.d;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import p4.g;
import t5.i;
import v7.AbstractC5129j;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class ReceiveReceiptWorkManager implements b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final c _configModelStore;
    private final Z5.b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        public static final class a extends B7.c {
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
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(Context context, WorkerParameters workerParams) {
            super(context, workerParams);
            h.e(context, "context");
            h.e(workerParams, "workerParams");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
        
            if (r6.sendReceiveReceipt(r5, r2, r9, r0) == r1) goto L38;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object doWork(InterfaceC5267d interfaceC5267d) {
            a aVar;
            Object obj;
            int i;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (interfaceC5267d instanceof a) {
                aVar = (a) interfaceC5267d;
                int i6 = aVar.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i6 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    A7.a aVar2 = A7.a.f58n;
                    i = aVar.label;
                    if (i != 0) {
                        d.k(obj);
                        Context applicationContext = getApplicationContext();
                        h.d(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = g.b(applicationContext, aVar);
                        if (obj != aVar2) {
                            receiveReceiptWorker = this;
                        }
                        return aVar2;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d.k(obj);
                        return q.a();
                    }
                    receiveReceiptWorker = (ReceiveReceiptWorker) aVar.L$0;
                    d.k(obj);
                    if (((Boolean) obj).booleanValue()) {
                        com.onesignal.debug.internal.logging.b.warn$default("ReceiveReceiptWorker skipped due to failed OneSignal initialization", null, 2, null);
                        return q.a();
                    }
                    String b9 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                    if (b9 == null) {
                        return new n();
                    }
                    String b10 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                    if (b10 == null) {
                        return new n();
                    }
                    String b11 = receiveReceiptWorker.getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                    if (b11 == null) {
                        return new n();
                    }
                    B5.a aVar3 = (B5.a) g.a().getService(B5.a.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC5267d);
            obj = aVar.result;
            A7.a aVar22 = A7.a.f58n;
            i = aVar.label;
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public ReceiveReceiptWorkManager(f _applicationService, c _configModelStore, Z5.b _subscriptionManager) {
        h.e(_applicationService, "_applicationService");
        h.e(_configModelStore, "_configModelStore");
        h.e(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final J0.d buildConstraints() {
        return new J0.d(2, false, false, false, false, -1L, -1L, AbstractC5129j.P(new LinkedHashSet()));
    }

    @Override // B5.b
    public void enqueueReceiveReceipt(String notificationId) {
        h.e(notificationId, "notificationId");
        if (!((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getReceiveReceiptEnabled()) {
            com.onesignal.debug.internal.logging.b.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            com.onesignal.debug.internal.logging.b.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap hashMap = new HashMap();
        hashMap.put(OS_NOTIFICATION_ID, notificationId);
        hashMap.put(OS_APP_ID, appId);
        hashMap.put(OS_SUBSCRIPTION_ID, id);
        J0.h hVar = new J0.h(hashMap);
        J0.h.c(hVar);
        J0.d constraints = buildConstraints();
        Z2.e eVar = new Z2.e(ReceiveReceiptWorker.class);
        h.e(constraints, "constraints");
        ((p) eVar.f4171v).f2816j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        eVar.I(randomDelay);
        ((p) eVar.f4171v).f2812e = hVar;
        t m4 = eVar.m();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        y iVar = i.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = notificationId.concat("_receive_receipt");
        iVar.getClass();
        new k((K0.p) iVar, concat, Collections.singletonList(m4)).o();
    }
}
