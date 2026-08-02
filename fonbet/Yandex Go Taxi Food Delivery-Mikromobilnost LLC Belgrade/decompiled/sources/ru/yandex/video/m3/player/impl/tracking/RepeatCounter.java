package ru.yandex.video.m3.player.impl.tracking;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.player.RepeatMode;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0005R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/RepeatCounter;", "", "Lru/yandex/video/m3/player/RepeatMode;", "initialRepeatMode", "<init>", "(Lru/yandex/video/m3/player/RepeatMode;)V", "repeatMode", "", "getCurrentRepetitions", "(Lru/yandex/video/m3/player/RepeatMode;)Ljava/lang/Integer;", "getCount", "()Ljava/lang/Integer;", "Lzy11;", "onRepeat", "()V", "onRepeatModeChanged", "repeatCount", "Ljava/lang/Integer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RepeatCounter {
    public static final int $stable = 8;
    private Integer repeatCount;

    public RepeatCounter(RepeatMode repeatMode) {
        this.repeatCount = getCurrentRepetitions(repeatMode);
    }

    private final Integer getCurrentRepetitions(RepeatMode repeatMode) {
        if (repeatMode instanceof RepeatMode.None) {
            return null;
        }
        if (repeatMode instanceof RepeatMode.Infinity) {
            return 0;
        }
        if (repeatMode instanceof RepeatMode.Fixed) {
            return Integer.valueOf(((RepeatMode.Fixed) repeatMode).getWatched());
        }
        w511.b();
        return null;
    }

    /* renamed from: getCount, reason: from getter */
    public final Integer getRepeatCount() {
        return this.repeatCount;
    }

    public final void onRepeat() {
        Integer num = this.repeatCount;
        this.repeatCount = Integer.valueOf((num != null ? num.intValue() : 0) + 1);
    }

    public final void onRepeatModeChanged(RepeatMode repeatMode) {
        this.repeatCount = getCurrentRepetitions(repeatMode);
    }
}
