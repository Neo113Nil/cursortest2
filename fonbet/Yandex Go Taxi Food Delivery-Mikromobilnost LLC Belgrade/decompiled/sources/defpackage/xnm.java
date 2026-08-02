package defpackage;

import com.yx360.design.compose.atoms.DsAlert$ButtonsOrientation;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class xnm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsAlert$ButtonsOrientation.values().length];
        try {
            iArr[DsAlert$ButtonsOrientation.Horizontal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsAlert$ButtonsOrientation.Vertical.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
