package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public final class AFb1iSDK {
    private static String getCurrencyIso4217Code;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getCurrencyIso4217Code(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e) {
                e = e;
                bArr = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e2) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
            }
        } catch (IOException e3) {
            e = e3;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e4) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e4);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e5) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2, Charset.defaultCharset());
    }

    public static synchronized String getCurrencyIso4217Code(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK) {
        synchronized (AFb1iSDK.class) {
            if (aFd1nSDK.AFAdRevenueData == null) {
                return getCurrencyIso4217Code;
            }
            if (getCurrencyIso4217Code == null) {
                String monetizationNetwork = aFd1rSDK.getMonetizationNetwork("AF_INSTALLATION", (String) null);
                if (monetizationNetwork != null) {
                    getCurrencyIso4217Code = monetizationNetwork;
                } else {
                    try {
                        File file = new File(aFd1nSDK.AFAdRevenueData.getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            getCurrencyIso4217Code = getCurrencyIso4217Code(file);
                            file.delete();
                        } else {
                            getCurrencyIso4217Code = new StringBuilder().append(System.currentTimeMillis()).append("-").append(Math.abs(new SecureRandom().nextLong())).toString();
                        }
                        aFd1rSDK.AFAdRevenueData("AF_INSTALLATION", getCurrencyIso4217Code);
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (getCurrencyIso4217Code != null) {
                    AppsFlyerProperties.getInstance().set("uid", getCurrencyIso4217Code);
                }
            }
            return getCurrencyIso4217Code;
        }
    }
}
