package ru.yandex.video.m3.ott.data.net;

import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.Ott;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/net/TimingsApi;", "", "Lru/yandex/video/m3/ott/data/dto/Ott$TimingsInfo;", "timingsInfo", "Ljava/util/concurrent/Future;", "Lzy11;", "sendTiming", "(Lru/yandex/video/m3/ott/data/dto/Ott$TimingsInfo;)Ljava/util/concurrent/Future;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface TimingsApi {
    Future<zy11> sendTiming(Ott.TimingsInfo timingsInfo);
}
