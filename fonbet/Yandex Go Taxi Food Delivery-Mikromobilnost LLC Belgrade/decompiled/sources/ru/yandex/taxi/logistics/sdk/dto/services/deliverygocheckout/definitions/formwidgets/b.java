package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HeaderWidgetDto;

/* loaded from: classes5.dex */
public final class b extends HeaderWidgetDto.TitleDto {
    public final AttributedTextDto a;

    public b(AttributedTextDto attributedTextDto) {
        this.a = attributedTextDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Title_Type1Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
