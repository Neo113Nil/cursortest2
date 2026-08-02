package defpackage;

/* loaded from: classes4.dex */
public final class eav extends fav {
    public final q6v b;
    public final String c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eav(q6v q6vVar) {
        super(true);
        String str;
        m6v m6vVar = q6vVar.a;
        boolean z = true;
        this.b = q6vVar;
        o6v o6vVar = q6vVar.b;
        int ordinal = o6vVar.ordinal();
        if (ordinal == 0) {
            str = m6vVar.b;
        } else if (ordinal == 1) {
            str = m6vVar.b;
        } else {
            if (ordinal != 2) {
                b6e.s();
                throw null;
            }
            str = "";
        }
        this.c = str;
        int ordinal2 = o6vVar.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1) {
            if (ordinal2 != 2) {
                b6e.s();
                throw null;
            }
            z = false;
        }
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eav) && this.b.equals(((eav) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Success(words=" + this.b + ")";
    }
}
