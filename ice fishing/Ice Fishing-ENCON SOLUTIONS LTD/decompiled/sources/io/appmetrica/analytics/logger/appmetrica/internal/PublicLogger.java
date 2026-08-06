package io.appmetrica.analytics.logger.appmetrica.internal;

import android.content.Context;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final PublicLogger f7358a = new PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f7358a;
        }

        public final void init(Context context) {
            BaseReleaseLogger.init(context);
        }

        private Companion() {
        }
    }

    public PublicLogger(String str) {
        super("AppMetrica", "[" + str + ']');
    }

    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
