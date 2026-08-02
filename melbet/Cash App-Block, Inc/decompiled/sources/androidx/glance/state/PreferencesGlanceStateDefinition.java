package androidx.glance.state;

import android.content.Context;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.FileStorage;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferencesFileSerializer;
import androidx.room.util.DBUtil;
import app.cash.molecule.GatedFrameClock;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.core.internal.CoreFeature$initialize$2;
import com.squareup.contour.ContourLayout$geometry$1;
import java.io.File;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class PreferencesGlanceStateDefinition implements GlanceStateDefinition {
    public static final PreferencesGlanceStateDefinition INSTANCE = new PreferencesGlanceStateDefinition();

    @Override // androidx.glance.state.GlanceStateDefinition
    public final Object getDataStore(Context context, String str) {
        CoreFeature$initialize$2 coreFeature$initialize$2 = new CoreFeature$initialize$2(context, 2, str);
        EmptyList emptyList = EmptyList.INSTANCE;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        ContextScope CoroutineScope = JobKt.CoroutineScope(DefaultIoScheduler.INSTANCE.plus(JobKt.SupervisorJob$default()));
        emptyList.getClass();
        return new PreferenceDataStore(new PreferenceDataStore(new DataStoreImpl(new FileStorage(PreferencesFileSerializer.INSTANCE, new ContourLayout$geometry$1(coreFeature$initialize$2, 14)), CollectionsKt__CollectionsJVMKt.listOf(new GatedFrameClock.AnonymousClass1(emptyList, (Continuation) null, 12)), new HurlStack(false), CoroutineScope)));
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public final File getLocation(Context context, String str) {
        return DBUtil.preferencesDataStoreFile(context, str);
    }
}
