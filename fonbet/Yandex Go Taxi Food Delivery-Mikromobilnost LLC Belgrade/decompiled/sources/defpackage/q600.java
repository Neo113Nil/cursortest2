package defpackage;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class q600 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[UserProfileExperiment.Type.values().length];
        try {
            iArr[UserProfileExperiment.Type.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UserProfileExperiment.Type.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UserProfileExperiment.Type.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[UserProfileExperiment.Type.AM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
