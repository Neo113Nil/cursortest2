package ru.yandex.video.m3.ab.config;

import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.ab.config.internal.InternalAbFlags;
import ru.yandex.video.m3.ab.validation.AbValidationResult;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006#"}, d2 = {"Lru/yandex/video/m3/ab/config/AbConfig;", "", Constants.KEY_SERVICE, "", "abConfigWithMeta", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "(Ljava/lang/String;Lru/yandex/video/m3/ab/config/AbConfigWithMeta;)V", "experimentValidationResult", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "getExperimentValidationResult", "()Lru/yandex/video/m3/ab/validation/AbValidationResult;", "featureToggleValidationResult", "getFeatureToggleValidationResult", "flags", "Lru/yandex/video/m3/ab/config/AbFlags;", "getFlags", "()Lru/yandex/video/m3/ab/config/AbFlags;", "rawFlags", "Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "getRawFlags", "()Lru/yandex/video/m3/ab/config/internal/InternalAbFlags;", "slots", "getSlots", "()Ljava/lang/String;", "testIds", "", "", "getTestIds", "()Ljava/util/List;", "equals", "", "other", "hashCode", "toString", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbConfig {
    private final AbValidationResult experimentValidationResult;
    private final AbValidationResult featureToggleValidationResult;
    private final AbFlags flags;
    private final InternalAbFlags rawFlags;
    private final String slots;
    private final List<Integer> testIds;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final AbConfig DEFAULT = UtilKt.toPublic(AbConfigWithMeta.INSTANCE.getDEFAULT(), "default");

    public AbConfig(String str, AbConfigWithMeta abConfigWithMeta) {
        this.testIds = abConfigWithMeta.getInternalAbConfig().getTestIds();
        this.flags = UtilKt.toPublic(abConfigWithMeta.getInternalAbConfig().getFlags(), str);
        this.slots = abConfigWithMeta.getInternalAbConfig().getSlots();
        this.experimentValidationResult = abConfigWithMeta.getExperimentValidationResult();
        this.featureToggleValidationResult = abConfigWithMeta.getFeatureToggleValidationResult();
        this.rawFlags = abConfigWithMeta.getInternalAbConfig().getFlags();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!AbConfig.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AbConfig abConfig = (AbConfig) other;
        return jl40.l(this.testIds, abConfig.testIds) && jl40.l(this.flags, abConfig.flags) && jl40.l(this.slots, abConfig.slots) && jl40.l(this.experimentValidationResult, abConfig.experimentValidationResult) && jl40.l(this.featureToggleValidationResult, abConfig.featureToggleValidationResult) && jl40.l(this.rawFlags, abConfig.rawFlags);
    }

    public final AbValidationResult getExperimentValidationResult() {
        return this.experimentValidationResult;
    }

    public final AbValidationResult getFeatureToggleValidationResult() {
        return this.featureToggleValidationResult;
    }

    public final AbFlags getFlags() {
        return this.flags;
    }

    public final InternalAbFlags getRawFlags() {
        return this.rawFlags;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }

    public int hashCode() {
        return this.rawFlags.hashCode() + ((this.featureToggleValidationResult.hashCode() + ((this.experimentValidationResult.hashCode() + unr0.b((this.flags.hashCode() + (this.testIds.hashCode() * 31)) * 31, 31, this.slots)) * 31)) * 31);
    }

    public String toString() {
        return "AbConfig(testIds=" + this.testIds + ", flags=" + this.flags + ", slots='" + this.slots + "', experimentValidationResult=" + this.experimentValidationResult + ", featureToggleValidationResult=" + this.featureToggleValidationResult + ", rawFlags=" + this.rawFlags + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ab/config/AbConfig$Companion;", "", "()V", "DEFAULT", "Lru/yandex/video/m3/ab/config/AbConfig;", "getDEFAULT$video_player_internalRelease", "()Lru/yandex/video/m3/ab/config/AbConfig;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbConfig getDEFAULT$video_player_internalRelease() {
            return AbConfig.DEFAULT;
        }

        private Companion() {
        }
    }
}
