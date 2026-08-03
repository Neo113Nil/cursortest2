package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import h8.d;
import pc.j;
import pc.s;
import ta.b;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        Intent intent = getIntent();
        Context applicationContext = getApplicationContext();
        j.d(applicationContext, "applicationContext");
        if (d.b(applicationContext)) {
            s sVar = new s();
            sVar.f5683g = d.a().getService(b.class);
            com.onesignal.common.threading.b.suspendifyBlocking(new h8.b(sVar, this, intent, null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        j.e(intent, "intent");
        super.onNewIntent(intent);
        a();
    }
}
