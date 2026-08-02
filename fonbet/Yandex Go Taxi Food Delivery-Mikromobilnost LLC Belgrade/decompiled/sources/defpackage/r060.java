package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class r060 implements h260 {
    public static final q060 Companion = new q060();
    public static final i3y[] g = {null, null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(15)), null};
    public final yr50 a;
    public final pq50 b;
    public final String c;
    public final String d;
    public final List e;
    public final co50 f;

    public /* synthetic */ r060(int i, yr50 yr50Var, pq50 pq50Var, String str, String str2, List list, co50 co50Var) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, p060.a.getDescriptor());
            throw null;
        }
        this.a = yr50Var;
        this.b = pq50Var;
        this.c = str;
        this.d = str2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = co50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r060)) {
            return false;
        }
        r060 r060Var = (r060) obj;
        return jl40.l(this.a, r060Var.a) && jl40.l(this.b, r060Var.b) && jl40.l(this.c, r060Var.c) && jl40.l(this.d, r060Var.d) && jl40.l(this.e, r060Var.e) && jl40.l(this.f, r060Var.f);
    }

    @Override // defpackage.h260
    public final String getId() {
        return this.c;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        List list = this.e;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        co50 co50Var = this.f;
        return hashCode + (co50Var != null ? co50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSpacerWidgetModel(displayRules=" + this.a + ", contentDescription=" + this.b + ", id=" + this.c + ", type=" + this.d + ", templates=" + this.e + ", action=" + this.f + ')';
    }
}
