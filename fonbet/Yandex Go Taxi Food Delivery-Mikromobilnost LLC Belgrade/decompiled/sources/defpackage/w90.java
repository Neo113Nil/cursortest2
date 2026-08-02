package defpackage;

import com.yandex.go.payments.api.card.CardScrollMode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class w90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardScrollMode.values().length];
        try {
            iArr[CardScrollMode.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardScrollMode.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
