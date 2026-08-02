package io.appmetrica.analytics.push.impl;

import android.content.Context;
import defpackage.unr0;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.push.lazypush.LazyPushTransformRule;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class I2 implements LazyPushTransformRule {
    public final Context a;

    public I2(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.push.lazypush.LazyPushTransformRule
    public final String getNewValue(String str) {
        try {
            String uuid = AppMetrica.getUuid(this.a);
            return uuid == null ? "" : uuid;
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
        return Collections.singletonList("uuid");
    }
}
