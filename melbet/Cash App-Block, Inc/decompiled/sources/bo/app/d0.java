package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.models.Banner;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d0 {
    public static Job l;
    public final String a;
    public final m9 b;
    public final ue c;
    public final e2 d;
    public final com.braze.storage.a e;
    public List f;
    public final n g;
    public final q h;
    public final AtomicInteger i;
    public static final a0 j = new a0();
    public static final LinkedHashMap k = new LinkedHashMap();
    public static final ReentrantLock m = new ReentrantLock();
    public static final ArrayList n = new ArrayList();
    public static final ReentrantLock o = new ReentrantLock();
    public static final ArrayList p = new ArrayList();

    public d0(Context context, String str, String str2, r7 r7Var, m9 m9Var, ue ueVar, e2 e2Var) {
        context.getClass();
        str.getClass();
        r7Var.getClass();
        m9Var.getClass();
        ueVar.getClass();
        e2Var.getClass();
        this.a = str2;
        this.b = m9Var;
        this.c = ueVar;
        this.d = e2Var;
        com.braze.storage.a aVar = new com.braze.storage.a(context, str2, str);
        this.e = aVar;
        this.f = EmptyList.INSTANCE;
        this.g = new n(aVar, ueVar);
        this.h = new q(aVar);
        final int i = 0;
        this.i = new AtomicInteger(0);
        e();
        r7Var.c(zc.class, new IEventSubscriber(this) { // from class: bo.app.d0$$ExternalSyntheticLambda1
            public final /* synthetic */ d0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i2 = i;
                d0 d0Var = this.f$0;
                switch (i2) {
                    case 0:
                        d0.a(d0Var, (zc) obj);
                        break;
                    case 1:
                        d0.a(d0Var, (g0) obj);
                        break;
                    case 2:
                        d0.a(d0Var, (f0) obj);
                        break;
                    case 3:
                        d0.a(d0Var, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        d0.a(d0Var, (o3) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        r7Var.c(g0.class, new IEventSubscriber(this) { // from class: bo.app.d0$$ExternalSyntheticLambda1
            public final /* synthetic */ d0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i2;
                d0 d0Var = this.f$0;
                switch (i22) {
                    case 0:
                        d0.a(d0Var, (zc) obj);
                        break;
                    case 1:
                        d0.a(d0Var, (g0) obj);
                        break;
                    case 2:
                        d0.a(d0Var, (f0) obj);
                        break;
                    case 3:
                        d0.a(d0Var, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        d0.a(d0Var, (o3) obj);
                        break;
                }
            }
        });
        final int i3 = 2;
        r7Var.c(f0.class, new IEventSubscriber(this) { // from class: bo.app.d0$$ExternalSyntheticLambda1
            public final /* synthetic */ d0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i3;
                d0 d0Var = this.f$0;
                switch (i22) {
                    case 0:
                        d0.a(d0Var, (zc) obj);
                        break;
                    case 1:
                        d0.a(d0Var, (g0) obj);
                        break;
                    case 2:
                        d0.a(d0Var, (f0) obj);
                        break;
                    case 3:
                        d0.a(d0Var, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        d0.a(d0Var, (o3) obj);
                        break;
                }
            }
        });
        final int i4 = 3;
        r7Var.d(BrazeUserChangeEvent.class, new IEventSubscriber(this) { // from class: bo.app.d0$$ExternalSyntheticLambda1
            public final /* synthetic */ d0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i4;
                d0 d0Var = this.f$0;
                switch (i22) {
                    case 0:
                        d0.a(d0Var, (zc) obj);
                        break;
                    case 1:
                        d0.a(d0Var, (g0) obj);
                        break;
                    case 2:
                        d0.a(d0Var, (f0) obj);
                        break;
                    case 3:
                        d0.a(d0Var, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        d0.a(d0Var, (o3) obj);
                        break;
                }
            }
        });
        final int i5 = 4;
        r7Var.c(o3.class, new IEventSubscriber(this) { // from class: bo.app.d0$$ExternalSyntheticLambda1
            public final /* synthetic */ d0 f$0;

            {
                this.f$0 = this;
            }

            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                int i22 = i5;
                d0 d0Var = this.f$0;
                switch (i22) {
                    case 0:
                        d0.a(d0Var, (zc) obj);
                        break;
                    case 1:
                        d0.a(d0Var, (g0) obj);
                        break;
                    case 2:
                        d0.a(d0Var, (f0) obj);
                        break;
                    case 3:
                        d0.a(d0Var, (BrazeUserChangeEvent) obj);
                        break;
                    default:
                        d0.a(d0Var, (o3) obj);
                        break;
                }
            }
        });
    }

    public static final String b(BrazeUserChangeEvent brazeUserChangeEvent) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Done updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public static final String c() {
        return "Refreshing Banners on forced internal refresh.";
    }

    public static final String f() {
        return "Did not find stored Banners in DataStore.";
    }

    public static final String g() {
        return "Received blank serialized Banner string from DataStore. Not parsing.";
    }

    public static final String k() {
        return "Resetting BannersManager for new session.";
    }

    public final void a() {
        ReentrantLock reentrantLock = o;
        reentrantLock.lock();
        try {
            ArrayList mutableList = CollectionsKt.toMutableList((Collection) p);
            reentrantLock.unlock();
            if (mutableList.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(4), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(5), 7, (Object) null);
                d(mutableList);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean d(List list) {
        String str;
        Object obj;
        list.getClass();
        if (this.i.get() > 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(this, 3), 7, (Object) null);
            return false;
        }
        if (list.size() > this.c.q()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(11, this, list), 7, (Object) null);
        }
        this.i.incrementAndGet();
        List<String> take = CollectionsKt.take(list, this.c.q());
        take.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str2 : take) {
            Iterator it = this.f.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Banner) obj).getPlacementId(), str2)) {
                    break;
                }
            }
            Banner banner = (Banner) obj;
            if (banner != null) {
                str = banner.getTrackingId();
            }
            arrayList.add(new Pair(str2, str));
        }
        this.d.a(arrayList, this.e.b());
        return true;
    }

    public final void e() {
        ArrayList<String> arrayList;
        Collection collection;
        d0 d0Var = this;
        com.braze.storage.a aVar = d0Var.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = aVar.readData(dataStoreKey, "");
                readData.getClass();
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    arrayList = new ArrayList();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        collection = EmptyList.INSTANCE;
                    } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                        collection = EmptyList.INSTANCE;
                    } else {
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            collection = (List) r0.decodeFromString(str, new HashSetSerializer(StringSerializer.INSTANCE, 1));
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                            collection = EmptyList.INSTANCE;
                        }
                    }
                    arrayList = CollectionsKt.toMutableList(collection);
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                arrayList = new ArrayList();
            }
        }
        if (arrayList.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(0), 7, (Object) null);
            d0Var.f = EmptyList.INSTANCE;
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            try {
                if (StringsKt.isBlank(str2)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(1), 6, (Object) null);
                } else {
                    Banner a = Banner.Companion.a(new JSONObject(str2));
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                d0Var = this;
            } catch (Exception e3) {
                d0Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 6), 4, (Object) null);
            }
        }
        d0Var.f = arrayList2;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(1, arrayList2), 7, (Object) null);
    }

    public final void h() {
        String str;
        String str2;
        List<Banner> list = this.f;
        ArrayList arrayList = new ArrayList();
        for (Banner banner : list) {
            try {
                str2 = banner.getJsonKey().toString();
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new q$$ExternalSyntheticLambda0(banner, 1), 4, (Object) null);
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        com.braze.storage.a aVar = this.e;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), arrayList);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = arrayList instanceof Map ? "{}" : "[]";
                }
                aVar.writeData(dataStoreKey, str);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(2, arrayList), 7, (Object) null);
    }

    public final void j() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(6), 6, (Object) null);
        this.e.clearData(DataStoreKey.BANNERS_IMPRESSION_MAP);
        a0.b();
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        ReentrantLock reentrantLock = m;
        reentrantLock.lock();
        try {
            List list = CollectionsKt.toList(n);
            reentrantLock.unlock();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                try {
                    throw null;
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new d0$$ExternalSyntheticLambda9(3), 4, (Object) null);
                    arrayList.add(null);
                }
            }
            m.lock();
            try {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj != null) {
                        throw new ClassCastException();
                    }
                    n.remove((Object) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void n() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(nowInSeconds, 1), 6, (Object) null);
        this.e.writeData(DataStoreKey.LAST_REFRESH_IN_SECONDS, Long.valueOf(nowInSeconds));
    }

    public static final String b() {
        return "Cached Banners placement IDs are empty. Not refreshing Banners on forced internal call.";
    }

    public static final String b(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Added ", " new Banners to DataStore.");
    }

    public static final String b(x xVar) {
        throw null;
    }

    public static final void a(d0 d0Var, zc zcVar) {
        zcVar.getClass();
        if (zcVar.a instanceof h0) {
            d0Var.i.decrementAndGet();
        }
    }

    public static final void a(d0 d0Var, g0 g0Var) {
        g0Var.getClass();
        d0Var.n();
    }

    public static final void a(d0 d0Var, f0 f0Var) {
        f0Var.getClass();
        ((r7) d0Var.b).b(f0Var, f0.class);
    }

    public static final void a(d0 d0Var, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda6(brazeUserChangeEvent, 0), 7, (Object) null);
        d0Var.l();
        BrazeLogger.brazelog$default(brazeLogger, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda6(brazeUserChangeEvent, 1), 7, (Object) null);
    }

    public static final String a(BrazeUserChangeEvent brazeUserChangeEvent) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Updating banners because of user change to ", brazeUserChangeEvent.getCurrentUserId(), ".");
    }

    public static final void a(d0 d0Var, o3 o3Var) {
        o3Var.getClass();
        if (!o3Var.a.G || o3Var.b.G) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new d0$$ExternalSyntheticLambda9(2), 7, (Object) null);
        d0Var.getClass();
        d0Var.f = EmptyList.INSTANCE;
        d0Var.e.clearData(DataStoreKey.BANNERS);
        d0Var.l();
    }

    public static final String a(d0 d0Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(d0Var.i.get(), "Not refreshing Banners since another ", " request is currently in-flight.");
    }

    public static final String a(d0 d0Var, List list) {
        int q = d0Var.c.q();
        int size = list.size();
        List take = CollectionsKt.take(list, d0Var.c.q());
        List subList = list.subList(d0Var.c.q(), list.size());
        StringBuilder m107m = Recorder$$ExternalSyntheticOutline2.m107m(q, size, "The number of Banner placements requested exceeds the maximum allowed by the server. The server allows a maximum of ", " placements, but ", " were requested. Truncating request to fit.\nPlacements that will be requested: ");
        m107m.append(take);
        m107m.append("\nTruncated placements not requested: ");
        m107m.append(subList);
        return m107m.toString();
    }

    public static final String a(long j2) {
        return Recorder$$ExternalSyntheticOutline2.m(j2, "Updating last Banners refresh time: ");
    }

    public static final String a(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Loaded ", " banners from DataStore.");
    }

    public static final String d() {
        return "Banners have moved to disabled. Clearing banners data.";
    }

    public static final String d(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Encountered unexpected exception while parsing stored banner: ", str);
    }

    public static final String e(Banner banner) {
        return "Error converting Banner to JSON: " + banner;
    }
}
