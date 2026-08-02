package io.appmetrica.analytics.push.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.push.coreutils.internal.commands.PushTokenCommandInfo;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* renamed from: io.appmetrica.analytics.push.impl.i2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C1042i2 implements D {
    public final A0 a;
    public final C1093z0 b;
    public final w2 c;

    public C1042i2(A0 a0, C1093z0 c1093z0, w2 w2Var) {
        this.a = a0;
        this.b = c1093z0;
        this.c = w2Var;
    }

    @Override // io.appmetrica.analytics.push.impl.D
    public final void a(Context context, Bundle bundle) {
        PushTokenCommandInfo fromBundle;
        PushServiceController pushServiceController;
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.info("Trying to get tokens", new Object[0]);
        if (!r.a(context).g()) {
            publicLogger.warning("Failed to send push token. AppMetricaPush is not activated", new Object[0]);
            TrackersHub.getInstance().reportEvent("Failed to send push token. AppMetricaPush is not activated");
            return;
        }
        this.a.getClass();
        Bundle bundle2 = bundle.getBundle("io.appmetrica.analytics.push.extra.EXTRA_INFO");
        u2 u2Var = null;
        r3 = null;
        String str = null;
        if (bundle2 == null || (fromBundle = PushTokenCommandInfo.INSTANCE.fromBundle(bundle2)) == null) {
            publicLogger.warning("Failed to get token event from bundle " + bundle, new Object[0]);
            TrackersHub.getInstance().reportEvent("Failed to get token event from bundle " + bundle);
        } else {
            String str2 = fromBundle.getCom.yandex.passport.internal.ui.authsdk.AuthSdkActivity.RESPONSE_TYPE_TOKEN java.lang.String();
            if (str2 == null) {
                C1018c2 c1018c2 = r.a(context).d;
                if (c1018c2 != null && (pushServiceController = (PushServiceController) c1018c2.b.get(fromBundle.getProvider())) != null) {
                    str = pushServiceController.getToken();
                }
            } else {
                str = str2;
            }
            u2Var = new u2(fromBundle.getProvider(), str, fromBundle.getForce());
        }
        if (u2Var == null) {
            publicLogger.warning("Failed to send push token. Token event is null", new Object[0]);
            return;
        }
        this.b.getClass();
        v2[] v2VarArr = {new W0(), new C1027f(new C1045j1(r.a(context).e), new C1022d2(r.a(context).d))};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(v2VarArr[i].a());
        }
        arrayList.toString();
        publicLogger.info("Found token " + u2Var.a + Extension.COLON_SPACE + u2Var.b, new Object[0]);
        for (int i2 = 0; i2 < 2; i2++) {
            v2 v2Var = v2VarArr[i2];
            boolean a = v2Var.a(u2Var);
            PublicLogger.INSTANCE.info(v2Var.a() + " provider: " + u2Var.a + ", shouldSend: " + a, new Object[0]);
            if (a) {
                publicLogger.info("Processing token " + u2Var.a + Extension.COLON_SPACE + u2Var.b, new Object[0]);
                this.c.a(context, u2Var);
                return;
            }
        }
        publicLogger.info("Skipping token " + u2Var.a + Extension.COLON_SPACE + u2Var.b, new Object[0]);
    }
}
