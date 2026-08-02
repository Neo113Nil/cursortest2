package com.yandex.passport.internal.core.announcing;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class c {
    public final Context a;

    public c(Context context) {
        this.a = context;
    }

    public final void a(a aVar) {
        com.yandex.passport.legacy.a.e(3, "sendAnnounce: " + aVar, null);
        aVar.getClass();
        Intent intent = new Intent(aVar.a);
        intent.putExtras(aVar.b);
        Context context = this.a;
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }
}
