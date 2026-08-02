package io.appmetrica.analytics.push.impl;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class Y1 implements U0 {
    public static final Y1 b = new Y1();
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5, String str6) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).a(str, str2, str3, str4, str5, str6);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onMessageReceived(String str, String str2, String str3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onMessageReceived(str, str2, str3);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationCleared(String str, String str2, String str3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onNotificationCleared(str, str2, str3);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationExpired(String str, String str2, String str3, String str4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onNotificationExpired(str, str2, str3, str4);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationIgnored(String str, String str2, String str3, String str4, String str5) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onNotificationIgnored(str, str2, str3, str4, str5);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationReplace(String str, String str2, String str3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onNotificationReplace(str, str2, str3);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onNotificationShown(String str, String str2, String str3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onNotificationShown(str, str2, str3);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenInited(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onPushTokenInited(str, str2);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onPushTokenUpdated(String str, String str2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onPushTokenUpdated(str, str2);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onRemovingSilentPushProcessed(String str, String str2, String str3, String str4, String str5) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onRemovingSilentPushProcessed(str, str2, str3, str4, str5);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void onSilentPushProcessed(String str, String str2, String str3) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).onSilentPushProcessed(str, str2, str3);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).a(str, str2, str3, str4);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str, String str2, String str3, String str4, String str5) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).a(str, str2, str3, str4, str5);
        }
    }

    @Override // io.appmetrica.analytics.push.impl.U0
    public final void a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((U0) it.next()).a(str);
        }
    }
}
