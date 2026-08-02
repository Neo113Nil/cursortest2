package ru.yandex.video.m3.player.utils.network;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/utils/network/NetworkTypeProvider;", "", "Lru/yandex/video/m3/player/utils/network/NetworkType;", "getNetworkType", "()Lru/yandex/video/m3/player/utils/network/NetworkType;", "Landroid/content/Context;", "context", "getForceNetworkType", "(Landroid/content/Context;)Lru/yandex/video/m3/player/utils/network/NetworkType;", "Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;", "networkChangeListener", "Lzy11;", "addListener", "(Lru/yandex/video/m3/player/utils/network/NetworkChangeListener;)V", "removeListener", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkTypeProvider {
    void addListener(NetworkChangeListener networkChangeListener);

    NetworkType getForceNetworkType(Context context);

    NetworkType getNetworkType();

    void removeListener(NetworkChangeListener networkChangeListener);
}
