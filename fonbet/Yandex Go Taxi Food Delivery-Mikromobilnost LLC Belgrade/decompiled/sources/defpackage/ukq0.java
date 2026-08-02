package defpackage;

import androidx.compose.foundation.text.selection.Direction;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class ukq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Direction.values().length];
        try {
            iArr[Direction.BEFORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Direction.ON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Direction.AFTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
