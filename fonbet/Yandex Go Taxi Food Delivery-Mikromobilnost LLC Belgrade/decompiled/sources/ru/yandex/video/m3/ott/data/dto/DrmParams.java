package ru.yandex.video.m3.ott.data.dto;

import defpackage.jl40;
import defpackage.jxi;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB'\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\rJ%\u0010\u0011\u001a\u00020\u000e2\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0087\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0087\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R0\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0011\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0015R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0019¨\u0006."}, d2 = {"Lru/yandex/video/m3/ott/data/dto/DrmParams;", "", "", "", "freeRequestParams", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "requestParams", "Lru/yandex/video/m3/ott/data/dto/DrmServers;", "servers", "Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "advanced", "<init>", "(Ljava/util/Map;Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)V", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)V", "Lzy11;", "setFreeRequestParams$video_player_internalRelease", "(Ljava/util/Map;)V", "setFreeRequestParams", "copy", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;Lru/yandex/video/m3/ott/data/dto/DrmServers;Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;)Lru/yandex/video/m3/ott/data/dto/DrmParams;", "component1", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "component2", "()Lru/yandex/video/m3/ott/data/dto/DrmServers;", "component3", "()Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getFreeRequestParams", "()Ljava/util/Map;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmRequestParams;", "getRequestParams", "getRequestParams$annotations", "()V", "Lru/yandex/video/m3/ott/data/dto/DrmServers;", "getServers", "Lru/yandex/video/m3/ott/data/dto/DrmAdvanced;", "getAdvanced", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
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

    @jxi
    public static /* synthetic */ void getRequestParams$annotations() {
    }

    @jxi
    /* renamed from: component1, reason: from getter */
    public final DrmRequestParams getRequestParams() {
        return this.requestParams;
    }

    @jxi
    /* renamed from: component2, reason: from getter */
    public final DrmServers getServers() {
        return this.servers;
    }

    @jxi
    /* renamed from: component3, reason: from getter */
    public final DrmAdvanced getAdvanced() {
        return this.advanced;
    }

    @jxi
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
        DrmParams drmParams = (DrmParams) other;
        return jl40.l(this.freeRequestParams, drmParams.freeRequestParams) && jl40.l(this.requestParams, drmParams.requestParams) && jl40.l(this.servers, drmParams.servers) && jl40.l(this.advanced, drmParams.advanced);
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

    public String toString() {
        return "DrmParams(freeRequestParams=" + this.freeRequestParams + ", requestParams=" + this.requestParams + ", servers=" + this.servers + ", advanced=" + this.advanced + ')';
    }

    public DrmParams(DrmRequestParams drmRequestParams, DrmServers drmServers, DrmAdvanced drmAdvanced) {
        this(null, drmRequestParams, drmServers, drmAdvanced);
    }
}
