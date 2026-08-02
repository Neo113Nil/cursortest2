package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.gs4;
import defpackage.j3c;
import defpackage.ja;

/* loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && j3c.n.get()) {
            gs4 o = gs4.i.o();
            ja jaVar = (ja) o.a;
            o.U(jaVar, jaVar);
        }
    }
}
