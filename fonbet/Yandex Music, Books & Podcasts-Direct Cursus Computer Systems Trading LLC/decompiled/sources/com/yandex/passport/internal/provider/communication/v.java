package com.yandex.passport.internal.provider.communication;

import android.content.Context;
import android.content.Intent;
import defpackage.gm5;
import defpackage.hld;
import defpackage.j5;

/* loaded from: classes4.dex */
public final class v extends j5 {
    public final Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, u uVar) {
        super((r) uVar);
        context.getClass();
        uVar.getClass();
        this.d = context;
    }

    @Override // defpackage.j5
    public final boolean a() {
        if (((gm5) this.b) != null) {
            return false;
        }
        this.b = hld.j();
        int i = HostCommunicationService.c;
        a aVar = (a) this.c;
        Context context = this.d;
        context.getClass();
        context.bindService(new Intent(context, (Class<?>) HostCommunicationService.class), aVar, 1);
        return true;
    }
}
