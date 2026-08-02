package com.braze.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SdkMetadataDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateMetadataToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "METADATA_DATA_STORE_STORAGE", "Ljava/lang/String;", "METADATA_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SdkMetadataDataStoreProvider$Companion {
    public /* synthetic */ SdkMetadataDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.SDK_METADATA.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$1() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Key: ", DataStoreKey.SDK_METADATA.getKey(), " already exists in DataStore. Not performing migration.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$2(Set set) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(set.size(), "Found ", " metadata tags to migrate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$3$0(List list) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "Migration for SDK metadata completed successfully. Migrated ", " tags.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateMetadataToJson$lambda$4() {
        return "Failed to migrate SDK metadata to DataStore.";
    }

    public final Preferences migrateMetadataToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(27), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.SDK_METADATA.getKey()))) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(28), 7, (Object) null);
            return currentData;
        }
        try {
            EmptySet emptySet = EmptySet.INSTANCE;
            LinkedHashSet stringSet = sharedPrefs.getStringSet("tags", emptySet);
            LinkedHashSet linkedHashSet = stringSet == null ? emptySet : stringSet;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2(linkedHashSet, 0), 7, (Object) null);
            List list = CollectionsKt.toList(linkedHashSet);
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.SDK_METADATA.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2(list, 3), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(29), 4, (Object) null);
            return currentData;
        }
    }

    private SdkMetadataDataStoreProvider$Companion() {
    }
}
