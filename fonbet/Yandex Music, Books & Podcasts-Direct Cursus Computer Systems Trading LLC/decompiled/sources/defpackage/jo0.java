package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class jo0 {
    public static String a;
    public static int b;

    public static final long A(PackageInfo packageInfo) {
        packageInfo.getClass();
        return packageInfo.getLongVersionCode();
    }

    public static boolean B(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean C(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    public static boolean D(Context context) {
        ActivityManager b2;
        context.getClass();
        if (Build.VERSION.SDK_INT < 28 || (b2 = l1b.b(context)) == null) {
            return false;
        }
        return b2.isBackgroundRestricted();
    }

    public static final boolean E(Context context) {
        String str;
        context.getClass();
        String packageName = context.getApplicationContext().getPackageName();
        if (Build.VERSION.SDK_INT >= 28) {
            str = Application.getProcessName();
        } else {
            int myPid = Process.myPid();
            Object systemService = context.getApplicationContext().getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
            str = null;
        }
        return Intrinsics.d(packageName, str);
    }

    public static boolean F(Handler handler, t1a t1aVar, Map map, long j) {
        return handler.postDelayed(t1aVar, map, j);
    }

    public static void G(View view) {
        view.resetPivot();
    }

    public static void H(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void I(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static void J(int i, View view) {
        view.setOutlineAmbientShadowColor(i);
    }

    public static void K(xeu xeuVar, int i) {
        xeuVar.setOutlineAmbientShadowColor(i);
    }

    public static void L(int i, View view) {
        view.setOutlineSpotShadowColor(i);
    }

    public static void M(xeu xeuVar, int i) {
        xeuVar.setOutlineSpotShadowColor(i);
    }

    public static final void N(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static boolean O(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List a(Context context) {
        Signature[] signatureArr;
        String str;
        a40[] a40VarArr = a40.a;
        String packageName = context.getPackageName();
        packageName.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
            if (signingInfo == null) {
                signatureArr = new Signature[0];
                ArrayList arrayList = new ArrayList(signatureArr.length);
                for (Signature signature : signatureArr) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                        messageDigest.update(signature.toByteArray());
                        StringBuffer stringBuffer = new StringBuffer();
                        byte[] digest = messageDigest.digest();
                        digest.getClass();
                        for (byte b2 : digest) {
                            stringBuffer.append(String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b2)}, 1)));
                        }
                        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
                        str = stringBuffer.toString();
                        str.getClass();
                    } catch (NoSuchAlgorithmException unused) {
                        str = "Fail to find algorithm [SHA-1]";
                    }
                    arrayList.add(str);
                }
                List n0 = CollectionsKt.n0(arrayList);
                return n0 != null ? c5b.a : n0;
            }
            signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        } else {
            signatureArr = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        }
        if (signatureArr == null) {
            signatureArr = new Signature[0];
        }
        ArrayList arrayList2 = new ArrayList(signatureArr.length);
        while (r2 < r1) {
        }
        List n02 = CollectionsKt.n0(arrayList2);
        if (n02 != null) {
        }
    }

    public static boolean b(Context context) {
        context.getClass();
        return !l1b.h(context).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public static final void c(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static Typeface d(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler e(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler f(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler g(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Bitmap h(Picture picture) {
        return Bitmap.createBitmap(picture);
    }

    public static f1j i(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                jsg j = jsg.j();
                String str = f1j.b;
                String str2 = f1j.b;
                String o = hrg.o("Ignoring adding capability '", i, '\'');
                if (j.b <= 5) {
                    Log.w(str2, o, e);
                }
            }
        }
        int[] iArr3 = yd5.f;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!xz0.t(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    jsg j2 = jsg.j();
                    String str3 = f1j.b;
                    String str4 = f1j.b;
                    String o2 = hrg.o("Ignoring removing default capability '", i3, '\'');
                    if (j2.b <= 5) {
                        Log.w(str4, o2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new f1j(build);
    }

    public static Intent j(Context context) {
        Object obj;
        context.getClass();
        boolean b2 = b(context);
        boolean z = l1b.d(context).getRestrictBackgroundStatus() == 3;
        Uri parse = Uri.parse("package:" + context.getPackageName());
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS", parse);
        if (!b2) {
            intent = null;
        }
        Intent intent2 = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        if (!b2) {
            intent2 = null;
        }
        Intent intent3 = new Intent("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS", parse);
        if (!z) {
            intent3 = null;
        }
        Iterator it = xz0.w(new Intent[]{intent, intent2, intent3, new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", parse)}).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities((Intent) obj, 0);
            queryIntentActivities.getClass();
            if (!queryIntentActivities.isEmpty()) {
                break;
            }
        }
        Intent intent4 = (Intent) obj;
        if (intent4 == null) {
            return null;
        }
        intent4.addFlags(268435456);
        return intent4;
    }

    public static String[] k(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long l(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor m(Context context) {
        return context.getMainExecutor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r3 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String n() {
        BufferedReader bufferedReader;
        if (a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                a = Application.getProcessName();
            } else {
                int i = b;
                if (i == 0) {
                    i = Process.myPid();
                    b = i;
                }
                String str = null;
                str = null;
                str = null;
                BufferedReader bufferedReader2 = null;
                if (i > 0) {
                    try {
                        String str2 = "/proc/" + i + "/cmdline";
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str2));
                            try {
                                String readLine = bufferedReader.readLine();
                                y1g.G(readLine);
                                str = readLine.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException unused3) {
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                }
                a = str;
            }
        }
        return a;
    }

    public static void o(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String p() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int q(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String r(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int s(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int t(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int u(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int v(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int w(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params x(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static int y(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri z(Object obj) {
        return ((Icon) obj).getUri();
    }
}
