package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersPersonalGoalsSection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vgo0 {
    public final ScootersPersonalGoalsSection a;

    public vgo0(ScootersPersonalGoalsSection scootersPersonalGoalsSection) {
        this.a = scootersPersonalGoalsSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgo0) && this.a == ((vgo0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ScootersPersonalGoalsDeeplink(section=" + this.a + Extension.C_BRAKE;
    }
}
