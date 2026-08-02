package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class zyi0 extends kr {
    public static final yyi0 Companion = new yyi0();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new lqi0(8))};
    public final ywl a;

    public /* synthetic */ zyi0(int i, ywl ywlVar) {
        if (1 == (i & 1)) {
            this.a = ywlVar;
        } else {
            qje.Z(i, 1, xyi0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zyi0.class == obj.getClass() && jl40.l(this.a, ((zyi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenewDocumentAction(document=" + this.a + Extension.C_BRAKE;
    }
}
