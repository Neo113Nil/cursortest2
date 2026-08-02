package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class t2x extends w2x {
    public final String b;
    public final String c;

    public t2x(String str) {
        super(ViewType.SECTION);
        this.b = str;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2x)) {
            return false;
        }
        t2x t2xVar = (t2x) obj;
        return jl40.l(this.b, t2xVar.b) && jl40.l(this.c, t2xVar.c);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Section(title=", this.b, ", id=", this.c, Extension.C_BRAKE);
    }
}
