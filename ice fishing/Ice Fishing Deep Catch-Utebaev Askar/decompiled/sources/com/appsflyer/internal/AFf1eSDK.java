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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
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

    public AFf1eSDK(AFa1oSDK aFa1oSDK, AFd1kSDK aFd1kSDK) {
        this(aFa1oSDK, aFd1kSDK, null);
    }

    public static Map<String, Object> component1(AFa1oSDK aFa1oSDK) {
        Map<String, Object> map = (Map) aFa1oSDK.getMonetizationNetwork().get("meta");
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        aFa1oSDK.getMonetizationNetwork().put("meta", map2);
        return map2;
    }

    public void AFAdRevenueData(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.component3.getMediationNetwork;
    }

    public void component2(AFa1oSDK aFa1oSDK) {
        this.equals.AFAdRevenueData(aFa1oSDK);
    }

    @Override // com.appsflyer.internal.AFf1oSDK
    public boolean copydefault() {
        return true;
    }

    public void getCurrencyIso4217Code(AFa1oSDK aFa1oSDK) {
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
                    AFg1wSDK.getCurrencyIso4217Code(aFa1oSDK);
                }
            }
            if (aFa1oSDK.component2()) {
                aFa1oSDK.getRevenue((Map<String, ?>) this.component1.getMediationNetwork());
            }
            Set<AFf1zSDK> set = this.getRevenue;
            boolean z = true;
            boolean z2 = set.contains(AFf1zSDK.LAUNCH) || set.contains(AFf1zSDK.CONVERSION);
            if (component2() && z2) {
                aFa1oSDK.getMediationNetwork(this.toString.getMediationNetwork("appsFlyerCount", 0));
            }
            if (aFa1oSDK.component3()) {
                Map<String, Object> mapComponent1 = component1(aFa1oSDK);
                AFe1iSDK aFe1iSDK = this.copydefault;
                AFe1bSDK aFe1bSDK = new AFe1bSDK(aFe1iSDK.AFAdRevenueData(), aFe1iSDK.getMediationNetwork(), AFe1iSDK.getCurrencyIso4217Code() ? AFe1fSDK.DEFAULT : AFe1fSDK.API);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", aFe1bSDK.AFAdRevenueData);
                AFe1fSDK aFe1fSDK = aFe1bSDK.getMediationNetwork;
                if (aFe1fSDK != AFe1fSDK.DEFAULT) {
                    jSONObject.put("method", aFe1fSDK.getMonetizationNetwork);
                }
                String str = aFe1bSDK.getMonetizationNetwork;
                if (str != null && !kotlin.text.o.b(str)) {
                    z = false;
                }
                if (!z) {
                    jSONObject.put("prefix", aFe1bSDK.getMonetizationNetwork);
                }
                mapComponent1.put("host", jSONObject);
            }
            if (this.hashCode.AFAdRevenueData("AF_PREINSTALL_DISABLED", false)) {
                component1(aFa1oSDK).put("preinstall_disabled", Boolean.TRUE);
            }
            this.valueOf.AFAdRevenueData(aFa1oSDK.getMonetizationNetwork(), aFa1oSDK.getCurrencyIso4217Code());
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFh1vSDK.QUEUE, "Error while preparing to send event", th2, true, true, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[Catch: all -> 0x00e6, TryCatch #1 {all -> 0x00e6, blocks: (B:33:0x0081, B:37:0x00c3, B:36:0x0095), top: B:74:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[Catch: all -> 0x00dc, Exception -> 0x00df, NullPointerException -> 0x00e3, TRY_ENTER, TryCatch #9 {NullPointerException -> 0x00e3, Exception -> 0x00df, all -> 0x00dc, blocks: (B:39:0x00cf, B:40:0x00d6, B:41:0x00db), top: B:86:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[Catch: all -> 0x00dc, Exception -> 0x00df, NullPointerException -> 0x00e3, TryCatch #9 {NullPointerException -> 0x00e3, Exception -> 0x00df, all -> 0x00dc, blocks: (B:39:0x00cf, B:40:0x00d6, B:41:0x00db), top: B:86:0x00cd }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0118  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    @Override // com.appsflyer.internal.AFf1oSDK
    public final AFe1tSDK<String> getMediationNetwork(String str) {
        double d2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String string;
        String strReplaceAll;
        Exception exc;
        Map map;
        Object method;
        String str2;
        String str3;
        getCurrencyIso4217Code(this.component3);
        if (this.component3.getMonetizationNetwork().containsKey("meta")) {
            try {
                d2 = this.copy.getCurrencyIso4217Code.getRevenue.getRevenue.getMonetizationNetwork.AFAdRevenueData;
            } catch (NullPointerException unused) {
                d2 = 1.0d;
            }
            if (AFa1oSDK.getRevenue(d2)) {
                this.component3.getMonetizationNetwork().remove("meta");
            }
        }
        AFa1oSDK aFa1oSDK = this.component3;
        String str4 = aFa1oSDK.component4;
        Map<String, Object> monetizationNetwork = aFa1oSDK.getMonetizationNetwork();
        try {
            jSONObject2 = new JSONObject(monetizationNetwork);
            try {
                string = jSONObject2.toString();
                try {
                    if (string == null) {
                        throw new NullPointerException("JSON toString of eventParams map returns null");
                    }
                    strReplaceAll = string.replaceAll("\\p{C}", "*Non-printing character*");
                    str3 = string != null ? string : "";
                    if (strReplaceAll.equals(str3)) {
                        strReplaceAll = str3;
                    } else {
                        AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                        try {
                            jSONObject2 = new JSONObject(strReplaceAll);
                        } catch (JSONException e2) {
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Couldn't parse the payload to a json object", e2);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(this);
                    sb.append(": preparing data: ");
                    AFb1bSDK.getCurrencyIso4217Code(sb.toString(), jSONObject2);
                    ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                    return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                } catch (NullPointerException e3) {
                    e = e3;
                    AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                    try {
                        Object[] objArr = {monetizationNetwork};
                        map = AFa1vSDK.registerClient;
                        method = map.get(1706992406);
                        if (method != null) {
                            method = ((Class) AFa1vSDK.getRevenue(35 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (char) TextUtils.getCapsMode("", 0, 0))).getMethod("AFAdRevenueData", Map.class);
                            map.put(1706992406, method);
                        }
                        str2 = (String) ((Method) method).invoke(null, objArr);
                        try {
                            if (str2 != null) {
                                throw new NullPointerException("JSON toString of eventParams map returns null");
                            }
                            strReplaceAll = str2.replaceAll("\\p{C}", "*Non-printing character*");
                            string = str2;
                        } catch (NullPointerException e4) {
                            e = e4;
                            string = str2;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                        } catch (Exception e5) {
                            exc = e5;
                            string = str2;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                        } catch (Throwable th) {
                            th = th;
                            string = str2;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                        }
                    } catch (Throwable th2) {
                        try {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        } catch (NullPointerException e6) {
                            e = e6;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFJsonObject return null String object.", e);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str3)) {
                                AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject2 = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str3;
                            }
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this);
                            sb2.append(": preparing data: ");
                            AFb1bSDK.getCurrencyIso4217Code(sb2.toString(), jSONObject2);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Exception e7) {
                            exc = e7;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "AFFinalizer: reflection init failed.", exc, false, false, true);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str3)) {
                                AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject2 = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str3;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this);
                            sb3.append(": preparing data: ");
                            AFb1bSDK.getCurrencyIso4217Code(sb3.toString(), jSONObject2);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        } catch (Throwable th3) {
                            th = th3;
                            AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                            strReplaceAll = "";
                            if (string != null) {
                            }
                            if (strReplaceAll.equals(str3)) {
                                AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                                jSONObject2 = new JSONObject(strReplaceAll);
                            } else {
                                strReplaceAll = str3;
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(this);
                            sb4.append(": preparing data: ");
                            AFb1bSDK.getCurrencyIso4217Code(sb4.toString(), jSONObject2);
                            ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                            return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    jSONObject = jSONObject2;
                    AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                    strReplaceAll = "";
                    jSONObject2 = jSONObject;
                }
            } catch (NullPointerException e8) {
                e = e8;
                string = null;
                AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "JSONObject return null String object. Trying to create AFJsonObject.", e);
                Object[] objArr2 = {monetizationNetwork};
                map = AFa1vSDK.registerClient;
                method = map.get(1706992406);
                if (method != null) {
                    method = ((Class) AFa1vSDK.getRevenue(35 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37, (char) TextUtils.getCapsMode("", 0, 0))).getMethod("AFAdRevenueData", Map.class);
                    map.put(1706992406, method);
                }
                str2 = (String) ((Method) method).invoke(null, objArr2);
                if (str2 != null) {
                    throw new NullPointerException("JSON toString of eventParams map returns null");
                }
                strReplaceAll = str2.replaceAll("\\p{C}", "*Non-printing character*");
                string = str2;
                if (string != null) {
                }
                if (strReplaceAll.equals(str3)) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                    jSONObject2 = new JSONObject(strReplaceAll);
                } else {
                    strReplaceAll = str3;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this);
                sb5.append(": preparing data: ");
                AFb1bSDK.getCurrencyIso4217Code(sb5.toString(), jSONObject2);
                ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
            } catch (Throwable th5) {
                th = th5;
                jSONObject = jSONObject2;
                string = null;
                AFLogger.INSTANCE.e(AFh1vSDK.GENERAL, "Unexpected error", th);
                strReplaceAll = "";
                jSONObject2 = jSONObject;
                if (string != null) {
                }
                if (strReplaceAll.equals(str3)) {
                    AFLogger.INSTANCE.w(AFh1vSDK.GENERAL, "Payload contains non-printing characters");
                    jSONObject2 = new JSONObject(strReplaceAll);
                } else {
                    strReplaceAll = str3;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(this);
                sb6.append(": preparing data: ");
                AFb1bSDK.getCurrencyIso4217Code(sb6.toString(), jSONObject2);
                ((AFf1oSDK) this).areAllFieldsValid.getMediationNetwork(str4, strReplaceAll);
                return ((AFf1oSDK) this).component2.AFAdRevenueData(this.component3, str, this.AFKeystoreWrapper);
            }
        } catch (NullPointerException e9) {
            e = e9;
            jSONObject2 = null;
        } catch (Throwable th6) {
            th = th6;
            jSONObject = null;
        }
    }

    public void getMonetizationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMonetizationNetwork(aFa1oSDK.getMonetizationNetwork());
    }

    public void getRevenue(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK);
    }

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
        int i2 = this.component3.component1;
        AFf1zSDK aFf1zSDK2 = this.getMonetizationNetwork;
        if (i2 > 0) {
            this.getCurrencyIso4217Code.add(AFf1zSDK.CONVERSION);
        } else {
            AFf1zSDK aFf1zSDK3 = AFf1zSDK.CONVERSION;
            if (aFf1zSDK2 != aFf1zSDK3) {
                this.getRevenue.add(aFf1zSDK3);
            }
        }
    }

    public void getMediationNetwork(AFa1oSDK aFa1oSDK) {
        this.equals.getMediationNetwork(aFa1oSDK.getMonetizationNetwork());
    }
}
