package ru.yandex.video.m3.model.config.datasource;

import defpackage.jxi;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.datasource.DefaultDataSourceConfig;

@jxi
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;", "", "<init>", "()V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultDataSourceConfig {
    public static final int $stable = 0;

    public /* synthetic */ DefaultDataSourceConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ DefaultDataSourceConfig copy$default(DefaultDataSourceConfig defaultDataSourceConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.datasource.DefaultDataSourceConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((DefaultDataSourceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(DefaultDataSourceConfig.Builder builder) {
                }
            };
        }
        return defaultDataSourceConfig.copy(tlsVar);
    }

    public final DefaultDataSourceConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig$Builder;", "", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;", "(Lru/yandex/video/m3/model/config/datasource/DefaultDataSourceConfig;)V", "()V", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 0;

        public Builder() {
        }

        public final DefaultDataSourceConfig build$video_player_internalRelease() {
            return new DefaultDataSourceConfig(null);
        }

        public Builder(DefaultDataSourceConfig defaultDataSourceConfig) {
            this();
        }
    }

    private DefaultDataSourceConfig() {
    }
}
