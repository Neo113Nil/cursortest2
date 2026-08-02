package androidx.work;

import android.content.Context;
import androidx.startup.Initializer;
import androidx.work.Data;
import androidx.work.impl.WorkManagerImpl;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class WorkManagerInitializer implements Initializer {
    public static final String TAG = Logger$LogcatLogger.tagWithPrefix("WrkMgrInitializer");

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Logger$LogcatLogger.get().debug(TAG, "Initializing WorkManager with default configuration.");
        Configuration configuration = new Configuration(new Data.Builder());
        context.getClass();
        WorkManagerImpl.initialize(context, configuration);
        return WorkManagerImpl.getInstance$1(context);
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
