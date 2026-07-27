package B1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f162e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f163f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f164g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile y f165h;

    /* renamed from: b, reason: collision with root package name */
    public int f167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f168c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f169d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f166a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f162e = i < 29;
        f163f = i >= 28;
        f164g = new File("/proc/self/fd");
    }

    public static y a() {
        if (f165h == null) {
            synchronized (y.class) {
                try {
                    if (f165h == null) {
                        f165h = new y();
                    }
                } finally {
                }
            }
        }
        return f165h;
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
        return this.f166a;
    }

    public final boolean c(int i, int i6, boolean z3, boolean z6) {
        boolean z9;
        if (z3) {
            if (f163f) {
                if (!f162e || this.f169d.get()) {
                    if (z6) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i6 >= 0) {
                        synchronized (this) {
                            try {
                                int i9 = this.f167b + 1;
                                this.f167b = i9;
                                if (i9 >= 50) {
                                    this.f167b = 0;
                                    int length = f164g.list().length;
                                    long b9 = b();
                                    boolean z10 = ((long) length) < b9;
                                    this.f168c = z10;
                                    if (!z10 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b9);
                                    }
                                }
                                z9 = this.f168c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z9) {
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
