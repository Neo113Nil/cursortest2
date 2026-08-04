package com.gamericefishpro.space.de;

import com.gamericefishpro.space.ve.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    private final n _notificationsManager;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.handlePrompt(this);
        }
    }

    public d(n _notificationsManager) {
        Intrinsics.checkNotNullParameter(_notificationsManager, "_notificationsManager");
        this._notificationsManager = _notificationsManager;
    }

    @Override // com.gamericefishpro.space.de.b
    public String getPromptKey() {
        return "push";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.de.b
    public Object handlePrompt(com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        Object objRequestPermission = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objRequestPermission);
            n nVar = this._notificationsManager;
            aVar2.label = 1;
            objRequestPermission = nVar.requestPermission(true, aVar2);
            if (objRequestPermission == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objRequestPermission);
        }
        return ((Boolean) objRequestPermission).booleanValue() ? b.a.PERMISSION_GRANTED : b.a.PERMISSION_DENIED;
    }
}
