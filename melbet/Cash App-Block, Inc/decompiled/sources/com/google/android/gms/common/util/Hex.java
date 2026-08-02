package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import coil3.request.ViewTargetDisposable;
import com.bugsnag.android.internal.dag.ContextModule;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public abstract class Hex {
    public static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void addDynamiteErrorToDropBox(Context context, Throwable th) {
        try {
            zzae.checkNotNull(context);
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = zzb;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String bytesToStringUppercase(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = zza;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean contains(Object[] objArr, Feature feature) {
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!zzae.equal(objArr[i], feature)) {
                i++;
            } else if (i >= 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] getPackageCertificateHashBytes(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(64, str);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i = 0;
            while (true) {
                if (i >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean isGooglePlayServicesUid(Context context, int i) {
        if (uidHasPackageName(context, i, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                ViewTargetDisposable viewTargetDisposable = ViewTargetDisposable.getInstance(context);
                viewTargetDisposable.getClass();
                if (packageInfo != null) {
                    if (!ViewTargetDisposable.zza(packageInfo, false)) {
                        if (ViewTargetDisposable.zza(packageInfo, true)) {
                            if (!GooglePlayServicesUtilLight.honorsDebugCertificates((Context) viewTargetDisposable.view)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static List listOf(Object... objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]) : Collections.EMPTY_LIST;
    }

    public static boolean uidHasPackageName(Context context, int i, String str) {
        ContextModule packageManager = Wrappers.packageManager(context);
        packageManager.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) packageManager.ctx.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int zza(int i) {
        if (i == -1) {
            return -1;
        }
        return i / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
    }

    public static List listOf() {
        return Collections.singletonList("_o");
    }
}
