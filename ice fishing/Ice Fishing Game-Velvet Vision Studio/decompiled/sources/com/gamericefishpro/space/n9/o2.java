package com.gamericefishpro.space.n9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.onesignal.core.activities.PermissionsActivity;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ t2 i;

    public /* synthetic */ o2(t2 t2Var, Bundle bundle, int i) {
        this.d = i;
        this.e = bundle;
        this.i = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t2 t2Var = this.i;
                t2Var.r();
                t2Var.s();
                Bundle bundle2 = this.e;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                com.gamericefishpro.space.v8.c0.d(string);
                com.gamericefishpro.space.v8.c0.d(string2);
                com.gamericefishpro.space.v8.c0.g(bundle2.get("value"));
                r1 r1Var = (r1) t2Var.d;
                if (!r1Var.b()) {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.G.a("Conditional property not set since app measurement is disabled");
                } else {
                    o4 o4Var = new o4(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        r4 r4Var = r1Var.B;
                        r1.j(r4Var);
                        bundle2.getString("app_id");
                        u uVarT = r4Var.T(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        r1.j(r4Var);
                        bundle2.getString("app_id");
                        u uVarT2 = r4Var.T(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString("app_id");
                        r1Var.o().K(new e(bundle2.getString("app_id"), string2, o4Var, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), uVarT2, bundle2.getLong("trigger_timeout"), uVarT, bundle2.getLong("time_to_live"), r4Var.T(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            case 1:
                t2 t2Var2 = this.i;
                t2Var2.r();
                t2Var2.s();
                Bundle bundle3 = this.e;
                String string3 = bundle3.getString("name");
                com.gamericefishpro.space.v8.c0.d(string3);
                r1 r1Var2 = (r1) t2Var2.d;
                if (!r1Var2.b()) {
                    v0 v0Var2 = r1Var2.y;
                    r1.l(v0Var2);
                    v0Var2.G.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    o4 o4Var2 = new o4(0L, null, string3, "");
                    try {
                        r4 r4Var2 = r1Var2.B;
                        r1.j(r4Var2);
                        bundle3.getString("app_id");
                        r1Var2.o().K(new e(bundle3.getString("app_id"), "", o4Var2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), r4Var2.T(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
                break;
            default:
                t2 t2Var3 = this.i;
                com.gamericefishpro.space.m.d dVar = t2Var3.P;
                r1 r1Var3 = (r1) t2Var3.d;
                Bundle bundle4 = this.e;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    f1 f1Var = r1Var3.w;
                    r4 r4Var3 = r1Var3.B;
                    g gVar = r1Var3.v;
                    v0 v0Var3 = r1Var3.y;
                    r1.j(f1Var);
                    bundle = new Bundle(f1Var.R.k());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            r1.j(r4Var3);
                            if (r4.z0(obj)) {
                                r4.H(dVar, null, 27, null, null, 0);
                            }
                            r1.l(v0Var3);
                            v0Var3.D.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (r4.P(str)) {
                            r1.l(v0Var3);
                            v0Var3.D.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            r1.j(r4Var3);
                            gVar.getClass();
                            if (r4Var3.A0("param", str, PermissionsActivity.DELAY_TIME_CALLBACK_CALL, obj)) {
                                r4Var3.G(bundle, str, obj);
                            }
                        }
                    }
                    r1.j(r4Var3);
                    r4 r4Var4 = ((r1) gVar.d).B;
                    r1.j(r4Var4);
                    int i = r4Var4.W(201500000) ? 100 : 25;
                    if (bundle.size() > i) {
                        int i2 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i2++;
                            if (i2 > i) {
                                bundle.remove(str2);
                            }
                        }
                        r1.j(r4Var3);
                        r4.H(dVar, null, 26, null, null, 0);
                        r1.l(v0Var3);
                        v0Var3.D.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                f1 f1Var2 = r1Var3.w;
                r1.j(f1Var2);
                f1Var2.R.l(bundle);
                if (!bundle4.isEmpty() || r1Var3.v.B(null, e0.W0)) {
                    r1Var3.o().w(bundle);
                }
                break;
        }
    }
}
