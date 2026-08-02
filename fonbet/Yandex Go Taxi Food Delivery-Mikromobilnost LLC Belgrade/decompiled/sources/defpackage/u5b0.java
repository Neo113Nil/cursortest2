package defpackage;

import com.yandex.messaging.core.net.entities.PreferencesBucket;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class u5b0 {
    public final boolean a;
    public final boolean b;

    public u5b0(PreferencesBucket.Value value) {
        Boolean bool = value.telemostAutoStatus;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = value.telemostAutoStatusNotifications;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        this.a = booleanValue;
        this.b = booleanValue2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5b0)) {
            return false;
        }
        u5b0 u5b0Var = (u5b0) obj;
        return this.a == u5b0Var.a && this.b == u5b0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(Long.hashCode(1L) * 31, 31, this.a);
    }

    public final String toString() {
        return ly3.o("PersonalPreferencesEntity(rowId=1, telemostAutoStatus=", ", telemostAutoStatusNotifications=", Extension.C_BRAKE, this.a, this.b);
    }
}
