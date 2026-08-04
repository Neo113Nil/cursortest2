package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.gamericefishpro.space.a8.c;
import com.gamericefishpro.space.c9.b;
import com.gamericefishpro.space.d4.r0;
import com.gamericefishpro.space.i9.i0;
import com.gamericefishpro.space.i9.l0;
import com.gamericefishpro.space.i9.n0;
import com.gamericefishpro.space.i9.o0;
import com.gamericefishpro.space.i9.q0;
import com.gamericefishpro.space.i9.s0;
import com.gamericefishpro.space.i9.t0;
import com.gamericefishpro.space.n9.b3;
import com.gamericefishpro.space.n9.d4;
import com.gamericefishpro.space.n9.e3;
import com.gamericefishpro.space.n9.f4;
import com.gamericefishpro.space.n9.j2;
import com.gamericefishpro.space.n9.k2;
import com.gamericefishpro.space.n9.l2;
import com.gamericefishpro.space.n9.m0;
import com.gamericefishpro.space.n9.n2;
import com.gamericefishpro.space.n9.o2;
import com.gamericefishpro.space.n9.p1;
import com.gamericefishpro.space.n9.q1;
import com.gamericefishpro.space.n9.q2;
import com.gamericefishpro.space.n9.r1;
import com.gamericefishpro.space.n9.r4;
import com.gamericefishpro.space.n9.s4;
import com.gamericefishpro.space.n9.t;
import com.gamericefishpro.space.n9.t2;
import com.gamericefishpro.space.n9.u;
import com.gamericefishpro.space.n9.v0;
import com.gamericefishpro.space.n9.x;
import com.gamericefishpro.space.n9.x2;
import com.gamericefishpro.space.n9.y0;
import com.gamericefishpro.space.n9.z2;
import com.gamericefishpro.space.t.e;
import com.gamericefishpro.space.v8.c0;
import com.gamericefishpro.space.va.a;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends i0 {
    public r1 d;
    public final e e;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.d = null;
        this.e = new e(0);
    }

    public final void F() {
        if (this.d == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public final void G(String str, l0 l0Var) {
        F();
        r4 r4Var = this.d.B;
        r1.j(r4Var);
        r4Var.Z(str, l0Var);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void beginAdUnitExposure(String str, long j) {
        F();
        x xVar = this.d.G;
        r1.i(xVar);
        xVar.s(str, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.F(str, str2, bundle);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void clearMeasurementEnabled(long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.s();
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new a(13, t2Var, null, false));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void endAdUnitExposure(String str, long j) {
        F();
        x xVar = this.d.G;
        r1.i(xVar);
        xVar.t(str, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void generateEventId(l0 l0Var) {
        F();
        r4 r4Var = this.d.B;
        r1.j(r4Var);
        long jN0 = r4Var.n0();
        F();
        r4 r4Var2 = this.d.B;
        r1.j(r4Var2);
        r4Var2.a0(l0Var, jN0);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getAppInstanceId(l0 l0Var) {
        F();
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        p1Var.A(new q1(this, l0Var, 0));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getCachedAppInstanceId(l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        G((String) t2Var.z.get(), l0Var);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getConditionalUserProperties(String str, String str2, l0 l0Var) {
        F();
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        p1Var.A(new r0(this, l0Var, str, str2, 6, false));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getCurrentScreenClass(l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        e3 e3Var = ((r1) t2Var.d).E;
        r1.k(e3Var);
        b3 b3Var = e3Var.i;
        G(b3Var != null ? b3Var.b : null, l0Var);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getCurrentScreenName(l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        e3 e3Var = ((r1) t2Var.d).E;
        r1.k(e3Var);
        b3 b3Var = e3Var.i;
        G(b3Var != null ? b3Var.a : null, l0Var);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getGmpAppId(l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        G(t2Var.G(), l0Var);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getMaxUserProperties(String str, l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        c0.d(str);
        ((r1) t2Var.d).getClass();
        F();
        r4 r4Var = this.d.B;
        r1.j(r4Var);
        r4Var.b0(l0Var, 25);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getSessionId(l0 l0Var) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new a(t2Var, l0Var));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getTestFlag(l0 l0Var, int i) {
        F();
        if (i == 0) {
            r4 r4Var = this.d.B;
            r1.j(r4Var);
            t2 t2Var = this.d.F;
            r1.k(t2Var);
            AtomicReference atomicReference = new AtomicReference();
            p1 p1Var = ((r1) t2Var.d).z;
            r1.l(p1Var);
            r4Var.Z((String) p1Var.B(atomicReference, 15000L, "String test flag value", new n2(t2Var, atomicReference, 1)), l0Var);
            return;
        }
        if (i == 1) {
            r4 r4Var2 = this.d.B;
            r1.j(r4Var2);
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            AtomicReference atomicReference2 = new AtomicReference();
            p1 p1Var2 = ((r1) t2Var2.d).z;
            r1.l(p1Var2);
            r4Var2.a0(l0Var, ((Long) p1Var2.B(atomicReference2, 15000L, "long test flag value", new n2(t2Var2, atomicReference2, 2))).longValue());
            return;
        }
        if (i == 2) {
            r4 r4Var3 = this.d.B;
            r1.j(r4Var3);
            t2 t2Var3 = this.d.F;
            r1.k(t2Var3);
            AtomicReference atomicReference3 = new AtomicReference();
            p1 p1Var3 = ((r1) t2Var3.d).z;
            r1.l(p1Var3);
            double dDoubleValue = ((Double) p1Var3.B(atomicReference3, 15000L, "double test flag value", new n2(t2Var3, atomicReference3, 4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                l0Var.h(bundle);
                return;
            } catch (RemoteException e) {
                v0 v0Var = ((r1) r4Var3.d).y;
                r1.l(v0Var);
                v0Var.B.b(e, "Error returning double value to wrapper");
                return;
            }
        }
        if (i == 3) {
            r4 r4Var4 = this.d.B;
            r1.j(r4Var4);
            t2 t2Var4 = this.d.F;
            r1.k(t2Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            p1 p1Var4 = ((r1) t2Var4.d).z;
            r1.l(p1Var4);
            r4Var4.b0(l0Var, ((Integer) p1Var4.B(atomicReference4, 15000L, "int test flag value", new n2(t2Var4, atomicReference4, 3))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        r4 r4Var5 = this.d.B;
        r1.j(r4Var5);
        t2 t2Var5 = this.d.F;
        r1.k(t2Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        p1 p1Var5 = ((r1) t2Var5.d).z;
        r1.l(p1Var5);
        r4Var5.d0(l0Var, ((Boolean) p1Var5.B(atomicReference5, 15000L, "boolean test flag value", new n2(t2Var5, atomicReference5, 0))).booleanValue());
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void getUserProperties(String str, String str2, boolean z, l0 l0Var) {
        F();
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        p1Var.A(new k2(this, l0Var, str, str2, z));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void initForTests(Map map) {
        F();
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void initialize(com.gamericefishpro.space.c9.a aVar, t0 t0Var, long j) {
        r1 r1Var = this.d;
        if (r1Var == null) {
            Context context = (Context) b.G(aVar);
            c0.g(context);
            this.d = r1.r(context, t0Var, Long.valueOf(j));
        } else {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.B.a("Attempting to initialize multiple times");
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void isDataCollectionEnabled(l0 l0Var) {
        F();
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        p1Var.A(new q1(this, l0Var, 1));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.w(str, str2, bundle, z, z2, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void logEventAndBundle(String str, String str2, Bundle bundle, l0 l0Var, long j) {
        F();
        c0.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        u uVar = new u(str2, new t(bundle), "app", j);
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        p1Var.A(new r0(this, l0Var, uVar, str, 3, false));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void logHealthData(int i, String str, com.gamericefishpro.space.c9.a aVar, com.gamericefishpro.space.c9.a aVar2, com.gamericefishpro.space.c9.a aVar3) {
        F();
        Object objG = aVar == null ? null : b.G(aVar);
        Object objG2 = aVar2 == null ? null : b.G(aVar2);
        Object objG3 = aVar3 != null ? b.G(aVar3) : null;
        v0 v0Var = this.d.y;
        r1.l(v0Var);
        v0Var.A(i, true, false, str, objG, objG2, objG3);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityCreated(com.gamericefishpro.space.c9.a aVar, Bundle bundle, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityCreatedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), bundle, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityCreatedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, Bundle bundle, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        q2 q2Var = t2Var.i;
        if (q2Var != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
            q2Var.i(v0Var, bundle);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityDestroyed(com.gamericefishpro.space.c9.a aVar, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityDestroyedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityDestroyedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        q2 q2Var = t2Var.i;
        if (q2Var != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
            q2Var.j(v0Var);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityPaused(com.gamericefishpro.space.c9.a aVar, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityPausedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityPausedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        q2 q2Var = t2Var.i;
        if (q2Var != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
            q2Var.k(v0Var);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityResumed(com.gamericefishpro.space.c9.a aVar, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityResumedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityResumedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        q2 q2Var = t2Var.i;
        if (q2Var != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
            q2Var.l(v0Var);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivitySaveInstanceState(com.gamericefishpro.space.c9.a aVar, l0 l0Var, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivitySaveInstanceStateByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), l0Var, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivitySaveInstanceStateByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, l0 l0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        q2 q2Var = t2Var.i;
        Bundle bundle = new Bundle();
        if (q2Var != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
            q2Var.m(v0Var, bundle);
        }
        try {
            l0Var.h(bundle);
        } catch (RemoteException e) {
            v0 v0Var2 = this.d.y;
            r1.l(v0Var2);
            v0Var2.B.b(e, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityStarted(com.gamericefishpro.space.c9.a aVar, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityStartedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityStartedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        if (t2Var.i != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityStopped(com.gamericefishpro.space.c9.a aVar, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        onActivityStoppedByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void onActivityStoppedByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        if (t2Var.i != null) {
            t2 t2Var2 = this.d.F;
            r1.k(t2Var2);
            t2Var2.K();
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void performAction(Bundle bundle, l0 l0Var, long j) {
        F();
        l0Var.h(null);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void registerOnMeasurementEventListener(q0 q0Var) {
        s4 s4Var;
        F();
        e eVar = this.e;
        synchronized (eVar) {
            try {
                o0 o0Var = (o0) q0Var;
                Parcel parcelG = o0Var.G(o0Var.H(), 2);
                int i = parcelG.readInt();
                parcelG.recycle();
                s4Var = (s4) eVar.get(Integer.valueOf(i));
                if (s4Var == null) {
                    s4Var = new s4(this, o0Var);
                    Parcel parcelG2 = o0Var.G(o0Var.H(), 2);
                    int i2 = parcelG2.readInt();
                    parcelG2.recycle();
                    eVar.put(Integer.valueOf(i2), s4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.s();
        if (t2Var.w.add(s4Var)) {
            return;
        }
        v0 v0Var = ((r1) t2Var.d).y;
        r1.l(v0Var);
        v0Var.B.a("OnEventListener already registered");
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void resetAnalyticsData(long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.z.set(null);
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new l2(t2Var, j, 1));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void retrieveAndUploadBatches(n0 n0Var) {
        z2 z2Var;
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.s();
        r1 r1Var = (r1) t2Var.d;
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        if (p1Var.x()) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        p1 p1Var2 = r1Var.z;
        r1.l(p1Var2);
        if (Thread.currentThread() == p1Var2.v) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.y.a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        if (com.gamericefishpro.space.lb.e.g()) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.y.a("Cannot retrieve and upload batches from main thread");
            return;
        }
        v0 v0Var4 = r1Var.y;
        r1.l(v0Var4);
        v0Var4.G.a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int size = 0;
        int i = 0;
        while (!z) {
            v0 v0Var5 = r1Var.y;
            r1.l(v0Var5);
            v0Var5.G.a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            p1 p1Var3 = r1Var.z;
            r1.l(p1Var3);
            p1Var3.B(atomicReference, 10000L, "[sgtm] Getting upload batches", new n2(t2Var, atomicReference, 6, false));
            f4 f4Var = (f4) atomicReference.get();
            if (f4Var == null) {
                break;
            }
            List list = f4Var.d;
            if (list.isEmpty()) {
                break;
            }
            v0 v0Var6 = r1Var.y;
            r1.l(v0Var6);
            v0Var6.G.b(Integer.valueOf(list.size()), "[sgtm] Retrieved upload batches. count");
            size += list.size();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                d4 d4Var = (d4) it.next();
                try {
                    URL url = new URI(d4Var.i).toURL();
                    AtomicReference atomicReference2 = new AtomicReference();
                    m0 m0VarQ = ((r1) t2Var.d).q();
                    m0VarQ.s();
                    c0.g(m0VarQ.z);
                    String str = m0VarQ.z;
                    r1 r1Var2 = (r1) t2Var.d;
                    v0 v0Var7 = r1Var2.y;
                    r1.l(v0Var7);
                    com.gamericefishpro.space.n9.t0 t0Var = v0Var7.G;
                    Long lValueOf = Long.valueOf(d4Var.d);
                    t0Var.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, d4Var.i, Integer.valueOf(d4Var.e.length));
                    if (!TextUtils.isEmpty(d4Var.z)) {
                        v0 v0Var8 = r1Var2.y;
                        r1.l(v0Var8);
                        v0Var8.G.c("[sgtm] Uploading data from app. row_id", lValueOf, d4Var.z);
                    }
                    HashMap map = new HashMap();
                    Bundle bundle = d4Var.v;
                    for (String str2 : bundle.keySet()) {
                        String string = bundle.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            map.put(str2, string);
                        }
                    }
                    x2 x2Var = r1Var2.H;
                    r1.l(x2Var);
                    byte[] bArr = d4Var.e;
                    c cVar = new c(t2Var, atomicReference2, d4Var, 22);
                    x2Var.t();
                    c0.g(url);
                    c0.g(bArr);
                    p1 p1Var4 = ((r1) x2Var.d).z;
                    r1.l(p1Var4);
                    p1Var4.D(new y0(x2Var, str, url, bArr, map, cVar));
                    try {
                        r4 r4Var = r1Var2.B;
                        r1.j(r4Var);
                        r1 r1Var3 = (r1) r4Var.d;
                        r1Var3.D.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                        synchronized (atomicReference2) {
                            for (long jCurrentTimeMillis2 = 60000; atomicReference2.get() == null && jCurrentTimeMillis2 > 0; jCurrentTimeMillis2 = jCurrentTimeMillis - System.currentTimeMillis()) {
                                try {
                                    atomicReference2.wait(jCurrentTimeMillis2);
                                    r1Var3.D.getClass();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    } catch (InterruptedException unused) {
                        v0 v0Var9 = ((r1) t2Var.d).y;
                        r1.l(v0Var9);
                        v0Var9.B.a("[sgtm] Interrupted waiting for uploading batch");
                    }
                    z2Var = atomicReference2.get() == null ? z2.UNKNOWN : (z2) atomicReference2.get();
                } catch (MalformedURLException | URISyntaxException e) {
                    v0 v0Var10 = ((r1) t2Var.d).y;
                    r1.l(v0Var10);
                    v0Var10.y.d("[sgtm] Bad upload url for row_id", d4Var.i, Long.valueOf(d4Var.d), e);
                    z2Var = z2.FAILURE;
                }
                if (z2Var != z2.SUCCESS) {
                    if (z2Var == z2.BACKOFF) {
                        z = true;
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        v0 v0Var11 = r1Var.y;
        r1.l(v0Var11);
        v0Var11.G.c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i));
        try {
            n0Var.b();
        } catch (RemoteException e2) {
            r1 r1Var4 = this.d;
            c0.g(r1Var4);
            v0 v0Var12 = r1Var4.y;
            r1.l(v0Var12);
            v0Var12.B.b(e2, "Failed to call IDynamiteUploadBatchesCallback");
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setConditionalUserProperty(Bundle bundle, long j) {
        F();
        if (bundle == null) {
            v0 v0Var = this.d.y;
            r1.l(v0Var);
            v0Var.y.a("Conditional user property must not be null");
        } else {
            t2 t2Var = this.d.F;
            r1.k(t2Var);
            t2Var.E(bundle, j);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setConsentThirdParty(Bundle bundle, long j) throws Throwable {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.L(bundle, -20, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setCurrentScreen(com.gamericefishpro.space.c9.a aVar, String str, String str2, long j) {
        F();
        Activity activity = (Activity) b.G(aVar);
        c0.g(activity);
        setCurrentScreenByScionActivityInfo(com.gamericefishpro.space.i9.v0.b(activity), str, str2, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r3 <= 500) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (r3 <= 500) goto L39;
     */
    @Override // com.gamericefishpro.space.i9.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreenByScionActivityInfo(com.gamericefishpro.space.i9.v0 v0Var, String str, String str2, long j) {
        F();
        e3 e3Var = this.d.E;
        r1.k(e3Var);
        r1 r1Var = (r1) e3Var.d;
        if (!r1Var.v.F()) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.D.a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        b3 b3Var = e3Var.i;
        if (b3Var == null) {
            v0 v0Var3 = r1Var.y;
            r1.l(v0Var3);
            v0Var3.D.a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        ConcurrentHashMap concurrentHashMap = e3Var.y;
        Integer numValueOf = Integer.valueOf(v0Var.d);
        if (concurrentHashMap.get(numValueOf) == null) {
            v0 v0Var4 = r1Var.y;
            r1.l(v0Var4);
            v0Var4.D.a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = e3Var.y(v0Var.e);
        }
        String str3 = b3Var.b;
        String str4 = b3Var.a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            v0 v0Var5 = r1Var.y;
            r1.l(v0Var5);
            v0Var5.D.a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                int length = str.length();
                r1Var.v.getClass();
            }
            v0 v0Var6 = r1Var.y;
            r1.l(v0Var6);
            v0Var6.D.b(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                int length2 = str2.length();
                r1Var.v.getClass();
            }
            v0 v0Var7 = r1Var.y;
            r1.l(v0Var7);
            v0Var7.D.b(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
            return;
        }
        v0 v0Var8 = r1Var.y;
        r1.l(v0Var8);
        v0Var8.G.c("Setting current screen to name, class", str == null ? "null" : str, str2);
        r4 r4Var = r1Var.B;
        r1.j(r4Var);
        b3 b3Var2 = new b3(str, str2, r4Var.n0());
        concurrentHashMap.put(numValueOf, b3Var2);
        e3Var.A(v0Var.e, b3Var2, true);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setDataCollectionEnabled(boolean z) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.s();
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new j2(t2Var, z));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setDefaultEventParameters(Bundle bundle) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new o2(t2Var, bundle2, 2));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setEventInterceptor(q0 q0Var) {
        F();
        com.gamericefishpro.space.u6.c cVar = new com.gamericefishpro.space.u6.c();
        cVar.e = this;
        cVar.d = q0Var;
        p1 p1Var = this.d.z;
        r1.l(p1Var);
        if (!p1Var.x()) {
            p1 p1Var2 = this.d.z;
            r1.l(p1Var2);
            p1Var2.A(new a(15, this, cVar, false));
            return;
        }
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.r();
        t2Var.s();
        com.gamericefishpro.space.u6.c cVar2 = t2Var.v;
        if (cVar != cVar2) {
            c0.i("EventInterceptor already set.", cVar2 == null);
        }
        t2Var.v = cVar;
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setInstanceIdProvider(s0 s0Var) {
        F();
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setMeasurementEnabled(boolean z, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        Boolean boolValueOf = Boolean.valueOf(z);
        t2Var.s();
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new a(13, t2Var, boolValueOf, false));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setMinimumSessionDuration(long j) {
        F();
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setSessionTimeoutDuration(long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        p1 p1Var = ((r1) t2Var.d).z;
        r1.l(p1Var);
        p1Var.A(new l2(t2Var, j, 0));
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setSgtmDebugInfo(Intent intent) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        r1 r1Var = (r1) t2Var.d;
        Uri data = intent.getData();
        if (data == null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.E.a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.E.a("[sgtm] Preview Mode was not enabled.");
            r1Var.v.i = null;
            return;
        }
        String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
        if (TextUtils.isEmpty(queryParameter2)) {
            return;
        }
        v0 v0Var3 = r1Var.y;
        r1.l(v0Var3);
        v0Var3.E.b(queryParameter2, "[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ");
        r1Var.v.i = queryParameter2;
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setUserId(String str, long j) {
        F();
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        r1 r1Var = (r1) t2Var.d;
        if (str != null && TextUtils.isEmpty(str)) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.B.a("User ID must be non-empty or null");
        } else {
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new a(17, t2Var, str));
            t2Var.B(null, "_id", str, true, j);
        }
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setUserProperty(String str, String str2, com.gamericefishpro.space.c9.a aVar, boolean z, long j) {
        F();
        Object objG = b.G(aVar);
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.B(str, str2, objG, z, j);
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void unregisterOnMeasurementEventListener(q0 q0Var) {
        o0 o0Var;
        s4 s4Var;
        F();
        e eVar = this.e;
        synchronized (eVar) {
            o0Var = (o0) q0Var;
            Parcel parcelG = o0Var.G(o0Var.H(), 2);
            int i = parcelG.readInt();
            parcelG.recycle();
            s4Var = (s4) eVar.remove(Integer.valueOf(i));
        }
        if (s4Var == null) {
            s4Var = new s4(this, o0Var);
        }
        t2 t2Var = this.d.F;
        r1.k(t2Var);
        t2Var.s();
        if (t2Var.w.remove(s4Var)) {
            return;
        }
        v0 v0Var = ((r1) t2Var.d).y;
        r1.l(v0Var);
        v0Var.B.a("OnEventListener had not been registered");
    }

    @Override // com.gamericefishpro.space.i9.j0
    public void setConsent(Bundle bundle, long j) {
    }
}
