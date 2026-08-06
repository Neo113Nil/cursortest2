package io.appmetrica.analytics.impl;

import A1.C0015p;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class U implements Aa {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5131a;

    /* renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f5132b;

    /* renamed from: i, reason: collision with root package name */
    public FutureTask f5139i;

    /* renamed from: j, reason: collision with root package name */
    public final J f5140j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5143m;

    /* renamed from: c, reason: collision with root package name */
    public final String f5133c = "advertising identifiers collecting is forbidden by client configuration";

    /* renamed from: d, reason: collision with root package name */
    public final String f5134d = "advertising identifiers collecting is forbidden by startup";

    /* renamed from: e, reason: collision with root package name */
    public final String f5135e = "advertising identifiers collecting is forbidden by unknown reason";

    /* renamed from: f, reason: collision with root package name */
    public final N f5136f = new N(new C0927zg("google"));

    /* renamed from: g, reason: collision with root package name */
    public final N f5137g = new N(new C0927zg("huawei"));

    /* renamed from: h, reason: collision with root package name */
    public final N f5138h = new N(new C0927zg("yandex"));

    /* renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f5141k = new AdvertisingIdsHolder();

    /* renamed from: l, reason: collision with root package name */
    public G f5142l = new G(4, 4, 4);

    public U(Context context, ICommonExecutor iCommonExecutor, C0415fm c0415fm) {
        this.f5131a = context;
        this.f5132b = iCommonExecutor;
        this.f5140j = new J(c0415fm);
    }

    public static final Void e(U u2) {
        u2.f5141k = new AdvertisingIdsHolder(u2.a(u2.f5142l.f4400a, new Q(u2)), u2.a(u2.f5142l.f4401b, new S(u2)), u2.a(u2.f5142l.f4402c, new T(u2, new Xd())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void init() {
        if (this.f5139i == null) {
            this.f5142l = this.f5140j.a();
            FutureTask futureTask = new FutureTask(new Ro(0, this));
            this.f5139i = futureTask;
            this.f5132b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa, io.appmetrica.analytics.impl.InterfaceC0544km
    public final synchronized void a(C0415fm c0415fm) {
        this.f5140j.a(c0415fm);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void b(boolean z2) {
        this.f5143m = true;
        this.f5140j.f4558b.update(z2);
        a((Gi) new Xd(), false);
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized void c(boolean z2) {
        if (!this.f5143m) {
            b(z2);
        }
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f5139i;
        if (futureTask == null) {
            kotlin.jvm.internal.i.i("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f5141k;
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder a() {
        return a(new Xd());
    }

    @Override // io.appmetrica.analytics.impl.Aa
    public final synchronized AdvertisingIdsHolder a(Gi gi) {
        try {
            a(gi, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f5141k;
    }

    public final FutureTask a(final Gi gi, final boolean z2) {
        final G a2 = this.f5140j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.So
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return U.a(z2, a2, this, gi);
            }
        });
        this.f5139i = futureTask;
        this.f5132b.execute(futureTask);
        FutureTask futureTask2 = this.f5139i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.i.i("refresh");
        throw null;
    }

    public static final Void a(boolean z2, G g2, U u2, Gi gi) {
        if (!z2 && kotlin.jvm.internal.i.a(g2, u2.f5142l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = u2.f5141k;
        AdTrackingInfoResult a2 = u2.a(g2.f4400a, new Q(u2));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a2.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a2 = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a2.mErrorExplanation);
        }
        AdTrackingInfoResult a3 = u2.a(g2.f4401b, new S(u2));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a3.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a3 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a3.mErrorExplanation);
        }
        AdTrackingInfoResult a4 = u2.a(g2.f4402c, new T(u2, gi));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a4.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a4 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a4.mErrorExplanation);
        }
        u2.f5141k = new AdvertisingIdsHolder(a2, a3, a4);
        return null;
    }

    public final AdTrackingInfoResult a(int i2, InterfaceC1046a interfaceC1046a) {
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (AdTrackingInfoResult) interfaceC1046a.invoke();
        }
        if (i3 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f5133c);
        }
        if (i3 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f5134d);
        }
        if (i3 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f5135e);
        }
        throw new C0015p();
    }
}
