package ru.rt.ebs.cryptosdk.core.metadata.data.system.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import defpackage.c3v;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.scc;
import defpackage.uh91;
import defpackage.uk10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;

/* loaded from: classes4.dex */
public final class a implements c3v {
    public final Context a;
    public boolean b;
    public LocationManager c;
    public uk10 w;
    public LocationManager$SelfLocationListener x;

    public a(Context context) {
        this.a = context;
        try {
            Object systemService = context.getSystemService("location");
            this.c = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        } catch (Exception e) {
            EbsLogger.INSTANCE.error("LOCATION", e);
        }
    }

    public static boolean c(String str) {
        return (evu0.J(str) || str.equals("")) ? false : true;
    }

    public final void a(String str) {
        LocationManager locationManager;
        Location lastKnownLocation;
        uk10 uk10Var;
        try {
            if (!c(str) || (locationManager = this.c) == null || (lastKnownLocation = locationManager.getLastKnownLocation(str)) == null || (uk10Var = this.w) == null) {
                return;
            }
            uk10Var.onLocationChanged(lastKnownLocation);
        } catch (Exception e) {
            EbsLogger.INSTANCE.warning("LOCATION", e);
        }
    }

    public final void b(String str, LocationManager$SelfLocationListener locationManager$SelfLocationListener) {
        LocationManager locationManager;
        try {
            if (!c(str) || locationManager$SelfLocationListener == null || (locationManager = this.c) == null) {
                return;
            }
            locationManager.requestLocationUpdates(str, 3000L, 10.0f, locationManager$SelfLocationListener);
        } catch (Exception e) {
            EbsLogger.INSTANCE.warning("LOCATION", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        String str;
        String str2;
        LocationManager locationManager;
        List<String> providers;
        String str3 = "";
        if (this.b) {
            return;
        }
        ArrayList b = uh91.b(this.a, scc.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"));
        if (!b.isEmpty()) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Pair) it.next()).f()).booleanValue()) {
                    this.b = true;
                    try {
                        locationManager = this.c;
                    } catch (Exception e) {
                        e = e;
                        str = "";
                    }
                    if (locationManager == null || (providers = locationManager.getProviders(true)) == null) {
                        str2 = "";
                        if (c(str3)) {
                            a(str3);
                        }
                        if (c(str2)) {
                            a(str2);
                        }
                        if (c(str2)) {
                            if (this.x == null) {
                                this.x = new LocationManager$SelfLocationListener(this);
                            }
                            b(str2, this.x);
                            return;
                        } else {
                            if (!c(str3)) {
                                this.b = false;
                                return;
                            }
                            if (this.x == null) {
                                this.x = new LocationManager$SelfLocationListener(this);
                            }
                            b(str3, this.x);
                            return;
                        }
                    }
                    str = "";
                    for (String str4 : providers) {
                        try {
                            if (jl40.l(str4, "gps")) {
                                str3 = str4;
                            } else if (jl40.l(str4, "network")) {
                                str = str4;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            EbsLogger.INSTANCE.warning("LOCATION", e);
                            str2 = str3;
                            str3 = str;
                            if (c(str3)) {
                            }
                            if (c(str2)) {
                            }
                            if (c(str2)) {
                            }
                        }
                    }
                    str2 = str3;
                    str3 = str;
                    if (c(str3)) {
                    }
                    if (c(str2)) {
                    }
                    if (c(str2)) {
                    }
                }
            }
        }
        EbsLogger.INSTANCE.info("LOCATION", "Access location permissions denied");
    }

    public final void e() {
        LocationManager$SelfLocationListener locationManager$SelfLocationListener;
        try {
            LocationManager locationManager = this.c;
            if (locationManager != null && (locationManager$SelfLocationListener = this.x) != null) {
                locationManager.removeUpdates(locationManager$SelfLocationListener);
            }
        } catch (Exception e) {
            EbsLogger.INSTANCE.error("LOCATION", e);
        }
        this.c = null;
        LocationManager$SelfLocationListener locationManager$SelfLocationListener2 = this.x;
        if (locationManager$SelfLocationListener2 != null) {
            locationManager$SelfLocationListener2.release();
        }
        this.x = null;
        this.w = null;
        this.b = false;
    }

    @Override // defpackage.c3v
    public final void onLocationChanged(Location location) {
        uk10 uk10Var = this.w;
        if (uk10Var != null) {
            uk10Var.onLocationChanged(location);
        }
    }
}
