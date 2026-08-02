package com.yandex.music.shared.wave.domain.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import defpackage.gxj;
import defpackage.vz1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"com/yandex/music/shared/wave/domain/commands/WaveQueueCommandsFactory$SetShuffle", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueBound$Basic;", "", "shuffle", "Z", "b", "()Z", "Lgxj;", "newOriginalPosition", "Lgxj;", "a", "()Lgxj;", "", "", "shufflePositions", "Ljava/util/List;", "c", "()Ljava/util/List;", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
final /* data */ class WaveQueueCommandsFactory$SetShuffle implements PlaybackCommand$QueueBound.Basic {
    private final gxj newOriginalPosition;
    private final boolean shuffle;
    private final List<Integer> shufflePositions;

    public WaveQueueCommandsFactory$SetShuffle(boolean z, gxj gxjVar, List list) {
        this.shuffle = z;
        this.newOriginalPosition = gxjVar;
        this.shufflePositions = list;
    }

    /* renamed from: a, reason: from getter */
    public final gxj getNewOriginalPosition() {
        return this.newOriginalPosition;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getShuffle() {
        return this.shuffle;
    }

    /* renamed from: c, reason: from getter */
    public final List getShufflePositions() {
        return this.shufflePositions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveQueueCommandsFactory$SetShuffle)) {
            return false;
        }
        WaveQueueCommandsFactory$SetShuffle waveQueueCommandsFactory$SetShuffle = (WaveQueueCommandsFactory$SetShuffle) obj;
        return this.shuffle == waveQueueCommandsFactory$SetShuffle.shuffle && Intrinsics.d(this.newOriginalPosition, waveQueueCommandsFactory$SetShuffle.newOriginalPosition) && Intrinsics.d(this.shufflePositions, waveQueueCommandsFactory$SetShuffle.shufflePositions);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.shuffle) * 31;
        gxj gxjVar = this.newOriginalPosition;
        int hashCode2 = (hashCode + (gxjVar == null ? 0 : Integer.hashCode(gxjVar.a))) * 31;
        List<Integer> list = this.shufflePositions;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.shuffle;
        gxj gxjVar = this.newOriginalPosition;
        List<Integer> list = this.shufflePositions;
        StringBuilder sb = new StringBuilder("SetShuffle(shuffle=");
        sb.append(z);
        sb.append(", newOriginalPosition=");
        sb.append(gxjVar);
        sb.append(", shufflePositions=");
        return vz1.u(sb, list, ")");
    }
}
