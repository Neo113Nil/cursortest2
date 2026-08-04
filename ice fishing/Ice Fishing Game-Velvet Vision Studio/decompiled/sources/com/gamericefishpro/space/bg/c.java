package com.gamericefishpro.space.bg;

import com.gamericefishpro.space.jh.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.bg.a {
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.eg.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

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
            return c.this.retrievePushToken(this);
        }
    }

    public c(com.gamericefishpro.space.eg.b _pushRegistrator, com.gamericefishpro.space.vc.c _deviceService) {
        Intrinsics.checkNotNullParameter(_pushRegistrator, "_pushRegistrator");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        this._pushRegistrator = _pushRegistrator;
        this._deviceService = _deviceService;
        this.pushTokenStatus = f.NO_PERMISSION;
    }

    private final boolean pushStatusRuntimeError(f fVar) {
        return fVar.getValue() < -6;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public final f getPushTokenStatus() {
        return this.pushTokenStatus;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.bg.a
    public Object retrievePushToken(com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        c cVar;
        f fVar;
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
        Object objRegisterForPush = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objRegisterForPush);
            int i3 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
            if (i3 == 1) {
                com.gamericefishpro.space.od.b.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
            } else if (i3 != 2) {
                com.gamericefishpro.space.eg.b bVar = this._pushRegistrator;
                aVar2.L$0 = this;
                aVar2.label = 1;
                objRegisterForPush = bVar.registerForPush(aVar2);
                if (objRegisterForPush == aVar3) {
                    return aVar3;
                }
                cVar = this;
            } else {
                com.gamericefishpro.space.od.b.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
            }
            cVar = this;
            return new d(cVar.pushToken, cVar.pushTokenStatus);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (c) aVar2.L$0;
        com.gamericefishpro.space.wa.b.P(objRegisterForPush);
        com.gamericefishpro.space.eg.a aVar4 = (com.gamericefishpro.space.eg.a) objRegisterForPush;
        int value = aVar4.getStatus().getValue();
        f fVar2 = f.SUBSCRIBED;
        if (value == fVar2.getValue()) {
            cVar.pushTokenStatus = aVar4.getStatus();
        } else if (aVar4.getStatus().getValue() < fVar2.getValue()) {
            if (cVar.pushToken == null && ((fVar = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar))) {
                cVar.pushTokenStatus = aVar4.getStatus();
            }
        } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
            cVar.pushTokenStatus = aVar4.getStatus();
        }
        cVar.pushToken = aVar4.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
