package org.altbeacon.beacon.service;

import android.os.SystemClock;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.ukl0;
import defpackage.vkl0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.altbeacon.beacon.Beacon;

/* loaded from: classes4.dex */
public class RangedBeacon implements Serializable {
    Beacon mBeacon;
    private boolean mTracked = true;
    protected long lastTrackedTimeMillis = 0;
    public transient vkl0 a = null;
    private int packetCount = 0;
    private long firstCycleDetectionTimestamp = 0;
    private long lastCycleDetectionTimestamp = 0;

    public RangedBeacon(Beacon beacon) {
        g(beacon);
    }

    public final void a() {
        int i;
        if (b().a.size() != 0) {
            vkl0 b = b();
            synchronized (b) {
                try {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = b.a.iterator();
                    while (it.hasNext()) {
                        ukl0 ukl0Var = (ukl0) it.next();
                        if (SystemClock.elapsedRealtime() - ukl0Var.b < DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT) {
                            arrayList.add(ukl0Var);
                        }
                    }
                    b.a = arrayList;
                    Collections.sort(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = b.a.size();
            int i2 = size - 1;
            if (size > 2) {
                int i3 = size / 10;
                i = i3 + 1;
                i2 = (size - i3) - 2;
            } else {
                i = 0;
            }
            double d = 0.0d;
            for (int i4 = i; i4 <= i2; i4++) {
                d += ((ukl0) b.a.get(i4)).a.intValue();
            }
            this.mBeacon.setRunningAverageRssi(d / ((i2 - i) + 1));
            this.mBeacon.setRssiMeasurementCount(b().a.size());
        }
        this.mBeacon.setPacketCount(this.packetCount);
        this.mBeacon.setFirstCycleDetectionTimestamp(this.firstCycleDetectionTimestamp);
        this.mBeacon.setLastCycleDetectionTimestamp(this.lastCycleDetectionTimestamp);
        this.packetCount = 0;
        this.firstCycleDetectionTimestamp = 0L;
        this.lastCycleDetectionTimestamp = 0L;
    }

    public final vkl0 b() {
        if (this.a == null) {
            this.a = new vkl0();
        }
        return this.a;
    }

    public final boolean c() {
        return this.mTracked;
    }

    public final void f() {
        this.mTracked = false;
    }

    public final void g(Beacon beacon) {
        this.packetCount++;
        this.mBeacon = beacon;
        if (this.firstCycleDetectionTimestamp == 0) {
            this.firstCycleDetectionTimestamp = beacon.getFirstCycleDetectionTimestamp();
        }
        this.lastCycleDetectionTimestamp = beacon.getLastCycleDetectionTimestamp();
        int rssi = this.mBeacon.getRssi();
        Integer valueOf = Integer.valueOf(rssi);
        if (rssi != 127) {
            this.mTracked = true;
            this.lastTrackedTimeMillis = SystemClock.elapsedRealtime();
            vkl0 b = b();
            b.getClass();
            ukl0 ukl0Var = new ukl0();
            ukl0Var.a = valueOf;
            ukl0Var.b = SystemClock.elapsedRealtime();
            b.a.add(ukl0Var);
        }
    }
}
