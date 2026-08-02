package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class w521 implements zwz0 {
    public final be00 a;

    public w521(be00 be00Var) {
        this.a = be00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w521) && jl40.l(this.a, ((w521) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpcomingManeuverContent(state=" + this.a + Extension.C_BRAKE;
    }
}
