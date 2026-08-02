package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zh4 {
    public final List a;
    public final l690 b;

    public /* synthetic */ zh4(List list) {
        this(list, an91.b(0.0f, 0.0f, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh4)) {
            return false;
        }
        zh4 zh4Var = (zh4) obj;
        return jl40.l(this.a, zh4Var.a) && jl40.l(this.b, zh4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BackgroundState(content=" + this.a + ", paddings=" + this.b + Extension.C_BRAKE;
    }

    public zh4(List list, l690 l690Var) {
        this.a = list;
        this.b = l690Var;
    }
}
