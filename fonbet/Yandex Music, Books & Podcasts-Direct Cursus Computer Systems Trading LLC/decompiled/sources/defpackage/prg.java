package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class prg extends qrg {
    public final ArrayList a;

    public prg(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof prg) && this.a.equals(((prg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.o(new StringBuilder("Valid(servers="), this.a, ')');
    }
}
