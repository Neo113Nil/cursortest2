package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class x621 extends kr {
    public static final w621 Companion = new w621();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new z121(6))};
    public final ywl a;

    public /* synthetic */ x621(int i, ywl ywlVar) {
        if (1 == (i & 1)) {
            this.a = ywlVar;
        } else {
            qje.Z(i, 1, v621.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x621.class == obj.getClass() && jl40.l(this.a, ((x621) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateDocumentAction(document=" + this.a + Extension.C_BRAKE;
    }
}
