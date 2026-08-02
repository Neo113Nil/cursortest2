package ru.yandex.video.m3.player;

import defpackage.jl40;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.StartQualityConstraint;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PreparingParams;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001:\u0001IB\u00ad\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u00002\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b\u0003\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b6\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b?\u0010*R+\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\bC\u0010,R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\bD\u0010,R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b\u0018\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bH\u0010G¨\u0006J"}, d2 = {"Lru/yandex/video/m3/player/PreparingParams;", "", "", "isFirstEverStart", "", "contentId", "adContentId", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "startPosition", "autoPlay", "", "sourceIndex", "Lru/yandex/video/m3/player/AbrPreferences;", "abrPreferences", "Lru/yandex/video/m3/data/StartQualityConstraint;", "startQualityConstraint", "expandedManifestUrl", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParams", "prepareWithoutInitCodecs", "preferredH264", "isOffline", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;ZILru/yandex/video/m3/player/AbrPreferences;Lru/yandex/video/m3/data/StartQualityConstraint;Ljava/lang/String;Ljava/util/Map;ZZZLru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/PreparingParams$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/PreparingParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "()Z", "Ljava/lang/String;", "getContentId", "getAdContentId", "Lru/yandex/video/m3/data/dto/VideoData;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "Ljava/lang/Long;", "getStartPosition", "()Ljava/lang/Long;", "getAutoPlay", CA20Status.STATUS_USER_I, "getSourceIndex", "Lru/yandex/video/m3/player/AbrPreferences;", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "Lru/yandex/video/m3/data/StartQualityConstraint;", "getStartQualityConstraint", "()Lru/yandex/video/m3/data/StartQualityConstraint;", "getExpandedManifestUrl", "Ljava/util/Map;", "getAdditionalParams", "()Ljava/util/Map;", "getPrepareWithoutInitCodecs", "getPreferredH264", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreparingParams {
    public static final int $stable = 8;
    private final AbrPreferences abrPreferences;
    private final String adContentId;
    private final Map<String, Object> additionalParams;
    private final boolean autoPlay;
    private final DataSourceParameters chunkDataSourceParameters;
    private final String contentId;
    private final String expandedManifestUrl;
    private final boolean isFirstEverStart;
    private final boolean isOffline;
    private final DataSourceParameters manifestDataSourceParameters;
    private final boolean preferredH264;
    private final boolean prepareWithoutInitCodecs;
    private final int sourceIndex;
    private final Long startPosition;
    private final StartQualityConstraint startQualityConstraint;
    private final VideoData videoData;

    private PreparingParams(boolean z, String str, String str2, VideoData videoData, Long l, boolean z2, int i, AbrPreferences abrPreferences, StartQualityConstraint startQualityConstraint, String str3, Map<String, ? extends Object> map, boolean z3, boolean z4, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2) {
        this.isFirstEverStart = z;
        this.contentId = str;
        this.adContentId = str2;
        this.videoData = videoData;
        this.startPosition = l;
        this.autoPlay = z2;
        this.sourceIndex = i;
        this.abrPreferences = abrPreferences;
        this.startQualityConstraint = startQualityConstraint;
        this.expandedManifestUrl = str3;
        this.additionalParams = map;
        this.prepareWithoutInitCodecs = z3;
        this.preferredH264 = z4;
        this.isOffline = z5;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
    }

    public static /* synthetic */ PreparingParams copy$default(PreparingParams preparingParams, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.PreparingParams$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PreparingParams.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PreparingParams.Builder builder) {
                }
            };
        }
        return preparingParams.copy(tlsVar);
    }

    public final PreparingParams copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PreparingParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PreparingParams preparingParams = (PreparingParams) other;
        return this.isFirstEverStart == preparingParams.isFirstEverStart && jl40.l(this.startPosition, preparingParams.startPosition) && this.autoPlay == preparingParams.autoPlay && this.sourceIndex == preparingParams.sourceIndex && this.prepareWithoutInitCodecs == preparingParams.prepareWithoutInitCodecs && this.preferredH264 == preparingParams.preferredH264 && this.isOffline == preparingParams.isOffline && jl40.l(this.contentId, preparingParams.contentId) && jl40.l(this.adContentId, preparingParams.adContentId) && jl40.l(this.videoData, preparingParams.videoData) && jl40.l(this.abrPreferences, preparingParams.abrPreferences) && jl40.l(this.startQualityConstraint, preparingParams.startQualityConstraint) && jl40.l(this.expandedManifestUrl, preparingParams.expandedManifestUrl) && jl40.l(this.additionalParams, preparingParams.additionalParams) && jl40.l(this.manifestDataSourceParameters, preparingParams.manifestDataSourceParameters) && jl40.l(this.chunkDataSourceParameters, preparingParams.chunkDataSourceParameters);
    }

    public final AbrPreferences getAbrPreferences() {
        return this.abrPreferences;
    }

    public final String getAdContentId() {
        return this.adContentId;
    }

    public final Map<String, Object> getAdditionalParams() {
        return this.additionalParams;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final DataSourceParameters getChunkDataSourceParameters() {
        return this.chunkDataSourceParameters;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getExpandedManifestUrl() {
        return this.expandedManifestUrl;
    }

    public final DataSourceParameters getManifestDataSourceParameters() {
        return this.manifestDataSourceParameters;
    }

    public final boolean getPreferredH264() {
        return this.preferredH264;
    }

    public final boolean getPrepareWithoutInitCodecs() {
        return this.prepareWithoutInitCodecs;
    }

    public final int getSourceIndex() {
        return this.sourceIndex;
    }

    public final Long getStartPosition() {
        return this.startPosition;
    }

    public final StartQualityConstraint getStartQualityConstraint() {
        return this.startQualityConstraint;
    }

    public final VideoData getVideoData() {
        return this.videoData;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isFirstEverStart) * 31;
        Long l = this.startPosition;
        int e = unr0.e(unr0.e(unr0.e((unr0.e((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.autoPlay) + this.sourceIndex) * 31, 31, this.prepareWithoutInitCodecs), 31, this.preferredH264), 31, this.isOffline);
        String str = this.contentId;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.adContentId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        VideoData videoData = this.videoData;
        int hashCode4 = (this.abrPreferences.hashCode() + ((hashCode3 + (videoData != null ? videoData.hashCode() : 0)) * 31)) * 31;
        StartQualityConstraint startQualityConstraint = this.startQualityConstraint;
        int hashCode5 = (hashCode4 + (startQualityConstraint != null ? startQualityConstraint.hashCode() : 0)) * 31;
        String str3 = this.expandedManifestUrl;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, Object> map = this.additionalParams;
        int hashCode7 = (hashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters = this.manifestDataSourceParameters;
        int hashCode8 = (hashCode7 + (dataSourceParameters != null ? dataSourceParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters2 = this.chunkDataSourceParameters;
        return hashCode8 + (dataSourceParameters2 != null ? dataSourceParameters2.hashCode() : 0);
    }

    /* renamed from: isFirstEverStart, reason: from getter */
    public final boolean getIsFirstEverStart() {
        return this.isFirstEverStart;
    }

    /* renamed from: isOffline, reason: from getter */
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    public String toString() {
        return "PreparingParams(isFirstEverStart=" + this.isFirstEverStart + ", contentId=" + this.contentId + ", adContentId=" + this.adContentId + ", videoData=" + this.videoData + ", startPosition=" + this.startPosition + ", autoPlay=" + this.autoPlay + ", sourceIndex=" + this.sourceIndex + ", abrPreferences=" + this.abrPreferences + ", startQualityConstraint=" + this.startQualityConstraint + ", expandedManifestUrl=" + this.expandedManifestUrl + ", additionalParams=" + this.additionalParams + ", prepareWithoutInitCodecs=" + this.prepareWithoutInitCodecs + ", preferredH264=" + this.preferredH264 + ", isOffline=" + this.isOffline + ", manifestDataSourceParameters=" + this.manifestDataSourceParameters + ", chunkDataSourceParameters=" + this.chunkDataSourceParameters + ')';
    }

    public /* synthetic */ PreparingParams(boolean z, String str, String str2, VideoData videoData, Long l, boolean z2, int i, AbrPreferences abrPreferences, StartQualityConstraint startQualityConstraint, String str3, Map map, boolean z3, boolean z4, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, videoData, l, z2, i, abrPreferences, startQualityConstraint, str3, map, z3, z4, z5, dataSourceParameters, dataSourceParameters2);
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010T\u001a\u00020\u0003R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R.\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001c\u0010+\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u001f\"\u0004\b.\u0010!R\u001e\u0010/\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00104\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R\u001e\u00107\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b8\u00100\"\u0004\b9\u00102R\u001e\u0010:\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b;\u00100\"\u0004\b<\u00102R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001e\u0010A\u001a\u0004\u0018\u00010BX\u0086\u000e¢\u0006\u0010\n\u0002\u0010G\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lru/yandex/video/m3/player/PreparingParams$Builder;", "", "preparingParams", "Lru/yandex/video/m3/player/PreparingParams;", "(Lru/yandex/video/m3/player/PreparingParams;)V", "isFirstEverStart", "", "autoPlay", "sourceIndex", "", "abrPreferences", "Lru/yandex/video/m3/player/AbrPreferences;", "(ZZILru/yandex/video/m3/player/AbrPreferences;)V", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "setAbrPreferences", "(Lru/yandex/video/m3/player/AbrPreferences;)V", "adContentId", "", "getAdContentId", "()Ljava/lang/String;", "setAdContentId", "(Ljava/lang/String;)V", "additionalParams", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "getAdditionalParams", "()Ljava/util/Map;", "setAdditionalParams", "(Ljava/util/Map;)V", "getAutoPlay", "()Z", "setAutoPlay", "(Z)V", "chunkDataSourceParameters", "Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "setChunkDataSourceParameters", "(Lru/yandex/video/m3/data/DataSourceParameters;)V", "contentId", "getContentId", "setContentId", "expandedManifestUrl", "getExpandedManifestUrl", "setExpandedManifestUrl", "setFirstEverStart", "isOffline", "()Ljava/lang/Boolean;", "setOffline", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "manifestDataSourceParameters", "getManifestDataSourceParameters", "setManifestDataSourceParameters", "preferredH264", "getPreferredH264", "setPreferredH264", "prepareWithoutInitCodecs", "getPrepareWithoutInitCodecs", "setPrepareWithoutInitCodecs", "getSourceIndex", "()I", "setSourceIndex", "(I)V", "startPosition", "", "getStartPosition", "()Ljava/lang/Long;", "setStartPosition", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "startQualityConstraint", "Lru/yandex/video/m3/data/StartQualityConstraint;", "getStartQualityConstraint", "()Lru/yandex/video/m3/data/StartQualityConstraint;", "setStartQualityConstraint", "(Lru/yandex/video/m3/data/StartQualityConstraint;)V", "videoData", "Lru/yandex/video/m3/data/dto/VideoData;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "setVideoData", "(Lru/yandex/video/m3/data/dto/VideoData;)V", "build", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AbrPreferences abrPreferences;
        private String adContentId;
        private Map<String, ? extends Object> additionalParams;
        private boolean autoPlay;
        private DataSourceParameters chunkDataSourceParameters;
        private String contentId;
        private String expandedManifestUrl;
        private boolean isFirstEverStart;
        private Boolean isOffline;
        private DataSourceParameters manifestDataSourceParameters;
        private Boolean preferredH264;
        private Boolean prepareWithoutInitCodecs;
        private int sourceIndex;
        private Long startPosition;
        private StartQualityConstraint startQualityConstraint;
        private VideoData videoData;

        public Builder(PreparingParams preparingParams) {
            this(preparingParams.getIsFirstEverStart(), preparingParams.getAutoPlay(), preparingParams.getSourceIndex(), preparingParams.getAbrPreferences());
            this.contentId = preparingParams.getContentId();
            this.adContentId = preparingParams.getAdContentId();
            this.videoData = preparingParams.getVideoData();
            this.startPosition = preparingParams.getStartPosition();
            this.startQualityConstraint = preparingParams.getStartQualityConstraint();
            this.expandedManifestUrl = preparingParams.getExpandedManifestUrl();
            this.additionalParams = preparingParams.getAdditionalParams();
            this.prepareWithoutInitCodecs = Boolean.valueOf(preparingParams.getPrepareWithoutInitCodecs());
            this.preferredH264 = Boolean.valueOf(preparingParams.getPreferredH264());
            this.isOffline = Boolean.valueOf(preparingParams.getIsOffline());
            this.manifestDataSourceParameters = preparingParams.getManifestDataSourceParameters();
            this.chunkDataSourceParameters = preparingParams.getChunkDataSourceParameters();
        }

        public final PreparingParams build() {
            boolean z = this.isFirstEverStart;
            String str = this.contentId;
            String str2 = this.adContentId;
            VideoData videoData = this.videoData;
            Long l = this.startPosition;
            boolean z2 = this.autoPlay;
            int i = this.sourceIndex;
            AbrPreferences abrPreferences = this.abrPreferences;
            StartQualityConstraint startQualityConstraint = this.startQualityConstraint;
            String str3 = this.expandedManifestUrl;
            Map<String, ? extends Object> map = this.additionalParams;
            Boolean bool = this.prepareWithoutInitCodecs;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.preferredH264;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.isOffline;
            return new PreparingParams(z, str, str2, videoData, l, z2, i, abrPreferences, startQualityConstraint, str3, map, booleanValue, booleanValue2, bool3 != null ? bool3.booleanValue() : false, this.manifestDataSourceParameters, this.chunkDataSourceParameters, null);
        }

        public final AbrPreferences getAbrPreferences() {
            return this.abrPreferences;
        }

        public final String getAdContentId() {
            return this.adContentId;
        }

        public final Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        public final boolean getAutoPlay() {
            return this.autoPlay;
        }

        public final DataSourceParameters getChunkDataSourceParameters() {
            return this.chunkDataSourceParameters;
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final String getExpandedManifestUrl() {
            return this.expandedManifestUrl;
        }

        public final DataSourceParameters getManifestDataSourceParameters() {
            return this.manifestDataSourceParameters;
        }

        public final Boolean getPreferredH264() {
            return this.preferredH264;
        }

        public final Boolean getPrepareWithoutInitCodecs() {
            return this.prepareWithoutInitCodecs;
        }

        public final int getSourceIndex() {
            return this.sourceIndex;
        }

        public final Long getStartPosition() {
            return this.startPosition;
        }

        public final StartQualityConstraint getStartQualityConstraint() {
            return this.startQualityConstraint;
        }

        public final VideoData getVideoData() {
            return this.videoData;
        }

        /* renamed from: isFirstEverStart, reason: from getter */
        public final boolean getIsFirstEverStart() {
            return this.isFirstEverStart;
        }

        /* renamed from: isOffline, reason: from getter */
        public final Boolean getIsOffline() {
            return this.isOffline;
        }

        public final void setAbrPreferences(AbrPreferences abrPreferences) {
            this.abrPreferences = abrPreferences;
        }

        public final void setAdContentId(String str) {
            this.adContentId = str;
        }

        public final void setAdditionalParams(Map<String, ? extends Object> map) {
            this.additionalParams = map;
        }

        public final void setAutoPlay(boolean z) {
            this.autoPlay = z;
        }

        public final void setChunkDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.chunkDataSourceParameters = dataSourceParameters;
        }

        public final void setContentId(String str) {
            this.contentId = str;
        }

        public final void setExpandedManifestUrl(String str) {
            this.expandedManifestUrl = str;
        }

        public final void setFirstEverStart(boolean z) {
            this.isFirstEverStart = z;
        }

        public final void setManifestDataSourceParameters(DataSourceParameters dataSourceParameters) {
            this.manifestDataSourceParameters = dataSourceParameters;
        }

        public final void setOffline(Boolean bool) {
            this.isOffline = bool;
        }

        public final void setPreferredH264(Boolean bool) {
            this.preferredH264 = bool;
        }

        public final void setPrepareWithoutInitCodecs(Boolean bool) {
            this.prepareWithoutInitCodecs = bool;
        }

        public final void setSourceIndex(int i) {
            this.sourceIndex = i;
        }

        public final void setStartPosition(Long l) {
            this.startPosition = l;
        }

        public final void setStartQualityConstraint(StartQualityConstraint startQualityConstraint) {
            this.startQualityConstraint = startQualityConstraint;
        }

        public final void setVideoData(VideoData videoData) {
            this.videoData = videoData;
        }

        public Builder(boolean z, boolean z2, int i, AbrPreferences abrPreferences) {
            this.isFirstEverStart = z;
            this.autoPlay = z2;
            this.sourceIndex = i;
            this.abrPreferences = abrPreferences;
        }
    }
}
