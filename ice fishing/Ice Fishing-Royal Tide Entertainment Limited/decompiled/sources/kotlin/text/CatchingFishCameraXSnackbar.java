package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class CatchingFishCameraXSnackbar {
    public static final CatchingFishServiceLayout CatchingFishParcelableFAB = new CatchingFishServiceLayout();
    public static final Object CatchingFishSnackbar = new Object();
    public static CatchingFishMVPExoPlayer CatchingFishCoroutine = null;

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void CatchingFishCoroutine(Context context, boolean z) {
        boolean z2;
        CatchingFishFragmentMVI CatchingFishParcelableFAB2;
        CatchingFishFragmentMVI catchingFishFragmentMVI;
        int i;
        if (z || CatchingFishCoroutine == null) {
            synchronized (CatchingFishSnackbar) {
                if (!z) {
                    if (CatchingFishCoroutine != null) {
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
                        long CatchingFishParcelableFAB3 = CatchingFishParcelableFAB(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                CatchingFishParcelableFAB2 = CatchingFishFragmentMVI.CatchingFishParcelableFAB(file3);
                            } catch (IOException unused2) {
                                CatchingFishSnackbar();
                                return;
                            }
                        } else {
                            CatchingFishParcelableFAB2 = null;
                        }
                        if (CatchingFishParcelableFAB2 != null && CatchingFishParcelableFAB2.CatchingFishCoroutine == CatchingFishParcelableFAB3 && (i = CatchingFishParcelableFAB2.CatchingFishSnackbar) != 2) {
                            i2 = i;
                            if (z && z4 && i2 != 1) {
                                i2 = 2;
                            }
                            if (CatchingFishParcelableFAB2 != null && CatchingFishParcelableFAB2.CatchingFishSnackbar == 2 && i2 == 1 && length < CatchingFishParcelableFAB2.CatchingFishReduxKtor) {
                                i2 = 3;
                            }
                            catchingFishFragmentMVI = new CatchingFishFragmentMVI(1, i2, CatchingFishParcelableFAB3, length2);
                            if (CatchingFishParcelableFAB2 != null || !CatchingFishParcelableFAB2.equals(catchingFishFragmentMVI)) {
                                catchingFishFragmentMVI.CatchingFishSnackbar(file3);
                            }
                            CatchingFishSnackbar();
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
                        if (CatchingFishParcelableFAB2 != null) {
                            i2 = 3;
                        }
                        catchingFishFragmentMVI = new CatchingFishFragmentMVI(1, i2, CatchingFishParcelableFAB3, length2);
                        if (CatchingFishParcelableFAB2 != null) {
                        }
                        catchingFishFragmentMVI.CatchingFishSnackbar(file3);
                        CatchingFishSnackbar();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        CatchingFishSnackbar();
                        return;
                    }
                }
                CatchingFishSnackbar();
            }
        }
    }

    public static long CatchingFishParcelableFAB(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? CatchingFishJobScheduler.CatchingFishParcelableFAB(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static CatchingFishMVPExoPlayer CatchingFishSnackbar() {
        CatchingFishMVPExoPlayer catchingFishMVPExoPlayer = new CatchingFishMVPExoPlayer(25);
        CatchingFishCoroutine = catchingFishMVPExoPlayer;
        CatchingFishServiceLayout catchingFishServiceLayout = CatchingFishParcelableFAB;
        catchingFishServiceLayout.getClass();
        if (CatchingFishAsyncTask.CatchingFishLayout.CatchingFishEspressoTesting(catchingFishServiceLayout, null, catchingFishMVPExoPlayer)) {
            CatchingFishAsyncTask.CatchingFishCoroutine(catchingFishServiceLayout);
        }
        return CatchingFishCoroutine;
    }
}
