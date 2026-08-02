package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class HardwareConfigState {
    public static final File FD_SIZE_LIST = new File("/proc/self/fd");
    public static volatile HardwareConfigState instance;
    public int decodesSinceLastFdCheck;
    public boolean isFdSizeBelowHardwareLimit = true;
    public final int sdkBasedMaxFdCount;

    public HardwareConfigState() {
        new AtomicBoolean(false);
        this.sdkBasedMaxFdCount = 20000;
    }

    public static HardwareConfigState getInstance() {
        if (instance == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (instance == null) {
                        instance = new HardwareConfigState();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public final boolean isHardwareConfigAllowed(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (z2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                    return false;
                }
            } else if (i >= 0 && i2 >= 0) {
                synchronized (this) {
                    try {
                        int i3 = this.decodesSinceLastFdCheck + 1;
                        this.decodesSinceLastFdCheck = i3;
                        if (i3 >= 50) {
                            this.decodesSinceLastFdCheck = 0;
                            int length = FD_SIZE_LIST.list().length;
                            long j = this.sdkBasedMaxFdCount;
                            boolean z4 = ((long) length) < j;
                            this.isFdSizeBelowHardwareLimit = z4;
                            if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + j);
                            }
                        }
                        z3 = this.isFdSizeBelowHardwareLimit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z3) {
                    return true;
                }
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
