package ru.yandex.video.m3.player.impl.tracking.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/StalledStuckEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "loadControlState", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "(Lru/yandex/video/m3/data/loadcontrol/LoadControlState;)V", "getLoadControlState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class StalledStuckEventData extends DefaultEventData {
    public static final int $stable = 0;

    @NotNull
    private final LoadControlState loadControlState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StalledStuckEventData(@NotNull LoadControlState loadControlState) {
        super(null, 1, null);
        loadControlState.getClass();
        this.loadControlState = loadControlState;
    }

    @NotNull
    public final LoadControlState getLoadControlState() {
        return this.loadControlState;
    }
}
