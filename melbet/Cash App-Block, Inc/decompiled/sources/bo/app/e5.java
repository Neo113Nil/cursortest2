package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class e5 extends AdaptedFunctionReference implements Function3 {
    public e5() {
        super(3, 4, d5.class, com.braze.storage.c.b, "migrateLegacyDeviceId", "migrateLegacyDeviceId(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((d5) this.receiver).a((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
