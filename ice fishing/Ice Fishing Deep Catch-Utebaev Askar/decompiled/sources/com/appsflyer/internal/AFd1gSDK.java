package com.appsflyer.internal;

import com.appsflyer.AFLogger;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public abstract class AFd1gSDK {
    public int AFAdRevenueData;
    public Map<String, String> getCurrencyIso4217Code;
    public byte[] getMediationNetwork;
    private final boolean getRevenue;

    public AFd1gSDK(byte[] bArr, Map<String, String> map, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.getMediationNetwork = bArr;
        this.getCurrencyIso4217Code = map;
        this.AFAdRevenueData = i2;
        this.getRevenue = true;
    }

    private static String getRevenue(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFh1vSDK aFh1vSDK = AFh1vSDK.HTTP_CLIENT;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1uSDK.e$default(aFLogger, aFh1vSDK, message, th, false, false, false, false, 96, null);
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream == null) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(errorStream, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), 8192);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        ArrayList arrayList = new ArrayList();
        k.n action = new k.n(arrayList);
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        try {
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            kotlin.collections.l lVar = new kotlin.collections.l(bufferedReader);
            Intrinsics.checkNotNullParameter(lVar, "<this>");
            Iterator it = (lVar instanceof p.a ? lVar : new p.a(lVar)).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            Unit unit = Unit.f157a;
            a.c.b(bufferedReader, null);
            String strG = CollectionsKt.g(arrayList, null, null, null, null, 63);
            bufferedReader.close();
            return strG == null ? "" : strG;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                a.c.b(bufferedReader, th2);
                throw th3;
            }
        }
    }

    public final boolean AFAdRevenueData() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
        try {
            String revenue = getRevenue();
            Intrinsics.checkNotNullParameter(revenue, "");
            URLConnection uRLConnectionOpenConnection = new URL(revenue).openConnection();
            Intrinsics.c(uRLConnectionOpenConnection, "");
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) uRLConnectionOpenConnection;
            try {
                boolean zAFAdRevenueData = AFAdRevenueData(httpURLConnection2, jCurrentTimeMillis);
                httpURLConnection2.disconnect();
                return zAFAdRevenueData;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    String str = "error: " + th + "\n\ttook " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms\n\t" + th.getMessage();
                    String monetizationNetwork = getMonetizationNetwork("HTTP: [" + (httpURLConnection != null ? httpURLConnection.hashCode() : 0) + "] " + str);
                    if (getMediationNetwork()) {
                        AFLogger.afRDLog(monetizationNetwork);
                    } else {
                        AFLogger.afVerboseLog(monetizationNetwork);
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

    public abstract AFe1uSDK getCurrencyIso4217Code();

    public boolean getMediationNetwork() {
        return this.getRevenue;
    }

    public abstract String getMonetizationNetwork(String str);

    public abstract String getRevenue();

    private final boolean AFAdRevenueData(HttpURLConnection httpURLConnection, long j2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb = new StringBuilder(httpURLConnection.getRequestMethod() + ":" + httpURLConnection.getURL());
        sb.append("\n length: ");
        sb.append(new String(this.getMediationNetwork, Charsets.UTF_8).length());
        Map<String, String> map = this.getCurrencyIso4217Code;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("\n ");
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
            }
        }
        String monetizationNetwork = getMonetizationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + ((Object) sb));
        if (getMediationNetwork()) {
            AFLogger.afRDLog(monetizationNetwork);
        } else {
            AFLogger.afVerboseLog(monetizationNetwork);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFAdRevenueData);
        httpURLConnection.setConnectTimeout(this.AFAdRevenueData);
        httpURLConnection.addRequestProperty("Content-Type", getCurrencyIso4217Code().getMediationNetwork);
        Map<String, String> map2 = this.getCurrencyIso4217Code;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.getMediationNetwork.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.getMediationNetwork);
        bufferedOutputStream.close();
        String revenue = getRevenue(httpURLConnection);
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        String str = "response code:" + httpURLConnection.getResponseCode() + " " + httpURLConnection.getResponseMessage() + "\n\tbody:" + revenue + "\n\ttook " + jCurrentTimeMillis + "ms";
        String monetizationNetwork2 = getMonetizationNetwork("HTTP: [" + httpURLConnection.hashCode() + "] " + str);
        if (getMediationNetwork()) {
            AFLogger.afRDLog(monetizationNetwork2);
        } else {
            AFLogger.afVerboseLog(monetizationNetwork2);
        }
        return AFe1xSDK.getCurrencyIso4217Code(httpURLConnection);
    }
}
