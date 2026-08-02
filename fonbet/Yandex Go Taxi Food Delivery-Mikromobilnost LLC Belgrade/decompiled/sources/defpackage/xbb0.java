package defpackage;

import com.ybsdk.feature.pfm.internal.ui.mappers.SelectionState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class xbb0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SelectionState.values().length];
        try {
            iArr[SelectionState.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SelectionState.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SelectionState.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
