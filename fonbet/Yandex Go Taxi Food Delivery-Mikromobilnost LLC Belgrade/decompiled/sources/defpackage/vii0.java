package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vii0 extends keo {
    public final boolean c;

    public vii0(boolean z) {
        super("recovery_after_activity_death", g8e.z("restore_state", String.valueOf(z)));
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vii0) && this.c == ((vii0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return nzs.b("RecoveryAfterActivityDeath(restoreState=", Extension.C_BRAKE, this.c);
    }
}
