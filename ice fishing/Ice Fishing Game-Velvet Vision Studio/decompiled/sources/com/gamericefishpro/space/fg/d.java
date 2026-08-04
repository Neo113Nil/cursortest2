package com.gamericefishpro.space.fg;

import com.amazon.device.messaging.ADM;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.vh.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.eg.b, c {
    private final com.gamericefishpro.space.lc.f _applicationService;
    private com.gamericefishpro.space.ic.d waiter;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
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
            return d.this.registerForPush(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        final /* synthetic */ a0 $registrationId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var, d dVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$registrationId = a0Var;
            this.this$0 = dVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new b(this.$registrationId, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
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
                a0Var = this.$registrationId;
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

    public d(com.gamericefishpro.space.lc.f _applicationService) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
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
        a aVar2;
        a0 a0Var;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        Object obj = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            this.waiter = new com.gamericefishpro.space.ic.d();
            ADM adm = new ADM(this._applicationService.getAppContext());
            a0 a0Var2 = new a0();
            String registrationId = adm.getRegistrationId();
            a0Var2.d = registrationId;
            if (registrationId != null) {
                com.gamericefishpro.space.od.b.debug$default("ADM Already registered with ID:" + ((String) a0Var2.d), null, 2, null);
                return new com.gamericefishpro.space.eg.a((String) a0Var2.d, com.gamericefishpro.space.jh.f.SUBSCRIBED);
            }
            adm.startRegister();
            b bVar = new b(a0Var2, this, null);
            aVar2.L$0 = a0Var2;
            aVar2.label = 1;
            if (com.gamericefishpro.space.pi.a0.E(30000L, bVar, aVar2) == aVar3) {
                return aVar3;
            }
            a0Var = a0Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) aVar2.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        if (a0Var.d == null) {
            com.gamericefishpro.space.od.b.error$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
            return new com.gamericefishpro.space.eg.a(null, com.gamericefishpro.space.jh.f.ERROR);
        }
        com.gamericefishpro.space.od.b.error$default("ADM registered with ID:" + ((String) a0Var.d), null, 2, null);
        return new com.gamericefishpro.space.eg.a((String) a0Var.d, com.gamericefishpro.space.jh.f.SUBSCRIBED);
    }
}
