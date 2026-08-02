package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class unq0 extends kr {
    public static final tnq0 Companion = new tnq0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new wrp0(17))};
    public final List a;

    public /* synthetic */ unq0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, snq0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unq0) && jl40.l(this.a, ((unq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SendAnalyticsAction(events=", Extension.C_BRAKE, this.a);
    }
}
