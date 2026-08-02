package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public abstract class x8s {
    public static final int a(FormattedText.FontStyle fontStyle) {
        int i = v8s.a[fontStyle.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        w511.b();
        return 0;
    }

    public static final int b(FormattedText.FontWeight fontWeight) {
        int i = v8s.b[fontWeight.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        w511.b();
        return 0;
    }
}
