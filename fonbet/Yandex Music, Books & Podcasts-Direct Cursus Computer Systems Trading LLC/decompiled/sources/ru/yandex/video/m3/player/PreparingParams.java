package ru.yandex.video.m3.player;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.hhm;
import defpackage.jom;
import defpackage.k5r;
import defpackage.mcr;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.dto.VideoData;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u00ad\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\"\u001a\u00020\u00002\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b\u0003\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b6\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b8\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b?\u0010*R+\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013j\u0004\u0018\u0001`\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\bC\u0010,R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\bD\u0010,R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b\u0018\u0010,R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010E\u001a\u0004\bH\u0010G¨\u0006I"}, d2 = {"Lru/yandex/video/m3/player/PreparingParams;", "", "", "isFirstEverStart", "", "contentId", "adContentId", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "startPosition", "autoPlay", "", "sourceIndex", "Lru/yandex/video/m3/player/AbrPreferences;", "abrPreferences", "Lmcr;", "startQualityConstraint", "expandedManifestUrl", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParams", "prepareWithoutInitCodecs", "preferredH264", "isOffline", "Lru/yandex/video/m3/data/DataSourceParameters;", "manifestDataSourceParameters", "chunkDataSourceParameters", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;ZILru/yandex/video/m3/player/AbrPreferences;Lmcr;Ljava/lang/String;Ljava/util/Map;ZZZLru/yandex/video/m3/data/DataSourceParameters;Lru/yandex/video/m3/data/DataSourceParameters;)V", "Lkotlin/Function1;", "Ljom;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/player/PreparingParams;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "()Z", "Ljava/lang/String;", "getContentId", "getAdContentId", "Lru/yandex/video/m3/data/dto/VideoData;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "Ljava/lang/Long;", "getStartPosition", "()Ljava/lang/Long;", "getAutoPlay", "I", "getSourceIndex", "Lru/yandex/video/m3/player/AbrPreferences;", "getAbrPreferences", "()Lru/yandex/video/m3/player/AbrPreferences;", "Lmcr;", "getStartQualityConstraint", "()Lmcr;", "getExpandedManifestUrl", "Ljava/util/Map;", "getAdditionalParams", "()Ljava/util/Map;", "getPrepareWithoutInitCodecs", "getPreferredH264", "Lru/yandex/video/m3/data/DataSourceParameters;", "getManifestDataSourceParameters", "()Lru/yandex/video/m3/data/DataSourceParameters;", "getChunkDataSourceParameters", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class PreparingParams {
    public static final int $stable = 8;

    @NotNull
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
    private final mcr startQualityConstraint;
    private final VideoData videoData;

    private PreparingParams(boolean z, String str, String str2, VideoData videoData, Long l, boolean z2, int i, AbrPreferences abrPreferences, mcr mcrVar, String str3, Map<String, ? extends Object> map, boolean z3, boolean z4, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2) {
        this.isFirstEverStart = z;
        this.contentId = str;
        this.adContentId = str2;
        this.videoData = videoData;
        this.startPosition = l;
        this.autoPlay = z2;
        this.sourceIndex = i;
        this.abrPreferences = abrPreferences;
        this.expandedManifestUrl = str3;
        this.additionalParams = map;
        this.prepareWithoutInitCodecs = z3;
        this.preferredH264 = z4;
        this.isOffline = z5;
        this.manifestDataSourceParameters = dataSourceParameters;
        this.chunkDataSourceParameters = dataSourceParameters2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreparingParams copy$default(PreparingParams preparingParams, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = hhm.t;
        }
        return preparingParams.copy(function1);
    }

    @NotNull
    public final PreparingParams copy(@NotNull Function1<? super jom, Unit> builderAction) {
        builderAction.getClass();
        jom jomVar = new jom(getIsFirstEverStart(), getAutoPlay(), getSourceIndex(), getAbrPreferences());
        jomVar.e = getContentId();
        jomVar.f = getAdContentId();
        jomVar.g = getVideoData();
        jomVar.h = getStartPosition();
        getStartQualityConstraint();
        jomVar.i = getExpandedManifestUrl();
        jomVar.j = getAdditionalParams();
        jomVar.k = Boolean.valueOf(getPrepareWithoutInitCodecs());
        jomVar.l = Boolean.valueOf(getPreferredH264());
        jomVar.m = Boolean.valueOf(getIsOffline());
        jomVar.n = getManifestDataSourceParameters();
        jomVar.o = getChunkDataSourceParameters();
        builderAction.invoke(jomVar);
        return jomVar.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PreparingParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        PreparingParams preparingParams = (PreparingParams) other;
        return this.isFirstEverStart == preparingParams.isFirstEverStart && Intrinsics.d(this.startPosition, preparingParams.startPosition) && this.autoPlay == preparingParams.autoPlay && this.sourceIndex == preparingParams.sourceIndex && this.prepareWithoutInitCodecs == preparingParams.prepareWithoutInitCodecs && this.preferredH264 == preparingParams.preferredH264 && this.isOffline == preparingParams.isOffline && Intrinsics.d(this.contentId, preparingParams.contentId) && Intrinsics.d(this.adContentId, preparingParams.adContentId) && Intrinsics.d(this.videoData, preparingParams.videoData) && Intrinsics.d(this.abrPreferences, preparingParams.abrPreferences) && Intrinsics.d(this.expandedManifestUrl, preparingParams.expandedManifestUrl) && Intrinsics.d(this.additionalParams, preparingParams.additionalParams) && Intrinsics.d(this.manifestDataSourceParameters, preparingParams.manifestDataSourceParameters) && Intrinsics.d(this.chunkDataSourceParameters, preparingParams.chunkDataSourceParameters);
    }

    @NotNull
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

    public final mcr getStartQualityConstraint() {
        return null;
    }

    public final VideoData getVideoData() {
        return this.videoData;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isFirstEverStart) * 31;
        Long l = this.startPosition;
        int e = k5r.e(k5r.e(k5r.e((k5r.e((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.autoPlay) + this.sourceIndex) * 31, 31, this.prepareWithoutInitCodecs), 31, this.preferredH264), 31, this.isOffline);
        String str = this.contentId;
        int hashCode2 = (e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.adContentId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        VideoData videoData = this.videoData;
        int hashCode4 = (this.abrPreferences.hashCode() + ((hashCode3 + (videoData != null ? videoData.hashCode() : 0)) * 31)) * 961;
        String str3 = this.expandedManifestUrl;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, Object> map = this.additionalParams;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters = this.manifestDataSourceParameters;
        int hashCode7 = (hashCode6 + (dataSourceParameters != null ? dataSourceParameters.hashCode() : 0)) * 31;
        DataSourceParameters dataSourceParameters2 = this.chunkDataSourceParameters;
        return hashCode7 + (dataSourceParameters2 != null ? dataSourceParameters2.hashCode() : 0);
    }

    /* renamed from: isFirstEverStart, reason: from getter */
    public final boolean getIsFirstEverStart() {
        return this.isFirstEverStart;
    }

    /* renamed from: isOffline, reason: from getter */
    public final boolean getIsOffline() {
        return this.isOffline;
    }

    @NotNull
    public String toString() {
        return "PreparingParams(isFirstEverStart=" + this.isFirstEverStart + ", contentId=" + this.contentId + ", adContentId=" + this.adContentId + ", videoData=" + this.videoData + ", startPosition=" + this.startPosition + ", autoPlay=" + this.autoPlay + ", sourceIndex=" + this.sourceIndex + ", abrPreferences=" + this.abrPreferences + ", startQualityConstraint=null, expandedManifestUrl=" + this.expandedManifestUrl + ", additionalParams=" + this.additionalParams + ", prepareWithoutInitCodecs=" + this.prepareWithoutInitCodecs + ", preferredH264=" + this.preferredH264 + ", isOffline=" + this.isOffline + ", manifestDataSourceParameters=" + this.manifestDataSourceParameters + ", chunkDataSourceParameters=" + this.chunkDataSourceParameters + ')';
    }

    public /* synthetic */ PreparingParams(boolean z, String str, String str2, VideoData videoData, Long l, boolean z2, int i, AbrPreferences abrPreferences, mcr mcrVar, String str3, Map map, boolean z3, boolean z4, boolean z5, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, videoData, l, z2, i, abrPreferences, mcrVar, str3, map, z3, z4, z5, dataSourceParameters, dataSourceParameters2);
    }
}
