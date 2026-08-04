package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1zSDK extends AFe1eSDK<AFf1bSDK> {
    private final AFg1ySDK areAllFieldsValid;
    public AFi1ySDK component1;
    public final AFg1xSDK component2;
    public AFf1bSDK component3;
    private final AFd1qSDK component4;
    private final String copy;
    private final AFg1wSDK copydefault;
    private final AFg1sSDK equals;
    private final AFg1vSDK hashCode;
    private final AFe1qSDK toString;

    public AFg1zSDK(AFg1ySDK aFg1ySDK, AFd1qSDK aFd1qSDK, AFg1wSDK aFg1wSDK, AFg1vSDK aFg1vSDK, AFe1qSDK aFe1qSDK, AFg1sSDK aFg1sSDK, String str, AFg1xSDK aFg1xSDK) {
        super(AFf1zSDK.RC_CDN, new AFf1zSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.areAllFieldsValid = aFg1ySDK;
        this.component4 = aFd1qSDK;
        this.copydefault = aFg1wSDK;
        this.hashCode = aFg1vSDK;
        this.toString = aFe1qSDK;
        this.equals = aFg1sSDK;
        this.copy = str;
        this.component2 = aFg1xSDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0061  */
    /* JADX WARN: Code duplicated, block: B:17:0x0075 A[Catch: all -> 0x019f, IOException -> 0x01dc, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:19:0x009c A[Catch: all -> 0x019f, IOException -> 0x01dc, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8 A[Catch: all -> 0x019f, IOException -> 0x01dc, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:28:0x014f A[Catch: all -> 0x019f, IOException -> 0x01dc, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:32:0x016e A[Catch: all -> 0x019f, IOException -> 0x01dc, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0193 A[Catch: all -> 0x019f, IOException -> 0x01dc, TRY_LEAVE, TryCatch #2 {IOException -> 0x01dc, all -> 0x019f, blocks: (B:15:0x006d, B:17:0x0075, B:19:0x009c, B:21:0x00c0, B:24:0x00cc, B:26:0x00d8, B:28:0x014f, B:30:0x0168, B:32:0x016e, B:34:0x0193), top: B:54:0x006d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1bSDK areAllFieldsValid() throws InterruptedException, InterruptedIOException {
        String monetizationNetwork;
        AFLogger aFLogger;
        AFh1vSDK aFh1vSDK;
        AFe1kSDK<AFi1vSDK> monetizationNetwork2;
        AFi1vSDK body;
        String revenue;
        String revenue2;
        String str;
        AFi1tSDK mediationNetwork;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = this.copy;
        AFg1wSDK aFg1wSDK = this.copydefault;
        String str3 = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        if (str3 != null && str3.trim().length() != 0) {
            if (str2 == null) {
                AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                monetizationNetwork = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component4.getMonetizationNetwork.AFAdRevenueData.getPackageName()}), str3);
            }
            if (monetizationNetwork == null) {
                AFLogger.INSTANCE.v(AFh1vSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1bSDK.FAILURE;
            }
            try {
                if (this.equals.getRevenue()) {
                    AFLogger.INSTANCE.d(AFh1vSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1bSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFh1vSDK = AFh1vSDK.REMOTE_CONTROL;
                aFLogger.i(aFh1vSDK, "Cached config is expired, updating...");
                monetizationNetwork2 = this.toString.getCurrencyIso4217Code(this.equals.getCurrencyIso4217Code(), this.equals.getMediationNetwork(), monetizationNetwork, 1500).getMonetizationNetwork();
                if (monetizationNetwork2.isSuccessful()) {
                    getRevenue(monetizationNetwork, jCurrentTimeMillis, null, null, monetizationNetwork2);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(monetizationNetwork2.getStatusCode());
                    aFLogger.w(aFh1vSDK, sb.toString());
                    return AFf1bSDK.FAILURE;
                }
                body = monetizationNetwork2.getBody();
                revenue = monetizationNetwork2.getRevenue("x-amz-meta-af-auth-v1");
                revenue2 = monetizationNetwork2.getRevenue("CF-Cache-Status");
                AFg1wSDK aFg1wSDK2 = this.copydefault;
                str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK2}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK2));
                if (str != null && str.trim().length() != 0) {
                    mediationNetwork = this.areAllFieldsValid.getMediationNetwork(body, revenue, monetizationNetwork, str);
                    if (mediationNetwork.AFAdRevenueData()) {
                        getRevenue(monetizationNetwork, jCurrentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork2);
                        aFLogger.w(aFh1vSDK, "fetched config is not valid (MITM?) refuse to use it.");
                        return AFf1bSDK.FAILURE;
                    }
                    long jAFAdRevenueData = this.equals.AFAdRevenueData();
                    StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                    sb2.append(jAFAdRevenueData);
                    sb2.append(" seconds");
                    aFLogger.v(aFh1vSDK, sb2.toString());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    AFg1vSDK aFg1vSDK = this.hashCode;
                    aFg1vSDK.getMediationNetwork.AFAdRevenueData("af_remote_config", Base64.encodeToString(body.AFAdRevenueData.getBytes(Charset.defaultCharset()), 2));
                    aFg1vSDK.AFAdRevenueData = aFg1vSDK.getRevenue;
                    aFg1vSDK.getMediationNetwork.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis2);
                    aFg1vSDK.getMediationNetwork.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData);
                    aFg1vSDK.getRevenue = body;
                    aFg1vSDK.getCurrencyIso4217Code = jCurrentTimeMillis2;
                    aFg1vSDK.getMonetizationNetwork = jAFAdRevenueData;
                    StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb3.append(jAFAdRevenueData);
                    sb3.append(" seconds");
                    aFLogger.d(aFh1vSDK, sb3.toString());
                    getRevenue(monetizationNetwork, jCurrentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork2);
                    return AFf1bSDK.SUCCESS;
                }
                aFLogger.w(aFh1vSDK, "Dev key is not set, SDK is not started.");
                return AFf1bSDK.FAILURE;
            } catch (IOException e2) {
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK2 = AFh1vSDK.REMOTE_CONTROL;
                StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                sb4.append(e2.getMessage());
                aFLogger2.e(aFh1vSDK2, sb4.toString(), e2, true, false, false);
                getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, e2 instanceof ParsingException ? ((ParsingException) e2).getRawResponse() : null, null, null, null, e2);
                if (e2.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e2.getCause());
                }
                return AFf1bSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger aFLogger3 = AFLogger.INSTANCE;
                AFh1vSDK aFh1vSDK3 = AFh1vSDK.REMOTE_CONTROL;
                StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                sb5.append(th.getMessage());
                aFLogger3.e(aFh1vSDK3, sb5.toString(), th, true, false, false);
                getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1bSDK.FAILURE;
            }
        }
        AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        monetizationNetwork = null;
        if (monetizationNetwork == null) {
            AFLogger.INSTANCE.v(AFh1vSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1bSDK.FAILURE;
        }
        if (this.equals.getRevenue()) {
            AFLogger.INSTANCE.d(AFh1vSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1bSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFh1vSDK = AFh1vSDK.REMOTE_CONTROL;
        aFLogger.i(aFh1vSDK, "Cached config is expired, updating...");
        monetizationNetwork2 = this.toString.getCurrencyIso4217Code(this.equals.getCurrencyIso4217Code(), this.equals.getMediationNetwork(), monetizationNetwork, 1500).getMonetizationNetwork();
        if (monetizationNetwork2.isSuccessful()) {
            getRevenue(monetizationNetwork, jCurrentTimeMillis, null, null, monetizationNetwork2);
            StringBuilder sb6 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb6.append(monetizationNetwork2.getStatusCode());
            aFLogger.w(aFh1vSDK, sb6.toString());
            return AFf1bSDK.FAILURE;
        }
        body = monetizationNetwork2.getBody();
        revenue = monetizationNetwork2.getRevenue("x-amz-meta-af-auth-v1");
        revenue2 = monetizationNetwork2.getRevenue("CF-Cache-Status");
        AFg1wSDK aFg1wSDK3 = this.copydefault;
        str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK3}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK3));
        if (str != null) {
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork(body, revenue, monetizationNetwork, str);
            if (mediationNetwork.AFAdRevenueData()) {
                getRevenue(monetizationNetwork, jCurrentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork2);
                aFLogger.w(aFh1vSDK, "fetched config is not valid (MITM?) refuse to use it.");
                return AFf1bSDK.FAILURE;
            }
            long jAFAdRevenueData2 = this.equals.AFAdRevenueData();
            StringBuilder sb7 = new StringBuilder("using max-age fallback: ");
            sb7.append(jAFAdRevenueData2);
            sb7.append(" seconds");
            aFLogger.v(aFh1vSDK, sb7.toString());
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            AFg1vSDK aFg1vSDK2 = this.hashCode;
            aFg1vSDK2.getMediationNetwork.AFAdRevenueData("af_remote_config", Base64.encodeToString(body.AFAdRevenueData.getBytes(Charset.defaultCharset()), 2));
            aFg1vSDK2.AFAdRevenueData = aFg1vSDK2.getRevenue;
            aFg1vSDK2.getMediationNetwork.getMonetizationNetwork("af_rc_timestamp", jCurrentTimeMillis3);
            aFg1vSDK2.getMediationNetwork.getMonetizationNetwork("af_rc_max_age", jAFAdRevenueData2);
            aFg1vSDK2.getRevenue = body;
            aFg1vSDK2.getCurrencyIso4217Code = jCurrentTimeMillis3;
            aFg1vSDK2.getMonetizationNetwork = jAFAdRevenueData2;
            StringBuilder sb8 = new StringBuilder("Config successfully updated, timeToLive: ");
            sb8.append(jAFAdRevenueData2);
            sb8.append(" seconds");
            aFLogger.d(aFh1vSDK, sb8.toString());
            getRevenue(monetizationNetwork, jCurrentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork2);
            return AFf1bSDK.SUCCESS;
        }
        aFLogger.w(aFh1vSDK, "Dev key is not set, SDK is not started.");
        return AFf1bSDK.FAILURE;
    }

    private void getRevenue(String str, long j2, AFi1wSDK aFi1wSDK, String str2, AFe1kSDK<AFi1vSDK> aFe1kSDK) {
        getMonetizationNetwork(str, j2, aFe1kSDK, aFe1kSDK != null ? aFe1kSDK.getBody() : null, aFi1wSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() {
        try {
            AFf1bSDK aFf1bSDKAreAllFieldsValid = areAllFieldsValid();
            this.component3 = aFf1bSDKAreAllFieldsValid;
            return aFf1bSDKAreAllFieldsValid == AFf1bSDK.FAILURE ? AFe1cSDK.FAILURE : AFe1cSDK.SUCCESS;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (InterruptedException e3) {
            e = e3;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }

    private void getMonetizationNetwork(String str, long j2, AFe1kSDK<?> aFe1kSDK, AFi1vSDK aFi1vSDK, AFi1wSDK aFi1wSDK, String str2, Throwable th) {
        long j3;
        int statusCode;
        Throwable cause;
        long j4;
        if (aFe1kSDK != null) {
            j3 = aFe1kSDK.AFAdRevenueData.getRevenue;
            statusCode = aFe1kSDK.getStatusCode();
        } else {
            j3 = 0;
            statusCode = 0;
        }
        int i2 = statusCode;
        if (th instanceof HttpException) {
            cause = th.getCause();
            j4 = ((HttpException) th).getMetrics().getRevenue;
        } else {
            cause = th;
            j4 = j3;
        }
        this.component1 = new AFi1ySDK(aFi1vSDK != null ? aFi1vSDK.getMediationNetwork : null, str, j4, System.currentTimeMillis() - j2, i2, aFi1wSDK, str2, cause);
    }
}
