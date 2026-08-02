package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.SdkMetadataDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class je extends AdaptedFunctionReference implements Function3 {
    public je(Object obj) {
        super(3, 4, SdkMetadataDataStoreProvider$Companion.class, obj, "migrateMetadataToJson", "migrateMetadataToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SdkMetadataDataStoreProvider$Companion) this.receiver).migrateMetadataToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
