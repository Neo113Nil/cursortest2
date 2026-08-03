package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.debug.internal.logging.b;
import com.onesignal.notifications.bridges.a;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        j.e(remoteMessage, "message");
        a.INSTANCE.onMessageReceived((Context) this, remoteMessage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String str, Bundle bundle) {
        j.e(str, "token");
        j.e(bundle, "bundle");
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(str), null, 2, null);
        a.INSTANCE.onNewToken((Context) this, str, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ac.a
    public void onNewToken(String str) {
        j.e(str, "token");
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(str), null, 2, null);
        a.INSTANCE.onNewToken((Context) this, str);
    }
}
