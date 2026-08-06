package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.PendingPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.c;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.l;
import io.appmetrica.analytics.billingv8.impl.n;
import io.appmetrica.analytics.billingv8.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3736a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3737b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3738c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f3739d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f3740e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f3741f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f3742g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3743h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f3736a = context;
        this.f3737b = executor;
        this.f3738c = executor2;
        this.f3739d = billingInfoSender;
        this.f3740e = billingInfoManager;
        this.f3741f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f3742g, billingConfig)) {
            return;
        }
        this.f3742g = billingConfig;
        if (billingConfig != null && !this.f3743h) {
            this.f3743h = true;
            BillingClient build = BillingClient.newBuilder(this.f3736a).setListener(new l()).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
            build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f3742g;
            if (billingConfig != null && !this.f3743h) {
                this.f3743h = true;
                BillingClient build = BillingClient.newBuilder(this.f3736a).setListener(new l()).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).build();
                build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.f3743h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i2, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
