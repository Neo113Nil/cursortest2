package bo.app;

import android.content.SharedPreferences;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class d5 {
    public final Preferences a(SharedPreferencesView sharedPreferencesView, Preferences preferences) {
        String str = "";
        sharedPreferencesView.getClass();
        preferences.getClass();
        DataStoreKey dataStoreKey = DataStoreKey.LEGACY_DEVICE_ID;
        if (((MutablePreferences) preferences).preferencesMap.containsKey(Strings.stringKey(dataStoreKey.getKey()))) {
            return preferences;
        }
        try {
            MutablePreferences mutablePreferences = preferences.toMutablePreferences();
            String key = DataStoreKey.DEVICE_ID.getKey();
            key.getClass();
            SharedPreferences sharedPreferences = sharedPreferencesView.prefs;
            sharedPreferencesView.checkKey(key);
            String string2 = sharedPreferences.getString(key, "");
            if (string2 != null) {
                str = string2;
            }
            mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(dataStoreKey.getKey()), str);
            return mutablePreferences;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new d0$$ExternalSyntheticLambda9(7), 4, (Object) null);
            return preferences;
        }
    }

    public static final String a() {
        return "Failed to migrate legacy device id to DataStore.";
    }
}
