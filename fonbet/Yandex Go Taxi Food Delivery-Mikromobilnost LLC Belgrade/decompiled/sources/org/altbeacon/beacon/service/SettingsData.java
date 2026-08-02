package org.altbeacon.beacon.service;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.b;

/* loaded from: classes4.dex */
public class SettingsData implements Serializable {
    Boolean mAndroidLScanningDisabled;
    ArrayList<BeaconParser> mBeaconParsers;
    Boolean mHardwareEqualityEnforced;
    Long mRegionExitPeriod;
    Boolean mRegionStatePersistenceEnabled;
    Boolean mUseTrackingCache;

    public final void a(Context context) {
        b j = b.j(context);
        this.mBeaconParsers = new ArrayList<>(j.i);
        this.mRegionStatePersistenceEnabled = Boolean.valueOf(j.j);
        this.mAndroidLScanningDisabled = Boolean.valueOf(b.C);
        this.mRegionExitPeriod = Long.valueOf(b.E);
        this.mUseTrackingCache = Boolean.valueOf(RangeState.a);
        this.mHardwareEqualityEnforced = Boolean.valueOf(Beacon.getHardwareEqualityEnforced());
    }
}
