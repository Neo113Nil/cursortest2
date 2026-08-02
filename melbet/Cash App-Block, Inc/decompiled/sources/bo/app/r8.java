package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.GeofenceDataStoreProvider;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class r8 extends AdaptedFunctionReference implements Function3 {
    public r8(o8 o8Var) {
        super(3, 4, o8.class, o8Var, "migrateRegisteredGeofencesListToJson", "migrateRegisteredGeofencesListToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object dataStore$migrateRegisteredGeofencesListToJson;
        dataStore$migrateRegisteredGeofencesListToJson = GeofenceDataStoreProvider.getDataStore$migrateRegisteredGeofencesListToJson((o8) this.receiver, (SharedPreferencesView) obj, (Preferences) obj2, (Continuation) obj3);
        return dataStore$migrateRegisteredGeofencesListToJson;
    }
}
