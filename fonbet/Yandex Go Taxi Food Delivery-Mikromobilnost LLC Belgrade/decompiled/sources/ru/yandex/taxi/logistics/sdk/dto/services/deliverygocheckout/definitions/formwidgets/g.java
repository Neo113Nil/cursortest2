package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.TextWidgetDto;

/* loaded from: classes5.dex */
public final class g extends TextWidgetDto.TextDto {
    public final FormStateTextDto a;

    public g(FormStateTextDto formStateTextDto) {
        this.a = formStateTextDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
