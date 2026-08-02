package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DataStoreValueType;
import com.braze.models.BannerPendingDismissal;
import com.braze.storage.DataStoreProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.SetsKt__SetsJVMKt;
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
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes4.dex */
public final class a extends DataStoreProvider {
    public static final BannersDataStoreProvider$Companion d = new BannersDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(0, context, this));
    }

    public final Map a() {
        Map map;
        Map map2;
        HashMapSerializer MapSerializer;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT;
        if (dataStoreKey.getType() != DataStoreValueType.MAP) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.l(dataStoreKey), 12, (Object) null);
            return new LinkedHashMap();
        }
        try {
            Object readData = readData(dataStoreKey, "");
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) bo.app.t.a, 6, (Object) null);
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

    public final List b() {
        Collection collection;
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_PENDING_DISMISSALS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.i(dataStoreKey), 12, (Object) null);
            return new ArrayList();
        }
        try {
            Object readData = readData(dataStoreKey, "");
            readData.getClass();
            String str = (String) readData;
            if (StringsKt.isBlank(str)) {
                return new ArrayList();
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            if (StringsKt.isBlank(str)) {
                collection = EmptyList.INSTANCE;
            } else if (Intrinsics.areEqual(StringsKt.trim(str).toString(), "null")) {
                collection = EmptyList.INSTANCE;
            } else {
                try {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    collection = (List) r0.decodeFromString(str, new HashSetSerializer(BannerPendingDismissal.Companion.serializer(), 1));
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreUtils.a(str), 4, (Object) null);
                    collection = EmptyList.INSTANCE;
                }
            }
            return CollectionsKt.toMutableList(collection);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.j(dataStoreKey), 8, (Object) null);
            return new ArrayList();
        }
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        SharedPreferencesMigration SharedPreferencesMigration = SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.banners.eligibility", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String m = Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.banners.storage", (String) this.c.getValue());
        BannersDataStoreProvider$Companion bannersDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigration, new SharedPreferencesMigration(context, m, (RealGcmRegistrar$unregister$2) null, new bo.app.r(bannersDataStoreProvider$Companion), 12), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.banners.impressions", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new bo.app.s(bannersDataStoreProvider$Companion), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.banners", (String) this.c.getValue());
    }

    public final void a(List list) {
        String str;
        list.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.BANNERS_PENDING_DISMISSALS;
        if (dataStoreKey.getType() != DataStoreValueType.LIST) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new DataStoreProvider.o(dataStoreKey), 12, (Object) null);
            return;
        }
        try {
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(BannerPendingDismissal.Companion.serializer(), 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = list instanceof Map ? "{}" : "[]";
            }
            writeData(dataStoreKey, str);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DataStoreProvider.INSTANCE.getTAG(), BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider.p(dataStoreKey), 8, (Object) null);
        }
    }

    public static final String a(Context context, a aVar) {
        return StringUtils.getCacheFileSuffix(context, aVar.a, aVar.b);
    }
}
