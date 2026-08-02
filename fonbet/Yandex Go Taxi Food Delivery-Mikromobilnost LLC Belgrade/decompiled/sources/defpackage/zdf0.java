package defpackage;

import com.yandex.messaging.profile.ProfileCreator$IdCreationType;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class zdf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProfileCreator$IdCreationType.values().length];
        try {
            iArr[ProfileCreator$IdCreationType.USE_DEFAULT_OR_INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProfileCreator$IdCreationType.REGENERATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
