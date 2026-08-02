package ru.yandex.video.m3.player.tracking;

import defpackage.gw00;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/tracking/BaseVideoDataSerializer;", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "()V", "serialize", "", "", "", Constants.KEY_DATA, "Lru/yandex/video/m3/data/dto/VideoData;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BaseVideoDataSerializer implements VideoDataSerializer {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final BaseVideoDataSerializer INSTANCE = new BaseVideoDataSerializer();

    private BaseVideoDataSerializer() {
    }

    @Override // ru.yandex.video.m3.data.dto.VideoDataSerializer
    public Map<String, Object> serialize(VideoData data) {
        Map<String, Object> e = data != null ? gw00.e(new Pair("videoData", data)) : null;
        return e == null ? b.f() : e;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/tracking/BaseVideoDataSerializer$Companion;", "", "()V", "INSTANCE", "Lru/yandex/video/m3/player/tracking/BaseVideoDataSerializer;", "getINSTANCE", "()Lru/yandex/video/m3/player/tracking/BaseVideoDataSerializer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BaseVideoDataSerializer getINSTANCE() {
            return BaseVideoDataSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
