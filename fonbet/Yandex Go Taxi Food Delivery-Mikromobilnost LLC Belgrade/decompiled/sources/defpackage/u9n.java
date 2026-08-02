package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class u9n extends w9n {
    public final ArrayList c;
    public final long d;

    public u9n(long j, ArrayList arrayList) {
        super(arrayList);
        this.c = arrayList;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9n)) {
            return false;
        }
        u9n u9nVar = (u9n) obj;
        return jl40.l(this.c, u9nVar.c) && this.d == u9nVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatableTimelineModel(stages=" + this.c + ", startTime=" + this.d + Extension.C_BRAKE;
    }
}
