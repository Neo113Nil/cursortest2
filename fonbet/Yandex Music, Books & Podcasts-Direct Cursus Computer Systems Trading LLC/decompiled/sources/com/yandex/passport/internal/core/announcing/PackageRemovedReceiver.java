package com.yandex.passport.internal.core.announcing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class PackageRemovedReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com.yandex.passport.legacy.a.e(3, "onReceive: received " + intent, null);
        if (intent == null) {
            com.yandex.passport.legacy.a.e(6, "onReceive: intent is null", null);
        } else if (TextUtils.equals(intent.getAction(), "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            new Thread(new androidx.core.app.a(3, goAsync())).start();
        } else {
            com.yandex.passport.legacy.a.e(3, "onReceive: ignored because wrong action", null);
        }
    }
}
