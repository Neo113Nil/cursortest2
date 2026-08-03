package com.onesignal.notifications.internal.registration.impl;

import ac.o;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import hc.j;
import pc.s;
import yc.a0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements wa.b, com.onesignal.notifications.internal.registration.impl.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final q8.f _applicationService;
    private final v8.c _deviceService;
    private com.onesignal.common.threading.d waiter;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.getHMSTokenTask(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends j implements oc.e {
        final /* synthetic */ s $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s sVar, g gVar, fc.d dVar) {
            super(2, dVar);
            this.$pushToken = sVar;
            this.this$0 = gVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new c(this.$pushToken, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            s sVar;
            String str;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                sVar = this.$pushToken;
                com.onesignal.common.threading.d dVar = this.this$0.waiter;
                if (dVar == null) {
                    str = null;
                    sVar.f5683g = str;
                    return o.f277a;
                }
                this.L$0 = sVar;
                this.label = 1;
                obj = dVar.waitForWake(this);
                gc.a aVar = gc.a.f2559g;
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = (s) this.L$0;
                v6.a.W(obj);
            }
            str = (String) obj;
            sVar.f5683g = str;
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(v8.c cVar, q8.f fVar) {
        pc.j.e(cVar, "_deviceService");
        pc.j.e(fVar, "_applicationService");
        this._deviceService = cVar;
        this._applicationService = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:9:0x0020, B:12:0x002d, B:13:0x00ae, B:15:0x00b2, B:19:0x00d1, B:20:0x0036, B:21:0x003d, B:22:0x003e, B:24:0x0049, B:27:0x0052, B:29:0x007a, B:32:0x009a, B:37:0x001b), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d1 A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:9:0x0020, B:12:0x002d, B:13:0x00ae, B:15:0x00b2, B:19:0x00d1, B:20:0x0036, B:21:0x003d, B:22:0x003e, B:24:0x0049, B:27:0x0052, B:29:0x007a, B:32:0x009a, B:37:0x001b), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0014, B:9:0x0020, B:12:0x002d, B:13:0x00ae, B:15:0x00b2, B:19:0x00d1, B:20:0x0036, B:21:0x003d, B:22:0x003e, B:24:0x0049, B:27:0x0052, B:29:0x007a, B:32:0x009a, B:37:0x001b), top: B:3:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized Object getHMSTokenTask(Context context, fc.d dVar) {
        b bVar;
        int i10;
        s sVar;
        wa.a aVar;
        try {
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i11 = bVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    gc.a aVar2 = gc.a.f2559g;
                    i10 = bVar.label;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                            return new wa.a(null, ob.f.MISSING_HMS_PUSHKIT_LIBRARY);
                        }
                        this.waiter = new com.onesignal.common.threading.d();
                        String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
                        HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
                        s sVar2 = new s();
                        String token = hmsInstanceId.getToken(string, "HCM");
                        sVar2.f5683g = token;
                        if (!TextUtils.isEmpty(token)) {
                            com.onesignal.debug.internal.logging.b.info$default("Device registered for HMS, push token = " + ((String) sVar2.f5683g), null, 2, null);
                            return new wa.a((String) sVar2.f5683g, ob.f.SUBSCRIBED);
                        }
                        c cVar = new c(sVar2, this, null);
                        bVar.L$0 = sVar2;
                        bVar.label = 1;
                        if (a0.B(30000L, cVar, bVar) == aVar2) {
                            return aVar2;
                        }
                        sVar = sVar2;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = (s) bVar.L$0;
                        v6.a.W(obj);
                    }
                    if (sVar.f5683g == null) {
                        com.onesignal.debug.internal.logging.b.error$default("HMS registered with ID:" + ((String) sVar.f5683g), null, 2, null);
                        aVar = new wa.a((String) sVar.f5683g, ob.f.SUBSCRIBED);
                    } else {
                        com.onesignal.debug.internal.logging.b.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
                        aVar = new wa.a(null, ob.f.HMS_TOKEN_TIMEOUT);
                    }
                    return aVar;
                }
            }
            bVar = new b(dVar);
            Object obj2 = bVar.result;
            gc.a aVar22 = gc.a.f2559g;
            i10 = bVar.label;
            if (i10 != 0) {
            }
            if (sVar.f5683g == null) {
            }
            return aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.onesignal.notifications.internal.registration.impl.c
    public Object fireCallback(String str, fc.d dVar) {
        com.onesignal.common.threading.d dVar2 = this.waiter;
        if (dVar2 != null) {
            dVar2.wake(str);
        }
        return o.f277a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|29|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0025, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        com.onesignal.debug.internal.logging.b.error("HMS ApiException getting Huawei push token!", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
    
        if (r5.getStatusCode() == 907135000) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        r5 = ob.f.HMS_ARGUMENTS_INVALID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r5 = new wa.a(null, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        r5 = ob.f.HMS_API_EXCEPTION_OTHER;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // wa.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(fc.d dVar) {
        d dVar2;
        int i10;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i10 = dVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    Context appContext = this._applicationService.getAppContext();
                    dVar2.label = 1;
                    obj = getHMSTokenTask(appContext, dVar2);
                    Object obj2 = gc.a.f2559g;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                wa.a aVar = (wa.a) obj;
                pc.j.b(aVar);
                return aVar;
            }
        }
        dVar2 = new d(dVar);
        Object obj3 = dVar2.result;
        i10 = dVar2.label;
        if (i10 != 0) {
        }
        wa.a aVar2 = (wa.a) obj3;
        pc.j.b(aVar2);
        return aVar2;
    }
}
