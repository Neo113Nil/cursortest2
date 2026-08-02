package bo.app;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.k;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes3.dex */
public final /* synthetic */ class kc extends AdaptedFunctionReference implements Function3 {
    public kc() {
        super(3, 4, jc.class, k.d, "migratePushIdStorageToMap", "migratePushIdStorageToMap(Landroidx/datastore/migrations/SharedPreferencesView;Landroidx/datastore/preferences/core/Preferences;)Landroidx/datastore/preferences/core/Preferences;");
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((jc) this.receiver).a((SharedPreferencesView) obj, (Preferences) obj2);
    }
}
