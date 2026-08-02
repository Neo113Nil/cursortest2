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
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/SessionStorageDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateSealedSessionsMapToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "SESSION_STORAGE", "Ljava/lang/String;", "SESSION_STORAGE_SHAREDPREFS_NAME", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionStorageDataStoreProvider$Companion {
    public /* synthetic */ SessionStorageDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.SESSION_STORAGE_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$1$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated sealed session with key: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$2$0(Map map) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(map.size(), "Migration for sealed sessions completed. Migrated ", " sessions.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateSealedSessionsMapToJson$lambda$3() {
        return "Failed to migrate sealed sessions map to DataStore.";
    }

    public final Preferences migrateSealedSessionsMapToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(5), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.SESSION_STORAGE_MAP.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : sharedPrefs.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (!Intrinsics.areEqual(str2, DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey()) && (value instanceof String)) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) q.d, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda9(str2, 11), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                str = r0.encodeToString(new HashMapSerializer(stringSerializer, stringSerializer, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.SESSION_STORAGE_MAP.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3(linkedHashMap, 2), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(6), 4, (Object) null);
            return currentData;
        }
    }

    private SessionStorageDataStoreProvider$Companion() {
    }
}
