package ru.yandex.video.m3.source;

import defpackage.cj01;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.player.CurrentBufferLengthProvider;
import ru.yandex.video.m3.player.MediaSourceListener;
import ru.yandex.video.m3.player.drm.ExoDrmSessionManager;
import ru.yandex.video.m3.player.feature.PlaybackFeaturesProvider;
import ru.yandex.video.m3.source.MediaSourceParameters;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001:\u00015B]\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b1\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/yandex/video/m3/source/MediaSourceParameters;", "", "", "url", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "drmSessionManager", "Lcj01;", "transferListener", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "playbackFeaturesProvider", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "prepareParams", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;Lcj01;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;Lru/yandex/video/m3/player/MediaSourceListener;Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DelegatePrepareParams;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/source/MediaSourceParameters$Builder;", "Lzy11;", "builderAction", "copy$video_player_internalRelease", "(Ltls;)Lru/yandex/video/m3/source/MediaSourceParameters;", "copy", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "getDrmSessionManager", "()Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "Lcj01;", "getTransferListener", "()Lcj01;", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "getCurrentBufferLengthProvider", "()Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "Lru/yandex/video/m3/player/MediaSourceListener;", "getMediaSourceListener", "()Lru/yandex/video/m3/player/MediaSourceListener;", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "getPlaybackFeaturesProvider$video_player_internalRelease", "()Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters$video_player_internalRelease", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters$video_player_internalRelease", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "getPrepareParams$video_player_internalRelease", "()Lru/yandex/video/m3/data/DelegatePrepareParams;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MediaSourceParameters {
    public static final int $stable = 8;
    private final DataSourceParameters chunkDataSourceParameters;
    private final CurrentBufferLengthProvider currentBufferLengthProvider;
    private final ExoDrmSessionManager drmSessionManager;
    private final DataSourceParameters manifestDataSourceParameters;
    private final MediaSourceListener mediaSourceListener;
    private final PlaybackFeaturesProvider playbackFeaturesProvider;
    private final DelegatePrepareParams prepareParams;
    private final cj01 transferListener;
    private final String url;

    private MediaSourceParameters(String str, ExoDrmSessionManager exoDrmSessionManager, cj01 cj01Var, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener, PlaybackFeaturesProvider playbackFeaturesProvider, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DelegatePrepareParams delegatePrepareParams) {
        this.url = str;
        this.drmSessionManager = exoDrmSessionManager;
        this.transferListener = cj01Var;
        this.currentBufferLengthProvider = currentBufferLengthProvider;
        this.mediaSourceListener = mediaSourceListener;
        this.playbackFeaturesProvider = playbackFeaturesProvider;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
        this.prepareParams = delegatePrepareParams;
    }

    public static /* synthetic */ MediaSourceParameters copy$video_player_internalRelease$default(MediaSourceParameters mediaSourceParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.source.MediaSourceParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((MediaSourceParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(MediaSourceParameters.Builder builder) {
                }
            };
        }
        return mediaSourceParameters.copy$video_player_internalRelease(tlsVar);
    }

    public final MediaSourceParameters copy$video_player_internalRelease(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    /* renamed from: getChunkDataSourceParameters$video_player_internalRelease, reason: from getter */
    public final DataSourceParameters getChunkDataSourceParameters() {
        return this.chunkDataSourceParameters;
    }

    public final CurrentBufferLengthProvider getCurrentBufferLengthProvider() {
        return this.currentBufferLengthProvider;
    }

    public final ExoDrmSessionManager getDrmSessionManager() {
        return this.drmSessionManager;
    }

    /* renamed from: getManifestDataSourceParameters$video_player_internalRelease, reason: from getter */
    public final DataSourceParameters getManifestDataSourceParameters() {
        return this.manifestDataSourceParameters;
    }

    public final MediaSourceListener getMediaSourceListener() {
        return this.mediaSourceListener;
    }

    /* renamed from: getPlaybackFeaturesProvider$video_player_internalRelease, reason: from getter */
    public final PlaybackFeaturesProvider getPlaybackFeaturesProvider() {
        return this.playbackFeaturesProvider;
    }

    /* renamed from: getPrepareParams$video_player_internalRelease, reason: from getter */
    public final DelegatePrepareParams getPrepareParams() {
        return this.prepareParams;
    }

    public final cj01 getTransferListener() {
        return this.transferListener;
    }

    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ MediaSourceParameters(String str, ExoDrmSessionManager exoDrmSessionManager, cj01 cj01Var, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener, PlaybackFeaturesProvider playbackFeaturesProvider, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DelegatePrepareParams delegatePrepareParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, exoDrmSessionManager, cj01Var, currentBufferLengthProvider, mediaSourceListener, playbackFeaturesProvider, dataSourceParameters, dataSourceParameters2, delegatePrepareParams);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00105\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R$\u0010?\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/yandex/video/m3/source/MediaSourceParameters$Builder;", "", "", "url", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "drmSessionManager", "Lcj01;", "transferListener", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "currentBufferLengthProvider", "Lru/yandex/video/m3/player/MediaSourceListener;", "mediaSourceListener", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;Lcj01;Lru/yandex/video/m3/player/CurrentBufferLengthProvider;Lru/yandex/video/m3/player/MediaSourceListener;)V", "Lru/yandex/video/m3/source/MediaSourceParameters;", "parameters", "(Lru/yandex/video/m3/source/MediaSourceParameters;)V", "build$video_player_internalRelease", "()Lru/yandex/video/m3/source/MediaSourceParameters;", "build", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "getDrmSessionManager", "()Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;", "setDrmSessionManager", "(Lru/yandex/video/m3/player/drm/ExoDrmSessionManager;)V", "Lcj01;", "getTransferListener", "()Lcj01;", "setTransferListener", "(Lcj01;)V", "Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "getCurrentBufferLengthProvider", "()Lru/yandex/video/m3/player/CurrentBufferLengthProvider;", "setCurrentBufferLengthProvider", "(Lru/yandex/video/m3/player/CurrentBufferLengthProvider;)V", "Lru/yandex/video/m3/player/MediaSourceListener;", "getMediaSourceListener", "()Lru/yandex/video/m3/player/MediaSourceListener;", "setMediaSourceListener", "(Lru/yandex/video/m3/player/MediaSourceListener;)V", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "playbackFeaturesProvider", "Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "getPlaybackFeaturesProvider$video_player_internalRelease", "()Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;", "setPlaybackFeaturesProvider$video_player_internalRelease", "(Lru/yandex/video/m3/player/feature/PlaybackFeaturesProvider;)V", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters$video_player_internalRelease", "()Lru/yandex/video/m3/data/DataSourceParameters;", "setManifestDataSourceParameters$video_player_internalRelease", "(Lru/yandex/video/m3/data/DataSourceParameters;)V", "chunkDataSourceParameters", "getChunkDataSourceParameters$video_player_internalRelease", "setChunkDataSourceParameters$video_player_internalRelease", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "prepareParams", "Lru/yandex/video/m3/data/DelegatePrepareParams;", "getPrepareParams$video_player_internalRelease", "()Lru/yandex/video/m3/data/DelegatePrepareParams;", "setPrepareParams$video_player_internalRelease", "(Lru/yandex/video/m3/data/DelegatePrepareParams;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private DataSourceParameters chunkDataSourceParameters;
        private CurrentBufferLengthProvider currentBufferLengthProvider;
        private ExoDrmSessionManager drmSessionManager;
        private DataSourceParameters manifestDataSourceParameters;
        private MediaSourceListener mediaSourceListener;
        private PlaybackFeaturesProvider playbackFeaturesProvider;
        private DelegatePrepareParams prepareParams;
        private cj01 transferListener;
        private String url;

        public Builder(MediaSourceParameters mediaSourceParameters) {
            this(mediaSourceParameters.getUrl(), mediaSourceParameters.getDrmSessionManager(), mediaSourceParameters.getTransferListener(), mediaSourceParameters.getCurrentBufferLengthProvider(), mediaSourceParameters.getMediaSourceListener());
            this.playbackFeaturesProvider = mediaSourceParameters.getPlaybackFeaturesProvider();
            this.manifestDataSourceParameters = mediaSourceParameters.getManifestDataSourceParameters();
            this.chunkDataSourceParameters = mediaSourceParameters.getChunkDataSourceParameters();
            this.prepareParams = mediaSourceParameters.getPrepareParams();
        }

        public final MediaSourceParameters build$video_player_internalRelease() {
            String str = this.url;
            ExoDrmSessionManager exoDrmSessionManager = this.drmSessionManager;
            cj01 cj01Var = this.transferListener;
            CurrentBufferLengthProvider currentBufferLengthProvider = this.currentBufferLengthProvider;
            MediaSourceListener mediaSourceListener = this.mediaSourceListener;
            PlaybackFeaturesProvider playbackFeaturesProvider = this.playbackFeaturesProvider;
            if (playbackFeaturesProvider == null) {
                playbackFeaturesProvider = PlaybackFeaturesProvider.INSTANCE;
            }
            return new MediaSourceParameters(str, exoDrmSessionManager, cj01Var, currentBufferLengthProvider, mediaSourceListener, playbackFeaturesProvider, this.manifestDataSourceParameters, this.chunkDataSourceParameters, this.prepareParams, null);
        }

        /* renamed from: getChunkDataSourceParameters$video_player_internalRelease, reason: from getter */
        public final DataSourceParameters getChunkDataSourceParameters() {
            return this.chunkDataSourceParameters;
        }

        public final CurrentBufferLengthProvider getCurrentBufferLengthProvider() {
            return this.currentBufferLengthProvider;
        }

        public final ExoDrmSessionManager getDrmSessionManager() {
            return this.drmSessionManager;
        }

        /* renamed from: getManifestDataSourceParameters$video_player_internalRelease, reason: from getter */
        public final DataSourceParameters getManifestDataSourceParameters() {
            return this.manifestDataSourceParameters;
        }

        public final MediaSourceListener getMediaSourceListener() {
            return this.mediaSourceListener;
        }

        /* renamed from: getPlaybackFeaturesProvider$video_player_internalRelease, reason: from getter */
        public final PlaybackFeaturesProvider getPlaybackFeaturesProvider() {
            return this.playbackFeaturesProvider;
        }

        /* renamed from: getPrepareParams$video_player_internalRelease, reason: from getter */
        public final DelegatePrepareParams getPrepareParams() {
            return this.prepareParams;
        }

        public final cj01 getTransferListener() {
            return this.transferListener;
        }

        public final String getUrl() {
            return this.url;
        }

        public final void setChunkDataSourceParameters$video_player_internalRelease(DataSourceParameters dataSourceParameters) {
            this.chunkDataSourceParameters = dataSourceParameters;
        }

        public final void setCurrentBufferLengthProvider(CurrentBufferLengthProvider currentBufferLengthProvider) {
            this.currentBufferLengthProvider = currentBufferLengthProvider;
        }

        public final void setDrmSessionManager(ExoDrmSessionManager exoDrmSessionManager) {
            this.drmSessionManager = exoDrmSessionManager;
        }

        public final void setManifestDataSourceParameters$video_player_internalRelease(DataSourceParameters dataSourceParameters) {
            this.manifestDataSourceParameters = dataSourceParameters;
        }

        public final void setMediaSourceListener(MediaSourceListener mediaSourceListener) {
            this.mediaSourceListener = mediaSourceListener;
        }

        public final void setPlaybackFeaturesProvider$video_player_internalRelease(PlaybackFeaturesProvider playbackFeaturesProvider) {
            this.playbackFeaturesProvider = playbackFeaturesProvider;
        }

        public final void setPrepareParams$video_player_internalRelease(DelegatePrepareParams delegatePrepareParams) {
            this.prepareParams = delegatePrepareParams;
        }

        public final void setTransferListener(cj01 cj01Var) {
            this.transferListener = cj01Var;
        }

        public final void setUrl(String str) {
            this.url = str;
        }

        public Builder(String str, ExoDrmSessionManager exoDrmSessionManager, cj01 cj01Var, CurrentBufferLengthProvider currentBufferLengthProvider, MediaSourceListener mediaSourceListener) {
            this.url = str;
            this.drmSessionManager = exoDrmSessionManager;
            this.transferListener = cj01Var;
            this.currentBufferLengthProvider = currentBufferLengthProvider;
            this.mediaSourceListener = mediaSourceListener;
        }
    }
}
