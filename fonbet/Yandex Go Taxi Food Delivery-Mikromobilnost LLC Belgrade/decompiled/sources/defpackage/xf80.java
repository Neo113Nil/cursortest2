package defpackage;

import com.yandex.go.places.organization.card.impl.domain.entities.card.FocusPinMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class xf80 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FocusPinMode.values().length];
        try {
            iArr[FocusPinMode.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusPinMode.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FocusPinMode.SMART.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FocusPinMode.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
