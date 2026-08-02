package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class r160 implements h260 {
    public static final q160 Companion = new q160();
    public static final i3y[] i;
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final co50 g;
    public final Integer h;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new i3y[]{null, null, null, null, a.b(lazyThreadSafetyMode, new ew50(19)), a.b(lazyThreadSafetyMode, new ew50(20)), null, null};
    }

    public /* synthetic */ r160(int i2, yr50 yr50Var, pq50 pq50Var, String str, String str2, List list, List list2, co50 co50Var, Integer num) {
        if (31 != (i2 & 31)) {
            qje.Z(i2, 31, p160.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list2;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = co50Var;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r160)) {
            return false;
        }
        r160 r160Var = (r160) obj;
        return jl40.l(this.a, r160Var.a) && jl40.l(this.b, r160Var.b) && jl40.l(this.c, r160Var.c) && jl40.l(this.d, r160Var.d) && jl40.l(this.e, r160Var.e) && jl40.l(this.f, r160Var.f) && jl40.l(this.g, r160Var.g) && jl40.l(this.h, r160Var.h);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        List list = this.f;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.g;
        int hashCode2 = (hashCode + (co50Var == null ? 0 : co50Var.hashCode())) * 31;
        Integer num = this.h;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkTextWidgetModel(displayRules=");
        sb.append(this.a);
        sb.append(", contentDescription=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", textItems=");
        sb.append(this.e);
        sb.append(", templates=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", lineHeight=");
        return vfc.o(sb, this.h, ')');
    }
}
