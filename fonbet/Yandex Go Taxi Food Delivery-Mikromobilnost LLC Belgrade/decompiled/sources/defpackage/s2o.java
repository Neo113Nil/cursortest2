package defpackage;

import androidx.compose.animation.EnterExitState;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class s2o {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnterExitState.values().length];
        try {
            iArr[EnterExitState.Visible.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnterExitState.PreEnter.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnterExitState.PostExit.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
