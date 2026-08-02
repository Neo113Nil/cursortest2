package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class q5o0 implements t5o0 {
    public final ymn0 a;

    public /* synthetic */ q5o0(ymn0 ymn0Var) {
        this.a = ymn0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q5o0) {
            return jl40.l(this.a, ((q5o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        ymn0 ymn0Var = this.a;
        if (ymn0Var == null) {
            return 0;
        }
        return ymn0Var.hashCode();
    }

    public final String toString() {
        return "ShowFinishInfo(scootersFinishInfoPayload=" + this.a + Extension.C_BRAKE;
    }
}
