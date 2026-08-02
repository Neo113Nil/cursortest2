package defpackage;

import com.yandex.go.zone.model.Zone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class yoe0 implements zoe0 {
    public final Zone a;

    public yoe0(Zone zone) {
        this.a = zone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoe0) && jl40.l(this.a, ((yoe0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestPreload(zone=" + this.a + Extension.C_BRAKE;
    }
}
