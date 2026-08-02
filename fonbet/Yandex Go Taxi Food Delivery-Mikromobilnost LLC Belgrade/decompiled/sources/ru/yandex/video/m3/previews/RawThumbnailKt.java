package ru.yandex.video.m3.previews;

import defpackage.tls;
import kotlin.Metadata;
import ru.yandex.video.m3.previews.RawThumbnail;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/previews/Type;", "type", "", "tilesWidth", "tilesHeight", "", "durationSec", "", "positionSupplementMs", "Lru/yandex/video/m3/previews/PathProvider;", "pathProvider", "Lru/yandex/video/m3/previews/PreviewVersion;", "previewVersion", "Lkotlin/Function1;", "Lru/yandex/video/m3/previews/RawThumbnail$Builder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/previews/RawThumbnail;", "RawThumbnail", "(Lru/yandex/video/m3/previews/Type;IIFJLru/yandex/video/m3/previews/PathProvider;Lru/yandex/video/m3/previews/PreviewVersion;Ltls;)Lru/yandex/video/m3/previews/RawThumbnail;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RawThumbnailKt {
    public static final /* synthetic */ RawThumbnail RawThumbnail(Type type, int i, int i2, float f, long j, PathProvider pathProvider, PreviewVersion previewVersion, tls tlsVar) {
        RawThumbnail.Builder builder = new RawThumbnail.Builder(type, i, i2, f, j, pathProvider, previewVersion);
        tlsVar.invoke(builder);
        return builder.build$video_player_internalRelease();
    }
}
