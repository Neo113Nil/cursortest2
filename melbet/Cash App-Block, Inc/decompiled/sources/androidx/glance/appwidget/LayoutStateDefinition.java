package androidx.glance.appwidget;

import android.content.Context;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.FileStorage;
import androidx.glance.appwidget.proto.LayoutProtoSerializer;
import androidx.glance.state.GlanceStateDefinition;
import androidx.room.Room;
import app.cash.molecule.GatedFrameClock;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.core.internal.CoreFeature$initialize$2;
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
public final class LayoutStateDefinition implements GlanceStateDefinition {
    public static final LayoutStateDefinition INSTANCE = new LayoutStateDefinition();

    @Override // androidx.glance.state.GlanceStateDefinition
    public final Object getDataStore(Context context, String str) {
        LayoutProtoSerializer layoutProtoSerializer = LayoutProtoSerializer.INSTANCE;
        CoreFeature$initialize$2 coreFeature$initialize$2 = new CoreFeature$initialize$2(context, 1, str);
        EmptyList emptyList = EmptyList.INSTANCE;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        ContextScope CoroutineScope = JobKt.CoroutineScope(DefaultIoScheduler.INSTANCE.plus(JobKt.SupervisorJob$default()));
        emptyList.getClass();
        return new DataStoreImpl(new FileStorage(layoutProtoSerializer, coreFeature$initialize$2), CollectionsKt__CollectionsJVMKt.listOf(new GatedFrameClock.AnonymousClass1(emptyList, (Continuation) null, 12)), new HurlStack(false), CoroutineScope);
    }

    @Override // androidx.glance.state.GlanceStateDefinition
    public final File getLocation(Context context, String str) {
        return Room.dataStoreFile(context, str);
    }
}
