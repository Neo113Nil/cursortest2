package D1;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f575e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f576f;

    /* renamed from: g, reason: collision with root package name */
    public static final File f577g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile x f578h;

    /* renamed from: b, reason: collision with root package name */
    public int f580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f581c = true;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f582d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f579a = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        f575e = i < 29;
        f576f = i >= 28;
        f577g = new File("/proc/self/fd");
    }

    public static x a() {
        if (f578h == null) {
            synchronized (x.class) {
                try {
                    if (f578h == null) {
                        f578h = new x();
                    }
                } finally {
                }
            }
        }
        return f578h;
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
        return this.f579a;
    }

    public final boolean c(int i, int i4, boolean z6, boolean z9) {
        boolean z10;
        if (z6) {
            if (f576f) {
                if (!f575e || this.f582d.get()) {
                    if (z9) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i4 >= 0) {
                        synchronized (this) {
                            try {
                                int i6 = this.f580b + 1;
                                this.f580b = i6;
                                if (i6 >= 50) {
                                    this.f580b = 0;
                                    int length = f577g.list().length;
                                    long b9 = b();
                                    boolean z11 = ((long) length) < b9;
                                    this.f581c = z11;
                                    if (!z11 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b9);
                                    }
                                }
                                z10 = this.f581c;
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
