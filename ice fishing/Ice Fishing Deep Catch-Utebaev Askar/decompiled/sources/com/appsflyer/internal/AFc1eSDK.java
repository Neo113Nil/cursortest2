package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK implements AFc1fSDK {
    Map<String, Object> AFAdRevenueData;
    private boolean getCurrencyIso4217Code;
    private final AFd1nSDK getMediationNetwork;

    public static final class AFa1tSDK implements AFa1rSDK.AFa1tSDK {
        private /* synthetic */ long getMediationNetwork;

        public AFa1tSDK(long j2) {
            this.getMediationNetwork = j2;
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1tSDK
        public final void AFAdRevenueData(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFc1eSDK.this.AFAdRevenueData;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFc1eSDK.this.AFAdRevenueData) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFc1eSDK aFc1eSDK = AFc1eSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFc1eSDK.AFAdRevenueData;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFc1eSDK.this.AFAdRevenueData;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String strValueOf = String.valueOf(System.currentTimeMillis() - this.getMediationNetwork);
            Map<String, Object> map5 = AFc1eSDK.this.AFAdRevenueData;
            if (map5 != null) {
                map5.put("ttr", strValueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1rSDK.AFa1tSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFc1eSDK.this.AFAdRevenueData;
            if (map != null) {
                map.put("error", str);
            }
        }
    }

    public AFc1eSDK(AFd1nSDK aFd1nSDK) {
        Intrinsics.checkNotNullParameter(aFd1nSDK, "");
        this.getMediationNetwork = aFd1nSDK;
    }

    private boolean getRevenue() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void AFAdRevenueData(boolean z) {
        this.getCurrencyIso4217Code = z;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final Map<String, Object> getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final void getMediationNetwork() {
        Context context;
        String str;
        if (getRevenue() && (context = this.getMediationNetwork.AFAdRevenueData) != null) {
            this.AFAdRevenueData = new LinkedHashMap();
            AFa1tSDK aFa1tSDK = new AFa1tSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object objNewProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1rSDK.5
                    private /* synthetic */ AFa1tSDK getMediationNetwork;
                    private /* synthetic */ Class getMonetizationNetwork;

                    public AnonymousClass5() {
                        cls = cls;
                        aFa1tSDK = aFa1tSDK;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String string;
                        String string2;
                        String string3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1tSDK aFa1tSDK2 = aFa1tSDK;
                            if (aFa1tSDK2 != null) {
                                aFa1tSDK2.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(obj2), new Object[0]));
                            if (bundle2 != null) {
                                string2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                string3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                string = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                string = null;
                                string2 = null;
                                string3 = null;
                            }
                            AFa1tSDK aFa1tSDK3 = aFa1tSDK;
                            if (aFa1tSDK3 != null) {
                                aFa1tSDK3.AFAdRevenueData(string2, string3, string);
                            }
                        } else {
                            AFa1tSDK aFa1tSDK4 = aFa1tSDK;
                            if (aFa1tSDK4 != null) {
                                aFa1tSDK4.AFAdRevenueData(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aFa1tSDK.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string, objNewProxyInstance);
                }
            } catch (ClassNotFoundException e2) {
                e = e2;
                str = "FB class missing error";
                AFLogger.afErrorLogForExcManagerOnly(str, e);
                aFa1tSDK.getRevenue(e.toString());
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "FB illegal access";
                AFLogger.afErrorLogForExcManagerOnly(str, e);
                aFa1tSDK.getRevenue(e.toString());
            } catch (NoSuchMethodException e4) {
                e = e4;
                str = "FB method missing error";
                AFLogger.afErrorLogForExcManagerOnly(str, e);
                aFa1tSDK.getRevenue(e.toString());
            } catch (InvocationTargetException e5) {
                e = e5;
                str = "FB invocation error";
                AFLogger.afErrorLogForExcManagerOnly(str, e);
                aFa1tSDK.getRevenue(e.toString());
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1fSDK
    public final boolean getMonetizationNetwork() {
        if (getRevenue()) {
            Map<String, Object> map = this.AFAdRevenueData;
            if (map == null || map.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
