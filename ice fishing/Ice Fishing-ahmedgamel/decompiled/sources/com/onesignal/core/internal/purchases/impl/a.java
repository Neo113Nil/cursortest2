package com.onesignal.core.internal.purchases.impl;

import A3.p;
import V5.g;
import V5.m;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.core.internal.config.c;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x4.e;
import x4.f;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.core.internal.startup.b, e {
    private static Class<?> iInAppBillingServiceClass;
    private final f _applicationService;
    private final c _configModelStore;
    private final U5.b _identityModelStore;
    private final H4.f _operationRepo;
    private final J4.b _prefs;
    private Method getPurchasesMethod;
    private Method getSkuDetailsMethod;
    private boolean isWaitingForPurchasesRequest;
    private Object mIInAppBillingService;
    private ServiceConnection mServiceConn;
    private boolean newAsExisting;
    private final List<String> purchaseTokens;
    public static final C0195a Companion = new C0195a(null);
    private static int iapEnabled = -99;

    /* renamed from: com.onesignal.core.internal.purchases.impl.a$a, reason: collision with other inner class name */
    public static final class C0195a {
        public /* synthetic */ C0195a(kotlin.jvm.internal.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getAsInterfaceMethod(Class<?> cls) {
            Method[] methods = cls.getMethods();
            h.d(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && h.a(parameterTypes[0], IBinder.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetPurchasesMethod(Class<?> cls) {
            h.b(cls);
            Method[] methods = cls.getMethods();
            h.d(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 4 && h.a(parameterTypes[0], Integer.TYPE) && h.a(parameterTypes[1], String.class) && h.a(parameterTypes[2], String.class) && h.a(parameterTypes[3], String.class)) {
                    return method;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Method getGetSkuDetailsMethod(Class<?> cls) {
            h.b(cls);
            Method[] methods = cls.getMethods();
            h.d(methods, "getMethods(...)");
            for (Method method : methods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                if (parameterTypes.length == 4 && h.a(parameterTypes[0], Integer.TYPE) && h.a(parameterTypes[1], String.class) && h.a(parameterTypes[2], String.class) && h.a(parameterTypes[3], Bundle.class) && h.a(returnType, Bundle.class)) {
                    return method;
                }
            }
            return null;
        }

        public final boolean canTrack(Context context) {
            h.e(context, "context");
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

        private C0195a() {
        }
    }

    public static final class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder service) {
            h.e(name, "name");
            h.e(service, "service");
            try {
                Method asInterfaceMethod = a.Companion.getAsInterfaceMethod(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                h.b(asInterfaceMethod);
                asInterfaceMethod.setAccessible(true);
                a.this.mIInAppBillingService = asInterfaceMethod.invoke(null, service);
                a.this.queryBoughtItems();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            h.e(name, "name");
            a.iapEnabled = -99;
            a.this.mIInAppBillingService = null;
        }
    }

    public a(f _applicationService, J4.b _prefs, H4.f _operationRepo, c _configModelStore, U5.b _identityModelStore) {
        h.e(_applicationService, "_applicationService");
        h.e(_prefs, "_prefs");
        h.e(_operationRepo, "_operationRepo");
        h.e(_configModelStore, "_configModelStore");
        h.e(_identityModelStore, "_identityModelStore");
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
        new Thread(new p(19, this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void queryBoughtItems$lambda$0(a this$0) {
        h.e(this$0, "this$0");
        this$0.isWaitingForPurchasesRequest = true;
        try {
            if (this$0.getPurchasesMethod == null) {
                Method getPurchasesMethod = Companion.getGetPurchasesMethod(iInAppBillingServiceClass);
                this$0.getPurchasesMethod = getPurchasesMethod;
                h.b(getPurchasesMethod);
                getPurchasesMethod.setAccessible(true);
            }
            Method method = this$0.getPurchasesMethod;
            h.b(method);
            Object invoke = method.invoke(this$0.mIInAppBillingService, 3, this$0._applicationService.getAppContext().getPackageName(), "inapp", null);
            h.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) invoke;
            if (bundle.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> arrayList2 = new ArrayList<>();
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                h.b(stringArrayList2);
                int size = stringArrayList2.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList2.get(i);
                    h.b(stringArrayList);
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
                h.b(getSkuDetailsMethod);
                getSkuDetailsMethod.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Method method = this.getSkuDetailsMethod;
            h.b(method);
            Object invoke = method.invoke(this.mIInAppBillingService, 3, this._applicationService.getAppContext().getPackageName(), "inapp", bundle);
            h.c(invoke, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle2 = (Bundle) invoke;
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                h.b(stringArrayList);
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString("productId");
                    String string2 = jSONObject.getString("price_currency_code");
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    h.d(divide, "divide(...)");
                    h.b(string);
                    h.b(string2);
                    linkedHashMap.put(string, new g(string, string2, divide));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (linkedHashMap.containsKey(next)) {
                        Object obj = linkedHashMap.get(next);
                        h.b(obj);
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                H4.e.enqueue$default(this._operationRepo, new m(((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId(), ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), ((U5.a) this._identityModelStore.getModel()).getExternalId(), this.newAsExisting, new BigDecimal(0), arrayList3), false, 2, null);
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

    @Override // x4.e
    public void onFocus(boolean z6) {
        trackIAP();
    }

    @Override // x4.e
    public void onUnfocused() {
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        if (Companion.canTrack(this._applicationService.getAppContext())) {
            try {
                JSONArray jSONArray = new JSONArray(this._prefs.getString("GTPlayerPurchases", "purchaseTokens", "[]"));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.purchaseTokens.add(jSONArray.get(i).toString());
                }
                boolean z6 = jSONArray.length() == 0;
                this.newAsExisting = z6;
                if (z6) {
                    Boolean bool = this._prefs.getBool("GTPlayerPurchases", "ExistingPurchases", Boolean.TRUE);
                    h.b(bool);
                    this.newAsExisting = bool.booleanValue();
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            this._applicationService.addApplicationLifecycleHandler(this);
            trackIAP();
        }
    }
}
