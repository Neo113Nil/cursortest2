package ru.yandex.video.m3.player.provider.internal;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.provider.Consumer;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.player.provider.model.StartQuality;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\t\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/StartQualityProvider;", "Lru/yandex/video/m3/player/provider/Supplier;", "Lru/yandex/video/m3/player/provider/model/StartQuality;", "Lru/yandex/video/m3/player/provider/Consumer;", "<init>", "()V", "get-ARBYfN4", "()I", "get", "value", "Lzy11;", "accept-PNWoXag", "(Lru/yandex/video/m3/player/provider/model/StartQuality;)V", "accept", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StartQualityProvider implements Supplier<StartQuality>, Consumer<StartQuality> {
    public static final int $stable = 8;
    private int value = StartQuality.m805constructorimpl(Integer.MAX_VALUE);

    @Override // ru.yandex.video.m3.player.provider.Consumer
    /* renamed from: accept-PNWoXag, reason: not valid java name and merged with bridge method [inline-methods] */
    public void accept(StartQuality value) {
        this.value = value != null ? value.m810unboximpl() : StartQuality.m805constructorimpl(Integer.MAX_VALUE);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    public /* bridge */ /* synthetic */ StartQuality get() {
        return StartQuality.m804boximpl(getValue());
    }

    /* renamed from: get-ARBYfN4, reason: not valid java name and from getter */
    public int getValue() {
        return this.value;
    }
}
