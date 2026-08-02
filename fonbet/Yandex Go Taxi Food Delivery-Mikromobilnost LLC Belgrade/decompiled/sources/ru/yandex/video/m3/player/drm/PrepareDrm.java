package ru.yandex.video.m3.player.drm;

import defpackage.jl40;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.drm.PrepareDrm;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001!B%\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/yandex/video/m3/player/drm/PrepareDrm;", "", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "mediaDrmCallbackDelegate", "", "offlineLicenseKeyId", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "preferDrmSecurityLevel", "<init>", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;Ljava/lang/String;Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/drm/PrepareDrm$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "getMediaDrmCallbackDelegate", "()Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "Ljava/lang/String;", "getOfflineLicenseKeyId", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "getPreferDrmSecurityLevel", "()Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PrepareDrm {
    public static final int $stable = 8;
    private final MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
    private final String offlineLicenseKeyId;
    private final DrmSecurityLevel preferDrmSecurityLevel;

    private PrepareDrm(MediaDrmCallbackDelegate mediaDrmCallbackDelegate, String str, DrmSecurityLevel drmSecurityLevel) {
        this.mediaDrmCallbackDelegate = mediaDrmCallbackDelegate;
        this.offlineLicenseKeyId = str;
        this.preferDrmSecurityLevel = drmSecurityLevel;
    }

    public static /* synthetic */ PrepareDrm copy$default(PrepareDrm prepareDrm, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.drm.PrepareDrm$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PrepareDrm.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PrepareDrm.Builder builder) {
                }
            };
        }
        return prepareDrm.copy(tlsVar);
    }

    public final PrepareDrm copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!PrepareDrm.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        PrepareDrm prepareDrm = (PrepareDrm) other;
        return jl40.l(this.mediaDrmCallbackDelegate, prepareDrm.mediaDrmCallbackDelegate) && jl40.l(this.offlineLicenseKeyId, prepareDrm.offlineLicenseKeyId) && this.preferDrmSecurityLevel == prepareDrm.preferDrmSecurityLevel;
    }

    public final MediaDrmCallbackDelegate getMediaDrmCallbackDelegate() {
        return this.mediaDrmCallbackDelegate;
    }

    public final String getOfflineLicenseKeyId() {
        return this.offlineLicenseKeyId;
    }

    public final DrmSecurityLevel getPreferDrmSecurityLevel() {
        return this.preferDrmSecurityLevel;
    }

    public int hashCode() {
        MediaDrmCallbackDelegate mediaDrmCallbackDelegate = this.mediaDrmCallbackDelegate;
        int hashCode = (mediaDrmCallbackDelegate != null ? mediaDrmCallbackDelegate.hashCode() : 0) * 31;
        String str = this.offlineLicenseKeyId;
        return this.preferDrmSecurityLevel.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PrepareDrm(mediaDrmCallbackDelegate=" + this.mediaDrmCallbackDelegate + ", offlineLicenseKeyId=" + this.offlineLicenseKeyId + ", preferDrmSecurityLevel=" + this.preferDrmSecurityLevel + ')';
    }

    public /* synthetic */ PrepareDrm(MediaDrmCallbackDelegate mediaDrmCallbackDelegate, String str, DrmSecurityLevel drmSecurityLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(mediaDrmCallbackDelegate, str, drmSecurityLevel);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/drm/PrepareDrm$Builder;", "", "prepareDrm", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "(Lru/yandex/video/m3/player/drm/PrepareDrm;)V", "()V", "mediaDrmCallbackDelegate", "Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "getMediaDrmCallbackDelegate", "()Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;", "setMediaDrmCallbackDelegate", "(Lru/yandex/video/m3/player/drm/MediaDrmCallbackDelegate;)V", "offlineLicenseKeyId", "", "getOfflineLicenseKeyId", "()Ljava/lang/String;", "setOfflineLicenseKeyId", "(Ljava/lang/String;)V", "preferDrmSecurityLevel", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "getPreferDrmSecurityLevel", "()Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "setPreferDrmSecurityLevel", "(Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private MediaDrmCallbackDelegate mediaDrmCallbackDelegate;
        private String offlineLicenseKeyId;
        private DrmSecurityLevel preferDrmSecurityLevel;

        public Builder(PrepareDrm prepareDrm) {
            this();
            this.mediaDrmCallbackDelegate = prepareDrm.getMediaDrmCallbackDelegate();
            this.offlineLicenseKeyId = prepareDrm.getOfflineLicenseKeyId();
            this.preferDrmSecurityLevel = prepareDrm.getPreferDrmSecurityLevel();
        }

        public final PrepareDrm build$video_player_internalRelease() {
            MediaDrmCallbackDelegate mediaDrmCallbackDelegate = this.mediaDrmCallbackDelegate;
            String str = this.offlineLicenseKeyId;
            DrmSecurityLevel drmSecurityLevel = this.preferDrmSecurityLevel;
            if (drmSecurityLevel == null) {
                drmSecurityLevel = DrmSecurityLevel.Default;
            }
            return new PrepareDrm(mediaDrmCallbackDelegate, str, drmSecurityLevel, null);
        }

        public final MediaDrmCallbackDelegate getMediaDrmCallbackDelegate() {
            return this.mediaDrmCallbackDelegate;
        }

        public final String getOfflineLicenseKeyId() {
            return this.offlineLicenseKeyId;
        }

        public final DrmSecurityLevel getPreferDrmSecurityLevel() {
            return this.preferDrmSecurityLevel;
        }

        public final void setMediaDrmCallbackDelegate(MediaDrmCallbackDelegate mediaDrmCallbackDelegate) {
            this.mediaDrmCallbackDelegate = mediaDrmCallbackDelegate;
        }

        public final void setOfflineLicenseKeyId(String str) {
            this.offlineLicenseKeyId = str;
        }

        public final void setPreferDrmSecurityLevel(DrmSecurityLevel drmSecurityLevel) {
            this.preferDrmSecurityLevel = drmSecurityLevel;
        }

        public Builder() {
        }
    }
}
