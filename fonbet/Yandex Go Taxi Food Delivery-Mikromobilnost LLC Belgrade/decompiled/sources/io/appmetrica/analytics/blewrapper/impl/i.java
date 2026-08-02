package io.appmetrica.analytics.blewrapper.impl;

import android.bluetooth.le.ScanSettings;
import defpackage.w511;
import io.appmetrica.analytics.blewrapper.internal.config.ScanSettingsConfig;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u000e\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¨\u0006\u0011"}, d2 = {"Lio/appmetrica/analytics/blewrapper/impl/i;", "", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$ScanMode;", "scanMode", "", "a", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$CallbackType;", "callbackType", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$MatchMode;", "matchMode", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig$NumOfMatches;", "numOfMatches", "Lio/appmetrica/analytics/blewrapper/internal/config/ScanSettingsConfig;", ConfigConstants.CONFIG, "Landroid/bluetooth/le/ScanSettings;", "<init>", "()V", "ble-wrapper_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class i {
    public final ScanSettings a(ScanSettingsConfig config) {
        ScanSettings.Builder builder = new ScanSettings.Builder();
        ScanSettingsConfig.ScanMode scanMode = config.getScanMode();
        if (scanMode != null) {
            builder.setScanMode(a(scanMode));
        }
        ScanSettingsConfig.CallbackType callbackType = config.getCallbackType();
        if (callbackType != null) {
            builder.setCallbackType(a(callbackType));
        }
        ScanSettingsConfig.MatchMode matchMode = config.getMatchMode();
        if (matchMode != null) {
            builder.setMatchMode(a(matchMode));
        }
        ScanSettingsConfig.NumOfMatches numOfMatches = config.getNumOfMatches();
        if (numOfMatches != null) {
            builder.setNumOfMatches(a(numOfMatches));
        }
        builder.setReportDelay(config.getReportDelay());
        return builder.build();
    }

    private final int a(ScanSettingsConfig.ScanMode scanMode) {
        int i = h.a[scanMode.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        w511.b();
        return 0;
    }

    private final int a(ScanSettingsConfig.CallbackType callbackType) {
        int i = h.b[callbackType.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 1;
        }
        w511.b();
        return 0;
    }

    private final int a(ScanSettingsConfig.MatchMode matchMode) {
        int i = h.c[matchMode.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        w511.b();
        return 0;
    }

    private final int a(ScanSettingsConfig.NumOfMatches numOfMatches) {
        int i = h.d[numOfMatches.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 3;
                }
                w511.b();
                return 0;
            }
        }
        return i2;
    }
}
