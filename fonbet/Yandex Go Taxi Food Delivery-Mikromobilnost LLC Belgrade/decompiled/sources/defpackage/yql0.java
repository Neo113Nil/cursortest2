package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class yql0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SafetyCenterParams$Source.values().length];
        try {
            iArr[SafetyCenterParams$Source.MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SafetyCenterParams$Source.ORDER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SafetyCenterParams$Source.ACCIDENT_DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
