package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.os.SystemClock;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 extends g0 {
    public volatile boolean A;
    public volatile b3 B;
    public b3 C;
    public boolean D;
    public final Object E;
    public volatile b3 i;
    public volatile b3 v;
    public b3 w;
    public final ConcurrentHashMap y;
    public com.gamericefishpro.space.i9.v0 z;

    public e3(r1 r1Var) {
        super(r1Var);
        this.E = new Object();
        this.y = new ConcurrentHashMap();
    }

    public final void A(String str, b3 b3Var, boolean z) {
        b3 b3Var2;
        b3 b3Var3 = this.i == null ? this.v : this.i;
        if (b3Var.b == null) {
            b3Var2 = new b3(b3Var.a, str != null ? y(str) : null, b3Var.c, b3Var.e, b3Var.f);
        } else {
            b3Var2 = b3Var;
        }
        this.v = this.i;
        this.i = b3Var2;
        r1 r1Var = (r1) this.d;
        r1Var.D.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p1 p1Var = r1Var.z;
        r1.l(p1Var);
        p1Var.A(new c3(this, b3Var2, b3Var3, jElapsedRealtime, z));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    public final void B(b3 b3Var, b3 b3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        boolean z3 = b3Var.e;
        r1 r1Var = (r1) this.d;
        r();
        boolean z4 = false;
        if (b3Var2 != null) {
            if (b3Var2.c == b3Var.c && Objects.equals(b3Var2.b, b3Var.b) && Objects.equals(b3Var2.a, b3Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.w != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            r4.i0(b3Var, bundle2, true);
            if (b3Var2 != null) {
                String str = b3Var2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = b3Var2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", b3Var2.c);
            }
            if (z4) {
                w3 w3Var = r1Var.A;
                r1.k(w3Var);
                v3 v3Var = w3Var.y;
                long j2 = j - v3Var.e;
                v3Var.e = j;
                if (j2 > 0) {
                    r4 r4Var = r1Var.B;
                    r1.j(r4Var);
                    r4Var.Y(bundle2, j2);
                }
            }
            if (!r1Var.v.F()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            r1Var.D.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j3 = b3Var.f;
                if (j3 != 0) {
                    jCurrentTimeMillis = j3;
                }
            }
            t2 t2Var = r1Var.F;
            r1.k(t2Var);
            t2Var.z(jCurrentTimeMillis, bundle2, str3, "_vs");
        }
        if (z4) {
            v(this.w, true, j);
        }
        this.w = b3Var;
        if (z3) {
            this.C = b3Var;
        }
        o3 o3VarO = r1Var.o();
        o3VarO.r();
        o3VarO.s();
        o3VarO.F(new com.gamericefishpro.space.va.a(o3VarO, b3Var));
    }

    @Override // com.gamericefishpro.space.n9.g0
    public final boolean u() {
        return false;
    }

    public final void v(b3 b3Var, boolean z, long j) {
        r1 r1Var = (r1) this.d;
        x xVar = r1Var.G;
        r1.i(xVar);
        r1Var.D.getClass();
        xVar.u(SystemClock.elapsedRealtime());
        boolean z2 = b3Var != null && b3Var.d;
        w3 w3Var = r1Var.A;
        r1.k(w3Var);
        if (!w3Var.y.e(z2, z, j) || b3Var == null) {
            return;
        }
        b3Var.d = false;
    }

    public final b3 w(com.gamericefishpro.space.i9.v0 v0Var) {
        com.gamericefishpro.space.v8.c0.g(v0Var);
        Integer numValueOf = Integer.valueOf(v0Var.d);
        ConcurrentHashMap concurrentHashMap = this.y;
        b3 b3Var = (b3) concurrentHashMap.get(numValueOf);
        if (b3Var == null) {
            String strY = y(v0Var.e);
            r4 r4Var = ((r1) this.d).B;
            r1.j(r4Var);
            b3 b3Var2 = new b3(null, strY, r4Var.n0());
            concurrentHashMap.put(numValueOf, b3Var2);
            b3Var = b3Var2;
        }
        return this.B != null ? this.B : b3Var;
    }

    public final b3 x(boolean z) {
        s();
        r();
        if (!z) {
            return this.w;
        }
        b3 b3Var = this.w;
        return b3Var != null ? b3Var : this.C;
    }

    public final String y(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : "";
        r1 r1Var = (r1) this.d;
        int length2 = str2.length();
        r1Var.v.getClass();
        if (length2 <= 500) {
            return str2;
        }
        r1Var.v.getClass();
        return str2.substring(0, PermissionsActivity.DELAY_TIME_CALLBACK_CALL);
    }

    public final void z(com.gamericefishpro.space.i9.v0 v0Var, Bundle bundle) {
        Bundle bundle2;
        if (!((r1) this.d).v.F() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.y.put(Integer.valueOf(v0Var.d), new b3(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
