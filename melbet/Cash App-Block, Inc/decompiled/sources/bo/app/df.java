package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.SessionStorageDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class df extends AdaptedFunctionReference implements Function3 {
    public df(Object obj) {
        super(3, 4, SessionStorageDataStoreProvider$Companion.class, obj, "migrateSealedSessionsMapToJson", "migrateSealedSessionsMapToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((SessionStorageDataStoreProvider$Companion) this.receiver).migrateSealedSessionsMapToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
