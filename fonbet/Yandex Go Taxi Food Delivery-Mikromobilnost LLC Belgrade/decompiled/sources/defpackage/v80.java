package defpackage;

import com.yandex.go.payments.AddButtonType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class v80 {
    public static final v80 d = new v80(false, (String) null, 7);
    public final boolean a;
    public final AddButtonType b;
    public final String c;

    public /* synthetic */ v80(boolean z, String str, int i) {
        this((i & 1) != 0 ? false : z, AddButtonType.CARD, (i & 4) != 0 ? "" : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v80)) {
            return false;
        }
        v80 v80Var = (v80) obj;
        return this.a == v80Var.a && this.b == v80Var.b && jl40.l(this.c, v80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddButtonState(visibility=");
        sb.append(this.a);
        sb.append(", addButtonType=");
        sb.append(this.b);
        sb.append(", dtoTitle=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public v80(boolean z, AddButtonType addButtonType, String str) {
        this.a = z;
        this.b = addButtonType;
        this.c = str;
    }

    public v80() {
        this(false, (String) null, 7);
    }
}
