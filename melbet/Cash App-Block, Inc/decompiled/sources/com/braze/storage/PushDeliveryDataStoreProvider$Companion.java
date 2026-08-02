package com.braze.storage;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"com/braze/storage/PushDeliveryDataStoreProvider$Companion", "", "<init>", "()V", "Landroidx/datastore/migrations/SharedPreferencesView;", "sharedPrefs", "Landroidx/datastore/preferences/core/Preferences;", "currentData", "migratePushDeliveryEventsToJson", "(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;", "", "PUSH_DELIVERY_DATA_STORE_STORAGE", "Ljava/lang/String;", "PUSH_DELIVERY_STORAGE_SHARED_PREFS", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushDeliveryDataStoreProvider$Companion {
    public /* synthetic */ PushDeliveryDataStoreProvider$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$0() {
        return Recorder$$ExternalSyntheticOutline2.m("Starting migration for key: ", DataStoreKey.PUSH_DELIVERY_EVENTS.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$1$0(String str, Object obj) {
        return "Added PDE with campaign ID: " + str + " and timestamp: " + obj + " from SharedPreferences";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$2$0(Map map) {
        return Recorder$$ExternalSyntheticOutline1.m("Migration for ", map.size(), DataStoreKey.PUSH_DELIVERY_EVENTS.getKey(), " completed successfully with ", " entries");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String migratePushDeliveryEventsToJson$lambda$3() {
        return "Failed to migrate push delivery events to DataStore.";
    }

    public final Preferences migratePushDeliveryEventsToJson(SharedPreferencesView sharedPrefs, Preferences currentData) {
        int i;
        String str;
        sharedPrefs.getClass();
        currentData.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(23), 7, (Object) null);
        if (((MutablePreferences) currentData).preferencesMap.containsKey(Strings.stringKey(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()))) {
            return currentData;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = sharedPrefs.getAll().entrySet().iterator();
            while (true) {
                i = 1;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Long) {
                    linkedHashMap.put(str2, value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.c, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda1(i, (Long) value, str2), 7, (Object) null);
                }
            }
            DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
            try {
                Json.Default r0 = Json.Default;
                r0.getClass();
                str = r0.encodeToString(new HashMapSerializer(StringSerializer.INSTANCE, LongSerializer.INSTANCE, 1), linkedHashMap);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                str = "{}";
            }
            MutablePreferences mutablePreferences = currentData.toMutablePreferences();
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(DataStoreKey.PUSH_DELIVERY_EVENTS.getKey()), str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new PushMaxDataStoreProvider$Companion$$ExternalSyntheticLambda3(linkedHashMap, i), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new DataStoreProvider$$ExternalSyntheticLambda7(24), 4, (Object) null);
            return currentData;
        }
    }

    private PushDeliveryDataStoreProvider$Companion() {
    }
}
