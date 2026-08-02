package bo.app;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DataStoreUtils;
import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* loaded from: classes3.dex */
public final class ld {
    public static final String b(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated Int key: ", str);
    }

    public static final String c(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated Boolean key: ", str);
    }

    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str;
        sharedPreferencesView.getClass();
        preferences.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(8), 7, (Object) null);
        try {
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            for (Map.Entry entry : sharedPreferencesView.getAll().entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(str2), value);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 20), 7, (Object) null);
                } else {
                    int i = 21;
                    if (value instanceof Integer) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.intKey(str2), value);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 21), 7, (Object) null);
                    } else if (value instanceof Boolean) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.booleanKey(str2), value);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b9$$ExternalSyntheticLambda0(str2, 22), 7, (Object) null);
                    } else if (value instanceof Set) {
                        Set set = (Set) value;
                        DataStoreUtils dataStoreUtils = DataStoreUtils.INSTANCE;
                        List list = CollectionsKt.toList(set);
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getClass();
                            str = r0.encodeToString(new HashSetSerializer(StringSerializer.INSTANCE, 1), list);
                        } catch (Exception e) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) dataStoreUtils, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) DataStoreUtils.e.a, 4, (Object) null);
                            str = (!(list instanceof Map) && (list instanceof List)) ? "[]" : "{}";
                        }
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(str2), str);
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new n$$ExternalSyntheticLambda0(str2, set, i), 7, (Object) null);
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new ld$$ExternalSyntheticLambda5(str2, 0, value), 6, (Object) null);
                    }
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) mutablePreferences, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new l$$ExternalSyntheticLambda0(9), 7, (Object) null);
            return mutablePreferences;
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new l$$ExternalSyntheticLambda0(10), 4, (Object) null);
            return preferences;
        }
    }

    public static final String b() {
        return "Migration for RuntimeAppConfiguration completed successfully.";
    }

    public static final String c() {
        return "Failed to migrate runtime configuration to DataStore.";
    }

    public static final String a() {
        return "Starting migration for RuntimeAppConfiguration";
    }

    public static final String a(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Migrated String key: ", str);
    }

    public static final String a(String str, Set set) {
        return Recorder$$ExternalSyntheticOutline1.m("Migrated StringSet key: ", set.size(), str, " with ", " items");
    }

    public static final String a(String str, Object obj) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
        StringBuilder sb = new StringBuilder("Unknown type for key: ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(obj);
        sb.append(" (type: ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, simpleName, ") - skipping migration");
    }
}
