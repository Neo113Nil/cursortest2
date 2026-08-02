package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class vja implements wja {
    public final k6a a;

    public vja(k6a k6aVar) {
        this.a = k6aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vja) && jl40.l(this.a, ((vja) obj).a);
    }

    public final int hashCode() {
        k6a k6aVar = this.a;
        if (k6aVar == null) {
            return 0;
        }
        return k6aVar.hashCode();
    }

    public final String toString() {
        return "Success(notification=" + this.a + Extension.C_BRAKE;
    }

    public vja() {
        this(null);
    }
}
