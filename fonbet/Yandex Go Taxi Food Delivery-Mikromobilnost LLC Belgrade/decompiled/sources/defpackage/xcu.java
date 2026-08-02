package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class xcu implements edu {
    public final nvi0 a;

    public xcu(nvi0 nvi0Var) {
        this.a = nvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xcu) && jl40.l(this.a, ((xcu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BackgroundImageLoadingFailed(failedBackgroundImage=" + this.a + Extension.C_BRAKE;
    }
}
