package defpackage;

import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ulr0 extends xkr0 {
    public final String a;

    public ulr0(String str) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulr0) && jl40.l(this.a, ((ulr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ShareSettingsTitleItem(title=", this.a, Extension.C_BRAKE);
    }
}
