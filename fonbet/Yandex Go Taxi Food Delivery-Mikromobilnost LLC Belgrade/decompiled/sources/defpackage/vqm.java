package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class vqm implements xqm {
    public final float a;
    public final a b;

    public vqm(float f, a aVar) {
        this.a = f;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqm)) {
            return false;
        }
        vqm vqmVar = (vqm) obj;
        return y7m.b(this.a, vqmVar.a) && jl40.l(this.b, vqmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Image(rounding=" + y7m.c(this.a) + ", content=" + this.b + Extension.C_BRAKE;
    }

    public vqm(a aVar) {
        this(0.0f, aVar);
    }
}
