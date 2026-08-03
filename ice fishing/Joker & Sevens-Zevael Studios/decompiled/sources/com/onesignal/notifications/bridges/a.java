package com.onesignal.notifications.bridges;

import ac.o;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.g;
import fc.d;
import hc.j;
import ja.b;
import java.util.concurrent.atomic.AtomicBoolean;
import oc.c;
import org.json.JSONException;
import org.json.JSONObject;
import pc.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0047a extends j implements c {
        final /* synthetic */ s $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0047a(s sVar, String str, d dVar) {
            super(1, dVar);
            this.$registerer = sVar;
            this.$token = str;
        }

        @Override // hc.a
        public final d create(d dVar) {
            return new C0047a(this.$registerer, this.$token, dVar);
        }

        @Override // oc.c
        public final Object invoke(d dVar) {
            return ((C0047a) create(dVar)).invokeSuspend(o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                com.onesignal.notifications.internal.registration.impl.c cVar = (com.onesignal.notifications.internal.registration.impl.c) this.$registerer.f5683g;
                String str = this.$token;
                this.label = 1;
                Object fireCallback = cVar.fireCallback(str, this);
                gc.a aVar = gc.a.f2559g;
                if (fireCallback == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return o.f277a;
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage remoteMessage) {
        Bundle jsonStringToBundle;
        pc.j.e(context, "context");
        pc.j.e(remoteMessage, "message");
        if (h8.d.b(context)) {
            e9.a aVar = (e9.a) h8.d.a().getService(e9.a.class);
            b bVar = (b) h8.d.a().getService(b.class);
            String data = remoteMessage.getData();
            try {
                JSONObject jSONObject = new JSONObject(remoteMessage.getData());
                if (remoteMessage.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, remoteMessage.getTtl());
                }
                if (remoteMessage.getSentTime() == 0) {
                    jSONObject.put(HMS_SENT_TIME_KEY, aVar.getCurrentTimeMillis());
                } else {
                    jSONObject.put(HMS_SENT_TIME_KEY, remoteMessage.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.onesignal.debug.internal.logging.b.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (jsonStringToBundle = g.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            bVar.processBundleFromReceiver(context, jsonStringToBundle);
        }
    }

    public final void onNewToken(Context context, String str, Bundle bundle) {
        pc.j.e(context, "context");
        pc.j.e(str, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle, null, 2, null);
        s sVar = new s();
        sVar.f5683g = h8.d.a().getService(com.onesignal.notifications.internal.registration.impl.c.class);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new C0047a(sVar, str, null), 1, null);
    }

    @ac.a
    public final void onNewToken(Context context, String str) {
        pc.j.e(context, "context");
        pc.j.e(str, "token");
        onNewToken(context, str, null);
    }
}
