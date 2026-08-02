package ru.yandex.video.m3.player.impl.tracking.event;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackChangeData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "previous", "Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "next", "(Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;)V", "getNext", "()Lru/yandex/video/m3/player/impl/tracking/event/SubtitleTrackData;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final /* data */ class SubtitleTrackChangeData extends DefaultEventData {
    public static final int $stable = 0;
    private final SubtitleTrackData next;
    private final SubtitleTrackData previous;

    public SubtitleTrackChangeData(SubtitleTrackData subtitleTrackData, SubtitleTrackData subtitleTrackData2) {
        super(null, 1, null);
        this.previous = subtitleTrackData;
        this.next = subtitleTrackData2;
    }

    public static /* synthetic */ SubtitleTrackChangeData copy$default(SubtitleTrackChangeData subtitleTrackChangeData, SubtitleTrackData subtitleTrackData, SubtitleTrackData subtitleTrackData2, int i, Object obj) {
        if ((i & 1) != 0) {
            subtitleTrackData = subtitleTrackChangeData.previous;
        }
        if ((i & 2) != 0) {
            subtitleTrackData2 = subtitleTrackChangeData.next;
        }
        return subtitleTrackChangeData.copy(subtitleTrackData, subtitleTrackData2);
    }

    /* renamed from: component1, reason: from getter */
    public final SubtitleTrackData getPrevious() {
        return this.previous;
    }

    /* renamed from: component2, reason: from getter */
    public final SubtitleTrackData getNext() {
        return this.next;
    }

    @NotNull
    public final SubtitleTrackChangeData copy(SubtitleTrackData previous, SubtitleTrackData next) {
        return new SubtitleTrackChangeData(previous, next);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleTrackChangeData)) {
            return false;
        }
        SubtitleTrackChangeData subtitleTrackChangeData = (SubtitleTrackChangeData) other;
        return Intrinsics.d(this.previous, subtitleTrackChangeData.previous) && Intrinsics.d(this.next, subtitleTrackChangeData.next);
    }

    public final SubtitleTrackData getNext() {
        return this.next;
    }

    public final SubtitleTrackData getPrevious() {
        return this.previous;
    }

    public int hashCode() {
        SubtitleTrackData subtitleTrackData = this.previous;
        int hashCode = (subtitleTrackData == null ? 0 : subtitleTrackData.hashCode()) * 31;
        SubtitleTrackData subtitleTrackData2 = this.next;
        return hashCode + (subtitleTrackData2 != null ? subtitleTrackData2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SubtitleTrackChangeData(previous=" + this.previous + ", next=" + this.next + ')';
    }
}
