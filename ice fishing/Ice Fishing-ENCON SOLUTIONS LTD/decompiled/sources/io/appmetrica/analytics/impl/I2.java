package io.appmetrica.analytics.impl;

import A1.C0015p;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import i1.AbstractC0252i;
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

/* loaded from: classes.dex */
public abstract class I2 implements Da {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f4492n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final G2 f4493o = new G2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f4494a;

    /* renamed from: b, reason: collision with root package name */
    protected final Fh f4495b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f4496c;

    /* renamed from: d, reason: collision with root package name */
    protected final Rn f4497d;

    /* renamed from: e, reason: collision with root package name */
    protected final Eg f4498e;

    /* renamed from: f, reason: collision with root package name */
    protected final C0813v6 f4499f;

    /* renamed from: g, reason: collision with root package name */
    public final C0342d0 f4500g;

    /* renamed from: h, reason: collision with root package name */
    protected final C0851wi f4501h;

    /* renamed from: i, reason: collision with root package name */
    public C0637ob f4502i;

    /* renamed from: j, reason: collision with root package name */
    public final Cf f4503j;

    /* renamed from: k, reason: collision with root package name */
    public final M9 f4504k;

    /* renamed from: l, reason: collision with root package name */
    public final Je f4505l;

    /* renamed from: m, reason: collision with root package name */
    public final C0416fn f4506m;

