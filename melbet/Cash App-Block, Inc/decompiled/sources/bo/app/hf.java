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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class hf {
    public final com.braze.storage.q a;

    public hf(Context context, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        this.a = new com.braze.storage.q(context, str, str2);
    }

    public static final String b() {
        return "Could not create new mutable session for open session.";
    }

    public static final String d() {
        return "Failed to set end time to now for session json data";
    }

    public final void a(we weVar) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str;
        weVar.getClass();
        String str2 = weVar.a.b;
        JSONObject value = weVar.getValue();
        a(value);
        com.braze.storage.q qVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = qVar.readData(dataStoreKey, "");
                readData.getClass();
                String str3 = (String) readData;
                if (StringsKt.isBlank(str3)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.trim(str3).toString(), "null")) {
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) gf.a, 6, (Object) null);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str3, MapSerializer);
                            decodeFromString.getClass();
                            map = (Map) decodeFromString;
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
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
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(linkedHashMap);
        mutableMap.put(str2, value.toString());
        com.braze.storage.q qVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r6 = Json.Default;
                    r6.getClass();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    str = r6.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), mutableMap);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = "{}";
                }
                qVar2.writeData(dataStoreKey2, str);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
            }
        }
        boolean z = weVar.d;
        com.braze.storage.q qVar3 = this.a;
        if (!z) {
            qVar3.writeData(DataStoreKey.CURRENT_OPEN_SESSION_ID, str2);
            return;
        }
        DataStoreKey dataStoreKey3 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (Intrinsics.areEqual(qVar3.readString(dataStoreKey3, ""), str2)) {
            this.a.clearData(dataStoreKey3);
        }
    }

    public final we c() {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str = "";
        com.braze.storage.q qVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (!qVar.contains(dataStoreKey)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new hf$$ExternalSyntheticLambda0(1), 7, (Object) null);
            return null;
        }
        try {
            String readString = this.a.readString(dataStoreKey, "");
            com.braze.storage.q qVar2 = this.a;
            DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = qVar2.readData(dataStoreKey2, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) ff.a, 6, (Object) null);
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
            String str3 = (String) linkedHashMap.get(readString);
            if (str3 != null) {
                str = str3;
            }
            return new we(new JSONObject(str));
        } catch (JSONException e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new hf$$ExternalSyntheticLambda0(2), 4, (Object) null);
            return null;
        }
    }

    public static final String a() {
        return "No stored open session in storage.";
    }

    public final void a(String str) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        String str2;
        str.getClass();
        com.braze.storage.q qVar = this.a;
        DataStoreKey dataStoreKey = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            linkedHashMap = new LinkedHashMap();
        } else {
            try {
                Object readData = qVar.readData(dataStoreKey, "");
                readData.getClass();
                String str3 = (String) readData;
                if (StringsKt.isBlank(str3)) {
                    linkedHashMap = new LinkedHashMap();
                } else {
                    DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                    if (StringsKt.isBlank(str3)) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    } else if (Intrinsics.areEqual(StringsKt.trim(str3).toString(), "null")) {
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) ef.a, 6, (Object) null);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            }
                            Object decodeFromString = Json.Default.decodeFromString(str3, MapSerializer);
                            decodeFromString.getClass();
                            map = (Map) decodeFromString;
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
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
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(linkedHashMap);
        mutableMap.remove(str);
        com.braze.storage.q qVar2 = this.a;
        DataStoreKey dataStoreKey2 = DataStoreKey.SESSION_STORAGE_MAP;
        if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey2), 12, (Object) null);
        } else {
            try {
                DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r5 = Json.Default;
                    r5.getClass();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    str2 = r5.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), mutableMap);
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str2 = "{}";
                }
                qVar2.writeData(dataStoreKey2, str2);
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.r(dataStoreKey2), 8, (Object) null);
            }
        }
        com.braze.storage.q qVar3 = this.a;
        DataStoreKey dataStoreKey3 = DataStoreKey.CURRENT_OPEN_SESSION_ID;
        if (str.equals(qVar3.readString(dataStoreKey3, null))) {
            this.a.clearData(dataStoreKey3);
        }
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has("end_time")) {
            return;
        }
        try {
            jSONObject.put("end_time", DateTimeUtils.nowInSecondsPrecise());
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new hf$$ExternalSyntheticLambda0(0), 4, (Object) null);
        }
    }
}
