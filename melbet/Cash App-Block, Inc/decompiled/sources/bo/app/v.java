package bo.app;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import java.util.ArrayList;
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
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class v extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ArrayList arrayList, long j, Continuation continuation) {
        super(2, continuation);
        this.b = arrayList;
        this.c = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.b, this.c, continuation);
        vVar.a = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((MutablePreferences) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x015d A[LOOP:0: B:8:0x015b->B:9:0x015d, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DataStoreUtils dataStoreUtils;
        Exception exc;
        Map map;
        HashMapSerializer MapSerializer;
        LinkedHashMap linkedHashMap;
        int size;
        int i;
        String str;
        MutablePreferences mutablePreferences = (MutablePreferences) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Preferences.Key stringKey = Strings.stringKey(DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey());
        String str2 = (String) mutablePreferences.get(stringKey);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        if (StringsKt.isBlank(str3)) {
            linkedHashMap = new LinkedHashMap();
        } else {
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
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
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) u.a, 6, (Object) null);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                            } catch (Exception e) {
                                e = e;
                                exc = e;
                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                                map = EmptyMap.INSTANCE;
                                map.getClass();
                                linkedHashMap = new LinkedHashMap(map);
                                ArrayList arrayList = this.b;
                                long j = this.c;
                                size = arrayList.size();
                                i = 0;
                                while (i < size) {
                                }
                                DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
                                Json.Default r1 = Json.Default;
                                r1.getClass();
                                str = r1.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
                                mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, str);
                                return Unit.INSTANCE;
                            }
                        }
                        Object decodeFromString = Json.Default.decodeFromString(str3, MapSerializer);
                        decodeFromString.getClass();
                        map = (Map) decodeFromString;
                    } catch (Exception e2) {
                        exc = e2;
                        dataStoreUtils = dataStoreUtils2;
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new DataStoreUtils.b(str3), 4, (Object) null);
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                        linkedHashMap = new LinkedHashMap(map);
                        ArrayList arrayList2 = this.b;
                        long j2 = this.c;
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                        }
                        DataStoreUtils dataStoreUtils32 = DataStoreUtils.INSTANCE;
                        Json.Default r12 = Json.Default;
                        r12.getClass();
                        str = r12.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, str);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e3) {
                    e = e3;
                    dataStoreUtils = dataStoreUtils2;
                }
            }
            linkedHashMap = new LinkedHashMap(map);
        }
        ArrayList arrayList22 = this.b;
        long j22 = this.c;
        size = arrayList22.size();
        i = 0;
        while (i < size) {
            Object obj2 = arrayList22.get(i);
            i++;
            linkedHashMap.put((String) obj2, new Long(j22));
        }
        DataStoreUtils dataStoreUtils322 = DataStoreUtils.INSTANCE;
        try {
            Json.Default r122 = Json.Default;
            r122.getClass();
            str = r122.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils322, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
            str = "{}";
        }
        mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, str);
        return Unit.INSTANCE;
    }
}
