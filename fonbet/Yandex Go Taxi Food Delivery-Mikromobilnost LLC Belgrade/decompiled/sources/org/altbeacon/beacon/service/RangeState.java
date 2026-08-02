package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.altbeacon.beacon.Beacon;

/* loaded from: classes4.dex */
public class RangeState implements Serializable {
    public static boolean a;
    private Callback mCallback;
    private Map<Beacon, RangedBeacon> mRangedBeacons = new HashMap();

    public RangeState(Callback callback) {
        this.mCallback = callback;
    }

    public final void a(Beacon beacon) {
        RangedBeacon rangedBeacon = this.mRangedBeacons.get(beacon);
        if (rangedBeacon != null) {
            rangedBeacon.g(beacon);
        } else {
            this.mRangedBeacons.put(beacon, new RangedBeacon(beacon));
        }
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        arrayList = new ArrayList();
        synchronized (this.mRangedBeacons) {
            try {
                for (Beacon beacon : this.mRangedBeacons.keySet()) {
                    RangedBeacon rangedBeacon = this.mRangedBeacons.get(beacon);
                    if (rangedBeacon != null) {
                        if (rangedBeacon.c()) {
                            rangedBeacon.a();
                            if (!(rangedBeacon.b().a.size() == 0)) {
                                arrayList.add(rangedBeacon.mBeacon);
                            }
                        }
                        if (!(rangedBeacon.b().a.size() == 0)) {
                            if (!a || SystemClock.elapsedRealtime() - rangedBeacon.lastTrackedTimeMillis > 5000) {
                                rangedBeacon.f();
                            }
                            hashMap.put(beacon, rangedBeacon);
                        }
                    }
                }
                this.mRangedBeacons = hashMap;
            } finally {
            }
        }
        return arrayList;
    }

    public final Callback c() {
        return this.mCallback;
    }
}
