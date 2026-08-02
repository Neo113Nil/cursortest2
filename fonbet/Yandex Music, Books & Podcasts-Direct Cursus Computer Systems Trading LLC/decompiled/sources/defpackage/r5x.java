package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.yandex.plus.pay.inapp.google.internal.a;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class r5x extends qz2 {
    public final Context A;
    public volatile int B;
    public volatile m2x C;
    public volatile fmp D;
    public volatile q9x E;

    public r5x(gos gosVar, Context context) {
        super(gosVar, context);
        this.B = 0;
        this.A = context;
    }

    public final /* synthetic */ void B(fd fdVar, a aVar) {
        super.a(fdVar, aVar);
    }

    public final /* synthetic */ void C(psd psdVar, a aVar) {
        super.b(psdVar, aVar);
    }

    public final /* synthetic */ void D(z6n z6nVar, qtm qtmVar) {
        super.f(z6nVar, qtmVar);
    }

    public final synchronized boolean E() {
        if (this.B == 2 && this.C != null) {
            if (this.D != null) {
                return true;
            }
        }
        return false;
    }

    public final a9x F(int i) {
        if (!E()) {
            l8x.g("BillingClientTesting", "Billing Override Service is not ready.");
            G(106, 28, b6x.a(-1, "Billing Override Service connection is disconnected."));
            return new y8x();
        }
        j4x j4xVar = new j4x(this, i, 0);
        nkx nkxVar = new nkx();
        nkxVar.c = new unx();
        omx omxVar = new omx(nkxVar);
        nkxVar.b = omxVar;
        nkxVar.a = j4x.class;
        try {
            j4xVar.G(nkxVar);
            nkxVar.a = "billingOverrideService.getBillingOverride";
            return omxVar;
        } catch (Exception e) {
            odx odxVar = new odx(e);
            uwf uwfVar = tjx.f;
            bmx bmxVar = omxVar.b;
            if (uwfVar.R(bmxVar, null, odxVar)) {
                tjx.d(bmxVar);
            }
            return omxVar;
        }
    }

    public final void G(int i, int i2, uz2 uz2Var) {
        bfx b = v5x.b(i, i2, uz2Var);
        Objects.requireNonNull(b, "ApiFailure should not be null");
        this.g.V(b);
    }

    public final void H(int i, Consumer consumer, Runnable runnable) {
        q9x q9xVar;
        c9x c9xVar;
        c9x q9xVar2;
        a9x F = F(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (this.E == null) {
                    ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    this.E = newSingleThreadScheduledExecutor instanceof q9x ? (q9x) newSingleThreadScheduledExecutor : new q9x(newSingleThreadScheduledExecutor);
                }
                q9xVar = this.E;
            } finally {
            }
        }
        if (!F.isDone()) {
            t9x t9xVar = new t9x();
            t9xVar.h = F;
            yyo yyoVar = new yyo();
            yyoVar.b = t9xVar;
            t9xVar.i = q9xVar.schedule(yyoVar, 28500L, timeUnit);
            F.b(yyoVar, v8x.a);
            F = t9xVar;
        }
        anx anxVar = new anx();
        anxVar.a = i;
        anxVar.b = consumer;
        anxVar.c = runnable;
        anxVar.d = this;
        synchronized (this) {
            try {
                if (this.y == null) {
                    ExecutorService m = m();
                    if (m instanceof c9x) {
                        q9xVar2 = (c9x) m;
                    } else {
                        q9xVar2 = m instanceof ScheduledExecutorService ? new q9x((ScheduledExecutorService) m) : new c9x(m);
                    }
                    this.y = q9xVar2;
                }
                c9xVar = this.y;
            } finally {
            }
        }
        F.b(new x8x(0, F, anxVar), c9xVar);
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final void a(fd fdVar, a aVar) {
        H(3, new d4x(1, aVar), new nud(this, fdVar, aVar, false, 25));
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final void b(final psd psdVar, final a aVar) {
        H(4, new Consumer() { // from class: g4x
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                String str = psdVar.b;
                aVar.c((uz2) obj, str);
            }
        }, new nud(this, psdVar, aVar, false, 24));
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final void c() {
        synchronized (this) {
            kfx d = v5x.d(27);
            Objects.requireNonNull(d, "ApiSuccess should not be null");
            this.g.X(d);
            try {
                try {
                    if (this.D != null && this.C != null) {
                        l8x.f("BillingClientTesting", "Unbinding from Billing Override Service.");
                        this.A.unbindService(this.D);
                        this.D = new fmp(1, this);
                    }
                    this.C = null;
                    if (this.E != null) {
                        this.E.shutdownNow();
                        this.E = null;
                    }
                } catch (RuntimeException e) {
                    l8x.h("BillingClientTesting", "There was an exception while ending Billing Override Service connection!", e);
                }
                this.B = 3;
            } catch (Throwable th) {
                this.B = 3;
                throw th;
            }
        }
        super.c();
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final uz2 e(Activity activity, z0j z0jVar) {
        int i = 0;
        try {
            i = ((Integer) F(2).get(28500L, TimeUnit.MILLISECONDS)).intValue();
        } catch (TimeoutException e) {
            G(114, 28, b6x.u);
            l8x.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", e);
        } catch (Exception e2) {
            if (e2 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            G(107, 28, b6x.u);
            l8x.h("BillingClientTesting", "An error occurred while retrieving billing override.", e2);
        }
        if (i > 0) {
            uz2 a = b6x.a(i, "Billing override value was set by a license tester.");
            G(105, 2, a);
            A(a);
            return a;
        }
        try {
            return super.e(activity, z0jVar);
        } catch (Exception e3) {
            uz2 uz2Var = b6x.i;
            G(115, 2, uz2Var);
            l8x.h("BillingClientTesting", "An internal error occurred.", e3);
            return uz2Var;
        }
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final void f(z6n z6nVar, qtm qtmVar) {
        H(7, new d4x(0, qtmVar), new nud(this, z6nVar, qtmVar, false, 23));
    }

    @Override // defpackage.qz2, defpackage.pz2
    public final void h(rz2 rz2Var) {
        synchronized (this) {
            if (E()) {
                l8x.f("BillingClientTesting", "Billing Override Service connection is valid. No need to re-initialize.");
                kfx d = v5x.d(26);
                Objects.requireNonNull(d, "ApiSuccess should not be null");
                this.g.X(d);
            } else {
                int i = 1;
                if (this.B == 1) {
                    l8x.g("BillingClientTesting", "Client is already in the process of connecting to Billing Override Service.");
                } else if (this.B == 3) {
                    l8x.g("BillingClientTesting", "Billing Override Service Client was already closed and can't be reused. Please create another instance.");
                    G(38, 26, b6x.a(-1, "Billing Override Service connection is disconnected."));
                } else {
                    this.B = 1;
                    l8x.f("BillingClientTesting", "Starting Billing Override Service setup.");
                    this.D = new fmp(1, this);
                    Intent intent = new Intent("com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND");
                    intent.setPackage("com.google.android.apps.play.billingtestcompanion");
                    List<ResolveInfo> queryIntentServices = this.A.getPackageManager().queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        i = 41;
                    } else {
                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                        if (serviceInfo != null) {
                            String str = serviceInfo.packageName;
                            String str2 = serviceInfo.name;
                            if (!Objects.equals(str, "com.google.android.apps.play.billingtestcompanion") || str2 == null) {
                                l8x.g("BillingClientTesting", "The device doesn't have valid Play Billing Lab.");
                            } else {
                                ComponentName componentName = new ComponentName(str, str2);
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(componentName);
                                if (this.A.bindService(intent2, this.D, 1)) {
                                    l8x.f("BillingClientTesting", "Billing Override Service was bonded successfully.");
                                } else {
                                    l8x.g("BillingClientTesting", "Connection to Billing Override Service is blocked.");
                                }
                            }
                            i = 39;
                        }
                    }
                    this.B = 0;
                    l8x.f("BillingClientTesting", "Billing Override Service unavailable on device.");
                    G(i, 26, b6x.a(2, "Billing Override Service unavailable on device."));
                }
            }
        }
        super.h(rz2Var);
    }

    public r5x(gos gosVar, Context context, n4n n4nVar) {
        super(gosVar, context, n4nVar);
        this.B = 0;
        this.A = context;
    }
}
