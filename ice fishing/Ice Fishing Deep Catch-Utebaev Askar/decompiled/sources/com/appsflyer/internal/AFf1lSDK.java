package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1lSDK extends AFf1oSDK<Map<String, String>> {
    public AFa1uSDK component3;
    private String copy;
    private String copydefault;
    private final boolean equals;
    private String hashCode;
    private final AFe1qSDK toString;
    private final UUID values;

    public interface AFa1uSDK {
        void getCurrencyIso4217Code(String str);

        void getRevenue(Map<String, String> map);
    }

    public AFf1lSDK(AFd1kSDK aFd1kSDK, UUID uuid, Uri uri) throws Throwable {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        this.toString = aFd1kSDK.getCurrencyIso4217Code();
        this.values = uuid;
        boolean zBooleanValue = false;
        try {
            if (!AFc1sSDK.getRevenue(uri.getHost()) && !AFc1sSDK.getRevenue(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.d()};
                    Map map = AFa1vSDK.registerClient;
                    Object declaredConstructor = map.get(94011772);
                    if (declaredConstructor == null) {
                        declaredConstructor = ((Class) AFa1vSDK.getRevenue(37 - TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 233, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38237))).getDeclaredConstructor(Uri.class, AFc1kSDK.class);
                        map.put(94011772, declaredConstructor);
                    }
                    Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
                    try {
                        Object method = map.get(503513178);
                        if (method == null) {
                            method = ((Class) AFa1vSDK.getRevenue(Color.alpha(0) + 37, 233 - TextUtils.indexOf("", ""), (char) (View.resolveSize(0, 0) + 38237))).getMethod("getMonetizationNetwork", null);
                            map.put(503513178, method);
                        }
                        Object objInvoke = ((Method) method).invoke(objNewInstance, null);
                        try {
                            Object method2 = map.get(1776451557);
                            if (method2 == null) {
                                method2 = ((Class) AFa1vSDK.getRevenue(51 - ExpandableListView.getPackedPositionChild(0L), 270 - View.getDefaultSize(0, 0), (char) (37201 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("getRevenue", null);
                                map.put(1776451557, method2);
                            }
                            boolean zBooleanValue2 = ((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
                            try {
                                Object method3 = map.get(-1029327759);
                                if (method3 == null) {
                                    method3 = ((Class) AFa1vSDK.getRevenue(52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, (char) (37201 - Gravity.getAbsoluteGravity(0, 0)))).getMethod("getMediationNetwork", null);
                                    map.put(-1029327759, method3);
                                }
                                zBooleanValue = ((Boolean) ((Method) method3).invoke(objInvoke, null)).booleanValue();
                                String[] strArrSplit = uri.getPath().split("/");
                                if (zBooleanValue2 && strArrSplit.length == 3) {
                                    this.hashCode = strArrSplit[1];
                                    this.copy = strArrSplit[2];
                                    this.copydefault = uri.toString();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e2);
        }
        this.equals = zBooleanValue;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final boolean copydefault() {
        return false;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copy) || this.hashCode.equals("app")) ? false : true;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<Map<String, String>> getMediationNetwork(String str) {
        AFe1qSDK aFe1qSDK = this.toString;
        return (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK, this.hashCode, this.copy, this.values, str}, -15930200, 15930202, System.identityHashCode(aFe1qSDK));
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        ResponseNetwork responseNetwork;
        super.getRevenue();
        AFa1uSDK aFa1uSDK = this.component3;
        if (aFa1uSDK != null) {
            if (this.getMediationNetwork == AFe1cSDK.SUCCESS && (responseNetwork = ((AFf1oSDK) this).component4) != null) {
                aFa1uSDK.getRevenue((Map) responseNetwork.getBody());
                return;
            }
            Throwable thComponent1 = component1();
            if (!(thComponent1 instanceof ParsingException)) {
                String str = this.copydefault;
                aFa1uSDK.getCurrencyIso4217Code(str != null ? str : "Can't get OneLink data");
            } else if (((ParsingException) thComponent1).getRawResponse().isSuccessful()) {
                aFa1uSDK.getCurrencyIso4217Code("Can't parse one link data");
            } else {
                String str2 = this.copydefault;
                aFa1uSDK.getCurrencyIso4217Code(str2 != null ? str2 : "Can't get OneLink data");
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }
}
