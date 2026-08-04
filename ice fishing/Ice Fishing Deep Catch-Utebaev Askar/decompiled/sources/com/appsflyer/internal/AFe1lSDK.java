package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1lSDK {
    private final int getCurrencyIso4217Code;

    public AFe1lSDK(int i2) {
        this.getCurrencyIso4217Code = i2;
    }

    private static String getMonetizationNetwork(HttpURLConnection httpURLConnection) throws Throwable {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            try {
                errorStream = httpURLConnection.getInputStream();
            } catch (Exception e2) {
                errorStream = httpURLConnection.getErrorStream();
                AFLogger.INSTANCE.e(AFh1vSDK.HTTP_CLIENT, e2.getMessage() != null ? e2.getMessage() : "", e2, false, false);
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
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return string;
                        }
                        if (!z) {
                            sb.append('\n');
                        }
                        sb.append(line);
                        z = false;
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
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
        }
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }

    public final AFe1kSDK<String> getMediationNetwork(AFe1mSDK aFe1mSDK) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                byte[] currencyIso4217Code = aFe1mSDK.getCurrencyIso4217Code();
                StringBuilder sb = new StringBuilder();
                sb.append(aFe1mSDK.getCurrencyIso4217Code);
                sb.append(":");
                sb.append(aFe1mSDK.getMediationNetwork);
                StringBuilder sb2 = new StringBuilder(sb.toString());
                byte[] currencyIso4217Code2 = aFe1mSDK.getCurrencyIso4217Code();
                if (aFe1mSDK.getRevenue() && currencyIso4217Code2 != null) {
                    String str = aFe1mSDK.AFAdRevenueData() ? "<encrypted>" : new String(currencyIso4217Code2, Charset.defaultCharset());
                    sb2.append("\n payload: ");
                    sb2.append(str);
                }
                for (Map.Entry<String, String> entry : aFe1mSDK.getRevenue.entrySet()) {
                    sb2.append("\n ");
                    sb2.append(entry.getKey());
                    sb2.append(": ");
                    sb2.append(entry.getValue());
                }
                StringBuilder sb3 = new StringBuilder("[");
                sb3.append(aFe1mSDK.hashCode());
                sb3.append("] ");
                sb3.append((Object) sb2);
                AFLogger.INSTANCE.d(AFh1vSDK.HTTP_CLIENT, sb3.toString());
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
                        int i2 = this.getCurrencyIso4217Code;
                        int i3 = aFe1mSDK.component3;
                        if (i3 != -1) {
                            i2 = i3;
                        }
                        httpURLConnection2.setConnectTimeout(i2);
                        httpURLConnection2.setReadTimeout(i2);
                        httpURLConnection2.addRequestProperty("Content-Type", aFe1mSDK.AFAdRevenueData() ? "application/octet-stream" : "application/json");
                        for (Map.Entry<String, String> entry2 : aFe1mSDK.getRevenue.entrySet()) {
                            httpURLConnection2.setRequestProperty(entry2.getKey(), entry2.getValue());
                        }
                        if (currencyIso4217Code != null) {
                            httpURLConnection2.setDoOutput(true);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(currencyIso4217Code.length);
                            httpURLConnection2.setRequestProperty("Content-Length", sb4.toString());
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
                        String monetizationNetwork = aFe1mSDK.getMediationNetwork() ? getMonetizationNetwork(httpURLConnection2) : "";
                        AFe1nSDK aFe1nSDK = new AFe1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        StringBuilder sb5 = new StringBuilder("response code:");
                        sb5.append(httpURLConnection2.getResponseCode());
                        sb5.append(" ");
                        sb5.append(httpURLConnection2.getResponseMessage());
                        sb5.append("\n body:");
                        sb5.append(monetizationNetwork);
                        sb5.append("\n took ");
                        sb5.append(aFe1nSDK.getRevenue);
                        sb5.append("ms");
                        String string = sb5.toString();
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
                        StringBuilder sb6 = new StringBuilder("[");
                        sb6.append(aFe1mSDK.hashCode());
                        sb6.append("] ");
                        sb6.append(string);
                        aFLogger.d(aFh1vSDK, sb6.toString());
                        HashMap map = new HashMap(httpURLConnection2.getHeaderFields());
                        map.remove(null);
                        AFe1kSDK<String> aFe1kSDK = new AFe1kSDK<>(monetizationNetwork, httpURLConnection2.getResponseCode(), z, map, aFe1nSDK);
                        httpURLConnection2.disconnect();
                        return aFe1kSDK;
                    } catch (Exception e2) {
                        e = e2;
                        AFe1nSDK aFe1nSDK2 = new AFe1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        getMediationNetwork(aFe1mSDK, e, aFe1nSDK2, false);
                        throw new HttpException(e, aFe1nSDK2);
                    } catch (Throwable th3) {
                        th = th3;
                        AFe1nSDK aFe1nSDK3 = new AFe1nSDK(System.currentTimeMillis() - jCurrentTimeMillis);
                        getMediationNetwork(aFe1mSDK, th, aFe1nSDK3, true);
                        throw new HttpException(th, aFe1nSDK3);
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th5;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private static void getMediationNetwork(AFe1mSDK aFe1mSDK, Throwable th, AFe1nSDK aFe1nSDK, boolean z) {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(th);
        sb.append("\n took ");
        sb.append(aFe1nSDK.getRevenue);
        sb.append("ms");
        String string = sb.toString();
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFe1mSDK.hashCode());
        sb2.append("] ");
        sb2.append(string);
        aFLogger.e(aFh1vSDK, sb2.toString(), th, false, false, z);
    }
}
