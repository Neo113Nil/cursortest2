package ru.yandex.video.m3.ott.data.dto;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.vx7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB9\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0087\u0002J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0087\u0002J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0087\u0002J,\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J#\u0010\u0011\u001a\u00020\"2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0000¢\u0006\u0002\b#J\b\u0010$\u001a\u00020\u000bH\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/DrmParams;", "", "requestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "servers", "Lru/yandex/video/m3/ott/data/dto/DrmServers;", "advanced", "Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)V", "freeRequestParams", "", "", "(Ljava/util/Map;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)V", "getAdvanced", "()Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "getFreeRequestParams", "()Ljava/util/Map;", "setFreeRequestParams", "(Ljava/util/Map;)V", "getRequestParams$annotations", "()V", "getRequestParams", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getServers", "()Lru/yandex/video/m3/ott/data/dto/DrmServers;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "", "setFreeRequestParams$video_player_internalRelease", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DrmParams {
    public static final int $stable = 8;
    private final DrmAdvanced advanced;
    private Map<String, String> freeRequestParams;
    private final DrmRequestParams requestParams;
    private final DrmServers servers;

    public DrmParams(Map<String, String> map, DrmRequestParams drmRequestParams, DrmServers drmServers, DrmAdvanced drmAdvanced) {
        this.freeRequestParams = map;
        this.requestParams = drmRequestParams;
        this.servers = drmServers;
        this.advanced = drmAdvanced;
    }

    public static /* synthetic */ DrmParams copy$default(DrmParams drmParams, DrmRequestParams drmRequestParams, DrmServers drmServers, DrmAdvanced drmAdvanced, int i, Object obj) {
        if ((i & 1) != 0) {
            drmRequestParams = drmParams.requestParams;
        }
        if ((i & 2) != 0) {
            drmServers = drmParams.servers;
        }
        if ((i & 4) != 0) {
            drmAdvanced = drmParams.advanced;
        }
        return drmParams.copy(drmRequestParams, drmServers, drmAdvanced);
    }

    @vx7
    public static /* synthetic */ void getRequestParams$annotations() {
    }

    @vx7
    /* renamed from: component1, reason: from getter */
    public final DrmRequestParams getRequestParams() {
        return this.requestParams;
    }

    @vx7
    /* renamed from: component2, reason: from getter */
    public final DrmServers getServers() {
        return this.servers;
    }

    @vx7
    /* renamed from: component3, reason: from getter */
    public final DrmAdvanced getAdvanced() {
        return this.advanced;
    }

    @vx7
    @NotNull
    public final DrmParams copy(DrmRequestParams requestParams, DrmServers servers, DrmAdvanced advanced) {
        return new DrmParams(requestParams, servers, advanced);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmParams.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DrmParams drmParams = (DrmParams) other;
        return Intrinsics.d(this.freeRequestParams, drmParams.freeRequestParams) && Intrinsics.d(this.requestParams, drmParams.requestParams) && Intrinsics.d(this.servers, drmParams.servers) && Intrinsics.d(this.advanced, drmParams.advanced);
    }

    public final DrmAdvanced getAdvanced() {
        return this.advanced;
    }

    public final Map<String, String> getFreeRequestParams() {
        return this.freeRequestParams;
    }

    public final DrmRequestParams getRequestParams() {
        return this.requestParams;
    }

    public final DrmServers getServers() {
        return this.servers;
    }

    public int hashCode() {
        Map<String, String> map = this.freeRequestParams;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        DrmRequestParams drmRequestParams = this.requestParams;
        int hashCode2 = (hashCode + (drmRequestParams != null ? drmRequestParams.hashCode() : 0)) * 31;
        DrmServers drmServers = this.servers;
        int hashCode3 = (hashCode2 + (drmServers != null ? drmServers.hashCode() : 0)) * 31;
        DrmAdvanced drmAdvanced = this.advanced;
        return hashCode3 + (drmAdvanced != null ? drmAdvanced.hashCode() : 0);
    }

    public final void setFreeRequestParams(Map<String, String> map) {
        this.freeRequestParams = map;
    }

    public final void setFreeRequestParams$video_player_internalRelease(Map<String, String> freeRequestParams) {
        this.freeRequestParams = freeRequestParams;
    }

    @NotNull
    public String toString() {
        return "DrmParams(freeRequestParams=" + this.freeRequestParams + ", requestParams=" + this.requestParams + ", servers=" + this.servers + ", advanced=" + this.advanced + ')';
    }

    public DrmParams(DrmRequestParams drmRequestParams, DrmServers drmServers, DrmAdvanced drmAdvanced) {
        this(null, drmRequestParams, drmServers, drmAdvanced);
    }
}
