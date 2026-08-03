package com.onesignal.core.internal.purchases.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kb.g;
import kb.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pc.j;
import q8.e;
import q8.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements d9.b, e {
    private static Class<?> iInAppBillingServiceClass;
    private final f _applicationService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final jb.b _identityModelStore;
    private final z8.f _operationRepo;
    private final c9.b _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final C0021a Companion = new C0021a(null);
    private static int iapEnabled = -99;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.core.internal.purchases.impl.a$a, reason: collision with other inner class name */
    public static final class C0021a {
        public /* synthetic */ C0021a(pc.f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            j.d(methods, "clazz.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && j.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            j.b(cls);
            Method[] methods = cls.getMethods();
            j.d(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && j.a(parameterTypes[0], Integer.TYPE) && j.a(parameterTypes[1], String.class) && j.a(parameterTypes[2], String.class) && j.a(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            j.b(cls);
            Method[] methods = cls.getMethods();
            j.d(methods, "clazz!!.methods");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && j.a(parameterTypes[0], Integer.TYPE) && j.a(parameterTypes[1], String.class) && j.a(parameterTypes[2], String.class) && j.a(parameterTypes[3], Bundle.class) && j.a(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            j.e(context, "context");
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

        private C0021a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.e(componentName, "name");
            j.e(iBinder, "service");
            try {
                Method asInterfaceMethod = a.Companion.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                j.b(asInterfaceMethod);
                asInterfaceMethod.setAccessible(true);
                a.this.mIInAppBillingService = asInterfaceMethod.invoke(null, iBinder);
                a.this.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j.e(componentName, "name");
            a.iapEnabled = -99;
            a.this.mIInAppBillingService = null;
        }
    }

    public a(f fVar, c9.b bVar, z8.f fVar2, com.onesignal.core.internal.config.b bVar2, jb.b bVar3) {
        j.e(fVar, "_applicationService");
        j.e(bVar, "_prefs");
        j.e(fVar2, "_operationRepo");
        j.e(bVar2, "_configModelStore");
        j.e(bVar3, "_identityModelStore");
        this._applicationService = fVar;
        this._prefs = bVar;
        this._operationRepo = fVar2;
        this._configModelStore = bVar2;
        this._identityModelStore = bVar3;
        this.purchaseTokens = new ArrayList();
        this.newAsExisting = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryBoughtItems() {
        if (this.isWaitingForPurchasesRequest) {
            return;
        }
        new Thread(new a1.a(5, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: queryBoughtItems$lambda-0, reason: not valid java name */
    public static final void m9queryBoughtItems$lambda0(a aVar) {
        j.e(aVar, "this$0");
        aVar.isWaitingForPurchasesRequest = true;
        try {
            if (aVar.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                aVar.getPurchasesMethod = getPurchasesMethod;
                j.b(getPurchasesMethod);
                getPurchasesMethod.setAccessible(true);
            }
            Method method = aVar.getPurchasesMethod;
            j.b(method);
            Object invoke = method.invoke(aVar.mIInAppBillingService, 3, aVar._applicationService.getAppContext().getPackageName(), "inapp", null);
            j.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) invoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                j.b(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = stringArrayList2.get(i10);
                    j.b(stringArrayList);
                    String str2 = stringArrayList.get(i10);
                    String string = new JSONObject(str).getString("purchaseToken");
                    if (!aVar.purchaseTokens.contains(string) && !arrayList2.contains(string)) {
                        arrayList2.add(string);
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    aVar.sendPurchases(arrayList, arrayList2);
                } else if (stringArrayList2.size() == 0) {
                    aVar.newAsExisting = false;
                    aVar._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.FALSE);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aVar.isWaitingForPurchasesRequest = false;
    }

    private final void sendPurchases(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.getSkuDetailsMethod == null) {
                Method getSkuDetailsMethod = Companion.getGetSkuDetailsMethod(iInAppBillingServiceClass);
                this.getSkuDetailsMethod = getSkuDetailsMethod;
                j.b(getSkuDetailsMethod);
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            j.b(method);
            Object invoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            j.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) invoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                j.b(stringArrayList);
                int size = stringArrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    String str = stringArrayList.get(i10);
                    i10++;
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    j.d(divide, "price.divide(BigDecimal(1000000))");
                    j.d(string, "sku");
                    j.d(string2, "iso");
                    linkedHashMap.put(string, new g(string, string2, divide));
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i11 = 0;
                while (i11 < size2) {
                    String str2 = arrayList.get(i11);
                    i11++;
                    String str3 = str2;
                    if (linkedHashMap.containsKey(str3)) {
                        Object obj = linkedHashMap.get(str3);
                        j.b(obj);
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                z8.e.enqueue$default(this._operationRepo, new l(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId(), ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
                this.purchaseTokens.addAll(arrayList2);
                this._prefs.saveString("GTPlayerPurchases", "purchaseTokens", this.purchaseTokens.toString());
                this._prefs.saveBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                this.newAsExisting = false;
                this.isWaitingForPurchasesRequest = false;
            }
        } catch (Throwable th) {
            com.onesignal.debug.internal.logging.b.warn("Failed to track IAP purchases", th);
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

    @Override // q8.e
    public void onFocus(boolean z10) {
        trackIAP();
    }

    @Override // d9.b
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.purchaseTokens.add(jSONArray.get(i10).toString());
                }
                boolean z10 = jSONArray.length() == 0;
                this.newAsExisting = z10;
                if (z10) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    j.b(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }

    @Override // q8.e
    public void onUnfocused() {
    }
}
