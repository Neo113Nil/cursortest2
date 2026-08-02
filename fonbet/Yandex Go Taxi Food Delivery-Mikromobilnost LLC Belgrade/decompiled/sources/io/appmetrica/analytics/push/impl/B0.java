package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.unr0;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class B0 implements LazyPushTransformRule {
    public final Context a;

    public B0(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final String getNewValue(String str) {
        try {
            String deviceId = AppMetrica.getDeviceId(this.a);
            return deviceId == null ? "" : deviceId;
        } catch (Throwable th) {
            PublicLogger publicLogger = PublicLogger.INSTANCE;
            StringBuilder x = unr0.x("Cannot get ", str, " for AppMetrica version: ");
            x.append(AppMetrica.getLibraryVersion());
            publicLogger.error(th, x.toString(), new Object[0]);
            return "";
        }
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final List getPatternList() {
        return Collections.singletonList("deviceId");
    }
}
