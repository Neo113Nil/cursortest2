package defpackage;

import com.yandex.go.trusted_contacts.share_settings.ShareSettingsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class slr0 extends xkr0 {
    public final String a;

    public slr0(String str) {
        ShareSettingsItemType shareSettingsItemType = ShareSettingsItemType.CONTACT;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slr0) && jl40.l(this.a, ((slr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ShareSettingsSubtitleItem(subtitle=", this.a, Extension.C_BRAKE);
    }
}
