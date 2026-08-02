package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import defpackage.w511;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0842x3 implements InterfaceC0274dc {
    public static final HashSet n = new HashSet(Arrays.asList(1, 13));
    public static final C0784v3 o = new C0784v3();
    protected final Context a;
    protected final C0714sk b;
    protected final PublicLogger c;
    protected final C0635pr d;
    protected final C0569nj e;
    protected final C0730t7 f;
    public final C0434j0 g;
    protected final C0600ol h;
    public C0275dd i;
    public final InterfaceC0626pi j;
    public final C0244cb k;
    public final C0827wh l;
    public final Aq m;

    public AbstractC0842x3(Context context, C0600ol c0600ol, C0714sk c0714sk, C0244cb c0244cb, C0615p7 c0615p7, C0635pr c0635pr, C0569nj c0569nj, C0730t7 c0730t7, C0434j0 c0434j0, C0827wh c0827wh) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.h = c0600ol;
        this.b = c0714sk;
        this.k = c0244cb;
        this.d = c0635pr;
        this.e = c0569nj;
        this.f = c0730t7;
        this.g = c0434j0;
        this.l = c0827wh;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0714sk.b().getApiKey());
        this.c = orCreatePublicLogger;
        if (N3.a(c0714sk.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = c0615p7;
        this.m = new Aq(applicationContext);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0521m0
    public final void a(C0204b0 c0204b0) {
        C0406i0 c0406i0 = new C0406i0(c0204b0, (String) this.k.b.a(), (Boolean) this.k.c.a());
        C0600ol c0600ol = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.g.fromModel(c0406i0));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, "", 5968, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        String str = null;
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        Uq uq = c0204b0.a;
        if (uq != null) {
            str = "Thread[name=" + uq.a + ",tid={" + uq.c + ", priority=" + uq.b + ", group=" + uq.d + "}] at " + kotlin.collections.a.X(uq.f, "\n", null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(str2, str, 1, 0, publicLogger);
        g4.l = Ba.JS;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    public final void c(String str) {
        if (this.b.f()) {
            return;
        }
        this.h.d.c();
        C0275dd c0275dd = this.i;
        c0275dd.a.removeCallbacks(c0275dd.c, c0275dd.b.b.b.getApiKey());
        this.b.e = true;
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4("", str, 3, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.c.info("Clear app environment", new Object[0]);
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        K6 n2 = G4.n();
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        c0600ol.a(new C0425ik(n2, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
    }

    public final void d(String str) {
        this.h.d.b();
        C0275dd c0275dd = this.i;
        C0275dd.a(c0275dd.a, c0275dd.b, c0275dd.c);
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4("", str, 6400, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.b.e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C0251ci c0251ci;
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        C0366gi c0366gi = c0714sk.d;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey());
        Set set = La.a;
        JSONObject jSONObject = new JSONObject();
        if (c0366gi != null && (c0251ci = c0366gi.a) != null) {
            try {
                jSONObject.put("preloadInfo", c0251ci.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        g4.c(str);
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        PublicLogger publicLogger = this.c;
        if (isEmpty) {
            publicLogger.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        publicLogger.info("Put app environment: <%s, %s>", str, str2);
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        K6 b = G4.b(str, str2);
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str3 = c0714sk.f;
        }
        c0600ol.a(new C0425ik(b, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str3)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        C0600ol c0600ol = this.h;
        G g = new G(adRevenue, z, this.m, this.c);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        G4 a = G4.a(LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey()), g);
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        c0600ol.a(new C0425ik(a, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
        this.c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + Vc.c(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0463k0 c0463k0 = new C0463k0(new C0492l0(this, map));
        Eb eb = new Eb();
        C0615p7 c0615p7 = V4.l().a;
        Thread a = c0463k0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0463k0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        Uq uq = (Uq) eb.apply(a, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Zq());
        try {
            map2 = c0463k0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a && thread != null) {
                arrayList.add((Uq) eb.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new C0204b0(uq, arrayList, c0615p7.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        for (C0802vl c0802vl : eCommerceEvent.toProto()) {
            G4 g4 = new G4(LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey()));
            Hc hc = Hc.EVENT_TYPE_UNDEFINED;
            g4.d = 41000;
            g4.b = g4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) c0802vl.a)));
            g4.g = c0802vl.b.getBytesTruncated();
            C0597oi c0597oi = new C0597oi(c0714sk.a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
            R9 r9 = c0714sk.c;
            synchronized (c0714sk) {
                str = c0714sk.f;
            }
            c0600ol.a(new C0425ik(g4, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C0606or c0606or;
        C0827wh c0827wh = this.l;
        if (pluginErrorDetails != null) {
            c0606or = c0827wh.a(pluginErrorDetails);
        } else {
            c0827wh.getClass();
            c0606or = null;
        }
        C0701s7 c0701s7 = new C0701s7(new C0540mj(str2, c0606or), str);
        C0600ol c0600ol = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c0701s7));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, str2, 5896, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        Ba ba;
        if (n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i = T9.a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            ba = Ba.NATIVE;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            ba = Ba.SYSTEM;
        }
        g4.l = ba;
        g4.c = Vc.c(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            g4.p = moduleEvent.getExtras();
        }
        this.h.a(g4, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Gl gl = AbstractC0813w3.a;
        gl.getClass();
        Tr a = gl.a(revenue);
        if (!a.a) {
            this.c.warning("Passed revenue is not valid. Reason: " + a.b, new Object[0]);
            return;
        }
        C0600ol c0600ol = this.h;
        Hl hl = new Hl(revenue, this.c);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        G4 a2 = G4.a(LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey()), hl);
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        c0600ol.a(new C0425ik(a2, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
        this.c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        C0606or a = this.l.a(pluginErrorDetails);
        C0600ol c0600ol = this.h;
        C0317er c0317er = a.a;
        String str = c0317er != null ? (String) WrapUtils.getOrDefault(c0317er.a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.d.fromModel(a));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, str, 5891, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        Gr gr = new Gr(Gr.c);
        Iterator<UserProfileUpdate<? extends Hr>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            Hr userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.c);
            userProfileUpdatePatcher.a(gr);
        }
        Lr lr = new Lr();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < gr.a.size(); i++) {
            SparseArray sparseArray = gr.a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((Ir) it2.next());
            }
        }
        lr.a = (Ir[]) arrayList.toArray(new Ir[arrayList.size()]);
        Tr a = o.a(lr);
        if (!a.a) {
            this.c.warning("UserInfo wasn't sent because " + a.b, new Object[0]);
            return;
        }
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        K6 a2 = G4.a(lr);
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str = c0714sk.f;
        }
        c0600ol.a(new C0425ik(a2, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str)));
        this.c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        C0600ol c0600ol = this.h;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        G4 g4 = new G4("", "", 256, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.b.setDataSendingEnabled(z);
        this.c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4("", (String) null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        g4.p = Collections.singletonMap(str, bArr);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C0600ol c0600ol = this.h;
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        G4 g4 = new G4(LoggerStorage.getOrCreatePublicLogger(c0714sk.b.getApiKey()));
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        g4.d = 40962;
        g4.c(str);
        g4.b = g4.e(str);
        C0597oi c0597oi = new C0597oi(c0714sk.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0714sk.b);
        R9 r9 = c0714sk.c;
        synchronized (c0714sk) {
            str2 = c0714sk.f;
        }
        c0600ol.a(new C0425ik(g4, false, 1, null, new C0714sk(c0597oi, counterConfiguration, r9, str2)));
        this.c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    public final boolean d() {
        return this.b.f();
    }

    public final void b(Map<String, String> map) {
        if (Or.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str) {
        C0600ol c0600ol = this.h;
        K6 a = K6.a(str);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(a, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C0701s7 c0701s7 = new C0701s7(new C0540mj(str2, a(th)), str);
        C0600ol c0600ol = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c0701s7));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, str2, 5896, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        C0606or a = AbstractC0692rr.a(th, new C0204b0(null, null, this.j.a()), null, (String) this.k.b.a(), (Boolean) this.k.c.a());
        C0600ol c0600ol = this.h;
        c0600ol.a(c0600ol.a(a, this.b));
        this.c.info("Unhandled exception received: " + a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        C0606or c0606or;
        C0827wh c0827wh = this.l;
        if (pluginErrorDetails != null) {
            c0606or = c0827wh.a(pluginErrorDetails);
        } else {
            c0827wh.getClass();
            c0606or = null;
        }
        C0540mj c0540mj = new C0540mj(str, c0606or);
        C0600ol c0600ol = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(c0540mj));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, str, 5896, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        C0540mj c0540mj = new C0540mj(str, a(th));
        C0600ol c0600ol = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(c0540mj));
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(byteArray, str, 5892, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4(str2, str, 1, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        c0600ol.a(new G4("", str, 1, 0, publicLogger), this.b, 1, map);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0600ol c0600ol = this.h;
        PublicLogger publicLogger = this.c;
        Set set = La.a;
        Hc hc = Hc.EVENT_TYPE_UNDEFINED;
        G4 g4 = new G4("", str, 1, 0, publicLogger);
        C0714sk c0714sk = this.b;
        c0600ol.getClass();
        c0600ol.a(C0600ol.a(g4, c0714sk), c0714sk, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (Or.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    public final C0606or a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C0870y2) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return AbstractC0692rr.a(th2, new C0204b0(null, null, this.j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.k.b.a(), (Boolean) this.k.c.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0735tc
    public final void a(C0606or c0606or) {
        pauseSession();
        C0600ol c0600ol = this.h;
        C0425ik a = c0600ol.a(c0606or, this.b);
        C0714sk c0714sk = a.e;
        InterfaceC0488kp interfaceC0488kp = c0600ol.e;
        if (interfaceC0488kp != null) {
            c0714sk.b.setUuid(((C0459jp) interfaceC0488kp).g());
        } else {
            c0714sk.getClass();
        }
        c0600ol.c.b(a);
        this.c.info("Unhandled exception received: " + c0606or, new Object[0]);
    }

    public void a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        PublicLogger publicLogger = this.c;
        if (isEmpty) {
            publicLogger.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        publicLogger.info("Put error environment pair <%s, %s>", str, str2);
        C0714sk c0714sk = this.b;
        synchronized (c0714sk) {
            R9 r9 = c0714sk.c;
            r9.b.b(r9.a, str, str2);
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }
}
