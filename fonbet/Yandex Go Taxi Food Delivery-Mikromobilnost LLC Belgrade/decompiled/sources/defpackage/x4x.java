package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class x4x {
    public final ArrayList a;
    public final ArrayList b;

    public x4x(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4x)) {
            return false;
        }
        x4x x4xVar = (x4x) obj;
        return this.a.equals(x4xVar.a) && this.b.equals(x4xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JasonCode(instructions=");
        sb.append(this.a);
        sb.append(", constants=");
        return smw0.m(sb, this.b, ')');
    }
}
