package h;

import Z.AbstractC0059g;
import a.AbstractC0078a;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class x extends AbstractC0059g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3239c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0159B f3240d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, M0.h hVar) {
        super(layoutInflaterFactory2C0159B);
        this.f3240d = layoutInflaterFactory2C0159B;
        this.e = hVar;
    }

    @Override // Z.AbstractC0059g
    public final IntentFilter e() {
        switch (this.f3239c) {
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

    @Override // Z.AbstractC0059g
    public final int f() {
        Location location;
        boolean z2;
        long j;
        Location location2;
        switch (this.f3239c) {
            case 0:
                return t.a((PowerManager) this.e) ? 2 : 1;
            default:
                M0.h hVar = (M0.h) this.e;
                J j2 = (J) hVar.f618d;
                if (j2.f3148b > System.currentTimeMillis()) {
                    z2 = j2.f3147a;
                } else {
                    Context context = (Context) hVar.f616b;
                    int i = AbstractC0078a.i(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) hVar.f617c;
                    if (i == 0) {
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
                    if (AbstractC0078a.i(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (I.f3143d == null) {
                            I.f3143d = new I();
                        }
                        I i2 = I.f3143d;
                        i2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        i2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = i2.f3146c == 1;
                        long j3 = i2.f3145b;
                        long j4 = i2.f3144a;
                        i2.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j5 = i2.f3145b;
                        if (j3 == -1 || j4 == -1) {
                            j = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j4) {
                                j5 = currentTimeMillis > j3 ? j4 : j3;
                            }
                            j = j5 + 60000;
                        }
                        j2.f3147a = z2;
                        j2.f3148b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                            z2 = true;
                        }
                    }
                }
                return z2 ? 2 : 1;
        }
    }

    @Override // Z.AbstractC0059g
    public final void i() {
        switch (this.f3239c) {
            case 0:
                this.f3240d.k(true, true);
                break;
            default:
                this.f3240d.k(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B, Context context) {
        super(layoutInflaterFactory2C0159B);
        this.f3240d = layoutInflaterFactory2C0159B;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
