package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.FeatureFlagsDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class c8 extends AdaptedFunctionReference implements Function3 {
    public c8(Object obj) {
        super(3, 4, FeatureFlagsDataStoreProvider$Companion.class, obj, "migrateFeatureFlagStorageToJson", "migrateFeatureFlagStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((FeatureFlagsDataStoreProvider$Companion) this.receiver).migrateFeatureFlagStorageToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
