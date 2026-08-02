package defpackage;

import com.yandex.go.flex.common.actions.dto.HapticAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class u6u {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[HapticAction.HapticType.values().length];
        try {
            iArr[HapticAction.HapticType.ClickLight.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
