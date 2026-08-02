package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class sb extends SuspendLambda implements Function2 {
    public Mutex a;
    public com.braze.storage.i b;
    public String c;
    public int d;
    public final /* synthetic */ com.braze.storage.i e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.braze.storage.i iVar, String str, Continuation continuation) {
        super(2, continuation);
        this.e = iVar;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new sb(this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sb(this.e, this.f, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01cb A[Catch: all -> 0x005c, TryCatch #4 {all -> 0x005c, blocks: (B:6:0x0034, B:8:0x003e, B:9:0x01c3, B:11:0x01cb, B:12:0x01d1, B:14:0x01e4, B:15:0x0240, B:21:0x01fc, B:23:0x01fe, B:24:0x0223, B:29:0x0214, B:32:0x022a, B:35:0x0060, B:37:0x0072, B:38:0x007e, B:40:0x0086, B:41:0x019e, B:42:0x008d, B:44:0x009e, B:46:0x00a5, B:49:0x00b9, B:50:0x0160, B:52:0x00cf, B:54:0x00db, B:55:0x00ed, B:57:0x00f9, B:58:0x010a, B:60:0x0116, B:61:0x0127, B:63:0x0133, B:64:0x0144, B:66:0x0150, B:69:0x016d, B:74:0x0188, B:82:0x01a8), top: B:5:0x0034, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01e4 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #4 {all -> 0x005c, blocks: (B:6:0x0034, B:8:0x003e, B:9:0x01c3, B:11:0x01cb, B:12:0x01d1, B:14:0x01e4, B:15:0x0240, B:21:0x01fc, B:23:0x01fe, B:24:0x0223, B:29:0x0214, B:32:0x022a, B:35:0x0060, B:37:0x0072, B:38:0x007e, B:40:0x0086, B:41:0x019e, B:42:0x008d, B:44:0x009e, B:46:0x00a5, B:49:0x00b9, B:50:0x0160, B:52:0x00cf, B:54:0x00db, B:55:0x00ed, B:57:0x00f9, B:58:0x010a, B:60:0x0116, B:61:0x0127, B:63:0x0133, B:64:0x0144, B:66:0x0150, B:69:0x016d, B:74:0x0188, B:82:0x01a8), top: B:5:0x0034, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.braze.storage.i iVar;
        String str;
        Mutex mutex;
        Map linkedHashMap;
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        HashMapSerializer MapSerializer;
        DataStoreKey dataStoreKey;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            iVar = this.e;
            Mutex mutex2 = iVar.a;
            str = this.f;
            this.a = mutex2;
            this.b = iVar;
            this.c = str;
            this.d = 1;
            if (mutex2.lock(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            mutex = mutex2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = this.c;
            iVar = this.b;
            mutex = this.a;
            SafeTrace.throwOnFailure(obj);
            str = str3;
        }
        try {
            DataStoreKey dataStoreKey2 = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey2.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey2), 12, (Object) null);
                linkedHashMap = new LinkedHashMap();
            } else {
                try {
                    Object readData = iVar.readData(dataStoreKey2, "");
                    readData.getClass();
                    String str4 = (String) readData;
                    if (StringsKt.isBlank(str4)) {
                        linkedHashMap = new LinkedHashMap();
                    } else {
                        DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
                        if (StringsKt.isBlank(str4)) {
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        } else if (Intrinsics.areEqual(StringsKt.trim(str4).toString(), "null")) {
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        } else {
                            try {
                                ReflectionFactory reflectionFactory = Reflection.factory;
                                KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(Integer.class);
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
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) rb.a, 6, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                        } catch (Exception e) {
                                            e = e;
                                            exc = e;
                                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                            map = EmptyMap.INSTANCE;
                                            map.getClass();
                                            linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                            Integer num = (Integer) linkedHashMap.get(str);
                                            linkedHashMap.put(str, new Integer((num != null ? num.intValue() : 0) + 1));
                                            dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
                                            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                            }
                                            Unit unit = Unit.INSTANCE;
                                            mutex.unlock(null);
                                            return unit;
                                        }
                                    }
                                    Object decodeFromString = Json.Default.decodeFromString(str4, MapSerializer);
                                    decodeFromString.getClass();
                                    map = (Map) decodeFromString;
                                } catch (Exception e2) {
                                    exc = e2;
                                    dataStoreUtils = dataStoreUtils2;
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str4), 4, (Object) null);
                                    map = EmptyMap.INSTANCE;
                                    map.getClass();
                                    linkedHashMap = TypeIntrinsics.asMutableMap(new LinkedHashMap(map));
                                    Integer num2 = (Integer) linkedHashMap.get(str);
                                    linkedHashMap.put(str, new Integer((num2 != null ? num2.intValue() : 0) + 1));
                                    dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
                                    if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                    mutex.unlock(null);
                                    return unit2;
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
            Integer num22 = (Integer) linkedHashMap.get(str);
            linkedHashMap.put(str, new Integer((num22 != null ? num22.intValue() : 0) + 1));
            dataStoreKey = DataStoreKey.PERMISSION_REQUEST_COUNTS;
            if (dataStoreKey.getType() != DataStoreValueType.MAP) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.q(dataStoreKey), 12, (Object) null);
            } else {
                try {
                    DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                    try {
                        Json.Default r0 = Json.Default;
                        r0.getClass();
                        str2 = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, IntSerializer.INSTANCE, 1), linkedHashMap);
                    } catch (Exception e5) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                        str2 = "{}";
                    }
                    iVar.writeData(dataStoreKey, str2);
                } catch (Exception e6) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e6, false, (Function0) new DataStoreProvider.r(dataStoreKey), 8, (Object) null);
                }
            }
            Unit unit22 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit22;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
