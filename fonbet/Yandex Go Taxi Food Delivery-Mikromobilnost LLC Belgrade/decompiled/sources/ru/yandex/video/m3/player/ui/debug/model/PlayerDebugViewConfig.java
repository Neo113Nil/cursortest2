package ru.yandex.video.m3.player.ui.debug.model;

import defpackage.jl40;
import defpackage.sty0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "", "Lsty0;", "fontSize", "<init>", "(Lsty0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig$Builder;", "Lzy11;", "builderAction", "copy", "(Ltls;)Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lsty0;", "getFontSize-U3a4LBI", "()Lsty0;", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerDebugViewConfig {
    public static final int $stable = 0;
    private final sty0 fontSize;

    private PlayerDebugViewConfig(sty0 sty0Var) {
        this.fontSize = sty0Var;
    }

    public static /* synthetic */ PlayerDebugViewConfig copy$default(PlayerDebugViewConfig playerDebugViewConfig, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.ui.debug.model.PlayerDebugViewConfig$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PlayerDebugViewConfig.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(PlayerDebugViewConfig.Builder builder) {
                }
            };
        }
        return playerDebugViewConfig.copy(tlsVar);
    }

    public final PlayerDebugViewConfig copy(tls builderAction) {
        Builder builder = new Builder();
        builder.m864setFontSizeqXeDRgA(this.fontSize);
        builderAction.invoke(builder);
        return builder.build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (PlayerDebugViewConfig.class.equals(other != null ? other.getClass() : null)) {
            return jl40.l(this.fontSize, ((PlayerDebugViewConfig) other).fontSize);
        }
        return false;
    }

    /* renamed from: getFontSize-U3a4LBI, reason: not valid java name and from getter */
    public final sty0 getFontSize() {
        return this.fontSize;
    }

    public int hashCode() {
        sty0 sty0Var = this.fontSize;
        if (sty0Var != null) {
            return Long.hashCode(sty0Var.a);
        }
        return 0;
    }

    public String toString() {
        return "PlayerDebugViewConfig(fontSize=" + this.fontSize + ')';
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR4\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0006\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig$Builder;", "", "<init>", "()V", "Lsty0;", "fontSize", "setFontSize-qXeDRgA", "(Lsty0;)Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig$Builder;", "setFontSize", "Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "build", "()Lru/yandex/video/m3/player/ui/debug/model/PlayerDebugViewConfig;", "<set-?>", "Lsty0;", "getFontSize-U3a4LBI", "()Lsty0;", "(Lsty0;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private sty0 fontSize;

        public final PlayerDebugViewConfig build() {
            return new PlayerDebugViewConfig(this.fontSize, null);
        }

        /* renamed from: getFontSize-U3a4LBI, reason: not valid java name and from getter */
        public final sty0 getFontSize() {
            return this.fontSize;
        }

        /* renamed from: setFontSize-qXeDRgA, reason: not valid java name */
        public final /* synthetic */ void m864setFontSizeqXeDRgA(sty0 sty0Var) {
            this.fontSize = sty0Var;
        }

        /* renamed from: setFontSize-qXeDRgA, reason: not valid java name */
        public final Builder m863setFontSizeqXeDRgA(sty0 fontSize) {
            this.fontSize = fontSize;
            return this;
        }
    }

    public /* synthetic */ PlayerDebugViewConfig(sty0 sty0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(sty0Var);
    }
}
