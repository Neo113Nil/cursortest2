package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersAutoselectSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tzm0 {
    public final ScootersAutoselectSection a;

    public tzm0(ScootersAutoselectSection scootersAutoselectSection) {
        this.a = scootersAutoselectSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzm0) && this.a == ((tzm0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersAutoselectDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
