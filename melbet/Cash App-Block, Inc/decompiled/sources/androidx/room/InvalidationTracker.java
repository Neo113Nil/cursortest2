package androidx.room;

import android.content.Intent;
import androidx.camera.video.VideoEncoderSession;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.cash.storage.RealStorage$temp$1;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes.dex */
public final class InvalidationTracker {
    public final RoomDatabase database;
    public final TriggerBasedInvalidationTracker implementation;
    public VideoEncoderSession multiInstanceInvalidationClient;
    public Intent multiInstanceInvalidationIntent;
    public final LinkedHashMap observerMap;
    public final ReentrantLock observerMapLock;
    public final InvalidationTracker$$ExternalSyntheticLambda0 onRefreshCompleted;
    public final InvalidationTracker$$ExternalSyntheticLambda0 onRefreshScheduled;
    public final String[] tableNames;
    public final Object trackerLock;

    public InvalidationTracker(RoomDatabase roomDatabase, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.database = roomDatabase;
        this.tableNames = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(roomDatabase, hashMap, hashMap2, strArr, roomDatabase.getUseTempTrackingTable$room_runtime_release(), new RealStorage$temp$1(1, this, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 3));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new InvalidationTracker$$ExternalSyntheticLambda0(this, 0);
        this.onRefreshCompleted = new InvalidationTracker$$ExternalSyntheticLambda0(this, 22);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.onAllowRefresh = new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 17);
    }

    public final Object sync$room_runtime_release(SuspendLambda suspendLambda) {
        Object syncTriggers$room_runtime_release;
        RoomDatabase roomDatabase = this.database;
        return ((!roomDatabase.inCompatibilityMode$room_runtime_release() || roomDatabase.isOpenInternal()) && (syncTriggers$room_runtime_release = this.implementation.syncTriggers$room_runtime_release(suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? syncTriggers$room_runtime_release : Unit.INSTANCE;
    }
}
