package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class uph extends kr {
    public static final lph Companion = new lph();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new n5h(10))};
    public final long a;
    public final kr b;

    public /* synthetic */ uph(int i, long j, kr krVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, jph.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uph.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uph uphVar = (uph) obj;
        return this.a == uphVar.a && jl40.l(this.b, uphVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "DelayedAction(millis=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
