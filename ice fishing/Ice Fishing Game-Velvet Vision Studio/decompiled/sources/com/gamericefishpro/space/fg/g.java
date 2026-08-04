package com.gamericefishpro.space.fg;

import android.content.Context;
import android.text.TextUtils;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.eg.b, com.gamericefishpro.space.fg.c {
    public static final a Companion = new a(null);
    private static final String HMS_CLIENT_APP_ID = "client/app_id";
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private com.gamericefishpro.space.ic.d waiter;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.getHMSTokenTask(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends i implements Function2 {
        final /* synthetic */ a0 $pushToken;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var, g gVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$pushToken = a0Var;
            this.this$0 = gVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new c(this.$pushToken, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            a0 a0Var;
            String str;
            a0 a0Var2;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                a0Var = this.$pushToken;
                com.gamericefishpro.space.ic.d dVar = this.this$0.waiter;
                if (dVar != null) {
                    this.L$0 = a0Var;
                    this.label = 1;
                    Object objWaitForWake = dVar.waitForWake(this);
                    if (objWaitForWake == aVar) {
                        return aVar;
                    }
                    a0Var2 = a0Var;
                    obj = objWaitForWake;
                } else {
                    str = null;
                }
                a0Var.d = str;
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var2 = (a0) this.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var3 = a0Var2;
            str = (String) obj;
            a0Var = a0Var3;
            a0Var.d = str;
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.registerForPush(this);
        }
    }

    public g(com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.lc.f _applicationService) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._deviceService = _deviceService;
        this._applicationService = _applicationService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getHMSTokenTask(Context context, com.gamericefishpro.space.th.a aVar) {
        b bVar;
        a0 a0Var;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        Object obj = bVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (!this._deviceService.getHasAllHMSLibrariesForPushKit()) {
                return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.MISSING_HMS_PUSHKIT_LIBRARY);
            }
            this.waiter = new com.gamericefishpro.space.ic.d();
            String string = AGConnectServicesConfig.fromContext(context).getString(HMS_CLIENT_APP_ID);
            HmsInstanceId hmsInstanceId = HmsInstanceId.getInstance(context);
            a0 a0Var2 = new a0();
            String token = hmsInstanceId.getToken(string, "HCM");
            a0Var2.d = token;
            if (!TextUtils.isEmpty(token)) {
                com.gamericefishpro.space.od.b.info$default("Device registered for HMS, push token = " + ((String) a0Var2.d), null, 2, null);
                return new com.gamericefishpro.space.eg.a((String) a0Var2.d, com.gamericefishpro.space.jh.f.SUBSCRIBED);
            }
            c cVar = new c(a0Var2, this, null);
            bVar.L$0 = a0Var2;
            bVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.E(30000L, cVar, bVar) == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (a0Var.d == null) {
            com.gamericefishpro.space.od.b.error$default("HmsMessageServiceOneSignal.onNewToken timed out.", null, 2, null);
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.HMS_TOKEN_TIMEOUT);
        }
        com.gamericefishpro.space.od.b.error$default("HMS registered with ID:" + ((String) a0Var.d), null, 2, null);
        return new com.gamericefishpro.space.eg.a((String) a0Var.d, com.gamericefishpro.space.jh.f.SUBSCRIBED);
    }

    @Override // com.gamericefishpro.space.fg.c
    public Object fireCallback(String str, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.ic.d dVar = this.waiter;
        if (dVar != null) {
            dVar.wake(str);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.eg.b
    public Object registerForPush(com.gamericefishpro.space.th.a aVar) {
        d dVar;
        com.gamericefishpro.space.eg.a aVar2;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object hMSTokenTask = dVar.result;
        Object obj = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(hMSTokenTask);
                Context appContext = this._applicationService.getAppContext();
                dVar.label = 1;
                hMSTokenTask = getHMSTokenTask(appContext, dVar);
                if (hMSTokenTask == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(hMSTokenTask);
            }
            aVar2 = (com.gamericefishpro.space.eg.a) hMSTokenTask;
        } catch (ApiException e) {
            com.gamericefishpro.space.od.b.error("HMS ApiException getting Huawei push token!", e);
            aVar2 = new com.gamericefishpro.space.eg.a(null, e.getStatusCode() == 907135000 ? com.gamericefishpro.space.jh.f.HMS_ARGUMENTS_INVALID : com.gamericefishpro.space.jh.f.HMS_API_EXCEPTION_OTHER);
        }
        Intrinsics.b(aVar2);
        return aVar2;
    }
}
