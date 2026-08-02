package defpackage;

import com.yandex.go.platform.ui.components.InitialState;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class vqt {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InitialState.values().length];
        try {
            iArr[InitialState.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InitialState.Spinner.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InitialState.Animation.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
