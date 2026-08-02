package defpackage;

import android.os.Parcelable;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ils {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[mls.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            Parcelable.Creator<mls> creator = mls.CREATOR;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[hls.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            hls hlsVar = hls.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr2;
    }
}
