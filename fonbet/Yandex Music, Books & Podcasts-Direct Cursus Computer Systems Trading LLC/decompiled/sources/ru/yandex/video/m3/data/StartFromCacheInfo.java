package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dpo;
import defpackage.tlm;
import defpackage.zbr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB1\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Lru/yandex/video/m3/data/StartFromCacheInfo;", "", "", "preloaderVsid", "", "isManifestFromCache", "", "videoCachePositionMs", "audioCachePositionMs", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "Lkotlin/Function1;", "Lzbr;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/data/StartFromCacheInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getPreloaderVsid", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "getVideoCachePositionMs", "()Ljava/lang/Long;", "getAudioCachePositionMs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class StartFromCacheInfo {
    public static final int $stable = 0;
    private final Long audioCachePositionMs;
    private final Boolean isManifestFromCache;
    private final String preloaderVsid;
    private final Long videoCachePositionMs;

    private StartFromCacheInfo(String str, Boolean bool, Long l, Long l2) {
        this.preloaderVsid = str;
        this.isManifestFromCache = bool;
        this.videoCachePositionMs = l;
        this.audioCachePositionMs = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartFromCacheInfo copy$default(StartFromCacheInfo startFromCacheInfo, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = dpo.Z;
        }
        return startFromCacheInfo.copy(function1);
    }

    @NotNull
    public final StartFromCacheInfo copy(@NotNull Function1<? super zbr, Unit> builderAction) {
        builderAction.getClass();
        String preloaderVsid = getPreloaderVsid();
        Boolean isManifestFromCache = getIsManifestFromCache();
        Long videoCachePositionMs = getVideoCachePositionMs();
        Long audioCachePositionMs = getAudioCachePositionMs();
        builderAction.invoke(new zbr());
        return new StartFromCacheInfo(preloaderVsid, isManifestFromCache, videoCachePositionMs, audioCachePositionMs, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!StartFromCacheInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        StartFromCacheInfo startFromCacheInfo = (StartFromCacheInfo) other;
        return Intrinsics.d(this.isManifestFromCache, startFromCacheInfo.isManifestFromCache) && Intrinsics.d(this.videoCachePositionMs, startFromCacheInfo.videoCachePositionMs) && Intrinsics.d(this.audioCachePositionMs, startFromCacheInfo.audioCachePositionMs) && Intrinsics.d(this.preloaderVsid, startFromCacheInfo.preloaderVsid);
    }

    public final Long getAudioCachePositionMs() {
        return this.audioCachePositionMs;
    }

    public final String getPreloaderVsid() {
        return this.preloaderVsid;
    }

    public final Long getVideoCachePositionMs() {
        return this.videoCachePositionMs;
    }

    public int hashCode() {
        Boolean bool = this.isManifestFromCache;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Long l = this.videoCachePositionMs;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.audioCachePositionMs;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str = this.preloaderVsid;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isManifestFromCache, reason: from getter */
    public final Boolean getIsManifestFromCache() {
        return this.isManifestFromCache;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("StartFromCacheInfo(preloaderVsid=");
        sb.append(this.preloaderVsid);
        sb.append(", isManifestFromCache=");
        sb.append(this.isManifestFromCache);
        sb.append(", videoCachePositionMs=");
        sb.append(this.videoCachePositionMs);
        sb.append(", audioCachePositionMs=");
        return tlm.k(sb, this.audioCachePositionMs, ')');
    }

    public /* synthetic */ StartFromCacheInfo(String str, Boolean bool, Long l, Long l2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bool, l, l2);
    }
}
