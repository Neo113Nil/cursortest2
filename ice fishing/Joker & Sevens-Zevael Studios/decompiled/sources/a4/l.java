package a4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final v2.i f253a = new v2.i();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f254b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static p6.i f255c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? j.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static p6.i b() {
        p6.i iVar = new p6.i();
        f255c = iVar;
        v2.i iVar2 = f253a;
        iVar2.getClass();
        if (v2.h.f7203l.g(iVar2, null, iVar)) {
            v2.h.d(iVar2);
        }
        return f255c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, boolean z10) {
        boolean z11;
        k a6;
        k kVar;
        int i10;
        if (z10 || f255c == null) {
            synchronized (f254b) {
                if (!z10) {
                    if (f255c != null) {
                        return;
                    }
                }
                int i11 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z11 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z11 = false;
                }
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 28 && i12 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z12 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z13 = file2.exists() && length2 > 0;
                    try {
                        long a8 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a6 = k.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            a6 = null;
                        }
                        if (a6 != null && a6.f251c == a8 && (i10 = a6.f250b) != 2) {
                            i11 = i10;
                            if (z10 && z13 && i11 != 1) {
                                i11 = 2;
                            }
                            if (a6 != null && a6.f250b == 2 && i11 == 1 && length < a6.f252d) {
                                i11 = 3;
                            }
                            kVar = new k(1, i11, a8, length2);
                            if (a6 != null || !a6.equals(kVar)) {
                                kVar.b(file3);
                            }
                            b();
                            return;
                        }
                        if (z12) {
                            i11 = 1;
                        } else if (z13) {
                            i11 = 2;
                        }
                        if (z10) {
                            i11 = 2;
                        }
                        if (a6 != null) {
                            i11 = 3;
                        }
                        kVar = new k(1, i11, a8, length2);
                        if (a6 != null) {
                        }
                        kVar.b(file3);
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
