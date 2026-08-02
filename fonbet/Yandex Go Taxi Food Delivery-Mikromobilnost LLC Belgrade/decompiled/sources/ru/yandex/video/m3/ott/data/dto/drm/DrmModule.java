package ru.yandex.video.m3.ott.data.dto.drm;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ott.data.dto.drm.DrmModule;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmModule;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "", "licenseKeyId", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmModule$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/ott/data/dto/drm/DrmModule;", "Ljava/lang/String;", "getLicenseKeyId", "()Ljava/lang/String;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DrmModule extends DrmConfig {
    public static final int $stable = 0;
    private final String licenseKeyId;

    private DrmModule(String str) {
        super(null);
        this.licenseKeyId = str;
    }

    public static /* synthetic */ DrmModule copy$default(DrmModule drmModule, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.ott.data.dto.drm.DrmModule$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DrmModule.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DrmModule.Builder builder) {
                }
            };
        }
        return drmModule.copy(tlsVar);
    }

    public final DrmModule copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final String getLicenseKeyId() {
        return this.licenseKeyId;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/ott/data/dto/drm/DrmModule$Builder;", "", "drmModule", "Lru/yandex/video/m3/ott/data/dto/drm/DrmModule;", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmModule;)V", "licenseKeyId", "", "(Ljava/lang/String;)V", "getLicenseKeyId", "()Ljava/lang/String;", "setLicenseKeyId", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String licenseKeyId;

        public Builder(DrmModule drmModule) {
            this(drmModule.getLicenseKeyId());
        }

        public final DrmModule build$video_player_internalRelease() {
            return new DrmModule(this.licenseKeyId, null);
        }

        public final String getLicenseKeyId() {
            return this.licenseKeyId;
        }

        public final void setLicenseKeyId(String str) {
            this.licenseKeyId = str;
        }

        public Builder(String str) {
            this.licenseKeyId = str;
        }
    }

    public /* synthetic */ DrmModule(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
