package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ud31 implements ge31 {
    public final i1v a;

    public ud31(i1v i1vVar) {
        this.a = i1vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud31) && jl40.l(this.a, ((ud31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResetFilterClick(resetFilterAction=" + this.a + Extension.C_BRAKE;
    }
}
