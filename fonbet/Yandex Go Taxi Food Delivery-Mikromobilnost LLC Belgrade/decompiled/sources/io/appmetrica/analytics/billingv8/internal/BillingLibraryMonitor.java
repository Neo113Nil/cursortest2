package io.appmetrica.analytics.billingv8.internal;

import android.content.Context;
import com.android.billingclient.api.a;
import defpackage.h32;
import defpackage.jl40;
import defpackage.vms;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lio/appmetrica/analytics/billingv8/internal/BillingLibraryMonitor;", "Lio/appmetrica/analytics/billinginterface/internal/monitor/BillingMonitor;", "Lio/appmetrica/analytics/billingv8/impl/n;", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "workerExecutor", "uiExecutor", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;", "billingInfoStorage", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;", "billingInfoSender", "Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;", "billingInfoManager", "Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;", "updatePolicy", "<init>", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoStorage;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoSender;Lio/appmetrica/analytics/billinginterface/internal/storage/BillingInfoManager;Lio/appmetrica/analytics/billinginterface/internal/update/UpdatePolicy;)V", "Lzy11;", "onSessionResumed", "()V", "Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;", "billingConfig", "onBillingConfigChanged", "(Lio/appmetrica/analytics/billinginterface/internal/config/BillingConfig;)V", "onUpdateFinished", "billing-v8_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BillingLibraryMonitor implements BillingMonitor, n {
    private final Context a;
    private final Executor b;
    private final Executor c;
    private final BillingInfoSender d;
    private final BillingInfoManager e;
    private final UpdatePolicy f;
    private BillingConfig g;
    private boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, executor, executor2, billingInfoStorage, billingInfoSender, (i & 32) != 0 ? new c(billingInfoStorage) : billingInfoManager, (i & 64) != 0 ? new o(null, 1, 0 == true ? 1 : 0) : updatePolicy);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.config.BillingConfigChangedListener
    public synchronized void onBillingConfigChanged(BillingConfig billingConfig) {
        BillingLibraryMonitor billingLibraryMonitor;
        if (!jl40.l(this.g, billingConfig)) {
            this.g = billingConfig;
            if (billingConfig != null && !this.h) {
                this.h = true;
                h32 h32Var = new h32(this.a);
                h32Var.c = new l();
                h32Var.a = new vms(6);
                a a = h32Var.a();
                billingLibraryMonitor = this;
                try {
                    a.j(new b(billingConfig, a, new BillingLibraryMonitor$updateBilling$1(this), new d(a), billingLibraryMonitor));
                } catch (Throwable unused) {
                }
            }
            billingLibraryMonitor = this;
        }
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor
    public void onSessionResumed() {
        try {
            BillingConfig billingConfig = this.g;
            if (billingConfig != null && !this.h) {
                this.h = true;
                h32 h32Var = new h32(this.a);
                h32Var.c = new l();
                h32Var.a = new vms(6);
                a a = h32Var.a();
                a.j(new b(billingConfig, a, new BillingLibraryMonitor$updateBilling$1(this), new d(a), this));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.billingv8.impl.n
    public synchronized void onUpdateFinished() {
        this.h = false;
    }

    public BillingLibraryMonitor(Context context, Executor executor, Executor executor2, BillingInfoStorage billingInfoStorage, BillingInfoSender billingInfoSender, BillingInfoManager billingInfoManager, UpdatePolicy updatePolicy) {
        this.a = context;
        this.b = executor;
        this.c = executor2;
        this.d = billingInfoSender;
        this.e = billingInfoManager;
        this.f = updatePolicy;
    }
}
