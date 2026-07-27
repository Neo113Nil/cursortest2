package com.onesignal.notifications.internal.receivereceipt.impl;

import J0.d;
import J0.n;
import J0.q;
import J0.t;
import J0.y;
import K0.k;
import S0.p;
import V5.b;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.onesignal.common.AndroidUtils;
import com.onesignal.core.internal.config.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import l4.g;
import p5.i;
import r7.AbstractC4979j;
import t4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x5.InterfaceC5213a;
import x5.InterfaceC5214b;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class ReceiveReceiptWorkManager implements InterfaceC5214b {
    public static final a Companion = new a(null);
    private static final String OS_APP_ID = "os_app_id";
    private static final String OS_NOTIFICATION_ID = "os_notification_id";
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";
    private final f _applicationService;
    private final c _configModelStore;
    private final b _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        public static final class a extends AbstractC5219c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(InterfaceC5133d interfaceC5133d) {
                super(interfaceC5133d);
            }

            @Override // x7.AbstractC5217a
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
        public Object doWork(InterfaceC5133d interfaceC5133d) {
            a aVar;
            Object obj;
            int i;
            ReceiveReceiptWorker receiveReceiptWorker;
            if (interfaceC5133d instanceof a) {
                aVar = (a) interfaceC5133d;
                int i4 = aVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i4 - Integer.MIN_VALUE;
                    obj = aVar.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = aVar.label;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        Context applicationContext = getApplicationContext();
                        h.d(applicationContext, "getApplicationContext(...)");
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = g.b(applicationContext, aVar);
                        if (obj != enumC5179a) {
                            receiveReceiptWorker = this;
                        }
                        return enumC5179a;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                        return q.a();
                    }
                    receiveReceiptWorker = (ReceiveReceiptWorker) aVar.L$0;
                    com.bumptech.glide.f.r(obj);
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
                    InterfaceC5213a interfaceC5213a = (InterfaceC5213a) g.a().getService(InterfaceC5213a.class);
                    aVar.L$0 = null;
                    aVar.label = 2;
                }
            }
            aVar = new a(interfaceC5133d);
            obj = aVar.result;
            EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
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

    public ReceiveReceiptWorkManager(f _applicationService, c _configModelStore, b _subscriptionManager) {
        h.e(_applicationService, "_applicationService");
        h.e(_configModelStore, "_configModelStore");
        h.e(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final d buildConstraints() {
        return new d(2, false, false, false, false, -1L, -1L, AbstractC4979j.V(new LinkedHashSet()));
    }

    @Override // x5.InterfaceC5214b
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
        d constraints = buildConstraints();
        Y2.e eVar = new Y2.e(ReceiveReceiptWorker.class);
        h.e(constraints, "constraints");
        ((p) eVar.f3964v).f2928j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        eVar.L(randomDelay);
        ((p) eVar.f3964v).f2924e = hVar;
        t n9 = eVar.n();
        com.onesignal.debug.internal.logging.b.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        y iVar = i.INSTANCE.getInstance(this._applicationService.getAppContext());
        String concat = notificationId.concat("_receive_receipt");
        iVar.getClass();
        new k((K0.p) iVar, concat, Collections.singletonList(n9)).r();
    }
}
