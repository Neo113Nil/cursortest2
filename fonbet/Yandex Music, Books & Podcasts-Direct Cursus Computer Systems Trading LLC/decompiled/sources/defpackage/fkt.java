package defpackage;

import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class fkt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[rht.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            rht rhtVar = rht.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ujt.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            Parcelable.Creator<ujt> creator = ujt.CREATOR;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
