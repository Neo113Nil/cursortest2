package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.Scroller$Direction;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class zkp0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Scroller$Direction.values().length];
        try {
            iArr[Scroller$Direction.BACKWARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Scroller$Direction.FORWARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
