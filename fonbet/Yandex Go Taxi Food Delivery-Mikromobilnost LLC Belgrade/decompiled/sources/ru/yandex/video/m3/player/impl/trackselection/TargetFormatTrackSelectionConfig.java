package ru.yandex.video.m3.player.impl.trackselection;

import defpackage.oyr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectionConfig;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "", "", "selectMonoBitrate", "", "degradationSteps", "<init>", "(ZI)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSelectMonoBitrate", "()Z", CA20Status.STATUS_USER_I, "getDegradationSteps", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TargetFormatTrackSelectionConfig {
    public static final int $stable = 0;
    private final int degradationSteps;
    private final boolean selectMonoBitrate;

    private TargetFormatTrackSelectionConfig(boolean z, int i) {
        this.selectMonoBitrate = z;
        this.degradationSteps = i;
    }

    public static /* synthetic */ TargetFormatTrackSelectionConfig copy$default(TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.impl.trackselection.TargetFormatTrackSelectionConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((TargetFormatTrackSelectionConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(TargetFormatTrackSelectionConfig.Builder builder) {
                }
            };
        }
        return targetFormatTrackSelectionConfig.copy(tlsVar);
    }

    public final TargetFormatTrackSelectionConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!TargetFormatTrackSelectionConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig = (TargetFormatTrackSelectionConfig) other;
        return this.selectMonoBitrate == targetFormatTrackSelectionConfig.selectMonoBitrate && this.degradationSteps == targetFormatTrackSelectionConfig.degradationSteps;
    }

    public final int getDegradationSteps() {
        return this.degradationSteps;
    }

    public final boolean getSelectMonoBitrate() {
        return this.selectMonoBitrate;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.selectMonoBitrate) * 31) + this.degradationSteps;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TargetFormatTrackSelectionConfig(expSelectMonoBitrate=");
        sb.append(this.selectMonoBitrate);
        sb.append(", expDegradationSteps=");
        return oyr.s(sb, this.degradationSteps, ')');
    }

    public /* synthetic */ TargetFormatTrackSelectionConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig$Builder;", "", "targetFormatTrackSelectionConfig", "Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;", "(Lru/yandex/video/m3/player/impl/trackselection/TargetFormatTrackSelectionConfig;)V", "()V", "degradationSteps", "", "getDegradationSteps", "()Ljava/lang/Integer;", "setDegradationSteps", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectMonoBitrate", "", "getSelectMonoBitrate", "()Ljava/lang/Boolean;", "setSelectMonoBitrate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Integer degradationSteps;
        private Boolean selectMonoBitrate;

        public Builder(TargetFormatTrackSelectionConfig targetFormatTrackSelectionConfig) {
            this();
            this.selectMonoBitrate = Boolean.valueOf(targetFormatTrackSelectionConfig.getSelectMonoBitrate());
            this.degradationSteps = Integer.valueOf(targetFormatTrackSelectionConfig.getDegradationSteps());
        }

        public final TargetFormatTrackSelectionConfig build$video_player_internalRelease() {
            Boolean bool = this.selectMonoBitrate;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Integer num = this.degradationSteps;
            return new TargetFormatTrackSelectionConfig(booleanValue, num != null ? num.intValue() : 0, null);
        }

        public final Integer getDegradationSteps() {
            return this.degradationSteps;
        }

        public final Boolean getSelectMonoBitrate() {
            return this.selectMonoBitrate;
        }

        public final void setDegradationSteps(Integer num) {
            this.degradationSteps = num;
        }

        public final void setSelectMonoBitrate(Boolean bool) {
            this.selectMonoBitrate = bool;
        }

        public Builder() {
        }
    }
}
