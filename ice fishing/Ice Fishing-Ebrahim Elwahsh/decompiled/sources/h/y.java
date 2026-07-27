package h;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class y extends D2.a {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f38138w = 1;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C4535B f38139x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f38140y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B, Y2.e eVar) {
        super(layoutInflaterFactory2C4535B);
        this.f38139x = layoutInflaterFactory2C4535B;
        this.f38140y = eVar;
    }

    @Override // D2.a
    public final IntentFilter e() {
        switch (this.f38138w) {
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

    @Override // D2.a
    public final int f() {
        Location location;
        boolean z8;
        long j9;
        Location location2;
        switch (this.f38138w) {
            case 0:
                return u.a((PowerManager) this.f38140y) ? 2 : 1;
            default:
                Y2.e eVar = (Y2.e) this.f38140y;
                J j10 = (J) eVar.f3965w;
                if (j10.f38045b > System.currentTimeMillis()) {
                    z8 = j10.f38044a;
                } else {
                    Context context = (Context) eVar.f3963u;
                    int b9 = E.e.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) eVar.f3964v;
                    if (b9 == 0) {
                        try {
                        } catch (Exception e6) {
                            Log.d("TwilightManager", "Failed to get last known location", e6);
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
                        } catch (Exception e9) {
                            Log.d("TwilightManager", "Failed to get last known location", e9);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (I.f38039e == null) {
                            I.f38039e = new I();
                        }
                        I i = I.f38039e;
                        i.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        i.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        z8 = i.f38041b == 1;
                        long j11 = i.f38043d;
                        long j12 = i.f38042c;
                        i.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j13 = i.f38043d;
                        if (j11 == -1 || j12 == -1) {
                            j9 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j12) {
                                j13 = currentTimeMillis > j11 ? j12 : j11;
                            }
                            j9 = j13 + 60000;
                        }
                        j10.f38044a = z8;
                        j10.f38045b = j9;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i4 = Calendar.getInstance().get(11);
                        if (i4 < 6 || i4 >= 22) {
                            z8 = true;
                        }
                    }
                }
                return z8 ? 2 : 1;
        }
    }

    @Override // D2.a
    public final void l() {
        switch (this.f38138w) {
            case 0:
                this.f38139x.n(true, true);
                break;
            default:
                this.f38139x.n(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(LayoutInflaterFactory2C4535B layoutInflaterFactory2C4535B, Context context) {
        super(layoutInflaterFactory2C4535B);
        this.f38139x = layoutInflaterFactory2C4535B;
        this.f38140y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
