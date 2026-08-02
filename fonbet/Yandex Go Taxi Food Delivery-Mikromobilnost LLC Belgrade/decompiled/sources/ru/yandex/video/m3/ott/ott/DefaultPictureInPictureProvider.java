package ru.yandex.video.m3.ott.ott;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ott/ott/DefaultPictureInPictureProvider;", "Lru/yandex/video/m3/ott/ott/PictureInPictureProvider;", "isEnabledPictureInPictureMode", "", "(Z)V", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultPictureInPictureProvider implements PictureInPictureProvider {
    public static final int $stable = 0;
    private final boolean isEnabledPictureInPictureMode;

    public /* synthetic */ DefaultPictureInPictureProvider(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // ru.yandex.video.m3.ott.ott.PictureInPictureProvider
    /* renamed from: isEnabledPictureInPictureMode, reason: from getter */
    public boolean getIsEnabledPictureInPictureMode() {
        return this.isEnabledPictureInPictureMode;
    }

    public DefaultPictureInPictureProvider(boolean z) {
        this.isEnabledPictureInPictureMode = z;
    }

    public DefaultPictureInPictureProvider() {
        this(false, 1, null);
    }
}
