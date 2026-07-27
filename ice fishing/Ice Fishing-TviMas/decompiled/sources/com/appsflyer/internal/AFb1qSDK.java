package com.appsflyer.internal;

import android.adservices.measurement.MeasurementManager;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class AFb1qSDK {
    public static boolean c_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean AFAdRevenueData(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return ((MeasurementManager) context.getApplicationContext().getSystemService(MeasurementManager.class)) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }

    public static boolean getMonetizationNetwork(Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getRevenue(Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean getRevenue(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        AFLogger.afRDLog(new StringBuilder("is Permission Available: ").append(str).append("; res: ").append(checkPermission).toString());
        return checkPermission == 0;
    }

    public static boolean getMediationNetwork() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r2.equals("c") != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map<String, String> d_(Context context, Map<String, String> map, Uri uri) {
        Iterator<String> it = uri.getQueryParameterNames().iterator();
        while (true) {
            char c = 0;
            String str = "media_source";
            if (it.hasNext()) {
                String next = it.next();
                String queryParameter = uri.getQueryParameter(next);
                if (!map.containsKey(next)) {
                    int hashCode = next.hashCode();
                    if (hashCode == -1420799080) {
                        if (next.equals("af_prt")) {
                            c = 2;
                            if (c != 0) {
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    } else if (hashCode != 99) {
                        if (hashCode == 110987 && next.equals("pid")) {
                            c = 1;
                            if (c != 0) {
                                str = Constants.ScionAnalytics.PARAM_CAMPAIGN;
                            } else if (c != 1) {
                                if (c == 2) {
                                    str = "agency";
                                }
                            }
                        }
                        c = 65535;
                        if (c != 0) {
                        }
                    }
                    map.put(str, queryParameter);
                }
                str = next;
                map.put(str, queryParameter);
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
                }
            }
        }
        if (!map.containsKey("install_time")) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("install_time", simpleDateFormat.format(new Date(j)));
        }
        if (map.containsKey("af_deeplink") && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (map.containsKey("agency")) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }

    public static String e_(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static long AFAdRevenueData(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static String getMediationNetwork(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public static Application f_(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }
}
