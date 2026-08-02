package ru.yandex.video.m3.source.chunk;

import androidx.media3.common.a;
import defpackage.cvu0;
import defpackage.mpg;
import defpackage.npg;
import defpackage.s4j0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/source/chunk/DataSpecFormatter;", "", "", "useGzipForSubtitles", "<init>", "(Z)V", "Landroidx/media3/common/a;", "isSubtitles", "(Landroidx/media3/common/a;)Z", "Lnpg;", "dataSpec", "Ls4j0;", "representation", "updateDataSpec", "(Lnpg;Ls4j0;)Lnpg;", "Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DataSpecFormatter {
    public static final int $stable = 0;
    private final boolean useGzipForSubtitles;

    public DataSpecFormatter(boolean z) {
        this.useGzipForSubtitles = z;
    }

    private final boolean isSubtitles(a aVar) {
        String str = aVar.m;
        return str != null && cvu0.x(str, "text", false);
    }

    public final npg updateDataSpec(npg dataSpec, s4j0 representation) {
        if (!this.useGzipForSubtitles || !isSubtitles(representation.a)) {
            return dataSpec;
        }
        int i = dataSpec.i | 1;
        mpg a = dataSpec.a();
        a.i = i;
        return a.a();
    }
}
