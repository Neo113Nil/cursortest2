package org.altbeacon.beacon.service;

import java.io.Serializable;
import java.util.HashMap;
import org.altbeacon.beacon.Beacon;

/* loaded from: classes4.dex */
public class ExtraDataBeaconTracker implements Serializable {
    private final HashMap<String, HashMap<Integer, Beacon>> mBeaconsByKey;
    private final boolean matchBeaconsByServiceUUID;

    public ExtraDataBeaconTracker(boolean z) {
        this.mBeaconsByKey = new HashMap<>();
        this.matchBeaconsByServiceUUID = z;
    }

    public final String a(Beacon beacon) {
        if (!this.matchBeaconsByServiceUUID) {
            return beacon.getBluetoothAddress();
        }
        return beacon.getBluetoothAddress() + beacon.getServiceUuid();
    }

    public final Beacon b(Beacon beacon) {
        if (!beacon.isExtraBeaconData()) {
            String a = a(beacon);
            HashMap<Integer, Beacon> hashMap = this.mBeaconsByKey.get(a);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            } else {
                beacon.setExtraDataFields(hashMap.values().iterator().next().getExtraDataFields());
            }
            hashMap.put(Integer.valueOf(beacon.hashCode()), beacon);
            this.mBeaconsByKey.put(a, hashMap);
            return beacon;
        }
        HashMap<Integer, Beacon> hashMap2 = this.mBeaconsByKey.get(a(beacon));
        if (hashMap2 == null) {
            return null;
        }
        for (Beacon beacon2 : hashMap2.values()) {
            beacon2.setRssi(beacon.getRssi());
            beacon2.setExtraDataFields(beacon.getDataFields());
        }
        return null;
    }

    public ExtraDataBeaconTracker() {
        this(true);
    }
}
