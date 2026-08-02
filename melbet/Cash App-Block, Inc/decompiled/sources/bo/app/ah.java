package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.managers.BrazeGeofenceManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ah implements z9 {
    public final hd A;
    public final mg B;
    public final Context a;
    public final BrazeConfigurationProvider b;
    public final h9 c;
    public final g9 d;
    public final String e;
    public final String f;
    public final xg g;
    public final z4 h;
    public final r7 i;
    public final ue j;
    public final g6 k;
    public final o7 l;
    public final k4 m;
    public final q2 n;
    public final u7 o;
    public final qc p;
    public final qd q;
    public final mc r;
    public final ie s;
    public final e2 t;
    public final BrazeGeofenceManager u;
    public final c2 v;
    public final g8 w;
    public final d0 x;
    public final x3 y;
    public final r6 z;

    public ah(Context context, fb fbVar, BrazeConfigurationProvider brazeConfigurationProvider, m9 m9Var, h9 h9Var, p9 p9Var, hc hcVar, boolean z, boolean z2, g9 g9Var, boolean z3) {
        Throwable th;
        Context context2;
        context.getClass();
        fbVar.getClass();
        brazeConfigurationProvider.getClass();
        m9Var.getClass();
        h9Var.getClass();
        p9Var.getClass();
        hcVar.getClass();
        g9Var.getClass();
        this.a = context;
        this.b = brazeConfigurationProvider;
        this.c = h9Var;
        this.d = g9Var;
        String a = fbVar.a();
        this.e = a;
        String str = brazeConfigurationProvider.getBrazeApiKey().a;
        this.f = str;
        he heVar = new he(context);
        u4 u4Var = new u4(context);
        a7 a7Var = new a7(context);
        r7 r7Var = new r7(heVar, u4Var, true);
        this.i = r7Var;
        ue ueVar = new ue(context, str, r7Var);
        this.j = ueVar;
        this.k = new g6(context, a, str, ueVar, r7Var, new o6(), new x7(ueVar.j(), ueVar.k(), ueVar.k(), ueVar.l()));
        new xd(ueVar, r7Var, context);
        f7 f7Var = new f7(new hf(context, a, str), r7Var);
        k4 k4Var = new k4(context, r7Var, new d4(context));
        this.m = k4Var;
        Object systemService = context.getSystemService("alarm");
        systemService.getClass();
        q2 q2Var = new q2(context, f7Var, r7Var, m9Var, (AlarmManager) systemService, brazeConfigurationProvider.getSessionTimeoutSeconds(), brazeConfigurationProvider.isSessionStartBasedTimeoutEnabled());
        this.n = q2Var;
        u7 u7Var = new u7(new t7(new q1(context, a, str), r7Var));
        this.o = u7Var;
        qc qcVar = new qc(context, str, a, r7Var, ueVar);
        this.p = qcVar;
        this.q = new qd(context, a, str);
        f2 f2Var = new f2(context, r7Var, ueVar);
        mc mcVar = new mc(context, str, a);
        this.r = mcVar;
        ie ieVar = new ie(context, a, str);
        this.s = ieVar;
        e2 e2Var = new e2(context, a, str, q2Var, r7Var, brazeConfigurationProvider, ueVar, u7Var, f2Var, heVar, qcVar, hcVar, mcVar, u4Var);
        this.t = e2Var;
        BrazeGeofenceManager brazeGeofenceManager = new BrazeGeofenceManager(context, str, e2Var, brazeConfigurationProvider, ueVar, r7Var);
        this.u = brazeGeofenceManager;
        c2 c2Var = new c2(context, e2Var, brazeConfigurationProvider);
        this.v = c2Var;
        g8 g8Var = new g8(context, str, a, r7Var, m9Var, ueVar, e2Var);
        this.w = g8Var;
        d0 d0Var = new d0(context, str, a, r7Var, m9Var, ueVar, e2Var);
        this.x = d0Var;
        x3 x3Var = new x3(context, a, str, e2Var);
        this.y = x3Var;
        cd cdVar = new cd(new ta(new w8(x8.a)), r7Var, m9Var, ueVar, x3Var, e2Var, a7Var);
        this.z = new r6(r7Var, e2Var);
        hd hdVar = new hd(new q5(this), cdVar, z, z3);
        this.A = hdVar;
        mg mgVar = new mg(context, e2Var, r7Var, m9Var, brazeConfigurationProvider, a, str, hdVar);
        this.B = mgVar;
        if (Intrinsics.areEqual(a, "")) {
            th = null;
            context2 = context;
            this.g = new xg(context2, p9Var, heVar, u4Var, null, null);
            this.h = new z4(context2, null, null);
        } else {
            th = null;
            context2 = context;
            this.g = new xg(context2, p9Var, heVar, u4Var, a, str);
            this.h = new z4(context2, a, str);
        }
        synchronized (k4Var) {
            try {
                k4Var.l = z2;
                k4Var.b();
                if (z2) {
                    k4Var.f();
                } else {
                    k4Var.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        xg a2 = a();
        z4 z4Var = this.h;
        if (z4Var != null) {
            this.l = new o7(context2, c2Var, r7Var, e2Var, a2, z4Var, mgVar, mgVar.h, u7Var, brazeGeofenceManager, m9Var, brazeConfigurationProvider, x3Var, ieVar, ueVar, g8Var, hcVar, d0Var);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            throw th;
        }
    }

    public final xg a() {
        xg xgVar = this.g;
        if (xgVar != null) {
            return xgVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userCache");
        throw null;
    }
}
