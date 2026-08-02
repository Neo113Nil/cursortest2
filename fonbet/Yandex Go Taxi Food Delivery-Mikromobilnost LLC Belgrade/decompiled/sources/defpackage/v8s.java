package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class v8s {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FormattedText.FontStyle.values().length];
        try {
            iArr[FormattedText.FontStyle.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormattedText.FontStyle.ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[FormattedText.FontWeight.values().length];
        try {
            iArr2[FormattedText.FontWeight.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FormattedText.FontWeight.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[FormattedText.FontWeight.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[FormattedText.FontWeight.BOLD.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[FormattedText.FontWeight.HEAVY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
