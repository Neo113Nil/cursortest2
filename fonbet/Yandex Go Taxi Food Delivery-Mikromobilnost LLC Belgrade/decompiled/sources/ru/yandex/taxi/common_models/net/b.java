package ru.yandex.taxi.common_models.net;

import defpackage.w7s;
import java.util.Collections;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final class b {
    public static FormattedText b(b bVar, String str, Integer num, String str2, FormattedText.FontStyle fontStyle, FormattedText.FontWeight fontWeight, int i) {
        Integer num2 = (i & 2) != 0 ? null : num;
        if ((i & 4) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            fontStyle = FormattedText.FontStyle.NORMAL;
        }
        FormattedText.FontStyle fontStyle2 = fontStyle;
        FormattedText.FontWeight fontWeight2 = (i & 32) != 0 ? null : fontWeight;
        bVar.getClass();
        return new FormattedText(Collections.singletonList(new FormattedText.h(str, fontStyle2, fontWeight2, num2, null, str3, 1840)));
    }

    public final FormattedText a(String str, String str2) {
        return b(this, str, null, str2, null, null, 58);
    }

    public final FormattedText c(String str) {
        return b(this, str, null, null, null, null, 62);
    }

    public final KSerializer serializer() {
        return w7s.a;
    }
}
