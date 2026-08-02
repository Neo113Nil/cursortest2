package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class x0 implements y0 {
    public final f7v0 a;

    public x0(f7v0 f7v0Var) {
        this.a = f7v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && jl40.l(this.a, ((x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SuggestClicked(suggest=" + this.a + Extension.C_BRAKE;
    }
}
