package com.gamericefishpro.space.n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.r8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public u4(r1 r1Var) {
        this.b = r1Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r1 r1Var = (r1) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                v0 v0Var = r1Var.y;
                                r1.l(v0Var);
                                v0Var.G.a("[sgtm] App Receiver notified batches are available");
                                p1 p1Var = r1Var.z;
                                r1.l(p1Var);
                                p1Var.A(new com.gamericefishpro.space.h4.b(12, this));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            r8.a();
                            if (r1Var.v.B(null, e0.Q0)) {
                                v0 v0Var2 = r1Var.y;
                                r1.l(v0Var2);
                                v0Var2.G.a("App receiver notified triggers are available");
                                p1 p1Var2 = r1Var.z;
                                r1.l(p1Var2);
                                p1Var2.A(new com.gamericefishpro.space.h4.b(13, r1Var));
                                break;
                            }
                        }
                        v0 v0Var3 = r1Var.y;
                        r1.l(v0Var3);
                        v0Var3.B.a("App receiver called with unknown action");
                    } else {
                        v0 v0Var4 = r1Var.y;
                        r1.l(v0Var4);
                        v0Var4.B.a("App receiver called with null action");
                    }
                } else {
                    v0 v0Var5 = r1Var.y;
                    r1.l(v0Var5);
                    v0Var5.B.a("App receiver called with null intent");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                com.gamericefishpro.space.s6.a aVar = (com.gamericefishpro.space.s6.a) obj;
                int i2 = aVar.g;
                Intrinsics.checkNotNullParameter(intent, "intent");
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            com.gamericefishpro.space.l6.q qVarC = com.gamericefishpro.space.l6.q.c();
                            String str = com.gamericefishpro.space.s6.b.a;
                            qVarC.getClass();
                            switch (action2.hashCode()) {
                                case -1886648615:
                                    if (action2.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.e(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action2.equals("android.os.action.DISCHARGING")) {
                                        aVar.e(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action2.equals("android.os.action.CHARGING")) {
                                        aVar.e(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action2.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.e(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            com.gamericefishpro.space.l6.q qVarC2 = com.gamericefishpro.space.l6.q.c();
                            String str2 = com.gamericefishpro.space.s6.c.a;
                            intent.getAction();
                            qVarC2.getClass();
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1980154005) {
                                    if (iHashCode2 == 490310653 && action3.equals("android.intent.action.BATTERY_LOW")) {
                                        aVar.e(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.e(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            com.gamericefishpro.space.l6.q qVarC3 = com.gamericefishpro.space.l6.q.c();
                            int i3 = com.gamericefishpro.space.s6.i.a;
                            intent.getAction();
                            qVarC3.getClass();
                            String action4 = intent.getAction();
                            if (action4 != null) {
                                int iHashCode3 = action4.hashCode();
                                if (iHashCode3 != -1181163412) {
                                    if (iHashCode3 == -730838620 && action4.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        aVar.e(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action4.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.e(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }

    public u4(com.gamericefishpro.space.s6.a aVar) {
        this.b = aVar;
    }
}
