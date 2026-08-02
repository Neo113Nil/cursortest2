package ru.yandex.video.m3.data;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.jx9;
import defpackage.tqa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.video.m3.ott.data.dto.drm.DrmConfig;
import ru.yandex.video.m3.player.drm.DrmSecurityLevel;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u00002\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/data/DrmParameters;", "", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "drmConfig", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "drmSecurityLevel", "<init>", "(Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;Lru/yandex/video/m3/player/drm/DrmSecurityLevel;)V", "Lkotlin/Function1;", "Ltqa;", "", "builderAction", "copy", "(Lkotlin/jvm/functions/Function1;)Lru/yandex/video/m3/data/DrmParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "getDrmConfig", "()Lru/yandex/video/m3/ott/data/dto/drm/DrmConfig;", "Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "getDrmSecurityLevel", "()Lru/yandex/video/m3/player/drm/DrmSecurityLevel;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class DrmParameters {
    public static final int $stable = 0;

    @NotNull
    private final DrmConfig drmConfig;

    @NotNull
    private final DrmSecurityLevel drmSecurityLevel;

    private DrmParameters(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel) {
        this.drmConfig = drmConfig;
        this.drmSecurityLevel = drmSecurityLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DrmParameters copy$default(DrmParameters drmParameters, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = jx9.G;
        }
        return drmParameters.copy(function1);
    }

    @NotNull
    public final DrmParameters copy(@NotNull Function1<? super tqa, Unit> builderAction) {
        builderAction.getClass();
        DrmConfig drmConfig = getDrmConfig();
        DrmSecurityLevel drmSecurityLevel = getDrmSecurityLevel();
        drmConfig.getClass();
        drmSecurityLevel.getClass();
        builderAction.invoke(new tqa());
        return new DrmParameters(drmConfig, drmSecurityLevel, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!DrmParameters.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        DrmParameters drmParameters = (DrmParameters) other;
        return Intrinsics.d(this.drmConfig, drmParameters.drmConfig) && this.drmSecurityLevel == drmParameters.drmSecurityLevel;
    }

    @NotNull
    public final DrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    @NotNull
    public final DrmSecurityLevel getDrmSecurityLevel() {
        return this.drmSecurityLevel;
    }

    public int hashCode() {
        return this.drmSecurityLevel.hashCode() + (this.drmConfig.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DrmParameters(drmConfig=" + this.drmConfig + ", drmSecurityLevel=" + this.drmSecurityLevel + ')';
    }

    public /* synthetic */ DrmParameters(DrmConfig drmConfig, DrmSecurityLevel drmSecurityLevel, DefaultConstructorMarker defaultConstructorMarker) {
        this(drmConfig, drmSecurityLevel);
    }
}
