package ru.yandex.video.m3.player.impl.source.dash;

import androidx.media3.common.a;
import defpackage.c8q0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.b;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolderImpl;", "Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;", "<init>", "()V", "Landroidx/media3/common/a;", "format", "Lc8q0;", "segmentBase", "Lzy11;", "onNewSegmentBaseParsed", "(Landroidx/media3/common/a;Lc8q0;)V", "", "", "getSegmentBaseByFormatId", "()Ljava/util/Map;", "", "segmentBaseMapGuard", "Ljava/lang/Object;", "", PolicyMappingsExtension.MAP, "Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ParsedSegmentBaseHolderImpl implements ParsedSegmentBaseHolder {
    public static final int $stable = 8;
    private final Object segmentBaseMapGuard = new Object();
    private final Map<String, c8q0> map = new LinkedHashMap();

    @Override // ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder
    public Map<String, c8q0> getSegmentBaseByFormatId() {
        Map<String, c8q0> t;
        synchronized (this.segmentBaseMapGuard) {
            t = b.t(this.map);
        }
        return t;
    }

    @Override // ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder
    public void onNewSegmentBaseParsed(a format, c8q0 segmentBase) {
        synchronized (this.segmentBaseMapGuard) {
            this.map.put(format.a, segmentBase);
        }
    }
}
