package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BannersUpdatedEvent;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o7 {
    public final AtomicBoolean A;
    public final AtomicBoolean B;
    public final Context a;
    public final c2 b;
    public final r7 c;
    public final e2 d;
    public final xg e;
    public final z4 f;
    public final mg g;
    public final x9 h;
    public final u7 i;
    public final BrazeGeofenceManager j;
    public final m9 k;
    public final BrazeConfigurationProvider l;
    public final x3 m;
    public final ie n;
    public final ue o;
    public final g8 p;
    public final hc q;
    public final d0 r;
    public final AtomicBoolean s;
    public final AtomicBoolean t;
    public fg u;
    public final AtomicBoolean v;
    public final AtomicBoolean w;
    public final AtomicBoolean x;
    public final AtomicBoolean y;
    public final AtomicBoolean z;

    public o7(Context context, c2 c2Var, r7 r7Var, e2 e2Var, xg xgVar, z4 z4Var, mg mgVar, x9 x9Var, u7 u7Var, BrazeGeofenceManager brazeGeofenceManager, m9 m9Var, BrazeConfigurationProvider brazeConfigurationProvider, x3 x3Var, ie ieVar, ue ueVar, g8 g8Var, hc hcVar, d0 d0Var) {
        context.getClass();
        c2Var.getClass();
        r7Var.getClass();
        e2Var.getClass();
        xgVar.getClass();
        z4Var.getClass();
        mgVar.getClass();
        x9Var.getClass();
        u7Var.getClass();
        brazeGeofenceManager.getClass();
        m9Var.getClass();
        brazeConfigurationProvider.getClass();
        x3Var.getClass();
        ieVar.getClass();
        ueVar.getClass();
        g8Var.getClass();
        hcVar.getClass();
        d0Var.getClass();
        this.a = context;
        this.b = c2Var;
        this.c = r7Var;
        this.d = e2Var;
        this.e = xgVar;
        this.f = z4Var;
        this.g = mgVar;
        this.h = x9Var;
        this.i = u7Var;
        this.j = brazeGeofenceManager;
        this.k = m9Var;
        this.l = brazeConfigurationProvider;
        this.m = x3Var;
        this.n = ieVar;
        this.o = ueVar;
        this.p = g8Var;
        this.q = hcVar;
        this.r = d0Var;
        this.s = new AtomicBoolean(false);
        this.t = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
        this.z = new AtomicBoolean(false);
        this.A = new AtomicBoolean(false);
        this.B = new AtomicBoolean(false);
    }

    public static final String M() {
        return "Requesting Banners refresh on session created event due to configuration.";
    }

    public static final String N() {
        return "Banners already initialized. Not retrieving.";
    }

    public static final String P() {
        return "Requesting Content Card refresh on session created event due to configuration.";
    }

    public static final String Q() {
        return "Content Cards already initialized. Not retrieving.";
    }

    public static final String S() {
        return "Starting DUST subscription due to configuration.";
    }

    public static final String T() {
        return "DUST initial subscription already started. Not starting again.";
    }

    public static final String V() {
        return "Requesting Feature Flags refresh on session created event due to configuration.";
    }

    public static final String W() {
        return "Feature Flags already initialized. Not retrieving.";
    }

    public static final String Y() {
        return "Requesting Push Max request on session created event due to configuration.";
    }

    public static final String Z() {
        return "Push Max already requested for this session. Not requesting again.";
    }

    public static final void a(o7 o7Var, e0 e0Var) {
        e0Var.getClass();
        d0 d0Var = o7Var.r;
        JSONObject jSONObject = e0Var.a;
        Long l = e0Var.b;
        List<d> list = e0Var.c;
        jSONObject.getClass();
        list.getClass();
        Banner.Companion.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (keys.hasNext()) {
            Banner a = Banner.Companion.a(jSONObject.optJSONObject(keys.next()));
            if (a != null) {
                arrayList.add(a);
            }
        }
        ArrayList<Banner> arrayList2 = new ArrayList();
        ArrayList<Banner> arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((Banner) obj).getIsTestSend()) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        for (Banner banner : arrayList2) {
            d0.k.put(banner.getPlacementId(), banner);
        }
        q qVar = d0Var.h;
        List list2 = d0Var.f;
        qVar.getClass();
        list2.getClass();
        Map a2 = qVar.a.a();
        List b = qVar.a.b();
        b.getClass();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (d dVar : list) {
            arrayList4.add(new Pair(dVar.a, Long.valueOf(dVar.b)));
        }
        Set set = CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : b) {
            BannerPendingDismissal bannerPendingDismissal = (BannerPendingDismissal) obj2;
            if (!set.contains(new Pair(bannerPendingDismissal.getBannerId(), Long.valueOf(bannerPendingDismissal.getDismissalTimeMs())))) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList5.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            String stableKey = ((BannerPendingDismissal) obj3).getStableKey();
            if (stableKey != null) {
                arrayList6.add(stableKey);
            }
        }
        Set set2 = CollectionsKt.toSet(arrayList6);
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Object obj4 : list2) {
            linkedHashMap.put(((Banner) obj4).getPlacementId(), obj4);
        }
        ArrayList arrayList7 = new ArrayList();
        for (Banner banner2 : arrayList3) {
            if ((!qVar.a(banner2, l, a2) && (banner2 = (Banner) linkedHashMap.get(banner2.getPlacementId())) == null) || !qVar.a(banner2, set2) || !qVar.a(banner2)) {
                banner2 = null;
            }
            if (banner2 != null) {
                arrayList7.add(banner2);
            }
        }
        if (l != null) {
            com.braze.storage.a aVar = d0Var.e;
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
            int size3 = arrayList7.size();
            while (i < size3) {
                Object obj5 = arrayList7.get(i);
                i++;
                arrayList8.add(((Banner) obj5).getPlacementId());
            }
            long longValue = l.longValue();
            aVar.getClass();
            if (!arrayList8.isEmpty()) {
                JobKt.runBlockingK(aVar.getDataStoreScope$android_sdk_base_release().getCoroutineContext(), new w(aVar, arrayList8, longValue, null));
            }
        }
        d0Var.f = arrayList7;
        d0Var.h();
        d0Var.l();
        List list3 = d0Var.f;
        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList9.add(((Banner) it.next()).deepcopy$android_sdk_base_release());
        }
        ((r7) o7Var.k).b(new BannersUpdatedEvent(arrayList9), BannersUpdatedEvent.class);
    }

    public static final String b() {
        return "Failed to request a content card refresh.";
    }

    public static final String b0() {
        return "Doing Debugger Handshake.";
    }

    public static final String c() {
        return "Failed to request a feature flag refresh.";
    }

    public static final String c0() {
        return "Debugger Initialization already attempted. Not doing Debugger initialization again.";
    }

    public static final String d() {
        return "Session created event for new session received.";
    }

    public static final String e() {
        return "Requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String e0() {
        return "Performing push delivery event flush";
    }

    public static final String f() {
        return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
    }

    public static final String g() {
        return "Session start event for new session received.";
    }

    public static final String g0() {
        return "Requesting trigger refresh in next sync";
    }

    public static final String h() {
        return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
    }

    public static final String i() {
        return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
    }

    public static final String j() {
        return "Not automatically requesting Push Max on session created event due to server configuration.";
    }

    public static final String k() {
        return "Not automatically starting DUST subscription on session created event due to server configuration.";
    }

    public static final String l() {
        return "Not automatically requesting Banners refresh on session created event due to server configuration.";
    }

    public static final String m() {
        return "Not automatically starting SDK Debugger on session created event due to server configuration.";
    }

    public static final String n() {
        return "Failed to log the storage exception.";
    }

    public static final String o() {
        return "Requesting trigger update due to trigger-eligible push click event";
    }

    public static final String w() {
        return "Failed to log error.";
    }

    public final IEventSubscriber A() {
        return new o7$$ExternalSyntheticLambda1(this, 10);
    }

    public final IEventSubscriber B() {
        return new o7$$ExternalSyntheticLambda1(this, 20);
    }

    public final IEventSubscriber C() {
        return new o7$$ExternalSyntheticLambda1(this, 17);
    }

    public final IEventSubscriber D() {
        return new o7$$ExternalSyntheticLambda1(this, 0);
    }

    public final IEventSubscriber E() {
        return new o7$$ExternalSyntheticLambda1(this, 2);
    }

    public final IEventSubscriber F() {
        return new o7$$ExternalSyntheticLambda1(this, 18);
    }

    public final IEventSubscriber G() {
        return new o7$$ExternalSyntheticLambda1(this, 1);
    }

    public final IEventSubscriber H() {
        return new o7$$ExternalSyntheticLambda1(this, 16);
    }

    public final IEventSubscriber I() {
        return new o7$$ExternalSyntheticLambda1(this, 14);
    }

    public final IEventSubscriber J() {
        return new o7$$ExternalSyntheticLambda1(this, 4);
    }

    public final IEventSubscriber K() {
        return new o7$$ExternalSyntheticLambda1(this, 19);
    }

    public final void L() {
        if (!this.A.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(18), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(17), 7, (Object) null);
            this.r.a();
        }
    }

    public final void O() {
        if (!this.w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(20), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(19), 7, (Object) null);
        e2 e2Var = this.d;
        x3 x3Var = this.m;
        e2Var.a(x3Var.d, x3Var.e, j2.SESSION_START);
    }

    public final void R() {
        if (!this.z.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(3), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(2), 7, (Object) null);
            this.d.s();
        }
    }

    public final void U() {
        if (!this.x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(9), 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(8), 7, (Object) null);
        g8 g8Var = this.p;
        j2 j2Var = j2.SESSION_START;
        j2Var.getClass();
        g8Var.d.a(j2Var);
    }

    public final void X() {
        if (!this.y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(11), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(10), 7, (Object) null);
            this.d.v();
        }
    }

    public final void a0() {
        if (!this.B.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(7), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(6), 7, (Object) null);
            this.c.b(new be(), be.class);
        }
    }

    public final void d0() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(5), 7, (Object) null);
        this.d.a(0L);
    }

    public final void f0() {
        o7 o7Var;
        kb kbVar = new kb();
        if (this.d.t.get()) {
            this.s.set(true);
            o7Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(17), 7, (Object) null);
            kbVar.b = Boolean.TRUE;
            o7Var.d.a(false);
        } else {
            o7Var = this;
        }
        if (Intrinsics.areEqual(kbVar.b, Boolean.TRUE)) {
            o7Var.d.a(kbVar);
        }
    }

    public final IEventSubscriber p() {
        return new o7$$ExternalSyntheticLambda1(this, 11);
    }

    public final IEventSubscriber q() {
        return new o7$$ExternalSyntheticLambda1(this, 7);
    }

    public final IEventSubscriber r() {
        return new o7$$ExternalSyntheticLambda1(this, 15);
    }

    public final IEventSubscriber s() {
        return new o7$$ExternalSyntheticLambda1(this, 8);
    }

    public final IEventSubscriber t() {
        return new o7$$ExternalSyntheticLambda1(this, 13);
    }

    public final IEventSubscriber u() {
        return new o7$$ExternalSyntheticLambda1(this, 9);
    }

    public final IEventSubscriber v() {
        return new o7$$ExternalSyntheticLambda1(this, 6);
    }

    public final IEventSubscriber x() {
        return new o7$$ExternalSyntheticLambda1(this, 5);
    }

    public final IEventSubscriber y() {
        return new o7$$ExternalSyntheticLambda1(this, 12);
    }

    public final IEventSubscriber z() {
        return new o7$$ExternalSyntheticLambda1(this, 3);
    }

    public static final void a(o7 o7Var, r5 r5Var) {
        fg fgVar;
        r5Var.getClass();
        d9 d9Var = r5Var.a;
        x4 x4Var = ((i2) d9Var).j;
        if (x4Var != null) {
            o7Var.f.a((Object) x4Var, false);
        }
        if (d9Var instanceof l4) {
            l4 l4Var = (l4) d9Var;
            if (l4Var.l.b()) {
                if (o7Var.s.compareAndSet(true, false)) {
                    o7Var.g.a((gg) new hb());
                }
                if (o7Var.t.compareAndSet(true, false) && (fgVar = o7Var.u) != null) {
                    o7Var.g.a((gg) new ac(fgVar.a, fgVar.b));
                    o7Var.u = null;
                }
                o7Var.d.a(true);
            }
            mb mbVar = l4Var.n;
            if (mbVar != null) {
                o7Var.e.a((Object) mbVar, false);
                if (mbVar.a.has(DataStoreKey.PUSH_TOKEN.getKey())) {
                    o7Var.e.j();
                    o7Var.f.e();
                }
            }
            l1 l1Var = l4Var.o;
            if (l1Var != null) {
                for (y8 y8Var : l1Var.a) {
                    r7 r7Var = o7Var.c;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(y8Var);
                    listOf.getClass();
                    r7Var.b(new o5(n5.ADD_BRAZE_EVENTS, listOf, null, null, 12), o5.class);
                }
            }
            if (l4Var.l.c != null) {
                o7Var.o.O();
            }
        }
        if (d9Var instanceof ic) {
            o7Var.q.b(((ic) d9Var).l);
        }
    }

    public static final void a(o7 o7Var, s5 s5Var) {
        String str;
        s5Var.getClass();
        d9 d9Var = s5Var.a;
        x4 x4Var = ((i2) d9Var).j;
        if (x4Var != null) {
            o7Var.f.a((Object) x4Var, true);
        }
        if (d9Var instanceof l4) {
            l4 l4Var = (l4) d9Var;
            mb mbVar = l4Var.n;
            if (mbVar != null) {
                o7Var.e.a((Object) mbVar, true);
            }
            l1 l1Var = l4Var.o;
            if (l1Var != null) {
                o7Var.i.a(l1Var.a);
            }
            if (l4Var.l.b()) {
                o7Var.d.a(false);
            }
            EnumSet enumSet = l4Var.p;
            if (enumSet != null) {
                com.braze.storage.o oVar = o7Var.n.a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                List list = CollectionsKt.toList(com.braze.support.d.a(enumSet));
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
                } else {
                    try {
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                            str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                        }
                        oVar.writeData(dataStoreKey, str);
                    } catch (Exception e2) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                    }
                }
            }
            if (l4Var.l.c != null) {
                o7Var.o.O();
            }
        }
        if (d9Var instanceof ic) {
            o7Var.q.a(((ic) d9Var).l);
        }
    }

    public static final void a(o7 o7Var, h8 h8Var) {
        h8Var.getClass();
        ((r7) o7Var.k).b(o7Var.p.a(h8Var.a), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(o7 o7Var, u8 u8Var) {
        u8Var.getClass();
        o7Var.j.registerGeofences(u8Var.a);
    }

    public static final void a(o7 o7Var, la laVar) {
        laVar.getClass();
        v9 v9Var = laVar.a;
        y9 y9Var = laVar.b;
        IInAppMessage iInAppMessage = laVar.c;
        String str = laVar.d;
        synchronized (o7Var.h) {
            try {
                if (((qg) o7Var.h).a(y9Var)) {
                    ((r7) o7Var.k).b(new InAppMessageEvent(v9Var, y9Var, iInAppMessage, str), InAppMessageEvent.class);
                    ((qg) o7Var.h).a(y9Var, DateTimeUtils.nowInSeconds());
                    o7Var.g.b(DateTimeUtils.nowInSeconds());
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 4), 7, (Object) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(o7 o7Var, te teVar) {
        teVar.getClass();
        re reVar = teVar.a;
        o7Var.j.configureFromServerConfig(reVar);
        if (o7Var.v.get()) {
            if (reVar.j) {
                o7Var.O();
            }
            if (reVar.m) {
                o7Var.U();
            }
            if (reVar.o) {
                o7Var.X();
            }
            if (reVar.t) {
                o7Var.R();
            }
            if (reVar.G) {
                o7Var.L();
            }
            if (reVar.z) {
                o7Var.a0();
            }
        }
    }

    public static final void a(o7 o7Var, hg hgVar) {
        hgVar.getClass();
        o7Var.g.a((gg) hgVar.a);
    }

    public static final void a(o7 o7Var, sg sgVar) {
        sgVar.getClass();
        o7Var.g.a(sgVar.a, sgVar.b);
    }

    public static final void a(o7 o7Var, ug ugVar) {
        fg fgVar;
        ugVar.getClass();
        o7Var.g.a(ugVar.a);
        if (o7Var.s.compareAndSet(true, false)) {
            o7Var.g.a((gg) new hb());
        }
        if (!o7Var.t.compareAndSet(true, false) || (fgVar = o7Var.u) == null) {
            return;
        }
        o7Var.g.a((gg) new ac(fgVar.a, fgVar.b));
        o7Var.u = null;
    }

    public static final void a(o7 o7Var, o3 o3Var) {
        o3Var.getClass();
        if (!o3Var.a.j || o3Var.b.j) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(22), 7, (Object) null);
        o7Var.m.a();
    }

    public static final void a(o7 o7Var, xe xeVar) {
        xeVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(13), 7, (Object) null);
        o7Var.w.set(false);
        o7Var.x.set(false);
        o7Var.y.set(false);
        o7Var.z.set(false);
        o7Var.B.set(false);
        o7Var.b.f();
        y8 a = k1.g.a(xeVar.a.a);
        if (a != null) {
            ((k1) a).a(xeVar.a.a);
        }
        if (a != null) {
            o7Var.d.a(a);
        }
        o7Var.d.a(true);
        o7Var.e.j();
        o7Var.f.e();
        o7Var.d0();
        if (o7Var.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(14), 7, (Object) null);
            BrazeInternal.requestGeofenceRefresh(o7Var.a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(15), 7, (Object) null);
        }
        o7Var.p.e.clearData(DataStoreKey.FEATURE_FLAGS_IMPRESSIONS_MAP);
        o7Var.r.j();
        o7Var.f0();
    }

    public static final void a(o7 o7Var, af afVar) {
        afVar.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(24), 7, (Object) null);
        o7Var.v.set(true);
        if (o7Var.o.F()) {
            o7Var.O();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(25), 7, (Object) null);
        }
        if (o7Var.o.I()) {
            o7Var.U();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(26), 7, (Object) null);
        }
        if (o7Var.o.M()) {
            o7Var.X();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(27), 7, (Object) null);
        }
        if (o7Var.o.G()) {
            o7Var.R();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(28), 7, (Object) null);
        }
        if (o7Var.o.d()) {
            o7Var.L();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n8$$ExternalSyntheticLambda1(29), 7, (Object) null);
        }
        if (o7Var.o.N()) {
            o7Var.a0();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) o7Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(1), 7, (Object) null);
        }
    }

    public static final void a(o7 o7Var, ya yaVar) {
        yaVar.getClass();
        o7Var.d.a(true);
        o7Var.f0();
    }

    public static final void a(o7 o7Var, ze zeVar) {
        zeVar.getClass();
        o7Var.getClass();
        we weVar = zeVar.a;
        y8 a = k1.g.a(weVar.c());
        if (a != null) {
            ((k1) a).a(weVar.a);
            o7Var.d.a(a);
        }
        Braze.INSTANCE.getInstance(o7Var.a).requestImmediateDataFlush();
        o7Var.d0();
    }

    public static final void a(o7 o7Var, e eVar) {
        eVar.getClass();
        List list = eVar.a;
        d0 d0Var = o7Var.r;
        list.getClass();
        d0Var.g.a(list);
    }

    public static final void a(o7 o7Var, fg fgVar) {
        fgVar.getClass();
        o7Var.t.set(true);
        o7Var.u = fgVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new o8$$ExternalSyntheticLambda6(12), 6, (Object) null);
        e2 e2Var = o7Var.d;
        kb kbVar = new kb();
        kbVar.b = Boolean.TRUE;
        e2Var.a(kbVar);
    }

    public static final String a(y9 y9Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not publish in-app message with trigger action id: ", ((rg) y9Var).a);
    }

    public static final void a(o7 o7Var, jf jfVar) {
        jfVar.getClass();
        try {
            e2 e2Var = o7Var.d;
            jfVar.getClass();
            e2Var.a((Throwable) jfVar, false);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new o8$$ExternalSyntheticLambda6(16), 4, (Object) null);
        }
    }

    public static final void a(o7 o7Var, p3 p3Var) {
        p3Var.getClass();
        try {
            e2 e2Var = o7Var.d;
            x3 x3Var = o7Var.m;
            long j = x3Var.d;
            long j2 = x3Var.e;
            p3Var.getClass();
            e2Var.a(j, j2, j2.DUST_INITIATED);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new o8$$ExternalSyntheticLambda6(4), 4, (Object) null);
        }
    }

    public static final void a(o7 o7Var, a8 a8Var) {
        a8Var.getClass();
        try {
            e2 e2Var = o7Var.d;
            a8Var.getClass();
            e2Var.a(j2.DUST_INITIATED);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(21), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Content cards have moved to disabled. Clearing content card data.";
    }

    public final void a(r7 r7Var) {
        r7Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(r7Var, 16), 7, (Object) null);
        r7Var.c(r5.class, t());
        r7Var.c(s5.class, u());
        r7Var.c(xe.class, D());
        r7Var.c(af.class, F());
        r7Var.c(ze.class, E());
        r7Var.c(fg.class, H());
        r7Var.c(te.class, C());
        r7Var.c(Throwable.class, v());
        r7Var.c(jf.class, G());
        r7Var.c(ug.class, K());
        r7Var.c(ya.class, B());
        r7Var.c(u8.class, z());
        r7Var.c(h8.class, y());
        r7Var.c(e0.class, q());
        r7Var.c(e.class, p());
        r7Var.c(hg.class, I());
        r7Var.c(la.class, A());
        r7Var.c(sg.class, J());
        r7Var.c(p3.class, s());
        r7Var.c(a8.class, x());
        r7Var.c(o3.class, r());
    }

    public static final String a(m9 m9Var) {
        return "Subscribing to events with " + m9Var;
    }

    public static final void a(o7 o7Var, Semaphore semaphore, Throwable th) {
        if (th != null) {
            try {
                try {
                    o7Var.d.a(th, true);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) o7Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new n8$$ExternalSyntheticLambda1(23), 4, (Object) null);
                    if (semaphore != null) {
                        semaphore.release();
                        return;
                    }
                    return;
                }
            } finally {
            }
        }
        if (semaphore != null) {
            semaphore.release();
        }
    }
}
