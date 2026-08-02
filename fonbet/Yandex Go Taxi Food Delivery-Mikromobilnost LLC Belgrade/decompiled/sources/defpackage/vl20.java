package defpackage;

import com.yandex.mob.reporting.MobTrigger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vl20 extends wl20 {
    public final MobTrigger a;

    public vl20(MobTrigger mobTrigger) {
        this.a = mobTrigger;
    }

    public final MobTrigger a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vl20) && this.a == ((vl20) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateConfig(trigger=" + this.a + Extension.C_BRAKE;
    }
}
