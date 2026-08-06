package io.appmetrica.analytics.billingv6.internal;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.c;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.l;
import io.appmetrica.analytics.billingv6.impl.n;
import io.appmetrica.analytics.billingv6.impl.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3683a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3684b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f3685c;

    /* renamed from: d, reason: collision with root package name */
    private final BillingInfoSender f3686d;

    /* renamed from: e, reason: collision with root package name */
    private final BillingInfoManager f3687e;

    /* renamed from: f, reason: collision with root package name */
    private final UpdatePolicy f3688f;

    /* renamed from: g, reason: collision with root package name */
    private BillingConfig f3689g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3690h;

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.f3683a = context;
        this.f3684b = executor;
        this.f3685c = executor2;
        this.f3686d = billingInfoSender;
        this.f3687e = billingInfoManager;
        this.f3688f = updatePolicy;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        if (i.a(this.f3689g, billingConfig)) {
            return;
        }
        this.f3689g = billingConfig;
        if (billingConfig != null && !this.f3690h) {
            this.f3690h = true;
            BillingClient build = BillingClient.newBuilder(this.f3683a).setListener(new l()).enablePendingPurchases().build();
            build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.f3689g;
            if (billingConfig != null && !this.f3690h) {
                this.f3690h = true;
                BillingClient build = BillingClient.newBuilder(this.f3683a).setListener(new l()).enablePendingPurchases().build();
                build.startConnection(new b(billingConfig, build, new BillingLibraryMonitor$updateBilling$1(this), new d(build), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv6.impl.n
    public synchronized void onUpdateFinished() {
        this.f3690h = false;
    }

    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i2, e eVar) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i2 & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i2 & 64) != 0 ? new o(null, 1, null) : updatePolicy);
    }
}
