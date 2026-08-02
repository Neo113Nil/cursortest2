package ru.yandex.video.m3.ab.validation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.btf;
import defpackage.bwf;
import defpackage.e1;
import defpackage.n2;
import defpackage.vhp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/video/m3/ab/validation/AbValidationType;", "", "Companion", "n2", "Experiment", "FeatureToggle", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
@vhp
/* loaded from: classes6.dex */
public final class AbValidationType {
    private static final /* synthetic */ AbValidationType[] $VALUES;

    @NotNull
    public static final n2 Companion;
    public static final AbValidationType Experiment;
    public static final AbValidationType FeatureToggle;
    public static final Object a;

    static {
        AbValidationType abValidationType = new AbValidationType("Experiment", 0);
        Experiment = abValidationType;
        AbValidationType abValidationType2 = new AbValidationType("FeatureToggle", 1);
        FeatureToggle = abValidationType2;
        $VALUES = new AbValidationType[]{abValidationType, abValidationType2};
        Companion = new n2();
        a = btf.a(bwf.b, e1.u);
    }

    public static AbValidationType valueOf(String str) {
        return (AbValidationType) Enum.valueOf(AbValidationType.class, str);
    }

    public static AbValidationType[] values() {
        return (AbValidationType[]) $VALUES.clone();
    }
}
