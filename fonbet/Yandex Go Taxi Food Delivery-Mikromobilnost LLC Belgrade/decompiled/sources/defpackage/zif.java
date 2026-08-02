package defpackage;

import com.yandex.go.design.compose.button.ButtonForm;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class zif {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonForm.values().length];
        try {
            iArr[ButtonForm.Circle.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonForm.Squircle.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
