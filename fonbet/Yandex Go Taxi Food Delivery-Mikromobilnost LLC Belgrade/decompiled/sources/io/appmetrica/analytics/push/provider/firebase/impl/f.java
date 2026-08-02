package io.appmetrica.analytics.push.provider.firebase.impl;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kcr;
import defpackage.lcr;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import io.appmetrica.analytics.push.coreutils.internal.utils.CoreUtils;
import io.appmetrica.analytics.push.coreutils.internal.utils.TrackersHub;
import io.appmetrica.analytics.push.logger.internal.PublicLogger;
import io.appmetrica.analytics.push.provider.api.PushServiceController;
import io.appmetrica.analytics.push.provider.api.PushServiceExecutionRestrictions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;

/* loaded from: classes9.dex */
public class f implements PushServiceController {
    public final Context a;
    public final long b;
    public final i3y c;
    public final i3y d;
    public FirebaseMessaging e;

    public f(Context context, n nVar) {
        this.a = context;
        this.b = 20L;
        this.c = kotlin.a.a(new e(nVar));
        this.d = kotlin.a.a(new c(nVar));
    }

    public static b a(FirebaseMessaging firebaseMessaging) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            zzw d = firebaseMessaging.d();
            d.b(new com.yandex.passport.internal.ui.a(16, countDownLatch));
            if (countDownLatch.await(10L, g.a)) {
                return d.o() ? new b((String) d.k(), null, 2) : new b(null, d.j(), 1);
            }
            throw new TimeoutException("token retrieval timeout");
        } catch (Throwable th) {
            return new b(null, th, 1);
        }
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceController
    public final PushServiceExecutionRestrictions getExecutionRestrictions() {
        return new d(this);
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceController
    public final String getToken() {
        FirebaseMessaging firebaseMessaging = this.e;
        if (firebaseMessaging == null) {
            TrackersHub.getInstance().reportEvent("Attempt to get push token failed since firebaseMessaging is null");
            return null;
        }
        b a = a(firebaseMessaging);
        if (((Boolean) a.c.getValue()).booleanValue()) {
            return a.a;
        }
        PublicLogger publicLogger = PublicLogger.INSTANCE;
        publicLogger.error(a.b, "Failed to get token, will retry once", new Object[0]);
        b a2 = a(firebaseMessaging);
        if (((Boolean) a2.c.getValue()).booleanValue()) {
            return a2.a;
        }
        publicLogger.error(a2.b, "Failed to get token after retry", new Object[0]);
        TrackersHub.getInstance().reportError("Attempt to get push token failed", a2.b);
        return null;
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceController
    public final String getTransportId() {
        return CoreConstants.Transport.FIREBASE;
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceController
    public final boolean register() {
        try {
            if (com.google.android.gms.common.a.d.d(this.a, com.google.android.gms.common.b.a) == 0) {
                m mVar = (m) this.c.getValue();
                mVar.getClass();
                kcr kcrVar = new kcr();
                kcrVar.c(mVar.b);
                kcrVar.d(mVar.c);
                if (CoreUtils.isNotEmpty(mVar.a)) {
                    kcrVar.b(mVar.a);
                }
                if (CoreUtils.isNotEmpty(mVar.d)) {
                    kcrVar.e(mVar.d);
                }
                this.e = (FirebaseMessaging) a(kcrVar.a()).b(FirebaseMessaging.class);
                return true;
            }
        } catch (Throwable unused) {
        }
        PublicLogger.INSTANCE.warning("Google play services not available", new Object[0]);
        TrackersHub.getInstance().reportEvent("Google play services not available");
        return false;
    }

    @Override // io.appmetrica.analytics.push.provider.api.PushServiceController
    public final boolean shouldSendToken(String str) {
        return jl40.l(str, getToken());
    }

    public f(Context context) {
        this(context, new k(context));
    }

    public com.google.firebase.a a(lcr lcrVar) {
        try {
            com.google.firebase.a.h(lcrVar, this.a, "[DEFAULT]");
        } catch (Throwable unused) {
        }
        return com.google.firebase.a.d();
    }

    public static final void a(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
    }
}
