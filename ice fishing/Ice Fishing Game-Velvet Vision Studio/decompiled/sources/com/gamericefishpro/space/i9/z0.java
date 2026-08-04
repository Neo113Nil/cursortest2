package com.gamericefishpro.space.i9;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends g1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(j1 j1Var, Object obj, Object obj2, int i) {
        super(j1Var, true);
        this.w = i;
        this.z = obj;
        this.A = obj2;
        this.y = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        Boolean boolValueOf;
        Bundle bundle;
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    Context context = (Context) this.z;
                    com.gamericefishpro.space.v8.c0.g(context);
                    String strA = com.gamericefishpro.space.n9.f2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strA)) {
                        strA = com.gamericefishpro.space.n9.f2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strA);
                    j0 j0VarAsInterface = null;
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    j1 j1Var = (j1) this.y;
                    boolean z = boolValueOf == null || !boolValueOf.booleanValue();
                    j1Var.getClass();
                    try {
                        j0VarAsInterface = i0.asInterface(com.gamericefishpro.space.d9.f.c(context, z ? com.gamericefishpro.space.d9.f.c : com.gamericefishpro.space.d9.f.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (com.gamericefishpro.space.d9.b e) {
                        j1Var.b(e, true, false);
                    }
                    j1Var.e = j0VarAsInterface;
                    if (j1Var.e != null) {
                        int iA = com.gamericefishpro.space.d9.f.a(context, ModuleDescriptor.MODULE_ID);
                        int iD = com.gamericefishpro.space.d9.f.d(ModuleDescriptor.MODULE_ID, false, context);
                        t0 t0Var = new t0(133005L, Math.max(iA, iD), Boolean.TRUE.equals(boolValueOf) || iD < iA, (Bundle) this.A, com.gamericefishpro.space.n9.f2.a(context));
                        j0 j0Var = j1Var.e;
                        com.gamericefishpro.space.v8.c0.g(j0Var);
                        j0Var.initialize(new com.gamericefishpro.space.c9.b(context), t0Var, this.d);
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((j1) this.y).b(e2, true, false);
                    return;
                }
                break;
            case 1:
                j0 j0Var2 = ((j1) this.y).e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.logHealthData(5, (String) this.z, new com.gamericefishpro.space.c9.b(this.A), new com.gamericefishpro.space.c9.b(null), new com.gamericefishpro.space.c9.b(null));
                break;
            case 2:
                j0 j0Var3 = ((j1) this.y).e;
                com.gamericefishpro.space.v8.c0.g(j0Var3);
                j0Var3.getMaxUserProperties((String) this.z, (g0) this.A);
                break;
            case 3:
                Bundle bundle2 = (Bundle) this.A;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                j0 j0Var4 = ((i1) this.y).d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var4);
                j0Var4.onActivityCreatedByScionActivityInfo(v0.b((Activity) this.z), bundle, this.e);
                break;
            default:
                j0 j0Var5 = ((i1) this.y).d.e;
                com.gamericefishpro.space.v8.c0.g(j0Var5);
                j0Var5.onActivitySaveInstanceStateByScionActivityInfo(v0.b((Activity) this.z), (g0) this.A, this.e);
                break;
        }
    }

    @Override // com.gamericefishpro.space.i9.g1
    public void b() {
        switch (this.w) {
            case 2:
                ((g0) this.A).h(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i1 i1Var, Activity activity, g0 g0Var) {
        super(i1Var.d, true);
        this.w = 4;
        this.z = activity;
        this.A = g0Var;
        this.y = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(i1 i1Var, Bundle bundle, Activity activity) {
        super(i1Var.d, true);
        this.w = 3;
        this.A = bundle;
        this.z = activity;
        this.y = i1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, String str, Object obj) {
        super(j1Var, false);
        this.w = 1;
        this.z = str;
        this.A = obj;
        this.y = j1Var;
    }
}
