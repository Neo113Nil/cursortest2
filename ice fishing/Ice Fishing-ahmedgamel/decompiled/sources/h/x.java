package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class x extends B1.b {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f37949w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4537A f37950x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f37951y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A, b3.e eVar) {
        super(layoutInflaterFactory2C4537A);
        this.f37950x = layoutInflaterFactory2C4537A;
        this.f37951y = eVar;
    }

    @Override // B1.b
    public final IntentFilter e() {
        switch (this.f37949w) {
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

    @Override // B1.b
    public final int f() {
        Location location;
        boolean z6;
        long j6;
        Location location2;
        switch (this.f37949w) {
            case 0:
                return t.a((PowerManager) this.f37951y) ? 2 : 1;
            default:
                b3.e eVar = (b3.e) this.f37951y;
                J j9 = (J) eVar.f5559w;
                if (j9.f37858b > System.currentTimeMillis()) {
                    z6 = j9.f37857a;
                } else {
                    Context context = (Context) eVar.f5557u;
                    int b9 = E.e.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) eVar.f5558v;
                    if (b9 == 0) {
                        try {
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
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
                    if (E.e.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (I.f37852e == null) {
                            I.f37852e = new I();
                        }
                        I i = I.f37852e;
                        i.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        i.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z6 = i.f37854b == 1;
                        long j10 = i.f37856d;
                        long j11 = i.f37855c;
                        i.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j12 = i.f37856d;
                        if (j10 == -1 || j11 == -1) {
                            j6 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j11) {
                                j12 = currentTimeMillis > j10 ? j11 : j10;
                            }
                            j6 = j12 + 60000;
                        }
                        j9.f37857a = z6;
                        j9.f37858b = j6;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z6 = true;
                        }
                    }
                }
                return z6 ? 2 : 1;
        }
    }

    @Override // B1.b
    public final void l() {
        switch (this.f37949w) {
            case 0:
                this.f37950x.o(true, true);
                break;
            default:
                this.f37950x.o(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A, Context context) {
        super(layoutInflaterFactory2C4537A);
        this.f37950x = layoutInflaterFactory2C4537A;
        this.f37951y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
