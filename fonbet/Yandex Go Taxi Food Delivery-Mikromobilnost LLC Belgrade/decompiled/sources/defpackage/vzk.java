package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class vzk extends mi91 {
    public final List a;
    public final List b;
    public final ru31 c;
    public final List d;
    public final n690 e;
    public final List f;

    public vzk(List list, List list2, ru31 ru31Var, List list3, n690 n690Var, List list4) {
        this.a = list;
        this.b = list2;
        this.c = ru31Var;
        this.d = list3;
        this.e = n690Var;
        this.f = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzk)) {
            return false;
        }
        vzk vzkVar = (vzk) obj;
        return this.a.equals(vzkVar.a) && this.b.equals(vzkVar.b) && this.c.equals(vzkVar.c) && this.d.equals(vzkVar.d) && this.e.equals(vzkVar.e) && this.f.equals(vzkVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((qu31.b.hashCode() + ((this.e.hashCode() + ((((this.d.hashCode() + unr0.c(((this.a.hashCode() * 31) - 1364013995) * 31, 961, this.b)) * 31) + 1387629604) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = qv10.v("DivMethodItemData(actions=", this.a, ", content_alignment_vertical=center, extensions=", this.b, ", height=");
        v.append(this.c);
        v.append(", items=");
        v.append(this.d);
        v.append(", orientation=horizontal, paddings=");
        v.append(this.e);
        v.append(", width=");
        v.append(qu31.b);
        v.append(", background=");
        return ly3.s(v, this.f, Extension.C_BRAKE);
    }
}
