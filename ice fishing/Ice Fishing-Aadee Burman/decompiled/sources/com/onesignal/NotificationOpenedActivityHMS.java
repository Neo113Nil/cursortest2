package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.common.threading.b;
import com.onesignal.common.threading.c;
import kotlin.jvm.internal.h;
import p4.e;
import x4.g;

/* loaded from: classes2.dex */
public final class NotificationOpenedActivityHMS extends Activity implements g {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        b.INSTANCE.prewarm();
        c.suspendifyOnDefault(new e(this, intent, null));
        finish();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        h.e(intent, "intent");
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        b.INSTANCE.prewarm();
        c.suspendifyOnDefault(new e(this, intent2, null));
        finish();
    }
}
