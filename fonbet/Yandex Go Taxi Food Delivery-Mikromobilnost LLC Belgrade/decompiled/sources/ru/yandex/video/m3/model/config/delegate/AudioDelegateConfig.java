package ru.yandex.video.m3.model.config.delegate;

import defpackage.tls;
import defpackage.unr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.video.m3.model.config.delegate.AudioDelegateConfig;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "", "", "audioBecomingNoisy", "automaticallyHandleAudioFocus", "<init>", "(ZZ)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getAudioBecomingNoisy", "()Z", "getAutomaticallyHandleAudioFocus", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AudioDelegateConfig {
    public static final int $stable = 0;
    private final boolean audioBecomingNoisy;
    private final boolean automaticallyHandleAudioFocus;

    private AudioDelegateConfig(boolean z, boolean z2) {
        this.audioBecomingNoisy = z;
        this.automaticallyHandleAudioFocus = z2;
    }

    public static /* synthetic */ AudioDelegateConfig copy$default(AudioDelegateConfig audioDelegateConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.model.config.delegate.AudioDelegateConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AudioDelegateConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(AudioDelegateConfig.Builder builder) {
                }
            };
        }
        return audioDelegateConfig.copy(tlsVar);
    }

    public final AudioDelegateConfig copy(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AudioDelegateConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AudioDelegateConfig audioDelegateConfig = (AudioDelegateConfig) other;
        return this.audioBecomingNoisy == audioDelegateConfig.audioBecomingNoisy && this.automaticallyHandleAudioFocus == audioDelegateConfig.automaticallyHandleAudioFocus;
    }

    public final boolean getAudioBecomingNoisy() {
        return this.audioBecomingNoisy;
    }

    public final boolean getAutomaticallyHandleAudioFocus() {
        return this.automaticallyHandleAudioFocus;
    }

    public int hashCode() {
        return Boolean.hashCode(this.automaticallyHandleAudioFocus) + (Boolean.hashCode(this.audioBecomingNoisy) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioDelegateConfig(audioBecomingNoisy=");
        sb.append(this.audioBecomingNoisy);
        sb.append(", automaticallyHandleAudioFocus=");
        return unr0.u(sb, this.automaticallyHandleAudioFocus, ')');
    }

    public /* synthetic */ AudioDelegateConfig(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0000¢\u0006\u0002\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig$Builder;", "", ConfigConstants.CONFIG, "Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;", "(Lru/yandex/video/m3/model/config/delegate/AudioDelegateConfig;)V", "()V", "audioBecomingNoisy", "", "getAudioBecomingNoisy", "()Ljava/lang/Boolean;", "setAudioBecomingNoisy", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "automaticallyHandleAudioFocus", "getAutomaticallyHandleAudioFocus", "setAutomaticallyHandleAudioFocus", "build", "build$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private Boolean audioBecomingNoisy;
        private Boolean automaticallyHandleAudioFocus;

        public Builder(AudioDelegateConfig audioDelegateConfig) {
            this();
            this.audioBecomingNoisy = Boolean.valueOf(audioDelegateConfig.getAudioBecomingNoisy());
            this.automaticallyHandleAudioFocus = Boolean.valueOf(audioDelegateConfig.getAutomaticallyHandleAudioFocus());
        }

        public final AudioDelegateConfig build$video_player_internalRelease() {
            Boolean bool = this.audioBecomingNoisy;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.automaticallyHandleAudioFocus;
            return new AudioDelegateConfig(booleanValue, bool2 != null ? bool2.booleanValue() : true, null);
        }

        public final Boolean getAudioBecomingNoisy() {
            return this.audioBecomingNoisy;
        }

        public final Boolean getAutomaticallyHandleAudioFocus() {
            return this.automaticallyHandleAudioFocus;
        }

        public final void setAudioBecomingNoisy(Boolean bool) {
            this.audioBecomingNoisy = bool;
        }

        public final void setAutomaticallyHandleAudioFocus(Boolean bool) {
            this.automaticallyHandleAudioFocus = bool;
        }

        public Builder() {
        }
    }
}
