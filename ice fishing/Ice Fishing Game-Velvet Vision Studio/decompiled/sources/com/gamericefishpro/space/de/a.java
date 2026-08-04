package com.gamericefishpro.space.de;

import com.gamericefishpro.space.oh.k;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    private final com.gamericefishpro.space.ke.a _locationManager;

    /* JADX INFO: renamed from: com.gamericefishpro.space.de.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0009a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0009a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.handlePrompt(this);
        }
    }

    public a(com.gamericefishpro.space.ke.a _locationManager) {
        Intrinsics.checkNotNullParameter(_locationManager, "_locationManager");
        this._locationManager = _locationManager;
    }

    @Override // com.gamericefishpro.space.de.b
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.de.b
    public Object handlePrompt(com.gamericefishpro.space.th.a aVar) {
        C0009a c0009a;
        if (aVar instanceof C0009a) {
            c0009a = (C0009a) aVar;
            int i = c0009a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0009a.label = i - Integer.MIN_VALUE;
            } else {
                c0009a = new C0009a(aVar);
            }
        } else {
            c0009a = new C0009a(aVar);
        }
        Object objRequestPermission = c0009a.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0009a.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objRequestPermission);
            com.gamericefishpro.space.ke.a aVar3 = this._locationManager;
            c0009a.label = 1;
            objRequestPermission = aVar3.requestPermission(c0009a);
            if (objRequestPermission == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objRequestPermission);
        }
        boolean zBooleanValue = ((Boolean) objRequestPermission).booleanValue();
        if (zBooleanValue) {
            return b.a.PERMISSION_GRANTED;
        }
        if (zBooleanValue) {
            throw new k();
        }
        return b.a.PERMISSION_DENIED;
    }
}
