package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.migrations.SharedPreferencesMigration;
import com.squareup.cash.ui.ScreenshotReportingManager$initialize$3$1;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class SharedPreferencesMigrationKt {
    public static final LinkedHashSet MIGRATE_ALL_KEYS = new LinkedHashSet();

    public static final SharedPreferencesMigration SharedPreferencesMigration(Context context, String str, Set set) {
        context.getClass();
        set.getClass();
        int i = 1;
        int i2 = 3;
        Continuation continuation = null;
        return set == MIGRATE_ALL_KEYS ? new SharedPreferencesMigration(context, str, new RealGcmRegistrar$unregister$2(set, continuation, i2), new ScreenshotReportingManager$initialize$3$1(i2, continuation, i), 4) : new SharedPreferencesMigration(context, str, set, new RealGcmRegistrar$unregister$2(set, continuation, i2), new ScreenshotReportingManager$initialize$3$1(i2, continuation, i));
    }
}
