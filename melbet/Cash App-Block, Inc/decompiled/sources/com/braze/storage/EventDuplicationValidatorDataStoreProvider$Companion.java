package com.braze.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/EventDuplicationValidatorDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateEventDuplicationMap", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "EVENT_DUPLICATION_VALIDATION_STORAGE", "Ljava/lang/String;", "STORAGE_PREFIX", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EventDuplicationValidatorDataStoreProvider$Companion {
    public /* synthetic */ EventDuplicationValidatorDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence migrateEventDuplicationMap$lambda$1(Map.Entry entry) {
        entry.getClass();
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        value.getClass();
        return str + ":" + ((Long) value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$2$0(SharedPreferencesView sharedPreferencesView) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sharedPreferencesView.getAll().size(), "Migration for event duplication map completed. Migrated ", " events.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateEventDuplicationMap$lambda$3() {
        return "Failed to migrate event duplication map to DataStore.";
    }

    public final Preferences migrateEventDuplicationMap(SharedPreferencesView sharedPrefs, Preferences currentData) {
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(15), 7, (Object) null);
        Preferences.Key stringKey = Strings.stringKey(DataStoreKey.EVENT_DUPLICATION_VALIDATION_STORAGE_MAP.getKey());
        if (((MutablePreferences) currentData).preferencesMap.containsKey(stringKey)) {
            return currentData;
        }
        try {
            String joinToString$default = CollectionsKt.joinToString$default(sharedPrefs.getAll().entrySet(), ",", null, null, 0, null, new EventDuplicationValidatorDataStoreProvider$Companion$$ExternalSyntheticLambda1(), 30);
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(stringKey, joinToString$default);
            BrazeLogger.brazelog$default(brazeLogger, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new SdkMetadataDataStoreProvider$Companion$$ExternalSyntheticLambda2(sharedPrefs, 1), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(16), 4, (Object) null);
            return currentData;
        }
    }

    private EventDuplicationValidatorDataStoreProvider$Companion() {
    }
}
