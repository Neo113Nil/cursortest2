package yads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import defpackage.hl61;
import defpackage.rf71;

/* loaded from: classes7.dex */
public final class a72 extends BroadcastReceiver {
    public final /* synthetic */ hl61 a;

    public a72(hl61 hl61Var) {
        this.a = hl61Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type == 9) {
                                i = 7;
                            } else if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = 8;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (rf71.a >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (rf71.a < 31 || i != 5) {
            this.a.c(i);
            return;
        }
        hl61 hl61Var = this.a;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            x62 x62Var = new x62(hl61Var);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), x62Var);
            telephonyManager.unregisterTelephonyCallback(x62Var);
        } catch (RuntimeException unused2) {
            hl61Var.c(5);
        }
    }
}
