package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.EventDuplicationValidatorDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class n7 extends AdaptedFunctionReference implements Function3 {
    public n7(Object obj) {
        super(3, 4, EventDuplicationValidatorDataStoreProvider$Companion.class, obj, "migrateEventDuplicationMap", "migrateEventDuplicationMap(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((EventDuplicationValidatorDataStoreProvider$Companion) this.receiver).migrateEventDuplicationMap((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
