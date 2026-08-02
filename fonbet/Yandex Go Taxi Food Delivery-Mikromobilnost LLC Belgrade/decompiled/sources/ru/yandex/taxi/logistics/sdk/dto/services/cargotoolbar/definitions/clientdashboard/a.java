package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;

/* loaded from: classes5.dex */
public final class a extends TileDto.HeaderDto {
    public final TileHeaderDto a;

    public a(TileHeaderDto tileHeaderDto) {
        this.a = tileHeaderDto;
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
        return "Header_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
