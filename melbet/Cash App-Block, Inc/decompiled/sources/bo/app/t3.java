package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class t3 extends AdaptedFunctionReference implements Function3 {
    public t3(Object obj) {
        super(3, 4, ContentCardsDataStoreProvider$Companion.class, obj, "migrateContentCardsMetadataToJson", "migrateContentCardsMetadataToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ContentCardsDataStoreProvider$Companion) this.receiver).migrateContentCardsMetadataToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
