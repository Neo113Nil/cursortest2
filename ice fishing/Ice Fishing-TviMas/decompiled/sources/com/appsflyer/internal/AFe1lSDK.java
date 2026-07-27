package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFe1lSDK {
    private final int getCurrencyIso4217Code;

    public AFe1lSDK(int i) {
        this.getCurrencyIso4217Code = i;
    }

    public final AFe1kSDK<String> getMediationNetwork(AFe1mSDK aFe1mSDK) throws IOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                byte[] currencyIso4217Code = aFe1mSDK.getCurrencyIso4217Code();
                StringBuilder sb = new StringBuilder(new StringBuilder().append(aFe1mSDK.getCurrencyIso4217Code).append(":").append(aFe1mSDK.getMediationNetwork).toString());
                byte[] currencyIso4217Code2 = aFe1mSDK.getCurrencyIso4217Code();
                if (aFe1mSDK.getRevenue() && currencyIso4217Code2 != null) {
                    sb.append("\n payload: ").append(aFe1mSDK.AFAdRevenueData() ? "<encrypted>" : new String(currencyIso4217Code2, Charset.defaultCharset()));
                }
                for (Map.Entry<String, String> entry : aFe1mSDK.getRevenue.entrySet()) {
                    sb.append("\n ").append(entry.getKey()).append(": ").append(entry.getValue());
                }
                AFLogger.INSTANCE.d(AFh1vSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1mSDK.hashCode()).append("] ").append((Object) sb).toString());
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(aFe1mSDK.getMediationNetwork).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(aFe1mSDK.getCurrencyIso4217Code);
                    if (aFe1mSDK.getMonetizationNetwork()) {
                        httpURLConnection2.setUseCaches(false);
                    }
                    if (!aFe1mSDK.component3()) {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                    }
                    try {
                        int i = this.getCurrencyIso4217Code;
                        int i2 = aFe1mSDK.component3;
                        if (i2 != -1) {
                            i = i2;
                        }
                        httpURLConnection2.setConnectTimeout(i);
                        httpURLConnection2.setReadTimeout(i);
                        httpURLConnection2.addRequestProperty("Content-Type", aFe1mSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                        for (Map.Entry<String, String> entry2 : aFe1mSDK.getRevenue.entrySet()) {
                            httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                        if (currencyIso4217Code != null) {
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setRequestProperty("Content-Length", new StringBuilder().append(currencyIso4217Code.length).toString());
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(currencyIso4217Code);
                                    bufferedOutputStream2.close();
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    if (bufferedOutputStream != null) {
                                        bufferedOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        boolean z = httpURLConnection2.getResponseCode() / 100 == 2;
                        if (!aFe1mSDK.getMediationNetwork()) {
                            str = "";
                        } else {
                            str = getMonetizationNetwork(httpURLConnection2);
                        }
                        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        AFLogger.INSTANCE.d(AFh1vSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1mSDK.hashCode()).append("] ").append(new StringBuilder("response code:").append(httpURLConnection2.getResponseCode()).append(" ").append(httpURLConnection2.getResponseMessage()).append("\n body:").append(str).append("\n took ").append(aFe1nSDK.getRevenue).append("ms").toString()).toString());
                        HashMap hashMap = new HashMap(httpURLConnection2.getHeaderFields());
                        hashMap.remove(null);
                        AFe1kSDK<String> aFe1kSDK = new AFe1kSDK<>(str, httpURLConnection2.getResponseCode(), z, hashMap, aFe1nSDK);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        return aFe1kSDK;
                    } catch (Exception e) {
                        e = e;
                        AFe1nSDK aFe1nSDK2 = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFe1mSDK, e, aFe1nSDK2, false);
                        throw new HttpException(e, aFe1nSDK2);
                    } catch (Throwable th3) {
                        th = th3;
                        AFe1nSDK aFe1nSDK3 = new AFe1nSDK(System.currentTimeMillis() - currentTimeMillis);
                        getMediationNetwork(aFe1mSDK, th, aFe1nSDK3, true);
                        throw new HttpException(th, aFe1nSDK3);
                    }
                } catch (Exception e2) {
                    e = e2;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th5;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static void getMediationNetwork(AFe1mSDK aFe1mSDK, Throwable th, AFe1nSDK aFe1nSDK, boolean z) {
        AFLogger.INSTANCE.e(AFh1vSDK.HTTP_CLIENT, new StringBuilder("[").append(aFe1mSDK.hashCode()).append("] ").append(new StringBuilder("error: ").append(th).append("\n took ").append(aFe1nSDK.getRevenue).append("ms").toString()).toString(), th, false, false, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMonetizationNetwork(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFh1vSDK.HTTP_CLIENT, e.getMessage() != null ? e.getMessage() : "", e, false, false);
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            if (!z) {
                                sb.append('\n');
                            }
                            sb.append(readLine);
                            z = false;
                        } else {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                        }
                        if (bufferedReader != null) {
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }
}
