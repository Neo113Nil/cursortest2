package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class yjk0 implements zjk0 {
    public final String a;
    public final akk0 b;

    public yjk0(String str) {
        this.a = str;
        wrs0.a.getClass();
        this.b = vrs0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjk0) && jl40.l(this.a, ((yjk0) obj).a);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.b;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Empty(id=", this.a, Extension.C_BRAKE);
    }
}
