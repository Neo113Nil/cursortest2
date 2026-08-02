package defpackage;

import com.yandex.go.taxi.order.cancel.similar.model.CancelSimilarUiState$TopContentType;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class xz7 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[CancelSimilarUiState$TopContentType.values().length];
        try {
            iArr[CancelSimilarUiState$TopContentType.IMAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CancelSimilarUiState$TopContentType.ORDER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[Orientation.values().length];
        try {
            iArr2[Orientation.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        b = iArr2;
    }
}
