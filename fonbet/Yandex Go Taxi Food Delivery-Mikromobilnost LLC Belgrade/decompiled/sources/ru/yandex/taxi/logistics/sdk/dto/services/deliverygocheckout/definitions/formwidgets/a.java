package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.HeaderWidgetDto;

/* loaded from: classes5.dex */
public final class a extends HeaderWidgetDto.TitleDto {
    public final LogotypeTitleDto a;

    public a(LogotypeTitleDto logotypeTitleDto) {
        this.a = logotypeTitleDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a.equals(((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Title_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
