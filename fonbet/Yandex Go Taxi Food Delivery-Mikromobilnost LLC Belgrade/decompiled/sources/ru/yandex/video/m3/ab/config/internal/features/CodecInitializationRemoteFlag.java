package ru.yandex.video.m3.ab.config.internal.features;

import defpackage.gsq0;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.unr0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@gsq0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0001\u0018\u0000 *2\u00020\u0001:\u0002+*B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010 \u0012\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010\"R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b'\u0010\u001f\u001a\u0004\b%\u0010&R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u0012\u0004\b)\u0010\u001f\u001a\u0004\b(\u0010\u001d¨\u0006,"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "", "", "shouldTryInitCodecsWithRetries", "", "retriesCount", "", "timeoutMs", "useIncrementalCodecInitTimeout", "<init>", "(ZIJZ)V", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IZIJZLpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "Z", "getShouldTryInitCodecsWithRetries", "()Z", "getShouldTryInitCodecsWithRetries$annotations", "()V", CA20Status.STATUS_USER_I, "getRetriesCount", "()I", "getRetriesCount$annotations", "J", "getTimeoutMs", "()J", "getTimeoutMs$annotations", "getUseIncrementalCodecInitTimeout", "getUseIncrementalCodecInitTimeout$annotations", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecInitializationRemoteFlag {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int retriesCount;
    private final boolean shouldTryInitCodecsWithRetries;
    private final long timeoutMs;
    private final boolean useIncrementalCodecInitTimeout;

    @jxi
    public /* synthetic */ CodecInitializationRemoteFlag(int i, boolean z, int i2, long j, boolean z2, psq0 psq0Var) {
        this.shouldTryInitCodecsWithRetries = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.retriesCount = 3;
        } else {
            this.retriesCount = i2;
        }
        if ((i & 4) == 0) {
            this.timeoutMs = 50L;
        } else {
            this.timeoutMs = j;
        }
        if ((i & 8) == 0) {
            this.useIncrementalCodecInitTimeout = false;
        } else {
            this.useIncrementalCodecInitTimeout = z2;
        }
    }

    public static /* synthetic */ void getRetriesCount$annotations() {
    }

    public static /* synthetic */ void getShouldTryInitCodecsWithRetries$annotations() {
    }

    public static /* synthetic */ void getTimeoutMs$annotations() {
    }

    public static /* synthetic */ void getUseIncrementalCodecInitTimeout$annotations() {
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(CodecInitializationRemoteFlag self, yjd output, SerialDescriptor serialDesc) {
        if (output.F() || !self.shouldTryInitCodecsWithRetries) {
            output.n(serialDesc, 0, self.shouldTryInitCodecsWithRetries);
        }
        if (output.F() || self.retriesCount != 3) {
            output.A(1, self.retriesCount, serialDesc);
        }
        if (output.F() || self.timeoutMs != 50) {
            output.s(serialDesc, 2, self.timeoutMs);
        }
        if (output.F() || self.useIncrementalCodecInitTimeout) {
            output.n(serialDesc, 3, self.useIncrementalCodecInitTimeout);
        }
    }

    public final int getRetriesCount() {
        return this.retriesCount;
    }

    public final boolean getShouldTryInitCodecsWithRetries() {
        return this.shouldTryInitCodecsWithRetries;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final boolean getUseIncrementalCodecInitTimeout() {
        return this.useIncrementalCodecInitTimeout;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CodecInitializationRemoteFlag(shouldTryInitCodecsWithRetries=");
        sb.append(this.shouldTryInitCodecsWithRetries);
        sb.append(", retriesCount=");
        sb.append(this.retriesCount);
        sb.append(", timeoutMs=");
        sb.append(this.timeoutMs);
        sb.append(", useIncrementalCodecInitTimeout=");
        return unr0.u(sb, this.useIncrementalCodecInitTimeout, ')');
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CodecInitializationRemoteFlag$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CodecInitializationRemoteFlag() {
        this(false, 0, 0L, false, 15, (DefaultConstructorMarker) null);
    }

    public CodecInitializationRemoteFlag(boolean z, int i, long j, boolean z2) {
        this.shouldTryInitCodecsWithRetries = z;
        this.retriesCount = i;
        this.timeoutMs = j;
        this.useIncrementalCodecInitTimeout = z2;
    }

    public /* synthetic */ CodecInitializationRemoteFlag(boolean z, int i, long j, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? 50L : j, (i2 & 8) != 0 ? false : z2);
    }
}
