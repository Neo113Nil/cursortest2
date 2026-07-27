package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.HmsMessageService;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.debug.internal.logging.b;
import com.onesignal.notifications.bridges.a;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class HmsMessageServiceOneSignal extends HmsMessageService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage message) {
        h.e(message, "message");
        a.INSTANCE.onMessageReceived((Context) this, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String token, Bundle bundle) {
        h.e(token, "token");
        h.e(bundle, "bundle");
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(token), null, 2, null);
        a.INSTANCE.onNewToken((Context) this, token, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNewToken(String token) {
        h.e(token, "token");
        b.debug$default("HmsMessageServiceOneSignal onNewToken refresh token:".concat(token), null, 2, null);
        a.INSTANCE.onNewToken((Context) this, token);
    }
}
