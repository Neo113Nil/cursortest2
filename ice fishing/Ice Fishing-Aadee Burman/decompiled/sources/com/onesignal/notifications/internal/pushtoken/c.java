package com.onesignal.notifications.internal.pushtoken;

import Z5.f;
import kotlin.jvm.internal.h;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final C4.c _deviceService;
    private final C5.b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

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
            return c.this.retrievePushToken(this);
        }
    }

    public c(C5.b _pushRegistrator, C4.c _deviceService) {
        h.e(_pushRegistrator, "_pushRegistrator");
        h.e(_deviceService, "_deviceService");
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.notifications.internal.pushtoken.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retrievePushToken(InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    int i9 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i9 == 1) {
                        com.onesignal.debug.internal.logging.b.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i9 != 2) {
                        C5.b bVar = this._pushRegistrator;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = bVar.registerForPush(aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        cVar = this;
                    } else {
                        com.onesignal.debug.internal.logging.b.info$default("The included Jetpack/AndroidX Library is too old or incomplete.", null, 2, null);
                        this.pushTokenStatus = f.OUTDATED_JETPACK_LIBRARY;
                    }
                    cVar = this;
                    return new d(cVar.pushToken, cVar.pushTokenStatus);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.L$0;
                com.bumptech.glide.d.k(obj);
                C5.a aVar3 = (C5.a) obj;
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
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        C5.a aVar32 = (C5.a) obj2;
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
        h.e(fVar, "<set-?>");
        this.pushTokenStatus = fVar;
    }
}
