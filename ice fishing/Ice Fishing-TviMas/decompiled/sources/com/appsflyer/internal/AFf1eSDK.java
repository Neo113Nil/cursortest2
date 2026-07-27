package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AFf1eSDK extends AFf1oSDK<String> {
    private static final AFf1zSDK[] AFInAppEventParameterName = {AFf1zSDK.DLSDK, AFf1zSDK.ONELINK, AFf1zSDK.REGISTER};
    private final AFd1nSDK AFKeystoreWrapper;
    public final AFa1oSDK component3;
    private final AFf1aSDK copy;
    private final AFe1iSDK copydefault;
    protected final AFg1kSDK equals;
    private final AFd1qSDK hashCode;
    protected final AFd1rSDK toString;
    private final AFg1tSDK valueOf;

    @Override // com.appsflyer.internal.AFf1oSDK
    protected boolean copydefault() {
        return true;
    }

    public AFf1eSDK(AFa1oSDK aFa1oSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1oSDK, aFd1kSDK, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1eSDK(AFa1oSDK aFa1oSDK, AFd1kSDK aFd1kSDK, String str) {
        super(aFa1oSDK.getCurrencyIso4217Code(), new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1kSDK, str);
        this.component3 = aFa1oSDK;
        this.copydefault = aFd1kSDK.AFInAppEventType();
        this.toString = aFd1kSDK.getRevenue();
        this.copy = aFd1kSDK.component2();
        this.AFKeystoreWrapper = aFd1kSDK.values();
        this.hashCode = aFd1kSDK.getMediationNetwork();
        this.equals = aFd1kSDK.component1();
        this.valueOf = aFd1kSDK.v();
        for (AFf1zSDK aFf1zSDK : AFInAppEventParameterName) {
            if (this.getMonetizationNetwork == aFf1zSDK) {
                return;
            }
        }
        int i = this.component3.component1;
        AFf1zSDK aFf1zSDK2 = this.getMonetizationNetwork;
        if (i <= 0) {
            if (aFf1zSDK2 != AFf1zSDK.CONVERSION) {
                this.getRevenue.add(AFf1zSDK.CONVERSION);
                return;
            }
            return;
        }
        this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    @Override // com.appsflyer.internal.AFf1oSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final AFe1tSDK<String> getMediationNetwork(String str) {
        double d;
        String str2;
        JSONObject jSONObject;
        String str3;
        Exception exc;
        String str4;
        getCurrencyIso4217Code(this.component3);
        if (this.component3.getMonetizationNetwork().containsKey("meta")) {
            try {
                d = this.copy.getCurrencyIso4217Code.getRevenue.getRevenue.getMonetizationNetwork.AFAdRevenueData;
            } catch (NullPointerException unused) {
                d = 1.0d;
            }
            if (AFa1oSDK.getRevenue(d)) {
                this.component3.getMonetizationNetwork().remove("meta");
            }
        }
        String str5 = this.component3.component4;
        Map<String, Object> monetizationNetwork = this.component3.getMonetizationNetwork();
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(monetizationNetwork);
            try {
                str2 = jSONObject.toString();
                try {
                } catch (NullPointerException e) {
                    e = e;
                    AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {monetizationNetwork};
                        Object obj = AFa1vSDK.registerClient.get(1706992406);
                        if (obj == null) {
                            obj = ((Class) AFa1vSDK.getRevenue(35 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (char) TextUtils.getCapsMode("", 0, 0))).getMethod("AFAdRevenueData", Map.class);
                            AFa1vSDK.registerClient.put(1706992406, obj);
                        }
                        String str6 = (String) ((Method) obj).invoke(null, objArr);
                        try {
                        } catch (NullPointerException e2) {
                            e = e2;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Exception e3) {
                            exc = e3;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Throwable th) {
                            th = th;
                            str2 = str6;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        }
                        if (str6 != null) {
                            str3 = str6.replaceAll("\\p{C}", "*Non-printing character*");
                            str2 = str6;
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        }
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e4) {
                            e = e4;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFJsonObject return null String object.", e);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Exception e5) {
                            exc = e5;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                            str3 = "";
                            if (str2 != null) {
                            }
                            if (str3.equals(str4)) {
                            }
                            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject2 = jSONObject;
                    AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                    str3 = "";
                    jSONObject = jSONObject2;
                    if (str2 != null) {
                    }
                    if (str3.equals(str4)) {
                    }
                    AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
                    ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
                    return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                }
            } catch (NullPointerException e6) {
                e = e6;
                str2 = null;
            } catch (Throwable th5) {
                th = th5;
                str2 = null;
            }
        } catch (NullPointerException e7) {
            e = e7;
            jSONObject = null;
            str2 = null;
        } catch (Throwable th6) {
            th = th6;
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2.replaceAll("\\p{C}", "*Non-printing character*");
            str4 = str2 != null ? str2 : "";
            if (str3.equals(str4)) {
                str3 = str4;
            } else {
                AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                try {
                    jSONObject = new JSONObject(str3);
                } catch (JSONException e8) {
                    AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Couldn't parse the payload to a json object", e8);
                }
            }
            AFb1bSDK.getCurrencyIso4217Code(new StringBuilder().append(this).append(": preparing data: ").toString(), jSONObject);
            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str5, str3);
            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
        }
        throw new NullPointerException("JSON toString of eventParams map returns null");
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    protected final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    protected void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK.getMonetizationNetwork());
    }

    protected void getRevenue(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK);
    }

    protected void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK);
    }

    protected void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK.getMonetizationNetwork());
    }

    protected static Map<String, Object> component1(AFa1oSDK aFa1oSDK) {
        Map<String, Object> map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1oSDK.getMonetizationNetwork().put("meta", hashMap);
        return hashMap;
    }

    protected void component2(AFa1oSDK aFa1oSDK) {
        this.equals.AFAdRevenueData(aFa1oSDK);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009c A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0059, B:8:0x005e, B:10:0x0064, B:11:0x006d, B:13:0x0077, B:17:0x0083, B:20:0x008b, B:21:0x0096, B:23:0x009c, B:25:0x00b4, B:26:0x00b9, B:28:0x00ce, B:29:0x00d7, B:31:0x00dd, B:34:0x00e4, B:35:0x00eb, B:36:0x00b7, B:37:0x00ee, B:39:0x00f8, B:40:0x0103, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[Catch: all -> 0x0111, TryCatch #1 {all -> 0x0111, blocks: (B:3:0x001e, B:5:0x0025, B:7:0x0059, B:8:0x005e, B:10:0x0064, B:11:0x006d, B:13:0x0077, B:17:0x0083, B:20:0x008b, B:21:0x0096, B:23:0x009c, B:25:0x00b4, B:26:0x00b9, B:28:0x00ce, B:29:0x00d7, B:31:0x00dd, B:34:0x00e4, B:35:0x00eb, B:36:0x00b7, B:37:0x00ee, B:39:0x00f8, B:40:0x0103, B:48:0x0012, B:2:0x0000), top: B:1:0x0000, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
        boolean z;
        AFe1fSDK aFe1fSDK;
        try {
            try {
                getMonetizationNetwork(aFa1oSDK);
                getMediationNetwork(aFa1oSDK);
                AFAdRevenueData(aFa1oSDK);
                getRevenue(aFa1oSDK);
                component2(aFa1oSDK);
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFh1vSDK.QUEUE, "Error while collecting payload params", th, true, true, false);
            }
            if (aFa1oSDK.areAllFieldsValid()) {
                AFg1wSDK aFg1wSDK = this.component1;
                aFa1oSDK.getRevenue((Map<String, ?>) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDK, aFa1oSDK.getMonetizationNetwork()}, 896699170, -896699168, System.identityHashCode(aFg1wSDK)));
                aFa1oSDK.getRevenue((Map<String, ?>) this.component1.getCurrencyIso4217Code(aFa1oSDK.getMonetizationNetwork()));
                if (this.hashCode.AFAdRevenueData("com.appsflyer.security.enable", false)) {
                    AFg1wSDK aFg1wSDK2 = this.component1;
                    AFg1wSDK.getCurrencyIso4217Code(aFa1oSDK);
                }
            }
            if (aFa1oSDK.component2()) {
                aFa1oSDK.getRevenue((Map<String, ?>) this.component1.getMediationNetwork());
            }
            Set<AFf1zSDK> set = this.getRevenue;
            if (!set.contains(AFf1zSDK.LAUNCH) && !set.contains(AFf1zSDK.CONVERSION)) {
                z = false;
                if (component2() && z) {
                    aFa1oSDK.getMediationNetwork(this.toString.getMediationNetwork("appsFlyerCount", 0));
                }
                if (aFa1oSDK.component3()) {
                    Map<String, Object> component1 = component1(aFa1oSDK);
                    AFe1iSDK aFe1iSDK = this.copydefault;
                    String AFAdRevenueData = aFe1iSDK.AFAdRevenueData();
                    String mediationNetwork = aFe1iSDK.getMediationNetwork();
                    if (AFe1iSDK.getCurrencyIso4217Code()) {
                        aFe1fSDK = AFe1fSDK.DEFAULT;
                    } else {
                        aFe1fSDK = AFe1fSDK.API;
                    }
                    AFe1bSDK aFe1bSDK = new AFe1bSDK(AFAdRevenueData, mediationNetwork, aFe1fSDK);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", aFe1bSDK.getMonetizationNetwork);
                    if (aFe1bSDK.AFAdRevenueData != AFe1fSDK.DEFAULT) {
                        jSONObject.put("method", aFe1bSDK.AFAdRevenueData.getCurrencyIso4217Code);
                    }
                    String str = aFe1bSDK.getCurrencyIso4217Code;
                    if (str != null && !StringsKt.isBlank(str)) {
                        jSONObject.put("prefix", aFe1bSDK.getCurrencyIso4217Code);
                    }
                    component1.put("host", jSONObject);
                }
                if (this.hashCode.AFAdRevenueData("AF_PREINSTALL_DISABLED", false)) {
                    component1(aFa1oSDK).put("preinstall_disabled", Boolean.TRUE);
                }
                this.valueOf.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork(), aFa1oSDK.getCurrencyIso4217Code());
            }
            z = true;
            if (component2()) {
                aFa1oSDK.getMediationNetwork(this.toString.getMediationNetwork("appsFlyerCount", 0));
            }
            if (aFa1oSDK.component3()) {
            }
            if (this.hashCode.AFAdRevenueData("AF_PREINSTALL_DISABLED", false)) {
            }
            this.valueOf.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork(), aFa1oSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1vSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }
}
