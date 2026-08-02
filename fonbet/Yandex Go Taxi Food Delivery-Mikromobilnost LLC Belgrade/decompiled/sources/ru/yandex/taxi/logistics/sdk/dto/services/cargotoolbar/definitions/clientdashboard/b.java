package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard.TileDto;

/* loaded from: classes5.dex */
public final class b extends TileDto.HeaderDto {
    public final TileAttributedHeaderDto a;

    public b(TileAttributedHeaderDto tileAttributedHeaderDto) {
        this.a = tileAttributedHeaderDto;
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
        return "Header_Type1Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
