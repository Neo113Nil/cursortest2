package com.onesignal.inAppMessages.internal.prompt.impl;

import com.bumptech.glide.f;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import e5.n;
import kotlin.jvm.internal.h;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class d extends b {
    private final n _notificationsManager;

    public static final class a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
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
    public Object handlePrompt(InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    f.r(obj);
                    n nVar = this._notificationsManager;
                    aVar.label = 1;
                    obj = nVar.requestPermission(true, aVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                return !((Boolean) obj).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
