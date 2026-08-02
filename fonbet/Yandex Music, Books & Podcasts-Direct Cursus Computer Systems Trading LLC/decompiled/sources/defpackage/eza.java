package defpackage;

import ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class eza implements EasyLoginThemeProvider {
    @Override // ru.kinopoisk.sdk.easylogin.api.EasyLoginThemeProvider
    public final Integer getTheme() {
        return Integer.valueOf(pd.M() ? R.style.EasyLoginThemeDark : R.style.EasyLoginThemeLight);
    }
}
