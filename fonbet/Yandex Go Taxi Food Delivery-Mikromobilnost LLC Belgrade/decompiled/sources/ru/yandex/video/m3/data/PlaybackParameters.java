package ru.yandex.video.m3.data;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.PlaybackParameters;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001:\u0001EB\u0093\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00002\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b=\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bD\u0010C¨\u0006F"}, d2 = {"Lru/yandex/video/m3/data/PlaybackParameters;", "", "", "autoPlay", "", "startPosition", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lru/yandex/video/m3/data/AdParameters;", "adParameters", "Lru/yandex/video/m3/data/StartQualityConstraint;", "startQualityConstraint", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "playerAnalyticsData", "disableAudioFromStart", "prepareWithoutInitCodecs", "preferredH264", "Lru/yandex/video/m3/data/DrmParameters;", "drmParameters", "isOffline", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "<init>", "(ZLjava/lang/Long;Ljava/util/Map;Lru/yandex/video/m3/data/AdParameters;Lru/yandex/video/m3/data/StartQualityConstraint;Lru/yandex/video/m3/data/PlayerAnalyticsData;ZZZLru/yandex/video/m3/data/DrmParameters;ZLru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/data/PlaybackParameters$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/data/PlaybackParameters;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getAutoPlay", "()Z", "Ljava/lang/Long;", "getStartPosition", "()Ljava/lang/Long;", "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "Lru/yandex/video/m3/data/AdParameters;", "getAdParameters", "()Lru/yandex/video/m3/data/AdParameters;", "Lru/yandex/video/m3/data/StartQualityConstraint;", "getStartQualityConstraint", "()Lru/yandex/video/m3/data/StartQualityConstraint;", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "getPlayerAnalyticsData", "()Lru/yandex/video/m3/data/PlayerAnalyticsData;", "getDisableAudioFromStart", "getPrepareWithoutInitCodecs", "getPreferredH264", "Lru/yandex/video/m3/data/DrmParameters;", "getDrmParameters", "()Lru/yandex/video/m3/data/DrmParameters;", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackParameters {
    public static final int $stable = 8;
    private final AdParameters adParameters;
    private final Map<String, Object> additionalParameters;
    private final boolean autoPlay;
    private final DataSourceParameters chunkDataSourceParameters;
    private final boolean disableAudioFromStart;
    private final DrmParameters drmParameters;
    private final boolean isOffline;
    private final DataSourceParameters manifestDataSourceParameters;
    private final PlayerAnalyticsData playerAnalyticsData;
    private final boolean preferredH264;
    private final boolean prepareWithoutInitCodecs;
    private final Long startPosition;
    private final StartQualityConstraint startQualityConstraint;

    private PlaybackParameters(boolean z, Long l, Map<String, ? extends Object> map, AdParameters adParameters, StartQualityConstraint startQualityConstraint, PlayerAnalyticsData playerAnalyticsData, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2) {
        this.autoPlay = z;
        this.startPosition = l;
        this.additionalParameters = map;
        this.adParameters = adParameters;
        this.startQualityConstraint = startQualityConstraint;
        this.playerAnalyticsData = playerAnalyticsData;
        this.disableAudioFromStart = z2;
        this.prepareWithoutInitCodecs = z3;
        this.preferredH264 = z4;
        this.drmParameters = drmParameters;
        this.isOffline = z5;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
    }

    public static /* synthetic */ PlaybackParameters copy$default(PlaybackParameters playbackParameters, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.data.PlaybackParameters$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlaybackParameters.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlaybackParameters.Builder builder) {
                }
            };
        }
        return playbackParameters.copy(tlsVar);
    }

    public final PlaybackParameters copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlaybackParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) other;
        return this.autoPlay == playbackParameters.autoPlay && jl40.l(this.startPosition, playbackParameters.startPosition) && this.disableAudioFromStart == playbackParameters.disableAudioFromStart && this.prepareWithoutInitCodecs == playbackParameters.prepareWithoutInitCodecs && this.preferredH264 == playbackParameters.preferredH264 && this.isOffline == playbackParameters.isOffline && jl40.l(this.additionalParameters, playbackParameters.additionalParameters) && jl40.l(this.adParameters, playbackParameters.adParameters) && jl40.l(this.startQualityConstraint, playbackParameters.startQualityConstraint) && jl40.l(this.playerAnalyticsData, playbackParameters.playerAnalyticsData) && jl40.l(this.drmParameters, playbackParameters.drmParameters) && jl40.l(this.manifestDataSourceParameters, playbackParameters.manifestDataSourceParameters) && jl40.l(this.chunkDataSourceParameters, playbackParameters.chunkDataSourceParameters);
    }

    public final AdParameters getAdParameters() {
        return this.adParameters;
    }

    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final DataSourceParameters getChunkDataSourceParameters() {
        return this.chunkDataSourceParameters;
    }

    public final boolean getDisableAudioFromStart() {
        return this.disableAudioFromStart;
    }

    public final DrmParameters getDrmParameters() {
        return this.drmParameters;
    }

    public final DataSourceParameters getManifestDataSourceParameters() {
        return this.manifestDataSourceParameters;
    }

    public final PlayerAnalyticsData getPlayerAnalyticsData() {
        return this.playerAnalyticsData;
    }

    public final boolean getPreferredH264() {
        return this.preferredH264;
    }

    public final boolean getPrepareWithoutInitCodecs() {
        return this.prepareWithoutInitCodecs;
    }

    public final Long getStartPosition() {
        return this.startPosition;
    }

    public final StartQualityConstraint getStartQualityConstraint() {
        return this.startQualityConstraint;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.autoPlay) * 31;
        Long l = this.startPosition;
        int e = unr0.e(unr0.e(unr0.e(unr0.e((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.disableAudioFromStart), 31, this.prepareWithoutInitCodecs), 31, this.preferredH264), 31, this.isOffline);
        Map<String, Object> map = this.additionalParameters;
        int hashCode2 = (e + (map != null ? map.hashCode() : 0)) * 31;
        AdParameters adParameters = this.adParameters;
        int hashCode3 = (hashCode2 + (adParameters != null ? adParameters.hashCode() : 0)) * 31;
        StartQualityConstraint startQualityConstraint = this.startQualityConstraint;
        int hashCode4 = (hashCode3 + (startQualityConstraint != null ? startQualityConstraint.hashCode() : 0)) * 31;
        PlayerAnalyticsData playerAnalyticsData = this.playerAnalyticsData;
        int hashCode5 = (hashCode4 + (playerAnalyticsData != null ? playerAnalyticsData.hashCode() : 0)) * 31;
        DrmParameters drmParameters = this.drmParameters;
        int hashCode6 = (hashCode5 + (drmParameters != null ? drmParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters = this.manifestDataSourceParameters;
        int hashCode7 = (hashCode6 + (dataSourceParameters != null ? dataSourceParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters2 = this.chunkDataSourceParameters;
        return hashCode7 + (dataSourceParameters2 != null ? dataSourceParameters2.hashCode() : 0);
    }

    /* renamed from: isOffline, reason: from getter */
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    public String toString() {
        return "PlaybackParameters(additionalParameters=" + this.additionalParameters + ", autoPlay=" + this.autoPlay + ", startPosition=" + this.startPosition + ", adParameters=" + this.adParameters + ", startQualityConstraint=" + this.startQualityConstraint + ", playerAnalyticsData=" + this.playerAnalyticsData + ", disableAudioFromStart=" + this.disableAudioFromStart + ", prepareWithoutInitCodecs=" + this.prepareWithoutInitCodecs + ", preferredH264=" + this.preferredH264 + ", drmParameters=" + this.drmParameters + ", isOffline=" + this.isOffline + ", manifestDataSourceParameters=" + this.manifestDataSourceParameters + ", chunkDataSourceParameters=" + this.chunkDataSourceParameters + ')';
    }

    public /* synthetic */ PlaybackParameters(boolean z, Long l, Map map, AdParameters adParameters, StartQualityConstraint startQualityConstraint, PlayerAnalyticsData playerAnalyticsData, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, l, map, adParameters, startQualityConstraint, playerAnalyticsData, z2, z3, z4, drmParameters, z5, dataSourceParameters, dataSourceParameters2);
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010I\u001a\u00020\u0003H\u0000¢\u0006\u0002\bJR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000fj\u0004\u0018\u0001`\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0007R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010-\u001a\u0004\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001c\u00100\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001e\u00109\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\u001e\u0010<\u001a\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u0010\n\u0002\u0010B\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/yandex/video/m3/data/PlaybackParameters$Builder;", "", "playbackParameters", "Lru/yandex/video/m3/data/PlaybackParameters;", "(Lru/yandex/video/m3/data/PlaybackParameters;)V", "autoPlay", "", "(Z)V", "adParameters", "Lru/yandex/video/m3/data/AdParameters;", "getAdParameters", "()Lru/yandex/video/m3/data/AdParameters;", "setAdParameters", "(Lru/yandex/video/m3/data/AdParameters;)V", "additionalParameters", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "getAdditionalParameters", "()Ljava/util/Map;", "setAdditionalParameters", "(Ljava/util/Map;)V", "getAutoPlay", "()Z", "setAutoPlay", "chunkDataSourceParameters", "Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "setChunkDataSourceParameters", "(Lru/yandex/video/m3/data/DataSourceParameters;)V", "disableAudioFromStart", "getDisableAudioFromStart", "()Ljava/lang/Boolean;", "setDisableAudioFromStart", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "drmParameters", "Lru/yandex/video/m3/data/DrmParameters;", "getDrmParameters", "()Lru/yandex/video/m3/data/DrmParameters;", "setDrmParameters", "(Lru/yandex/video/m3/data/DrmParameters;)V", "isOffline", "setOffline", "manifestDataSourceParameters", "getManifestDataSourceParameters", "setManifestDataSourceParameters", "playerAnalyticsData", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "getPlayerAnalyticsData", "()Lru/yandex/video/m3/data/PlayerAnalyticsData;", "setPlayerAnalyticsData", "(Lru/yandex/video/m3/data/PlayerAnalyticsData;)V", "preferredH264", "getPreferredH264", "setPreferredH264", "prepareWithoutInitCodecs", "getPrepareWithoutInitCodecs", "setPrepareWithoutInitCodecs", "startPosition", "", "getStartPosition", "()Ljava/lang/Long;", "setStartPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "startQualityConstraint", "Lru/yandex/video/m3/data/StartQualityConstraint;", "getStartQualityConstraint", "()Lru/yandex/video/m3/data/StartQualityConstraint;", "setStartQualityConstraint", "(Lru/yandex/video/m3/data/StartQualityConstraint;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AdParameters adParameters;
        private Map<String, ? extends Object> additionalParameters;
        private boolean autoPlay;
        private DataSourceParameters chunkDataSourceParameters;
        private Boolean disableAudioFromStart;
        private DrmParameters drmParameters;
        private Boolean isOffline;
        private DataSourceParameters manifestDataSourceParameters;
        private PlayerAnalyticsData playerAnalyticsData;
        private Boolean preferredH264;
        private Boolean prepareWithoutInitCodecs;
        private Long startPosition;
        private StartQualityConstraint startQualityConstraint;

        public Builder(PlaybackParameters playbackParameters) {
            this(playbackParameters.getAutoPlay());
            this.additionalParameters = playbackParameters.getAdditionalParameters();
            this.startPosition = playbackParameters.getStartPosition();
            this.adParameters = playbackParameters.getAdParameters();
            this.startQualityConstraint = playbackParameters.getStartQualityConstraint();
            this.playerAnalyticsData = playbackParameters.getPlayerAnalyticsData();
            this.disableAudioFromStart = Boolean.valueOf(playbackParameters.getDisableAudioFromStart());
            this.prepareWithoutInitCodecs = Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs());
            this.preferredH264 = Boolean.valueOf(playbackParameters.getPreferredH264());
            this.drmParameters = playbackParameters.getDrmParameters();
            this.isOffline = Boolean.valueOf(playbackParameters.getIsOffline());
            this.manifestDataSourceParameters = playbackParameters.getManifestDataSourceParameters();
            this.chunkDataSourceParameters = playbackParameters.getChunkDataSourceParameters();
        }

        public final PlaybackParameters build$video_player_internalRelease() {
            boolean z = this.autoPlay;
            Long l = this.startPosition;
            Map<String, ? extends Object> map = this.additionalParameters;
            AdParameters adParameters = this.adParameters;
            StartQualityConstraint startQualityConstraint = this.startQualityConstraint;
            PlayerAnalyticsData playerAnalyticsData = this.playerAnalyticsData;
            Boolean bool = this.disableAudioFromStart;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.prepareWithoutInitCodecs;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.preferredH264;
            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            boolean z2 = booleanValue;
            boolean z3 = booleanValue2;
            DrmParameters drmParameters = this.drmParameters;
            Boolean bool4 = this.isOffline;
            return new PlaybackParameters(z, l, map, adParameters, startQualityConstraint, playerAnalyticsData, z2, z3, booleanValue3, drmParameters, bool4 != null ? bool4.booleanValue() : false, this.manifestDataSourceParameters, this.chunkDataSourceParameters, null);
        }

        public final AdParameters getAdParameters() {
            return this.adParameters;
        }

        public final Map<String, Object> getAdditionalParameters() {
            return this.additionalParameters;
        }

        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        public final DataSourceParameters getChunkDataSourceParameters() {
            return this.chunkDataSourceParameters;
        }

        public final Boolean getDisableAudioFromStart() {
            return this.disableAudioFromStart;
        }

        public final DrmParameters getDrmParameters() {
            return this.drmParameters;
        }

        public final DataSourceParameters getManifestDataSourceParameters() {
            return this.manifestDataSourceParameters;
        }

        public final PlayerAnalyticsData getPlayerAnalyticsData() {
            return this.playerAnalyticsData;
        }

        public final Boolean getPreferredH264() {
            return this.preferredH264;
        }

        public final Boolean getPrepareWithoutInitCodecs() {
            return this.prepareWithoutInitCodecs;
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final StartQualityConstraint getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        /* renamed from: isOffline, reason: from getter */
        public final Boolean getIsOffline() {
            return this.isOffline;
        }

        public final void setAdParameters(AdParameters adParameters) {
            this.adParameters = adParameters;
        }

        public final void setAdditionalParameters(Map<String, ? extends Object> map) {
            this.additionalParameters = map;
        }

        public final void setAutoPlay(boolean z) {
            this.autoPlay = z;
        }

        public final void setChunkDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.chunkDataSourceParameters = dataSourceParameters;
        }

        public final void setDisableAudioFromStart(Boolean bool) {
            this.disableAudioFromStart = bool;
        }

        public final void setDrmParameters(DrmParameters drmParameters) {
            this.drmParameters = drmParameters;
        }

        public final void setManifestDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.manifestDataSourceParameters = dataSourceParameters;
        }

        public final void setOffline(Boolean bool) {
            this.isOffline = bool;
        }

        public final void setPlayerAnalyticsData(PlayerAnalyticsData playerAnalyticsData) {
            this.playerAnalyticsData = playerAnalyticsData;
        }

        public final void setPreferredH264(Boolean bool) {
            this.preferredH264 = bool;
        }

        public final void setPrepareWithoutInitCodecs(Boolean bool) {
            this.prepareWithoutInitCodecs = bool;
        }

        public final void setStartPosition(Long l) {
            this.startPosition = l;
        }

        public final void setStartQualityConstraint(StartQualityConstraint startQualityConstraint) {
            this.startQualityConstraint = startQualityConstraint;
        }

        public Builder(boolean z) {
            this.autoPlay = z;
        }
    }
}
