package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class t6 extends AdaptedFunctionReference implements Function3 {
    public t6() {
        super(3, 4, s6.class, com.braze.storage.e.b, "migrateEndpointMetadataToDataStore", "migrateEndpointMetadataToDataStore(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((s6) this.receiver).a((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
