package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.PushDeliveryDataStoreProvider$Companion;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class cc extends AdaptedFunctionReference implements Function3 {
    public cc(Object obj) {
        super(3, 4, PushDeliveryDataStoreProvider$Companion.class, obj, "migratePushDeliveryEventsToJson", "migratePushDeliveryEventsToJson(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((PushDeliveryDataStoreProvider$Companion) this.receiver).migratePushDeliveryEventsToJson((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
