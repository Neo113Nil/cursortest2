package com.braze.storage;

import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.json.JSONArray;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"com/braze/storage/ServerConfigDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/MutablePreferences;", "mutablePrefs", "Lcom/braze/enums/DataStoreKey;", "key", "", "migrateBlocklistedList", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/MutablePreferences;Lcom/braze/enums/DataStoreKey;)V", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migrateBlocklistedLists", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "SERVER_CONFIG_DATA_STORE_STORAGE", "Ljava/lang/String;", "SERVER_CONFIG_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServerConfigDataStoreProvider$Companion {
    public /* synthetic */ ServerConfigDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void migrateBlocklistedList(SharedPreferencesView sharedPrefs, MutablePreferences mutablePrefs, final DataStoreKey key) {
        String str;
        final int i = 1;
        try {
            String key2 = key.getKey();
            sharedPrefs.getClass();
            key2.getClass();
            SharedPreferences sharedPreferences = sharedPrefs.prefs;
            sharedPrefs.checkKey(key2);
            String string2 = sharedPreferences.getString(key2, null);
            final int i2 = 0;
            if (string2 != null && !StringsKt.isBlank(string2)) {
                JSONArray jSONArray = new JSONArray(string2);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                while (i2 < length) {
                    String string3 = jSONArray.getString(i2);
                    string3.getClass();
                    arrayList.add(string3);
                    i2++;
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
                Preferences.Key stringKey = Strings.stringKey(key.getKey());
                mutablePrefs.getClass();
                mutablePrefs.setUnchecked$datastore_preferences_core_release(stringKey, str);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new a$$ExternalSyntheticLambda0(6, key, arrayList), 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$1;
                    String migrateBlocklistedList$lambda$2;
                    int i3 = i2;
                    DataStoreKey dataStoreKey = key;
                    switch (i3) {
                        case 0:
                            migrateBlocklistedList$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$1(dataStoreKey);
                            return migrateBlocklistedList$lambda$1;
                        default:
                            migrateBlocklistedList$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$2(dataStoreKey);
                            return migrateBlocklistedList$lambda$2;
                    }
                }
            }, 7, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.storage.ServerConfigDataStoreProvider$Companion$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String migrateBlocklistedList$lambda$1;
                    String migrateBlocklistedList$lambda$2;
                    int i3 = i;
                    DataStoreKey dataStoreKey = key;
                    switch (i3) {
                        case 0:
                            migrateBlocklistedList$lambda$1 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$1(dataStoreKey);
                            return migrateBlocklistedList$lambda$1;
                        default:
                            migrateBlocklistedList$lambda$2 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$2(dataStoreKey);
                            return migrateBlocklistedList$lambda$2;
                    }
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$0(DataStoreKey dataStoreKey, List list) {
        return Recorder$$ExternalSyntheticOutline1.m("Migrated ", list.size(), dataStoreKey.getKey(), " with ", " items.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$1(DataStoreKey dataStoreKey) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No data found for ", dataStoreKey.getKey(), ", skipping");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedList$lambda$2(DataStoreKey dataStoreKey) {
        return Recorder$$ExternalSyntheticOutline2.m("Failed to migrate ", dataStoreKey.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$0() {
        return "Starting migration for blocklisted lists";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$1() {
        return "Blocklisted lists already migrated, skipping";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$2() {
        return "Migration for blocklisted lists completed successfully";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migrateBlocklistedLists$lambda$3() {
        return "Failed to migrate blocklisted lists to DataStore";
    }

    public final Preferences migrateBlocklistedLists(SharedPreferencesView sharedPrefs, Preferences currentData) {
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(1), 7, (Object) null);
        DataStoreKey dataStoreKey = DataStoreKey.BLOCKLISTED_EVENTS;
        Preferences.Key stringKey = Strings.stringKey(dataStoreKey.getKey());
        LinkedHashMap linkedHashMap = ((MutablePreferences) currentData).preferencesMap;
        if (!linkedHashMap.containsKey(stringKey)) {
            DataStoreKey dataStoreKey2 = DataStoreKey.BLOCKLISTED_ATTRIBUTES;
            if (!linkedHashMap.containsKey(Strings.stringKey(dataStoreKey2.getKey()))) {
                DataStoreKey dataStoreKey3 = DataStoreKey.BLOCKLISTED_PURCHASES;
                if (!linkedHashMap.containsKey(Strings.stringKey(dataStoreKey3.getKey()))) {
                    try {
                        MutablePreferences mutablePreferences = currentData.toMutablePreferences();
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey);
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey2);
                        migrateBlocklistedList(sharedPrefs, mutablePreferences, dataStoreKey3);
                        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(2), 7, (Object) null);
                        return mutablePreferences;
                    } catch (Exception e) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(3), 4, (Object) null);
                        return currentData;
                    }
                }
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new TriggerDataStoreProvider$Companion$$ExternalSyntheticLambda0(4), 7, (Object) null);
        return currentData;
    }

    private ServerConfigDataStoreProvider$Companion() {
    }
}
