package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class js0 {
    public static final ou0 GWasM1elztuh = new ou0();
    public static final Object Yi7zF1RB1 = new Object();
    public static vt X1lG3V04pd = null;

    public static long GWasM1elztuh(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? Qd9Q8OZgvOo4.GWasM1elztuh(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X1lG3V04pd(Context context, boolean z) {
        boolean z2;
        is0 GWasM1elztuh2;
        is0 is0Var;
        int i;
        if (z || X1lG3V04pd == null) {
            synchronized (Yi7zF1RB1) {
                if (!z) {
                    if (X1lG3V04pd != null) {
                        return;
                    }
                }
                int i2 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z2 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z2 = false;
                }
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 28 && i3 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z3 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z4 = file2.exists() && length2 > 0;
                    try {
                        long GWasM1elztuh3 = GWasM1elztuh(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                GWasM1elztuh2 = is0.GWasM1elztuh(file3);
                            } catch (IOException unused2) {
                                Yi7zF1RB1();
                                return;
                            }
                        } else {
                            GWasM1elztuh2 = null;
                        }
                        if (GWasM1elztuh2 != null && GWasM1elztuh2.X1lG3V04pd == GWasM1elztuh3 && (i = GWasM1elztuh2.Yi7zF1RB1) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (GWasM1elztuh2 != null && GWasM1elztuh2.Yi7zF1RB1 == 2 && i2 == 1 && length < GWasM1elztuh2.xqGvceK5x) {
                                i2 = 3;
                            }
                            is0Var = new is0(1, i2, GWasM1elztuh3, length2);
                            if (GWasM1elztuh2 != null || !GWasM1elztuh2.equals(is0Var)) {
                                is0Var.Yi7zF1RB1(file3);
                            }
                            Yi7zF1RB1();
                            return;
                        }
                        if (z3) {
                            i2 = 1;
                        } else if (z4) {
                            i2 = 2;
                        }
                        if (z) {
                            i2 = 2;
                        }
                        if (GWasM1elztuh2 != null) {
                            i2 = 3;
                        }
                        is0Var = new is0(1, i2, GWasM1elztuh3, length2);
                        if (GWasM1elztuh2 != null) {
                        }
                        is0Var.Yi7zF1RB1(file3);
                        Yi7zF1RB1();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        Yi7zF1RB1();
                        return;
                    }
                }
                Yi7zF1RB1();
            }
        }
    }

    public static vt Yi7zF1RB1() {
        vt vtVar = new vt(22);
        X1lG3V04pd = vtVar;
        ou0 ou0Var = GWasM1elztuh;
        ou0Var.getClass();
        if (HFYAaqMd6.JFJ3QoxA.uFEq9NpZ(ou0Var, null, vtVar)) {
            HFYAaqMd6.Yi7zF1RB1(ou0Var);
        }
        return X1lG3V04pd;
    }
}
