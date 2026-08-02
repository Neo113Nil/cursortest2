package defpackage;

import com.yandex.go.design.compose.button.utils.ButtonSize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class qz6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ButtonSize.values().length];
        try {
            iArr[ButtonSize.L.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ButtonSize.S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ButtonSize.XS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
