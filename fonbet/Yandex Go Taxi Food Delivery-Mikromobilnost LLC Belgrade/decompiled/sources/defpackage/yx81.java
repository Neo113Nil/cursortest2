package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.internal.c;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class yx81 implements fy81 {
    public int A;
    public kz81 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public IAccountAccessor H;
    public boolean I;
    public boolean J;
    public final y2c K;
    public final Map L;
    public final jm2 M;
    public final e a;
    public final Lock b;
    public final Context c;
    public final b w;
    public ConnectionResult x;
    public int y;
    public int z = 0;
    public final Bundle B = new Bundle();
    public final HashSet C = new HashSet();
    public final ArrayList N = new ArrayList();

    public yx81(e eVar, y2c y2cVar, Map map, b bVar, jm2 jm2Var, Lock lock, Context context) {
        this.a = eVar;
        this.K = y2cVar;
        this.L = map;
        this.w = bVar;
        this.M = jm2Var;
        this.b = lock;
        this.c = context;
    }

    public final void a() {
        this.F = false;
        e eVar = this.a;
        d dVar = eVar.F;
        HashMap hashMap = eVar.z;
        dVar.I = Collections.EMPTY_SET;
        Iterator it = this.C.iterator();
        while (it.hasNext()) {
            km2 km2Var = (km2) it.next();
            if (!hashMap.containsKey(km2Var)) {
                hashMap.put(km2Var, new ConnectionResult(17, null));
            }
        }
    }

    public final void b(boolean z) {
        kz81 kz81Var = this.D;
        if (kz81Var != null) {
            if (kz81Var.isConnected() && z) {
                kz81Var.zaa();
            }
            kz81Var.disconnect();
            cvw.l(this.K);
            this.H = null;
        }
    }

    public final void c() {
        e eVar = this.a;
        eVar.a.lock();
        try {
            eVar.F.s();
            eVar.D = new ux81(eVar);
            eVar.D.h();
            eVar.b.signalAll();
            eVar.a.unlock();
            hy81.a.execute(new h3s0(20, this));
            kz81 kz81Var = this.D;
            if (kz81Var != null) {
                if (this.I) {
                    IAccountAccessor iAccountAccessor = this.H;
                    cvw.l(iAccountAccessor);
                    kz81Var.a(iAccountAccessor, this.J);
                }
                b(false);
            }
            Iterator it = this.a.z.keySet().iterator();
            while (it.hasNext()) {
                om2 om2Var = (om2) this.a.y.get((km2) it.next());
                cvw.l(om2Var);
                om2Var.disconnect();
            }
            this.a.G.j(this.B.isEmpty() ? null : this.B);
        } catch (Throwable th) {
            eVar.a.unlock();
            throw th;
        }
    }

    public final void d(ConnectionResult connectionResult) {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(!connectionResult.hasResolution());
        e eVar = this.a;
        eVar.h();
        eVar.G.o(connectionResult);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r2.w.b(null, r3.getErrorCode(), null) != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ConnectionResult connectionResult, zm2 zm2Var, boolean z) {
        zm2Var.a.getClass();
        if (z && !connectionResult.hasResolution()) {
        }
        if (this.x == null || Integer.MAX_VALUE < this.y) {
            this.x = connectionResult;
            this.y = Integer.MAX_VALUE;
        }
        this.a.z.put(zm2Var.b, connectionResult);
    }

    public final void f() {
        if (this.A != 0) {
            return;
        }
        if (!this.F || this.G) {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            this.z = 1;
            e eVar = this.a;
            Map map = eVar.y;
            Map map2 = eVar.y;
            this.A = map.size();
            for (km2 km2Var : map2.keySet()) {
                if (!eVar.z.containsKey(km2Var)) {
                    arrayList.add((om2) map2.get(km2Var));
                } else if (k()) {
                    c();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.N.add(hy81.a.submit(new xx81(this, arrayList, i)));
        }
    }

    public final boolean g(int i) {
        if (this.z == i) {
            return true;
        }
        d dVar = this.a.F;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        dVar.d("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        StringBuilder x = unr0.x("GoogleApiClient connecting is in step ", this.z != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN", " but received callback for step ");
        x.append(i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN");
        Log.e("GACConnecting", x.toString(), new Exception());
        d(new ConnectionResult(8, null));
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kz81, om2] */
    @Override // defpackage.fy81
    public final void h() {
        e eVar = this.a;
        HashMap hashMap = eVar.z;
        d dVar = eVar.F;
        Map map = eVar.y;
        hashMap.clear();
        int i = 0;
        this.F = false;
        this.x = null;
        this.z = 0;
        this.E = true;
        this.G = false;
        this.I = false;
        HashMap hashMap2 = new HashMap();
        Map map2 = this.L;
        for (zm2 zm2Var : map2.keySet()) {
            om2 om2Var = (om2) map.get(zm2Var.b);
            cvw.l(om2Var);
            om2 om2Var2 = om2Var;
            zm2Var.a.getClass();
            boolean booleanValue = ((Boolean) map2.get(zm2Var)).booleanValue();
            if (om2Var2.requiresSignIn()) {
                this.F = true;
                if (booleanValue) {
                    this.C.add(zm2Var.b);
                } else {
                    this.E = false;
                }
            }
            hashMap2.put(om2Var2, new vx81(this, zm2Var, booleanValue));
        }
        if (this.F) {
            y2c y2cVar = this.K;
            cvw.l(y2cVar);
            cvw.l(this.M);
            y2cVar.g = Integer.valueOf(System.identityHashCode(dVar));
            c cVar = new c(this);
            this.D = this.M.c(this.c, dVar.z, y2cVar, y2cVar.f, cVar, cVar);
        }
        this.A = map.size();
        this.N.add(hy81.a.submit(new xx81(this, hashMap2, i)));
    }

    @Override // defpackage.fy81
    public final void i() {
    }

    @Override // defpackage.fy81
    public final void j(int i) {
        d(new ConnectionResult(8, null));
    }

    public final boolean k() {
        int i = this.A - 1;
        this.A = i;
        if (i > 0) {
            return false;
        }
        e eVar = this.a;
        if (i >= 0) {
            ConnectionResult connectionResult = this.x;
            if (connectionResult == null) {
                return true;
            }
            eVar.E = this.y;
            d(connectionResult);
            return false;
        }
        d dVar = eVar.F;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        dVar.d("", null, new PrintWriter(stringWriter), null);
        stringWriter.toString();
        Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
        d(new ConnectionResult(8, null));
        return false;
    }

    @Override // defpackage.fy81
    public final boolean l() {
        ArrayList arrayList = this.N;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        b(true);
        this.a.h();
        return true;
    }

    @Override // defpackage.fy81
    public final a p(a aVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.fy81
    public final void r(Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.B.putAll(bundle);
            }
            if (k()) {
                c();
            }
        }
    }

    @Override // defpackage.fy81
    public final void s(ConnectionResult connectionResult, zm2 zm2Var, boolean z) {
        if (g(1)) {
            e(connectionResult, zm2Var, z);
            if (k()) {
                c();
            }
        }
    }
}
