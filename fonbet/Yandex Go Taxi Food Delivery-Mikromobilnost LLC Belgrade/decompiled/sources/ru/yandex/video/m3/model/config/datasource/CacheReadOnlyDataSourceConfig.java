package ru.yandex.video.m3.model.config.datasource;

import defpackage.jxi;
import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.datasource.CacheReadOnlyDataSourceConfig;

@jxi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;", "", "", "shouldUseLogInsteadOfTimber", "<init>", "(Z)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShouldUseLogInsteadOfTimber", "()Z", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CacheReadOnlyDataSourceConfig {
    public static final int $stable = 0;
    private final boolean shouldUseLogInsteadOfTimber;

    private CacheReadOnlyDataSourceConfig(boolean z) {
        this.shouldUseLogInsteadOfTimber = z;
    }

    public static /* synthetic */ CacheReadOnlyDataSourceConfig copy$default(CacheReadOnlyDataSourceConfig cacheReadOnlyDataSourceConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.datasource.CacheReadOnlyDataSourceConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((CacheReadOnlyDataSourceConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(CacheReadOnlyDataSourceConfig.Builder builder) {
                }
            };
        }
        return cacheReadOnlyDataSourceConfig.copy(tlsVar);
    }

    public final CacheReadOnlyDataSourceConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return CacheReadOnlyDataSourceConfig.class.equals(other != null ? other.getClass() : null) && this.shouldUseLogInsteadOfTimber == ((CacheReadOnlyDataSourceConfig) other).shouldUseLogInsteadOfTimber;
    }

    public final boolean getShouldUseLogInsteadOfTimber() {
        return this.shouldUseLogInsteadOfTimber;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldUseLogInsteadOfTimber);
    }

    public String toString() {
        return unr0.u(new StringBuilder("CacheReadOnlyDataSourceConfig(shouldUseLogInsteadOfTimber="), this.shouldUseLogInsteadOfTimber, ')');
    }

    public /* synthetic */ CacheReadOnlyDataSourceConfig(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig$Builder;", "", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;", "(Lru/yandex/video/m3/model/config/datasource/CacheReadOnlyDataSourceConfig;)V", "()V", "shouldUseLogInsteadOfTimber", "", "getShouldUseLogInsteadOfTimber", "()Ljava/lang/Boolean;", "setShouldUseLogInsteadOfTimber", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean shouldUseLogInsteadOfTimber;

        public Builder(CacheReadOnlyDataSourceConfig cacheReadOnlyDataSourceConfig) {
            this();
            this.shouldUseLogInsteadOfTimber = Boolean.valueOf(cacheReadOnlyDataSourceConfig.getShouldUseLogInsteadOfTimber());
        }

        public final CacheReadOnlyDataSourceConfig build$video_player_internalRelease() {
            Boolean bool = this.shouldUseLogInsteadOfTimber;
            return new CacheReadOnlyDataSourceConfig(bool != null ? bool.booleanValue() : false, null);
        }

        public final Boolean getShouldUseLogInsteadOfTimber() {
            return this.shouldUseLogInsteadOfTimber;
        }

        public final void setShouldUseLogInsteadOfTimber(Boolean bool) {
            this.shouldUseLogInsteadOfTimber = bool;
        }

        public Builder() {
        }
    }
}
