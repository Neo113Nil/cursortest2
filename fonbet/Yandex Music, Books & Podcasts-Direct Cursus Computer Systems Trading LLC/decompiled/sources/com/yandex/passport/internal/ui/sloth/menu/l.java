package com.yandex.passport.internal.ui.sloth.menu;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.internal.ui.sloth.menu.host.UserIdCommunicationService;
import defpackage.gm5;
import defpackage.hld;
import defpackage.j5;

/* loaded from: classes4.dex */
public final class l extends j5 {
    public final Context d;

    public l(Context context, j jVar) {
        super((com.yandex.passport.internal.provider.communication.r) jVar);
        this.d = context;
    }

    @Override // defpackage.j5
    public final boolean a() {
        if (((gm5) this.b) == null) {
            this.b = hld.j();
        }
        int i = UserIdCommunicationService.c;
        com.yandex.passport.internal.provider.communication.a aVar = (com.yandex.passport.internal.provider.communication.a) this.c;
        Context context = this.d;
        context.getClass();
        context.bindService(new Intent(context, (Class<?>) UserIdCommunicationService.class), aVar, 1);
        return true;
    }
}
