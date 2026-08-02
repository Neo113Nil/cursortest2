package bo.app;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.EmptyCoroutineContext;
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
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class m7 {
    public static final long c = 604800000;
    public final com.braze.storage.g a;
    public final Mutex b;

    public m7(Context context, String str, String str2) {
        context.getClass();
        str2.getClass();
        this.a = new com.braze.storage.g(context, str, str2);
        this.b = new MutexImpl();
        b();
    }

    public final Map a() {
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        com.braze.storage.g gVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = gVar.readData(dataStoreKey, "");
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) l7.a, 6, (Object) null);
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
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        for (Map.Entry entry : a().entrySet()) {
            try {
                if (nowInMilliseconds >= ((Number) entry.getValue()).longValue()) {
                    JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new k7(this, (String) entry.getKey(), null));
                }
            } catch (Exception e) {
                m7 m7Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) m7Var, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new h$$ExternalSyntheticLambda0(entry, 12), 4, (Object) null);
                JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new k7(m7Var, (String) entry.getKey(), null));
                this = m7Var;
            }
        }
    }

    public static final String b(y8 y8Var) {
        return "Event already seen in cache. Ignoring duplicate: " + y8Var;
    }

    public static final void a(m7 m7Var, Map map) {
        String str;
        com.braze.storage.g gVar = m7Var.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP;
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
                str = "{}";
            }
            gVar.writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public final boolean a(y8 y8Var) {
        y8Var.getClass();
        if (((k1) y8Var).a != w7.h) {
            return true;
        }
        b();
        String a = i7.a(y8Var);
        if (a().containsKey(a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 0), 7, (Object) null);
            return false;
        }
        long nowInMilliseconds = DateTimeUtils.nowInMilliseconds() + c;
        a.getClass();
        JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new j7(this, a, nowInMilliseconds, null));
        return true;
    }

    public static final String a(Map.Entry entry) {
        return "Failed to get expiration time. Deleting entry: " + entry;
    }
}
