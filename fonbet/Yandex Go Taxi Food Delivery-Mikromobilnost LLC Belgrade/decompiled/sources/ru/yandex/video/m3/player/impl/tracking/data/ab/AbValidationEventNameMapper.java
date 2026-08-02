package ru.yandex.video.m3.player.impl.tracking.data.ab;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.ab.validation.AbValidationResult;
import ru.yandex.video.m3.ab.validation.AbValidationType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/ab/AbValidationEventNameMapper;", "", "()V", "getEventNameForValidationResult", "", "validationResult", "Lru/yandex/video/m3/ab/validation/AbValidationResult;", "getEventNameForValidationResult$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbValidationEventNameMapper {
    public static final int $stable = 0;
    public static final AbValidationEventNameMapper INSTANCE = new AbValidationEventNameMapper();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbValidationType.values().length];
            try {
                iArr[AbValidationType.Experiment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbValidationType.FeatureToggle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AbValidationEventNameMapper() {
    }

    public final String getEventNameForValidationResult$video_player_internalRelease(AbValidationResult validationResult) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[validationResult.getAbValidationType().ordinal()];
        if (i == 1) {
            str = "Experiment";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "FeatureToggle";
        }
        sb.append(str);
        if (validationResult instanceof AbValidationResult.Success) {
            str2 = "Success";
        } else if (validationResult instanceof AbValidationResult.Exception) {
            str2 = "Exception";
        } else if (validationResult instanceof AbValidationResult.NoTargetSlot) {
            str2 = "NoTargetSlot";
        } else if (validationResult instanceof AbValidationResult.NoFlag) {
            str2 = "NoFlag";
        } else {
            if (!(validationResult instanceof AbValidationResult.NoFlagNoSlots)) {
                w511.b();
                return null;
            }
            str2 = "NoFlagNoSlots";
        }
        sb.append(str2);
        return sb.toString();
    }
}
