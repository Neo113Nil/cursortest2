package com.gamericefishpro.space.xe;

import android.content.Context;
import android.os.Bundle;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.fg.c;
import com.gamericefishpro.space.vh.i;
import com.gamericefishpro.space.wa.b;
import com.gamericefishpro.space.yb.e;
import com.huawei.hms.push.RemoteMessage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";
    public static final String HMS_TTL_KEY = "hms.ttl";
    public static final a INSTANCE = new a();
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.gamericefishpro.space.xe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0073a extends i implements Function1 {
        final /* synthetic */ a0 $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0073a(a0 a0Var, String str, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$registerer = a0Var;
            this.$token = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return new C0073a(this.$registerer, this.$token, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((C0073a) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                b.P(obj);
                c cVar = (c) this.$registerer.d;
                String str = this.$token;
                this.label = 1;
                if (cVar.fireCallback(str, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.P(obj);
            }
            return Unit.a;
        }
    }

    private a() {
    }

    public final void onMessageReceived(Context context, RemoteMessage message) {
        Bundle bundleJsonStringToBundle;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (com.gamericefishpro.space.xb.c.b(context)) {
            com.gamericefishpro.space.kd.a aVar = (com.gamericefishpro.space.kd.a) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.kd.a.class);
            com.gamericefishpro.space.hf.b bVar = (com.gamericefishpro.space.hf.b) com.gamericefishpro.space.xb.c.a().getService(com.gamericefishpro.space.hf.b.class);
            String data = message.getData();
            try {
                JSONObject jSONObject = new JSONObject(message.getData());
                if (message.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, message.getTtl());
                }
                if (message.getSentTime() == 0) {
                    jSONObject.put(HMS_SENT_TIME_KEY, aVar.getCurrentTimeMillis());
                } else {
                    jSONObject.put(HMS_SENT_TIME_KEY, message.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                com.gamericefishpro.space.od.b.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (bundleJsonStringToBundle = e.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            bVar.processBundleFromReceiver(context, bundleJsonStringToBundle);
        }
    }

    public final void onNewToken(Context context, String token, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            com.gamericefishpro.space.od.b.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        com.gamericefishpro.space.od.b.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        a0 a0Var = new a0();
        a0Var.d = com.gamericefishpro.space.xb.c.a().getService(c.class);
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new C0073a(a0Var, token, null), 1, null);
    }

    @com.gamericefishpro.space.oh.a
    public final void onNewToken(Context context, String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        onNewToken(context, token, null);
    }
}
