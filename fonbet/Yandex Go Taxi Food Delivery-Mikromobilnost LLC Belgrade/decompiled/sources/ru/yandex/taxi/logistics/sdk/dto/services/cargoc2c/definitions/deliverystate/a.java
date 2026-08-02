package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.OnFirstLoadActionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.ActionOpenFormDto;

/* loaded from: classes5.dex */
public final class a extends OnFirstLoadActionDto.ActionDto {
    public final ActionOpenFormDto a;

    public a(ActionOpenFormDto actionOpenFormDto) {
        this.a = actionOpenFormDto;
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
        return "Action_Type0Dto(value=" + this.a + Extension.C_BRAKE;
    }
}
