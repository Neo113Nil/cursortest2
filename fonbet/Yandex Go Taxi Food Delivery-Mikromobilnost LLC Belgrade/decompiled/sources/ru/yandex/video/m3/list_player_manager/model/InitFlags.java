package ru.yandex.video.m3.list_player_manager.model;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.rbx;
import defpackage.sbx;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;

@gsq0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/InitFlags;", "", "", "blurHashOnOtherThread", "<init>", "(Z)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IZLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/list_player_manager/model/InitFlags;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "copy", "(Z)Lru/yandex/video/m3/list_player_manager/model/InitFlags;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBlurHashOnOtherThread", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InitFlags {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "InitFlags";
    private final boolean blurHashOnOtherThread;

    @jxi
    public /* synthetic */ InitFlags(int i, boolean z, psq0 psq0Var) {
        if ((i & 1) == 0) {
            this.blurHashOnOtherThread = false;
        } else {
            this.blurHashOnOtherThread = z;
        }
    }

    public static /* synthetic */ InitFlags copy$default(InitFlags initFlags, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = initFlags.blurHashOnOtherThread;
        }
        return initFlags.copy(z);
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(InitFlags self, yjd output, SerialDescriptor serialDesc) {
        if (output.F() || self.blurHashOnOtherThread) {
            output.n(serialDesc, 0, self.blurHashOnOtherThread);
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getBlurHashOnOtherThread() {
        return this.blurHashOnOtherThread;
    }

    public final InitFlags copy(boolean blurHashOnOtherThread) {
        return new InitFlags(blurHashOnOtherThread);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InitFlags) && this.blurHashOnOtherThread == ((InitFlags) other).blurHashOnOtherThread;
    }

    public final boolean getBlurHashOnOtherThread() {
        return this.blurHashOnOtherThread;
    }

    public int hashCode() {
        return Boolean.hashCode(this.blurHashOnOtherThread);
    }

    public String toString() {
        return unr0.u(new StringBuilder("InitFlags(blurHashOnOtherThread="), this.blurHashOnOtherThread, ')');
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/yandex/video/m3/list_player_manager/model/InitFlags$Companion;", "", "()V", "TAG", "", "fromJsonOrDefault", "Lru/yandex/video/m3/list_player_manager/model/InitFlags;", "json", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "serializer", "Lkotlinx/serialization/KSerializer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ InitFlags fromJsonOrDefault$default(Companion companion, String str, PlayerLogger playerLogger, int i, Object obj) {
            if ((i & 2) != 0) {
                playerLogger = null;
            }
            return companion.fromJsonOrDefault(str, playerLogger);
        }

        public final InitFlags fromJsonOrDefault(String json2, PlayerLogger playerLogger) {
            Object failure;
            try {
                rbx rbxVar = sbx.d;
                rbxVar.getClass();
                failure = (InitFlags) rbxVar.b(InitFlags.INSTANCE.serializer(), json2);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            boolean z = false;
            if (a != null && playerLogger != null && PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                PlayerLogger.error$default(playerLogger, InitFlags.TAG, "fromJsonOrDefault", g8e.s(a, new StringBuilder("Failed to parse flags: ")), null, new Object[0], 8, null);
            }
            InitFlags initFlags = new InitFlags(z, 1, (DefaultConstructorMarker) null);
            if (failure instanceof Result.Failure) {
                failure = initFlags;
            }
            return (InitFlags) failure;
        }

        public final KSerializer serializer() {
            return InitFlags$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public InitFlags() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public InitFlags(boolean z) {
        this.blurHashOnOtherThread = z;
    }

    public /* synthetic */ InitFlags(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
