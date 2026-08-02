package defpackage;

import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class w8t {

    @NotNull
    public static final r8t Companion = new r8t();
    public static final arf[] d;
    public final double a;
    public final t8t b;
    public final v8t c;

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{null, btf.a(bwfVar, new x6s(22)), btf.a(bwfVar, new x6s(23))};
    }

    public /* synthetic */ w8t(int i, double d2, t8t t8tVar, v8t v8tVar) {
        if (1 != (i & 1)) {
            u7g.V(i, 1, q8t.a.getDescriptor());
            throw null;
        }
        this.a = d2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = t8tVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = v8tVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8t)) {
            return false;
        }
        w8t w8tVar = (w8t) obj;
        return Double.compare(this.a, w8tVar.a) == 0 && this.b == w8tVar.b && this.c == w8tVar.c;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.a) * 31;
        t8t t8tVar = this.b;
        int hashCode2 = (hashCode + (t8tVar == null ? 0 : t8tVar.hashCode())) * 31;
        v8t v8tVar = this.c;
        return hashCode2 + (v8tVar != null ? v8tVar.hashCode() : 0);
    }

    public final String toString() {
        return "Option(duration=" + this.a + ", interpolator=" + this.b + ", transition=" + this.c + ")";
    }
}
