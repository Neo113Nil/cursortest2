package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.ContentCardsDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class s3 extends AdaptedFunctionReference implements Function3 {
    public s3(Object obj) {
        super(3, 4, ContentCardsDataStoreProvider$Companion.class, obj, "migrateContentCardsStorageToJson", "migrateContentCardsStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ContentCardsDataStoreProvider$Companion) this.receiver).migrateContentCardsStorageToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
