package com.onesignal.inAppMessages.internal.prompt.impl;

import a5.InterfaceC0441a;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import kotlin.jvm.internal.h;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a extends b {
    private final InterfaceC0441a _locationManager;

    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0210a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0210a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(InterfaceC0441a _locationManager) {
        h.e(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(InterfaceC5240d interfaceC5240d) {
        C0210a c0210a;
        int i;
        boolean booleanValue;
        if (interfaceC5240d instanceof C0210a) {
            c0210a = (C0210a) interfaceC5240d;
            int i4 = c0210a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0210a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0210a.result;
                A7.a aVar = A7.a.f215n;
                i = c0210a.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    InterfaceC0441a interfaceC0441a = this._locationManager;
                    c0210a.label = 1;
                    obj = interfaceC0441a.requestPermission(c0210a);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new B0.c();
                }
                return b.a.PERMISSION_DENIED;
            }
        }
        c0210a = new C0210a(interfaceC5240d);
        Object obj2 = c0210a.result;
        A7.a aVar2 = A7.a.f215n;
        i = c0210a.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
