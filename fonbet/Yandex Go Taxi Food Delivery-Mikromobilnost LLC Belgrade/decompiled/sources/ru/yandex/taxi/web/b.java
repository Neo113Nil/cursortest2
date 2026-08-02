package ru.yandex.taxi.web;

import ru.yandex.taxi.web.CoreWebViewConfig;

/* loaded from: classes6.dex */
public final class b {
    public static UiWebViewConfig a(String str, String str2, String str3, boolean z, boolean z2) {
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        aVar.c = str3;
        aVar.e = z;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setTitle(str2);
        uiWebViewConfig.setShouldUseCached(z2);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setBusinessName(null);
        return uiWebViewConfig;
    }
}
