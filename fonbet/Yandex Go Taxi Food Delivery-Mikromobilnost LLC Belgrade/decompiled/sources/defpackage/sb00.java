package defpackage;

import com.yandex.go.preorder.header.MapInteractionState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class sb00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapInteractionState.values().length];
        try {
            iArr[MapInteractionState.INTERACTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapInteractionState.IDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapInteractionState.DRAGGING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
