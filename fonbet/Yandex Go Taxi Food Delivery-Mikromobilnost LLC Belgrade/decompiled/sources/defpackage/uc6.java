package defpackage;

import com.yandex.go.slot.dto.SlotItemActionDto$OpenBottomModal;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uc6 {
    public final n7v a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final SlotItemActionDto$OpenBottomModal.Properties f;

    public uc6(n7v n7vVar, String str, String str2, String str3, List list, SlotItemActionDto$OpenBottomModal.Properties properties) {
        this.a = n7vVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = properties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc6)) {
            return false;
        }
        uc6 uc6Var = (uc6) obj;
        return jl40.l(this.a, uc6Var.a) && jl40.l(this.b, uc6Var.b) && jl40.l(this.c, uc6Var.c) && jl40.l(this.d, uc6Var.d) && jl40.l(this.e, uc6Var.e) && jl40.l(this.f, uc6Var.f);
    }

    public final int hashCode() {
        n7v n7vVar = this.a;
        return this.f.hashCode() + unr0.c(unr0.b(unr0.b(unr0.b((n7vVar == null ? 0 : n7vVar.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomModalParams(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        g8e.D(sb, this.c, ", buttonTitle=", this.d, ", contentDto=");
        sb.append(this.e);
        sb.append(", properties=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
