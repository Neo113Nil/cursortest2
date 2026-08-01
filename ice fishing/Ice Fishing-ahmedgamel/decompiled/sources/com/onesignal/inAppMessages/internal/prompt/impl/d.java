package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.impl.b;
import i5.n;
import kotlin.jvm.internal.h;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d extends b {
    private final n _notificationsManager;

    public static final class a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.handlePrompt(this);
        }
    }

    public d(n _notificationsManager) {
        h.e(_notificationsManager, "_notificationsManager");
        this._notificationsManager = _notificationsManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "push";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
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
                    n nVar = this._notificationsManager;
                    aVar.label = 1;
                    obj = nVar.requestPermission(true, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                return !((Boolean) obj).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
            }
        }
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
