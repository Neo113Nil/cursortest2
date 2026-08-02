package com.onesignal.notifications.bridges;

import B7.h;
import I7.l;
import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.onesignal.common.f;
import com.onesignal.notifications.internal.registration.impl.c;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p4.g;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* renamed from: com.onesignal.notifications.bridges.a$a, reason: collision with other inner class name */
    public static final class C0226a extends h implements l {
        final /* synthetic */ Context $context;
        final /* synthetic */ RemoteMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0226a(Context context, RemoteMessage remoteMessage, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$context = context;
            this.$message = remoteMessage;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new C0226a(this.$context, this.$message, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            Bundle jsonStringToBundle;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                Context context = this.$context;
                this.label = 1;
                obj = g.b(context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            v vVar = v.f41073a;
            if (booleanValue) {
                K4.a aVar2 = (K4.a) g.a().getService(K4.a.class);
                p5.b bVar = (p5.b) g.a().getService(p5.b.class);
                String data = this.$message.getData();
                try {
                    JSONObject jSONObject = new JSONObject(this.$message.getData());
                    if (this.$message.getTtl() == 0) {
                        jSONObject.put(a.HMS_TTL_KEY, 259200);
                    } else {
                        jSONObject.put(a.HMS_TTL_KEY, this.$message.getTtl());
                    }
                    if (this.$message.getSentTime() == 0) {
                        jSONObject.put(a.HMS_SENT_TIME_KEY, aVar2.getCurrentTimeMillis());
                    } else {
                        jSONObject.put(a.HMS_SENT_TIME_KEY, this.$message.getSentTime());
                    }
                    data = jSONObject.toString();
                } catch (JSONException unused) {
                    com.onesignal.debug.internal.logging.b.warn$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
                }
                if (data != null && (jsonStringToBundle = f.INSTANCE.jsonStringToBundle(data)) != null) {
                    bVar.processBundleFromReceiver(this.$context, jsonStringToBundle);
                    return vVar;
                }
            }
            return vVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((C0226a) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class b extends h implements l {
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$token = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new b(this.$token, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                c cVar = (c) g.a().getService(c.class);
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(message, "message");
        com.onesignal.common.threading.c.suspendifyOnDefault(new C0226a(context, message, null));
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new b(token, null));
    }

    public final void onNewToken(Context context, String token) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(token, "token");
        onNewToken(context, token, null);
    }
}
