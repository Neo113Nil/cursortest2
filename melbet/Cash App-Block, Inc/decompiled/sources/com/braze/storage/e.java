package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.s6;
import bo.app.t6;
import bo.app.u6;
import bo.app.v6;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes4.dex */
public final class e extends DataStoreProvider {
    public static final s6 b = new s6();
    public final Mutex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        this.a = new MutexImpl();
    }

    public final long a(String str) {
        Map linkedHashMap;
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        str.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_LAST_REQUEST_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) v6.a, 6, (Object) null);
                                map2 = EmptyMap.INSTANCE;
                                map2.getClass();
                                map = map2;
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str2, MapSerializer);
                            decodeFromString.getClass();
                            map2 = (Map) decodeFromString;
                            map = map2;
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
        Long l = (Long) linkedHashMap.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(new SharedPreferencesMigration(getContext(), "persistent.com.braze.requests.metadata.last_req_at", (RealGcmRegistrar$unregister$2) null, new t6(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "persistent.com.braze.endpoint_metadata";
    }

    public final long a(String str, long j) {
        Map linkedHashMap;
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        str.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.ENDPOINT_ATTEMPT_COUNT_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = readData(dataStoreKey, "");
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) u6.a, 6, (Object) null);
                                map2 = EmptyMap.INSTANCE;
                                map2.getClass();
                                map = map2;
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str2, MapSerializer);
                            decodeFromString.getClass();
                            map2 = (Map) decodeFromString;
                            map = map2;
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
        Long l = (Long) linkedHashMap.get(str);
        return l != null ? l.longValue() : j;
    }
}
