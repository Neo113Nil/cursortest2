package defpackage;

import android.graphics.Paint;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ri4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Paint.Align.values().length];
        a = iArr;
        try {
            iArr[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
