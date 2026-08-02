package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yuv0 {
    public final List a;

    public yuv0(int i) {
        this.a = scc.g(new cxv0(), new cxv0(), new cxv0(), new cxv0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yuv0) && jl40.l(this.a, ((yuv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("SuperAppDiscoveryMapLoadingState(items=", Extension.C_BRAKE, this.a);
    }

    public yuv0() {
        this(0);
    }
}
