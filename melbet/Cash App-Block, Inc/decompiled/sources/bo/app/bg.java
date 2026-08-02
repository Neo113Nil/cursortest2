package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class bg extends AdaptedFunctionReference implements Function3 {
    public bg(Object obj) {
        super(3, 4, TriggerDataStoreProvider$Companion.class, obj, "migrateTriggersStorageToJson", "migrateTriggersStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((TriggerDataStoreProvider$Companion) this.receiver).migrateTriggersStorageToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
