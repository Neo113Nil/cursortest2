package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.impl.b;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends b {
    private final u9.a _locationManager;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.a$a, reason: collision with other inner class name */
    public static final class C0032a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public C0032a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(u9.a aVar) {
        j.e(aVar, "_locationManager");
        this._locationManager = aVar;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(fc.d dVar) {
        C0032a c0032a;
        int i10;
        boolean booleanValue;
        if (dVar instanceof C0032a) {
            c0032a = (C0032a) dVar;
            int i11 = c0032a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0032a.label = i11 - Integer.MIN_VALUE;
                Object obj = c0032a.result;
                i10 = c0032a.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    u9.a aVar = this._locationManager;
                    c0032a.label = 1;
                    obj = aVar.requestPermission(c0032a);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return b.a.PERMISSION_GRANTED;
                }
                if (booleanValue) {
                    throw new ac.d();
                }
                return b.a.PERMISSION_DENIED;
            }
        }
        c0032a = new C0032a(dVar);
        Object obj2 = c0032a.result;
        i10 = c0032a.label;
        if (i10 != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
