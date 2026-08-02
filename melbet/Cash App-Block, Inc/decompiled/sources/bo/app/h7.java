package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class h7 extends AdaptedFunctionReference implements Function3 {
    public h7() {
        super(3, 4, g7.class, com.braze.storage.f.b, "migrateEventsStorageToJson", "migrateEventsStorageToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((g7) this.receiver).a((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
