package defpackage;

import androidx.compose.ui.state.ToggleableState;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class r72 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ToggleableState.values().length];
        try {
            iArr[ToggleableState.On.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleableState.Off.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
