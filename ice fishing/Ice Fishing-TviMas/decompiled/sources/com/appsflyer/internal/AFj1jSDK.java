package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0013J\u0013\u0010\u000e\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/appsflyer/internal/AFj1jSDK;", "", "Lcom/appsflyer/internal/AFd1qSDK;", "p0", "Lcom/appsflyer/internal/AFj1bSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFj1bSDK;)V", "", "getRevenue", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrencyIso4217Code", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFh1gSDK;", "getMediationNetwork", "(Lcom/appsflyer/internal/AFh1gSDK;)Ljava/lang/String;", "", "getMonetizationNetwork", "(Ljava/lang/String;Z)Ljava/lang/String;", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1qSDK;", "AFAdRevenueData", "Lcom/appsflyer/internal/AFj1bSDK;", "AFa1ySDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AFj1jSDK {
    public static final String areAllFieldsValid;
    public static final String component1;
    public static final String component2;
    public static String component3;
    private static final String component4;
    public static final String getCurrencyIso4217Code;
    public static final String getMediationNetwork;
    public static final String getMonetizationNetwork;

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    public final AFj1bSDK getMediationNetwork;
    public final AFd1qSDK getRevenue;

    private AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.getRevenue = aFd1qSDK;
        this.getMediationNetwork = aFj1bSDK;
    }

    public /* synthetic */ AFj1jSDK(AFd1qSDK aFd1qSDK, AFj1eSDK aFj1eSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1qSDK, (i & 2) != 0 ? new AFj1eSDK() : aFj1eSDK);
    }

    static {
        String str = AFb1rSDK.AFAdRevenueData + "/androidevent?app_id=";
        component4 = str;
        getMonetizationNetwork = "https://%sattr.%s/api/v" + str;
        getCurrencyIso4217Code = "https://%sadrevenue.%s/api/v2/generic/v6.15.2/android?app_id=";
        getMediationNetwork = "https://%sconversions.%s/api/v" + str;
        areAllFieldsValid = "https://%slaunches.%s/api/v" + str;
        component1 = "https://%sinapps.%s/api/v" + str;
        component2 = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        component3 = "https://%svalidate.%s/api/v" + AFb1rSDK.AFAdRevenueData + "/androidevent?buildnumber=6.15.2&app_id=";
    }

    public final String getRevenue(String p0, String p1) {
        String packageName = this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String component42 = this.getRevenue.component4();
        String str = component42;
        if (str != null && !StringsKt.isBlank(str)) {
            component42 = "-" + StringsKt.trim((CharSequence) str).toString();
        }
        if (component42 == null) {
            component42 = "";
        }
        Uri.Builder appendPath = Uri.parse(this.getMediationNetwork.getMonetizationNetwork("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + StringsKt.trim((CharSequence) component42).toString());
        Intrinsics.checkNotNullExpressionValue(appendPath, "");
        if (p0 == null || p1 == null) {
            String str2 = p0 == null ? "devKey" : SDKConstants.PARAM_DEBUG_MESSAGE_TIMESTAMP;
            AFLogger.afErrorLog(str2.concat(" is null at attempt to generate ddl event url"), new IllegalStateException(str2.concat(" is null")));
        } else {
            appendPath.appendQueryParameter("af_sig", AFb1jSDK.getMonetizationNetwork(p1 + p0, p0));
        }
        String obj = appendPath.appendQueryParameter("sdk_version", AFb1rSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final String getMediationNetwork(AFh1gSDK p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        if (!(p0 instanceof AFh1bSDK)) {
            if (!(p0 instanceof AFh1aSDK)) {
                throw new UnsupportedOperationException();
            }
            return this.getMediationNetwork.getMonetizationNetwork(component3) + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
        }
        return this.getMediationNetwork.getMonetizationNetwork("https://%ssdk-services.%s/validate-android-signature");
    }

    public static String getCurrencyIso4217Code() {
        return "https://privacy-sandbox.appsflyersdk.com/api/trigger";
    }

    public final String getMediationNetwork(String str) {
        return str + this.getRevenue.getMonetizationNetwork.AFAdRevenueData.getPackageName();
    }

    public static String getMonetizationNetwork(String str, boolean z) {
        return str + (!z ? "&buildnumber=6.15.2" : "");
    }

    public final String getRevenue(String str) {
        String component42 = this.getRevenue.component4();
        String str2 = component42 != null ? "&channel=" + component42 : null;
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1jSDK(AFd1qSDK aFd1qSDK) {
        this(aFd1qSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
    }
}
