package defpackage;

import com.airbnb.lottie.model.DocumentData;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class xqy0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DocumentData.Justification.values().length];
        a = iArr;
        try {
            iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[DocumentData.Justification.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
