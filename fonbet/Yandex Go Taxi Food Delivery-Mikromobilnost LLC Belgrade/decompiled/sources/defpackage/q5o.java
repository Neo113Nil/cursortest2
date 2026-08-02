package defpackage;

import kotlinx.serialization.json.c;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class q5o {
    public final y2l a;
    public final c b;

    public q5o(y2l y2lVar, c cVar) {
        this.a = y2lVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5o)) {
            return false;
        }
        return jl40.l(this.b, ((q5o) obj).b);
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    public final String toString() {
        return "EquableDivPatchData(patch=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }
}
