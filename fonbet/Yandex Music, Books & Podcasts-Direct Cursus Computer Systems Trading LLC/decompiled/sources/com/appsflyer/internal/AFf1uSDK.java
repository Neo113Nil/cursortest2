package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFf1uSDK extends AFe1tSDK<AFf1qSDK> {
    public AFh1cSDK areAllFieldsValid;
    public AFf1qSDK component1;
    private final AFc1kSDK component2;
    public final AFf1sSDK component3;
    private final AFf1oSDK component4;
    private final AFf1pSDK copy;
    private final String copydefault;
    private final AFd1lSDK equals;
    private final AFf1iSDK hashCode;
    private final AFf1nSDK toString;

    public AFf1uSDK(@NonNull AFf1oSDK aFf1oSDK, @NonNull AFc1kSDK aFc1kSDK, @NonNull AFf1iSDK aFf1iSDK, @NonNull AFf1nSDK aFf1nSDK, @NonNull AFd1lSDK aFd1lSDK, @NonNull AFf1pSDK aFf1pSDK, @NonNull String str, AFf1sSDK aFf1sSDK) {
        super(AFe1uSDK.RC_CDN, new AFe1uSDK[0], "UpdateRemoteConfiguration");
        this.component1 = null;
        this.component4 = aFf1oSDK;
        this.component2 = aFc1kSDK;
        this.hashCode = aFf1iSDK;
        this.toString = aFf1nSDK;
        this.equals = aFd1lSDK;
        this.copy = aFf1pSDK;
        this.copydefault = str;
        this.component3 = aFf1sSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFf1qSDK component1() throws InterruptedException, InterruptedIOException {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.copydefault;
        String revenue = this.hashCode.getRevenue();
        if (revenue == null || revenue.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFh1zSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else if (str2 == null) {
            AFLogger.INSTANCE.w(AFh1zSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
        } else {
            str = AFj1hSDK.AFAdRevenueData(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str2, this.component2.AFAdRevenueData.getMonetizationNetwork.getPackageName()}), revenue);
            if (str != null) {
                AFLogger.INSTANCE.v(AFh1zSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1qSDK.FAILURE;
            }
            try {
                if (!this.copy.getRevenue()) {
                    AFLogger.INSTANCE.d(AFh1zSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1qSDK.USE_CACHED;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1zSDK aFh1zSDK = AFh1zSDK.REMOTE_CONTROL;
                aFLogger.i(aFh1zSDK, "Cached config is expired, updating...");
                AFd1cSDK<AFi1zSDK> monetizationNetwork = this.equals.getCurrencyIso4217Code(this.copy.AFAdRevenueData(), this.copy.getMonetizationNetwork(), str, 1500).getMonetizationNetwork();
                if (!monetizationNetwork.isSuccessful()) {
                    getMonetizationNetwork(str, currentTimeMillis, null, null, monetizationNetwork);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(monetizationNetwork.getStatusCode());
                    aFLogger.w(aFh1zSDK, sb.toString());
                    return AFf1qSDK.FAILURE;
                }
                AFi1zSDK body = monetizationNetwork.getBody();
                String revenue2 = monetizationNetwork.getRevenue("x-amz-meta-af-auth-v1");
                String revenue3 = monetizationNetwork.getRevenue("CF-Cache-Status");
                String revenue4 = this.hashCode.getRevenue();
                if (revenue4 == null || revenue4.trim().length() == 0) {
                    aFLogger.w(aFh1zSDK, "Dev key is not set, SDK is not started.");
                    return AFf1qSDK.FAILURE;
                }
                AFh1aSDK mediationNetwork = this.component4.getMediationNetwork(body, revenue2, str, revenue4);
                if (!mediationNetwork.getRevenue()) {
                    getMonetizationNetwork(str, currentTimeMillis, mediationNetwork.AFAdRevenueData, revenue3, monetizationNetwork);
                    aFLogger.w(aFh1zSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1qSDK.FAILURE;
                }
                long currencyIso4217Code = this.copy.getCurrencyIso4217Code();
                StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                sb2.append(currencyIso4217Code);
                sb2.append(" seconds");
                aFLogger.v(aFh1zSDK, sb2.toString());
                long currentTimeMillis2 = System.currentTimeMillis();
                AFf1nSDK aFf1nSDK = this.toString;
                String str3 = str;
                try {
                } catch (IOException e) {
                    e = e;
                    str = str3;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                }
                try {
                    aFf1nSDK.getCurrencyIso4217Code.getRevenue("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
                    aFf1nSDK.AFAdRevenueData = aFf1nSDK.getMediationNetwork;
                    aFf1nSDK.getCurrencyIso4217Code.AFAdRevenueData("af_rc_timestamp", currentTimeMillis2);
                    aFf1nSDK.getCurrencyIso4217Code.AFAdRevenueData("af_rc_max_age", currencyIso4217Code);
                    aFf1nSDK.getMediationNetwork = body;
                    aFf1nSDK.getRevenue = currentTimeMillis2;
                    aFf1nSDK.getMonetizationNetwork = currencyIso4217Code;
                    StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                    sb3.append(currencyIso4217Code);
                    sb3.append(" seconds");
                    aFLogger.d(aFh1zSDK, sb3.toString());
                    getMonetizationNetwork(str3, currentTimeMillis, mediationNetwork.AFAdRevenueData, revenue3, monetizationNetwork);
                    return AFf1qSDK.SUCCESS;
                } catch (IOException e2) {
                    e = e2;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    IOException iOException = e;
                    AFLogger aFLogger2 = AFLogger.INSTANCE;
                    AFh1zSDK aFh1zSDK2 = AFh1zSDK.REMOTE_CONTROL;
                    StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                    sb4.append(iOException.getMessage());
                    aFLogger2.e(aFh1zSDK2, sb4.toString(), iOException, true, false, false);
                    getMediationNetwork(str, currentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                    if (iOException.getCause() instanceof InterruptedIOException) {
                        throw ((InterruptedIOException) iOException.getCause());
                    }
                    return AFf1qSDK.FAILURE;
                } catch (Throwable th2) {
                    th = th2;
                    str = str3;
                    currentTimeMillis = currentTimeMillis;
                    Throwable th3 = th;
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFh1zSDK aFh1zSDK3 = AFh1zSDK.REMOTE_CONTROL;
                    StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                    sb5.append(th3.getMessage());
                    aFLogger3.e(aFh1zSDK3, sb5.toString(), th3, true, false, false);
                    getMediationNetwork(str, currentTimeMillis, null, null, null, null, th3);
                    if (th3.getCause() instanceof InterruptedException) {
                        throw ((InterruptedException) th3.getCause());
                    }
                    return AFf1qSDK.FAILURE;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    private void getMediationNetwork(String str, long j, AFd1cSDK<?> aFd1cSDK, AFi1zSDK aFi1zSDK, AFh1dSDK aFh1dSDK, String str2, Throwable th) {
        long j2;
        int i;
        Throwable th2;
        if (aFd1cSDK != null) {
            j2 = aFd1cSDK.getCurrencyIso4217Code.getMonetizationNetwork;
            i = aFd1cSDK.getStatusCode();
        } else {
            j2 = 0;
            i = 0;
        }
        int i2 = i;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().getMonetizationNetwork;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.areAllFieldsValid = new AFh1cSDK(aFi1zSDK != null ? aFi1zSDK.AFAdRevenueData : null, str, j2, System.currentTimeMillis() - j, i2, aFh1dSDK, str2, th2);
    }

    private void getMonetizationNetwork(String str, long j, AFh1dSDK aFh1dSDK, String str2, AFd1cSDK<AFi1zSDK> aFd1cSDK) {
        getMediationNetwork(str, j, aFd1cSDK, aFd1cSDK != null ? aFd1cSDK.getBody() : null, aFh1dSDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    @NonNull
    public final AFe1rSDK AFAdRevenueData() throws Exception {
        try {
            AFf1qSDK component1 = component1();
            this.component1 = component1;
            return component1 == AFf1qSDK.FAILURE ? AFe1rSDK.FAILURE : AFe1rSDK.SUCCESS;
        } catch (InterruptedIOException e) {
            e = e;
            AFLogger.INSTANCE.e(AFh1zSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (InterruptedException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFh1zSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component1 = AFf1qSDK.FAILURE;
            return AFe1rSDK.TIMEOUT;
        }
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final long getRevenue() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1tSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }
}
