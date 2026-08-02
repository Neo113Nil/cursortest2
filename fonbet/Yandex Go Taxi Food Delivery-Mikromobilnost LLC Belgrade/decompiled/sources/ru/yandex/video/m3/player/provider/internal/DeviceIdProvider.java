package ru.yandex.video.m3.player.provider.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider;", "", "Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Listener;", "listener", "Lzy11;", "addListener", "(Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Listener;)V", "", "get", "()Ljava/lang/String;", "Companion", "Listener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeviceIdProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Companion;", "", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/DeviceIdProvider$Listener;", "", "", "deviceId", "Lzy11;", "onDeviceIdObtained", "(Ljava/lang/String;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Listener {
        void onDeviceIdObtained(String deviceId);
    }

    void addListener(Listener listener);

    String get();
}
