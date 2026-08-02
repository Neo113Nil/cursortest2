package ru.yandex.video.m3.player.impl.tracking.utils;

import android.net.Uri;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.jwu;
import defpackage.kwu;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.AbConfig;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.impl.tracking.UriQueryParameters;
import ru.yandex.video.m3.player.impl.utils.InfoProvider;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJB\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/utils/DefaultManifestUrlInflater;", "Lru/yandex/video/m3/player/impl/tracking/utils/ManifestUrlInflater;", "infoProvider", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "timeProvider", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "abConfig", "Lru/yandex/video/m3/ab/config/AbConfig;", "requestSecondaryVideoTracks", "", "enableLowLatency", "enableAudioMbr", "loadPreviewsInDashPlaylistIfApplicable", "(Lru/yandex/video/m3/player/impl/utils/InfoProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;Lru/yandex/video/m3/player/impl/utils/TimeProvider;Lru/yandex/video/m3/ab/config/AbConfig;ZZZZ)V", "inflateManifestUrl", "", "vsid", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "contentId", "startPosition", "", "autoPlay", "sourceIndex", "", "isOffline", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultManifestUrlInflater implements ManifestUrlInflater {
    private static final String TAG = "YP:StrmMngr:DfltMnfstInfltr";
    private final AbConfig abConfig;
    private final boolean enableAudioMbr;
    private final boolean enableLowLatency;
    private final InfoProvider infoProvider;
    private final boolean loadPreviewsInDashPlaylistIfApplicable;
    private final PlayerLogger playerLogger;
    private final boolean requestSecondaryVideoTracks;
    private final TimeProvider timeProvider;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DefaultManifestUrlInflater(InfoProvider infoProvider, PlayerLogger playerLogger, TimeProvider timeProvider, AbConfig abConfig, boolean z, boolean z2, boolean z3, boolean z4) {
        this.infoProvider = infoProvider;
        this.playerLogger = playerLogger;
        this.timeProvider = timeProvider;
        this.abConfig = abConfig;
        this.requestSecondaryVideoTracks = z;
        this.enableLowLatency = z2;
        this.enableAudioMbr = z3;
        this.loadPreviewsInDashPlaylistIfApplicable = z4;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.utils.ManifestUrlInflater
    public String inflateManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline) {
        String path;
        String path2;
        String manifestUrl = videoData.getManifestUrl();
        Uri parse = Uri.parse(manifestUrl);
        String scheme = parse.getScheme();
        if (scheme == null || !cvu0.x(scheme, "http", true)) {
            return manifestUrl;
        }
        jwu jwuVar = new jwu();
        jwuVar.i(null, manifestUrl);
        kwu e = jwuVar.e();
        String vpuid = this.infoProvider.getVpuid();
        UriQueryParameters uriQueryParameters = UriQueryParameters.INSTANCE;
        String i = e.i(uriQueryParameters.get(18).getName());
        if (i != null) {
            String str = evu0.J(i) ? null : i;
            if (str != null) {
                contentId = str;
            }
        }
        if (contentId == null) {
            this.playerLogger.info(TAG, "expandManifestUrl", "ManifestUrl should contain video content id.", new Object[0]);
        }
        jwu g = e.g();
        g.p(uriQueryParameters.get(20).getName(), vsid);
        g.p(uriQueryParameters.get(15).getName(), String.valueOf(this.timeProvider.currentTimeMillis()));
        if (contentId != null) {
            g.p(uriQueryParameters.get(18).getName(), contentId);
        }
        if (vpuid != null) {
            g.p(uriQueryParameters.get(19).getName(), vpuid);
        }
        if (this.requestSecondaryVideoTracks) {
            g.p(uriQueryParameters.get(12).getName(), "1");
        }
        String path3 = parse.getPath();
        if (path3 == null || !cvu0.s(path3, ".mpd", true)) {
            PlayerLogger playerLogger = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                playerLogger.verbose(TAG, "expandManifestUrl", "ManifestUrl is not DASH or HLS. Path = " + parse.getPath(), new Object[0]);
            }
        } else {
            g.p(uriQueryParameters.get(2).getName(), "1");
            if (this.enableAudioMbr) {
                g.p(uriQueryParameters.get(3).getName(), "1");
            }
            if (this.enableLowLatency) {
                g.p(uriQueryParameters.get(9).getName(), "1");
                g.p(uriQueryParameters.get(5).getName(), "1");
            }
        }
        if (this.loadPreviewsInDashPlaylistIfApplicable && (path = parse.getPath()) != null && cvu0.s(path, "mpd", false) && (path2 = parse.getPath()) != null && !cvu0.x(path2, "/vod", false)) {
            g.p(uriQueryParameters.get(11).getName(), "1");
        }
        g.p(uriQueryParameters.get(13).getName(), String.valueOf(sourceIndex));
        if (this.abConfig.getFlags().getEnableHevc()) {
            g.p(uriQueryParameters.get(1).getName(), "1");
        }
        if (this.abConfig.getFlags().getIgnoreMinHeightWithService()) {
            g.m(uriQueryParameters.get(7).getName());
        }
        if (this.abConfig.getFlags().getIgnoreMaxHeightWithService()) {
            g.m(uriQueryParameters.get(6).getName());
        }
        return g.e().i;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/utils/DefaultManifestUrlInflater$Companion;", "", "()V", "TAG", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
