package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class q1 {
    public final com.braze.storage.f a;

    public q1(Context context, String str, String str2) {
        context.getClass();
        this.a = new com.braze.storage.f(context, str, str2);
    }

    public static final String c(y8 y8Var) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding event to storage with uid ", ((k1) y8Var).d);
    }

    public final void a(Set set) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str;
        set.getClass();
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = fVar.readData(dataStoreKey, "");
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
                            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) o1.a, 6, (Object) null);
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
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = ((k1) ((y8) it.next())).d;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str3, 11), 7, (Object) null);
            map2.remove(str3);
        }
        com.braze.storage.f fVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = r0.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), map2);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(map2 instanceof Map) && (map2 instanceof List)) ? "[]" : "{}";
            }
            fVar2.writeData(dataStoreKey2, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection b() {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        Object linkedHashMap2;
        Map map2;
        HashMapSerializer MapSerializer2;
        DataStoreKey dataStoreKey;
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        DataStoreValueType type2 = dataStoreKey2.getType();
        DataStoreValueType dataStoreValueType = DataStoreValueType.MAP;
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        Class<String> cls6 = String.class;
        if (type2 != dataStoreValueType) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = fVar.readData(dataStoreKey2, "");
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
                            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls6);
                            if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls6))) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject), BuiltinSerializersKt.serializer(stringCompanionObject));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls5))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls4))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls3))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls2))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                            } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(cls))) {
                                MapSerializer = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                            } else {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) p1.a, 6, (Object) null);
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
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                linkedHashMap = new LinkedHashMap();
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            try {
                y8 e3 = k1.g.e(str4, str3);
                if (e3 != null) {
                    linkedHashSet.add(e3);
                }
            } catch (Exception e4) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                Class<String> cls7 = cls6;
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) e4, false, (Function0) new j1$$ExternalSyntheticLambda7(str4, str3, 14), 4, (Object) null);
                com.braze.storage.f fVar2 = this.a;
                DataStoreKey dataStoreKey3 = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey3.getType() != DataStoreValueType.MAP) {
                    BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), priority, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey3), 12, (Object) null);
                    linkedHashMap2 = new LinkedHashMap();
                } else {
                    try {
                        Object readData2 = fVar2.readData(dataStoreKey3, "");
                        readData2.getClass();
                        String str5 = (String) readData2;
                        if (StringsKt.isBlank(str5)) {
                            linkedHashMap2 = new LinkedHashMap();
                        } else {
                            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                            if (StringsKt.isBlank(str5)) {
                                map2 = EmptyMap.INSTANCE;
                                map2.getClass();
                            } else if (Intrinsics.areEqual(StringsKt.trim(str5).toString(), "null")) {
                                map2 = EmptyMap.INSTANCE;
                                map2.getClass();
                            } else {
                                try {
                                    ReflectionFactory reflectionFactory2 = Reflection.factory;
                                    KClass orCreateKotlinClass2 = reflectionFactory2.getOrCreateKotlinClass(cls7);
                                    if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls7))) {
                                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(stringCompanionObject2), BuiltinSerializersKt.serializer(stringCompanionObject2));
                                    } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls5))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
                                    } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls4))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
                                    } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls3))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
                                    } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls2))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
                                    } else if (orCreateKotlinClass2.equals(reflectionFactory2.getOrCreateKotlinClass(cls))) {
                                        MapSerializer2 = BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
                                    } else {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils2, priority, (Throwable) null, false, (Function0) n1.a, 6, (Object) null);
                                        map2 = EmptyMap.INSTANCE;
                                        map2.getClass();
                                    }
                                    Object decodeFromString2 = Json.Default.decodeFromString(str5, MapSerializer2);
                                    decodeFromString2.getClass();
                                    map2 = (Map) decodeFromString2;
                                } catch (Exception e5) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new DataStoreUtils.b(str5), 4, (Object) null);
                                    map2 = EmptyMap.INSTANCE;
                                    map2.getClass();
                                }
                            }
                            linkedHashMap2 = TypeIntrinsics.asMutableMap(new LinkedHashMap(map2));
                        }
                    } catch (Exception e6) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new DataStoreProvider.m(dataStoreKey3), 8, (Object) null);
                        linkedHashMap2 = new LinkedHashMap();
                        Object obj = linkedHashMap2;
                        TypeIntrinsics.asMutableMap(obj).remove(str3);
                        com.braze.storage.f fVar3 = this.a;
                        dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
                        } else {
                            try {
                                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                                try {
                                    Json.Default r0 = Json.Default;
                                    r0.getClass();
                                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                                    str = r0.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), obj);
                                } catch (Exception e7) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e7, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                                    str = (!(obj instanceof Map) && (obj instanceof List)) ? "[]" : "{}";
                                }
                                fVar3.writeData(dataStoreKey, str);
                            } catch (Exception e8) {
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e8, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                            }
                        }
                        cls6 = cls7;
                        linkedHashSet = linkedHashSet2;
                    }
                }
                Object obj2 = linkedHashMap2;
                TypeIntrinsics.asMutableMap(obj2).remove(str3);
                com.braze.storage.f fVar32 = this.a;
                dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
                if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                }
                cls6 = cls7;
                linkedHashSet = linkedHashSet2;
            }
        }
        return linkedHashSet;
    }

    public final void a(y8 y8Var) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str;
        y8Var.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new m7$$ExternalSyntheticLambda1(y8Var, 6), 7, (Object) null);
        com.braze.storage.f fVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = fVar.readData(dataStoreKey, "");
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
                            KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(String.class);
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
                                BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) m1.a, 6, (Object) null);
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
        k1 k1Var = (k1) y8Var;
        String str3 = k1Var.d;
        String jSONObject = k1Var.getJsonKey().toString();
        jSONObject.getClass();
        linkedHashMap.put(str3, jSONObject);
        com.braze.storage.f fVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.EVENT_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r3 = Json.Default;
                r3.getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = r3.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), linkedHashMap);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            fVar2.writeData(dataStoreKey2, str);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
        }
    }

    public static final String a(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Could not create BrazeEvent from [serialized event string=", str, ", unique identifier=", str2, "] ... Deleting!");
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Deleting event from storage with uid ", str);
    }
}
