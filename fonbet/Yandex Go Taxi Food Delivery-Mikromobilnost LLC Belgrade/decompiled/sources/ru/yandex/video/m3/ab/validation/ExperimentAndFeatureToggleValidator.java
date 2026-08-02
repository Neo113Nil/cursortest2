package ru.yandex.video.m3.ab.validation;

import kotlin.Metadata;
import kotlin.collections.a;
import ru.yandex.video.m3.ab.config.internal.InternalAbConfig;
import ru.yandex.video.m3.ab.validation.AbValidationResult;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/ab/validation/ExperimentAndFeatureToggleValidator;", "", "()V", "validateExperiments", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "internalAbConfig", "Lru/yandex/video/m3/ab/config/internal/InternalAbConfig;", "validateExperiments$video_player_internalRelease", "validateFeatureToggle", "validateFeatureToggle$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExperimentAndFeatureToggleValidator {
    public static final int $stable = 0;
    public static final ExperimentAndFeatureToggleValidator INSTANCE = new ExperimentAndFeatureToggleValidator();

    private ExperimentAndFeatureToggleValidator() {
    }

    public final AbValidationResult validateExperiments$video_player_internalRelease(InternalAbConfig internalAbConfig) {
        Integer androidExperimentCheckerTestid = internalAbConfig.getFlags().getAndroidExperimentCheckerTestid();
        boolean z = androidExperimentCheckerTestid != null;
        boolean isEmpty = internalAbConfig.getTestIds().isEmpty();
        AbValidationType abValidationType = AbValidationType.Experiment;
        return (z || !isEmpty) ? (z || isEmpty) ? (!z || a.G(internalAbConfig.getTestIds(), androidExperimentCheckerTestid)) ? new AbValidationResult.Success(abValidationType) : new AbValidationResult.NoTargetSlot(abValidationType) : new AbValidationResult.NoFlag(abValidationType) : new AbValidationResult.NoFlagNoSlots(abValidationType);
    }

    public final AbValidationResult validateFeatureToggle$video_player_internalRelease(InternalAbConfig internalAbConfig) {
        Integer androidFeatureToggleCheckerTestid = internalAbConfig.getFlags().getAndroidFeatureToggleCheckerTestid();
        boolean z = androidFeatureToggleCheckerTestid != null;
        boolean isEmpty = internalAbConfig.getTestIds().isEmpty();
        AbValidationType abValidationType = AbValidationType.FeatureToggle;
        return (z || !isEmpty) ? (z || isEmpty) ? (!z || a.G(internalAbConfig.getTestIds(), androidFeatureToggleCheckerTestid)) ? new AbValidationResult.Success(abValidationType) : new AbValidationResult.NoTargetSlot(abValidationType) : new AbValidationResult.NoFlag(abValidationType) : new AbValidationResult.NoFlagNoSlots(abValidationType);
    }
}
