package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266a2 implements AppSetIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5538a;

    /* renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f5539b;

    /* renamed from: c, reason: collision with root package name */
    public volatile AppSetId f5540c;

    /* renamed from: d, reason: collision with root package name */
    public CountDownLatch f5541d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5542e;

    /* renamed from: f, reason: collision with root package name */
    public final Z1 f5543f;

    public C0266a2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f5538a = context;
        this.f5539b = iAppSetIdRetriever;
        this.f5541d = new CountDownLatch(1);
        this.f5542e = 20L;
        this.f5543f = new Z1(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f5540c == null) {
            try {
                this.f5541d = new CountDownLatch(1);
                this.f5539b.retrieveAppSetId(this.f5538a, this.f5543f);
                this.f5541d.await(this.f5542e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f5540c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f5540c = appSetId;
        }
        return appSetId;
    }

    public C0266a2(Context context) {
        this(context, AbstractC0292b2.a());
    }
}
