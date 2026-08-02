package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/IgnoredErrorData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "ignoreReason", "", "isIgnored", "", "(Ljava/lang/String;Z)V", "getIgnoreReason", "()Ljava/lang/String;", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IgnoredErrorData extends DefaultEventData {
    public static final int $stable = 0;
    private final String ignoreReason;
    private final boolean isIgnored;

    public IgnoredErrorData(String str, boolean z) {
        super(null, 1, null);
        this.ignoreReason = str;
        this.isIgnored = z;
    }

    public final String getIgnoreReason() {
        return this.ignoreReason;
    }

    /* renamed from: isIgnored, reason: from getter */
    public final boolean getIsIgnored() {
        return this.isIgnored;
    }

    public /* synthetic */ IgnoredErrorData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? true : z);
    }
}
