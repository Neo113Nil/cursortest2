package ru.yandex.video.m3.model.config.mediasource;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.eta;
import defpackage.ouj;
import defpackage.sdg;
import defpackage.tlm;
import defpackage.vsf;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00002\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "", "", "isLowLatency", "", "targetOffsetMs", "minTargetOffsetMs", "maxTargetOffsetMs", "", "minPlaybackSpeed", "maxPlaybackSpeed", "<init>", "(ZJJJFF)V", "Lkotlin/Function1;", "Lsdg;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/model/config/mediasource/LivePlaybackConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "()Z", "J", "getTargetOffsetMs", "()J", "getMinTargetOffsetMs", "getMaxTargetOffsetMs", "F", "getMinPlaybackSpeed", "()F", "getMaxPlaybackSpeed", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class LivePlaybackConfig {
    public static final int $stable = 0;
    private final boolean isLowLatency;
    private final float maxPlaybackSpeed;
    private final long maxTargetOffsetMs;
    private final float minPlaybackSpeed;
    private final long minTargetOffsetMs;
    private final long targetOffsetMs;

    private LivePlaybackConfig(boolean z, long j, long j2, long j3, float f, float f2) {
        this.isLowLatency = z;
        this.targetOffsetMs = j;
        this.minTargetOffsetMs = j2;
        this.maxTargetOffsetMs = j3;
        this.minPlaybackSpeed = f;
        this.maxPlaybackSpeed = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LivePlaybackConfig copy$default(LivePlaybackConfig livePlaybackConfig, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = vsf.A;
        }
        return livePlaybackConfig.copy(function1);
    }

    @NotNull
    public final LivePlaybackConfig copy(@NotNull Function1<? super sdg, Unit> builderAction) {
        builderAction.getClass();
        sdg sdgVar = new sdg();
        sdgVar.a = Boolean.valueOf(getIsLowLatency());
        sdgVar.b = Long.valueOf(getTargetOffsetMs());
        sdgVar.c = Long.valueOf(getMinTargetOffsetMs());
        sdgVar.d = Long.valueOf(getMaxTargetOffsetMs());
        sdgVar.e = Float.valueOf(getMinPlaybackSpeed());
        sdgVar.f = Float.valueOf(getMaxPlaybackSpeed());
        builderAction.invoke(sdgVar);
        return sdgVar.a();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LivePlaybackConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        LivePlaybackConfig livePlaybackConfig = (LivePlaybackConfig) other;
        return this.isLowLatency == livePlaybackConfig.isLowLatency && this.targetOffsetMs == livePlaybackConfig.targetOffsetMs && this.minTargetOffsetMs == livePlaybackConfig.minTargetOffsetMs && this.maxTargetOffsetMs == livePlaybackConfig.maxTargetOffsetMs && this.minPlaybackSpeed == livePlaybackConfig.minPlaybackSpeed && this.maxPlaybackSpeed == livePlaybackConfig.maxPlaybackSpeed;
    }

    public final float getMaxPlaybackSpeed() {
        return this.maxPlaybackSpeed;
    }

    public final long getMaxTargetOffsetMs() {
        return this.maxTargetOffsetMs;
    }

    public final float getMinPlaybackSpeed() {
        return this.minPlaybackSpeed;
    }

    public final long getMinTargetOffsetMs() {
        return this.minTargetOffsetMs;
    }

    public final long getTargetOffsetMs() {
        return this.targetOffsetMs;
    }

    public int hashCode() {
        return Float.hashCode(this.maxPlaybackSpeed) + eta.a(tlm.c(this.maxTargetOffsetMs, tlm.c(this.minTargetOffsetMs, tlm.c(this.targetOffsetMs, Boolean.hashCode(this.isLowLatency) * 31, 31), 31), 31), this.minPlaybackSpeed, 31);
    }

    /* renamed from: isLowLatency, reason: from getter */
    public final boolean getIsLowLatency() {
        return this.isLowLatency;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LivePlaybackConfig(isLowLatency=");
        sb.append(this.isLowLatency);
        sb.append(", targetOffsetMs=");
        sb.append(this.targetOffsetMs);
        sb.append(", minTargetOffsetMs=");
        sb.append(this.minTargetOffsetMs);
        sb.append(", maxTargetOffsetMs=");
        sb.append(this.maxTargetOffsetMs);
        sb.append(", minPlaybackSpeed=");
        sb.append(this.minPlaybackSpeed);
        sb.append(", maxPlaybackSpeed=");
        return ouj.p(sb, this.maxPlaybackSpeed, ')');
    }

    public /* synthetic */ LivePlaybackConfig(boolean z, long j, long j2, long j3, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, j2, j3, f, f2);
    }
}
