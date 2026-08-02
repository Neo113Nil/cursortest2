package ru.CryptoPro.JCSP.support;

import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.cprocsp.ACSP.tools.common.Constants;
import ru.cprocsp.ACSP.tools.license.CSPLicenseConstants;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class License implements Constants {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public static String extract(InputStream inputStream) {
        Exception exc;
        String str;
        String str2;
        BufferedReader bufferedReader;
        int i;
        ?? r1 = 0;
        String str3 = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    while (true) {
                        if (readLine == null) {
                            str = null;
                            break;
                        }
                        int indexOf = readLine.indexOf(CSPLicenseConstants.CSP_LICENSE_PRODUCT_ID);
                        if (indexOf > -1 && !readLine.contains("ProductID\\")) {
                            str = readLine.substring(indexOf + 9);
                            break;
                        }
                        readLine = bufferedReader.readLine();
                    }
                } catch (Exception e) {
                    String str4 = str3;
                    bufferedReader2 = bufferedReader;
                    exc = e;
                    str = str4;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = bufferedReader;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            exc = e2;
            str = null;
        }
        if (str != null) {
            try {
            } catch (Exception e3) {
                bufferedReader2 = bufferedReader;
                exc = e3;
                Log.e(LogConstants.APP_LOGGER_TAG, "Error occurred.", exc);
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused2) {
                    }
                }
                str2 = str;
                r1 = bufferedReader2;
                return str2;
            }
            if (!str.isEmpty()) {
                int indexOf2 = str.indexOf(61);
                str3 = (indexOf2 <= -1 || (i = indexOf2 + 1) >= str.length()) ? str : str.substring(i);
                str2 = processSerialNumber(str3);
                try {
                    bufferedReader.close();
                    r1 = str3;
                } catch (IOException unused3) {
                }
                return str2;
            }
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "Couldn't find serial number.");
        try {
            bufferedReader.close();
        } catch (IOException unused4) {
        }
        return null;
    }

    public static String processSerialNumber(String str) {
        return (str == null || str.isEmpty()) ? str : str.replace("\"", "").replace(" ", "");
    }
}
