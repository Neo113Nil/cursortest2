package com.squareup.cash.gps.backend.real;

import android.app.Application;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiSsid;
import android.os.Build;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.protos.cash.compass.api.WifiScanResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class RealNetworkEnvironmentCollector {
    public final Application context;
    public final ErrorReporter errorReporter;
    public final PermissionChecker permissionChecker;

    public final class Companion {
        public static final WifiScanResult access$toWifiScanResult(ScanResult scanResult) {
            String removeSuffix;
            String wifiSsid;
            String str = null;
            if (Build.VERSION.SDK_INT >= 33) {
                WifiSsid wifiSsid2 = scanResult.getWifiSsid();
                if (wifiSsid2 != null && (wifiSsid = wifiSsid2.toString()) != null) {
                    removeSuffix = StringsKt.removeSuffix(StringsKt.removePrefix("\"", wifiSsid), "\"");
                }
                removeSuffix = null;
            } else {
                String str2 = scanResult.SSID;
                if (str2 != null) {
                    removeSuffix = StringsKt.removeSuffix(StringsKt.removePrefix("\"", str2), "\"");
                }
                removeSuffix = null;
            }
            if (removeSuffix == null || StringsKt.isBlank(removeSuffix) || removeSuffix.equals("<unknown ssid>")) {
                return null;
            }
            String str3 = scanResult.BSSID;
            if (str3 != null && !str3.equals("02:00:00:00:00:00")) {
                str = str3;
            }
            return new WifiScanResult(removeSuffix, str, Integer.valueOf(scanResult.level), Integer.valueOf(scanResult.frequency));
        }
    }

    public RealNetworkEnvironmentCollector(Application application, PermissionChecker permissionChecker, ErrorReporter errorReporter) {
        permissionChecker.getClass();
        errorReporter.getClass();
        this.context = application;
        this.permissionChecker = permissionChecker;
        this.errorReporter = errorReporter;
    }

    public final List getAvailableNetworks() {
        Object systemService = this.context.getApplicationContext().getSystemService("wifi");
        systemService.getClass();
        try {
            List<ScanResult> scanResults = ((WifiManager) systemService).getScanResults();
            if (scanResults == null) {
                return EmptyList.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (ScanResult scanResult : scanResults) {
                scanResult.getClass();
                WifiScanResult access$toWifiScanResult = Companion.access$toWifiScanResult(scanResult);
                if (access$toWifiScanResult != null) {
                    arrayList.add(access$toWifiScanResult);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((WifiScanResult) next).bssid)) {
                    arrayList2.add(next);
                }
            }
            return arrayList2;
        } catch (SecurityException unused) {
            return EmptyList.INSTANCE;
        }
    }
}
