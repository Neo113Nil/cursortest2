package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.b6e;
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
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.x3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0768x3 implements Ob {
    public static final HashSet n = new HashSet(Arrays.asList(1, 13));
    public static final C0710v3 o = new C0710v3();
    protected final Context a;
    protected final C0351ik b;

    @NonNull
    protected final PublicLogger c;

    @NonNull
    protected final Wq d;

    @NonNull
    protected final C0322hj e;

    @NonNull
    protected final C0512o7 f;
    public final C0303h0 g;
    protected final C0237el h;
    public Nc i;
    public final Yh j;
    public final Ua k;
    public final C0291gh l;
    public final C0386jq m;

    public AbstractC0768x3(Context context, C0237el c0237el, C0351ik c0351ik, Ua ua, C0396k7 c0396k7, Wq wq, C0322hj c0322hj, C0512o7 c0512o7, C0303h0 c0303h0, C0291gh c0291gh) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.h = c0237el;
        this.b = c0351ik;
        this.k = ua;
        this.d = wq;
        this.e = c0322hj;
        this.f = c0512o7;
        this.g = c0303h0;
        this.l = c0291gh;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0351ik.b().getApiKey());
        this.c = orCreatePublicLogger;
        if (N3.a(c0351ik.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.j = c0396k7;
        this.m = new C0386jq(applicationContext);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0228ec, io.appmetrica.analytics.impl.InterfaceC0389k0
    public final void a(@NonNull Z z) {
        C0274g0 c0274g0 = new C0274g0(z, (String) this.k.b.a(), (Boolean) this.k.c.a());
        C0237el c0237el = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.g.fromModel(c0274g0));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, "", 5968, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        String str = null;
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        Bq bq = z.a;
        if (bq != null) {
            str = "Thread[name=" + bq.a + ",tid={" + bq.c + ", priority=" + bq.b + ", group=" + bq.d + "}] at " + CollectionsKt.X(bq.f, StringUtil.LF, null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ob
    public final void b(@NonNull String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(str2, str, 1, 0, publicLogger);
        c4.l = EnumC0688ua.JS;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ob
    public final void c(@NonNull String str) {
        C0237el c0237el = this.h;
        H6 a = H6.a(str);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(a, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.c.info("Clear app environment", new Object[0]);
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        H6 n2 = C4.n();
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        c0237el.a(new Yj(n2, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str)));
    }

    public final void d(String str) {
        if (this.b.f()) {
            return;
        }
        this.h.d.c();
        Nc nc = this.i;
        nc.a.removeCallbacks(nc.c, nc.b.b.b.getApiKey());
        this.b.e = true;
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4("", str, 3, 0, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    public final void e(String str) {
        this.h.d.b();
        Nc nc = this.i;
        Nc.a(nc.a, nc.b, nc.c);
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4("", str, 6400, 0, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.b.e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    @NonNull
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        Mh mh;
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        Qh qh = c0351ik.d;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey());
        Set set = Ea.a;
        JSONObject jSONObject = new JSONObject();
        if (qh != null && (mh = qh.a) != null) {
            try {
                jSONObject.put("preloadInfo", mh.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        c4.c(str);
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.c.info("Pause session", new Object[0]);
        d(null);
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
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        H6 b = C4.b(str, str2);
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str3 = c0351ik.f;
        }
        c0237el.a(new Yj(b, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str3)));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z) {
        String str;
        C0237el c0237el = this.h;
        F f = new F(adRevenue, z, this.m, this.c);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        C4 a = C4.a(LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey()), f);
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        c0237el.a(new Yj(a, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str)));
        this.c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + Fc.c(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0332i0 c0332i0 = new C0332i0(new C0360j0(this, map));
        C0689ub c0689ub = new C0689ub();
        C0396k7 c0396k7 = R4.l().a;
        Thread a = c0332i0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0332i0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        Bq bq = (Bq) c0689ub.apply(a, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Gq());
        try {
            map2 = c0332i0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a && thread != null) {
                arrayList.add((Bq) c0689ub.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new Z(bq, arrayList, c0396k7.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        String str;
        this.c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        for (C0439ll c0439ll : eCommerceEvent.toProto()) {
            C4 c4 = new C4(LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey()));
            EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
            c4.d = 41000;
            c4.b = c4.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) c0439ll.a)));
            c4.g = c0439ll.b.getBytesTruncated();
            Xh xh = new Xh(c0351ik.a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
            L9 l9 = c0351ik.c;
            synchronized (c0351ik) {
                str = c0351ik.f;
            }
            c0237el.a(new Yj(c4, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str)));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Vq vq;
        C0291gh c0291gh = this.l;
        if (pluginErrorDetails != null) {
            vq = c0291gh.a(pluginErrorDetails);
        } else {
            c0291gh.getClass();
            vq = null;
        }
        C0483n7 c0483n7 = new C0483n7(new C0293gj(str2, vq), str);
        C0237el c0237el = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c0483n7));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, str2, 5896, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
        EnumC0688ua enumC0688ua;
        if (n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(value, name, RemoteCameraConfig.Notification.ID, moduleEvent.getType(), publicLogger);
        int i = M9.a[moduleEvent.getCategory().ordinal()];
        if (i == 1) {
            enumC0688ua = EnumC0688ua.NATIVE;
        } else {
            if (i != 2) {
                b6e.s();
                return;
            }
            enumC0688ua = EnumC0688ua.SYSTEM;
        }
        c4.l = enumC0688ua;
        c4.c = Fc.c(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            c4.p = moduleEvent.getExtras();
        }
        this.h.a(c4, this.b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(@NonNull Revenue revenue) {
        String str;
        C0728vl c0728vl = AbstractC0739w3.a;
        c0728vl.getClass();
        Ar a = c0728vl.a(revenue);
        if (!a.a) {
            this.c.warning("Passed revenue is not valid. Reason: " + a.b, new Object[0]);
            return;
        }
        C0237el c0237el = this.h;
        C0757wl c0757wl = new C0757wl(revenue, this.c);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        C4 a2 = C4.a(LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey()), c0757wl);
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        c0237el.a(new Yj(a2, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str)));
        this.c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + StringUtil.SPACE + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        Vq a = this.l.a(pluginErrorDetails);
        C0237el c0237el = this.h;
        Lq lq = a.a;
        String str = lq != null ? (String) WrapUtils.getOrDefault(lq.a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.d.fromModel(a));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, str, 5891, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(@NonNull UserProfile userProfile) {
        String str;
        C0503nr c0503nr = new C0503nr(C0503nr.c);
        Iterator<UserProfileUpdate<? extends InterfaceC0532or>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0532or userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.c);
            userProfileUpdatePatcher.a(c0503nr);
        }
        C0647sr c0647sr = new C0647sr();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0503nr.a.size(); i++) {
            SparseArray sparseArray = c0503nr.a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0561pr) it2.next());
            }
        }
        c0647sr.a = (C0561pr[]) arrayList.toArray(new C0561pr[arrayList.size()]);
        Ar a = o.a(c0647sr);
        if (!a.a) {
            this.c.warning("UserInfo wasn't sent because " + a.b, new Object[0]);
            return;
        }
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        H6 a2 = C4.a(c0647sr);
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str = c0351ik.f;
        }
        c0237el.a(new Yj(a2, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str)));
        this.c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void sendEventsBuffer() {
        this.c.info("Send event buffer", new Object[0]);
        C0237el c0237el = this.h;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        C4 c4 = new C4("", "", 256, 0, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.b.b.setDataSendingEnabled(z);
        this.c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(@NonNull String str, byte[] bArr) {
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        c4.p = Collections.singletonMap(str, bArr);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        C0237el c0237el = this.h;
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        C4 c4 = new C4(LoggerStorage.getOrCreatePublicLogger(c0351ik.b.getApiKey()));
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        c4.d = 40962;
        c4.c(str);
        c4.b = c4.e(str);
        Xh xh = new Xh(c0351ik.a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(c0351ik.b);
        L9 l9 = c0351ik.c;
        synchronized (c0351ik) {
            str2 = c0351ik.f;
        }
        c0237el.a(new Yj(c4, false, 1, null, new C0351ik(xh, counterConfiguration, l9, str2)));
        this.c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ob
    public final boolean d() {
        return this.b.f();
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0734vr.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, String str2, Throwable th) {
        C0483n7 c0483n7 = new C0483n7(new C0293gj(str2, a(th)), str);
        C0237el c0237el = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(c0483n7));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, str2, 5896, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(@NonNull Throwable th) {
        Vq a = Yq.a(th, new Z(null, null, this.j.a()), null, (String) this.k.b.a(), (Boolean) this.k.c.a());
        C0237el c0237el = this.h;
        c0237el.a(c0237el.a(a, this.b));
        this.c.info("Unhandled exception received: " + a, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
        Vq vq;
        C0291gh c0291gh = this.l;
        if (pluginErrorDetails != null) {
            vq = c0291gh.a(pluginErrorDetails);
        } else {
            c0291gh.getClass();
            vq = null;
        }
        C0293gj c0293gj = new C0293gj(str, vq);
        C0237el c0237el = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(c0293gj));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, str, 5896, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(@NonNull String str, Throwable th) {
        C0293gj c0293gj = new C0293gj(str, a(th));
        C0237el c0237el = this.h;
        byte[] byteArray = MessageNano.toByteArray(this.e.fromModel(c0293gj));
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(byteArray, str, 5892, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
        this.c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, String str2) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4(str2, str, 1, 0, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str, Map<String, Object> map) {
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        c0237el.a(new C4("", str, 1, 0, publicLogger), this.b, 1, map);
        PublicLogger publicLogger2 = this.c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(@NonNull String str) {
        this.c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        C0237el c0237el = this.h;
        PublicLogger publicLogger = this.c;
        Set set = Ea.a;
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        C4 c4 = new C4("", str, 1, 0, publicLogger);
        C0351ik c0351ik = this.b;
        c0237el.getClass();
        c0237el.a(C0237el.a(c4, c0351ik), c0351ik, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0734vr.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    public final Vq a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof C0795y2) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Yq.a(th2, new Z(null, null, this.j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.k.b.a(), (Boolean) this.k.c.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0228ec, io.appmetrica.analytics.impl.InterfaceC0315hc
    public final void a(@NonNull Vq vq) {
        C0237el c0237el = this.h;
        Yj a = c0237el.a(vq, this.b);
        C0351ik c0351ik = a.e;
        So so = c0237el.e;
        if (so != null) {
            c0351ik.b.setUuid(((Ro) so).g());
        } else {
            c0351ik.getClass();
        }
        c0237el.c.b(a);
        this.c.info("Unhandled exception received: " + vq, new Object[0]);
    }

    public void a(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        PublicLogger publicLogger = this.c;
        if (isEmpty) {
            publicLogger.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        publicLogger.info("Put error environment pair <%s, %s>", str, str2);
        C0351ik c0351ik = this.b;
        synchronized (c0351ik) {
            L9 l9 = c0351ik.c;
            l9.b.b(l9.a, str, str2);
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }
}
