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
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes4.dex */
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

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean getMediationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final long getMonetizationNetwork() {
        return 3000L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1lSDK(AFd1kSDK aFd1kSDK, UUID uuid, Uri uri) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1kSDK, uuid.toString());
        boolean z = false;
        this.toString = aFd1kSDK.getCurrencyIso4217Code();
        this.values = uuid;
        try {
            if (!AFc1sSDK.getRevenue(uri.getHost()) && !AFc1sSDK.getRevenue(uri.getPath())) {
                try {
                    Object[] objArr = {uri, aFd1kSDK.d()};
                    Object obj = AFa1vSDK.registerClient.get(94011772);
                    if (obj == null) {
                        obj = ((Class) AFa1vSDK.getRevenue(37 - TextUtils.indexOf("", "", 0), TextUtils.getOffsetBefore("", 0) + 233, (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38237))).getDeclaredConstructor(Uri.class, AFc1kSDK.class);
                        AFa1vSDK.registerClient.put(94011772, obj);
                    }
                    Object newInstance = ((Constructor) obj).newInstance(objArr);
                    try {
                        Object obj2 = AFa1vSDK.registerClient.get(503513178);
                        if (obj2 == null) {
                            obj2 = ((Class) AFa1vSDK.getRevenue(Color.alpha(0) + 37, 233 - TextUtils.indexOf("", ""), (char) (View.resolveSize(0, 0) + 38237))).getMethod("getMonetizationNetwork", null);
                            AFa1vSDK.registerClient.put(503513178, obj2);
                        }
                        Object invoke = ((Method) obj2).invoke(newInstance, null);
                        try {
                            Object obj3 = AFa1vSDK.registerClient.get(1776451557);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1vSDK.getRevenue(51 - ExpandableListView.getPackedPositionChild(0L), 270 - View.getDefaultSize(0, 0), (char) (37201 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)))).getMethod("getRevenue", null);
                                AFa1vSDK.registerClient.put(1776451557, obj3);
                            }
                            boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, null)).booleanValue();
                            try {
                                Object obj4 = AFa1vSDK.registerClient.get(-1029327759);
                                if (obj4 == null) {
                                    obj4 = ((Class) AFa1vSDK.getRevenue(52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 269, (char) (37201 - Gravity.getAbsoluteGravity(0, 0)))).getMethod("getMediationNetwork", null);
                                    AFa1vSDK.registerClient.put(-1029327759, obj4);
                                }
                                z = ((Boolean) ((Method) obj4).invoke(invoke, null)).booleanValue();
                                String[] split = uri.getPath().split("/");
                                if (booleanValue && split.length == 3) {
                                    this.hashCode = split[1];
                                    this.copy = split[2];
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
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("OneLinkValidator: reflection init failed", e);
        }
        this.equals = z;
    }

    public final boolean equals() {
        return (TextUtils.isEmpty(this.hashCode) || TextUtils.isEmpty(this.copy) || this.hashCode.equals("app")) ? false : true;
    }

    public final boolean copy() {
        return this.equals;
    }

    @Override // com.appsflyer.internal.AFf1oSDK, com.appsflyer.internal.AFe1eSDK
    public final void getRevenue() {
        super.getRevenue();
        AFa1uSDK aFa1uSDK = this.component3;
        if (aFa1uSDK != null) {
            if (this.getMediationNetwork == AFe1cSDK.SUCCESS && ((AFf1oSDK) this).component4 != null) {
                aFa1uSDK.getRevenue((Map) ((AFf1oSDK) this).component4.getBody());
                return;
            }
            Throwable component1 = component1();
            if (component1 instanceof ParsingException) {
                if (((ParsingException) component1).getRawResponse().isSuccessful()) {
                    aFa1uSDK.getCurrencyIso4217Code("Can't parse one link data");
                    return;
                } else {
                    String str = this.copydefault;
                    aFa1uSDK.getCurrencyIso4217Code(str != null ? str : "Can't get OneLink data");
                    return;
                }
            }
            String str2 = this.copydefault;
            aFa1uSDK.getCurrencyIso4217Code(str2 != null ? str2 : "Can't get OneLink data");
        }
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AFe1tSDK<Map<String, String>> getMediationNetwork(String str) {
        AFe1qSDK aFe1qSDK = this.toString;
        return (AFe1tSDK) AFe1qSDK.AFAdRevenueData(new Object[]{aFe1qSDK, this.hashCode, this.copy, this.values, str}, -15930200, 15930202, System.identityHashCode(aFe1qSDK));
    }
}
