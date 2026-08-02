package defpackage;

import com.yandex.go.tariffcard.ui.SectionSeparator$AnimationType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class u3q0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SectionSeparator$AnimationType.values().length];
        try {
            iArr[SectionSeparator$AnimationType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SectionSeparator$AnimationType.STANDARD_HEADER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SectionSeparator$AnimationType.ULTIMA_HEADER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
