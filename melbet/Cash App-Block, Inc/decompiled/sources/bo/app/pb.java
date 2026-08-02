package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class pb extends AdaptedFunctionReference implements Function3 {
    public pb() {
        super(3, 4, ob.class, com.braze.storage.i.b, "migratePermissionCountsToDataStore", "migratePermissionCountsToDataStore(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((ob) this.receiver).a((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
