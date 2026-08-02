package defpackage;

import com.yandex.delivery.mapper.model.PartialProgressBarStyleSidesModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class uhf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PartialProgressBarStyleSidesModel.values().length];
        try {
            iArr[PartialProgressBarStyleSidesModel.ROUNDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartialProgressBarStyleSidesModel.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
