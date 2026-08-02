package defpackage;

import com.yandex.go.scooters.requirements.SkipCheck;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zro0 {
    public final SkipCheck a;

    public final boolean equals(Object obj) {
        if (obj instanceof zro0) {
            return this.a == ((zro0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        SkipCheck skipCheck = this.a;
        if (skipCheck == null) {
            return 0;
        }
        return skipCheck.hashCode();
    }

    public final String toString() {
        return "ScootersRequirementsPayload(skipCheck=" + this.a + Extension.C_BRAKE;
    }
}
