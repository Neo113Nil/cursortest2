package ru.yandex.video.m3.player.impl.utils;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.impl.utils.AppInfo;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/AppInfo;", "", "", "applicationId", "appVersionName", "", "appVersionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/utils/AppInfo$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/utils/AppInfo;", "Ljava/lang/String;", "getApplicationId", "()Ljava/lang/String;", "getAppVersionName", "J", "getAppVersionCode", "()J", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppInfo {
    public static final int $stable = 0;
    private final long appVersionCode;
    private final String appVersionName;
    private final String applicationId;

    private AppInfo(String str, String str2, long j) {
        this.applicationId = str;
        this.appVersionName = str2;
        this.appVersionCode = j;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.utils.AppInfo$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AppInfo.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AppInfo.Builder builder) {
                }
            };
        }
        return appInfo.copy(tlsVar);
    }

    public final AppInfo copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public final long getAppVersionCode() {
        return this.appVersionCode;
    }

    public final String getAppVersionName() {
        return this.appVersionName;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public /* synthetic */ AppInfo(String str, String str2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\r\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/AppInfo$Builder;", "", "appInfo", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "(Lru/yandex/video/m3/player/impl/utils/AppInfo;)V", "applicationId", "", "appVersionName", "appVersionCode", "", "(Ljava/lang/String;Ljava/lang/String;J)V", "getAppVersionCode", "()J", "setAppVersionCode", "(J)V", "getAppVersionName", "()Ljava/lang/String;", "setAppVersionName", "(Ljava/lang/String;)V", "getApplicationId", "setApplicationId", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private long appVersionCode;
        private String appVersionName;
        private String applicationId;

        public Builder(AppInfo appInfo) {
            this(appInfo.getApplicationId(), appInfo.getAppVersionName(), appInfo.getAppVersionCode());
        }

        public final AppInfo build$video_player_internalRelease() {
            return new AppInfo(this.applicationId, this.appVersionName, this.appVersionCode, null);
        }

        public final long getAppVersionCode() {
            return this.appVersionCode;
        }

        public final String getAppVersionName() {
            return this.appVersionName;
        }

        public final String getApplicationId() {
            return this.applicationId;
        }

        public final void setAppVersionCode(long j) {
            this.appVersionCode = j;
        }

        public final void setAppVersionName(String str) {
            this.appVersionName = str;
        }

        public final void setApplicationId(String str) {
            this.applicationId = str;
        }

        public Builder(String str, String str2, long j) {
            this.applicationId = str;
            this.appVersionName = str2;
            this.appVersionCode = j;
        }
    }
}
