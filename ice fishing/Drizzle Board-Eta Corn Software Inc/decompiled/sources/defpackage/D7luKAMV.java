package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class D7luKAMV extends cD2QLRqg {
    public final /* synthetic */ int MdtA4re8 = 0;
    public final Object VgvYg0wo;
    public final /* synthetic */ SJ7tYVsF wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7luKAMV(SJ7tYVsF sJ7tYVsF, Context context) {
        super(sJ7tYVsF);
        this.wxUZMvaN = sJ7tYVsF;
        this.VgvYg0wo = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.cD2QLRqg
    public final IntentFilter P7K7Inc8() {
        switch (this.MdtA4re8) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // defpackage.cD2QLRqg
    public final int b2ZJblxo() {
        Location location;
        boolean z;
        long j;
        Location location2;
        int i = this.MdtA4re8;
        Object obj = this.VgvYg0wo;
        switch (i) {
            case 0:
                if (!a1yBAuls.qoPGr6Ce((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                f0 f0Var = (f0) obj;
                LocationManager locationManager = (LocationManager) f0Var.MdtA4re8;
                ke0 ke0Var = (ke0) f0Var.wxUZMvaN;
                if (ke0Var.NCTxEWno > System.currentTimeMillis()) {
                    z = ke0Var.qoPGr6Ce;
                } else {
                    Context context = (Context) f0Var.VgvYg0wo;
                    Location location3 = null;
                    if (le0.jb9XjC4I(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (le0.jb9XjC4I(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        je0 je0Var = je0.wxUZMvaN;
                        if (je0Var == null) {
                            je0Var = new je0();
                            je0.wxUZMvaN = je0Var;
                        }
                        je0 je0Var2 = je0Var;
                        je0Var2.qoPGr6Ce(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        je0Var2.qoPGr6Ce(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = je0Var2.MdtA4re8 == 1;
                        long j2 = je0Var2.NCTxEWno;
                        long j3 = je0Var2.qoPGr6Ce;
                        je0Var2.qoPGr6Ce(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = je0Var2.NCTxEWno;
                        if (j2 == -1 || j3 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis > j3) {
                                j2 = j4;
                            } else if (currentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        ke0Var.qoPGr6Ce = z;
                        ke0Var.NCTxEWno = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // defpackage.cD2QLRqg
    public final void ow5vqvCr() {
        int i = this.MdtA4re8;
        SJ7tYVsF sJ7tYVsF = this.wxUZMvaN;
        switch (i) {
            case 0:
                sJ7tYVsF.ow5vqvCr(true, true);
                break;
            default:
                sJ7tYVsF.ow5vqvCr(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7luKAMV(SJ7tYVsF sJ7tYVsF, f0 f0Var) {
        super(sJ7tYVsF);
        this.wxUZMvaN = sJ7tYVsF;
        this.VgvYg0wo = f0Var;
    }
}
