package com.braze.storage;

import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"com/braze/storage/ContentCardsDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateContentCardsStorageToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "migrateContentCardsMetadataToJson", "", "CONTENT_CARDS_DATA_STORE_STORAGE", "Ljava/lang/String;", "CARD_CACHE_SHARED_PREFS", "METADATA_CACHE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContentCardsDataStoreProvider$Companion {
    public /* synthetic */ ContentCardsDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$0() {
        return "Starting migration for Content Cards metadata keys.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$1() {
        return "Metadata migration completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsMetadataToJson$lambda$2() {
        return "Failed to migrate content cards metadata to DataStore.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.CONTENT_CARDS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Added content card from SharedPreferences key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$1$1(Object obj) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Content card value from SharedPreferences: ", " is not a String and will not be migrated to DataStore.", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$2$0(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Migration for content cards completed successfully. Migrated ", " cards.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateContentCardsStorageToJson$lambda$3() {
        return "Failed to migrate content cards storage to DataStore.";
    }

    public final Preferences migrateContentCardsMetadataToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5 = "42.2.0";
        sharedPrefs.getClass();
        SharedPreferences sharedPreferences = sharedPrefs.prefs;
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(12), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.DISMISSED_CARDS;
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(dataStoreKey.getKey()))) {
            return currentData;
        }
        try {
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            String key = dataStoreKey.getKey();
            EmptySet emptySet = EmptySet.INSTANCE;
            LinkedHashSet stringSet = sharedPrefs.getStringSet(key, emptySet);
            if (stringSet != null) {
                emptySet = stringSet;
            }
            List list = CollectionsKt.toList(emptySet);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str2 = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                str = "[]";
                i = 1;
            } catch (Exception e) {
                str = "[]";
                i = 1;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str2 = (!(list instanceof Map) && (list instanceof List)) ? str : "{}";
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.DISMISSED_CARDS.getKey()), str2);
            String key2 = DataStoreKey.EXPIRED_CARDS.getKey();
            EmptySet emptySet2 = EmptySet.INSTANCE;
            LinkedHashSet stringSet2 = sharedPrefs.getStringSet(key2, emptySet2);
            if (stringSet2 != null) {
                emptySet2 = stringSet2;
            }
            List list2 = CollectionsKt.toList(emptySet2);
            DataStoreUtils dataStoreUtils2 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r02 = Json.Default;
                r02.getClass();
                str3 = r02.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, i), list2);
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils2, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str3 = (!(list2 instanceof Map) && (list2 instanceof List)) ? str : "{}";
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.EXPIRED_CARDS.getKey()), str3);
            String key3 = DataStoreKey.TEST_CARDS.getKey();
            EmptySet emptySet3 = EmptySet.INSTANCE;
            LinkedHashSet stringSet3 = sharedPrefs.getStringSet(key3, emptySet3);
            if (stringSet3 != null) {
                emptySet3 = stringSet3;
            }
            List list3 = CollectionsKt.toList(emptySet3);
            DataStoreUtils dataStoreUtils3 = DataStoreUtils.INSTANCE;
            try {
                Json.Default r03 = Json.Default;
                r03.getClass();
                str4 = r03.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, i), list3);
            } catch (Exception e3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils3, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str4 = (!(list3 instanceof Map) && (list3 instanceof List)) ? str : "{}";
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.TEST_CARDS.getKey()), str4);
            DataStoreKey dataStoreKey2 = DataStoreKey.LAST_CARD_UPDATED_AT;
            String key4 = dataStoreKey2.getKey();
            key4.getClass();
            sharedPrefs.checkKey(key4);
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.longKey(dataStoreKey2.getKey()), Long.valueOf(sharedPreferences.getLong(key4, 0L)));
            DataStoreKey dataStoreKey3 = DataStoreKey.LAST_FULL_CARD_SYNC_AT;
            String key5 = dataStoreKey3.getKey();
            key5.getClass();
            sharedPrefs.checkKey(key5);
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.longKey(dataStoreKey3.getKey()), Long.valueOf(sharedPreferences.getLong(key5, 0L)));
            DataStoreKey dataStoreKey4 = DataStoreKey.LAST_CARD_STORAGE_UPDATE_TIMESTAMP;
            String key6 = dataStoreKey4.getKey();
            key6.getClass();
            sharedPrefs.checkKey(key6);
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.longKey(dataStoreKey4.getKey()), Long.valueOf(sharedPreferences.getLong(key6, 0L)));
            DataStoreKey dataStoreKey5 = DataStoreKey.LAST_ACCESSED_SDK_VERSION;
            String key7 = dataStoreKey5.getKey();
            key7.getClass();
            sharedPrefs.checkKey(key7);
            String string2 = sharedPreferences.getString(key7, "42.2.0");
            if (string2 != null) {
                str5 = string2;
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(dataStoreKey5.getKey()), str5);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(13), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e4) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(14), 4, (Object) null);
            return currentData;
        }
    }

    public final Preferences migrateContentCardsStorageToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        int i;
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(10), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.CONTENT_CARDS.getKey()))) {
            return currentData;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = sharedPrefs.getAll().entrySet().iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    arrayList.add(value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 7), 7, (Object) null);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) b.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda2(value, i), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), arrayList);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = arrayList instanceof Map ? "{}" : "[]";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.CONTENT_CARDS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BannersDataStoreProvider$Companion$$ExternalSyntheticLambda3(i, arrayList), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(11), 4, (Object) null);
            return currentData;
        }
    }

    private ContentCardsDataStoreProvider$Companion() {
    }
}
