package defpackage;

import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.ButtonSize;
import ru.yandex.taxi.common_models.ui.TextStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class w57 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ButtonOrientation.values().length];
        try {
            iArr[ButtonOrientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ButtonOrientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TextStyle.values().length];
        try {
            iArr2[TextStyle.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TextStyle.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[ButtonSize.values().length];
        try {
            iArr3[ButtonSize.XS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[ButtonSize.S.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ButtonSize.M.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ButtonSize.L.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
