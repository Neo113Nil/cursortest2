package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.DateTimeUtils;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
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
public final class qc {
    public final ue a;
    public final com.braze.storage.l b;

    public qc(Context context, String str, String str2, r7 r7Var, ue ueVar) {
        context.getClass();
        str.getClass();
        r7Var.getClass();
        ueVar.getClass();
        this.a = ueVar;
        this.b = new com.braze.storage.l(context, str2, str);
        r7Var.c(rc.class, new mg$$ExternalSyntheticLambda7(this, 2));
        c();
    }

    public static final String b(String str, long j) {
        return "Adding push campaign to storage with uid " + str + " and time " + j;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x01a7 A[Catch: Exception -> 0x002a, LOOP:0: B:6:0x01a1->B:8:0x01a7, LOOP_END, TRY_LEAVE, TryCatch #1 {Exception -> 0x002a, blocks: (B:2:0x0000, B:4:0x000c, B:5:0x0190, B:6:0x01a1, B:8:0x01a7, B:61:0x0175, B:14:0x002e, B:16:0x0040, B:17:0x004b, B:19:0x0053, B:20:0x016b, B:21:0x005a, B:23:0x006b, B:53:0x0155), top: B:1:0x0000, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        HashMapSerializer MapSerializer;
        try {
            com.braze.storage.l lVar = this.b;
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = lVar.readData(dataStoreKey, "");
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) pc.a, 6, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                            linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                            ArrayList arrayList = new ArrayList(linkedHashMap.size());
                                            while (r0.hasNext()) {
                                            }
                                            return arrayList;
                                        }
                                    }
                                    Object decodeFromString = Json.Default.decodeFromString(str, MapSerializer);
                                    decodeFromString.getClass();
                                    map = (Map) decodeFromString;
                                } catch (Exception e2) {
                                    exc = e2;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str), 4, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                                    while (r0.hasNext()) {
                                    }
                                    return arrayList2;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                dataStoreUtils = dataStoreUtils2;
                            }
                        }
                        linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                    }
                } catch (Exception e4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider.m(dataStoreKey), 8, (Object) null);
                    linkedHashMap = new LinkedHashMap();
                }
            }
            ArrayList arrayList22 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList22.add(new oc((String) entry.getKey(), ((Number) entry.getValue()).longValue()));
            }
            return arrayList22;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new pf$$ExternalSyntheticLambda0(13), 4, (Object) null);
            return EmptyList.INSTANCE;
        }
    }

    public final void c() {
        String str;
        long nowInSeconds = DateTimeUtils.nowInSeconds() - 3888000;
        List a = a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (((oc) obj).b >= nowInSeconds) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != a.size()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda3(a, arrayList, 1), 7, (Object) null);
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                oc ocVar = (oc) obj2;
                linkedHashMap.put(ocVar.a, Long.valueOf(ocVar.b));
            }
            boolean isEmpty = linkedHashMap.isEmpty();
            com.braze.storage.l lVar = this.b;
            if (isEmpty) {
                lVar.clearData(DataStoreKey.PUSH_MAX_CAMPAIGNS);
                return;
            }
            DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
                return;
            }
            try {
                DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                try {
                    Json.Default r4 = Json.Default;
                    r4.getClass();
                    str = r4.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                    str = "{}";
                }
                lVar.writeData(dataStoreKey, str);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
            }
        }
    }

    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Adding push campaign to storage with uid ", str);
    }

    public static final String b() {
        return "Error reading push max campaign data from DataStore.";
    }

    public final void a(String str) {
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o6$$ExternalSyntheticLambda2(str, 14), 7, (Object) null);
        if (StringsKt.isBlank(str)) {
            return;
        }
        a(str, DateTimeUtils.nowInSeconds());
    }

    public static final String a(List list, List list2) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size() - list2.size(), "Pruning ", " expired campaigns");
    }

    public final void a(String str, long j) {
        String str2;
        str.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qc$$ExternalSyntheticLambda4(str, j, 0), 7, (Object) null);
        List<oc> a = a();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(a, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (oc ocVar : a) {
            linkedHashMap.put(ocVar.a, Long.valueOf(ocVar.b));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put(str, Long.valueOf(j));
        com.braze.storage.l lVar = this.b;
        DataStoreKey dataStoreKey = DataStoreKey.PUSH_MAX_CAMPAIGNS;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap2);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = "{}";
            }
            lVar.writeData(dataStoreKey, str2);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
        }
    }

    public static final void a(qc qcVar, rc rcVar) {
        rcVar.getClass();
        qcVar.b.writeData(DataStoreKey.PUSH_MAX_LAST_UPDATE, Long.valueOf(rcVar.a));
    }
}
