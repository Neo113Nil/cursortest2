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
    public static final l f40327a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f40328b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static a4.e f40329c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static a4.e b() {
        a4.e eVar = new a4.e();
        f40329c = eVar;
        f40327a.j(eVar);
        return f40329c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z3) {
        boolean z6;
        g a9;
        g gVar;
        int i;
        if (z3 || f40329c == null) {
            synchronized (f40328b) {
                if (!z3) {
                    if (f40329c != null) {
                        return;
                    }
                }
                int i6 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z6 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z6 = false;
                }
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z9 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z10 = file2.exists() && length2 > 0;
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
                        if (a9 != null && a9.f40325c == a10 && (i = a9.f40324b) != 2) {
                            i6 = i;
                            if (z3 && z10 && i6 != 1) {
                                i6 = 2;
                            }
                            if (a9 != null && a9.f40324b == 2 && i6 == 1 && length < a9.f40326d) {
                                i6 = 3;
                            }
                            gVar = new g(a10, length2, 1, i6);
                            if (a9 != null || !a9.equals(gVar)) {
                                gVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z9) {
                            i6 = 1;
                        } else if (z10) {
                            i6 = 2;
                        }
                        if (z3) {
                            i6 = 2;
                        }
                        if (a9 != null) {
                            i6 = 3;
                        }
                        gVar = new g(a10, length2, 1, i6);
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
