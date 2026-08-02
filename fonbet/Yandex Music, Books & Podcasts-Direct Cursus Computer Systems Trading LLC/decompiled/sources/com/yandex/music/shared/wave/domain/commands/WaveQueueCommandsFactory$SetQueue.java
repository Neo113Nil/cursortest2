package com.yandex.music.shared.wave.domain.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.f1d;
import defpackage.fyu;
import defpackage.jzs;
import defpackage.k5r;
import defpackage.ran;
import defpackage.su4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"com/yandex/music/shared/wave/domain/commands/WaveQueueCommandsFactory$SetQueue", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "", "Ljzs;", "fixedQueueOriginalPlayables", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lfyu;", "fixedQueueShuffleState", "Lfyu;", "b", "()Lfyu;", "recommendedElements", "e", "Lran;", "newQueuePosition", "I", "d", "()I", "newLivePosition", "c", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final /* data */ class WaveQueueCommandsFactory$SetQueue implements PlaybackCommand$QueueBound.Basic {

    @NotNull
    private final List<jzs> fixedQueueOriginalPlayables;

    @NotNull
    private final fyu fixedQueueShuffleState;
    private final int newLivePosition;
    private final int newQueuePosition;

    @NotNull
    private final List<jzs> recommendedElements;

    public WaveQueueCommandsFactory$SetQueue(ArrayList arrayList, fyu fyuVar, ArrayList arrayList2, int i, int i2) {
        this.fixedQueueOriginalPlayables = arrayList;
        this.fixedQueueShuffleState = fyuVar;
        this.recommendedElements = arrayList2;
        this.newQueuePosition = i;
        this.newLivePosition = i2;
    }

    /* renamed from: a, reason: from getter */
    public final List getFixedQueueOriginalPlayables() {
        return this.fixedQueueOriginalPlayables;
    }

    /* renamed from: b, reason: from getter */
    public final fyu getFixedQueueShuffleState() {
        return this.fixedQueueShuffleState;
    }

    /* renamed from: c, reason: from getter */
    public final int getNewLivePosition() {
        return this.newLivePosition;
    }

    /* renamed from: d, reason: from getter */
    public final int getNewQueuePosition() {
        return this.newQueuePosition;
    }

    /* renamed from: e, reason: from getter */
    public final List getRecommendedElements() {
        return this.recommendedElements;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveQueueCommandsFactory$SetQueue)) {
            return false;
        }
        WaveQueueCommandsFactory$SetQueue waveQueueCommandsFactory$SetQueue = (WaveQueueCommandsFactory$SetQueue) obj;
        return Intrinsics.d(this.fixedQueueOriginalPlayables, waveQueueCommandsFactory$SetQueue.fixedQueueOriginalPlayables) && Intrinsics.d(this.fixedQueueShuffleState, waveQueueCommandsFactory$SetQueue.fixedQueueShuffleState) && Intrinsics.d(this.recommendedElements, waveQueueCommandsFactory$SetQueue.recommendedElements) && this.newQueuePosition == waveQueueCommandsFactory$SetQueue.newQueuePosition && this.newLivePosition == waveQueueCommandsFactory$SetQueue.newLivePosition;
    }

    public final int hashCode() {
        return Integer.hashCode(this.newLivePosition) + f1d.a(this.newQueuePosition, k5r.d((this.fixedQueueShuffleState.hashCode() + (this.fixedQueueOriginalPlayables.hashCode() * 31)) * 31, 31, this.recommendedElements), 31);
    }

    public final String toString() {
        List<jzs> list = this.fixedQueueOriginalPlayables;
        fyu fyuVar = this.fixedQueueShuffleState;
        List<jzs> list2 = this.recommendedElements;
        String a = ran.a(this.newQueuePosition);
        String a2 = ran.a(this.newLivePosition);
        StringBuilder sb = new StringBuilder("SetQueue(fixedQueueOriginalPlayables=");
        sb.append(list);
        sb.append(", fixedQueueShuffleState=");
        sb.append(fyuVar);
        sb.append(", recommendedElements=");
        sb.append(list2);
        sb.append(", newQueuePosition=");
        sb.append(a);
        sb.append(", newLivePosition=");
        return su4.o(sb, a2, ")");
    }
}
