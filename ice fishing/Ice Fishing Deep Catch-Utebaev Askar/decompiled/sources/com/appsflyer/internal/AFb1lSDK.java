package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1lSDK implements AFb1uSDK {
    private final AFd1nSDK getMonetizationNetwork;

    public AFb1lSDK(AFd1nSDK aFd1nSDK) {
        this.getMonetizationNetwork = aFd1nSDK;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static AFb1kSDK AFAdRevenueData(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1kSDK aFb1kSDK = new AFb1kSDK(cArr);
                    aFb1kSDK.getRevenue = file.getName();
                    try {
                        inputStreamReader.close();
                    } catch (IOException e2) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e2);
                    }
                    return aFb1kSDK;
                } catch (Exception e3) {
                    e = e3;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e5) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e5);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void getCurrencyIso4217Code() {
        try {
            File file = new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFh1vSDK, sb.toString());
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger.i(aFh1vSDK, sb2.toString());
                file2.delete();
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e2);
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final List<AFb1kSDK> getMediationNetwork() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return arrayList;
            }
            for (File file2 : fileArrListFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFh1vSDK, sb.toString());
                arrayList.add(AFAdRevenueData(file2));
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e2);
        }
        return arrayList;
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final void getMonetizationNetwork() {
        try {
            if (new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e2) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.appsflyer.internal.AFb1uSDK
    public final String AFAdRevenueData(AFb1kSDK aFb1kSDK) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        StringWriter stringWriter = 0;
        try {
            try {
                File file = new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return null;
                }
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length > 40) {
                    AFLogger.INSTANCE.i(AFh1vSDK.CACHE, "reached cache limit, not caching request");
                    return null;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
                StringBuilder sb = new StringBuilder("caching request with URL: ");
                sb.append(aFb1kSDK.AFAdRevenueData);
                aFLogger.i(aFh1vSDK, sb.toString());
                String string = Long.toString(System.currentTimeMillis());
                File file2 = new File(new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache"), string);
                file2.createNewFile();
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFb1kSDK.getMonetizationNetwork);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFb1kSDK.AFAdRevenueData);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFb1kSDK.getMonetizationNetwork(), 2));
                    outputStreamWriter.write(10);
                    AFf1zSDK aFf1zSDK = aFb1kSDK.getCurrencyIso4217Code;
                    if (aFf1zSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFf1zSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    aFLogger.i(aFh1vSDK, "done, cacheKey: ".concat(String.valueOf(string)));
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e2) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e2);
                    }
                    return string;
                } catch (Exception e3) {
                    e = e3;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e4) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                stringWriter = "AFRequestCache";
                if (stringWriter != 0) {
                    try {
                        stringWriter.close();
                    } catch (IOException e5) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e5);
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            outputStreamWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (stringWriter != 0) {
                stringWriter.close();
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final boolean AFAdRevenueData(String str) {
        File file = new File(new File(this.getMonetizationNetwork.AFAdRevenueData.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.i(aFh1vSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e2);
            return false;
        }
    }
}
