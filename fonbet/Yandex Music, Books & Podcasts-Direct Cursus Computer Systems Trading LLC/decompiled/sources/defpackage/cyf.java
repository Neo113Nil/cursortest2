package defpackage;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class cyf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[byf.values().length];
        try {
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Parcelable.Creator<byf> creator = byf.CREATOR;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[id.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr2;
    }
}