    public I2(Context context, C0851wi c0851wi, Fh fh, M9 m9, C0709r6 c0709r6, Rn rn, Eg eg, C0813v6 c0813v6, C0342d0 c0342d0, Je je) {
        Context applicationContext = context.getApplicationContext();
        this.f4494a = applicationContext;
        this.f4501h = c0851wi;
        this.f4495b = fh;
        this.f4504k = m9;
        this.f4497d = rn;
        this.f4498e = eg;
        this.f4499f = c0813v6;
        this.f4500g = c0342d0;
        this.f4505l = je;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.b().getApiKey());
        this.f4496c = orCreatePublicLogger;
        if (Y2.a(fh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f4503j = c0709r6;
        this.f4506m = new C0416fn(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f4496c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f4496c.info("Put error environment pair <%s, %s>", str, str2);
        Fh fh = this.f4495b;
        synchronized (fh) {
            D8 d8 = fh.f4384c;
            d8.f4294b.b(d8.f4293a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0572lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(String str) {
        if (this.f4495b.f()) {
            return;
        }
        this.f4501h.f7119d.c();
        C0637ob c0637ob = this.f4502i;
        c0637ob.f6670a.removeCallbacks(c0637ob.f6672c, c0637ob.f6671b.f4495b.f4459b.getApiKey());
        this.f4495b.f4386e = true;
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3("", str, 3, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f4496c.info("Clear app environment", new Object[0]);
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        P5 n2 = M3.n();
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str = fh.f4387f;
        }
        c0851wi.a(new C0824vh(n2, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
    }

    public final void d(String str) {
        this.f4501h.f7119d.b();
        C0637ob c0637ob = this.f4502i;
        C0637ob.a(c0637ob.f6670a, c0637ob.f6671b, c0637ob.f6672c);
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3("", str, 6400, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4495b.f4386e = false;
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
        C0693qf c0693qf;
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        C0796uf c0796uf = fh.f4385d;
        synchronized (fh) {
            str = fh.f4387f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey());
        Set set = AbstractC0842w9.f7096a;
        JSONObject jSONObject = new JSONObject();
        if (c0796uf != null && (c0693qf = c0796uf.f6997a) != null) {
            try {
                jSONObject.put("preloadInfo", c0693qf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        m3.c(str);
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f4496c.info("Pause session", new Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f4496c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f4496c.info("Put app environment: <%s, %s>", str, str2);
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        P5 b2 = M3.b(str, str2);
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str3 = fh.f4387f;
        }
        c0851wi.a(new C0824vh(b2, false, 1, null, new Fh(bf, counterConfiguration, d8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0367e0 c0367e0 = new C0367e0(new C0393f0(this, map));
        C0558la c0558la = new C0558la();
        C0709r6 c0709r6 = C0294b4.l().f5582a;
        Thread a2 = c0367e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0367e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C0856wn c0856wn = (C0856wn) c0558la.apply(a2, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Bn());
        try {
            map2 = c0367e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a2 && thread != null) {
                arrayList.add((C0856wn) c0558la.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c0856wn, arrayList, c0709r6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f4496c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        for (Di di : eCommerceEvent.toProto()) {
            M3 m3 = new M3(LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey()));
            EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
            m3.f4907d = 41000;
            m3.f4905b = m3.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) di.f4305a)));
            m3.f4910g = di.f4306b.getBytesTruncated();
            Bf bf = new Bf(fh.f4458a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
            D8 d8 = fh.f4384c;
            synchronized (fh) {
                str = fh.f4387f;
            }
            c0851wi.a(new C0824vh(m3, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Dg dg = new Dg(str, a(th));
        C0851wi c0851wi = this.f4501h;
        byte[] byteArray = MessageNano.toByteArray(this.f4498e.fromModel(dg));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, str, 5892, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4496c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f4496c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3("", str, 1, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Ni ni = H2.f4457a;
        ni.getClass();
        C0702qo a2 = ni.a(revenue);
        if (!a2.f6792a) {
            this.f4496c.warning("Passed revenue is not valid. Reason: " + a2.f6793b, new Object[0]);
            return;
        }
        C0851wi c0851wi = this.f4501h;
        Oi oi = new Oi(revenue, this.f4496c);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        M3 a3 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey()), oi);
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str = fh.f4387f;
        }
        c0851wi.a(new C0824vh(a3, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f4496c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Qn a2 = Tn.a(th, new V(null, null, this.f4503j.a()), null, (String) this.f4504k.f4745b.a(), (Boolean) this.f4504k.f4746c.a());
        C0851wi c0851wi = this.f4501h;
        c0851wi.a(c0851wi.a(a2, this.f4495b));
        this.f4496c.info("Unhandled exception received: " + a2, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        Cdo cdo = new Cdo(Cdo.f5847c);
        Iterator<UserProfileUpdate<? extends InterfaceC0391eo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0391eo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f4496c);
            userProfileUpdatePatcher.a(cdo);
        }
        C0494io c0494io = new C0494io();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < cdo.f5848a.size(); i2++) {
            SparseArray sparseArray = cdo.f5848a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i2))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0417fo) it2.next());
            }
        }
        c0494io.f6233a = (C0417fo[]) arrayList.toArray(new C0417fo[arrayList.size()]);
        C0702qo a2 = f4493o.a(c0494io);
        if (!a2.f6792a) {
            this.f4496c.warning("UserInfo wasn't sent because " + a2.f6793b, new Object[0]);
            return;
        }
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        P5 a3 = M3.a(c0494io);
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str = fh.f4387f;
        }
        c0851wi.a(new C0824vh(a3, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f4496c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f4496c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f4496c.info("Send event buffer", new Object[0]);
        C0851wi c0851wi = this.f4501h;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        M3 m3 = new M3("", "", 256, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f4495b.f4459b.setDataSendingEnabled(z2);
        this.f4496c.info("Updated data sending enabled: %s", Boolean.valueOf(z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        m3.f4919p = Collections.singletonMap(str, bArr);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C0851wi c0851wi = this.f4501h;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        M3 m3 = new M3(LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey()));
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        m3.f4907d = 40962;
        m3.c(str);
        m3.f4905b = m3.e(str);
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str2 = fh.f4387f;
        }
        c0851wi.a(new C0824vh(m3, false, 1, null, new Fh(bf, counterConfiguration, d8, str2)));
        this.f4496c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z2) {
        String str;
        C0851wi c0851wi = this.f4501h;
        E e2 = new E(adRevenue, z2, this.f4506m, this.f4496c);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        M3 a2 = M3.a(LoggerStorage.getOrCreatePublicLogger(fh.f4459b.getApiKey()), e2);
        Bf bf = new Bf(fh.f4458a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(fh.f4459b);
        D8 d8 = fh.f4384c;
        synchronized (fh) {
            str = fh.f4387f;
        }
        c0851wi.a(new C0824vh(a2, false, 1, null, new Fh(bf, counterConfiguration, d8, str)));
        this.f4496c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0430gb.b(adRevenue.payload) + ", autoCollected=" + z2 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(String str, String str2) {
        this.f4496c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(str2, str, 1, 0, publicLogger);
        m3.f4915l = EnumC0583m9.JS;
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0572lo.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f4496c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(str2, str, 1, 0, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
    }

    public final Qn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof N1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Tn.a(th2, new V(null, null, this.f4503j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f4504k.f4745b.a(), (Boolean) this.f4504k.f4746c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        C0787u6 c0787u6 = new C0787u6(new Dg(str2, a(th)), str);
        C0851wi c0851wi = this.f4501h;
        byte[] byteArray = MessageNano.toByteArray(this.f4499f.fromModel(c0787u6));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4496c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Qn a2 = this.f4505l.a(pluginErrorDetails);
        C0851wi c0851wi = this.f4501h;
        Gn gn = a2.f4964a;
        String str = gn != null ? (String) WrapUtils.getOrDefault(gn.f4444a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f4497d.fromModel(a2));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, str, 5891, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4496c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(String str) {
        C0851wi c0851wi = this.f4501h;
        P5 a2 = P5.a(str);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(a2, fh), fh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return this.f4495b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        C0851wi c0851wi = this.f4501h;
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        c0851wi.a(new M3("", str, 1, 0, publicLogger), this.f4495b, 1, map);
        PublicLogger publicLogger2 = this.f4496c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(Qn qn) {
        C0851wi c0851wi = this.f4501h;
        C0824vh a2 = c0851wi.a(qn, this.f4495b);
        Fh fh = a2.f7069e;
        Pl pl = c0851wi.f7120e;
        if (pl != null) {
            fh.f4459b.setUuid(((Ol) pl).g());
        } else {
            fh.getClass();
        }
        c0851wi.f7118c.b(a2);
        this.f4496c.info("Unhandled exception received: " + qn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Qn qn;
        Je je = this.f4505l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        Dg dg = new Dg(str, qn);
        C0851wi c0851wi = this.f4501h;
        byte[] byteArray = MessageNano.toByteArray(this.f4498e.fromModel(dg));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, str, 5896, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4496c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0419g0
    public final void a(V v2) {
        C0316c0 c0316c0 = new C0316c0(v2, (String) this.f4504k.f4745b.a(), (Boolean) this.f4504k.f4746c.a());
        C0851wi c0851wi = this.f4501h;
        byte[] byteArray = MessageNano.toByteArray(this.f4500g.fromModel(c0316c0));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, "", 5968, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        String str = null;
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        PublicLogger publicLogger2 = this.f4496c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C0856wn c0856wn = v2.f5187a;
        if (c0856wn != null) {
            str = "Thread[name=" + c0856wn.f7155a + ",tid={" + c0856wn.f7157c + ", priority=" + c0856wn.f7156b + ", group=" + c0856wn.f7158d + "}] at " + AbstractC0252i.K(c0856wn.f7160f, "\n", null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        EnumC0583m9 enumC0583m9;
        if (f4492n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i2 = E8.f4349a[moduleEvent.getCategory().ordinal()];
        if (i2 == 1) {
            enumC0583m9 = EnumC0583m9.NATIVE;
        } else if (i2 == 2) {
            enumC0583m9 = EnumC0583m9.SYSTEM;
        } else {
            throw new C0015p();
        }
        m3.f4915l = enumC0583m9;
        m3.f4906c = AbstractC0430gb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            m3.f4919p = moduleEvent.getExtras();
        }
        this.f4501h.a(m3, this.f4495b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qn qn;
        Je je = this.f4505l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        C0787u6 c0787u6 = new C0787u6(new Dg(str2, qn), str);
        C0851wi c0851wi = this.f4501h;
        byte[] byteArray = MessageNano.toByteArray(this.f4499f.fromModel(c0787u6));
        PublicLogger publicLogger = this.f4496c;
        Set set = AbstractC0842w9.f7096a;
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        M3 m3 = new M3(byteArray, str2, 5896, publicLogger);
        Fh fh = this.f4495b;
        c0851wi.getClass();
        c0851wi.a(C0851wi.a(m3, fh), fh, 1, (Map) null);
        this.f4496c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
