package defpackage;

import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class qkr0 extends xkr0 {
    public final CardDivider.Type a;

    public qkr0(CardDivider.Type type) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkr0) && this.a == ((qkr0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShareSettingsCardDividerItem(dividerType=" + this.a + Extension.C_BRAKE;
    }
}
