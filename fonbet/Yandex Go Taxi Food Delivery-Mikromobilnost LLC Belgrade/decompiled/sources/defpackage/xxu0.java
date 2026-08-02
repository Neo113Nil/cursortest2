package defpackage;

import com.yandex.go.taxi.order.bubble.StyledOrderBubbleViewHolder$State;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class xxu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StyledOrderBubbleViewHolder$State.values().length];
        try {
            iArr[StyledOrderBubbleViewHolder$State.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StyledOrderBubbleViewHolder$State.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
