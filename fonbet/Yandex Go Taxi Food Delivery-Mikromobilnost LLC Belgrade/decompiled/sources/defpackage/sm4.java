package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sm4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgeModel$BadgePlace.values().length];
        try {
            iArr[BadgeModel$BadgePlace.SINGLE_TOP_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgeModel$BadgePlace.SINGLE_BOTTOM_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgeModel$BadgePlace.SINGLE_BOTTOM_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
