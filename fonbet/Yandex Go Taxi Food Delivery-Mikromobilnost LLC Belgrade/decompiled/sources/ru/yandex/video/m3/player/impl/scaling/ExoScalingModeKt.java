package ru.yandex.video.m3.player.impl.scaling;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.player.scaling.ScalingMode;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toExoScalingMode", "", "Lru/yandex/video/m3/player/scaling/ScalingMode;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoScalingModeKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScalingMode.values().length];
            try {
                iArr[ScalingMode.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScalingMode.SCALE_TO_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScalingMode.SCALE_TO_FIT_WITH_CROPPING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int toExoScalingMode(ScalingMode scalingMode) {
        int i = WhenMappings.$EnumSwitchMapping$0[scalingMode.ordinal()];
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        w511.b();
        return 0;
    }
}
