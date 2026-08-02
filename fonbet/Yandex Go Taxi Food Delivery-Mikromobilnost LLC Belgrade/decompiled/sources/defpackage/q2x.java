package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes5.dex */
public final class q2x extends w2x {
    public final p2x b;
    public final CharSequence c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2x(p2x p2xVar, CharSequence charSequence) {
        super(ViewType.HEADER);
        String obj = p2xVar.a.toString();
        this.b = p2xVar;
        this.c = charSequence;
        this.d = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2x)) {
            return false;
        }
        q2x q2xVar = (q2x) obj;
        return jl40.l(this.b, q2xVar.b) && jl40.l(this.c, q2xVar.c) && jl40.l(this.d, q2xVar.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CharSequence charSequence = this.c;
        return this.d.hashCode() + ((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", id=");
        return oyr.t(sb, this.d, Extension.C_BRAKE);
    }
}
