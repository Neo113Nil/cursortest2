package ru.yandex.video.m3.player.error_handling;

import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/error_handling/ErrorHandler;", "", CA20Status.STATUS_CERTIFICATE_H, "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "Lzy11;", "attachTo", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "detachFromPlayer", "()V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "Lru/yandex/video/m3/player/error_handling/ErrorSource;", "errorSource", "Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "handleException", "(Lru/yandex/video/m3/player/PlaybackException;Lru/yandex/video/m3/player/PreparingParams;Lru/yandex/video/m3/player/error_handling/ErrorSource;)Lru/yandex/video/m3/player/error_handling/ErrorHandlingResult;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ErrorHandler<H> {
    void attachTo(YandexPlayer<H> yandexPlayer);

    void detachFromPlayer();

    ErrorHandlingResult handleException(PlaybackException playbackException, PreparingParams preparingParams, ErrorSource errorSource);
}
