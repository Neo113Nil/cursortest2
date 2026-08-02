package ru.yandex.video.m3.ab.config;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.psq0;
import defpackage.yjd;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig$$serializer;
import ru.yandex.video.m3.ab.validation.AbValidationResult;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@gsq0
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002=<B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JD\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00100\u001a\u0004\b5\u0010 R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010 R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\b;\u00100\u001a\u0004\b:\u0010#¨\u0006>"}, d2 = {"Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "", "", "fetchTimestamp", "", "etag", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "experimentValidationResult", "featureToggleValidationResult", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "internalAbConfig", "<init>", "(JLjava/lang/String;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;)V", "", "seen1", "Lpsq0;", "serializationConstructorMarker", "(IJLjava/lang/String;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;Lpsq0;)V", "self", "Lyjd;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lzy11;", "write$Self$video_player_internalRelease", "(Lru/yandex/video/m3/ab/config/AbConfigWithMeta;Lyjd;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lru/yandex/video/m3/ab/validation/AbValidationResult;", "component4", "component5", "()Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "copy", "(JLjava/lang/String;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/validation/AbValidationResult;Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;)Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getFetchTimestamp", "getFetchTimestamp$annotations", "()V", "Ljava/lang/String;", "getEtag", "getEtag$annotations", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "getExperimentValidationResult", "getExperimentValidationResult$annotations", "getFeatureToggleValidationResult", "getFeatureToggleValidationResult$annotations", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "getInternalAbConfig", "getInternalAbConfig$annotations", "Companion", "$serializer", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AbConfigWithMeta {
    private static final KSerializer[] $childSerializers;
    private static final AbConfigWithMeta DEFAULT;
    private final String etag;
    private final AbValidationResult experimentValidationResult;
    private final AbValidationResult featureToggleValidationResult;
    private final long fetchTimestamp;
    private final InternalAbConfig internalAbConfig;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        AbValidationResult.Companion companion = AbValidationResult.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, companion.serializer(), companion.serializer(), null};
        DEFAULT = new AbConfigWithMeta(0L, (String) null, (AbValidationResult) null, (AbValidationResult) null, (InternalAbConfig) null, 31, (DefaultConstructorMarker) null);
    }

    @jxi
    public /* synthetic */ AbConfigWithMeta(int i, long j, String str, AbValidationResult abValidationResult, AbValidationResult abValidationResult2, InternalAbConfig internalAbConfig, psq0 psq0Var) {
        this.fetchTimestamp = (i & 1) == 0 ? -9223372036854775807L : j;
        if ((i & 2) == 0) {
            this.etag = null;
        } else {
            this.etag = str;
        }
        if ((i & 4) == 0) {
            this.experimentValidationResult = new AbValidationResult.NoFlagNoSlots(AbValidationType.Experiment);
        } else {
            this.experimentValidationResult = abValidationResult;
        }
        if ((i & 8) == 0) {
            this.featureToggleValidationResult = new AbValidationResult.NoFlagNoSlots(AbValidationType.FeatureToggle);
        } else {
            this.featureToggleValidationResult = abValidationResult2;
        }
        if ((i & 16) == 0) {
            this.internalAbConfig = InternalAbConfig.INSTANCE.getDEFAULT$video_player_internalRelease();
        } else {
            this.internalAbConfig = internalAbConfig;
        }
    }

    public static /* synthetic */ AbConfigWithMeta copy$default(AbConfigWithMeta abConfigWithMeta, long j, String str, AbValidationResult abValidationResult, AbValidationResult abValidationResult2, InternalAbConfig internalAbConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            j = abConfigWithMeta.fetchTimestamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = abConfigWithMeta.etag;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            abValidationResult = abConfigWithMeta.experimentValidationResult;
        }
        AbValidationResult abValidationResult3 = abValidationResult;
        if ((i & 8) != 0) {
            abValidationResult2 = abConfigWithMeta.featureToggleValidationResult;
        }
        AbValidationResult abValidationResult4 = abValidationResult2;
        if ((i & 16) != 0) {
            internalAbConfig = abConfigWithMeta.internalAbConfig;
        }
        return abConfigWithMeta.copy(j2, str2, abValidationResult3, abValidationResult4, internalAbConfig);
    }

    public static /* synthetic */ void getEtag$annotations() {
    }

    public static /* synthetic */ void getExperimentValidationResult$annotations() {
    }

    public static /* synthetic */ void getFeatureToggleValidationResult$annotations() {
    }

    public static /* synthetic */ void getFetchTimestamp$annotations() {
    }

    public static /* synthetic */ void getInternalAbConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self$video_player_internalRelease(AbConfigWithMeta self, yjd output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (output.F() || self.fetchTimestamp != -9223372036854775807L) {
            output.s(serialDesc, 0, self.fetchTimestamp);
        }
        if (output.F() || self.etag != null) {
            output.g(serialDesc, 1, auu0.a, self.etag);
        }
        if (output.F() || !jl40.l(self.experimentValidationResult, new AbValidationResult.NoFlagNoSlots(AbValidationType.Experiment))) {
            output.e(serialDesc, 2, kSerializerArr[2], self.experimentValidationResult);
        }
        if (output.F() || !jl40.l(self.featureToggleValidationResult, new AbValidationResult.NoFlagNoSlots(AbValidationType.FeatureToggle))) {
            output.e(serialDesc, 3, kSerializerArr[3], self.featureToggleValidationResult);
        }
        if (!output.F() && jl40.l(self.internalAbConfig, InternalAbConfig.INSTANCE.getDEFAULT$video_player_internalRelease())) {
            return;
        }
        output.e(serialDesc, 4, InternalAbConfig$$serializer.INSTANCE, self.internalAbConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFetchTimestamp() {
        return this.fetchTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEtag() {
        return this.etag;
    }

    /* renamed from: component3, reason: from getter */
    public final AbValidationResult getExperimentValidationResult() {
        return this.experimentValidationResult;
    }

    /* renamed from: component4, reason: from getter */
    public final AbValidationResult getFeatureToggleValidationResult() {
        return this.featureToggleValidationResult;
    }

    /* renamed from: component5, reason: from getter */
    public final InternalAbConfig getInternalAbConfig() {
        return this.internalAbConfig;
    }

    public final AbConfigWithMeta copy(long fetchTimestamp, String etag, AbValidationResult experimentValidationResult, AbValidationResult featureToggleValidationResult, InternalAbConfig internalAbConfig) {
        return new AbConfigWithMeta(fetchTimestamp, etag, experimentValidationResult, featureToggleValidationResult, internalAbConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbConfigWithMeta)) {
            return false;
        }
        AbConfigWithMeta abConfigWithMeta = (AbConfigWithMeta) other;
        return this.fetchTimestamp == abConfigWithMeta.fetchTimestamp && jl40.l(this.etag, abConfigWithMeta.etag) && jl40.l(this.experimentValidationResult, abConfigWithMeta.experimentValidationResult) && jl40.l(this.featureToggleValidationResult, abConfigWithMeta.featureToggleValidationResult) && jl40.l(this.internalAbConfig, abConfigWithMeta.internalAbConfig);
    }

    public final String getEtag() {
        return this.etag;
    }

    public final AbValidationResult getExperimentValidationResult() {
        return this.experimentValidationResult;
    }

    public final AbValidationResult getFeatureToggleValidationResult() {
        return this.featureToggleValidationResult;
    }

    public final long getFetchTimestamp() {
        return this.fetchTimestamp;
    }

    public final InternalAbConfig getInternalAbConfig() {
        return this.internalAbConfig;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.fetchTimestamp) * 31;
        String str = this.etag;
        return this.internalAbConfig.hashCode() + ((this.featureToggleValidationResult.hashCode() + ((this.experimentValidationResult.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AbConfigWithMeta(fetchTimestamp=" + this.fetchTimestamp + ", etag=" + this.etag + ", experimentValidationResult=" + this.experimentValidationResult + ", featureToggleValidationResult=" + this.featureToggleValidationResult + ", internalAbConfig=" + this.internalAbConfig + ')';
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ab/config/AbConfigWithMeta$Companion;", "", "()V", "DEFAULT", "Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "getDEFAULT", "()Lru/yandex/video/m3/ab/config/AbConfigWithMeta;", "serializer", "Lkotlinx/serialization/KSerializer;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbConfigWithMeta getDEFAULT() {
            return AbConfigWithMeta.DEFAULT;
        }

        public final KSerializer serializer() {
            return AbConfigWithMeta$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AbConfigWithMeta() {
        this(0L, (String) null, (AbValidationResult) null, (AbValidationResult) null, (InternalAbConfig) null, 31, (DefaultConstructorMarker) null);
    }

    public AbConfigWithMeta(long j, String str, AbValidationResult abValidationResult, AbValidationResult abValidationResult2, InternalAbConfig internalAbConfig) {
        this.fetchTimestamp = j;
        this.etag = str;
        this.experimentValidationResult = abValidationResult;
        this.featureToggleValidationResult = abValidationResult2;
        this.internalAbConfig = internalAbConfig;
    }

    public /* synthetic */ AbConfigWithMeta(long j, String str, AbValidationResult abValidationResult, AbValidationResult abValidationResult2, InternalAbConfig internalAbConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -9223372036854775807L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new AbValidationResult.NoFlagNoSlots(AbValidationType.Experiment) : abValidationResult, (i & 8) != 0 ? new AbValidationResult.NoFlagNoSlots(AbValidationType.FeatureToggle) : abValidationResult2, (i & 16) != 0 ? InternalAbConfig.INSTANCE.getDEFAULT$video_player_internalRelease() : internalAbConfig);
    }
}
