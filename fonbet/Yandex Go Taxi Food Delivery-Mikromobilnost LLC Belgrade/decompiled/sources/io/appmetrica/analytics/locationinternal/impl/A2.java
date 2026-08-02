package io.appmetrica.analytics.locationinternal.impl;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import defpackage.cvu0;
import defpackage.xfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeOffsetProvider;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes9.dex */
public final class A2 implements CachedDataProvider, ILastKnownUpdater, J0 {
    public static final z2 h = new z2();
    public final ServiceContext a;
    public final WifiManager b;
    public final SystemTimeOffsetProvider c;
    public final PermissionResolutionStrategy d;
    public final D2 e;
    public C0933c f;
    public boolean g;

    public A2(ServiceContext serviceContext) {
        this.a = serviceContext;
        Object systemService = serviceContext.getContext().getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI);
        this.b = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        this.c = new SystemTimeOffsetProvider();
        this.d = new E2(serviceContext.getLocationServiceApi().getPermissionExtractor()).a();
        this.e = new D2();
    }

    public static final WifiInfo a(WifiManager wifiManager) {
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (connectionInfo == null || "00:00:00:00:00:00".equals(connectionInfo.getBSSID()) || "02:00:00:00:00:00".equals(connectionInfo.getBSSID()) || connectionInfo.getIpAddress() == 0) {
            return null;
        }
        return connectionInfo;
    }

    public final WifiInfo b() {
        return (WifiInfo) SystemServiceUtils.accessSystemServiceSafely(this.b, "getting connection info", "WifiManager", new xfo(4));
    }

    public final List c() {
        return (List) SystemServiceUtils.accessSystemServiceSafely(this.b, "getting scan results", "WifiManager", new xfo(3));
    }

    public final D2 d() {
        return this.e;
    }

    public final boolean e() {
        if (this.a.getLocationServiceApi().getPermissionExtractor().hasPermission(this.a.getContext(), "android.permission.ACCESS_WIFI_STATE")) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.b, "getting wifi enabled state", "WifiManager", Boolean.FALSE, new xfo(2))).booleanValue();
        }
        return false;
    }

    public final synchronized List<w2> f() {
        if (e()) {
            return g();
        }
        return EmptyList.a;
    }

    public final synchronized List g() {
        String upperCase;
        boolean z;
        String str;
        boolean z2;
        String str2;
        String upperCase2;
        try {
            List list = EmptyList.a;
            C0933c c0933c = this.f;
            if (c0933c == null) {
                return list;
            }
            boolean hasNecessaryPermissions = this.d.hasNecessaryPermissions(this.a.getContext());
            boolean z3 = c0933c.c.b;
            if (this.g) {
                List<ScanResult> c = (z3 && hasNecessaryPermissions) ? c() : null;
                WifiInfo b = (c0933c.c.c && this.a.getLocationServiceApi().getPermissionExtractor().hasPermission(this.a.getContext(), "android.permission.ACCESS_WIFI_STATE")) ? b() : null;
                String bssid = b != null ? b.getBSSID() : null;
                ArrayList arrayList = new ArrayList((c != null ? c.size() : 0) + (b == null ? 0 : 1));
                if (!CollectionUtils.isNullOrEmpty(c)) {
                    for (ScanResult scanResult : c) {
                        if (!"02:00:00:00:00:00".equals(scanResult.BSSID)) {
                            try {
                                str2 = scanResult.BSSID;
                            } catch (NoSuchFieldError unused) {
                                z = false;
                            }
                            if (str2 != null) {
                                z = str2.equals(bssid);
                                try {
                                    upperCase2 = str2.toUpperCase(Locale.US);
                                } catch (NoSuchFieldError unused2) {
                                }
                                if (upperCase2 != null) {
                                    str = cvu0.v(upperCase2, ":", "", false);
                                    z2 = z;
                                    arrayList.add(new w2(str, scanResult.SSID, z2, scanResult.level, Long.valueOf(this.c.elapsedRealtimeOffsetInSeconds(scanResult.timestamp, TimeUnit.MICROSECONDS))));
                                }
                                str = null;
                                z2 = z;
                                arrayList.add(new w2(str, scanResult.SSID, z2, scanResult.level, Long.valueOf(this.c.elapsedRealtimeOffsetInSeconds(scanResult.timestamp, TimeUnit.MICROSECONDS))));
                            } else {
                                str = null;
                                z2 = false;
                                arrayList.add(new w2(str, scanResult.SSID, z2, scanResult.level, Long.valueOf(this.c.elapsedRealtimeOffsetInSeconds(scanResult.timestamp, TimeUnit.MICROSECONDS))));
                            }
                        }
                    }
                } else if (b != null) {
                    String v = (bssid == null || (upperCase = bssid.toUpperCase(Locale.US)) == null) ? null : cvu0.v(upperCase, ":", "", false);
                    String ssid = b.getSSID();
                    arrayList.add(new w2(v, ssid != null ? cvu0.v(ssid, "\"", "", false) : null, true, b.getRssi(), 0L));
                }
                list = CollectionUtils.unmodifiableListCopy(arrayList);
            }
            return list;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater
    public final synchronized void updateLastKnown() {
        if (!CollectionUtils.isNullOrEmpty(f())) {
            this.e.updateData(f());
        }
    }

    public static final List b(WifiManager wifiManager) {
        return kotlin.collections.a.M(wifiManager.getScanResults());
    }

    public static final Boolean c(WifiManager wifiManager) {
        return Boolean.valueOf(wifiManager.isWifiEnabled());
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.J0
    public final void a(C0933c c0933c) {
        this.f = c0933c;
    }

    public final synchronized void a(LocationConfig locationConfig) {
        long j = locationConfig.getCacheControl().b;
        this.e.updateCacheControl(j, 2 * j);
    }

    public final synchronized void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (z) {
                updateLastKnown();
            }
        }
    }
}
