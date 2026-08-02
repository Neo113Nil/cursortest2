package com.appsflyer.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1bSDK;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFb1zSDK implements AFa1cSDK {
    private boolean AFAdRevenueData;
    private final AFc1hSDK getMonetizationNetwork;
    Map<String, Object> getRevenue;

    public AFb1zSDK(AFc1hSDK aFc1hSDK) {
        aFc1hSDK.getClass();
        this.getMonetizationNetwork = aFc1hSDK;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final boolean AFAdRevenueData() {
        if (!getCurrencyIso4217Code()) {
            return false;
        }
        Map<String, Object> map = this.getRevenue;
        return map == null || map.isEmpty();
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getCurrencyIso4217Code(boolean z) {
        this.AFAdRevenueData = z;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final Map<String, Object> getMediationNetwork() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFa1cSDK
    public final void getMonetizationNetwork() {
        Context context;
        if (getCurrencyIso4217Code() && (context = this.getMonetizationNetwork.getMonetizationNetwork) != null) {
            this.getRevenue = new LinkedHashMap();
            AFa1zSDK aFa1zSDK = new AFa1zSDK(System.currentTimeMillis());
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, context);
                Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.AFa1bSDK.5
                    private /* synthetic */ AFa1uSDK getCurrencyIso4217Code;
                    private /* synthetic */ Class getMonetizationNetwork;

                    public AnonymousClass5(Class cls3, AFa1uSDK aFa1zSDK2) {
                        r1 = cls3;
                        r2 = aFa1zSDK2;
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String str;
                        String str2;
                        String str3;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            AFa1uSDK aFa1uSDK = r2;
                            if (aFa1uSDK != null) {
                                aFa1uSDK.getRevenue("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        Object obj2 = objArr[0];
                        if (obj2 != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(r1.getMethod("getArgumentBundle", null).invoke(r1.cast(obj2), null));
                            if (bundle2 != null) {
                                str2 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str3 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                str = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str = null;
                                str2 = null;
                                str3 = null;
                            }
                            AFa1uSDK aFa1uSDK2 = r2;
                            if (aFa1uSDK2 != null) {
                                aFa1uSDK2.getRevenue(str2, str3, str);
                            }
                        } else {
                            AFa1uSDK aFa1uSDK3 = r2;
                            if (aFa1uSDK3 != null) {
                                aFa1uSDK3.getRevenue(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string2 = context.getString(context.getResources().getIdentifier("facebook_app_id", InquiryField.StringField.TYPE, context.getPackageName()));
                if (TextUtils.isEmpty(string2)) {
                    aFa1zSDK2.getRevenue("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, context, string2, newProxyInstance);
                }
            } catch (ClassNotFoundException e) {
                AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e);
                aFa1zSDK2.getRevenue(e.toString());
            } catch (IllegalAccessException e2) {
                AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e2);
                aFa1zSDK2.getRevenue(e2.toString());
            } catch (NoSuchMethodException e3) {
                AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e3);
                aFa1zSDK2.getRevenue(e3.toString());
            } catch (InvocationTargetException e4) {
                AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e4);
                aFa1zSDK2.getRevenue(e4.toString());
            }
        }
    }

    private boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData;
    }

    /* loaded from: classes3.dex */
    public static final class AFa1zSDK implements AFa1bSDK.AFa1uSDK {
        private /* synthetic */ long getMonetizationNetwork;

        public AFa1zSDK(long j) {
            this.getMonetizationNetwork = j;
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str, String str2, String str3) {
            Map<String, Object> map;
            if (str != null) {
                AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(str));
                Map<String, Object> map2 = AFb1zSDK.this.getRevenue;
                if (map2 != null) {
                    map2.put("link", str);
                }
                if (str2 != null && (map = AFb1zSDK.this.getRevenue) != null) {
                    map.put("target_url", str2);
                }
                if (str3 != null) {
                    AFb1zSDK aFb1zSDK = AFb1zSDK.this;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("promo_code", str3);
                    linkedHashMap.put("deeplink_context", linkedHashMap2);
                    Map<String, Object> map3 = aFb1zSDK.getRevenue;
                    if (map3 != null) {
                        map3.put("extras", linkedHashMap);
                    }
                }
            } else {
                Map<String, Object> map4 = AFb1zSDK.this.getRevenue;
                if (map4 != null) {
                    map4.put("link", "");
                }
            }
            String valueOf = String.valueOf(System.currentTimeMillis() - this.getMonetizationNetwork);
            Map<String, Object> map5 = AFb1zSDK.this.getRevenue;
            if (map5 != null) {
                map5.put("ttr", valueOf);
            }
        }

        @Override // com.appsflyer.internal.AFa1bSDK.AFa1uSDK
        public final void getRevenue(String str) {
            Map<String, Object> map = AFb1zSDK.this.getRevenue;
            if (map != null) {
                map.put(BreadcrumbHelper.Category.ERROR, str);
            }
        }
    }
}
