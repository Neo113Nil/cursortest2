package com.onesignal.notifications.internal.receivereceipt.impl;

import ac.o;
import fc.d;
import pc.j;
import v8.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements va.a {
    private final fa.a _backend;
    private final c _deviceService;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0058a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public C0058a(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c cVar, fa.a aVar) {
        j.e(cVar, "_deviceService");
        j.e(aVar, "_backend");
        this._deviceService = cVar;
        this._backend = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(4:19|20|21|(1:23))|12|13|14))|27|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        com.onesignal.debug.internal.logging.b.error$default("Receive receipt failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    @Override // va.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, d dVar) {
        C0058a c0058a;
        int i10;
        if (dVar instanceof C0058a) {
            c0058a = (C0058a) dVar;
            int i11 = c0058a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0058a.label = i11 - Integer.MIN_VALUE;
                C0058a c0058a2 = c0058a;
                Object obj = c0058a2.result;
                i10 = c0058a2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    v8.a deviceType = this._deviceService.getDeviceType();
                    fa.a aVar = this._backend;
                    c0058a2.label = 1;
                    Object updateNotificationAsReceived = aVar.updateNotificationAsReceived(str, str3, str2, deviceType, c0058a2);
                    gc.a aVar2 = gc.a.f2559g;
                    if (updateNotificationAsReceived == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                return o.f277a;
            }
        }
        c0058a = new C0058a(dVar);
        C0058a c0058a22 = c0058a;
        Object obj2 = c0058a22.result;
        i10 = c0058a22.label;
        if (i10 != 0) {
        }
        return o.f277a;
    }
}
