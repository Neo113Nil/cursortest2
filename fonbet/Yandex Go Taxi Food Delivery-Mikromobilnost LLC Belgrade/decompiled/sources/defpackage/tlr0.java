package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsSwitches;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tlr0 extends xkr0 {
    public final ShareSettingsSwitches a;
    public final boolean b;

    public tlr0(ShareSettingsSwitches shareSettingsSwitches, boolean z) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = shareSettingsSwitches;
        this.b = z;
    }

    @Override // defpackage.xkr0
    public final boolean a(xkr0 xkr0Var) {
        if (!(xkr0Var instanceof tlr0)) {
            return false;
        }
        return jl40.l(this.a, ((tlr0) xkr0Var).a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlr0)) {
            return false;
        }
        tlr0 tlr0Var = (tlr0) obj;
        return jl40.l(this.a, tlr0Var.a) && this.b == tlr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShareSettingsSwitcherItem(settingsOption=" + this.a + ", showDivider=" + this.b + Extension.C_BRAKE;
    }
}
