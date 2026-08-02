package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class r5z0 {
    public static final p5z0 Companion = new p5z0();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new x1z0(9))};
    public final long a;
    public final TimeUnit b;

    public /* synthetic */ r5z0(int i, long j, TimeUnit timeUnit) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, n5z0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = TimeUnit.MILLISECONDS;
        } else {
            this.b = timeUnit;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5z0)) {
            return false;
        }
        r5z0 r5z0Var = (r5z0) obj;
        return this.a == r5z0Var.a && this.b == r5z0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Time(time=" + this.a + ", timeUnit=" + this.b + Extension.C_BRAKE;
    }

    public r5z0(long j, TimeUnit timeUnit) {
        this.a = j;
        this.b = timeUnit;
    }

    public /* synthetic */ r5z0(long j) {
        this(j, TimeUnit.MILLISECONDS);
    }
}
