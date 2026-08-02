package r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import t.l;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final l f40138a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f40139b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static G3.e f40140c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static G3.e b() {
        G3.e eVar = new G3.e(24);
        f40140c = eVar;
        f40138a.j(eVar);
        return f40140c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z6) {
        boolean z9;
        g a9;
        g gVar;
        int i;
        if (z6 || f40140c == null) {
            synchronized (f40139b) {
                if (!z6) {
                    if (f40140c != null) {
                        return;
                    }
                }
                int i4 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z9 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z9 = false;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 28 && i6 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z10 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z11 = file2.exists() && length2 > 0;
                    try {
                        long a10 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a9 = g.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a9 = null;
                        }
                        if (a9 != null && a9.f40136c == a10 && (i = a9.f40135b) != 2) {
                            i4 = i;
                            if (z6 && z11 && i4 != 1) {
                                i4 = 2;
                            }
                            if (a9 != null && a9.f40135b == 2 && i4 == 1 && length < a9.f40137d) {
                                i4 = 3;
                            }
                            gVar = new g(a10, length2, 1, i4);
                            if (a9 != null || !a9.equals(gVar)) {
                                gVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z10) {
                            i4 = 1;
                        } else if (z11) {
                            i4 = 2;
                        }
                        if (z6) {
                            i4 = 2;
                        }
                        if (a9 != null) {
                            i4 = 3;
                        }
                        gVar = new g(a10, length2, 1, i4);
                        if (a9 != null) {
                        }
                        gVar.b(file3);
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
