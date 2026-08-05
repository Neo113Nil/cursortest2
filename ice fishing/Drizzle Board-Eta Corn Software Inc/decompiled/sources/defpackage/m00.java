package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class m00 {
    public static final c30 qoPGr6Ce = new c30();
    public static final Object NCTxEWno = new Object();
    public static k00 MdtA4re8 = null;

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void MdtA4re8(Context context, boolean z) {
        boolean z2;
        l00 qoPGr6Ce2;
        l00 l00Var;
        int i;
        if (z || MdtA4re8 == null) {
            synchronized (NCTxEWno) {
                if (!z) {
                    if (MdtA4re8 != null) {
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
                        long qoPGr6Ce3 = qoPGr6Ce(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                qoPGr6Ce2 = l00.qoPGr6Ce(file3);
                            } catch (IOException unused2) {
                                NCTxEWno();
                                return;
                            }
                        } else {
                            qoPGr6Ce2 = null;
                        }
                        if (qoPGr6Ce2 != null && qoPGr6Ce2.MdtA4re8 == qoPGr6Ce3 && (i = qoPGr6Ce2.NCTxEWno) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (qoPGr6Ce2 != null && qoPGr6Ce2.NCTxEWno == 2 && i2 == 1 && length < qoPGr6Ce2.wxUZMvaN) {
                                i2 = 3;
                            }
                            l00Var = new l00(1, i2, qoPGr6Ce3, length2);
                            if (qoPGr6Ce2 != null || !qoPGr6Ce2.equals(l00Var)) {
                                l00Var.NCTxEWno(file3);
                            }
                            NCTxEWno();
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
                        if (qoPGr6Ce2 != null) {
                            i2 = 3;
                        }
                        l00Var = new l00(1, i2, qoPGr6Ce3, length2);
                        if (qoPGr6Ce2 != null) {
                        }
                        l00Var.NCTxEWno(file3);
                        NCTxEWno();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        NCTxEWno();
                        return;
                    }
                }
                NCTxEWno();
            }
        }
    }

    public static k00 NCTxEWno() {
        k00 k00Var = new k00(1);
        MdtA4re8 = k00Var;
        c30 c30Var = qoPGr6Ce;
        c30Var.getClass();
        if (WYNAV5pd.b2ZJblxo.jb9XjC4I(c30Var, null, k00Var)) {
            WYNAV5pd.NCTxEWno(c30Var);
        }
        return MdtA4re8;
    }

    public static long qoPGr6Ce(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? fVMzMhyS.qoPGr6Ce(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }
}
