package B1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f127e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f128f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f129g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile x f130h;

    /* renamed from: b, reason: collision with root package name */
    public int f132b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f133c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f134d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f131a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f127e = i < 29;
        f128f = i >= 28;
        f129g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f130h == null) {
            synchronized (x.class) {
                try {
                    if (f130h == null) {
                        f130h = new x();
                    }
                } finally {
                }
            }
        }
        return f130h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f131a;
    }

    public final boolean c(int i, int i4, boolean z8, boolean z9) {
        boolean z10;
        if (z8) {
            if (f128f) {
                if (!f127e || this.f134d.get()) {
                    if (z9) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i4 >= 0) {
                        synchronized (this) {
                            try {
                                int i9 = this.f132b + 1;
                                this.f132b = i9;
                                if (i9 >= 50) {
                                    this.f132b = 0;
                                    int length = f129g.list().length;
                                    long b9 = b();
                                    boolean z11 = ((long) length) < b9;
                                    this.f133c = z11;
                                    if (!z11 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b9);
                                    }
                                }
                                z10 = this.f133c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z10) {
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
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
