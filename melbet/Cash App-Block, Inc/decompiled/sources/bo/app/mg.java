package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class mg {
    public static final jg p = new jg();
    public static final long q = 30000;
    public final Context a;
    public final e2 b;
    public final r7 c;
    public final m9 d;
    public final long e;
    public final com.braze.storage.t f;
    public final zf g;
    public final qg h;
    public final Queue i;
    public final LinkedHashMap j;
    public long k;
    public volatile long l;
    public final ReentrantLock m;
    public final ReentrantLock n;
    public final hd o;

    public mg(Context context, e2 e2Var, r7 r7Var, m9 m9Var, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, hd hdVar) {
        context.getClass();
        e2Var.getClass();
        r7Var.getClass();
        m9Var.getClass();
        brazeConfigurationProvider.getClass();
        str2.getClass();
        hdVar.getClass();
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = e2Var;
        this.c = r7Var;
        m9Var.getClass();
        this.d = m9Var;
        this.e = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        com.braze.storage.t tVar = new com.braze.storage.t(context, str, str2);
        this.f = tVar;
        this.g = new zf(context, str2);
        this.h = new qg(tVar);
        this.j = g();
        this.i = new ArrayDeque();
        this.o = hdVar;
        l();
    }

    public static final String c(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Successfully saved ", " triggered actions to DataStore");
    }

    public static final String e(v9 v9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to match triggered action for incoming <", v9Var.a(), ">.");
    }

    public static final String f(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Trigger manager received failed triggered action with id: <", ((rg) y9Var).a, ">. Will attempt to perform fallback triggered actions, if present.");
    }

    public static final String h() {
        return "No triggered actions found in DataStore";
    }

    public static final String i() {
        return "Skipping blank triggered action string from DataStore";
    }

    public static final String j() {
        return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
    }

    public static final String k() {
        return "Triggered action has no fallback action to perform. Doing nothing.";
    }

    public static final String m() {
        return "Subscribing to trigger dispatch events.";
    }

    public static final String n() {
        return "Executing pending events after trigger dispatch completed.";
    }

    public final void a(List list) {
        String str;
        list.getClass();
        uf ufVar = new uf();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            this.j.clear();
            com.braze.storage.t tVar = this.f;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
                throw null;
            }
            tVar.clearData(DataStoreKey.TRIGGERED_ACTIONS);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h2$$ExternalSyntheticLambda0(list, 5), 7, (Object) null);
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                y9 y9Var = (y9) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 3), 7, (Object) null);
                this.j.put(((rg) y9Var).a, y9Var);
                if (((rg) y9Var).b(ufVar)) {
                    z = true;
                }
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((y9) it2.next()).getJsonKey()));
            }
            com.braze.storage.t tVar2 = this.f;
            if (tVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
                throw null;
            }
            DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
            if (dataStoreKey.getType() != DataStoreValueType.LIST) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), arrayList);
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = arrayList instanceof Map ? "{}" : "[]";
                    }
                    tVar2.writeData(dataStoreKey, str);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
                }
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h2$$ExternalSyntheticLambda0(list, 6), 7, (Object) null);
            reentrantLock.unlock();
            this.h.a(list);
            this.g.a(list);
            if (!z) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(19), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(18), 6, (Object) null);
                a((gg) ufVar);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (a()) {
                reentrantLock.unlock();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(16), 7, (Object) null);
            while (!((ArrayDeque) this.i).isEmpty()) {
                v9 v9Var = (v9) ((ArrayDeque) this.i).poll();
                if (v9Var != null) {
                    a(v9Var);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final y9 d(v9 v9Var) {
        v9 v9Var2;
        v9 v9Var3 = v9Var;
        v9Var3.getClass();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.j.values().iterator();
            int i = Integer.MIN_VALUE;
            while (it.hasNext()) {
                rg rgVar = (rg) ((y9) it.next());
                if (rgVar.b(v9Var3) && this.h.a(rgVar)) {
                    v9Var2 = v9Var3;
                    if (p.a(v9Var3, rgVar, this.l, this.e)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(rgVar, 13), 7, (Object) null);
                        int i2 = rgVar.b.c;
                        if (i2 > i) {
                            ref$ObjectRef.element = rgVar;
                            i = i2;
                        }
                        arrayList.add(rgVar);
                    }
                } else {
                    v9Var2 = v9Var3;
                }
                v9Var3 = v9Var2;
            }
            v9 v9Var4 = v9Var3;
            Object obj = ref$ObjectRef.element;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda1(v9Var4, 3), 7, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((rg) ((y9) ref$ObjectRef.element)).d = new ng(arrayList);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(22, v9Var4, ref$ObjectRef), 7, (Object) null);
            y9 y9Var = (y9) ref$ObjectRef.element;
            reentrantLock.unlock();
            return y9Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final LinkedHashMap g() {
        ArrayList arrayList;
        Collection collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.braze.storage.t tVar = this.f;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("triggerDataStoreProvider");
            throw null;
        }
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            arrayList = new ArrayList();
        } else {
            try {
                Object readData = tVar.readData(dataStoreKey, "");
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
        ArrayList<String> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(13), 7, (Object) null);
            return linkedHashMap;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda2(4, arrayList2), 7, (Object) null);
        for (String str2 : arrayList2) {
            if (StringsKt.isBlank(str2)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(20), 7, (Object) null);
            } else {
                try {
                    tg b = og.a.b(new JSONObject(str2), this.b);
                    if (b != null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(b, 14), 7, (Object) null);
                        linkedHashMap.put(b.a, b);
                    }
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 24), 4, (Object) null);
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda3(linkedHashMap, 2), 7, (Object) null);
        return linkedHashMap;
    }

    public final void l() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(21), 6, (Object) null);
        this.c.c(dg.class, new mg$$ExternalSyntheticLambda7(this, 0));
    }

    public static final String c(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Trigger manager received reenqueue with action with id: <", ((rg) y9Var).a, ">.");
    }

    public static final String e() {
        return "Test triggered actions found, triggering test event.";
    }

    public static final String f() {
        return "No test triggered actions found.";
    }

    public static final String e(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Retrieving templated triggered action id ", ((rg) y9Var).a, " from DataStore.");
    }

    public static final String c(v9 v9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No action found for ", v9Var.a(), " event, publishing NoMatchingTriggerEvent");
    }

    public static final String c() {
        return "In flight trigger requests is empty. Executing any pending trigger events.";
    }

    public static final String b(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Registering ", " new triggered actions.");
    }

    public final void b(y9 y9Var) {
        y9Var.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 2), 7, (Object) null);
        b(this.k);
        this.k = 0L;
        this.h.e(y9Var);
    }

    public static final String b(v9 v9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("New incoming <", v9Var.a(), ">. Searching for matching triggers.");
    }

    public final void b(long j) {
        this.k = this.l;
        this.l = j;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j, 10), 7, (Object) null);
    }

    public static final String d() {
        return "Trigger request is in-flight. Not processing trigger event.";
    }

    public static final String d(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Registering triggered action id ", ((rg) y9Var).a, " ");
    }

    public static final String d(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Retrieved ", " triggered actions from DataStore");
    }

    public static final String g(y9 y9Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Fallback trigger has expired. Trigger id: ", ((rg) y9Var).a);
    }

    public static final String a(long j) {
        return Recorder$$ExternalSyntheticOutline2.m(j, "TriggerManager lastDisplayTimeSeconds updated to ");
    }

    public final void a(gg ggVar) {
        ggVar.getClass();
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            ((ArrayDeque) this.i).add(ggVar);
            if (!a()) {
                b();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(17), 7, (Object) null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(v9 v9Var, y9 y9Var) {
        v9Var.getClass();
        y9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 0), 7, (Object) null);
        ng ngVar = ((rg) y9Var).d;
        if (ngVar == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(22), 7, (Object) null);
            return;
        }
        y9 y9Var2 = (y9) ngVar.a.poll();
        if (y9Var2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(14), 7, (Object) null);
            return;
        }
        rg rgVar = (rg) y9Var2;
        rgVar.d = ngVar;
        Map a = this.g.a(y9Var2);
        a.getClass();
        ((tg) y9Var2).f = new HashMap(a);
        long j = ((gg) v9Var).b;
        long j2 = rgVar.b.e;
        long millis = TimeUnit.SECONDS.toMillis(r1.d);
        long j3 = j2 != -1 ? j2 + j : j + millis + q;
        if (j3 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var2, 1), 7, (Object) null);
            a(v9Var, y9Var2);
        } else {
            long max = Math.max(0L, (millis + j) - DateTimeUtils.nowInMilliseconds());
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qg$$ExternalSyntheticLambda3(y9Var2, max, 1), 7, (Object) null);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new lg(y9Var2, this, v9Var, j3, null), 2, null);
        }
    }

    public static final String a(y9 y9Var, long j) {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Performing fallback triggered action with id: <", ((rg) y9Var).a, "> with a delay: ", j);
        m.append(" ms");
        return m.toString();
    }

    public static final void a(mg mgVar, dg dgVar) {
        dgVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mgVar, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(15), 6, (Object) null);
        mgVar.b();
    }

    public final void a(v9 v9Var) {
        v9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda1(v9Var, 1), 7, (Object) null);
        y9 d = d(v9Var);
        if (d != null) {
            Map a = this.g.a(d);
            a.getClass();
            ((tg) d).f = new HashMap(a);
            int i = ((rg) d).b.e;
            long j = i != -1 ? ((gg) v9Var).b + i : -1L;
            long millis = TimeUnit.SECONDS.toMillis(r0.d);
            BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new kg(this, d, v9Var, j, millis, null), 2, null);
            return;
        }
        String a2 = v9Var.a();
        int hashCode = a2.hashCode();
        if (hashCode != 3417674) {
            if (hashCode != 717572172) {
                if (hashCode != 1743324417 || !a2.equals("purchase")) {
                    return;
                }
            } else if (!a2.equals("custom_event")) {
                return;
            }
        } else if (!a2.equals("open")) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new oa$$ExternalSyntheticLambda1(v9Var, 2), 7, (Object) null);
        m9 m9Var = this.d;
        if (m9Var != null) {
            String a3 = v9Var.a();
            a3.getClass();
            ((r7) m9Var).b(new NoMatchingTriggerEvent(a3), NoMatchingTriggerEvent.class);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("externalEventMessenger");
        throw null;
    }

    public static final String a(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Found potential triggered action for incoming trigger event. Action id ", ((rg) y9Var).a, ".");
    }

    public static final String a(v9 v9Var, Ref$ObjectRef ref$ObjectRef) {
        String str;
        y8 y8Var = ((gg) v9Var).c;
        if (y8Var != null) {
            str = JsonUtils.getPrettyPrintedString(((k1) y8Var).getJsonKey());
        } else {
            str = "";
        }
        return StringsKt__IndentKt.replaceIndent("\n     Found best triggered action for incoming trigger event " + str + ".\n     Matched Action id: " + ((rg) ((y9) ref$ObjectRef.element)).a + ".\n                ");
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to parse triggered action JSON:'", str, "' from DataStore.");
    }

    public static final String a(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Successfully loaded ", " triggered actions from DataStore");
    }

    public final boolean a() {
        c7 c7Var = (c7) this.o.e.get(c9.f);
        if (!(c7Var instanceof f4)) {
            return false;
        }
        ArrayList arrayList = ((f4) c7Var).e;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            id idVar = (id) obj;
            d9 d9Var = idVar.a;
            if ((d9Var instanceof l4) && ((l4) d9Var).l.b() && idVar.d == jd.IN_FLIGHT) {
                return true;
            }
        }
        return false;
    }
}
