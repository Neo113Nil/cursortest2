package defpackage;

import androidx.compose.foundation.text.selection.CrossStatus;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class qm40 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CrossStatus.values().length];
        try {
            iArr[CrossStatus.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CrossStatus.NOT_CROSSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CrossStatus.CROSSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
