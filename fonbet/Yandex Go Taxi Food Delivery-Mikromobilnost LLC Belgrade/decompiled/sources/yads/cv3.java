package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.w171;

/* loaded from: classes7.dex */
public final class cv3 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        w171 w171Var;
        boolean z;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            w171Var = w171.d;
            z = true;
            w171Var.a(true, w171Var.c);
        } else {
            if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                return;
            }
            w171Var = w171.d;
            z = false;
            w171Var.a(false, w171Var.c);
        }
        w171Var.b = z;
    }
}
