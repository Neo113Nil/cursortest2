package flex.parser.transition;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.values().length];
        try {
            iArr[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.Linear.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.EaseIn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.EaseOut.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Interpolator.EaseInOut.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.values().length];
        try {
            iArr2[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.CrossDissolve.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransitionSettingsParser$TransitionSettingsSurrogate$Option$Transition.BottomSurfacing.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
