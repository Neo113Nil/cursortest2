package com.gamericefishpro.space.id;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.gamericefishpro.space.dh.g;
import com.gamericefishpro.space.dh.m;
import com.gamericefishpro.space.lc.e;
import com.gamericefishpro.space.lc.f;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.jd.b, e {
    private static Class<?> iInAppBillingServiceClass;
    private final f _applicationService;
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.bd.f _operationRepo;
    private final com.gamericefishpro.space.gd.b _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final C0024a Companion = new C0024a(null);
    private static int iapEnabled = -99;

    /* JADX INFO: renamed from: com.gamericefishpro.space.id.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0024a {
        public /* synthetic */ C0024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && Intrinsics.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            Intrinsics.b(cls);
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && Intrinsics.a(parameterTypes[0], Integer.TYPE) && Intrinsics.a(parameterTypes[1], String.class) && Intrinsics.a(parameterTypes[2], String.class) && Intrinsics.a(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            Intrinsics.b(cls);
            Method[] methods = cls.getMethods();
            Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && Intrinsics.a(parameterTypes[0], Integer.TYPE) && Intrinsics.a(parameterTypes[1], String.class) && Intrinsics.a(parameterTypes[2], String.class) && Intrinsics.a(parameterTypes[3], Bundle.class) && Intrinsics.a(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (a.iapEnabled == -99) {
                a.iapEnabled = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (a.iapEnabled == 0) {
                    a.iInAppBillingServiceClass = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                return a.iapEnabled == 0;
            } catch (Throwable unused) {
                a.iapEnabled = 0;
                return false;
            }
        }

        private C0024a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(service, "service");
            try {
                Method asInterfaceMethod = a.Companion.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                Intrinsics.b(asInterfaceMethod);
                asInterfaceMethod.setAccessible(true);
                a.this.mIInAppBillingService = asInterfaceMethod.invoke(null, service);
                a.this.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            a.iapEnabled = -99;
            a.this.mIInAppBillingService = null;
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.gd.b _prefs, com.gamericefishpro.space.bd.f _operationRepo, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.bh.b _identityModelStore) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_operationRepo, "_operationRepo");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        this._applicationService = _applicationService;
        this._prefs = _prefs;
        this._operationRepo = _operationRepo;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this.purchaseTokens = new ArrayList();
        this.newAsExisting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new com.appsflyer.a(6, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryBoughtItems$lambda$0(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isWaitingForPurchasesRequest = true;
        try {
            if (this$0.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                this$0.getPurchasesMethod = getPurchasesMethod;
                Intrinsics.b(getPurchasesMethod);
                getPurchasesMethod.setAccessible(true);
            }
            Method method = this$0.getPurchasesMethod;
            Intrinsics.b(method);
            Object objInvoke = method.invoke(this$0.mIInAppBillingService, 3, this$0._applicationService.getAppContext().getPackageName(), "inapp", null);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) objInvoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                Intrinsics.b(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList2.get(i);
                    Intrinsics.b(stringArrayList);
                    String str2 = stringArrayList.get(i);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!this$0.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    this$0.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    this$0.newAsExisting = false;
                    this$0._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this$0.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method getSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = getSkuDetailsMethod;
                Intrinsics.b(getSkuDetailsMethod);
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            Intrinsics.b(method);
            Object objInvoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            Intrinsics.c(objInvoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) objInvoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.b(stringArrayList);
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal bigDecimalDivide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                    Intrinsics.b(string);
                    Intrinsics.b(string2);
                    linkedHashMap.put(string, new g(string, string2, bigDecimalDivide));
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    String str2 = arrayList.get(i2);
                    i2++;
                    String str3 = str2;
                    if (linkedHashMap.containsKey(str3)) {
                        Object obj = linkedHashMap.get(str3);
                        Intrinsics.b(obj);
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                com.gamericefishpro.space.bd.e.enqueue$default(this._operationRepo, new m(((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId(), ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
                this.purchaseTokens.addAll(arrayList2);
                this._prefs.saveString("GTPlayerPurchases", "purchaseTokens", this.purchaseTokens.toString());
                this._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                this.newAsExisting = false;
                this.isWaitingForPurchasesRequest = false;
            }
        } catch (Throwable th) {
            com.gamericefishpro.space.od.b.warn("Failed to track IAP purchases", th);
        }
    }

    private final void trackIAP() {
        if (this.mServiceConn != null) {
            if (this.mIInAppBillingService != null) {
                queryBoughtItems();
            }
        } else {
            b bVar = new b();
            this.mServiceConn = bVar;
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this._applicationService.getAppContext().getApplicationContext().bindService(intent, bVar, 1);
        }
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onFocus(boolean z) {
        trackIAP();
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.purchaseTokens.add(jSONArray.get(i).toString());
                }
                boolean z = jSONArray.length() == 0;
                this.newAsExisting = z;
                if (z) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    Intrinsics.b(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }

    @Override // com.gamericefishpro.space.lc.e
    public void onUnfocused() {
    }
}
