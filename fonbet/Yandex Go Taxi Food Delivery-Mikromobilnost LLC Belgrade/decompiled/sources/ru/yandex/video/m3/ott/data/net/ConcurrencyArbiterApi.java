package ru.yandex.video.m3.ott.data.net;

import defpackage.zy11;
import java.util.concurrent.Future;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.ott.data.dto.Ott;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0007¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", ConfigConstants.CONFIG, "Ljava/util/concurrent/Future;", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterHeartbeat;", "start", "(Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Ljava/util/concurrent/Future;", "heartbeat", "Lzy11;", "finish", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ConcurrencyArbiterApi {
    Future<zy11> finish(Ott.ConcurrencyArbiterConfig config);

    Future<ConcurrencyArbiterHeartbeat> heartbeat(Ott.ConcurrencyArbiterConfig config);

    Future<ConcurrencyArbiterHeartbeat> start(Ott.ConcurrencyArbiterConfig config);
}
