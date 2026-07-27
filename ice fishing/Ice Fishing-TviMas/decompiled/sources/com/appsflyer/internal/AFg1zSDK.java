package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
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

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 1500L;
    }

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

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFe1cSDK AFAdRevenueData() throws Exception {
        try {
            AFf1bSDK areAllFieldsValid = areAllFieldsValid();
            this.component3 = areAllFieldsValid;
            if (areAllFieldsValid == AFf1bSDK.FAILURE) {
                return AFe1cSDK.FAILURE;
            }
            return AFe1cSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1bSDK.FAILURE;
            return AFe1cSDK.TIMEOUT;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1bSDK areAllFieldsValid() throws InterruptedException, InterruptedIOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.copy;
        AFg1wSDK aFg1wSDK = this.copydefault;
        String str3 = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK));
        if (str3 == null || str3.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component4.getMonetizationNetwork.AFAdRevenueData.getPackageName()}), str3);
            if (str != null) {
                AFLogger.INSTANCE.v(AFh1vSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1bSDK.FAILURE;
            }
            try {
                if (this.equals.getRevenue()) {
                    AFLogger.INSTANCE.i(AFh1vSDK.REMOTE_CONTROL, "Cached config is expired, updating...");
                    AFe1kSDK<AFi1vSDK> monetizationNetwork = this.toString.getCurrencyIso4217Code(this.equals.getCurrencyIso4217Code(), this.equals.getMediationNetwork(), str, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).getMonetizationNetwork();
                    if (monetizationNetwork.isSuccessful()) {
                        AFi1vSDK body = monetizationNetwork.getBody();
                        String revenue = monetizationNetwork.getRevenue("x-amz-meta-af-auth-v1");
                        String revenue2 = monetizationNetwork.getRevenue("CF-Cache-Status");
                        AFg1wSDK aFg1wSDK2 = this.copydefault;
                        String str4 = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK2}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDK2));
                        if (str4 != null && str4.trim().length() != 0) {
                            AFi1tSDK mediationNetwork = this.areAllFieldsValid.getMediationNetwork(body, revenue, str, str4);
                            if (mediationNetwork.AFAdRevenueData()) {
                                long AFAdRevenueData = this.equals.AFAdRevenueData();
                                AFLogger.INSTANCE.v(AFh1vSDK.REMOTE_CONTROL, new StringBuilder("using max-age fallback: ").append(AFAdRevenueData).append(" seconds").toString());
                                long currentTimeMillis2 = System.currentTimeMillis();
                                AFg1vSDK aFg1vSDK = this.hashCode;
                                aFg1vSDK.getMediationNetwork.AFAdRevenueData("af_remote_config", Base64.encodeToString(body.AFAdRevenueData.getBytes(Charset.defaultCharset()), 2));
                                aFg1vSDK.AFAdRevenueData = aFg1vSDK.getRevenue;
                                aFg1vSDK.getMediationNetwork.getMonetizationNetwork("af_rc_timestamp", currentTimeMillis2);
                                aFg1vSDK.getMediationNetwork.getMonetizationNetwork("af_rc_max_age", AFAdRevenueData);
                                aFg1vSDK.getRevenue = body;
                                aFg1vSDK.getCurrencyIso4217Code = currentTimeMillis2;
                                aFg1vSDK.getMonetizationNetwork = AFAdRevenueData;
                                AFLogger.INSTANCE.d(AFh1vSDK.REMOTE_CONTROL, new StringBuilder("Config successfully updated, timeToLive: ").append(AFAdRevenueData).append(" seconds").toString());
                                getRevenue(str, currentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork);
                                return AFf1bSDK.SUCCESS;
                            }
                            getRevenue(str, currentTimeMillis, mediationNetwork.getCurrencyIso4217Code, revenue2, monetizationNetwork);
                            AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "fetched config is not valid (MITM?) refuse to use it.");
                            return AFf1bSDK.FAILURE;
                        }
                        AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
                        return AFf1bSDK.FAILURE;
                    }
                    getRevenue(str, currentTimeMillis, null, null, monetizationNetwork);
                    AFLogger.INSTANCE.w(AFh1vSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config from CDN with status code: ").append(monetizationNetwork.getStatusCode()).toString());
                    return AFf1bSDK.FAILURE;
                }
                AFLogger.INSTANCE.d(AFh1vSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                return AFf1bSDK.USE_CACHED;
            } catch (IOException e) {
                AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, new StringBuilder("failed to fetch remote config: ").append(e.getMessage()).toString(), e, true, false, false);
                getMonetizationNetwork(str, currentTimeMillis, e instanceof ParsingException ? ((ParsingException) e).getRawResponse() : null, null, null, null, e);
                if (e.getCause() instanceof InterruptedIOException) {
                    throw ((InterruptedIOException) e.getCause());
                }
                return AFf1bSDK.FAILURE;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.REMOTE_CONTROL, new StringBuilder("failed to update remote config: ").append(th.getMessage()).toString(), th, true, false, false);
                getMonetizationNetwork(str, currentTimeMillis, null, null, null, null, th);
                if (th.getCause() instanceof InterruptedException) {
                    throw ((InterruptedException) th.getCause());
                }
                return AFf1bSDK.FAILURE;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getRevenue(String str, long j, AFi1wSDK aFi1wSDK, String str2, AFe1kSDK<AFi1vSDK> aFe1kSDK) {
        getMonetizationNetwork(str, j, aFe1kSDK, aFe1kSDK != null ? aFe1kSDK.getBody() : null, aFi1wSDK, str2 != null ? str2 : null, null);
    }

    private void getMonetizationNetwork(String str, long j, AFe1kSDK<?> aFe1kSDK, AFi1vSDK aFi1vSDK, AFi1wSDK aFi1wSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        long j3;
        if (aFe1kSDK != null) {
            j2 = aFe1kSDK.AFAdRevenueData.getRevenue;
            i = aFe1kSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            th2 = th.getCause();
            j3 = ((HttpException) th).getMetrics().getRevenue;
        } else {
            th2 = th;
            j3 = j2;
        }
        this.component1 = new AFi1ySDK(aFi1vSDK != null ? aFi1vSDK.getMediationNetwork : null, str, j3, System.currentTimeMillis() - j, i2, aFi1wSDK, str2, th2);
    }
}
