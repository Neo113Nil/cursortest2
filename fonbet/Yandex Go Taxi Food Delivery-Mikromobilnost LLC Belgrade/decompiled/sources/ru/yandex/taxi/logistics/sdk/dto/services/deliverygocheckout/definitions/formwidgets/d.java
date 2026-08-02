package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleWidgetDto;

/* loaded from: classes5.dex */
public final class d extends InputCircleWidgetDto.IconDto {
    public final InputCircleIconsDto a;

    public d(InputCircleIconsDto inputCircleIconsDto) {
        this.a = inputCircleIconsDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a.equals(((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
