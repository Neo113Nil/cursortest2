package defpackage;

import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public interface qdc {
    Integer a(String str, ThemeStyle themeStyle);

    default Integer b(String str) {
        return a(str, ThemeStyle.DEFAULT);
    }
}
