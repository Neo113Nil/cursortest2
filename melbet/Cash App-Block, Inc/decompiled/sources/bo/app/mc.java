package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.storage.k;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
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
public final class mc {
    public static final long b = 3888000;
    public final k a;

    public mc(Context context, String str, String str2) {
        context.getClass();
        this.a = new k(context, str2, str);
        b();
    }

    public static final String c() {
        return "Push dedupe id is blank. Returning true.";
    }

    public final Map a() {
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = kVar.readData(dataStoreKey, "");
            readData.getClass();
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new LinkedHashMap();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str)) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) lc.a, 6, (Object) null);
                        map2 = EmptyMap.INSTANCE;
                        map2.getClass();
                        map = map2;
                    }
                    Object decodeFromString = Json.Default.decodeFromString(str, MapSerializer);
                    decodeFromString.getClass();
                    map2 = (Map) decodeFromString;
                    map = map2;
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
            }
            return TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
            return new LinkedHashMap();
        }
    }

    public final void b() {
        String str;
        long nowInSeconds = DateTimeUtils.nowInSeconds() - b;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(a());
        Iterator it = mutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((Number) entry.getValue()).longValue() < nowInSeconds) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new mc$$ExternalSyntheticLambda0(entry, nowInSeconds, 0), 6, (Object) null);
                it.remove();
            }
        }
        k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), mutableMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            kVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String b(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Push dedupe id ", str, " has already been seen. Returning false.");
    }

    public static final String a(Map.Entry entry, long j) {
        return "Evicting push id key " + entry.getKey() + " based on cutoff: " + j;
    }

    public final boolean a(String str) {
        String str2;
        str.getClass();
        if (StringsKt.isBlank(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(12), 7, (Object) null);
            return true;
        }
        if (a().containsKey(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 23), 7, (Object) null);
            return false;
        }
        b();
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(a());
        mutableMap.put(str, Long.valueOf(DateTimeUtils.nowInSeconds()));
        k kVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_ID_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return true;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), mutableMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = "{}";
            }
            kVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
        return true;
    }
}
