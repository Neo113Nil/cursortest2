package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sh0 implements xh0 {
    public final boolean a;

    public sh0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.xh0
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh0) && this.a == ((sh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Loading(isFullscreen=", Extension.C_BRAKE, this.a);
    }
}
