package defpackage;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class f8o {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[e8o.values().length];
        try {
            Parcelable.Creator<e8o> creator = e8o.CREATOR;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Parcelable.Creator<e8o> creator2 = e8o.CREATOR;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
