package io.appmetrica.analytics.impl;

import android.content.Context;
import com.adjust.sdk.Constants;
import defpackage.g041;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.sls;
import defpackage.w511;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0175a0 implements InterfaceC0187ac {
    public final Context a;
    public final ICommonExecutor b;
    public FutureTask i;
    public final Q l;
    public N n;
    public boolean o;
    public final String c = "advertising identifiers collecting is forbidden by client configuration";
    public final String d = "advertising identifiers collecting is forbidden by startup";
    public final String e = "advertising identifiers collecting is forbidden by unknown reason";
    public final M f = new M(new C0396hj(Constants.REFERRER_API_GOOGLE));
    public final M g = new M(new C0396hj("huawei"));
    public final M h = new M(new C0396hj("yandex"));
    public final i3y j = kotlin.a.a(new W(this));
    public final long k = 90;
    public volatile AdvertisingIdsHolder m = new AdvertisingIdsHolder();

    public C0175a0(Context context, ICommonExecutor iCommonExecutor, Bp bp) {
        this.a = context;
        this.b = iCommonExecutor;
        this.l = new Q(bp);
        O o = O.UNKNOWN;
        this.n = new N(o, o, o);
    }

    public static final Void f(C0175a0 c0175a0) {
        c0175a0.m = new AdvertisingIdsHolder(c0175a0.a(c0175a0.n.a, new X(c0175a0)), c0175a0.a(c0175a0.n.b, new Y(c0175a0)), c0175a0.a(c0175a0.n.c, new Z(c0175a0, new Kg())));
        c0175a0.b.executeDelayed((FutureTask) c0175a0.j.getValue(), c0175a0.k, TimeUnit.SECONDS);
        return null;
    }

    public static final Void g(C0175a0 c0175a0) {
        c0175a0.b();
        return null;
    }

    public final AdTrackingInfoResult a(O o, sls slsVar) {
        int ordinal = o.ordinal();
        if (ordinal == 0) {
            return (AdTrackingInfoResult) slsVar.invoke();
        }
        if (ordinal == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.c);
        }
        if (ordinal == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.d);
        }
        if (ordinal == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.e);
        }
        w511.b();
        return null;
    }

    public final void b() {
        AdTrackingInfoResult a = a(this.n.a, new X(this));
        AdTrackingInfoResult google = this.m.getGoogle();
        IdentifierStatus identifierStatus = a.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            a = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, a.mErrorExplanation);
        }
        AdTrackingInfoResult a2 = a(this.n.b, new Y(this));
        AdTrackingInfoResult huawei = this.m.getHuawei();
        IdentifierStatus identifierStatus3 = a2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            a2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, a2.mErrorExplanation);
        }
        AdTrackingInfoResult a3 = a(this.n.c, new Z(this, new C0404hr(3, 500)));
        AdTrackingInfoResult yandex = this.m.getYandex();
        IdentifierStatus identifierStatus4 = a3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            a3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, a3.mErrorExplanation);
        }
        this.m = new AdvertisingIdsHolder(a, a2, a3);
        this.b.executeDelayed((FutureTask) this.j.getValue(), this.k, TimeUnit.SECONDS);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0187ac
    public final synchronized void c(boolean z) {
        if (!this.o) {
            b(z);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsProvider
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.m;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0187ac
    public final synchronized void init() {
        if (this.i == null) {
            this.n = this.l.a();
            FutureTask futureTask = new FutureTask(new g041(this, 2));
            this.i = futureTask;
            this.b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0187ac, io.appmetrica.analytics.impl.Gp
    public final synchronized void a(Bp bp) {
        this.l.a(bp);
        a();
    }

    public final void a() {
        N a = this.l.a();
        if (!jl40.l(a, this.n)) {
            this.b.remove((FutureTask) this.j.getValue());
            this.n = a;
            this.i = new FutureTask(new g041(this, 1));
        }
        ICommonExecutor iCommonExecutor = this.b;
        FutureTask futureTask = this.i;
        if (futureTask == null) {
            futureTask = null;
        }
        iCommonExecutor.execute(futureTask);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0187ac
    public final synchronized void b(boolean z) {
        this.o = true;
        this.l.b.update(z);
        a();
    }
}
