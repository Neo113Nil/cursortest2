package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class qg implements x9 {
    public final com.braze.storage.t a;
    public final Map b;
    public final LinkedHashMap c;

    public qg(com.braze.storage.t tVar) {
        tVar.getClass();
        this.a = tVar;
        this.b = a();
        this.c = new LinkedHashMap();
    }

    public static final String b(long j, q9 q9Var) {
        long nowInSeconds = DateTimeUtils.nowInSeconds() - j;
        int i = ((vc) q9Var).a;
        return "Trigger action is not re-eligible for display since only " + nowInSeconds + " seconds have passed since the last time it was triggered (minimum interval: " + (i > 0 ? Integer.valueOf(i) : null) + ").";
    }

    public static final String c(y9 y9Var, long j) {
        return "Resetting re-eligibility for action Id " + ((rg) y9Var).a + " to " + j;
    }

    public static final String d(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Triggered action id ", ((rg) y9Var).a, " no longer eligible due to having been triggered in the past and is only eligible once.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        ReflectionFactory reflectionFactory;
        KClass orCreateKotlinClass;
        HashMapSerializer MapSerializer;
        Map map2;
        com.braze.storage.t tVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = tVar.readData(dataStoreKey, "");
                readData.getClass();
                String str = (String) readData;
                if (StringsKt.isBlank(str)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str)) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else {
                        try {
                            reflectionFactory = Reflection.factory;
                            orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Long.class);
                        } catch (Exception e) {
                            e = e;
                            dataStoreUtils = dataStoreUtils2;
                        }
                        try {
                            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(String.class))) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Double.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Float.TYPE))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                            } else {
                                dataStoreUtils = dataStoreUtils2;
                                try {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) pg.a, 6, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                } catch (Exception e2) {
                                    e = e2;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                    map2 = linkedHashMap;
                                    if (map2.isEmpty()) {
                                    }
                                    return map2;
                                }
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str, MapSerializer);
                            decodeFromString.getClass();
                            map = (Map) decodeFromString;
                        } catch (Exception e3) {
                            exc = e3;
                            dataStoreUtils = dataStoreUtils2;
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                            linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                            map2 = linkedHashMap;
                            if (map2.isEmpty()) {
                            }
                            return map2;
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        map2 = linkedHashMap;
        if (map2.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pf$$ExternalSyntheticLambda0(14), 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qg$$ExternalSyntheticLambda0(0, map2), 7, (Object) null);
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2((String) ((Map.Entry) it.next()).getKey(), 16), 7, (Object) null);
            }
        }
        return map2;
    }

    public final void e(y9 y9Var) {
        String str;
        y9Var.getClass();
        rg rgVar = (rg) y9Var;
        if (rgVar.b.f.a == -1) {
            this.b.remove(rgVar.a);
        } else {
            Long l = (Long) this.c.get(rgVar.a);
            long longValue = l != null ? l.longValue() : 0L;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qg$$ExternalSyntheticLambda3(y9Var, longValue, 0), 7, (Object) null);
            this.b.put(rgVar.a, Long.valueOf(longValue));
        }
        com.braze.storage.t tVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            tVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String c(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Triggered action id ", ((rg) y9Var).a, " always eligible via never having been triggered. Returning true for eligibility status");
    }

    public static final String c(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Retrieving triggered action id ", str, " eligibility information from DataStore.");
    }

    public static final String b(y9 y9Var) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Triggered action id ", ((rg) y9Var).a, " always eligible via configuration. Returning true for eligibility status");
    }

    public static final String b(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Deleting outdated triggered action id ", str, " from stored re-eligibility list.");
    }

    public static final String b(y9 y9Var, long j) {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Updating re-eligibility for action Id ", ((rg) y9Var).a, " to time ", j);
        m.append(".");
        return m.toString();
    }

    public static final String b(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Retrieved ", " trigger re-eligibility entries from DataStore");
    }

    public static final String b() {
        return "No trigger re-eligibility information found in DataStore";
    }

    public static final String a(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Successfully updated re-eligibility map in DataStore with ", " entries");
    }

    public final boolean a(y9 y9Var) {
        y9Var.getClass();
        rg rgVar = (rg) y9Var;
        final vc vcVar = rgVar.b.f;
        final int i = 1;
        if (vcVar.a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 6), 7, (Object) null);
            return true;
        }
        if (!this.b.containsKey(rgVar.a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 7), 7, (Object) null);
            return true;
        }
        final int i2 = 0;
        if (vcVar.a == -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new mg$$ExternalSyntheticLambda8(y9Var, 5), 7, (Object) null);
            return false;
        }
        Long l = (Long) this.b.get(rgVar.a);
        final long longValue = l != null ? l.longValue() : 0L;
        long nowInSeconds = DateTimeUtils.nowInSeconds() + rgVar.b.d;
        int i3 = vcVar.a;
        if (nowInSeconds >= ((i3 > 0 ? Integer.valueOf(i3) : null) != null ? r0.intValue() : 0) + longValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: bo.app.qg$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            return qg.a(longValue, vcVar);
                        default:
                            return qg.b(longValue, vcVar);
                    }
                }
            }, 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: bo.app.qg$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return qg.a(longValue, vcVar);
                    default:
                        return qg.b(longValue, vcVar);
                }
            }
        }, 7, (Object) null);
        return false;
    }

    public static final String a(long j, q9 q9Var) {
        long nowInSeconds = DateTimeUtils.nowInSeconds() - j;
        int i = ((vc) q9Var).a;
        return "Trigger action is re-eligible for display since " + nowInSeconds + " seconds have passed since the last time it was triggered (minimum interval: " + (i > 0 ? Integer.valueOf(i) : null) + ").";
    }

    public final void a(y9 y9Var, long j) {
        String str;
        y9Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qg$$ExternalSyntheticLambda3(y9Var, j, 2), 7, (Object) null);
        LinkedHashMap linkedHashMap = this.c;
        rg rgVar = (rg) y9Var;
        String str2 = rgVar.a;
        Long l = (Long) this.b.get(str2);
        linkedHashMap.put(str2, Long.valueOf(l != null ? l.longValue() : 0L));
        this.b.put(rgVar.a, Long.valueOf(j));
        com.braze.storage.t tVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        Map map = this.b;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(map instanceof Map) && (map instanceof List)) ? "[]" : "{}";
            }
            tVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Retaining triggered action ", str, " in re-eligibility list.");
    }

    public final void a(List list) {
        String str;
        qg qgVar = this;
        list.getClass();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rg) ((y9) it.next())).a);
        }
        Map map = qgVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            boolean contains = arrayList.contains(str2);
            if (contains) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str2, 17), 7, (Object) null);
                qgVar = this;
            } else {
                qgVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str2, 18), 7, (Object) null);
            }
            if (contains) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        com.braze.storage.t tVar = qgVar.a;
        DataStoreKey dataStoreKey = DataStoreKey.TRIGGERED_ACTIONS_IMPRESSION_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = "{}";
                }
                tVar.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) qgVar, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new g7$$ExternalSyntheticLambda3(linkedHashMap, 3), 7, (Object) null);
    }
}
