package defpackage;

import com.yandex.go.zone.model.Zone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x660 {
    public final boolean a;
    public final boolean b;

    public x660(Zone zone, boolean z) {
        boolean z2 = false;
        if (zone != null && zone.b) {
            z2 = true;
        }
        this.a = z2;
        this.b = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x660)) {
            return false;
        }
        x660 x660Var = (x660) obj;
        return this.a == x660Var.a && this.b == x660Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (((Boolean.hashCode(this.a) * 31) - 2027574035) * 31);
    }

    public final String toString() {
        return ly3.o("NextButtonConfig(skipReqDestinationInZone=", ", mainScreenVersion=shortcuts, isFlex=", Extension.C_BRAKE, this.a, this.b);
    }
}
