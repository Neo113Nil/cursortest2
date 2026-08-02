package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.models.BrazeGeofence;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.GeofenceDataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
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
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class y1 {
    public final GeofenceDataStoreProvider a;
    public final ConcurrentHashMap b;
    public final AtomicBoolean c;
    public long d;
    public long e;
    public int f;
    public int g;

    public y1(ue ueVar, m9 m9Var, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        ueVar.getClass();
        m9Var.getClass();
        geofenceDataStoreProvider.getClass();
        this.a = geofenceDataStoreProvider;
        ((r7) m9Var).c(xe.class, new mg$$ExternalSyntheticLambda7(this, 3));
        this.b = a();
        this.c = new AtomicBoolean(false);
        Object readData = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REQUEST, 0L);
        readData.getClass();
        this.d = ((Long) readData).longValue();
        Object readData2 = geofenceDataStoreProvider.readData(DataStoreKey.GLOBAL_LAST_REPORT, 0L);
        readData2.getClass();
        this.e = ((Long) readData2).longValue();
        this.f = ueVar.u();
        this.g = ueVar.t();
    }

    public static final String b(long j, y1 y1Var) {
        return j + " seconds have passed since the last time geofences were requested (minimum interval: " + y1Var.f + ").";
    }

    public static final String c(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Deleting outdated id ", str, " from re-eligibility list.");
    }

    public static final String d(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Retaining id ", str, " in re-eligibility list.");
    }

    public final void a(List list) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str;
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((BrazeGeofence) it.next()).getId());
        }
        HashSet hashSet = new HashSet(this.b.keySet());
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
                readData.getClass();
                String str2 = (String) readData;
                if (StringsKt.isBlank(str2)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str2)) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.trim(str2).toString(), "null")) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else {
                        try {
                            ReflectionFactory reflectionFactory = Reflection.factory;
                            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Long.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) x1.a, 6, (Object) null);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str2, MapSerializer);
                            decodeFromString.getClass();
                            map = (Map) decodeFromString;
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        Map map2 = linkedHashMap;
        Iterator it2 = hashSet.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            str3.getClass();
            if (linkedHashSet.contains(a(str3))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str3, 11), 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new x3$$ExternalSyntheticLambda2(str3, 10), 7, (Object) null);
                this.b.remove(str3);
                map2.remove(str3);
            }
        }
        GeofenceDataStoreProvider geofenceDataStoreProvider2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map2);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(map2 instanceof Map) && (map2 instanceof List)) ? "[]" : "{}";
            }
            geofenceDataStoreProvider2.writeData(dataStoreKey2, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String c() {
        return "Geofences have already been requested for the current session. Geofence request not eligible.";
    }

    public static final String b() {
        return "Geofences have not been requested for the current session yet. Request is eligible.";
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Exception trying to parse re-eligibility id: ", str);
    }

    public static final String b(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Min time since last geofence report reset via server configuration: ", ".");
    }

    public static final void a(y1 y1Var, xe xeVar) {
        xeVar.getClass();
        y1Var.c.set(false);
    }

    public final void a(re reVar) {
        reVar.getClass();
        int i = reVar.e;
        if (i >= 0) {
            this.f = i;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i, 4), 6, (Object) null);
        }
        int i2 = reVar.f;
        if (i2 >= 0) {
            this.g = i2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(i2, 5), 6, (Object) null);
        }
    }

    public final boolean a(boolean z, long j) {
        final long j2 = j - this.d;
        if (!z && this.f > j2) {
            final int i = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: bo.app.y1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    y1 y1Var = this;
                    long j3 = j2;
                    switch (i2) {
                        case 0:
                            return y1.a(j3, y1Var);
                        default:
                            return y1.b(j3, y1Var);
                    }
                }
            }, 7, (Object) null);
            return false;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c6$$ExternalSyntheticLambda0(j2, 12), 7, (Object) null);
        } else {
            final int i2 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: bo.app.y1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    y1 y1Var = this;
                    long j3 = j2;
                    switch (i22) {
                        case 0:
                            return y1.a(j3, y1Var);
                        default:
                            return y1.b(j3, y1Var);
                    }
                }
            }, 7, (Object) null);
        }
        if (this.c.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(15), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new z$$ExternalSyntheticLambda0(14), 7, (Object) null);
        return false;
    }

    public static final String a(long j, y1 y1Var) {
        return "Geofence request suppressed since only " + j + " seconds have passed since the last time geofences were requested (minimum interval: " + y1Var.f + ").";
    }

    public static final String a(long j) {
        return Recorder$$ExternalSyntheticOutline2.m(j, "Ignoring rate limit for this geofence request. Elapsed time since last request:");
    }

    public final String a(String str) {
        str.getClass();
        try {
            return (String) new Regex("_").split(2, str).get(1);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new x3$$ExternalSyntheticLambda2(str, 9), 4, (Object) null);
            return null;
        }
    }

    public static final String a(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Min time since last geofence request reset via server configuration: ", ".");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x019f A[LOOP:0: B:5:0x0199->B:7:0x019f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ConcurrentHashMap a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        ReflectionFactory reflectionFactory;
        KClass orCreateKotlinClass;
        HashMapSerializer MapSerializer;
        GeofenceDataStoreProvider geofenceDataStoreProvider = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.INDIVIDUAL_REELIGIBILITY_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = geofenceDataStoreProvider.readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) v1.a, 6, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                } catch (Exception e2) {
                                    e = e2;
                                    exc = e;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    while (r0.hasNext()) {
                                    }
                                    return concurrentHashMap;
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
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                            while (r0.hasNext()) {
                            }
                            return concurrentHashMap2;
                        }
                    }
                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        ConcurrentHashMap concurrentHashMap22 = new ConcurrentHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            y1 y1Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) y1Var, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(4, this, str2), 7, (Object) null);
            concurrentHashMap22.put(str2, Long.valueOf(longValue));
            this = y1Var;
        }
        return concurrentHashMap22;
    }

    public static final String a(y1 y1Var, String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Retrieving geofence id ", y1Var.a(str), " eligibility information from local storage.");
    }
}
