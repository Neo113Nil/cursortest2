package defpackage;

import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class rul0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterWebConfig.Button.Type.values().length];
        try {
            iArr[SafetyCenterWebConfig.Button.Type.EMERGENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterWebConfig.Button.Type.SUPPORT_CHAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterWebConfig.Button.Type.SHARE_ROUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterWebConfig.Button.Type.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
