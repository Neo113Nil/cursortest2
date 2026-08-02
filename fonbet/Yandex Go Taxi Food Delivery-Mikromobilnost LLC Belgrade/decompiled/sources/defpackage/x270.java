package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x270 {
    public static final x270 b = new x270(x10.a);
    public final x10 a;

    public x270(x10 x10Var) {
        this.a = x10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x270) && jl40.l(this.a, ((x270) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OngoingMeetingOrCallStatus(activeMeetingChatStatus=" + this.a + Extension.C_BRAKE;
    }
}
