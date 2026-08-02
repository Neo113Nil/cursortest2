package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersIgnitionSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class yqn0 {
    public final ScootersIgnitionSection a;

    public yqn0(ScootersIgnitionSection scootersIgnitionSection) {
        this.a = scootersIgnitionSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqn0) && this.a == ((yqn0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersIgnitionDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
