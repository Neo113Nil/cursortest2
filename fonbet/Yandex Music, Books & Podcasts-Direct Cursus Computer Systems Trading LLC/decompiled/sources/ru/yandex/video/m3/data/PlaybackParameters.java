package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.k5r;
import defpackage.kzj;
import defpackage.mcr;
import defpackage.o0l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0093\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006j\u0004\u0018\u0001`\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u00002\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010.R+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0006j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u00104R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b<\u0010+R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b=\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010)\u001a\u0004\b\u0015\u0010+R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bD\u0010C¨\u0006E"}, d2 = {"Lru/yandex/video/m3/data/PlaybackParameters;", "", "", "autoPlay", "", "startPosition", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lru/yandex/video/m3/data/AdParameters;", "adParameters", "Lmcr;", "startQualityConstraint", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "playerAnalyticsData", "disableAudioFromStart", "prepareWithoutInitCodecs", "preferredH264", "Lru/yandex/video/m3/data/DrmParameters;", "drmParameters", "isOffline", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "<init>", "(ZLjava/lang/Long;Ljava/util/Map;Lru/yandex/video/m3/data/AdParameters;Lmcr;Lru/yandex/video/m3/data/PlayerAnalyticsData;ZZZLru/yandex/video/m3/data/DrmParameters;ZLru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;)V", "Lkotlin/Function1;", "Lo0l;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/data/PlaybackParameters;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "getAutoPlay", "()Z", "Ljava/lang/Long;", "getStartPosition", "()Ljava/lang/Long;", "Ljava/util/Map;", "getAdditionalParameters", "()Ljava/util/Map;", "Lru/yandex/video/m3/data/AdParameters;", "getAdParameters", "()Lru/yandex/video/m3/data/AdParameters;", "Lmcr;", "getStartQualityConstraint", "()Lmcr;", "Lru/yandex/video/m3/data/PlayerAnalyticsData;", "getPlayerAnalyticsData", "()Lru/yandex/video/m3/data/PlayerAnalyticsData;", "getDisableAudioFromStart", "getPrepareWithoutInitCodecs", "getPreferredH264", "Lru/yandex/video/m3/data/DrmParameters;", "getDrmParameters", "()Lru/yandex/video/m3/data/DrmParameters;", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
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
    private final mcr startQualityConstraint;

    private PlaybackParameters(boolean z, Long l, Map<String, ? extends Object> map, AdParameters adParameters, mcr mcrVar, PlayerAnalyticsData playerAnalyticsData, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2) {
        this.autoPlay = z;
        this.startPosition = l;
        this.additionalParameters = map;
        this.adParameters = adParameters;
        this.playerAnalyticsData = playerAnalyticsData;
        this.disableAudioFromStart = z2;
        this.prepareWithoutInitCodecs = z3;
        this.preferredH264 = z4;
        this.drmParameters = drmParameters;
        this.isOffline = z5;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaybackParameters copy$default(PlaybackParameters playbackParameters, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = kzj.y0;
        }
        return playbackParameters.copy(function1);
    }

    @NotNull
    public final PlaybackParameters copy(@NotNull Function1<? super o0l, Unit> builderAction) {
        builderAction.getClass();
        o0l o0lVar = new o0l(getAutoPlay());
        o0lVar.c = getAdditionalParameters();
        o0lVar.b = getStartPosition();
        o0lVar.d = getAdParameters();
        getStartQualityConstraint();
        o0lVar.e = getPlayerAnalyticsData();
        o0lVar.f = Boolean.valueOf(getDisableAudioFromStart());
        o0lVar.g = Boolean.valueOf(getPrepareWithoutInitCodecs());
        o0lVar.h = Boolean.valueOf(getPreferredH264());
        o0lVar.i = getDrmParameters();
        o0lVar.j = Boolean.valueOf(getIsOffline());
        o0lVar.k = getManifestDataSourceParameters();
        o0lVar.l = getChunkDataSourceParameters();
        builderAction.invoke(o0lVar);
        return o0lVar.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PlaybackParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        PlaybackParameters playbackParameters = (PlaybackParameters) other;
        return this.autoPlay == playbackParameters.autoPlay && Intrinsics.d(this.startPosition, playbackParameters.startPosition) && this.disableAudioFromStart == playbackParameters.disableAudioFromStart && this.prepareWithoutInitCodecs == playbackParameters.prepareWithoutInitCodecs && this.preferredH264 == playbackParameters.preferredH264 && this.isOffline == playbackParameters.isOffline && Intrinsics.d(this.additionalParameters, playbackParameters.additionalParameters) && Intrinsics.d(this.adParameters, playbackParameters.adParameters) && Intrinsics.d(this.playerAnalyticsData, playbackParameters.playerAnalyticsData) && Intrinsics.d(this.drmParameters, playbackParameters.drmParameters) && Intrinsics.d(this.manifestDataSourceParameters, playbackParameters.manifestDataSourceParameters) && Intrinsics.d(this.chunkDataSourceParameters, playbackParameters.chunkDataSourceParameters);
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

    public final mcr getStartQualityConstraint() {
        return null;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.autoPlay) * 31;
        Long l = this.startPosition;
        int e = k5r.e(k5r.e(k5r.e(k5r.e((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.disableAudioFromStart), 31, this.prepareWithoutInitCodecs), 31, this.preferredH264), 31, this.isOffline);
        Map<String, Object> map = this.additionalParameters;
        int hashCode2 = (e + (map != null ? map.hashCode() : 0)) * 31;
        AdParameters adParameters = this.adParameters;
        int hashCode3 = (hashCode2 + (adParameters != null ? adParameters.hashCode() : 0)) * 961;
        PlayerAnalyticsData playerAnalyticsData = this.playerAnalyticsData;
        int hashCode4 = (hashCode3 + (playerAnalyticsData != null ? playerAnalyticsData.hashCode() : 0)) * 31;
        DrmParameters drmParameters = this.drmParameters;
        int hashCode5 = (hashCode4 + (drmParameters != null ? drmParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters = this.manifestDataSourceParameters;
        int hashCode6 = (hashCode5 + (dataSourceParameters != null ? dataSourceParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters2 = this.chunkDataSourceParameters;
        return hashCode6 + (dataSourceParameters2 != null ? dataSourceParameters2.hashCode() : 0);
    }

    /* renamed from: isOffline, reason: from getter */
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    @NotNull
    public String toString() {
        return "PlaybackParameters(additionalParameters=" + this.additionalParameters + ", autoPlay=" + this.autoPlay + ", startPosition=" + this.startPosition + ", adParameters=" + this.adParameters + ", startQualityConstraint=null, playerAnalyticsData=" + this.playerAnalyticsData + ", disableAudioFromStart=" + this.disableAudioFromStart + ", prepareWithoutInitCodecs=" + this.prepareWithoutInitCodecs + ", preferredH264=" + this.preferredH264 + ", drmParameters=" + this.drmParameters + ", isOffline=" + this.isOffline + ", manifestDataSourceParameters=" + this.manifestDataSourceParameters + ", chunkDataSourceParameters=" + this.chunkDataSourceParameters + ')';
    }

    public /* synthetic */ PlaybackParameters(boolean z, Long l, Map map, AdParameters adParameters, mcr mcrVar, PlayerAnalyticsData playerAnalyticsData, boolean z2, boolean z3, boolean z4, DrmParameters drmParameters, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, l, map, adParameters, mcrVar, playerAnalyticsData, z2, z3, z4, drmParameters, z5, dataSourceParameters, dataSourceParameters2);
    }
}
