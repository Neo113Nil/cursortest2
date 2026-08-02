package ru.yandex.music.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.av0;
import defpackage.hag;
import defpackage.jyr;
import defpackage.l18;
import defpackage.rlg;
import defpackage.ssg;
import defpackage.x97;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;

/* loaded from: classes6.dex */
public final class LoginAccountsChangedReceiver extends BroadcastReceiver {
    public final jyr a = l18.b.b(hag.I(av0.class), true);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ssg.a(4, null, "logout if account lost", null);
        x97.D(g.a, new rlg(intent, this, (Continuation) null, 2));
    }
}
