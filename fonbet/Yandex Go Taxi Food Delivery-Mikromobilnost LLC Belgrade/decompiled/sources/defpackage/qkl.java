package defpackage;

import com.yandex.div2.DivTransitionSelector;

/* loaded from: classes.dex */
public abstract /* synthetic */ class qkl {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivTransitionSelector.values().length];
        try {
            iArr[DivTransitionSelector.DATA_CHANGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivTransitionSelector.ANY_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DivTransitionSelector.STATE_CHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
