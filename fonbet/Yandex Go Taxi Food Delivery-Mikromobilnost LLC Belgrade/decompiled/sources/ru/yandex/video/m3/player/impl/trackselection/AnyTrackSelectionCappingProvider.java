package ru.yandex.video.m3.player.impl.trackselection;

import androidx.media3.common.a;
import defpackage.l001;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.player.tracks.CappingProvider;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/AnyTrackSelectionCappingProvider;", "Lru/yandex/video/m3/player/tracks/CappingProvider;", "Ll001;", "trackSelection", "<init>", "(Ll001;)V", "Lru/yandex/video/m3/data/Size;", "getCapping", "()Lru/yandex/video/m3/data/Size;", "Ll001;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnyTrackSelectionCappingProvider implements CappingProvider {
    public static final int $stable = 8;
    private final l001 trackSelection;

    public AnyTrackSelectionCappingProvider(l001 l001Var) {
        this.trackSelection = l001Var;
    }

    @Override // ru.yandex.video.m3.player.tracks.CappingProvider
    public Size getCapping() {
        int length = this.trackSelection.length();
        a aVar = null;
        for (int i = 0; i < length; i++) {
            a format = this.trackSelection.getFormat(i);
            if (aVar == null || format.v > aVar.v) {
                aVar = format;
            }
        }
        if (aVar != null) {
            return SizeKt.Size$default(aVar.u, aVar.v, null, 4, null);
        }
        return null;
    }
}
