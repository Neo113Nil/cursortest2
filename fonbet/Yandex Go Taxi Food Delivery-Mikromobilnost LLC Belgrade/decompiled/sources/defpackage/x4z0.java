package defpackage;

import com.yandex.delivery.mapper.model.PartialProgressBarStyleSidesModel;
import ru.yandex.taxi.logistics.sdk.dashboard.model.common.ImagePositionModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class x4z0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PartialProgressBarStyleSidesModel.values().length];
        try {
            iArr[PartialProgressBarStyleSidesModel.SQUARE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PartialProgressBarStyleSidesModel.ROUNDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ImagePositionModel.values().length];
        try {
            iArr2[ImagePositionModel.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ImagePositionModel.TRAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
