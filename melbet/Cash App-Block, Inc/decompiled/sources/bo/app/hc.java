package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
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
public final class hc {
    public final ReentrantLock a;
    public final ArrayList b;
    public final com.braze.storage.j c;

    public hc(Context context, String str) {
        Map linkedHashMap;
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        context.getClass();
        str.getClass();
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        com.braze.storage.j jVar = new com.braze.storage.j(context, str);
        this.c = jVar;
        reentrantLock.lock();
        try {
            arrayList.clear();
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = jVar.readData(dataStoreKey, "");
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
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) ec.a, 6, (Object) null);
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
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                this.b.add(new dc((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String c(List list) {
        return "Re-adding PDEs to storage: " + list;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01a5 A[Catch: all -> 0x0033, LOOP:0: B:8:0x019f->B:10:0x01a5, LOOP_END, TryCatch #2 {all -> 0x0033, blocks: (B:3:0x0008, B:5:0x0014, B:7:0x019b, B:8:0x019f, B:10:0x01a5, B:12:0x01cd, B:14:0x01da, B:15:0x0244, B:21:0x01f2, B:23:0x01f4, B:24:0x022a, B:29:0x020a, B:33:0x021f, B:38:0x022e, B:40:0x0037, B:42:0x0049, B:43:0x0053, B:45:0x005b, B:46:0x0173, B:47:0x0062, B:49:0x0073, B:51:0x007a, B:54:0x008e, B:55:0x0135, B:57:0x00a4, B:59:0x00b0, B:60:0x00c2, B:62:0x00ce, B:63:0x00df, B:65:0x00eb, B:66:0x00fc, B:68:0x0108, B:69:0x0119, B:71:0x0125, B:74:0x0142, B:79:0x015d, B:87:0x017e), top: B:2:0x0008, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01da A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #2 {all -> 0x0033, blocks: (B:3:0x0008, B:5:0x0014, B:7:0x019b, B:8:0x019f, B:10:0x01a5, B:12:0x01cd, B:14:0x01da, B:15:0x0244, B:21:0x01f2, B:23:0x01f4, B:24:0x022a, B:29:0x020a, B:33:0x021f, B:38:0x022e, B:40:0x0037, B:42:0x0049, B:43:0x0053, B:45:0x005b, B:46:0x0173, B:47:0x0062, B:49:0x0073, B:51:0x007a, B:54:0x008e, B:55:0x0135, B:57:0x00a4, B:59:0x00b0, B:60:0x00c2, B:62:0x00ce, B:63:0x00df, B:65:0x00eb, B:66:0x00fc, B:68:0x0108, B:69:0x0119, B:71:0x0125, B:74:0x0142, B:79:0x015d, B:87:0x017e), top: B:2:0x0008, inners: #0, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List list) {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        HashMapSerializer MapSerializer;
        Iterator it;
        DataStoreKey dataStoreKey;
        String str;
        list.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            com.braze.storage.j jVar = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = jVar.readData(dataStoreKey2, "");
                    readData.getClass();
                    String str2 = (String) readData;
                    if (StringsKt.isBlank(str2)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) gc.a, 6, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                            linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                            Map map2 = linkedHashMap;
                                            it = list.iterator();
                                            while (it.hasNext()) {
                                            }
                                            hc hcVar = this;
                                            com.braze.storage.j jVar2 = hcVar.c;
                                            dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                            }
                                            hcVar.b.removeAll(list);
                                            reentrantLock.unlock();
                                        }
                                    }
                                    Object decodeFromString = Json.Default.decodeFromString(str2, MapSerializer);
                                    decodeFromString.getClass();
                                    map = (Map) decodeFromString;
                                } catch (Exception e2) {
                                    exc = e2;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str2), 4, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                    Map map22 = linkedHashMap;
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                    }
                                    hc hcVar2 = this;
                                    com.braze.storage.j jVar22 = hcVar2.c;
                                    dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    hcVar2.b.removeAll(list);
                                    reentrantLock.unlock();
                                }
                            } catch (Exception e3) {
                                e = e3;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            Map map222 = linkedHashMap;
            it = list.iterator();
            while (it.hasNext()) {
                dc dcVar = (dc) it.next();
                hc hcVar3 = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) hcVar3, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(dcVar, 10), 7, (Object) null);
                String string2 = dcVar.b.getString("cid");
                string2.getClass();
                map222.remove(string2);
                this = hcVar3;
            }
            hc hcVar22 = this;
            com.braze.storage.j jVar222 = hcVar22.c;
            dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), map222);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str = (!(map222 instanceof Map) && (map222 instanceof List)) ? "[]" : "{}";
                    }
                    jVar222.writeData(dataStoreKey, str);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                }
            }
            hcVar22.b.removeAll(list);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(List list) {
        list.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new h2$$ExternalSyntheticLambda0(list, 4), 7, (Object) null);
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.addAll(list);
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding push campaign to storage with uid ", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01c4 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #5 {all -> 0x004a, blocks: (B:3:0x000c, B:5:0x002e, B:6:0x01b1, B:8:0x01c4, B:9:0x022d, B:15:0x01e1, B:17:0x01e3, B:18:0x020c, B:23:0x01fa, B:26:0x0213, B:28:0x004d, B:30:0x005f, B:31:0x006b, B:33:0x0073, B:34:0x0188, B:35:0x007a, B:37:0x008b, B:39:0x0092, B:41:0x00a6, B:42:0x014c, B:43:0x00bb, B:45:0x00c7, B:46:0x00d9, B:48:0x00e5, B:49:0x00f6, B:51:0x0102, B:52:0x0113, B:54:0x011f, B:55:0x0130, B:57:0x013c, B:58:0x0158, B:61:0x0161, B:62:0x0164, B:67:0x016e, B:71:0x0192), top: B:2:0x000c, inners: #0, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        Map linkedHashMap;
        Map map;
        HashMapSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str2;
        str.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str, 12), 7, (Object) null);
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            com.braze.storage.j jVar = this.c;
            DataStoreKey dataStoreKey2 = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(brazeLogger, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = jVar.readData(dataStoreKey2, "");
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
                                    try {
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) fc.a, 6, (Object) null);
                                        map = EmptyMap.INSTANCE;
                                        map.getClass();
                                    } catch (Exception e) {
                                        e = e;
                                        dataStoreUtils = dataStoreUtils;
                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                                        map = EmptyMap.INSTANCE;
                                        map.getClass();
                                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                        linkedHashMap.put(str, Long.valueOf(nowInSeconds));
                                        com.braze.storage.j jVar2 = this.c;
                                        dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
                                        if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                                        }
                                        this.b.add(new dc(str, nowInSeconds));
                                    }
                                }
                                Object decodeFromString = Json.Default.decodeFromString(str3, MapSerializer);
                                decodeFromString.getClass();
                                map = (Map) decodeFromString;
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e3) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new DataStoreProvider.m(dataStoreKey2), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            linkedHashMap.put(str, Long.valueOf(nowInSeconds));
            com.braze.storage.j jVar22 = this.c;
            dataStoreKey = DataStoreKey.PUSH_DELIVERY_EVENTS;
            if (dataStoreKey.getType() == DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r3 = Json.Default;
                        r3.getClass();
                        str2 = r3.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
                    } catch (Exception e4) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str2 = "{}";
                    }
                    jVar22.writeData(dataStoreKey, str2);
                } catch (Exception e5) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                }
            }
            this.b.add(new dc(str, nowInSeconds));
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(dc dcVar) {
        String string2 = dcVar.b.getString("cid");
        string2.getClass();
        return "Clearing PDE from storage with uid " + string2;
    }
}
