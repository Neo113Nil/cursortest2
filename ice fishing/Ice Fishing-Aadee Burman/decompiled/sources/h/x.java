package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class x extends E2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f37923w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4533A f37924x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f37925y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A, Z2.e eVar) {
        super(layoutInflaterFactory2C4533A);
        this.f37924x = layoutInflaterFactory2C4533A;
        this.f37925y = eVar;
    }

    @Override // E2.a
    public final IntentFilter e() {
        switch (this.f37923w) {
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

    @Override // E2.a
    public final int f() {
        Location location;
        boolean z3;
        long j6;
        Location location2;
        switch (this.f37923w) {
            case 0:
                return t.a((PowerManager) this.f37925y) ? 2 : 1;
            default:
                Z2.e eVar = (Z2.e) this.f37925y;
                I i = (I) eVar.f4172w;
                if (i.f37832b > System.currentTimeMillis()) {
                    z3 = i.f37831a;
                } else {
                    Context context = (Context) eVar.f4170u;
                    int b9 = E.e.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) eVar.f4171v;
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
                        if (C4540H.f37826e == null) {
                            C4540H.f37826e = new C4540H();
                        }
                        C4540H c4540h = C4540H.f37826e;
                        c4540h.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c4540h.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z3 = c4540h.f37828b == 1;
                        long j9 = c4540h.f37830d;
                        long j10 = c4540h.f37829c;
                        c4540h.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j11 = c4540h.f37830d;
                        if (j9 == -1 || j10 == -1) {
                            j6 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j10) {
                                j11 = currentTimeMillis > j9 ? j10 : j9;
                            }
                            j6 = j11 + 60000;
                        }
                        i.f37831a = z3;
                        i.f37832b = j6;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i6 = Calendar.getInstance().get(11);
                        if (i6 < 6 || i6 >= 22) {
                            z3 = true;
                        }
                    }
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // E2.a
    public final void l() {
        switch (this.f37923w) {
            case 0:
                this.f37924x.n(true, true);
                break;
            default:
                this.f37924x.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A, Context context) {
        super(layoutInflaterFactory2C4533A);
        this.f37924x = layoutInflaterFactory2C4533A;
        this.f37925y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
