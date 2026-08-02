package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.oyr;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.event.DefaultEventData;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/SimpleDecoderEventData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SimpleDecoderEventData extends DefaultEventData {
    public static final int $stable = 0;
    private final String name;

    public SimpleDecoderEventData(String str) {
        super(null, 1, null);
        this.name = str;
        setDetails("{\n\"decoderName\": \"" + str + "\"\n}");
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return oyr.t(new StringBuilder("SimpleDecoderEventData(name='"), this.name, "')");
    }
}
