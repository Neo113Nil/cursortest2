package ru.yandex.video.m3.player.impl.utils;

import androidx.media3.common.PriorityTaskManager;
import defpackage.a9z0;
import defpackage.au1;
import defpackage.fyi0;
import defpackage.j73;
import defpackage.k4h;
import defpackage.lk91;
import defpackage.loo;
import defpackage.nwy;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.sf10;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tw21;
import defpackage.vyc0;
import defpackage.y6i0;
import defpackage.yzz0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.loadcontrol.LoadControlBufferState;
import ru.yandex.video.m3.data.loadcontrol.LoadControlBufferStateKt;
import ru.yandex.video.m3.data.loadcontrol.LoadControlParametersKt;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.load_control.YandexLoadControl;
import ru.yandex.video.m3.player.impl.load_control.provider.DependentLifecycleBufferDurationProvider;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 T2\u00020\u0001:\u0001TBk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0015*\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0013\u0010\"\u001a\u00020\u0015*\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010$J\u001b\u0010'\u001a\u00020\u001c2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u001c2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%H\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u0010-J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b3\u00104J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b\u000e\u00105J1\u0010=\u001a\u00020\u001c2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0010\u0010<\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010;0:H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\r2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\r2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bA\u0010@J\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010ER\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010IR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\u0014\u0010L\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010O\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010P\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/MemoryDependsLoadControl;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "", "bufferForPlaybackMs", "bufferForPlaybackAfterRebufferMs", "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;", "bufferDurationProvider", "maxBufferBytes", "Landroidx/media3/common/PriorityTaskManager;", "priorityTaskManager", "", "memoryRatio", "backBufferDurationMs", "", "retainBackBufferFromKeyframe", "Lk4h;", "allocator", "Lru/yandex/video/m3/player/impl/utils/MemoryInfoProvider;", "memoryInfoProvider", "<init>", "(IILru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;ILandroidx/media3/common/PriorityTaskManager;FIZLk4h;Lru/yandex/video/m3/player/impl/utils/MemoryInfoProvider;)V", "", "bufferedDurationUs", "targetBufferSizeBytes", "shouldContinueLoadingInternal", "(JI)Z", "calculateTargetBufferSizeBytesWithAllocatorUpdate", "()I", "Lzy11;", "updateAllocatorTargetBufferSize", "(I)V", "resetAllocator", "reset", "(Z)V", "msToUs", "(I)J", "(J)J", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Lvyc0;", "playerId", "onPrepared", "(Lvyc0;)V", "onStopped", "onReleased", "Lau1;", "getAllocator", "()Lau1;", "getBackBufferDurationUs", "(Lvyc0;)J", "(Lvyc0;)Z", "Lnwy;", "parameters", "Lyzz0;", "trackGroups", "", "Lloo;", "trackSelections", "onTracksSelected", "(Lnwy;Lyzz0;[Lloo;)V", "shouldStartPlayback", "(Lnwy;)Z", "shouldContinueLoading", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "getLoadControlState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", CA20Status.STATUS_USER_I, "Lru/yandex/video/m3/player/impl/load_control/provider/DependentLifecycleBufferDurationProvider;", "Landroidx/media3/common/PriorityTaskManager;", "F", "Z", "Lk4h;", "Lru/yandex/video/m3/player/impl/utils/MemoryInfoProvider;", "bufferForPlaybackUs", "J", "bufferForPlaybackAfterRebufferUs", "minBufferSize", "isLoading", "Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "loadControlBufferState", "Lru/yandex/video/m3/data/loadcontrol/LoadControlBufferState;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MemoryDependsLoadControl implements YandexLoadControl {
    private static final int DEFAULT_AUDIO_BUFFER_SIZE = 3538944;
    public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
    private static final int DEFAULT_CAMERA_MOTION_BUFFER_SIZE = 131072;
    public static final long DEFAULT_MAX_DURATION_MS = 50000;
    public static final float DEFAULT_MEMORY_RATIO = 0.3f;
    private static final int DEFAULT_METADATA_BUFFER_SIZE = 131072;
    public static final int DEFAULT_MUXED_BUFFER_SIZE = 36438016;
    private static final int DEFAULT_TEXT_BUFFER_SIZE = 131072;
    private static final int DEFAULT_VIDEO_BUFFER_SIZE = 32768000;
    private static final int OLD_DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    private static final int OLD_EXO_DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    private final k4h allocator;
    private final int backBufferDurationMs;
    private final DependentLifecycleBufferDurationProvider bufferDurationProvider;
    private final int bufferForPlaybackAfterRebufferMs;
    private final long bufferForPlaybackAfterRebufferUs;
    private final int bufferForPlaybackMs;
    private final long bufferForPlaybackUs;
    private boolean isLoading;
    private volatile LoadControlBufferState loadControlBufferState;
    private final int maxBufferBytes;
    private final MemoryInfoProvider memoryInfoProvider;
    private final float memoryRatio;
    private int minBufferSize;
    private final PriorityTaskManager priorityTaskManager;
    private final boolean retainBackBufferFromKeyframe;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ MemoryDependsLoadControl(int i, int i2, DependentLifecycleBufferDurationProvider dependentLifecycleBufferDurationProvider, int i3, PriorityTaskManager priorityTaskManager, float f, int i4, boolean z, k4h k4hVar, MemoryInfoProvider memoryInfoProvider, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? OLD_EXO_DEFAULT_BUFFER_FOR_PLAYBACK_MS : i, (i5 & 2) != 0 ? 5000 : i2, dependentLifecycleBufferDurationProvider, (i5 & 8) != 0 ? Integer.MAX_VALUE : i3, (i5 & 16) != 0 ? null : priorityTaskManager, (i5 & 32) != 0 ? 0.3f : f, (i5 & 64) != 0 ? 0 : i4, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? new k4h() : k4hVar, (i5 & 512) != 0 ? new MemoryInfoProvider() : memoryInfoProvider);
    }

    private final int calculateTargetBufferSizeBytesWithAllocatorUpdate() {
        int freeMemory = (int) ((this.memoryInfoProvider.freeMemory() + this.allocator.a()) * this.memoryRatio);
        int i = this.minBufferSize;
        int d = y6i0.d(freeMemory, i, Math.max(i, this.maxBufferBytes));
        updateAllocatorTargetBufferSize(d);
        return d;
    }

    private final long msToUs(int i) {
        return i * 1000;
    }

    private final void reset(boolean resetAllocator) {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        if (priorityTaskManager != null) {
            if (!this.isLoading) {
                priorityTaskManager = null;
            }
            if (priorityTaskManager != null) {
                priorityTaskManager.d(-1000);
            }
        }
        this.isLoading = false;
        if (resetAllocator) {
            k4h k4hVar = this.allocator;
            synchronized (k4hVar) {
                if (k4hVar.a) {
                    k4hVar.b(0);
                }
            }
        }
    }

    private final boolean shouldContinueLoadingInternal(long bufferedDurationUs, int targetBufferSizeBytes) {
        return ((this.allocator.a() < targetBufferSizeBytes) || ((bufferedDurationUs > this.bufferForPlaybackUs ? 1 : (bufferedDurationUs == this.bufferForPlaybackUs ? 0 : -1)) < 0)) && ((bufferedDurationUs > msToUs(this.loadControlBufferState.getLastEstimatedMaxTargetBuffer()) ? 1 : (bufferedDurationUs == msToUs(this.loadControlBufferState.getLastEstimatedMaxTargetBuffer()) ? 0 : -1)) < 0);
    }

    private final void updateAllocatorTargetBufferSize(int targetBufferSizeBytes) {
        this.allocator.b(targetBufferSizeBytes);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public au1 getAllocator() {
        return this.allocator;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public long getBackBufferDurationUs(vyc0 playerId) {
        return this.backBufferDurationMs * 1000;
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public LoadControlState getLoadControlState() {
        return new LoadControlState(this.loadControlBufferState);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onPrepared() {
        super.onPrepared();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onReleased() {
        super.onReleased();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onStopped() {
        super.onStopped();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onTracksSelected(nwy parameters, yzz0 trackGroups, loo[] trackSelections) {
        List A = j73.A(trackSelections);
        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
        Iterator it = A.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(INSTANCE.extractTrackTypeFromSelection$video_player_internalRelease((loo) it.next())));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i += INSTANCE.getDefaultBufferSize$video_player_internalRelease(((Number) it2.next()).intValue());
        }
        this.minBufferSize = i;
        calculateTargetBufferSizeBytesWithAllocatorUpdate();
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public void release(YandexPlayer<?> yandexPlayer) {
        this.bufferDurationProvider.release(yandexPlayer);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainBackBufferFromKeyframe() {
        super.retainBackBufferFromKeyframe();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldContinueLoading(final nwy parameters) {
        int calculateTargetBufferSizeBytesWithAllocatorUpdate = calculateTargetBufferSizeBytesWithAllocatorUpdate();
        final long bufferDuration = this.bufferDurationProvider.getBufferDuration();
        this.loadControlBufferState = this.loadControlBufferState.copy(new tls() { // from class: ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl$shouldContinueLoading$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadControlBufferState.Builder) obj);
                return zy11.a;
            }

            public final void invoke(LoadControlBufferState.Builder builder) {
                builder.setLastEstimatedMaxTargetBuffer(bufferDuration);
            }
        });
        final boolean shouldContinueLoadingInternal = shouldContinueLoadingInternal(parameters.e, calculateTargetBufferSizeBytesWithAllocatorUpdate);
        this.isLoading = shouldContinueLoadingInternal;
        this.loadControlBufferState = this.loadControlBufferState.copy(new tls() { // from class: ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl$shouldContinueLoading$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(LoadControlBufferState.Builder builder) {
                builder.setLastSCLParameters$video_player_internalRelease(LoadControlParametersKt.LoadControlParameters(nwy.this));
                builder.setLastSCLTimestamp(Long.valueOf(System.currentTimeMillis()));
                builder.setLastSCLResult(Boolean.valueOf(shouldContinueLoadingInternal));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadControlBufferState.Builder) obj);
                return zy11.a;
            }
        });
        return shouldContinueLoadingInternal;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldContinuePreloading(a9z0 a9z0Var, sf10 sf10Var, long j) {
        lk91.j("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldStartPlayback(final nwy parameters) {
        long j = parameters.g ? this.bufferForPlaybackAfterRebufferUs : this.bufferForPlaybackUs;
        final boolean z = j <= 0 || tw21.H(parameters.f, parameters.e) >= j;
        this.loadControlBufferState = this.loadControlBufferState.copy(new tls() { // from class: ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl$shouldStartPlayback$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void invoke(LoadControlBufferState.Builder builder) {
                builder.setLastSSPParameters$video_player_internalRelease(LoadControlParametersKt.LoadControlParameters(nwy.this));
                builder.setLastSSPTimestamp(Long.valueOf(System.currentTimeMillis()));
                builder.setLastSSPResult(Boolean.valueOf(z));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadControlBufferState.Builder) obj);
                return zy11.a;
            }
        });
        return z;
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public void start(YandexPlayer<?> yandexPlayer) {
        this.bufferDurationProvider.start(yandexPlayer);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00048\u0000X\u0081T¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000fR\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000fR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/MemoryDependsLoadControl$Companion;", "", "<init>", "()V", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "getDefaultBufferSize$video_player_internalRelease", "(I)I", "getDefaultBufferSize", "Lloo;", "exoTrackSelection", "extractTrackTypeFromSelection$video_player_internalRelease", "(Lloo;)I", "extractTrackTypeFromSelection", "DEFAULT_MUXED_BUFFER_SIZE", CA20Status.STATUS_USER_I, "getDEFAULT_MUXED_BUFFER_SIZE$video_player_internalRelease$annotations", "DEFAULT_AUDIO_BUFFER_SIZE", "DEFAULT_BACK_BUFFER_DURATION_MS", "DEFAULT_CAMERA_MOTION_BUFFER_SIZE", "", "DEFAULT_MAX_DURATION_MS", "J", "", "DEFAULT_MEMORY_RATIO", "F", "DEFAULT_METADATA_BUFFER_SIZE", "DEFAULT_TEXT_BUFFER_SIZE", "DEFAULT_VIDEO_BUFFER_SIZE", "OLD_DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS", "OLD_EXO_DEFAULT_BUFFER_FOR_PLAYBACK_MS", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT_MUXED_BUFFER_SIZE$video_player_internalRelease$annotations() {
        }

        public final int extractTrackTypeFromSelection$video_player_internalRelease(loo exoTrackSelection) {
            return exoTrackSelection.getTrackGroup().c;
        }

        public final int getDefaultBufferSize$video_player_internalRelease(int trackType) {
            if (trackType == -2) {
                return 0;
            }
            if (trackType == 0) {
                return MemoryDependsLoadControl.DEFAULT_MUXED_BUFFER_SIZE;
            }
            if (trackType == 1) {
                return MemoryDependsLoadControl.DEFAULT_AUDIO_BUFFER_SIZE;
            }
            if (trackType == 2) {
                return MemoryDependsLoadControl.DEFAULT_VIDEO_BUFFER_SIZE;
            }
            if (trackType == 3 || trackType == 5 || trackType == 6) {
                return 131072;
            }
            ny61.g(oyr.i(trackType, "Not support trackType: "));
            return 0;
        }

        private Companion() {
        }
    }

    private final long msToUs(long j) {
        return j * 1000;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onPrepared(vyc0 playerId) {
        reset(false);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onReleased(vyc0 playerId) {
        reset(true);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onStopped(vyc0 playerId) {
        reset(true);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean retainBackBufferFromKeyframe(vyc0 playerId) {
        return this.retainBackBufferFromKeyframe;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ long getBackBufferDurationUs() {
        super.getBackBufferDurationUs();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldContinueLoading(long j, long j2, float f) {
        super.shouldContinueLoading(j, j2, f);
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        super.shouldStartPlayback(j, f, z, j2);
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public boolean shouldStartPlayback(a9z0 a9z0Var, sf10 sf10Var, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    public MemoryDependsLoadControl(int i, int i2, DependentLifecycleBufferDurationProvider dependentLifecycleBufferDurationProvider, int i3, PriorityTaskManager priorityTaskManager, float f, int i4, boolean z, k4h k4hVar, MemoryInfoProvider memoryInfoProvider) {
        this.bufferForPlaybackMs = i;
        this.bufferForPlaybackAfterRebufferMs = i2;
        this.bufferDurationProvider = dependentLifecycleBufferDurationProvider;
        this.maxBufferBytes = i3;
        this.priorityTaskManager = priorityTaskManager;
        this.memoryRatio = f;
        this.backBufferDurationMs = i4;
        this.retainBackBufferFromKeyframe = z;
        this.allocator = k4hVar;
        this.memoryInfoProvider = memoryInfoProvider;
        this.bufferForPlaybackUs = msToUs(i);
        this.bufferForPlaybackAfterRebufferUs = msToUs(i2);
        this.loadControlBufferState = LoadControlBufferStateKt.LoadControlBufferState(0L, new tls() { // from class: ru.yandex.video.m3.player.impl.utils.MemoryDependsLoadControl$loadControlBufferState$1
            {
                super(1);
            }

            public final void invoke(LoadControlBufferState.Builder builder) {
                int i5;
                int i6;
                i5 = MemoryDependsLoadControl.this.bufferForPlaybackMs;
                builder.setBufferForPlaybackMs(Long.valueOf(i5));
                i6 = MemoryDependsLoadControl.this.bufferForPlaybackAfterRebufferMs;
                builder.setBufferForPlaybackAfterRebufferMs(Long.valueOf(i6));
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LoadControlBufferState.Builder) obj);
                return zy11.a;
            }
        });
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        super.onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl
    @Deprecated
    public void onTracksSelected(vyc0 vyc0Var, a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(a9z0Var, sf10Var, fyi0VarArr, yzz0Var, looVarArr);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public void onTracksSelected(a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
    }
}
