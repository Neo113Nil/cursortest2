package com.yandex.passport.internal.common;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import defpackage.btf;
import defpackage.etn;
import defpackage.jyr;
import defpackage.mlr;
import defpackage.n8g;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.z7o;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class f {
    public final Context a;
    public final jyr b;

    public f(Context context) {
        context.getClass();
        this.a = context;
        this.b = btf.b(new e(0, this));
    }

    public final g a() {
        Object t7oVar;
        Context context = this.a;
        boolean z = etn.z(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = etn.z(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (z || z2) {
            Object systemService = context.getSystemService(SSDPDeviceDescriptionParser.TAG_LOCATION);
            LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
            if (locationManager != null) {
                n8g b = t75.b();
                if (z) {
                    b.add("gps");
                }
                b.add("network");
                b.add("passive");
                for (String str : CollectionsKt.K(t75.a(b))) {
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = locationManager.getLastKnownLocation(str);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    if (t7oVar instanceof t7o) {
                        t7oVar = null;
                    }
                    Location location = (Location) t7oVar;
                    if (location != null) {
                        return new g(location.getLatitude(), location.getLongitude());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer b() {
        String networkOperator;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getValue();
        if (telephonyManager != null && (networkOperator = telephonyManager.getNetworkOperator()) != null) {
            if (networkOperator.length() >= 5) {
                for (int i = 0; i < networkOperator.length(); i++) {
                    if (Character.isDigit(networkOperator.charAt(i))) {
                    }
                }
                if (networkOperator != null) {
                    return StringsKt.toIntOrNull(mlr.K(3, networkOperator));
                }
            }
            networkOperator = null;
            if (networkOperator != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer c() {
        String networkOperator;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getValue();
        if (telephonyManager != null && (networkOperator = telephonyManager.getNetworkOperator()) != null) {
            if (networkOperator.length() >= 5) {
                for (int i = 0; i < networkOperator.length(); i++) {
                    if (Character.isDigit(networkOperator.charAt(i))) {
                    }
                }
                if (networkOperator != null) {
                    return StringsKt.toIntOrNull(mlr.E(3, networkOperator));
                }
            }
            networkOperator = null;
            if (networkOperator != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d() {
        Object t7oVar;
        String simCountryIso;
        Object systemService = this.a.getSystemService("phone");
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        try {
            r7o r7oVar = z7o.b;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (telephonyManager != null && (simCountryIso = telephonyManager.getSimCountryIso()) != null) {
            if (StringsKt.U(simCountryIso)) {
                simCountryIso = null;
            }
            if (simCountryIso != null) {
                t7oVar = simCountryIso.toUpperCase(Locale.ROOT);
                t7oVar.getClass();
                return (String) (t7oVar instanceof t7o ? null : t7oVar);
            }
        }
        t7oVar = null;
        return (String) (t7oVar instanceof t7o ? null : t7oVar);
    }
}
