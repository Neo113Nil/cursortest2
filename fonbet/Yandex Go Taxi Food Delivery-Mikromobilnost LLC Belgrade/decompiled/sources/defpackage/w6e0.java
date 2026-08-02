package defpackage;

import com.yandex.bubbles.BubbleStyle;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class w6e0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BubbleStyle.values().length];
        try {
            iArr[BubbleStyle.CUSTOM_BACKGROUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BubbleStyle.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
