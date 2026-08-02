package ru.yandex.taxi.common_models.net;

import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public interface a {
    /* renamed from: a */
    String getC();

    /* renamed from: b */
    boolean getD();

    /* renamed from: c */
    FormattedText.VerticalAlignment getB();

    default Integer getHeight() {
        return null;
    }

    default Integer getWidth() {
        return null;
    }
}
