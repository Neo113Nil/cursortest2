package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.gamericefishpro.space.i9.y3;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class AFc1dSDK {
    public int AFAdRevenueData;
    private final boolean getCurrencyIso4217Code;
    public Map<String, String> getMonetizationNetwork;
    public byte[] getRevenue;

    public AFc1dSDK(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getRevenue = bArr;
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = i;
        this.getCurrencyIso4217Code = true;
    }

    private static String getMonetizationNetwork(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.HTTP_CLIENT;
            String message = th.getMessage();
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message == null ? "" : message, th, false, false, false, false, 96, null);
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.a7.c action = new com.gamericefishpro.space.a7.c(1, arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            com.gamericefishpro.space.ai.n nVar = new com.gamericefishpro.space.ai.n(bufferedReader);
            Intrinsics.checkNotNullParameter(nVar, "<this>");
            Iterator it = new com.gamericefishpro.space.li.a(nVar).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.a;
            bufferedReader.close();
            String strA = CollectionsKt.A(arrayList, null, null, null, null, 63);
            bufferedReader.close();
            return strA == null ? "" : strA;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                y3.s(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public abstract String AFAdRevenueData(String str);

    public final boolean AFAdRevenueData() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String currencyIso4217Code = getCurrencyIso4217Code();
            Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
            URLConnection uRLConnectionOpenConnection = new URL(currencyIso4217Code).openConnection();
            Intrinsics.c(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean revenue = getRevenue(httpURLConnection2, jCurrentTimeMillis);
                httpURLConnection2.disconnect();
                return revenue;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getRevenue()) {
                        AFLogger.afRDLog(strAFAdRevenueData);
                    } else {
                        AFLogger.afVerboseLog(strAFAdRevenueData);
                    }
                    return false;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public abstract String getCurrencyIso4217Code();

    public abstract AFd1jSDK getMediationNetwork();

    public boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    private final boolean getRevenue(HttpURLConnection httpURLConnection, long j) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.getRevenue, Charsets.UTF_8).length());
        Map<String, String> map = this.getMonetizationNetwork;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        String strAFAdRevenueData = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getMediationNetwork().getCurrencyIso4217Code);
        Map<String, String> map2 = this.getMonetizationNetwork;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getRevenue.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getRevenue);
        bufferedOutputStream.close();
        String monetizationNetwork = getMonetizationNetwork(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + monetizationNetwork + "\n\ttook " + jCurrentTimeMillis + "ms";
        String strAFAdRevenueData2 = AFAdRevenueData("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getRevenue()) {
            AFLogger.afRDLog(strAFAdRevenueData2);
        } else {
            AFLogger.afVerboseLog(strAFAdRevenueData2);
        }
        return AFd1qSDK.getCurrencyIso4217Code(httpURLConnection);
    }
}
