package ru.yandex.video.m3.previews;

import defpackage.kwu;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromPeriodSupplementalPropsParser;", "", "Lkwu;", "url", "", "presentationTimeOffsetMs", "", "Lru/yandex/video/m3/previews/RawThumbnail;", "parse", "(Lkwu;J)Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ThumbnailsFromPeriodSupplementalPropsParser {
    List<RawThumbnail> parse(kwu url, long presentationTimeOffsetMs) throws Exception;
}
