package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.InputCircleWidgetDto;

/* loaded from: classes5.dex */
public final class e extends InputCircleWidgetDto.IconDto {
    public final ImageDto a;

    public e(ImageDto imageDto) {
        this.a = imageDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon_Type1Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
