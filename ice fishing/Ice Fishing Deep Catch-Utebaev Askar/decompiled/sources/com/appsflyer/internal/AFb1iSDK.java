package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1iSDK {
    private static String getCurrencyIso4217Code;

    public static synchronized String getCurrencyIso4217Code(AFd1nSDK aFd1nSDK, AFd1rSDK aFd1rSDK) {
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
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append("-");
                        sb.append(Math.abs(new SecureRandom().nextLong()));
                        getCurrencyIso4217Code = sb.toString();
                    }
                    aFd1rSDK.AFAdRevenueData("AF_INSTALLATION", getCurrencyIso4217Code);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Error getting AF unique ID", e2);
                }
            }
            if (getCurrencyIso4217Code != null) {
                AppsFlyerProperties.getInstance().set("uid", getCurrencyIso4217Code);
            }
        }
        return getCurrencyIso4217Code;
    }

    private static String getCurrencyIso4217Code(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile = null;
        byte[] bArr2 = null;
        randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    bArr2 = new byte[(int) randomAccessFile2.length()];
                    randomAccessFile2.readFully(bArr2);
                    randomAccessFile2.close();
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e2) {
                        AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = bArr2;
                    randomAccessFile = randomAccessFile2;
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e4);
                        }
                    }
                    bArr2 = bArr;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e5) {
                            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                bArr = null;
            }
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
