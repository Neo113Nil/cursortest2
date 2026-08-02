package defpackage;

import com.yandex.delivery.mapper.model.Expansion;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wn extends nr {
    public final String a;
    public final Expansion b;

    public wn(String str, Expansion expansion) {
        this.a = str;
        this.b = expansion;
    }

    @Override // defpackage.nr
    public final String c() {
        return this.a;
    }

    public final Expansion d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) obj;
        return jl40.l(this.a, wnVar.a) && this.b == wnVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionOpenState(title=" + this.a + ", expansion=" + this.b + Extension.C_BRAKE;
    }
}
