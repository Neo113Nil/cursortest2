package com.onesignal.notifications.internal.pushtoken;

import V5.f;
import kotlin.jvm.internal.h;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import y5.C5253a;
import y5.InterfaceC5254b;

/* loaded from: classes2.dex */
public final class c implements com.onesignal.notifications.internal.pushtoken.a {
    private final y4.c _deviceService;
    private final InterfaceC5254b _pushRegistrator;
    private String pushToken;
    private f pushTokenStatus;

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
            return c.this.retrievePushToken(this);
        }
    }

    public c(InterfaceC5254b _pushRegistrator, y4.c _deviceService) {
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
    public Object retrievePushToken(InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        c cVar;
        int value;
        f fVar;
        f fVar2;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    int i9 = b.$EnumSwitchMapping$0[this._deviceService.getJetpackLibraryStatus().ordinal()];
                    if (i9 == 1) {
                        com.onesignal.debug.internal.logging.b.info$default("Could not find the Jetpack/AndroidX. Please make sure it has been correctly added to your project.", null, 2, null);
                        this.pushTokenStatus = f.MISSING_JETPACK_LIBRARY;
                    } else if (i9 != 2) {
                        InterfaceC5254b interfaceC5254b = this._pushRegistrator;
                        aVar.L$0 = this;
                        aVar.label = 1;
                        obj = interfaceC5254b.registerForPush(aVar);
                        if (obj == enumC5179a) {
                            return enumC5179a;
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
                com.bumptech.glide.f.r(obj);
                C5253a c5253a = (C5253a) obj;
                value = c5253a.getStatus().getValue();
                fVar = f.SUBSCRIBED;
                if (value != fVar.getValue()) {
                    cVar.pushTokenStatus = c5253a.getStatus();
                } else if (c5253a.getStatus().getValue() < fVar.getValue()) {
                    if (cVar.pushToken == null && ((fVar2 = cVar.pushTokenStatus) == f.NO_PERMISSION || cVar.pushStatusRuntimeError(fVar2))) {
                        cVar.pushTokenStatus = c5253a.getStatus();
                    }
                } else if (cVar.pushStatusRuntimeError(cVar.pushTokenStatus)) {
                    cVar.pushTokenStatus = c5253a.getStatus();
                }
                cVar.pushToken = c5253a.getId();
                return new d(cVar.pushToken, cVar.pushTokenStatus);
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        C5253a c5253a2 = (C5253a) obj2;
        value = c5253a2.getStatus().getValue();
        fVar = f.SUBSCRIBED;
        if (value != fVar.getValue()) {
        }
        cVar.pushToken = c5253a2.getId();
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
