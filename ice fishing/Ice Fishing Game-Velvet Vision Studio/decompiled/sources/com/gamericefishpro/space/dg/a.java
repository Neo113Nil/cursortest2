package com.gamericefishpro.space.dg;

import com.gamericefishpro.space.vc.c;
import com.gamericefishpro.space.wa.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.cg.a {
    private final com.gamericefishpro.space.bf.a _backend;
    private final c _deviceService;

    /* JADX INFO: renamed from: com.gamericefishpro.space.dg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0010a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0010a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c _deviceService, com.gamericefishpro.space.bf.a _backend) {
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.cg.a
    public Object sendReceiveReceipt(String str, String str2, String str3, com.gamericefishpro.space.th.a aVar) {
        C0010a c0010a;
        if (aVar instanceof C0010a) {
            c0010a = (C0010a) aVar;
            int i = c0010a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0010a.label = i - Integer.MIN_VALUE;
            } else {
                c0010a = new C0010a(aVar);
            }
        } else {
            c0010a = new C0010a(aVar);
        }
        C0010a c0010a2 = c0010a;
        Object obj = c0010a2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0010a2.label;
        try {
            if (i2 == 0) {
                b.P(obj);
                com.gamericefishpro.space.vc.a deviceType = this._deviceService.getDeviceType();
                com.gamericefishpro.space.bf.a aVar3 = this._backend;
                c0010a2.label = 1;
                if (aVar3.updateNotificationAsReceived(str, str3, str2, deviceType, c0010a2) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.P(obj);
            }
        } catch (com.gamericefishpro.space.ec.a e) {
            com.gamericefishpro.space.od.b.error$default("Receive receipt failed with statusCode: " + e.getStatusCode() + " response: " + e.getResponse(), null, 2, null);
        }
        return Unit.a;
    }
}
