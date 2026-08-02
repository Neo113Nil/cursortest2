package ru.yandex.video.m3.player.impl.source.dash.manifest;

import defpackage.pb7;
import defpackage.ra7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.impl.source.dash.ParsedBaseUrlsHolder;
import ru.yandex.video.m3.player.impl.source.dash.ParsedSegmentBaseHolder;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/manifest/ExtendedDashManifestParserCreator;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExtendedDashManifestParserCreator {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jq\u0010\u0018\u001a\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/manifest/ExtendedDashManifestParserCreator$Companion;", "", "<init>", "()V", "Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;", "parsedBaseUrlsHolder", "Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;", "parsedSegmentBaseHolder", "Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;", "supplementalPropertiesInPeriodParseListener", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;", "thumbnailsEssentialPropertiesParseListener", "", "originalPlayerVsid", "originalPlayerSourceIndex", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "Lra7;", "cache", "Lpb7;", "cacheKeyFactory", "", "isPreloadLiveDashEnabled", "Lru/yandex/video/m3/player/impl/source/dash/manifest/ExtendedDashManifestParser;", "create", "(Lru/yandex/video/m3/player/impl/source/dash/ParsedBaseUrlsHolder;Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;Lru/yandex/video/m3/player/impl/source/dash/manifest/SupplementalPropertiesInPeriodParseListener;Lru/yandex/video/m3/player/impl/source/dash/manifest/ThumbnailsEssentialPropertiesParseListener;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/MediaSourceListener;Lra7;Lpb7;Ljava/lang/Boolean;)Lru/yandex/video/m3/player/impl/source/dash/manifest/ExtendedDashManifestParser;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExtendedDashManifestParser create(ParsedBaseUrlsHolder parsedBaseUrlsHolder, ParsedSegmentBaseHolder parsedSegmentBaseHolder, SupplementalPropertiesInPeriodParseListener supplementalPropertiesInPeriodParseListener, ThumbnailsEssentialPropertiesParseListener thumbnailsEssentialPropertiesParseListener, String originalPlayerVsid, String originalPlayerSourceIndex, MediaSourceListener mediaSourceListener, ra7 cache, pb7 cacheKeyFactory, Boolean isPreloadLiveDashEnabled) {
            return new ExtendedDashManifestParser(parsedBaseUrlsHolder, parsedSegmentBaseHolder, supplementalPropertiesInPeriodParseListener, thumbnailsEssentialPropertiesParseListener, originalPlayerVsid, originalPlayerSourceIndex, mediaSourceListener, cache, cacheKeyFactory, isPreloadLiveDashEnabled != null ? isPreloadLiveDashEnabled.booleanValue() : false);
        }

        private Companion() {
        }
    }
}
