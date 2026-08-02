package com.onesignal.notifications.internal.receivereceipt.impl;

import C4.c;
import Q3.b;
import kotlin.jvm.internal.h;
import l5.InterfaceC4677a;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements B5.a {
    private final InterfaceC4677a _backend;
    private final c _deviceService;

    /* renamed from: com.onesignal.notifications.internal.receivereceipt.impl.a$a, reason: collision with other inner class name */
    public static final class C0238a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0238a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendReceiveReceipt(null, null, null, this);
        }
    }

    public a(c _deviceService, InterfaceC4677a _backend) {
        h.e(_deviceService, "_deviceService");
        h.e(_backend, "_backend");
        this._deviceService = _deviceService;
        this._backend = _backend;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        com.onesignal.debug.internal.logging.b.info$default("Receive receipt failed with statusCode: " + r0.getStatusCode() + " response: " + r0.getResponse(), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // B5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendReceiveReceipt(String str, String str2, String str3, InterfaceC5240d interfaceC5240d) {
        C0238a c0238a;
        int i;
        if (interfaceC5240d instanceof C0238a) {
            c0238a = (C0238a) interfaceC5240d;
            int i4 = c0238a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0238a.label = i4 - Integer.MIN_VALUE;
                C0238a c0238a2 = c0238a;
                Object obj = c0238a2.result;
                A7.a aVar = A7.a.f215n;
                i = c0238a2.label;
                if (i != 0) {
                    b.s(obj);
                    C4.a deviceType = this._deviceService.getDeviceType();
                    InterfaceC4677a interfaceC4677a = this._backend;
                    c0238a2.label = 1;
                    if (interfaceC4677a.updateNotificationAsReceived(str, str3, str2, deviceType, c0238a2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.s(obj);
                }
                return v.f41073a;
            }
        }
        c0238a = new C0238a(interfaceC5240d);
        C0238a c0238a22 = c0238a;
        Object obj2 = c0238a22.result;
        A7.a aVar2 = A7.a.f215n;
        i = c0238a22.label;
        if (i != 0) {
        }
        return v.f41073a;
    }
}
