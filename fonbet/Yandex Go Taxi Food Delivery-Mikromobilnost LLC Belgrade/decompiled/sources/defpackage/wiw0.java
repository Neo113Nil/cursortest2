package defpackage;

import com.yandex.go.taxi.order.support.domain.entities.SupportButtonsArrangement;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class wiw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SupportButtonsArrangement.values().length];
        try {
            iArr[SupportButtonsArrangement.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SupportButtonsArrangement.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
