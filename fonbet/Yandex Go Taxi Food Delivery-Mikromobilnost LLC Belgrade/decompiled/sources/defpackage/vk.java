package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vk implements xk {
    public final jl a;

    public vk(jl jlVar) {
        this.a = jlVar;
    }

    public final jl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk) && jl40.l(this.a, ((vk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountChanged(accountInfo=" + this.a + Extension.C_BRAKE;
    }
}
