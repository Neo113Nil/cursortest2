package defpackage;

import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class u17 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[jpo.values().length];
        try {
            Parcelable.Creator<jpo> creator = jpo.CREATOR;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
