package com.onesignal.notifications.internal.registration.impl;

import I7.p;
import S7.AbstractC0410y;
import S7.InterfaceC0408w;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import kotlin.jvm.internal.r;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class g implements C5.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final x4.f _applicationService;
    private final C4.c _deviceService;
    private com.onesignal.common.threading.f waiter;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.getHMSTokenTask(null, this);
        }
    }

    public static final class c extends B7.h implements p {
        final /* synthetic */ r $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r rVar, g gVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$pushToken = rVar;
            this.this$0 = gVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new c(this.$pushToken, this.this$0, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            String str;
            r rVar2;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                rVar = this.$pushToken;
                com.onesignal.common.threading.f fVar = this.this$0.waiter;
                if (fVar == null) {
                    str = null;
                    rVar.f38644n = str;
                    return v.f41073a;
                }
                this.L$0 = rVar;
                this.label = 1;
                Object waitForWake = fVar.waitForWake(this);
                if (waitForWake == aVar) {
                    return aVar;
                }
                rVar2 = rVar;
                obj = waitForWake;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rVar2 = (r) this.L$0;
                Q3.b.s(obj);
            }
            r rVar3 = rVar2;
            str = (String) obj;
            rVar = rVar3;
            rVar.f38644n = str;
            return v.f41073a;
        }
    }

    public static final class d extends B7.c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(C4.c _deviceService, x4.f _applicationService) {
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getHMSTokenTask(Context context, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        r rVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                        return new C5.a(null, Z5.f.MISSING_HMS_PUSHKIT_LIBRARY);
                    }
                    this.waiter = new com.onesignal.common.threading.f();
                    String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                    HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                    r rVar2 = new r();
                    String token = hmsInstanceId.getToken(string, "HCM");
                    rVar2.f38644n = token;
                    if (!TextUtils.isEmpty(token)) {
                        com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) rVar2.f38644n), null, 2, null);
                        return new C5.a((String) rVar2.f38644n, Z5.f.SUBSCRIBED);
                    }
                    c cVar = new c(rVar2, this, null);
                    bVar.L$0 = rVar2;
                    bVar.label = 1;
                    if (AbstractC0410y.z(30000L, cVar, bVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (r) bVar.L$0;
                    Q3.b.s(obj);
                }
                if (rVar.f38644n != null) {
                    com.onesignal.debug.internal.logging.b.warn$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                    return new C5.a(null, Z5.f.HMS_TOKEN_TIMEOUT);
                }
                com.onesignal.debug.internal.logging.b.debug$default("HMS registered with ID:" + ((String) rVar.f38644n), null, 2, null);
                return new C5.a((String) rVar.f38644n, Z5.f.SUBSCRIBED);
            }
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        if (rVar.f38644n != null) {
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, InterfaceC5240d interfaceC5240d) {
        com.onesignal.common.threading.f fVar = this.waiter;
        if (fVar != null) {
            fVar.wake(str);
        }
        return v.f41073a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|28|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        com.onesignal.debug.internal.logging.b.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = Z5.f.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r5 = new C5.a(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r5 = Z5.f.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // C5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC5240d interfaceC5240d) {
        d dVar;
        int i;
        if (interfaceC5240d instanceof d) {
            dVar = (d) interfaceC5240d;
            int i4 = dVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.label = i4 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                Object obj2 = A7.a.f215n;
                i = dVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    Context appContext = this._applicationService.getAppContext();
                    dVar.label = 1;
                    obj = getHMSTokenTask(appContext, dVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                C5.a aVar = (C5.a) obj;
                kotlin.jvm.internal.h.b(aVar);
                return aVar;
            }
        }
        dVar = new d(interfaceC5240d);
        Object obj3 = dVar.result;
        Object obj22 = A7.a.f215n;
        i = dVar.label;
        if (i != 0) {
        }
        C5.a aVar2 = (C5.a) obj3;
        kotlin.jvm.internal.h.b(aVar2);
        return aVar2;
    }
}
