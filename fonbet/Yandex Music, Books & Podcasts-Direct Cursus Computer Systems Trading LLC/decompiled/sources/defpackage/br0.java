package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class br0 extends b6 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ er0 e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(er0 er0Var, Context context) {
        super(er0Var);
        this.e = er0Var;
        this.f = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.b6
    public final void A() {
        switch (this.d) {
            case 0:
                this.e.r(true, true);
                break;
            default:
                this.e.r(true, true);
                break;
        }
    }

    @Override // defpackage.b6
    public final IntentFilter k() {
        switch (this.d) {
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

    @Override // defpackage.b6
    public final int p() {
        Location location;
        boolean z;
        long j;
        Location location2;
        switch (this.d) {
            case 0:
                return vq0.a((PowerManager) this.f) ? 2 : 1;
            default:
                yks yksVar = (yks) this.f;
                tpr tprVar = (tpr) yksVar.d;
                LocationManager locationManager = (LocationManager) yksVar.c;
                if (tprVar.b > System.currentTimeMillis()) {
                    z = tprVar.a;
                } else {
                    Context context = (Context) yksVar.b;
                    Location location3 = null;
                    if (ldg.m(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
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
                    if (ldg.m(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (q03.e == null) {
                            q03.e = new q03();
                        }
                        q03 q03Var = q03.e;
                        q03Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        q03Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        z = q03Var.c == 1;
                        long j2 = q03Var.b;
                        long j3 = q03Var.a;
                        q03Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j4 = q03Var.b;
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
                        tprVar.a = z;
                        tprVar.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                }
                return z ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(er0 er0Var, yks yksVar) {
        super(er0Var);
        this.e = er0Var;
        this.f = yksVar;
    }
}
