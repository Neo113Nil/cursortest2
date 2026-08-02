package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.b6e;
import defpackage.g7w;
import defpackage.tn3;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Y implements Lb {
    public final Context a;
    public final ICommonExecutor b;
    public FutureTask i;
    public final L j;
    public boolean m;
    public final String c = "advertising identifiers collecting is forbidden by client configuration";
    public final String d = "advertising identifiers collecting is forbidden by startup";
    public final String e = "advertising identifiers collecting is forbidden by unknown reason";
    public final P f = new P(new C0178cj("google"));
    public final P g = new P(new C0178cj("huawei"));
    public final P h = new P(new C0178cj("yandex"));
    public volatile AdvertisingIdsHolder k = new AdvertisingIdsHolder();
    public I l = new I(4, 4, 4);

    public Y(@NotNull Context context, @NotNull ICommonExecutor iCommonExecutor, @NotNull C0385jp c0385jp) {
        this.a = context;
        this.b = iCommonExecutor;
        this.j = new L(c0385jp);
    }

    public static final Void a(boolean z, I i, Y y, InterfaceC0526ol interfaceC0526ol) {
        if (!z && Intrinsics.d(i, y.l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = y.k;
        AdTrackingInfoResult a = y.a(i.a, new V(y));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a.mErrorExplanation);
        }
        AdTrackingInfoResult a2 = y.a(i.b, new W(y));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = a2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a2.mErrorExplanation);
        }
        AdTrackingInfoResult a3 = y.a(i.c, new X(y, interfaceC0526ol));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = a3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a3.mErrorExplanation);
        }
        y.k = new AdvertisingIdsHolder(a, a2, a3);
        return null;
    }

    public static final Void e(Y y) {
        y.k = new AdvertisingIdsHolder(y.a(y.l.a, new V(y)), y.a(y.l.b, new W(y)), y.a(y.l.c, new X(y, new C0694ug())));
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Lb
    public final synchronized void b(boolean z) {
        this.m = true;
        this.j.b.update(z);
        a((InterfaceC0526ol) new C0694ug(), false);
    }

    @Override // io.appmetrica.analytics.impl.Lb
    public final synchronized void c(boolean z) {
        if (!this.m) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.impl.Lb
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            Intrinsics.j("refresh");
            throw null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.k;
    }

    @Override // io.appmetrica.analytics.impl.Lb
    public final synchronized void init() {
        if (this.i == null) {
            this.l = this.j.a();
            FutureTask futureTask = new FutureTask(new tn3(4, this));
            this.i = futureTask;
            this.b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    @NotNull
    public final synchronized AdvertisingIdsHolder getIdentifiers(@NotNull Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Lb, io.appmetrica.analytics.impl.InterfaceC0530op
    public final synchronized void a(@NotNull C0385jp c0385jp) {
        this.j.a(c0385jp);
        a((InterfaceC0526ol) new C0694ug(), false);
    }

    @Override // io.appmetrica.analytics.impl.Lb
    @NotNull
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C0694ug());
    }

    @Override // io.appmetrica.analytics.impl.Lb
    @NotNull
    public final synchronized AdvertisingIdsHolder a(@NotNull InterfaceC0526ol interfaceC0526ol) {
        try {
            a(interfaceC0526ol, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.k;
    }

    public final FutureTask a(InterfaceC0526ol interfaceC0526ol, boolean z) {
        FutureTask futureTask = new FutureTask(new g7w(z, this.j.a(), this, interfaceC0526ol));
        this.i = futureTask;
        this.b.execute(futureTask);
        FutureTask futureTask2 = this.i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        Intrinsics.j("refresh");
        throw null;
    }

    public final AdTrackingInfoResult a(int i, Function0 function0) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return (AdTrackingInfoResult) function0.invoke();
        }
        if (i2 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.c);
        }
        if (i2 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.d);
        }
        if (i2 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.e);
        }
        b6e.s();
        return null;
    }
}
