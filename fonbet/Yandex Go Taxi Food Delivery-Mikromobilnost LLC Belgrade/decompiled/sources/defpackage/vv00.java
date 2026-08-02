package defpackage;

import com.yandex.plus.core.config.Environment;
import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class vv00 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[PlusTheme.values().length];
        try {
            iArr[PlusTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlusTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PlusTheme.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[Environment.values().length];
        try {
            iArr2[Environment.TESTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[Environment.PRODUCTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
