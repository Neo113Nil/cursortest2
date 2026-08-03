package com.onesignal.notifications.internal.pushtoken;

import ob.f;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final v8.c _deviceService;
    private final wa.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.retrievePushToken(this);
        }
    }

    public c(wa.b bVar, v8.c cVar) {
        j.e(bVar, "_pushRegistrator");
        j.e(cVar, "_deviceService");
        this._pushRegistrator = bVar;
        this._deviceService = cVar;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.onesignal.notifications.internal.pushtoken.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(fc.d dVar) {
        a aVar;
        int i10;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                i10 = aVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    int i12 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i12 == 1) {
                        com.onesignal.debug.internal.logging.b.fatal$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i12 != 2) {
                        wa.b bVar = this._pushRegistrator;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = bVar.registerForPush(aVar);
                        gc.a aVar2 = gc.a.f2559g;
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        cVar = this;
                    } else {
                        com.onesignal.debug.internal.logging.b.fatal$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
                    }
                    cVar = this;
                    return new d(cVar.pushToken, cVar.pushTokenStatus);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.L$0;
                v6.a.W(obj);
                wa.a aVar3 = (wa.a) obj;
                value = aVar3.getStatus().getValue();
                fVar = f.SUBSCRIBED;
                if (value != fVar.getValue()) {
                    cVar.pushTokenStatus = aVar3.getStatus();
                } else if (aVar3.getStatus().getValue() < fVar.getValue()) {
                    if (cVar.pushToken == null && ((fVar2 = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar2))) {
                        cVar.pushTokenStatus = aVar3.getStatus();
                    }
                } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
                    cVar.pushTokenStatus = aVar3.getStatus();
                }
                cVar.pushToken = aVar3.getId();
                return new d(cVar.pushToken, cVar.pushTokenStatus);
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        i10 = aVar.label;
        if (i10 != 0) {
        }
        wa.a aVar32 = (wa.a) obj2;
        value = aVar32.getStatus().getValue();
        fVar = f.SUBSCRIBED;
        if (value != fVar.getValue()) {
        }
        cVar.pushToken = aVar32.getId();
        return new d(cVar.pushToken, cVar.pushTokenStatus);
    }

    public final void setPushToken(String str) {
        this.pushToken = str;
    }

    public final void setPushTokenStatus(f fVar) {
        j.e(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
