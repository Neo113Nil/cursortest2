package defpackage;

import com.yx360.design.compose.atoms.DsSearch$Size;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class usm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DsSearch$Size.values().length];
        try {
            iArr[DsSearch$Size.Lg.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DsSearch$Size.Md.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
