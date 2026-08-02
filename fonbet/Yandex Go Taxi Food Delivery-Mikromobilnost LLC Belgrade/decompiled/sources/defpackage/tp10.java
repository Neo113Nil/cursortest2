package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tp10 implements wp10 {
    public final rw51 a;
    public final List b;
    public final List c;

    public tp10(rw51 rw51Var, ArrayList arrayList, ListBuilder listBuilder) {
        this.a = rw51Var;
        this.b = arrayList;
        this.c = listBuilder;
    }

    public final rw51 a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final List c() {
        return this.b;
    }

    public final List d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp10)) {
            return false;
        }
        tp10 tp10Var = (tp10) obj;
        return jl40.l(this.a, tp10Var.a) && jl40.l(this.b, tp10Var.b) && jl40.l(this.c, tp10Var.c);
    }

    public final int hashCode() {
        rw51 rw51Var = this.a;
        int hashCode = (rw51Var == null ? 0 : rw51Var.hashCode()) * 31;
        List list = this.b;
        return this.c.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(storiesProgressState=");
        sb.append(this.a);
        sb.append(", banners=");
        sb.append(this.b);
        sb.append(", screenItems=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
