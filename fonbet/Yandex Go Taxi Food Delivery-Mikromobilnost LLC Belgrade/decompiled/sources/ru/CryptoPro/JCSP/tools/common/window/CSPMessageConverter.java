package ru.CryptoPro.JCSP.tools.common.window;

import android.content.Context;
import android.util.Log;
import defpackage.b64;
import defpackage.jzh0;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Calendar;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.GetProperty;

/* loaded from: classes4.dex */
public class CSPMessageConverter implements DialogConstants {
    private static final long TIMEOUT_LICENSE_EXPIRED = GetProperty.getIntegerProperty("timeout_expired_license_message", 60);
    private static long startTime = 0;
    public static boolean shouldCSPMessageBeShown = true;
    private static long lastExpiredLicenseAppearance = 0;
    private static final Object TIME_LOCK = new Object();
    private static final CharsetEncoder encoder = Charset.forName("cp1251").newEncoder();

    public static String getMessageForPinType(Context context, int i, String str, byte[] bArr, String str2, long j) {
        return i != -3 ? i != -1 ? j == DialogConstants.NTE_TOKEN_KEYSET_STORAGE_FULL ? context.getString(jzh0.NoFreeSpace) : toStringMessage(bArr) : str : str2;
    }

    public static boolean isPureAscii(String str) {
        return encoder.canEncode(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String replaceCSPMessage(Context context, String str) {
        boolean z;
        if (!str.contains("Signing with GOST")) {
            z = true;
            if (str.contains("expires in less than two months")) {
                str = context.getString(jzh0.CSPExpireInTwoMonth);
            } else if (str.contains("expires in less than a month")) {
                str = context.getString(jzh0.CSPExpireInMonth);
            } else if (str.contains("expires in less than a week")) {
                str = context.getString(jzh0.CSPExpireInWeek);
            } else if (str.contains("expires in less than a day")) {
                str = context.getString(jzh0.CSPExpireInDay);
            } else if (str.contains("expired or not yet valid")) {
                str = context.getString(jzh0.CSPExpired);
            } else if (str.contains("not set or corrupted")) {
                str = context.getString(jzh0.CSPCorrupted);
            } else if (str.contains("installing a root certificate")) {
                str = str.replace("Warning: installing a root certificate with an unconfirmed thumbprint is a security risk. Do you want to install this certificate?\nSubject:", context.getString(jzh0.InstallRootCertWarning)).replace("Thumbprint (sha1):", context.getString(jzh0.Thumbprint));
            }
            if (z) {
                return str;
            }
            synchronized (TIME_LOCK) {
                try {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    lastExpiredLicenseAppearance = timeInMillis;
                    if (timeInMillis - startTime <= TIMEOUT_LICENSE_EXPIRED * 1000) {
                        shouldCSPMessageBeShown = false;
                    } else {
                        startTime = timeInMillis;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }
        str = str.contains("Generate") ? context.getString(jzh0.GeneratingKey2001) : context.getString(jzh0.SigningKey2001);
        z = false;
        if (z) {
        }
    }

    private static String replaceCSPPinMessage(Context context, String str) {
        return str.contains("Authentication in container") ? str.replace("Authentication in container", context.getString(jzh0.Authentication)).replace("requests new container password", context.getString(jzh0.RequestNewPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests new authentication") ? str.replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)).replace("requests new authentication properties for container", context.getString(jzh0.RequestProperties)) : str.contains("requests container password") ? str.replace("requests container password", context.getString(jzh0.RequestPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests new container password") ? str.replace("requests new container password", context.getString(jzh0.RequestNewPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests pin-code") ? str.replace("requests pin-code", context.getString(jzh0.RequestNewPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests carrier pin-code") ? str.replace("requests carrier pin-code", context.getString(jzh0.f35RequestarrierPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests FKC pin-code") ? str.replace("requests FKC pin-code", context.getString(jzh0.RequestFKCPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests carrier FKC password") ? str.replace("requests carrier FKC password", context.getString(jzh0.RequestFKCPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests new carrier FKC password") ? str.replace("requests new carrier FKC password", context.getString(jzh0.RequestNewFKCPassword)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests carrier PUK") ? str.replace("requests carrier PUK", context.getString(jzh0.f34RequestarrierPUK)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests new FKC PUK") ? str.replace("requests new FKC PUK", context.getString(jzh0.RequestFKCPUK)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str.contains("requests new carrier FKC PUK") ? str.replace("requests new carrier FKC PUK", context.getString(jzh0.RequestNewFKCPUK)).replace("Container", context.getString(jzh0.Container)).replace("Reader", context.getString(jzh0.Reader)) : str;
    }

    private static String replaceCSPReaderMessage(Context context, String str, String str2, boolean z) {
        if (str.contains("Select carrier to create container")) {
            str = str.replace("Select carrier to create container", context.getString(jzh0.SelectCarrier));
        } else if (str.contains("Select carrier to delete container")) {
            str = str.replace("Select carrier to delete container", context.getString(jzh0.DeleteCarrier));
        } else if (str.contains("Select carrier to open container")) {
            str = str.replace("Select carrier to open container", context.getString(jzh0.OpenCarrier));
        }
        if (str2.contains("Insert empty carrier to create container")) {
            str2 = str2.replace("Insert empty carrier to create container", context.getString(jzh0.InsertCarrier));
        }
        return z ? b64.j(str2, Extension.DOT_CHAR) : b64.j(str, Extension.DOT_CHAR);
    }

    public static String toStringMessage(byte[] bArr) {
        String str = new String(bArr);
        if (!isPureAscii(str)) {
            try {
                return new String(bArr, 0, bArr.length, "cp1251");
            } catch (UnsupportedEncodingException e) {
                Log.e(DialogConstants.APP_LOGGER_TAG, "Encoding error.", e);
            }
        }
        return str;
    }

    public static String replaceCSPMessage(Context context, int i, String str, String str2, boolean z, long j) {
        shouldCSPMessageBeShown = true;
        if (i == -3) {
            return replaceCSPReaderMessage(context, str, str2, z);
        }
        if (i == -1) {
            return replaceCSPMessage(context, str);
        }
        if (j == DialogConstants.NTE_TOKEN_KEYSET_STORAGE_FULL) {
            return replaceCSPMessage(context, str);
        }
        return replaceCSPPinMessage(context, str);
    }
}
