package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class tjf implements ig5 {
    public static final pjf Companion = new pjf();
    public final sjf a;

    public /* synthetic */ tjf(int i, sjf sjfVar) {
        if (1 == (i & 1)) {
            this.a = sjfVar;
        } else {
            qje.Z(i, 1, ojf.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjf) && jl40.l(this.a, ((tjf) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "CustomHideOverlayAction(params=" + this.a + Extension.C_BRAKE;
    }
}
