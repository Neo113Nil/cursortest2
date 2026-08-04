package com.gamericefishpro.space.s6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f5.y;
import com.gamericefishpro.space.l6.q;
import com.gamericefishpro.space.n9.u4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends y {
    public final u4 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.gamericefishpro.space.r5.b taskExecutor, int i) {
        super(context, taskExecutor);
        this.g = i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f = new u4(this);
    }

    @Override // com.gamericefishpro.space.f5.y
    public final Object b() {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intent intentRegisterReceiver = ((Context) this.b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    q.c().a(b.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    q.c().a(c.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.b).registerReceiver(null, h());
                boolean z2 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z2 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // com.gamericefishpro.space.f5.y
    public final void f() {
        q qVarC = q.c();
        int i = d.a;
        qVarC.getClass();
        ((Context) this.b).registerReceiver(this.f, h());
    }

    @Override // com.gamericefishpro.space.f5.y
    public final void g() {
        q qVarC = q.c();
        int i = d.a;
        qVarC.getClass();
        ((Context) this.b).unregisterReceiver(this.f);
    }

    public final IntentFilter h() {
        switch (this.g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
