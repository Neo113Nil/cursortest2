package defpackage;

import com.yandex.delivery.mapper.model.CardsRevealing;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class syh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardsRevealing.values().length];
        try {
            iArr[CardsRevealing.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardsRevealing.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
