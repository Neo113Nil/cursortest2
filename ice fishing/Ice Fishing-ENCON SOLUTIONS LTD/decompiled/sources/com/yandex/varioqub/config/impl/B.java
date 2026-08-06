package com.yandex.varioqub.config.impl;

import a.AbstractC0083a;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Log;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import i1.AbstractC0252i;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final class B implements VarioqubApi {

    /* renamed from: a, reason: collision with root package name */
    public C0138a f2739a;

    /* renamed from: b, reason: collision with root package name */
    public C0140c f2740b;

    /* renamed from: c, reason: collision with root package name */
    public t f2741c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f2742d;

    /* renamed from: e, reason: collision with root package name */
    public g f2743e;

    /* renamed from: f, reason: collision with root package name */
    public VarioqubSettings f2744f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f2745g = new AtomicBoolean(false);

    /* JADX WARN: Finally extract failed */
    public static final void a(B b2, OnFetchCompleteListener onFetchCompleteListener) {
        LinkedHashMap N2;
        Object wVar;
        C0140c c0140c;
        boolean z2;
        J1.q qVar;
        C0140c c0140c2 = b2.f2740b;
        if (c0140c2 == null) {
            kotlin.jvm.internal.i.i("configFetcher");
            throw null;
        }
        VarioqubSettings varioqubSettings = b2.f2744f;
        if (varioqubSettings == null) {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
        g gVar = b2.f2743e;
        if (gVar == null) {
            kotlin.jvm.internal.i.i("identifierProvider");
            throw null;
        }
        c0140c2.a();
        h hVar = gVar.f2771b.await(10L, TimeUnit.SECONDS) ? new h(gVar.f2772c, gVar.f2773d) : null;
        if (hVar == null) {
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("identifiers is null", FetchError.IDENTIFIERS_NULL);
                return;
            }
            return;
        }
        c0140c2.f2758e.getClass();
        if (System.currentTimeMillis() - c0140c2.f2759f <= c0140c2.f2755b) {
            if (C.f2746a) {
                Log.d("Varioqub/ConfigFetcher", "fetch request was throttled");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("fetch request was throttled", FetchError.REQUEST_THROTTLED);
                return;
            }
            return;
        }
        l.b(1);
        i iVar = c0140c2.f2754a;
        String a2 = D.a(varioqubSettings.getClientId$config_release());
        String str = c0140c2.f2762i;
        String str2 = hVar.f2774a;
        String str3 = hVar.f2775b;
        Map<String, String> clientFeatures$config_release = varioqubSettings.getClientFeatures$config_release();
        String adapterName = c0140c2.f2757d.f2748a.getAdapterName();
        p pVar = new p();
        pVar.f2789a = str;
        pVar.f2790b = str2;
        pVar.f2794f = AbstractC0139b.c().versionName;
        pVar.f2795g = AbstractC0139b.d();
        pVar.f2792d = "0.7.0";
        pVar.f2793e = ConstantDeviceInfo.APP_PLATFORM;
        pVar.f2796h = AbstractC0139b.b();
        pVar.f2797i = str3;
        ArrayList arrayList = new ArrayList(clientFeatures$config_release.size());
        for (Map.Entry<String, String> entry : clientFeatures$config_release.entrySet()) {
            n nVar = new n();
            nVar.f2784a = entry.getKey();
            nVar.f2785b = entry.getValue();
            arrayList.add(nVar);
        }
        Object[] array = arrayList.toArray(new n[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pVar.f2791c = (n[]) array;
        synchronized (l.f2782c) {
            N2 = i1.u.N(l.f2781b);
        }
        int size = N2.size();
        o[] oVarArr = new o[size];
        for (int i2 = 0; i2 < size; i2++) {
            oVarArr[i2] = new o();
        }
        int i3 = 0;
        for (Object obj : N2.entrySet()) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            o oVar = new o();
            oVar.f2787a = (String) ((Map.Entry) obj).getKey();
            oVar.f2788b = ((Number) r12.getValue()).longValue();
            oVarArr[i3] = oVar;
            i3 = i4;
            c0140c2 = c0140c2;
        }
        C0140c c0140c3 = c0140c2;
        pVar.f2798j = oVarArr;
        pVar.f2799k = String.valueOf(AbstractC0139b.a());
        pVar.f2800l = Build.VERSION.RELEASE;
        pVar.f2801m = adapterName;
        pVar.f2802n = adapterName;
        String str4 = "Varioqub request formed - " + pVar;
        if (C.f2746a) {
            Log.d("Varioqub/RequestBodyFormer", str4);
        }
        byte[] byteArray = MessageNano.toByteArray(pVar);
        if (iVar.f2777b.compareAndSet(false, true)) {
            Context context = AbstractC0141d.f2767a;
            if (context == null) {
                kotlin.jvm.internal.i.i("appContext");
                throw null;
            }
            String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("etag", "");
            if (string == null) {
                string = "";
            }
            iVar.f2778c = string;
        }
        String str5 = "Network request to: " + a2 + ". Content length - " + byteArray.length;
        if (C.f2746a) {
            Log.d("Varioqub/NetworkClient", str5);
        }
        try {
            J1.u uVar = new J1.u();
            Pattern pattern = J1.q.f913a;
            try {
                qVar = R1.d.n();
            } catch (IllegalArgumentException unused) {
                qVar = null;
            }
            int length = byteArray.length;
            K1.b.c(byteArray.length, 0, length);
            uVar.c("POST", new J1.w(qVar, length, byteArray, 0));
            uVar.d(a2);
            uVar.b("If-None-Match", iVar.f2778c);
            J1.v a3 = uVar.a();
            J1.s sVar = iVar.f2776a;
            sVar.getClass();
            J1.y c2 = new N1.i(sVar, a3).c();
            try {
                String a4 = J1.y.a(c2, "ETag");
                if (a4 == null) {
                    a4 = "";
                }
                iVar.f2778c = a4;
                m.b(a4);
                int i5 = c2.f1003d;
                if (200 > i5 || i5 >= 300) {
                    wVar = i5 == 304 ? v.f2817a : new x(i5);
                } else {
                    J1.z zVar = c2.f1006g;
                    byte[] a5 = zVar != null ? zVar.a() : null;
                    if (a5 == null) {
                        a5 = new byte[0];
                    }
                    wVar = new y(a5);
                }
                AbstractC0083a.e(c2, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC0083a.e(c2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            String str6 = "request for " + a2 + " failed : ";
            if (C.f2746a) {
                Log.e("Varioqub/NetworkClient", str6, th3);
            }
            wVar = new w(th3);
        }
        if (wVar instanceof v) {
            if (C.f2746a) {
                Log.d("Varioqub/ConfigFetcher", "fetch response from cache");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onSuccess();
            }
        } else if (wVar instanceof w) {
            String str7 = "fetch failed with exception " + ((w) wVar).f2818a;
            if (C.f2746a) {
                Log.d("Varioqub/ConfigFetcher", str7);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str7, FetchError.INTERNAL_ERROR);
            }
        } else if (wVar instanceof x) {
            String str8 = "failed with network code " + ((x) wVar).f2819a;
            if (C.f2746a) {
                Log.d("Varioqub/ConfigFetcher", str8);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str8, FetchError.NETWORK_ERROR);
            }
        } else if (wVar instanceof y) {
            y yVar = (y) wVar;
            c0140c = c0140c3;
            c0140c.f2761h.clear();
            if (yVar.f2820a.length == 0) {
                boolean z3 = C.f2746a;
                if (z3 && z3) {
                    Log.e("Varioqub/Varioqub/ConfigFetcher", "fetch failed with empty body", null);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("fetch failed with empty body", FetchError.EMPTY_RESULT);
                }
            }
            try {
                r rVar = (r) MessageNano.mergeFrom(new r(), yVar.f2820a);
                String str9 = "fetched config - " + rVar;
                if (C.f2746a) {
                    Log.d("Varioqub/ConfigFetcher", str9);
                }
                c0140c.f2766m = !kotlin.jvm.internal.i.a(c0140c.f2763j, rVar.f2807b);
                c0140c.f2763j = rVar.f2807b;
                c0140c.f2762i = rVar.f2806a;
                c0140c.f2764k = rVar.f2809d;
                for (q qVar2 : rVar.f2808c) {
                    String str10 = qVar2.f2804a;
                    s[] sVarArr = qVar2.f2805b;
                    kotlin.jvm.internal.i.e(sVarArr, "<this>");
                    if (sVarArr.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    long j2 = sVarArr[sVarArr.length - 1].f2812b;
                    s[] sVarArr2 = qVar2.f2805b;
                    kotlin.jvm.internal.i.e(sVarArr2, "<this>");
                    if (sVarArr2.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    s sVar2 = sVarArr2[sVarArr2.length - 1];
                    c0140c.f2761h.put(str10, new ConfigValue(sVar2.f2813c ? null : sVar2.f2811a, 2, j2));
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onSuccess();
                }
                c0140c.f2758e.getClass();
                c0140c.f2760g = System.currentTimeMillis();
            } catch (Throwable th4) {
                if (C.f2746a) {
                    Log.e("Varioqub/ConfigFetcher", "exception while fetch ", th4);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("exception while fetch ", FetchError.RESPONSE_PARSE_ERROR);
                }
            }
            c0140c.f2758e.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c0140c.f2759f = currentTimeMillis;
            m.a(currentTimeMillis);
            m.b(c0140c.f2760g);
            if (!m.a().edit().putString("experiments", c0140c.f2763j).commit() && (z2 = C.f2746a) && z2) {
                Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
            }
            m.c(c0140c.f2762i);
            m.b(c0140c.f2761h);
            m.a(c0140c.f2766m);
            l.a(1);
        }
        c0140c = c0140c3;
        c0140c.f2758e.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        c0140c.f2759f = currentTimeMillis2;
        m.a(currentTimeMillis2);
        m.b(c0140c.f2760g);
        if (!m.a().edit().putString("experiments", c0140c.f2763j).commit()) {
            Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
        }
        m.c(c0140c.f2762i);
        m.b(c0140c.f2761h);
        m.a(c0140c.f2766m);
        l.a(1);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(InterfaceC1046a interfaceC1046a) {
        a();
        C0140c c0140c = this.f2740b;
        if (c0140c == null) {
            kotlin.jvm.internal.i.i("configFetcher");
            throw null;
        }
        c0140c.a();
        C0138a c0138a = c0140c.f2757d;
        String str = c0140c.f2764k;
        long j2 = c0140c.f2760g;
        if (!kotlin.jvm.internal.i.a(c0138a.f2752e, str) && c0138a.f2749b.getActivateEvent$config_release()) {
            c0138a.f2748a.reportConfigChanged(new ConfigData(c0138a.f2752e, str, j2));
            m.a(str);
        }
        c0138a.f2752e = str;
        if (c0140c.f2766m) {
            C0138a c0138a2 = c0140c.f2757d;
            Collection values = c0140c.f2761h.values();
            c0138a2.getClass();
            ArrayList arrayList = new ArrayList(i1.k.E(values));
            Iterator it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ConfigValue) it.next()).getTestId()));
            }
            Set V2 = AbstractC0252i.V(arrayList);
            Set other = c0138a2.f2750c;
            kotlin.jvm.internal.i.e(other, "other");
            Set U2 = AbstractC0252i.U(V2);
            U2.retainAll(other);
            Set<Long> U3 = AbstractC0252i.U(U2);
            c0138a2.f2750c = U3;
            c0138a2.f2748a.setTriggeredTestIds(U3);
            m.a(c0138a2.f2750c);
            C0138a c0138a3 = c0140c.f2757d;
            String str2 = c0140c.f2763j;
            c0138a3.f2751d = str2;
            c0138a3.f2748a.setExperiments(str2);
            c0140c.f2766m = false;
        }
        t tVar = c0140c.f2756c;
        HashMap hashMap = new HashMap(c0140c.f2761h);
        tVar.a();
        tVar.f2815b = hashMap;
        m.a(hashMap);
        if (interfaceC1046a != null) {
            interfaceC1046a.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        Executor executor = this.f2742d;
        if (executor != null) {
            executor.execute(new F0.a(1, this));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        a();
        Executor executor = this.f2742d;
        if (executor != null) {
            executor.execute(new F0.c(0, this, onFetchCompleteListener));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final Set getAllKeys() {
        a();
        t tVar = this.f2741c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.a();
        Set keySet = tVar.f2815b.keySet();
        Set other = tVar.f2814a.keySet();
        kotlin.jvm.internal.i.e(keySet, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        Set U2 = AbstractC0252i.U(keySet);
        U2.addAll(other);
        return AbstractC0252i.V(U2);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final boolean getBoolean(String str, boolean z2) {
        ConfigValue value = getValue(str);
        return value != null ? value.asBoolean() : z2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final double getDouble(String str, double d2) {
        ConfigValue value = getValue(str);
        return value != null ? value.asDouble() : d2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getId() {
        a();
        C0140c c0140c = this.f2740b;
        if (c0140c != null) {
            c0140c.a();
            return c0140c.f2762i;
        }
        kotlin.jvm.internal.i.i("configFetcher");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final long getLong(String str, long j2) {
        ConfigValue value = getValue(str);
        return value != null ? value.asLong() : j2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getString(String str, String str2) {
        String asString;
        ConfigValue value = getValue(str);
        return (value == null || (asString = value.asString()) == null) ? str2 : asString;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final ConfigValue getValue(String str) {
        a();
        t tVar = this.f2741c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.a();
        ConfigValue configValue = (ConfigValue) tVar.f2815b.get(str);
        if (configValue == null) {
            tVar.a();
            configValue = (ConfigValue) tVar.f2814a.get(str);
        }
        if (configValue == null || configValue.getTestId() <= 0) {
            return configValue;
        }
        C0138a c0138a = this.f2739a;
        if (c0138a == null) {
            kotlin.jvm.internal.i.i("analyticAdapter");
            throw null;
        }
        long testId = configValue.getTestId();
        synchronized (c0138a.f2753f) {
            c0138a.f2750c.add(Long.valueOf(testId));
        }
        c0138a.f2748a.setTriggeredTestIds(c0138a.f2750c);
        m.a(c0138a.f2750c);
        if (configValue.getValue() != null) {
            return configValue;
        }
        t tVar2 = this.f2741c;
        if (tVar2 != null) {
            tVar2.a();
            return (ConfigValue) tVar2.f2814a.get(str);
        }
        kotlin.jvm.internal.i.i("storage");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        if (this.f2745g.get()) {
            return;
        }
        synchronized (this) {
            if (!this.f2745g.get()) {
                l.b(2);
                C0138a c0138a = new C0138a(varioqubConfigAdapter, varioqubSettings);
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                t tVar = new t();
                a(varioqubSettings, c0138a, newSingleThreadExecutor, context, tVar, new C0140c(new i(), TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec$config_release()), tVar, c0138a, new u()), new g(c0138a));
                l.a(2);
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(String str, String str2) {
        Executor executor = this.f2742d;
        if (executor != null) {
            executor.execute(new F0.b(this, str, str2, 0));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(Map map) {
        a();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), ConfigValue.Companion.createInappDefault$config_release(entry.getValue().toString()));
        }
        t tVar = this.f2741c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        tVar.f2814a = hashMap;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i2, InterfaceC1046a interfaceC1046a) {
        a();
        Executor executor = this.f2742d;
        if (executor != null) {
            executor.execute(new F0.d(this, i2, interfaceC1046a, 0));
        } else {
            kotlin.jvm.internal.i.i("executor");
            throw null;
        }
    }

    public static final void a(B b2, int i2, InterfaceC1046a interfaceC1046a) {
        t tVar = b2.f2741c;
        if (tVar == null) {
            kotlin.jvm.internal.i.i("storage");
            throw null;
        }
        if (i2 != -1) {
            Context context = AbstractC0141d.f2767a;
            if (context != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (context.getResources() != null) {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (xml.next() != 1) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            str2 = xml.getName();
                        } else if (eventType == 3) {
                            if (kotlin.jvm.internal.i.a(xml.getName(), "entry") && str.length() > 0 && str3.length() > 0) {
                                linkedHashMap.put(str, ConfigValue.Companion.createInappDefault$config_release(str3));
                            }
                            str2 = "";
                        } else if (eventType == 4) {
                            if (kotlin.jvm.internal.i.a(str2, "key")) {
                                str = xml.getText();
                            } else if (kotlin.jvm.internal.i.a(str2, "value")) {
                                str3 = xml.getText();
                            }
                        }
                    }
                }
                tVar.f2814a = linkedHashMap;
                if (interfaceC1046a != null) {
                    interfaceC1046a.invoke();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.i("appContext");
            throw null;
        }
        throw new IllegalArgumentException(C1.a.f(i2, "Invalid resId: "));
    }

    public static final void a(B b2, String str, String str2) {
        VarioqubSettings varioqubSettings = b2.f2744f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
    }

    public static final void a(B b2) {
        VarioqubSettings varioqubSettings = b2.f2744f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            kotlin.jvm.internal.i.i("settings");
            throw null;
        }
    }

    public final void a() {
        if (!this.f2745g.get()) {
            throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    public final void a(VarioqubSettings varioqubSettings, C0138a c0138a, ExecutorService executorService, Context context, t tVar, C0140c c0140c, g gVar) {
        this.f2744f = varioqubSettings;
        this.f2739a = c0138a;
        this.f2741c = tVar;
        this.f2740b = c0140c;
        this.f2742d = executorService;
        this.f2743e = gVar;
        AbstractC0141d.f2767a = context.getApplicationContext();
        D.f2747a = varioqubSettings.getUrl$config_release();
        C.f2746a = varioqubSettings.getLogs$config_release();
        String string = m.a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c0138a.f2751d = string;
        c0138a.f2750c = m.b();
        String string2 = m.a().getString("config_version", "");
        c0138a.f2752e = string2 != null ? string2 : "";
        c0138a.f2748a.setExperiments(c0138a.f2751d);
        c0138a.f2748a.setTriggeredTestIds(c0138a.f2750c);
        this.f2745g.set(true);
        executorService.execute(new F0.a(0, gVar));
    }

    public static final void a(g gVar) {
        gVar.getClass();
        l.b(3);
        C0138a c0138a = gVar.f2770a;
        c0138a.f2748a.requestDeviceId(new e(gVar));
        C0138a c0138a2 = gVar.f2770a;
        c0138a2.f2748a.requestUserId(new f(gVar));
    }
}
