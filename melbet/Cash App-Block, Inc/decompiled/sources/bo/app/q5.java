package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.enums.DeviceKey;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class q5 {
    public static final p5 d = new p5();
    public final ah a;
    public final ConcurrentHashMap b;
    public final ConcurrentHashMap c;

    public q5(ah ahVar) {
        ahVar.getClass();
        this.a = ahVar;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        ahVar.i.c(o5.class, new mg$$ExternalSyntheticLambda7(this, 1));
    }

    public static final String b() {
        return "Push permissions were granted, setting user push notifications to opt-in";
    }

    public static final String c() {
        return "Push permissions were granted, but blocking automatic opt-in";
    }

    public static final String d() {
        return "Flushing pending events to dispatcher map";
    }

    public final void a(l4 l4Var) {
        ArrayList arrayList;
        Collection collection;
        String jsonKey;
        l4Var.getClass();
        ah ahVar = this.a;
        l4Var.q = ((c5) ahVar.d).c;
        l4Var.m = ahVar.b.getSdkFlavor();
        l4Var.r = ((c5) this.a.d).c();
        ah ahVar2 = this.a;
        g9 g9Var = ahVar2.d;
        z4 z4Var = ahVar2.h;
        if (z4Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
            throw null;
        }
        c5 c5Var = (c5) g9Var;
        c5Var.getClass();
        z4Var.d = c5Var.b();
        x4 x4Var = (x4) z4Var.a();
        l4Var.j = x4Var;
        if (x4Var != null && x4Var.l) {
            if (this.a.b.getShouldOptInWhenPushAuthorized()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(10), 6, (Object) null);
                xg a = this.a.a();
                NotificationSubscriptionType notificationSubscriptionType = NotificationSubscriptionType.OPTED_IN;
                synchronized (a) {
                    if (notificationSubscriptionType != null) {
                        try {
                            jsonKey = notificationSubscriptionType.getJsonKey();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        jsonKey = null;
                    }
                    a.c("push_subscribe", jsonKey);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(11), 6, (Object) null);
            }
        }
        if (x4Var != null && x4Var.getJsonKey().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey())) {
            this.a.a().j();
        }
        l4Var.n = (mb) this.a.a().a();
        l1 e = e();
        l4Var.o = e;
        LinkedHashSet linkedHashSet = e.a;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (((k1) ((y8) it.next())).a == w7.y) {
                ah ahVar3 = this.a;
                ie ieVar = ahVar3.s;
                EnumSet<BrazeSdkMetadata> sdkMetadata = ahVar3.b.getSdkMetadata();
                ieVar.getClass();
                sdkMetadata.getClass();
                com.braze.storage.o oVar = ieVar.a;
                DataStoreKey dataStoreKey = DataStoreKey.SDK_METADATA;
                if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
                    arrayList = new ArrayList();
                } else {
                    try {
                        Object readData = oVar.readData(dataStoreKey, "");
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
                                } catch (Exception e2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                                    collection = EmptyList.INSTANCE;
                                }
                            }
                            arrayList = CollectionsKt.toMutableList(collection);
                        }
                    } catch (Exception e3) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
                        arrayList = new ArrayList();
                    }
                }
                l4Var.p = Intrinsics.areEqual(com.braze.support.d.a(sdkMetadata), CollectionsKt.toSet(arrayList)) ? null : sdkMetadata;
                return;
            }
        }
    }

    public final synchronized l1 e() {
        q5 q5Var;
        try {
            try {
                Collection values = this.b.values();
                values.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = values.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        q5Var = this;
                        break;
                    }
                    Object next = it.next();
                    next.getClass();
                    y8 y8Var = (y8) next;
                    linkedHashSet.add(y8Var);
                    values.remove(y8Var);
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    q5Var = this;
                    BrazeLogger.brazelog$default(brazeLogger, (Object) q5Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 7), 7, (Object) null);
                    if (linkedHashSet.size() >= 32) {
                        BrazeLogger.brazelog$default(brazeLogger, (Object) q5Var, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(12), 6, (Object) null);
                        break;
                    }
                    this = q5Var;
                }
                l1 l1Var = new l1(linkedHashSet);
                return l1Var;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            q5 q5Var2 = this;
            Throwable th22 = th;
            throw th22;
        }
    }

    public static final void a(q5 q5Var, o5 o5Var) {
        o5Var.getClass();
        n5 n5Var = o5Var.a;
        List<y8> list = o5Var.b;
        ye yeVar = o5Var.c;
        int ordinal = n5Var.ordinal();
        if (ordinal == 0) {
            q5Var.getClass();
            list.getClass();
            for (y8 y8Var : list) {
                q5Var.c.putIfAbsent(((k1) y8Var).d, y8Var);
            }
            return;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            q5Var.a(yeVar);
        } else {
            q5Var.getClass();
            list.getClass();
            for (y8 y8Var2 : list) {
                q5Var.b.putIfAbsent(((k1) y8Var2).d, y8Var2);
            }
        }
    }

    public static final String a(y8 y8Var) {
        k1 k1Var = (k1) y8Var;
        return "Event dispatched: " + k1Var.getJsonKey() + " with uid: " + k1Var.d;
    }

    public static final String a() {
        return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
    }

    public final void a(ye yeVar) {
        if (yeVar == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(9), 7, (Object) null);
        Collection values = concurrentHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ((k1) ((y8) it.next())).a(yeVar);
        }
        this.b.putAll(concurrentHashMap);
        Set keySet = concurrentHashMap.keySet();
        keySet.getClass();
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            this.c.remove((String) it2.next());
        }
    }

    public final d9 a(d9 d9Var) {
        d9Var.getClass();
        p5 p5Var = d;
        ah ahVar = this.a;
        p5Var.a(ahVar.b, ahVar.q, d9Var, ((f5) ahVar.c).a());
        if (d9Var instanceof l4) {
            a((l4) d9Var);
            return d9Var;
        }
        if (d9Var instanceof ic) {
            ((ic) d9Var).j = ((c5) this.a.d).b();
            return d9Var;
        }
        if (d9Var instanceof y3) {
            x3 x3Var = this.a.y;
            y3 y3Var = (y3) d9Var;
            y3Var.l = x3Var.d;
            y3Var.m = x3Var.e;
        }
        return d9Var;
    }
}
