package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tkr0 extends xkr0 {
    public final TrustedContactDto a;
    public final EditContactNameConfigDto b;

    public tkr0(TrustedContactDto trustedContactDto, EditContactNameConfigDto editContactNameConfigDto) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = trustedContactDto;
        this.b = editContactNameConfigDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkr0)) {
            return false;
        }
        tkr0 tkr0Var = (tkr0) obj;
        return jl40.l(this.a, tkr0Var.a) && jl40.l(this.b, tkr0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        EditContactNameConfigDto editContactNameConfigDto = this.b;
        return hashCode + (editContactNameConfigDto == null ? 0 : editContactNameConfigDto.hashCode());
    }

    public final String toString() {
        return "ShareSettingsContactItem(contact=" + this.a + ", editContactNameConfig=" + this.b + Extension.C_BRAKE;
    }
}
