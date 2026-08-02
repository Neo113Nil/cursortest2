package ru.yandex.video.m3.config;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/config/EmptyAccountProvider;", "Lru/yandex/video/m3/config/AccountProvider;", "()V", "authToken", "", "getAuthToken", "()Ljava/lang/String;", "yandexUid", "getYandexUid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmptyAccountProvider implements AccountProvider {
    public static final int $stable = 0;
    public static final EmptyAccountProvider INSTANCE = new EmptyAccountProvider();

    private EmptyAccountProvider() {
    }

    @Override // ru.yandex.video.m3.config.AccountProvider
    public String getAuthToken() {
        return "";
    }

    @Override // ru.yandex.video.m3.config.AccountProvider
    public String getYandexUid() {
        return "";
    }
}
